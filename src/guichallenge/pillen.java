/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichallenge;

/**
 *
 * @author Jesse
 */
public class pillen {
    private String tijd;
    private int aantal;
    private String datum;
    private String soort;
    
    public pillen(String Tijd, int Aantal, String Datum, String Soort){
        this.tijd = Tijd;
        this.aantal = Aantal;
        this.datum = Datum;
        this.soort = Soort;
    }
    
    public String getTijd(){
        return tijd;
    }
    
    public int getAantal(){
        return aantal;
    }
    
    public String getDatum(){
        return datum;
    }
    
    public String getSoort(){
        return soort;
    }
    
}
