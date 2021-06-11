/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichallenge;

/**
 *
 * @author Bram
 */
class User2 {
    private int Aantal;
    private String Soort, Tijd;
    
    public User2 (int Aantal, String Soort, String Tijd){
        this.Aantal = Aantal;
        this.Soort = Soort;
        this.Tijd = Tijd;
    }
    public int getAantal (){
        return Aantal;
    }
    public String getSoort (){
        return Soort;
    }
    public String getTijd (){
        return Tijd;
    }
}
    

