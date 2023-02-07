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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hneen.
 */
public class bookSummary extends javax.swing.JFrame {

    /**
     * Creates new form bookSummary
     */
    public bookSummary() {
        initComponents();
    }

    List<order_record> summary = new ArrayList<order_record>();
    int id;
    public bookSummary(int id) {
        initComponents();
        this.id=id;
        Order_summary();
        jTextArea1.setEnabled(false);
        if (summary!=null) {
            for (order_record s : summary) {
                jTextArea1.append(s.toString()+"\n\n-----------------------------------------------------------------------------------------------------------------------------\n\n");
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "List is Empty", "Error", JOptionPane.ERROR_MESSAGE);

        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BackjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Booking Summary");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        BackjButton1.setText("Back");
        BackjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BackjButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        customerMenue d = new customerMenue(id);
        d.setTitle("movie");
        d.setVisible(true);
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
            java.util.logging.Logger.getLogger(bookSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookSummary().setVisible(true);
            }
        });
    }
    void Order_summary() {
        Order order=null;
        Payment payment=null;
        Customer customer=null;
        movieName movie=null;
        int num_item=0;
        DB conn = new DB();
        Connection dbconn = conn.connectDB();

        try {
            //select all order
            PreparedStatement order_record = dbconn.prepareStatement("SELECT * FROM order_record where custemer_id=?");
            order_record.setInt(1,id);
            ResultSet order1 = order_record.executeQuery();
            while (order1.next()) {
                try {
                    PreparedStatement  payInfo=dbconn.prepareStatement("SELECT * FROM cash where Payment_id=?");
                    payInfo.setInt(1,order1.getInt("pay_id"));
                    ResultSet  cash=payInfo.executeQuery();
                    if (cash.next()){
                        order = new Order();
                        order.setId(order1.getInt("order_id"));
                        payment= new cash(cash.getInt("Payment_id"),cash.getDouble("Order_Total_price"),cash.getString("currency"));
                        num_item=cash.getInt("num_items");
                        cash.close();
                    }

                    payInfo=dbconn.prepareStatement("SELECT * FROM card where Payment_id=?");
                    payInfo.setInt(1,order1.getInt("pay_id"));
                    ResultSet  card=payInfo.executeQuery();
                    if (card.next()){
                        order = new Order();
                        order.setId(order1.getInt("order_id"));
                        payment= new card();
                        payment.setPay_id(card.getInt("Payment_id"));
                        payment.setTotal_price(card.getDouble("Order_Total_price"));
                        num_item=card.getInt("num_items");
                        card.close();
                    }
                    PreparedStatement   movieInfo=dbconn.prepareStatement("SELECT * FROM movie where movie_id=?");
                    movieInfo.setInt(1,order1.getInt("movie_id"));
                    ResultSet move =movieInfo.executeQuery();
                    if (move.next()){
                        movie=new movieName();
                        movie.setItem_id(move.getInt("movie_id"));
                        movie.setItem_name(move.getString("movie_name"));
                        movie.setLanguage(move.getString("Language"));
                        movie.setAge(move.getString("age"));
                        move.close();
                    }

                    PreparedStatement   customerInfo=dbconn.prepareStatement("SELECT coustomer_id , coustomer_name  FROM customer where coustomer_id=?");
                    customerInfo.setInt(1,id);
                    ResultSet  cus=customerInfo.executeQuery();
                    if (cus.next()){
                        customer=new Customer();
                        customer.setId(cus.getInt("coustomer_id"));
                        customer.setName(cus.getString("coustomer_name"));
                        cus.close();
                    }



                    if (order!=null && payment!=null && customer!=null &&  movie!=null) {
                        summary.add(new order_record(order, payment, customer, num_item,movie));
                    }
                    payInfo.close();
                    customerInfo.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            order_record.close();
            order1.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }finally {
            try {
                dbconn.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton BackjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
