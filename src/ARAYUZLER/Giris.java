/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARAYUZLER;

import System.*;
import Kitap.*;
import Kullanici.Admin;
import Kullanici.Normal;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author OGUZ
 */
public class Giris extends javax.swing.JFrame {

    /**
     * Creates new form Giris
     */
    int whichone;
    Kullanici_GUI kullanici;
    Admin_GUI admin;
    public void makeVisibleFalse(){
         lbluserid.setVisible(false);
        lblpasswd.setVisible(false);
        tfEnteredID.setVisible(false);
        passwdEntered.setVisible(false);
        jCheckBoxShowPasswd.setVisible(false);
        btnEnter.setVisible(false);
        btnEnter1.setVisible(false);
        btnExit.setVisible(false);
    }
    public void makeVisibleTrue(){
        lbluserid.setVisible(true);
        lblpasswd.setVisible(true);
        tfEnteredID.setVisible(true);
        passwdEntered.setVisible(true);
        jCheckBoxShowPasswd.setVisible(true);
        btnEnter.setVisible(true);  
        btnEnter1.setVisible(true);
        btnExit.setVisible(true);
    }
    public Giris() throws IOException {
        initComponents();
        whichone = 0;
        lbluserid.setText("");
        lblpasswd.setText("");
       makeVisibleFalse();
        InfoKitap.KitaplariOlustur();
        InfoKullanici.Kullanici_Olustur();
        InfoKullanici.Admin_Olustur();
       
        
    }
public void clear(){
    tfEnteredID.setText("");
    passwdEntered.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpasswd = new javax.swing.JLabel();
        lbluserid = new javax.swing.JLabel();
        tfEnteredID = new javax.swing.JTextField();
        passwdEntered = new javax.swing.JPasswordField();
        btnEnter = new javax.swing.JButton();
        jCheckBoxShowPasswd = new javax.swing.JCheckBox();
        btnUSerGiris = new javax.swing.JButton();
        btnAdminGiris = new javax.swing.JButton();
        btnEnter1 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblBackGroung = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        lblpasswd.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lblpasswd.setText("PASSWD :");
        getContentPane().add(lblpasswd);
        lblpasswd.setBounds(140, 250, 150, 40);

        lbluserid.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lbluserid.setText("USER ID :");
        getContentPane().add(lbluserid);
        lbluserid.setBounds(140, 210, 130, 40);

        tfEnteredID.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tfEnteredID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnteredIDActionPerformed(evt);
            }
        });
        getContentPane().add(tfEnteredID);
        tfEnteredID.setBounds(280, 220, 190, 23);

        passwdEntered.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(passwdEntered);
        passwdEntered.setBounds(280, 260, 190, 20);

        btnEnter.setBackground(new java.awt.Color(0, 155, 167));
        btnEnter.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnEnter.setText("ENTER");
        btnEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter);
        btnEnter.setBounds(150, 330, 180, 50);

        jCheckBoxShowPasswd.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jCheckBoxShowPasswd.setText("SHOWPASSWD");
        jCheckBoxShowPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPasswdActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxShowPasswd);
        jCheckBoxShowPasswd.setBounds(170, 290, 120, 23);

        btnUSerGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/iconuser.jpg"))); // NOI18N
        btnUSerGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUSerGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnUSerGiris);
        btnUSerGiris.setBounds(370, 110, 70, 70);

        btnAdminGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/adminIcon.png"))); // NOI18N
        btnAdminGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminGiris);
        btnAdminGiris.setBounds(280, 110, 70, 70);

        btnEnter1.setBackground(new java.awt.Color(0, 155, 167));
        btnEnter1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnEnter1.setText("REGISTER");
        btnEnter1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnter1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter1);
        btnEnter1.setBounds(370, 330, 180, 50);

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(230, 400, 250, 50);

        lblBackGroung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/LoginBackgroun.jpg"))); // NOI18N
        lblBackGroung.setPreferredSize(new java.awt.Dimension(711, 480));
        getContentPane().add(lblBackGroung);
        lblBackGroung.setBounds(0, 0, 711, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEnteredIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnteredIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnteredIDActionPerformed
    public static String baglananid = "";
    public static String baglanansifre = "";
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
         baglananid = tfEnteredID.getText();
         baglanansifre = String.valueOf(passwdEntered.getPassword());
           
        if (whichone == 1) {
          //  JOptionPane.showMessageDialog(null, "You Selected Admin Login");
         
            if (InfoKullanici.Admin_Giris(baglananid, baglanansifre)) {
             admin = new Admin_GUI(this);
              this.setVisible(false);
              admin.setVisible(true);
            }
            else{
               JOptionPane.showMessageDialog(null, "INCORRET ID OR PASSWORD");
            }
        }
        else if(whichone == 2){
               
            if (InfoKullanici.Kullanici_Giris(baglananid, baglanansifre)) {
              kullanici = new Kullanici_GUI(this);
            kullanici.setVisible(true);
             this.setVisible(false);
             
            }
            else{
              
           JOptionPane.showMessageDialog(this, "INCORRECT ID OR PASSWORD");
            }
       
        
        }
        
       
        
    }//GEN-LAST:event_btnEnterActionPerformed

    private void jCheckBoxShowPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswdActionPerformed
