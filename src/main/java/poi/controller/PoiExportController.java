package poi.controller;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.*;


public class PoiExportController {
    public static void main(String[] args) throws IOException {
        //1.创建一个工作簿
        Workbook wb=new HSSFWorkbook();
        //2.创建一个工作表sheet
        Sheet  sheet=wb.createSheet();
        //3.创建一个行对象
        Row nRow=sheet.createRow(4); //从0开始
        //4、创建一个单元格对象，指定列
        Cell nCell=nRow.createCell(4);
        //5、设置内容
        nCell.setCellValue("指令汇科技");
        //6.保存
        OutputStream stream=new FileOutputStream(new File("D:\\poiTest.xls"));
        wb.write(stream);
        //7.关闭
        stream.close();
    }

}
