package bijli;

import javax.swing.*;
import java.sql.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(211,211,211));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jframe_signup = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        pf2 = new javax.swing.JPasswordField();
        jframe_home = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jframe_showcustomerdetails = new javax.swing.JFrame();
        jframe_paymentstatus = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jframe_signup.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jframe_signup.setTitle("Sign Up");
        jframe_signup.setLocation(new java.awt.Point(650, 400));
        jframe_signup.setMinimumSize(new java.awt.Dimension(500, 600));
        jframe_signup.getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        jframe_signup.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel4.setText("Name");
        jframe_signup.getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 50, 70, 16);

        jLabel5.setText("Address");
        jframe_signup.getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 120, 70, 16);

        jLabel6.setText("email");
        jframe_signup.getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 200, 60, 16);

        jLabel7.setText("Phone no.");
        jframe_signup.getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 240, 80, 16);

        jLabel8.setText("zipcode");
        jframe_signup.getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 160, 80, 16);

        jLabel9.setText("Joining date");
        jframe_signup.getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 290, 100, 16);
        jframe_signup.getContentPane().add(tf7);
        tf7.setBounds(170, 200, 240, 22);
        jframe_signup.getContentPane().add(tf6);
        tf6.setBounds(170, 160, 240, 22);

        tf4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tf4ComponentHidden(evt);
            }
        });
        jframe_signup.getContentPane().add(tf4);
        tf4.setBounds(170, 50, 240, 22);
        jframe_signup.getContentPane().add(tf8);
        tf8.setBounds(170, 240, 240, 22);
        jframe_signup.getContentPane().add(tf5);
        tf5.setBounds(170, 110, 240, 22);
        jframe_signup.getContentPane().add(tf9);
        tf9.setBounds(180, 290, 230, 22);

        jButton5.setText("SIGN UP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jframe_signup.getContentPane().add(jButton5);
        jButton5.setBounds(200, 410, 180, 22);

        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jframe_signup.getContentPane().add(jButton6);
        jButton6.setBounds(50, 410, 72, 22);

        jLabel10.setText("Create Password");
        jframe_signup.getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 340, 120, 16);
        jframe_signup.getContentPane().add(pf2);
        pf2.setBounds(180, 340, 230, 22);

        jframe_home.setTitle("HOME");
        jframe_home.setSize(new java.awt.Dimension(500, 500));
        jframe_home.getContentPane().setLayout(null);

        jButton7.setText("Show Customer Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jframe_home.getContentPane().add(jButton7);
        jButton7.setBounds(60, 60, 200, 50);

        jButton8.setText("Monthly payment status");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jframe_home.getContentPane().add(jButton8);
        jButton8.setBounds(60, 130, 210, 60);

        jframe_showcustomerdetails.getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(null);

        jLabel2.setText("Meter number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 50, 110, 16);

        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 140, 62, 16);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(220, 40, 260, 22);
        getContentPane().add(pf1);
        pf1.setBounds(220, 130, 260, 22);

        jButton1.setText("CLEAR");
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 210, 110, 50);

        jButton2.setText("USER LOGIN");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 210, 130, 50);

        jButton3.setText("ADMIN LOGIN");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 210, 140, 50);

        jButton4.setText("SIGN UP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(220, 280, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tf1.setText("");
        pf1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        meter_no=Integer.parseInt((tf1.getText()).trim());
        String password = String.valueOf(pf1.getPassword());
        try
        {
            Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/bijli","yash","qazwsx1234");
            Statement stmt=conn.createStatement();
            String query="select * from login_details;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                if(meter_no==rs.getInt(1) && password.equals(rs.getString(2)))           // 1 represents column number of meter_id and (2) as pwd
                {
                    JOptionPane.showMessageDialog(this, "Logged in succesffully");
                    dispose();
                    jframe_home.setLocationRelativeTo(null);
                    jframe_home.setVisible(true);
                    return;
                }   
            }
            JOptionPane.showMessageDialog(this, "User not found");
            
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
     


    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
       jframe_signup.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String name=tf4.getText();
        String address=tf5.getText();
        String zipcode=tf6.getText();
        String email=tf7.getText();
        String phone_number=tf8.getText();
        String joining=tf9.getText();
        String pswd=String.valueOf(pf2.getPassword());
        try
        {
            Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/bijli","yash","qazwsx1234");
            Statement stmt=conn.createStatement();
            String query="insert into customer_details values(default,'"+name+"','"+address+"','"+zipcode+"','"+email+"','"+phone_number+"','"+joining+"');";
            stmt.executeUpdate(query);
            query="insert into login_details values(default,'"+pswd+"');";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Registered succesffully");
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tf4ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ComponentHidden

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        tf7.setText("");
        tf8.setText("");
        tf9.setText("");
        pf2.setText("");
              
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jframe_paymentstatus.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFrame jframe_home;
    private javax.swing.JFrame jframe_paymentstatus;
    private javax.swing.JFrame jframe_showcustomerdetails;
    private javax.swing.JFrame jframe_signup;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
    private int meter_no;
}
