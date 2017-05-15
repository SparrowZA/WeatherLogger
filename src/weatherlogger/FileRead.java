/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherlogger;

/**
 *
 * @author Marc
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileRead {
    private String path, searchDate;
    private String [][] matrix;
    private String [] lineCheck = new String[4];
    private String line = "";
    int i,totalLines,lineNumberEnd, readLines;
    
    public void setReadFrom( String time){
        searchDate = time;
        totalLines=1;
        readLines=0;
        i=0;
        path = "WeatherLog.txt";

        try{
            FileReader reader = new FileReader( path );
            FileReader reader2 = new FileReader( path );
            BufferedReader count = new BufferedReader(reader);
            BufferedReader in = new BufferedReader(reader2);
            line = count.readLine();
            
            while (line != null){   
                lineCheck = line.split("\\s");              //Split each line into Date|Time|Temp|Speed
                if(line != null && lineCheck[0].equals(searchDate)){    //check end of file and if the date equals the searched date
                    lineNumberEnd = totalLines;  // Last line with valid data
                    readLines++;  //Amount of lines with valid data
                }
                line = count.readLine(); //Read the next line
                totalLines++;  //Plus 1 to total amount of lines read
            }            
            
            matrix = new String[readLines][];  //set the size of the array
            if(lineNumberEnd-readLines!=0){
                for(int a=0; a<lineNumberEnd-readLines;a++){
                    line = in.readLine();
                }
            }
            line = in.readLine();
            
            while (  i != readLines && line != null)
            {
                lineCheck = line.split("\\s");              
                if(line != null && lineCheck[0].equals(searchDate)){
                    matrix[i] = lineCheck;
                }
                line = in.readLine();
                totalLines++;
            	i++;
            }
            in.close();
            count.close();
	}
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public String [][] getMatrix(){
    	return matrix;
    }
    
    public int getFileLines()
    {
        return i;
    }
}
