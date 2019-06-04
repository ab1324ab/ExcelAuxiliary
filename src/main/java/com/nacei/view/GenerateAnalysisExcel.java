package com.nacei.view;

import com.github.crab2died.ExcelUtils;
import com.github.crab2died.exceptions.Excel4JException;
import com.github.crab2died.sheet.wrapper.NoTemplateSheetWrapper;
import com.nacei.ExcelReadService;
import com.nacei.business.RetailReturnRateAnalysisTableBusiness;
import com.nacei.model.*;
import com.nacei.view.clien.WindowUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GenerateAnalysisExcel {

    private static int currentProgress = 0;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton button;
    private JProgressBar progressBar1;
    private JPanel mainPanel;

    public void init(){
        final JFrame jFrame = new JFrame();
        jFrame.setTitle("分析工具");
        jFrame.setSize(new Dimension(400,300));
        //jFrame.setMaximumSize(new Dimension(400,300));
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WindowUtil.windowCentered(jFrame);
        String str = "";
        for(String s : ExcelReadService.getPropertiesStrArr()){
            str += s+",";
        }
        textArea1.setText(str.substring(0,str.length()-1));
        textArea1.setLineWrap(true);
        textField1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textField1.setText(ExcelReadService.getRate());
        // 设置进度的 最小值 和 最大值
        progressBar1.setMinimum(0);
        progressBar1.setMaximum(100);
        // 设置当前进度值
        progressBar1.setValue(currentProgress);
        // 绘制百分比文本（进度条中间显示的百分数）
        progressBar1.setStringPainted(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        currentProgress = 0;
                        ExcelReadService.setPropertiesStrArr(textArea1.getText());
                        currentProgress+=4;
                        progressBar1.setValue(currentProgress);
                        ExcelReadService.setRate(textField1.getText());
                        currentProgress+=4;
                        progressBar1.setValue(currentProgress);
                        RetailReturnRateAnalysisTableBusiness reta = new RetailReturnRateAnalysisTableBusiness();
                        java.util.List<NoTemplateSheetWrapper> sheets = new ArrayList<NoTemplateSheetWrapper>();
                        try {
                            // 退货分析
                            java.util.List<RetailReturnRateAnalysisModel> rateAnalyses = reta.getRetailReturnRateAnalysis();
                            sheets.add(new NoTemplateSheetWrapper(rateAnalyses, RetailReturnRateAnalysisModel.class, true, "退货分析" ));
                            currentProgress+=10.3;
                            progressBar1.setValue(currentProgress);
                            // 退货详单1
                            java.util.List<OutReturndetails1Model> list = reta.getReturndetails1();
                            sheets.add(new NoTemplateSheetWrapper(list, OutReturndetails1Model.class, true, "退货详单1" ));
                            currentProgress+=10.3;
                            progressBar1.setValue(currentProgress);
                            // 退货详单2
                            java.util.List<OutReturndetails2Model> outReturndetails2ModelList = reta.getReturndetails2();
                            sheets.add(new NoTemplateSheetWrapper(outReturndetails2ModelList, OutReturndetails2Model.class, true, "退货详单2" ));
                            currentProgress+=14.3;
                            progressBar1.setValue(currentProgress);
                            // 退货详单3
                            java.util.List<OutReturndetails2Model> outReturndetails3ModelList = reta.getReturndetails3();
                            sheets.add(new NoTemplateSheetWrapper(outReturndetails3ModelList, OutReturndetails2Model.class, true, "退货详单3" ));
                            currentProgress+=14.3;
                            progressBar1.setValue(currentProgress);
                            // 销售数据1
                            java.util.List<SalesData1Model> salesData1 = reta.getSalesData1();
                            sheets.add(new NoTemplateSheetWrapper(salesData1, SalesData1Model.class, true, "销售数据1" ));
                            currentProgress+=14.3;
                            progressBar1.setValue(currentProgress);
                            // 销售数据2
                            java.util.List<SalesData2Model> salesData2 = reta.getSalesData2();
                            sheets.add(new NoTemplateSheetWrapper(salesData2, SalesData2Model.class, true, "销售数据2" ));
                            currentProgress+=14.3;
                            progressBar1.setValue(currentProgress);
                        }catch (Exception e){
                            String title = "请检查当前目录下\"当前客诉.xls\",\"零售退销率分析.xlsx\",\"产品列表.xls\",\"新品销售量统计.xlsx\"是否存在。";
                            JOptionPane.showMessageDialog(jFrame, title, "提示", JOptionPane.ERROR_MESSAGE);
                            button.setEnabled(true);
                            return;
                        }
                        String fileName = "";
                        try {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
                            fileName = "零售退销率分析表"+dateFormat.format(new Date())+".xls";
                            ExcelUtils.getInstance().noTemplateSheet2Excel(sheets, fileName);
                            currentProgress+=16;
                            progressBar1.setValue(currentProgress);
                        } catch (Excel4JException e1) {
                            e1.printStackTrace();
                        } catch (IOException e1) {
                            JOptionPane.showMessageDialog(jFrame, "请关闭打开的\""+fileName+"\"", "提示", JOptionPane.ERROR_MESSAGE);
                            //e1.printStackTrace();
                            //return;
                        }
                        if(currentProgress >= 100){
                            JOptionPane.showMessageDialog(jFrame, "文件创建成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                        }
                        button.setEnabled(true);
                    }
                }).start();
            }
        });
        jFrame.add(mainPanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        GenerateAnalysisExcel main = new GenerateAnalysisExcel();
        main.init();
    }
}
