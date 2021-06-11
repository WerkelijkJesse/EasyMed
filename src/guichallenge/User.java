/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichallenge;

/**
 *
 * @author user
 */
class User {
    
    private int Aantal, Id;
    private String Soort, Tijd;
    
    public User (int Aantal, int Id, String Soort, String Tijd){
        this.Aantal = Aantal;
        this.Id = Id;
        this.Soort = Soort;
        this.Tijd = Tijd;
    }
    public int getAantal (){
        return Aantal;
    }
    public int getId (){
        return Id;
    }
    public String getSoort (){
        return Soort;
    }
    public String getTijd (){
        return Tijd;
    }
}


