package qaclickacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class bjp
{

	public static void main(String[] args) throws IOException 
	{
		
		      FileInputStream fil=new FileInputStream("Downloads.xlms");
              XSSFWorkbook b=new XSSFWorkbook(fil);
                  
              int sheets=b.getNumberOfSheets();
              for(int i=0;i<sheets;i++)
                 {
    	                if (b.getSheetName(i).equalsIgnoreCase("Sheet1"));
                   {
                       	XSSFSheet	sheet=b.getSheetAt(i);
                        Iterator<Row>	rows=sheet.iterator();
                        Row firstrow= rows.next();
                        Iterator<Cell>   ce=firstrow.cellIterator();
                        int k=0;
                        int colum=0;
              while(ce.hasNext())
                     {
        	              Cell value=ce.next();
        	              if(value.getStringCellValue().equalsIgnoreCase("bhavin"))
        	                   {
        		                 colum = k;
                              }
                        	  k++;
                      }
                               System.out.println(colum);
    
                   	}
                }
    }
}


