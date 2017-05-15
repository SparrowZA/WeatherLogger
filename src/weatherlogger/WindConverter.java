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
public class WindConverter {
    private double windKPH;
    private double windMPH;
    
    public void setKPH( double i ){
        windKPH = i;
    }
    
    public double getKPH(){
        return windKPH;
    }
    
    public void setMPH( double i ){
        windMPH = i * 0.62137;
    }
    
    public double getMPH(){
        return windMPH;
    }
}
