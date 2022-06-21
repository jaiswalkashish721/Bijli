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
        jButton10 = new javax.swing.JButton();
        jframe_showcustomerdetails = new javax.swing.JFrame();
        jframe_paymentstatus = new javax.swing.JFrame();
        jframe_adminhome = new javax.swing.JFrame();
        jframe_updatedetails = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        tf10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf14 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
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
        jLabel4.setBounds(60, 30, 70, 18);

        jLabel5.setText("Address");
        jframe_signup.getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 80, 70, 18);

        jLabel6.setText("email");
        jframe_signup.getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 180, 50, 18);

        jLabel7.setText("Phone no.");
        jframe_signup.getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 230, 80, 18);

        jLabel8.setText("Zipcode");
        jframe_signup.getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 130, 70, 18);

        jLabel9.setText("Joining date");
        jframe_signup.getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 280, 100, 18);
        jframe_signup.getContentPane().add(tf7);
        tf7.setBounds(190, 180, 240, 24);
        jframe_signup.getContentPane().add(tf6);
        tf6.setBounds(190, 130, 240, 24);

        tf4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tf4ComponentHidden(evt);
            }
        });
        jframe_signup.getContentPane().add(tf4);
        tf4.setBounds(190, 30, 240, 24);
        jframe_signup.getContentPane().add(tf8);
        tf8.setBounds(190, 230, 240, 24);
        jframe_signup.getContentPane().add(tf5);
        tf5.setBounds(190, 80, 240, 24);
        jframe_signup.getContentPane().add(tf9);
        tf9.setBounds(190, 280, 240, 24);

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
        jLabel10.setBounds(60, 330, 120, 18);
        jframe_signup.getContentPane().add(pf2);
        pf2.setBounds(190, 330, 240, 24);

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

        jButton10.setText("Update details");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jframe_home.getContentPane().add(jButton10);
        jButton10.setBounds(60, 210, 200, 60);

        jframe_showcustomerdetails.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jframe_showcustomerdetails.getContentPane().setLayout(null);

        jframe_paymentstatus.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jframe_paymentstatus.getContentPane().setLayout(null);

        jframe_adminhome.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jframe_adminhome.getContentPane().setLayout(null);

        jframe_updatedetails.setTitle("UPDATE DETAILS");
        jframe_updatedetails.getContentPane().setLayout(null);

        jLabel11.setText("Name");
        jframe_updatedetails.getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 50, 70, 18);
        jframe_updatedetails.getContentPane().add(tf10);
        tf10.setBounds(170, 50, 260, 24);

        jLabel12.setText("Address");
        jframe_updatedetails.getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 110, 80, 18);
        jframe_updatedetails.getContentPane().add(tf11);
        tf11.setBounds(170, 110, 260, 24);

        jLabel13.setText("Zipcode");
        jframe_updatedetails.getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 170, 80, 18);
        jframe_updatedetails.getContentPane().add(tf12);
        tf12.setBounds(170, 170, 260, 24);

        jLabel14.setText("email");
        jframe_updatedetails.getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 230, 60, 18);
        jframe_updatedetails.getContentPane().add(tf13);
        tf13.setBounds(170, 230, 260, 24);

        jLabel15.setText("Phone no.");
        jframe_updatedetails.getContentPane().add(jLabel15);
        jLabel15.setBounds(50, 290, 90, 18);
        jframe_updatedetails.getContentPane().add(tf14);
        tf14.setBounds(170, 290, 260, 24);

        jButton11.setText("CLEAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jframe_updatedetails.getContentPane().add(jButton11);
        jButton11.setBounds(30, 370, 100, 50);

        jButton12.setText("UPDATE DETAILS");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jframe_updatedetails.getContentPane().add(jButton12);
        jButton12.setBounds(150, 370, 190, 50);

        jButton13.setText("BACK");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jframe_updatedetails.getContentPane().add(jButton13);
        jButton13.setBounds(350, 370, 110, 50);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(null);

        jLabel2.setText("Meter number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 40, 110, 18);

        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 100, 18);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(220, 40, 260, 24);
        getContentPane().add(pf1);
        pf1.setBounds(220, 130, 260, 24);

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

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jframe_updatedetails.getContentPane().setBackground(new java.awt.Color(211,211,211));
        jframe_updatedetails.setSize(500,500);
        jframe_updatedetails.setLocationRelativeTo(null);
        jframe_updatedetails.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jframe_updatedetails.dispose();
        jframe_home.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        tf10.setText("");
        tf11.setText("");
        tf12.setText("");
        tf13.setText("");
        tf14.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
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
    private javax.swing.JFrame jframe_updatedetails;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
    private int meter_id;
}
