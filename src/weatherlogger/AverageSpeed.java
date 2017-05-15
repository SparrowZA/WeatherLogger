/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherlogger;

import java.text.DecimalFormat;

/**
 *
 * @author Marc
 */
public class AverageSpeed {
    double averageTemperature, totalTemperature = 0;
    String [] data;
    DecimalFormat format = new DecimalFormat("#.##");  //Decimal format for the average double
    
    public String setAverageSpeed ( String [][] tableData, Integer lineCount) {
        for(int i=0; i<lineCount ;i++) {
            tableData[i][2] = tableData[i][2].replaceAll("Kph", "");
            totalTemperature = totalTemperature + 
                    Double.parseDouble(tableData[i][2]);
            averageTemperature = totalTemperature / lineCount;

        }
        return format.format(averageTemperature);
    }    
}
