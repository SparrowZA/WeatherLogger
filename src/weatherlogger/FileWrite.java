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
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWrite {
    
    public void WriteToFile(String windSpeed, String temperature )
    {
    	try
		{
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Calendar date;
                    date = Calendar.getInstance();
                    BufferedWriter writer = new BufferedWriter( new FileWriter ("WeatherLog.txt", true) );
                    writer.write( df.format(date.getTime()) + "\t" + windSpeed + "Kph\t" + temperature + "'C" ); //write textfield content to specified file
                    writer.newLine();					//creates a new line in the file
                    writer.close();
		}
		catch(IOException f)
		{
                    f.printStackTrace();
		}
    }
}