if (jCheckBoxShowPasswd.isSelected()) {
          
           passwdEntered.setEchoChar((char)0) ;
        }
        else
          passwdEntered.setEchoChar('*');     
    }//GEN-LAST:event_jCheckBoxShowPasswdActionPerformed

    private void btnAdminGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminGirisActionPerformed
       whichone = 1;
       clear();
       lbluserid.setText("Admin ID :");
       lblpasswd.setText("Admin Passwd :");
       makeVisibleTrue();
    }//GEN-LAST:event_btnAdminGirisActionPerformed

    private void btnUSerGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUSerGirisActionPerformed
       whichone = 2;
        clear();
       lbluserid.setText("User ID :");
       lblpasswd.setText("User Passwd :");
       makeVisibleTrue();
    }//GEN-LAST:event_btnUSerGirisActionPerformed
    KayıtOl kayıtol;
    private void btnEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnter1ActionPerformed
        this.setVisible(false);
        kayıtol = new KayıtOl(this);
        kayıtol.setVisible(true);
    }//GEN-LAST:event_btnEnter1ActionPerformed

       public void NormalKullanicilariDosyayaYaz() throws IOException{
    File f = new File("users.txt");
        FileWriter yaz = new FileWriter(f);
        ArrayList<Normal> x = InfoKullanici.getMyUsers();
        for(int i = 0; i<x.size(); i++){
           yaz.write(x.get(i).getAlanınAdi() + "," + x.get(i).getAlaninSoyadi() + "," + x.get(i).getBolum() + "," + x.get(i).getKullanici_id() + ","+x.get(i).getKullanici_parola()+ "\n"); 
        }
        yaz.close();
    }
    public void AdminKullaniciDosyayaYaz() throws IOException{
        File f = new File("admins.txt");
        FileWriter yaz = new FileWriter(f);
       ArrayList<Admin> x = InfoKullanici.getMyAdmins();
       for(int i = 0; i<x.size();i++){
           yaz.write(x.get(i).getKullanici_id() + " " + x.get(i).getKullanici_parola() + "\n");
       }
       yaz.close();
    }
    public void KitaplariDosyayaYaz() throws IOException{
     File f = new File("books.txt");
     FileWriter yaz = new FileWriter(f);
     ArrayList<Kitap> x = InfoKitap.getKitapListem();
        
     for(int i = 0 ; i< x.size();i++){
      if(x.get(i) instanceof Roman){
      if(x.get(i).isUygun()){
      yaz.write("r" + "," + ((Roman) x.get(i)).getTür() + "," + ((Roman) x.get(i)).getYaşAralığı() + "," + ((Roman) x.get(i)).getEtkilendiğiAkım() + "," + ((Roman) x.get(i)).getYazar()+","+((Roman) x.get(i)).getHamur()+ "," + ((Roman) x.get(i)).getBaskı() + "," + ((Roman) x.get(i)).getSize() + "," + x.get(i).getKitap_adi() + ","+ x.get(i).getBasim_tarihi() + "," + x.get(i).getYayim_Evi() + "," + x.get(i).getUrl() + "," + "true" + "\n" );
          
      }
      else{
       yaz.write("r" + "," + ((Roman) x.get(i)).getTür() + "," + ((Roman) x.get(i)).getYaşAralığı() + "," + ((Roman) x.get(i)).getEtkilendiğiAkım() + "," + ((Roman) x.get(i)).getYazar()+","+((Roman) x.get(i)).getHamur()+ "," + ((Roman) x.get(i)).getBaskı() + "," + ((Roman) x.get(i)).getSize() + "," + x.get(i).getKitap_adi() + ","+ x.get(i).getBasim_tarihi() + "," + x.get(i).getYayim_Evi() + "," + x.get(i).getUrl() + "," + "false" +"," + x.get(i).getKitapAlan().getAlanınAdi() +","+x.get(i).getKitapAlan().getAlaninSoyadi() + ","+ x.get(i).getKitapAlan().getBolum() + "," + x.get(i).getKitapAlan().getKullanici_id() + "," + x.get(i).getKitapAlan().getKullanici_parola() + "," + x.get(i).getKitapAlan().getTeslimTarihi()+ "\n");   
      }
          
      }   
      else if(x.get(i) instanceof Dergi){
         if(x.get(i).isUygun()){
          yaz.write("d" + ","+((Dergi) x.get(i)).getWebSayfasi()+","+((Dergi) x.get(i)).getTürDergi() + "," +((Dergi) x.get(i)).getEditor() + "," + ((Dergi) x.get(i)).getKoordinator() + "," + ((Dergi) x.get(i)).getSayi() + "," + ((Dergi) x.get(i)).getYayımAralığı() + "," + ((Dergi) x.get(i)).getBaskıElek() + "," + ((Dergi) x.get(i)).getDil() + "," + x.get(i).getKitap_adi() + "," + x.get(i).getBasim_tarihi() + "," + x.get(i).getYayim_Evi() + "," + x.get(i).getUrl() +","+ "true" + "\n");
      }
      else{
          yaz.write("d" + "," + ((Dergi) x.get(i)).getWebSayfasi()+","+ ((Dergi) x.get(i)).getTürDergi() + "," +((Dergi) x.get(i)).getEditor() + "," + ((Dergi) x.get(i)).getKoordinator() + "," + ((Dergi) x.get(i)).getSayi() + "," + ((Dergi) x.get(i)).getYayımAralığı() + "," + ((Dergi) x.get(i)).getBaskıElek() + "," + ((Dergi) x.get(i)).getDil() + "," + x.get(i).getKitap_adi() + "," + x.get(i).getBasim_tarihi() + "," + x.get(i).getYayim_Evi() + "," + x.get(i).getUrl() +","+ "false" + "," + x.get(i).getKitapAlan().getAlanınAdi() + "," + x.get(i).getKitapAlan().getAlaninSoyadi() + "," + x.get(i).getKitapAlan().getBolum() + "," + x.get(i).getKitapAlan().getKullanici_id() + "," + x.get(i).getKitapAlan().getKullanici_parola() + "," + x.get(i).getKitapAlan().getTeslimTarihi()+ "\n"); 
      }  
      }   
      else if(x.get(i) instanceof Ansiklopedi){
         if(x.get(i).isUygun()){
         yaz.write("a" + "," +((Ansiklopedi) x.get(i)).getKonu() + "," + ((Ansiklopedi) x.get(i)).getContributors() + "," + ((Ansiklopedi) x.get(i)).getHamur() + "," + ((Ansiklopedi) x.get(i)).getBaskı() + "," + ((Ansiklopedi) x.get(i)).getSize()+ "," +x.get(i).getKitap_adi() +"," + x.get(i).getBasim_tarihi() + "," + x.get(i).getYayim_Evi() + "," +x.get(i).getUrl() + "," + "true" + "\n" );
      }
      else{
         yaz.write("a" + "," +((Ansiklopedi) x.get(i)).getKonu() + "," + ((Ansiklopedi) x.get(i)).getContributors() + "," + ((Ansiklopedi) x.get(i)).getHamur() + "," + ((Ansiklopedi) x.get(i)).getBaskı() + "," + ((Ansiklopedi) x.get(i)).getSize()+ "," +x.get(i).getKitap_adi() +"," + x.get(i).getBasim_tarihi() + "," + x.get(i).getYayim_Evi() + "," +x.get(i).getUrl() + "," + "false" + "," + x.get(i).getKitapAlan().getAlanınAdi() + "," + x.get(i).getKitapAlan().getAlaninSoyadi() + "," + x.get(i).getKitapAlan().getBolum() + "," + x.get(i).getKitapAlan().getKullanici_id() + "," + x.get(i).getKitapAlan().getKullanici_parola() + "," + x.get(i).getKitapAlan().getTeslimTarihi()+ "\n");  
      } 
         
      }   
     
     }
      yaz.close();
    }
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            NormalKullanicilariDosyayaYaz();
             AdminKullaniciDosyayaYaz();
        KitaplariDosyayaYaz();
        System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(Giris.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Giris().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Giris.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminGiris;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEnter1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUSerGiris;
    private javax.swing.JCheckBox jCheckBoxShowPasswd;
    private javax.swing.JLabel lblBackGroung;
    private javax.swing.JLabel lblpasswd;
    private javax.swing.JLabel lbluserid;
    private javax.swing.JPasswordField passwdEntered;
    private javax.swing.JTextField tfEnteredID;
    // End of variables declaration//GEN-END:variables
}
