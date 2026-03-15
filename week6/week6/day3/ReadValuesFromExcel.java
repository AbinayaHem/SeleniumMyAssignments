package week6.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValuesFromExcel {

	public static String[][] getValue(String fileName) throws IOException {
		// TODO Auto-generated method stub

				// Step1: Setting up the excel file / workBook
				XSSFWorkbook wb = new XSSFWorkbook("./ReadExcel/"+fileName+".xlsx");

				// Step2: to get the sheet from the wb
				XSSFSheet sheet = wb.getSheetAt(0);

				// Step3: to get the row value
				XSSFRow row = sheet.getRow(0);

				// System.out.println(row);

				// getLastRowNum(); - excludes the Header
				int lastRowNum = sheet.getLastRowNum();
				System.out.println(lastRowNum);

				// getPhysicalNumberOfRows(); - includes the header
				int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
				System.out.println(physicalNumberOfRows);

				// get the cell/column value
				XSSFCell getCell = sheet.getRow(1).getCell(0);
				System.out.println(getCell);

				// to get the cell value along with the header
				int physicalNumberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
				System.out.println(physicalNumberOfCells);

				// getLastCellNum();
				short lastCellNum = sheet.getRow(2).getLastCellNum();
				System.out.println(lastCellNum);
				
				//common integration
				//to store the rows & columns
				String[][] data = new String[lastRowNum][lastCellNum];

				// store the cell values
				//XSSFCell cell = row.getCell(1);
				
				//to read the entire call value
				//String stringCellValue = cell.getStringCellValue();
				//System.out.println("StringCell value: " +stringCellValue);

				// OuterLoop is for rows
				for (int i = 1; i <= lastRowNum; i++) {

					// InnerLoop is for cell/Column
					for (int j = 0; j < lastCellNum; j++) {
						String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println(data[i-1][j] = stringCellValue2);
						
						//common integration
						//step 5 - to store the values
						//data[i-1][j] = stringCellValue2;
					}

				}wb.close();
				//common integration
				//step 2: to return the data/String[][] stored column & row values
				return data;

			}

		

	}

