/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import clas.*;

/**
 *
 * @author hneen.
 */
public class Snack_update extends javax.swing.JFrame {

    /**
     * Creates new form Snack_update
     */
    String [] listSnack;
    public Snack_update() {
        initComponents();
    }
int id;
    public Snack_update(int id) {
        initComponents();
        this.id=id;
        int i=0;
        if (getAllItems()!=null){
            listSnack =new String[50];
            for (Items b: getAllItems()){
                if (i!=50){
                    listSnack[i]=b.toString();
                    i++;
                }
            }
            jList1.setModel(new DefaultComboBoxModel<>(listSnack));
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        addSnack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        snackName = new javax.swing.JTextField();
        snackPrice = new javax.swing.JTextField();
        DeleteSnamck = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("cinema/icon/candies.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Snack Update");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        addSnack.setBackground(new java.awt.Color(255, 204, 204));
        addSnack.setText("Add Snack");
        addSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSnackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("Snack Name:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("Snack Price:");

        snackPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackPriceActionPerformed(evt);
            }
        });

        DeleteSnamck.setBackground(new java.awt.Color(255, 204, 204));
        DeleteSnamck.setText("Delete Snack");
        DeleteSnamck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSnamckActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(addSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(snackName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(snackPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(124, 124, 124)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(DeleteSnamck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(snackName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(snackPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DeleteSnamck, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(addSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
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

    private void snackPriceActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DeleteSnamckActionPerformed(java.awt.event.ActionEvent evt) {
        int select=-1;
        select=jList1.getSelectedIndex();
        if (select!=-1){
            try {
                int index=-1;
                index=getAllItems().get(select).getItem_id();
                if (index!=-1){
                    delete_items(index);
                    index=-1;
                    int i=0;
                    if (getAllItems()!=null){
                        listSnack =new String[50];
                        for (Items b: getAllItems()){
                            if (i!=50){
                                listSnack[i]=b.toString();
                                i++;
                            }
                        }
                        jList1.setModel(new DefaultComboBoxModel<>(listSnack));
                    }
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(this, "reselect an items to be delete", "Error", JOptionPane.ERROR_MESSAGE);
//                e.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "select an items to be delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        employee d = new employee(id);
        d.setTitle("Dash Bord");
        d.setVisible(true);
    }

    private void addSnackActionPerformed(java.awt.event.ActionEvent evt) {
        String name = snackName.getText();
        String price = snackPrice.getText();
        if (name.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            name.trim();
            if (price.matches("[0.0-9.0]+")) {
                double price1=Double.valueOf(price);
              if (price1>0) {
                    if (name.matches("[a-zA-Z_]+")) {
                        Add_Snack(name, price1);
                        int i = 0;
                        if (getAllItems() != null) {
                            listSnack = new String[50];
                            for (Items b : getAllItems()) {
                                if (i != 50) {
                                    listSnack[i] = b.toString();
                                    i++;
                                }
                            }
                            jList1.setModel(new DefaultComboBoxModel<>(listSnack));
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Pleas Enter letters Only", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else {
                  JOptionPane.showMessageDialog(this, "Pleas Enter number greater than zero at price filed", "Error", JOptionPane.ERROR_MESSAGE);
              }
            } else {
                JOptionPane.showMessageDialog(this, "Pleas Enter number at price filed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

        /**
         * @param args the command line arguments
         */
        public static void main (String args[]){
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
                java.util.logging.Logger.getLogger(Snack_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Snack_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Snack_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Snack_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Snack_update().setVisible(true);
                }
            });
        }
    private void Add_Snack(String name, double price1) {
        DB n= new DB();
        Connection dbconn =n.connectDB();
        int last_id=0;
        try {
            PreparedStatement id_p=(PreparedStatement) dbconn.prepareStatement("SELECT * FROM items");
            ResultSet resultSet=id_p.executeQuery();

            while (resultSet.next()){
                last_id = resultSet.getInt("item_id");
            }
            int s=last_id+1;
            PreparedStatement insert_id=(PreparedStatement) dbconn.prepareStatement("insert into items(item_id) value (?)");
            insert_id.setInt(1,s);
            int res =insert_id.executeUpdate();
            if (res==1){
                PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("insert into snack(snack_id,snack_name ,snack_price) values (?,?,?)  ");
                st.setInt(1, s);
                st.setString(2, name);
                st.setDouble(3,price1);
                int res2 = st.executeUpdate();
                if (res2==1){
                    getAllItems();
                    JOptionPane.showMessageDialog(this, "Snack Added", "done!", JOptionPane.INFORMATION_MESSAGE);
                    st.close();

                 }
            }
            id_p.close();
            resultSet.close();
            dbconn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public List<Items> getAllItems(){
        List<Items> getingItems =null;
        ResultSet resultSet=null;
        DB n= new DB();
        Connection dbconn =n.connectDB();
        PreparedStatement getSnack =null;
        try {
            getSnack = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM snack");
            resultSet= getSnack.executeQuery();
            getingItems =new ArrayList<Items>();
            while (resultSet.next()){
                getingItems.add(new snack(resultSet.getInt("snack_id"),
                        resultSet.getString("snack_name"),
                        resultSet.getDouble("snack_price")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                dbconn.close();
                getSnack.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return getingItems;
    }

    private void delete_items(int index){
        DB n= new DB();
        Connection dbconn =n.connectDB();
        PreparedStatement delete=null;
        try {
            delete =(PreparedStatement) dbconn.prepareStatement("DELETE FROM items WHERE (item_id = ?)");
            delete.setInt(1,index);
            int resultSet=delete.executeUpdate();
            getAllItems();
            if (resultSet!=0) {
                int i=0;
                if (getAllItems()!=null){

                    listSnack =new String[50];
                    for (Items b: getAllItems()){
                        if (i<=50){
                            listSnack[i]=b.toString();
                            i++;
                        }
                    }
                    jList1.setModel(new DefaultComboBoxModel<>(listSnack));
                    JOptionPane.showMessageDialog(this, "delete done!", "successful", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                dbconn.close();
                delete.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    // Variables declaration - do not modify
        private javax.swing.JButton Back;
        private javax.swing.JButton DeleteSnamck;
        private javax.swing.JButton addSnack;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JList<String> jList1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField snackName;
        private javax.swing.JTextField snackPrice;
        // End of variables declaration
    }
