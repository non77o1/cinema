/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import clas.*;

import javax.swing.*;

/**
 *
 * @author hneen.
 */
public class seat extends javax.swing.JFrame {

    /**
     * Creates new form seat
     */
    int id_customer;
    movieName movie;
    double CD_Seat=15;
    double AB_seat=30;
    double SeatPrise=0;
    public seat() {
        initComponents();
    }
    public seat(int id ,movieName movie) {
        initComponents();
        this.id_customer=id;
        this.movie=movie;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        D1_seat = new javax.swing.JCheckBox();
        D2_seat = new javax.swing.JCheckBox();
        D3_seat = new javax.swing.JCheckBox();
        D4_seat = new javax.swing.JCheckBox();
        C1_seat = new javax.swing.JCheckBox();
        C2_seat = new javax.swing.JCheckBox();
        C3_seat = new javax.swing.JCheckBox();
        C4_seat = new javax.swing.JCheckBox();
        B1_seat = new javax.swing.JCheckBox();
        B2_seat = new javax.swing.JCheckBox();
        B3_seat = new javax.swing.JCheckBox();
        B4_seat = new javax.swing.JCheckBox();
        B5_seat = new javax.swing.JCheckBox();
        A5_seat = new javax.swing.JCheckBox();
        A4_seat = new javax.swing.JCheckBox();
        A3_seat = new javax.swing.JCheckBox();
        A2_seat = new javax.swing.JCheckBox();
        A1_seat = new javax.swing.JCheckBox();
        back_jButton2 = new javax.swing.JButton();
        Next_jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/hneen./IdeaProjects/cnema/icon/cinema-screen (1).png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Chose Seat");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("VIP:30SR");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("standard:15SR");

        D1_seat.setForeground(new java.awt.Color(153, 204, 255));
        D1_seat.setText("D1");

        D2_seat.setForeground(new java.awt.Color(153, 204, 255));
        D2_seat.setText("D2");

        D3_seat.setForeground(new java.awt.Color(153, 204, 255));
        D3_seat.setText("D3");
        D3_seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3_seatActionPerformed(evt);
            }
        });

        D4_seat.setForeground(new java.awt.Color(153, 204, 255));
        D4_seat.setText("D4");

        C1_seat.setForeground(new java.awt.Color(153, 204, 255));
        C1_seat.setText("C1");

        C2_seat.setForeground(new java.awt.Color(153, 204, 255));
        C2_seat.setText("C2");

        C3_seat.setForeground(new java.awt.Color(153, 204, 255));
        C3_seat.setText("C3");
        C3_seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3_seatActionPerformed(evt);
            }
        });

        C4_seat.setForeground(new java.awt.Color(153, 204, 255));
        C4_seat.setText("C4");

        B1_seat.setForeground(new java.awt.Color(255, 102, 51));
        B1_seat.setText("B1");

        B2_seat.setForeground(new java.awt.Color(255, 102, 102));
        B2_seat.setText("B2");

        B3_seat.setForeground(new java.awt.Color(255, 102, 102));
        B3_seat.setText("B3");
        B3_seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3_seatActionPerformed(evt);
            }
        });

        B4_seat.setForeground(new java.awt.Color(255, 102, 102));
        B4_seat.setText("B4");

        B5_seat.setForeground(new java.awt.Color(255, 102, 102));
        B5_seat.setText("B5");

        A5_seat.setForeground(new java.awt.Color(255, 102, 102));
        A5_seat.setText("A5");

        A4_seat.setForeground(new java.awt.Color(255, 102, 102));
        A4_seat.setText("A4");

        A3_seat.setForeground(new java.awt.Color(255, 102, 102));
        A3_seat.setText("A3");
        A3_seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3_seatActionPerformed(evt);
            }
        });

        A2_seat.setForeground(new java.awt.Color(255, 102, 102));
        A2_seat.setText("A2");

        A1_seat.setForeground(new java.awt.Color(255, 102, 51));
        A1_seat.setText("A1");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(B1_seat)
                                                        .addComponent(A1_seat))
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(B2_seat)
                                                        .addComponent(A2_seat))
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(B3_seat)
                                                        .addComponent(A3_seat))
                                                .addGap(46, 46, 46)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(A4_seat)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(A5_seat))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(B4_seat)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(B5_seat)))))
                                .addContainerGap(102, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(C1_seat)
                                                                .addGap(45, 45, 45)
                                                                .addComponent(C2_seat)
                                                                .addGap(48, 48, 48)
                                                                .addComponent(C3_seat)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(C4_seat))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(D1_seat)
                                                                .addGap(45, 45, 45)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(D2_seat)
                                                                                .addGap(48, 48, 48)
                                                                                .addComponent(D3_seat)
                                                                                .addGap(46, 46, 46)
                                                                                .addComponent(D4_seat))
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(129, 129, 129))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(back_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(Next_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(D1_seat)
                                        .addComponent(D2_seat)
                                        .addComponent(D3_seat)
                                        .addComponent(D4_seat))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(C1_seat)
                                        .addComponent(C2_seat)
                                        .addComponent(C3_seat)
                                        .addComponent(C4_seat))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(B1_seat)
                                        .addComponent(B2_seat)
                                        .addComponent(B3_seat)
                                        .addComponent(B4_seat)
                                        .addComponent(B5_seat))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(A1_seat)
                                        .addComponent(A2_seat)
                                        .addComponent(A3_seat)
                                        .addComponent(A4_seat)
                                        .addComponent(A5_seat))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Next_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(back_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
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

    private void D3_seatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void C3_seatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void B3_seatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void A3_seatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void back_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        movie_info d = new movie_info(id_customer,movie);
        d.setTitle("movie_info");
        d.setVisible(true);
    }

    private void Next_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        selectedSeat();
        addSeat();
        if(SeatPrise>0 && id_customer!=0&& seats!=null){
            movie.setSeats(seats);
            System.out.println(seats);
            dispose();
            Snack d = new Snack(id_customer,movie,SeatPrise);
            d.setTitle("Snak");
            d.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Select a seat!!","Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seat().setVisible(true);
            }
        });
    }
    void  selectedSeat(){
        if (C1_seat.isSelected() || C2_seat.isSelected() || C3_seat.isSelected() || C4_seat.isSelected() || D1_seat.isSelected() || D2_seat.isSelected() || D3_seat.isSelected() || D4_seat.isSelected()){
            SeatPrise+=CD_Seat;
        }else if (A1_seat.isSelected() || A2_seat.isSelected() || A3_seat.isSelected() || A4_seat.isSelected() || A5_seat.isSelected() || B1_seat.isSelected()|| B2_seat.isSelected()|| B3_seat.isSelected() || B4_seat.isSelected() || B5_seat.isSelected()){
            SeatPrise+=AB_seat;
        }
    }
    String seats[]= new String[20];
    void addSeat(){
        int i=0;
       if (i<20){
            if (A1_seat.isSelected()) {
                seats[i]=A1_seat.getText();
                i+=1;
            }
            if (A2_seat.isSelected()) {
                seats[i]=A2_seat.getText();
                i+=1;
            }
            if (A3_seat.isSelected()) {
                seats[i]=A3_seat.getText();
                i+=1;
            }
            if (A4_seat.isSelected()) {
                seats[i]=A4_seat.getText();
                i+=1;
            }
            if (A5_seat.isSelected()) {
                seats[i]=A5_seat.getText();
                i+=1;
            }
            if (B1_seat.isSelected()) {
                seats[i]=B1_seat.getText();
                i+=1;
            }
            if (B2_seat.isSelected()) {
                seats[i]=B2_seat.getText();
                i+=1;
            }
            if (B3_seat.isSelected()) {
                seats[i]=B3_seat.getText();
                i+=1;
            }
            if (B4_seat.isSelected()) {
                seats[i]=B4_seat.getText();
                i+=1;
            }
            if (B5_seat.isSelected()) {
                seats[i]=B5_seat.getText();
                i+=1;
            }
            if (C1_seat.isSelected()) {
                seats[i]=C1_seat.getText();
                i+=1;
            }
            if (C2_seat.isSelected()) {
                seats[i]=C2_seat.getText();
                i+=1;
            }
            if (C3_seat.isSelected()) {
                seats[i]=C3_seat.getText();
                i+=1;
            }
            if (C4_seat.isSelected()) {
                seats[i]=C4_seat.getText();
                i+=1;
            }
            if (D1_seat.isSelected()) {
                seats[i]=D1_seat.getText();
                i+=1;
            }
            if (D2_seat.isSelected()) {
                seats[i]=D2_seat.getText();
                i+=1;
            }
            if (D3_seat.isSelected()) {
                seats[i]=D3_seat.getText();
                i+=1;
            }
            if (D4_seat.isSelected()) {
                seats[i]=D4_seat.getText();
                i+=1;
            }
        }
    }
    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox A1_seat;
    private javax.swing.JCheckBox A2_seat;
    private javax.swing.JCheckBox A3_seat;
    private javax.swing.JCheckBox A4_seat;
    private javax.swing.JCheckBox A5_seat;
    private javax.swing.JCheckBox B1_seat;
    private javax.swing.JCheckBox B2_seat;
    private javax.swing.JCheckBox B3_seat;
    private javax.swing.JCheckBox B4_seat;
    private javax.swing.JCheckBox B5_seat;
    private javax.swing.JCheckBox C1_seat;
    private javax.swing.JCheckBox C2_seat;
    private javax.swing.JCheckBox C3_seat;
    private javax.swing.JCheckBox C4_seat;
    private javax.swing.JCheckBox D1_seat;
    private javax.swing.JCheckBox D2_seat;
    private javax.swing.JCheckBox D3_seat;
    private javax.swing.JCheckBox D4_seat;
    private javax.swing.JButton Next_jButton1;
    private javax.swing.JButton back_jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
