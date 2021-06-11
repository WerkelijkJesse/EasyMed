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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Medicatie extends javax.swing.JFrame {

    /**
     * Creates new form challenge
     */
        Connection con = null;
        PreparedStatement pst = null;
    public Medicatie() {
        initComponents();
        Thread1();
        ChecktijdClass naam = new ChecktijdClass();
        naam.Thread2();
        ZetHuidigeDag ();
       
        
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
    
    private void ZetHuidigeDag (){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("EEEE");
        HuidigeDag.setText(df.format(date));
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
        HomeTekst = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        KnopHome = new javax.swing.JButton();
        KnopAgenda = new javax.swing.JButton();
        KnopMedicatie = new javax.swing.JButton();
        KnopFAQ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        toevoegknopPil = new javax.swing.JButton();
        dagPil = new javax.swing.JTextField();
        naamPil = new javax.swing.JTextField();
        aantalPil = new javax.swing.JTextField();
        totaalPil = new javax.swing.JTextField();
        tijdPil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HuidigeDag = new javax.swing.JLabel();
        HuidigeDatumTijd1 = new javax.swing.JLabel();

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

        HomeTekst.setBackground(new java.awt.Color(229, 153, 11));
        HomeTekst.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HomeTekst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTekst.setText("Medicatie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(HomeTekst, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(KnopProfiel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KnopProfiel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeTekst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(KnopHome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KnopFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KnopMedicatie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KnopAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KnopHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(KnopAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(KnopMedicatie, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(KnopFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jLabel1.setText("Naam");

        toevoegknopPil.setText("Toevoegen");
        toevoegknopPil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toevoegknopPilActionPerformed(evt);
            }
        });

        aantalPil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aantalPilActionPerformed(evt);
            }
        });

        jLabel2.setText("Tijd inname");

        jLabel3.setText("Dag inname");

        jLabel5.setText("Aantal pillen in doosje");

        jLabel6.setText("Aantal pillen per inname");

        HuidigeDag.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        HuidigeDag.setText(" ");

        HuidigeDatumTijd1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        HuidigeDatumTijd1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HuidigeDatumTijd1.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dagPil, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toevoegknopPil)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tijdPil, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(totaalPil)
                                    .addComponent(aantalPil, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(naamPil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HuidigeDag, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HuidigeDatumTijd1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HuidigeDag, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HuidigeDatumTijd1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(naamPil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(aantalPil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(totaalPil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(tijdPil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dagPil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(toevoegknopPil)
                        .addGap(88, 88, 88))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void aantalPilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aantalPilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aantalPilActionPerformed

    private void toevoegknopPilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toevoegknopPilActionPerformed
        // TODO add your handling code here:
        
        try{
            String query = "INSERT INTO `pil`(`bijgevuld`) VALUES (?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, totaalPil.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "succes");
            
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        try{
            String query = "INSERT INTO `afgifte`(`soort`, `tijd`, `aantal`, `datum`) VALUES (?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/applicatie", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, naamPil.getText());
            pst.setString(2, tijdPil.getText());
            pst.setString(3, aantalPil.getText());
            pst.setString(4, dagPil.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "succes");
            
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_toevoegknopPilActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeTekst;
    private javax.swing.JLabel HuidigeDag;
    private javax.swing.JLabel HuidigeDatumTijd1;
    private javax.swing.JButton KnopAgenda;
    private javax.swing.JButton KnopFAQ;
    private javax.swing.JButton KnopHome;
    private javax.swing.JButton KnopMedicatie;
    private javax.swing.JButton KnopProfiel;
    private javax.swing.JTextField aantalPil;
    private javax.swing.JTextField dagPil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField naamPil;
    private javax.swing.JTextField tijdPil;
    private javax.swing.JButton toevoegknopPil;
    private javax.swing.JTextField totaalPil;
    // End of variables declaration//GEN-END:variables
}