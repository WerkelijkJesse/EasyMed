/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichallenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Bram
 */
public class ChecktijdClass {
    
    
    public void Thread2 (){
        Thread d = new Thread (){
            public void run (){
                while (true) {                     
                    try{
                        CheckTijdSeconde();
                        Thread.sleep(1000);  
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }  
            }
        };
        d.start();
        
    }
    
    public class FunctionMaandag{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            ps = con.prepareStatement("select Tijd from afgifte where Tijd = ? AND Datum = 'Maandag'");
            ps.setString(1,s);
            rs = ps.executeQuery();

            }
           catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs; 
        }
    }
    
    public class FunctionDinsdag{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            ps = con.prepareStatement("select Tijd from afgifte where Tijd = ? AND Datum = 'Dinsdag'");
            ps.setString(1,s);
            rs = ps.executeQuery();

            }
           catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs; 
        }
    }
    
    public class FunctionWoensdag{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            ps = con.prepareStatement("select Tijd from afgifte where Tijd = ? AND Datum = 'Woensdag'");
            ps.setString(1,s);
            rs = ps.executeQuery();

            }
           catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs; 
        }
    }
    
    public class FunctionDonderdag{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            ps = con.prepareStatement("select Tijd from afgifte where Tijd = ? AND Datum = 'Donderdag'");
            ps.setString(1,s);
            rs = ps.executeQuery();

            }
           catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs; 
        }
    }
    
    public class FunctionVrijdag{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            ps = con.prepareStatement("select Tijd from afgifte where Tijd = ? AND Datum = 'Vrijdag'");
            ps.setString(1,s);
            rs = ps.executeQuery();

            }
           catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs; 
        }
    }
    
    public class FunctionZaterdag{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            ps = con.prepareStatement("select Tijd from afgifte where Tijd = ? AND Datum = 'Zaterdag'");
            ps.setString(1,s);
            rs = ps.executeQuery();

            }
           catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs; 
        }
    }
    
    public class FunctionZondag{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
           Connection con = null;
            ResultSet rs = null;
            PreparedStatement ps = null;
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            ps = con.prepareStatement("select Tijd from afgifte where Tijd = ? AND Datum = 'Zondag'");
            ps.setString(1,s);
            rs = ps.executeQuery();
            

            }
           catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs; 
        }
    }
    
    public void CheckTijdSeconde(){
        DateFormat date = new SimpleDateFormat ("ss");
        String HuidigeSeconde = date.format(new Date()).toString();
        
        if (HuidigeSeconde.equals("00")){
            Checktijd();
        }
    }
    
    public void Checktijd (){
        DateFormat date = new SimpleDateFormat ("HH:mm" + ":00");
        DateFormat dat = new SimpleDateFormat ("HH:mm" + ":01");
        String Huidigetijdd = date.format(new Date()).toString();
        Date dag = new Date();
        DateFormat df = new SimpleDateFormat("EEEE");
        VerstuurArduinoMicrobit verstuur = new VerstuurArduinoMicrobit();
        if (df.format(dag).equals("maandag")){
            FunctionMaandag f = new FunctionMaandag();
            ResultSet rs = null;
            rs = f.find(Huidigetijdd);
            try{
                if(rs.next()){
                    verstuur.VerstuurArduinoMicrobit();  
                }  
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        if (df.format(dag).equals("dinsdag")){
            FunctionDinsdag f = new FunctionDinsdag();
            ResultSet rs = null;
            rs = f.find(Huidigetijdd);
            try{
                if(rs.next()){
                    verstuur.VerstuurArduinoMicrobit();  
                }  
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        if (df.format(dag).equals("woensdag")){
            FunctionWoensdag f = new FunctionWoensdag();
            ResultSet rs = null;
            rs = f.find(Huidigetijdd);
            try{
                if(rs.next()){
                    verstuur.VerstuurArduinoMicrobit();  
                }  
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        if (df.format(dag).equals("donderdag")){
            FunctionDonderdag f = new FunctionDonderdag();
            ResultSet rs = null;
            rs = f.find(Huidigetijdd);
            try{
                if(rs.next()){
                    verstuur.VerstuurArduinoMicrobit();  
                }  
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        if (df.format(dag).equals("vrijdag")){
            FunctionVrijdag f = new FunctionVrijdag();
            ResultSet rs = null;
            rs = f.find(Huidigetijdd);
            try{
                if(rs.next()){
                    verstuur.VerstuurArduinoMicrobit();  
                }  
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        if (df.format(dag).equals("zaterdag")){
            FunctionZaterdag f = new FunctionZaterdag();
            ResultSet rs = null;
            rs = f.find(Huidigetijdd);
            try{
                if(rs.next()){
                    verstuur.VerstuurArduinoMicrobit();  
                }  
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        if (df.format(dag).equals("zondag")){
            FunctionZondag f = new FunctionZondag();
            ResultSet rs = null;
            //String fn = "Tijd";
            rs = f.find(Huidigetijdd);
            try{
                if(rs.next()){
                    verstuur.VerstuurArduinoMicrobit();  
                }  
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
    
}
