package bijli;

import javax.swing.*;
import java.sql.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(211,211,211));
        setSize(600, 400);
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
        jButton9 = new javax.swing.JButton();
        jframe_showcustomerdetails = new javax.swing.JFrame();
        jButton11 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ctf1 = new javax.swing.JTextField();
        ctf2 = new javax.swing.JTextField();
        ctf3 = new javax.swing.JTextField();
        ctf4 = new javax.swing.JTextField();
        ctf5 = new javax.swing.JTextField();
        ctf6 = new javax.swing.JTextField();
        ctf7 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jframe_paymentstatus = new javax.swing.JFrame();
        jframe_adminhome = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jframe_signup.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jframe_signup.setTitle("SIGN UP");
        jframe_signup.setLocation(new java.awt.Point(0, 0));
        jframe_signup.getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        jframe_signup.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel4.setText("Name");
        jframe_signup.getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 30, 70, 16);

        jLabel5.setText("Address");
        jframe_signup.getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 80, 70, 16);

        jLabel6.setText("email");
        jframe_signup.getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 180, 50, 16);

        jLabel7.setText("Phone no.");
        jframe_signup.getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 230, 80, 16);

        jLabel8.setText("Zipcode");
        jframe_signup.getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 130, 70, 16);

        jLabel9.setText("Joining date");
        jframe_signup.getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 280, 100, 16);
        jframe_signup.getContentPane().add(tf7);
        tf7.setBounds(190, 180, 240, 22);
        jframe_signup.getContentPane().add(tf6);
        tf6.setBounds(190, 130, 240, 22);

        tf4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tf4ComponentHidden(evt);
            }
        });
        jframe_signup.getContentPane().add(tf4);
        tf4.setBounds(190, 30, 240, 22);
        jframe_signup.getContentPane().add(tf8);
        tf8.setBounds(190, 230, 240, 22);
        jframe_signup.getContentPane().add(tf5);
        tf5.setBounds(190, 80, 240, 22);
        jframe_signup.getContentPane().add(tf9);
        tf9.setBounds(190, 280, 240, 22);

        jButton5.setText("SIGN UP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jframe_signup.getContentPane().add(jButton5);
        jButton5.setBounds(230, 390, 160, 40);

        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jframe_signup.getContentPane().add(jButton6);
        jButton6.setBounds(90, 390, 110, 40);

        jLabel10.setText("New Password");
        jframe_signup.getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 330, 120, 16);
        jframe_signup.getContentPane().add(pf2);
        pf2.setBounds(190, 330, 240, 22);

        jframe_home.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jButton9.setText("Log out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jframe_home.getContentPane().add(jButton9);
        jButton9.setBounds(90, 460, 150, 50);

        jframe_showcustomerdetails.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jframe_showcustomerdetails.getContentPane().setLayout(null);

        jButton11.setText("Show Customer Details");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jframe_showcustomerdetails.getContentPane().add(jButton11);
        jButton11.setBounds(220, 380, 150, 40);

        jLabel11.setText("Meter ID");
        jframe_showcustomerdetails.getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 40, 60, 16);

        jLabel12.setText("Customer Name");
        jframe_showcustomerdetails.getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 80, 100, 16);

        jLabel13.setText("Address");
        jframe_showcustomerdetails.getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 120, 70, 16);

        jLabel14.setText("Zipcode");
        jframe_showcustomerdetails.getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 160, 60, 16);

        jLabel15.setText("Email ID");
        jframe_showcustomerdetails.getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 200, 50, 16);

        jLabel16.setText("Phone Number");
        jframe_showcustomerdetails.getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 240, 100, 16);

        jLabel17.setText("Joining Date");
        jframe_showcustomerdetails.getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 280, 80, 16);
        jframe_showcustomerdetails.getContentPane().add(ctf1);
        ctf1.setBounds(180, 40, 220, 22);

        ctf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctf2ActionPerformed(evt);
            }
        });
        jframe_showcustomerdetails.getContentPane().add(ctf2);
        ctf2.setBounds(180, 80, 220, 22);

        ctf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctf3ActionPerformed(evt);
            }
        });
        jframe_showcustomerdetails.getContentPane().add(ctf3);
        ctf3.setBounds(180, 120, 220, 22);
        jframe_showcustomerdetails.getContentPane().add(ctf4);
        ctf4.setBounds(180, 160, 220, 22);
        jframe_showcustomerdetails.getContentPane().add(ctf5);
        ctf5.setBounds(180, 200, 220, 22);

        ctf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctf6ActionPerformed(evt);
            }
        });
        jframe_showcustomerdetails.getContentPane().add(ctf6);
        ctf6.setBounds(180, 240, 220, 22);
        jframe_showcustomerdetails.getContentPane().add(ctf7);
        ctf7.setBounds(180, 280, 220, 22);

        jButton10.setText("Go to Home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jframe_showcustomerdetails.getContentPane().add(jButton10);
        jButton10.setBounds(25, 382, 120, 40);

        jframe_paymentstatus.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jframe_paymentstatus.getContentPane().setLayout(null);

        jframe_adminhome.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jframe_adminhome.getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(null);

        jLabel2.setText("Meter number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 40, 110, 16);

        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 100, 16);

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

        String password = String.valueOf(pf1.getPassword());
        if(String.valueOf(tf1.getText()).equals("") || password.equals(""))     // Check if all fields are filled
        {
            JOptionPane.showMessageDialog(this,"Fill all fields");
            tf1.setText("");
            pf1.setText("");
            return;
        }
        try                                                                     // Handle Exception for converting string to int using parseInt
        {
        meter_id=Integer.parseInt((tf1.getText()).trim());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Meter id must be a number");
            tf1.setText("");
            pf1.setText("");
            return;
        }
        try                                                                     // Check for Login authentication
        {
            Connection conn=ConnectionProvider.getConnection();
            Statement stmt=conn.createStatement();
            String query="select * from login_details;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                if(meter_id==rs.getInt(1) && password.equals(rs.getString(2)))           // 1 represents column number of meter_id and (2) as pwd
                {
                    JOptionPane.showMessageDialog(this, "Logged in succesffully");
                    dispose();
                    jframe_home.getContentPane().setBackground(new java.awt.Color(211,211,211));
                    jframe_home.setSize(400,600);
                    jframe_home.setLocationRelativeTo(null);
                    jframe_home.setVisible(true);
                    return;
                }   
            }
            JOptionPane.showMessageDialog(this, "User not found");
            tf1.setText("");
            pf1.setText("");        
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                    tf1.setText("");
                    pf1.setText("");
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jframe_signup.getContentPane().setBackground(new java.awt.Color(211,211,211));
        jframe_signup.setSize(500, 500);
        jframe_signup.setLocationRelativeTo(null);
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
            Connection conn=ConnectionProvider.getConnection();
            Statement stmt=conn.createStatement();
            String query="insert into customer_details values(default,'"+name+"','"+address+"','"+zipcode+"','"+email+"','"+phone_number+"','"+joining+"');";
            stmt.executeUpdate(query);
            query="select meter_id from customer_details where phone_no='"+phone_number+"';";
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
                meter_id=rs.getInt(1);
            query="insert into login_details values("+meter_id+",'"+pswd+"');";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Registered succesffully");
            jframe_signup.dispose();
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
        jframe_showcustomerdetails.getContentPane().setBackground(new java.awt.Color(211,211,211));
        jframe_showcustomerdetails.setSize(500,600);
        jframe_showcustomerdetails.setLocationRelativeTo(null);
        jframe_showcustomerdetails.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jframe_paymentstatus.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        meter_id=0;
        JOptionPane.showMessageDialog(this,"Logged out successfully");
        jframe_home.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn=ConnectionProvider.getConnection();
            Statement stmt=conn.createStatement();
            String query="select * from customer_details where meter_id="+meter_id+";";
            ResultSet rs=stmt.executeQuery(query);
            rs.next();
            ctf1.setText(""+rs.getInt(1));
            ctf2.setText(rs.getString(2));
            ctf3.setText(rs.getString(3));
            ctf4.setText(rs.getString(4));
            ctf5.setText(rs.getString(5));
            ctf6.setText(rs.getString(6));
            ctf7.setText(rs.getString(7));
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
            
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void ctf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctf2ActionPerformed

    private void ctf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctf3ActionPerformed

    private void ctf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctf6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jframe_home.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctf1;
    private javax.swing.JTextField ctf2;
    private javax.swing.JTextField ctf3;
    private javax.swing.JTextField ctf4;
    private javax.swing.JTextField ctf5;
    private javax.swing.JTextField ctf6;
    private javax.swing.JTextField ctf7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFrame jframe_adminhome;
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
    private int meter_id;
}
