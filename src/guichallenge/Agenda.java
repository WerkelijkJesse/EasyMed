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
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form challenge
     */
    Connection con = null;
    PreparedStatement pst = null;
    public Agenda() {
        initComponents();
        Thread1();
        ChecktijdClass naam = new ChecktijdClass();
        naam.Thread2();
        ZetHuidigeDag ();
        

    }
    
    public void ZetHuidigeDag (){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("EEEE");
        HuidigeDag.setText(df.format(date));
    }
    
    private void Thread1(){    
        Thread t = new Thread (){
            public void run (){
                while (true) {
                    DateFormat date = new SimpleDateFormat ("HH:mm:ss");
                    String datestring = date.format(new Date()).toString();
                    HuidigeDatumTijd1.setText(datestring);                       
                    try{
                        Thread.sleep(900); 
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }  
            }
        };
        t.start();
    }
    
    
    
    public ArrayList <User> userList () {
        ArrayList <User> usersList = new ArrayList <>();
        String dag = Dagnaam.getText();
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs;
            //rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd FROM afgifte");
            //User user;
            
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("EEEE");
            
            if (dag.equals("maandag")){
                rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd, Id FROM afgifte where Datum = 'Maandag' order by Tijd asc");
                User user;
                while (rs.next()){
                    user = new User(rs.getInt("Aantal"), rs.getInt("Id"), rs.getString("Soort"), rs.getString("Tijd"));
                    usersList.add(user);
                }
            }
            
            if (dag.equals("dinsdag")){
                rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd, Id FROM afgifte where Datum = 'Dinsdag' order by Tijd asc");
                User user;
                while (rs.next()){
                    user = new User(rs.getInt("Aantal"), rs.getInt("Id"), rs.getString("Soort"), rs.getString("Tijd"));
                    usersList.add(user);
                }
            }
            
            if (dag.equals("woensdag")){
                rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd, Id FROM afgifte where Datum = 'Woensdag' order by Tijd asc");
                User user;
                while (rs.next()){
                    user = new User(rs.getInt("Aantal"), rs.getInt("Id"), rs.getString("Soort"), rs.getString("Tijd"));
                    usersList.add(user);
                }
            }
            
            if (dag.equals("donderdag")){
                rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd, Id FROM afgifte where Datum = 'Donderdag' order by Tijd asc");
                User user;
                while (rs.next()){
                    user = new User(rs.getInt("Aantal"), rs.getInt("Id"), rs.getString("Soort"), rs.getString("Tijd"));
                    usersList.add(user);
                }
            }
            
            if (dag.equals("vrijdag")){
                rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd, Id FROM afgifte where Datum = 'Vrijdag' order by Tijd asc");
                User user;
                while (rs.next()){
                    user = new User(rs.getInt("Aantal"), rs.getInt("Id"), rs.getString("Soort"), rs.getString("Tijd"));
                    usersList.add(user);
                }
            }
            
            if (dag.equals("zaterdag")){
                rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd, Id FROM afgifte where Datum = 'Zaterdag' order by Tijd asc");
                User user;
                while (rs.next()){
                    user = new User(rs.getInt("Aantal"), rs.getInt("Id"), rs.getString("Soort"), rs.getString("Tijd"));
                    usersList.add(user);
                }
            }
            
            if (dag.equals("zondag")){
                rs = stmt.executeQuery("SELECT Soort, Aantal, Tijd, Id FROM afgifte where Datum = 'zondag' order by Tijd asc");
                User user;
                while (rs.next()){
                    user = new User(rs.getInt("Aantal"), rs.getInt("Id"), rs.getString("Soort"), rs.getString("Tijd"));
                    usersList.add(user);
                }
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return usersList;
    }
    
    public void show_user(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel)HuidigeDagPillen.getModel();
        Object [] row = new Object [4];
        for (int i = 0; i<list.size(); i++){
            row[0] = list.get(i).getSoort();
            row[1] = list.get(i).getAantal();
            row[2] = list.get(i).getTijd();  
            row[3] = list.get(i).getId();
            model.addRow(row);
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        KnopProfiel = new javax.swing.JButton();
        NaamAgenda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        KnopHome = new javax.swing.JButton();
        KnopAgenda = new javax.swing.JButton();
        KnopMedicatie = new javax.swing.JButton();
        KnopFAQ = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        Checkdatum = new javax.swing.JButton();
        Datumtekst = new javax.swing.JLabel();
        Dagnaam = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HuidigeDagPillen = new javax.swing.JTable();
        HuidigeDag = new javax.swing.JLabel();
        HuidigeDatumTijd1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 153, 11));

        jPanel1.setBackground(new java.awt.Color(229, 153, 11));

        KnopProfiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/Profiel.png"))); // NOI18N
        KnopProfiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnopProfielActionPerformed(evt);
            }
        });

        NaamAgenda.setBackground(new java.awt.Color(229, 153, 11));
        NaamAgenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NaamAgenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NaamAgenda.setText("Agenda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(NaamAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(KnopProfiel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KnopProfiel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NaamAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(229, 153, 11));

        KnopHome.setBackground(new java.awt.Color(229, 153, 11));
        KnopHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/Home.png"))); // NOI18N
        KnopHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnopHomeActionPerformed(evt);
            }
        });

        KnopAgenda.setBackground(new java.awt.Color(229, 153, 11));
        KnopAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/Agenda.png"))); // NOI18N
        KnopAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnopAgendaActionPerformed(evt);
            }
        });

        KnopMedicatie.setBackground(new java.awt.Color(229, 153, 11));
        KnopMedicatie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/Pilleninvoeren.png"))); // NOI18N
        KnopMedicatie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnopMedicatieActionPerformed(evt);
            }
        });

        KnopFAQ.setBackground(new java.awt.Color(229, 153, 11));
        KnopFAQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/FAQ.png"))); // NOI18N
        KnopFAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnopFAQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(KnopAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KnopHome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KnopFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KnopMedicatie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KnopHome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(KnopAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(KnopMedicatie, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KnopFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        Checkdatum.setText("Check datum pillen innemen");
        Checkdatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckdatumActionPerformed(evt);
            }
        });

        Datumtekst.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Datumtekst.setText(" ");

        Dagnaam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Dagnaam.setText(" ");

        HuidigeDagPillen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Naam Medicijn", "Hoeveelheid", "Tijd", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HuidigeDagPillen.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(HuidigeDagPillen);

        HuidigeDag.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        HuidigeDag.setText(" ");

        HuidigeDatumTijd1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        HuidigeDatumTijd1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HuidigeDatumTijd1.setText(" ");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(HuidigeDag, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(HuidigeDatumTijd1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(Checkdatum)
                                .addGap(92, 92, 92)
                                .addComponent(jButton1))
                            .addComponent(jCalendar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Datumtekst, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Dagnaam, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Datumtekst)
                            .addComponent(Dagnaam))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HuidigeDag, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HuidigeDatumTijd1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Checkdatum)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KnopMedicatieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnopMedicatieActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Medicatie().setVisible(true);
    }//GEN-LAST:event_KnopMedicatieActionPerformed

    private void KnopHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnopHomeActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_KnopHomeActionPerformed

    private void KnopFAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnopFAQActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FAQ().setVisible(true);
    }//GEN-LAST:event_KnopFAQActionPerformed

    private void KnopProfielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnopProfielActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Profiel().setVisible(true);
    }//GEN-LAST:event_KnopProfielActionPerformed

    private void KnopAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnopAgendaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Agenda().setVisible(true);
    }//GEN-LAST:event_KnopAgendaActionPerformed

    private void CheckdatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckdatumActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel)HuidigeDagPillen.getModel();
        while(dm.getRowCount() > 0){
            dm.removeRow(0);
        }
        SimpleDateFormat f = new SimpleDateFormat ("dd-MM-yyyy");
        SimpleDateFormat g = new SimpleDateFormat("EEEE");
        Date d1 = null;
        try {
            d1 = f.parse(f.format(jCalendar1.getDate()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Dagnaam.setText(g.format(d1));
        Datumtekst.setText (f.format(d1));
        userList ();
        show_user();

    }//GEN-LAST:event_CheckdatumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = HuidigeDagPillen.getSelectedRow();
        String cell = HuidigeDagPillen.getModel().getValueAt(row, 3).toString();
        String sql = "DELETE FROM afgifte where Id = " + cell;
        try {
            pst = con.prepareStatement (sql);
            pst.execute();
            JOptionPane.showMessageDialog (null, "Deleted Succesfully");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            try{
                pst.close();
            }
            catch (Exception e){
            }
        }
        DefaultTableModel dm = (DefaultTableModel)HuidigeDagPillen.getModel();
        while(dm.getRowCount() > 0){
            dm.removeRow(0);
        }
        userList ();
        show_user();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Checkdatum;
    private javax.swing.JLabel Dagnaam;
    private javax.swing.JLabel Datumtekst;
    private javax.swing.JLabel HuidigeDag;
    private javax.swing.JTable HuidigeDagPillen;
    private javax.swing.JLabel HuidigeDatumTijd1;
    private javax.swing.JButton KnopAgenda;
    private javax.swing.JButton KnopFAQ;
    private javax.swing.JButton KnopHome;
    private javax.swing.JButton KnopMedicatie;
    private javax.swing.JButton KnopProfiel;
    private javax.swing.JLabel NaamAgenda;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
