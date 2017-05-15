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
public class TempConverter {
    private double tempCel, tempFahr;
    
    public void setCel(double i)
    {
        tempCel = i;
    }
    
    public Double getCel()
    {
        return tempCel;
    }
    
    public void setFahr(double j)
    {
        tempFahr = 32+(j*1.8);
    }
    
    public Double getFahr()
    {
        return tempFahr;
    }
}
