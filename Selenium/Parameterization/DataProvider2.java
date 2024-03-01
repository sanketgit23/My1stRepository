package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider2 
{

	public static void main(String[] args)
	{
	
		try {
            // Specify the path to the Excel file
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\dell\\Desktop\\All SYLLABOUS.xlsx"));

            // Create a workbook object
            Workbook workbook = WorkbookFactory.create(fis);

            // Get the first sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through each row in the sheet
            for (Row row : sheet) 
            {
                // Iterate through each cell in the row
                for (Cell cell : row) 
                {
                	if (cell.getCellType() == CellType.NUMERIC) {
                        // If cell type is numeric, retrieve numeric value
                        double numericValue = cell.getNumericCellValue();
                        // Convert numeric value to string if needed
                        System.out.print(Double.toString(numericValue) + "\t");
                    } else {
                        // If cell type is not numeric, retrieve string value
                        System.out.print(cell.getStringCellValue() + "\t");
                    }
                	
                }
                System.out.println(); // Move to the next line after printing each row
            }

            // Close the workbook and input stream
            workbook.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	}