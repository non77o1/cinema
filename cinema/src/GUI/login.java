/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import clas.DB;


import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hneen.
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    int id =0;
    public login() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hello_lable = new javax.swing.JLabel();
        login_labal = new javax.swing.JLabel();
        username_labal = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        password_labal1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        cinema_icon = new javax.swing.JLabel();
        Sign_jButton = new javax.swing.JButton();
        login_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        hello_lable.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 24)); // NOI18N
        hello_lable.setForeground(new java.awt.Color(255, 204, 102));
        hello_lable.setText("Hello to our Cinema App!!");

        login_labal.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 24)); // NOI18N
        login_labal.setForeground(new java.awt.Color(255, 204, 153));
        login_labal.setText("Log In");

        username_labal.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        username_labal.setForeground(new java.awt.Color(204, 204, 204));
        username_labal.setText("User name:");

        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        password_labal1.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        password_labal1.setForeground(new java.awt.Color(204, 204, 204));
        password_labal1.setText("Password:");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        cinema_icon.setIcon(new javax.swing.ImageIcon("/Users/hneen./IdeaProjects/cnema/icon/cinema.png")); // NOI18N

        Sign_jButton.setBackground(new java.awt.Color(255, 204, 0));
        Sign_jButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        Sign_jButton.setText("Sign Up");
        Sign_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_jButtonActionPerformed(evt);
            }
        });

        login_jButton.setBackground(new java.awt.Color(255, 204, 0));
        login_jButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        login_jButton.setText("Log In ");
        login_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(cinema_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(54, 54, 54))
                                                                        .addComponent(hello_lable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(password_labal1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jPasswordField1))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(username_labal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(112, 112, 112)
                                                                                .addComponent(login_labal)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(Sign_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(hello_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cinema_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(login_labal)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(username_labal)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(password_labal1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Sign_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void login_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String uesername =username_field.getText();
        String password = jPasswordField1.getText();
        if(uesername.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username / password should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            //start the login process
            userLogin(uesername,password);
        }
    }

    private void Sign_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        signup d= new signup();
        d.setTitle("Dash Bord");
        d.setVisible(true);
    }

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    private void  userLogin (String uesername, String password){
        DB conn=new DB();
        Connection dbconn=conn.connectDB();
        PreparedStatement st=null;
        ResultSet res=null;
        try {
            st = (PreparedStatement)
                    dbconn.prepareStatement("select * from account where username = ? and password =? and rule= ?");
            st.setString(1,uesername);
            st.setString(2,password);
            st.setString(3,"c");
            res =st.executeQuery();
            if(res.next()){
                //display
                showUser_info(uesername,password);
                dispose();
                if(id !=0) {
                    movie d = new movie(id);
                    d.setTitle("movie");
                    d.setVisible(true);
                }


            }
            else{
                    st.setString(1,uesername);
                    st.setString(2,password);
                    st.setString(3,"e");
                    res =st.executeQuery();
                    if (res.next()){
                        showUser_info(uesername,password);
                        dispose();
                        employee d= new employee(id);
                        d.setTitle("Employee");
                        d.setVisible(true);
                    }else {
                        JOptionPane.showMessageDialog(this, "Username / password  not find", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                System.out.println("user"+uesername);
                System.out.println("pass"+password);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                dbconn.close();
                res.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void showUser_info(String username, String password){
        DB conn=new DB();
        Connection dbconn=conn.connectDB();
        PreparedStatement st=null;
        ResultSet res=null;
        try {
            st = (PreparedStatement) dbconn.prepareStatement("select * from account where username = ? and password =? ");
            st.setString(1, username);
            st.setString(2, password);
            res = st.executeQuery();
            if (res.next()){
                id =res.getInt("person_id");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                dbconn.close();
                st.close();
                res.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }


    // Variables declaration - do not modify
    private javax.swing.JButton Sign_jButton;
    private javax.swing.JLabel cinema_icon;
    private javax.swing.JLabel hello_lable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton login_jButton;
    private javax.swing.JLabel login_labal;
    private javax.swing.JLabel password_labal1;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_labal;
    // End of variables declaration                   
}
