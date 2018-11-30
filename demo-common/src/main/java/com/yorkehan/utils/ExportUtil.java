package com.yorkehan.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

public class ExportUtil {

    /**
     * 导出Excel
     * @param sheetName sheet名称
     * @param title 标题
     * @param values 内容
     * @param wb HSSFWorkbook对象
     * @return
     */
    public static HSSFWorkbook getHSSFWorkbook(String sheetName, String []title, String [][]values, HSSFWorkbook wb){

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        if(wb == null){
            wb = new HSSFWorkbook();
        }

        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet(sheetName);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER); // 创建一个居中格式

        //声明列对象
        HSSFCell cell = null;
        //----------------标题样式---------------------
        HSSFCellStyle titleStyle = wb.createCellStyle();        //标题样式
        titleStyle.setAlignment(HorizontalAlignment.CENTER);
        titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        Font ztFont = wb.createFont();
        ztFont.setItalic(false);                     // 设置字体为斜体字
        ztFont.setColor(Font.COLOR_NORMAL);            // 将字体设置为“红色”
        ztFont.setFontHeightInPoints((short)16);    // 将字体大小设置为18px
        ztFont.setFontName("宋体");             // 将“宋体”字体应用到当前单元格上
        ztFont.setBold(true);    //加粗
        //ztFont.setUnderline(Font.U_DOUBLE);         // 添加（Font.U_SINGLE单条下划线/Font.U_DOUBLE双条下划线）
        //ztFont.setStrikeout(true);                  // 是否添加删除线
        titleStyle.setFont(ztFont);
        HSSFRow row =null;
                //创建大标题
        row = sheet.createRow(0);
        // 创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
        cell = row.createCell(0);
        // 合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 4));
        // 设置单元格内容
        cell.setCellValue("66666666666666666666666");
        cell.setCellStyle(titleStyle);
        //创建标题
        row= sheet.createRow(1);
        for(int i=0;i<title.length;i++){
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
        }

        //创建内容
        for(int i=0;i<values.length;i++){
            row = sheet.createRow(i + 2);
            for(int j=0;j<values[i].length;j++){
                //将内容按顺序赋给对应的列对象
                row.createCell(j).setCellValue(values[i][j]);
            }
        }
        return wb;
    }
}

