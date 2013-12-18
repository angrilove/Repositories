package org.anshen.jxl;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCell;
import jxl.write.WritableCellFeatures;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class MainJxl {

	public static void main(String[] args) {
		File file = new File("d:\\excel.xls");
		try {
			WritableWorkbook wwb = Workbook.createWorkbook(file);
			WritableSheet ws = wwb.createSheet("ws", 0);
			
			Label label = new Label(0, 0, "sss");
			ws.addCell(label);
			
			WritableCell c = (WritableCell) ws.getCell(0, 0);
			WritableCell c1 = c.copyTo(1, 1);
			ws.addCell(c1);
			wwb.write();
			wwb.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void getClassName(Object o) {
		System.out.println(o.getClass().getName());
	}
	
	private static void setCellValue(WritableSheet sheet, String value, int columnPosition, 
			int rowPosition, int columnMergeNum, int rowMergeNum) throws WriteException {
		
		WritableFont wfont = new WritableFont(WritableFont.createFont("宋体"), 
				12, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
		WritableCellFormat wcf = new WritableCellFormat(wfont);
		wcf.setBorder(Border.ALL, BorderLineStyle.THIN);

		if (isFloatDouble(value)) {
			wcf.setAlignment(Alignment.RIGHT);
			jxl.write.Number num = new Number(columnPosition, rowPosition, Double.valueOf(value), wcf);
			WritableCellFeatures range = new WritableCellFeatures();
			range.setDataValidationRange("number");
			num.setCellFeatures(range);
			sheet.addCell(num);
			if ((columnMergeNum > -1) && (rowMergeNum > -1)) {
				sheet.mergeCells(columnPosition, rowPosition, columnPosition + columnMergeNum, rowPosition + rowMergeNum);
			}
		} else {
			Label label = new Label(columnPosition, rowPosition, value, wcf);
			sheet.addCell(label);
			if ((columnMergeNum > -1) && (rowMergeNum > -1)) {
				sheet.mergeCells(columnPosition, rowPosition, columnPosition + columnMergeNum, rowPosition + rowMergeNum);
			}
		}
	}
	
	private static boolean isFloatDouble(String val) {
		try {
			Double.valueOf(val);
			return true;
		} catch(Exception e) {
			// e.printStackTrace();
			return false;
		}
	}

	private static void setCellValue(WritableSheet sheet, String value, int i, int j, int type) {
		try {
			WritableFont wf_color = new WritableFont(WritableFont
					.createFont("宋体"), 12, WritableFont.NO_BOLD, false,
					UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			WritableCellFormat wcellf_color = new WritableCellFormat(wf_color);
			// 设置边框线
			wcellf_color.setBorder(Border.ALL, BorderLineStyle.THIN);

			if (isFloatDouble(value)) {
				// 设置数字居右
				wcellf_color.setAlignment(Alignment.RIGHT);
				jxl.write.Number nb = new Number(i, j, Double.valueOf(value),
						wcellf_color);
				sheet.addCell(nb);
			} else {
				Label lable22 = new Label(i, j, value, wcellf_color);
				sheet.addCell(lable22);
				if (type > 1) {
					sheet.mergeCells(i, j, i + type, j);
				}
			}
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
}
