/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherlogger;

/**
 *
 * @author Marc L. Geffroy
 * St.Number: 213297930
 */

public class OptionsObject {
    public int windUnit;
    public int tempUnit;
    public int saveLoc;
    
    public OptionsObject(int windChoice, int tempChoice, int locChoice){
        windUnit = windChoice;
        tempUnit = tempChoice;
        saveLoc = locChoice;
        System.out.println(windUnit + tempUnit + saveLoc);
    }
    
    //SET and GET mutators for wind speed
    public void setWindOption(int windChoice){        
        windUnit = windChoice;;
    } 
    
    public int getWindOption(){        
        return windUnit;
    }   
    
    //SET and GET mutators for temperature
    public void setTempOption(int tempChoice){
        tempUnit = tempChoice;
    } 
    
    public int getTempOption(){
        return tempUnit;
    }
    
    //SET and GET mutators for save location
    public void setLocation(int locChoice){
        saveLoc = locChoice;
    } 
    
    public int getLocation(){
        return saveLoc;
    } 
}