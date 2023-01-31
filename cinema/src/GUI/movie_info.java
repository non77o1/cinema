/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import clas.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hneen.
 */
public class movie_info extends javax.swing.JFrame {

    /**
     * Creates new form movie_info
     */
    int id_customer = 0;
    movieName movie;

    public movie_info() {
        initComponents();
    }

    public movie_info(int id, movieName movie) {
        initComponents();
        buttonGroup1.add(Time1button);
        buttonGroup1.add(Time2button);
        buttonGroup1.add(Time3button);
        id_customer = id;
        this.movie = movie;
        getTime();
        showMovie();
        System.out.println(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Movie_name = new javax.swing.JLabel();
        Movidoration = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        movie_age = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Time1button = new javax.swing.JRadioButton();
        Time2button = new javax.swing.JRadioButton();
        Time3button = new javax.swing.JRadioButton();
        Next_jButton1 = new javax.swing.JButton();
        back_jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        movie_language1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Movie Information ");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/hneen./IdeaProjects/cnema/icon/popcorn.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Language:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("doration:");

        Movie_name.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Movie_name.setForeground(new java.awt.Color(153, 153, 255));
        Movie_name.setText("Movie name");

        Movidoration.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Movidoration.setForeground(new java.awt.Color(153, 153, 255));
        Movidoration.setText("movie doration");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText(" Name: ");

        movie_age.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        movie_age.setForeground(new java.awt.Color(153, 153, 255));
        movie_age.setText("movie Language");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Chose The Time:");

        Time1button.setForeground(new java.awt.Color(255, 153, 153));
        Time1button.setText("Time1");
        Time1button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time1buttonActionPerformed(evt);
            }
        });

        Time2button.setForeground(new java.awt.Color(255, 153, 153));
        Time2button.setText("Time2");

        Time3button.setForeground(new java.awt.Color(255, 153, 153));
        Time3button.setSelected(true);
        Time3button.setText("Time3");

        Next_jButton1.setBackground(new java.awt.Color(204, 255, 255));
        Next_jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Next_jButton1.setForeground(new java.awt.Color(0, 102, 102));
        Next_jButton1.setText("Next");
        Next_jButton1.setActionCommand("");
        Next_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_jButton1ActionPerformed(evt);
            }
        });

        back_jButton2.setBackground(new java.awt.Color(204, 255, 255));
        back_jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        back_jButton2.setForeground(new java.awt.Color(0, 102, 102));
        back_jButton2.setText("Back");
        back_jButton2.setActionCommand("");
        back_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Age:");

        movie_language1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        movie_language1.setForeground(new java.awt.Color(153, 153, 255));
        movie_language1.setText("movie Language");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Time1button)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(15, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel3))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(27, 27, 27)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(67, 67, 67)
                                                                                        .addComponent(Time2button)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(Time3button)
                                                                                        .addGap(76, 76, 76))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(Movie_name)
                                                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(movie_language1)
                                                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Next_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(129, 129, 129))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(movie_age)
                                                        .addComponent(Movidoration)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(back_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(325, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel1)))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(Movie_name))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(movie_language1)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(Movidoration))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(movie_age)
                                                        .addComponent(jLabel6))))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Time1button)
                                        .addComponent(Time2button)
                                        .addComponent(Time3button))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(Next_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(461, Short.MAX_VALUE)
                                        .addComponent(back_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void Time1buttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void back_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        movie d = new movie(id_customer);
        d.setTitle("movie");
        d.setVisible(true);
    }

    private void Next_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        showMovie();
        if(Time1button.isSelected() ){
            movie.setTimes(Time1button.getText());
            System.out.println(movie.getTimes());
            if (!movie.getTimes().isEmpty()){
                dispose();
                seat d = new seat(id_customer,movie);
                d.setTitle("movie");
                d.setVisible(true);
            }
        }else if (Time2button.isSelected()){
            movie.setTimes(Time2button.getText());
            System.out.println(movie.getTimes());
            if (!movie.getTimes().isEmpty()){
                dispose();
                seat d = new seat(id_customer,movie);
                d.setTitle("movie");
                d.setVisible(true);
            }
        }else if (Time3button.isSelected()){
            movie.setTimes(Time3button.getText());
            System.out.println(movie.getTimes());
            if (!movie.getTimes().isEmpty()){
                dispose();
                seat d = new seat(id_customer,movie);
                d.setTitle("movie");
                d.setVisible(true);
            }
        }else {
            JOptionPane.showMessageDialog(this, "Select Time!!","Error", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(movie_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movie_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movie_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movie_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movie_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Movidoration;
    private javax.swing.JLabel Movie_name;
    private javax.swing.JButton Next_jButton1;
    private javax.swing.JRadioButton Time1button;
    private javax.swing.JRadioButton Time2button;
    private javax.swing.JRadioButton Time3button;
    private javax.swing.JButton back_jButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel movie_age;
    private javax.swing.JLabel movie_language1;
    // End of variables declaration
    String movieTime[]=new String[3];
    void getTime() {
        ResultSet resultSet = null;
        PreparedStatement getMovie = null;
        DB n = new DB();
        Connection dbconn = n.connectDB();

        try {
            int i=0;
            getMovie = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM movie_time where movie_id=?");
            getMovie.setInt(1,movie.getItem_id());
            resultSet = getMovie.executeQuery();
            while (resultSet.next()) {
                movieTime[i]=resultSet.getString("time");
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                getMovie.close();
                dbconn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void showMovie(){
        Movie_name.setText(movie.getItem_name());
        Movidoration.setText(movie.getDoration());
        movie_age.setText(movie.getAge());
        movie_language1.setText(movie.getLanguage());
        Time1button.setText(movieTime[0]);
        Time2button.setText(movieTime[1]);
        Time3button.setText(movieTime[2]);
    }
}