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
public class movieUpdate extends javax.swing.JFrame {

    /**
     * Creates new form movieUpdate
     */
    public movieUpdate() {
        initComponents();
    }

    String [] listMovie;
    int id;
    public movieUpdate(int id) {
        initComponents();
        this.id=id;
        int i=0;
        if (getAllItems()!=null){
            listMovie =new String[50];
            for (movieName b: getAllItems()){
                if (i!=50){
                    listMovie[i]=b.toString();
                    i++;
                }
            }
            jList1.setModel(new DefaultComboBoxModel<>(listMovie));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PriceTextField1 = new javax.swing.JTextField();
        LanguageTextField2 = new javax.swing.JTextField();
        NameTextField3 = new javax.swing.JTextField();
        DorationTextField3 = new javax.swing.JTextField();
        ageTextField4 = new javax.swing.JTextField();
        BackB = new javax.swing.JButton();
        addB1 = new javax.swing.JButton();
        DeleteB1 = new javax.swing.JButton();
        time1_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        time2_TextField = new javax.swing.JTextField();
        time3_TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("Update Movie");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Movie Name:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Movie Price:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Movie Language:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Movie doration:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Movie age:");

        BackB.setText("Back");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        addB1.setText("Add");
        addB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addB1ActionPerformed(evt);
            }
        });

        DeleteB1.setText("Delete");
        DeleteB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteB1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Movie Time 1:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Movie Time 2:");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Movie Time 3:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NameTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LanguageTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(time1_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time2_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time3_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DorationTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(DeleteB1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 240, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(addB1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LanguageTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DorationTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(DeleteB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time3_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void addB1ActionPerformed(java.awt.event.ActionEvent evt) {
        String name = NameTextField3.getText();
        String price = PriceTextField1.getText();
        String doration = DorationTextField3.getText();
        String Language = LanguageTextField2.getText();
        String age = ageTextField4.getText();
        String time1= time1_TextField.getText();
        String time2= time2_TextField.getText();
        String time3= time3_TextField.getText();


        if (name.isEmpty() || price.isEmpty() || doration.isEmpty() || Language.isEmpty() || age.isEmpty()|| time1.isEmpty() || time2.isEmpty()|| time3.isEmpty()) {
            JOptionPane.showMessageDialog(this, "should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            name.trim();
            if (price.matches("[0.0-9.0]+")) {
                double price1 =Double.parseDouble(price);
                if (price1>0){
                    if (name.matches("[a-zA-Z_]+")) {
                        Add_movie(name, price1, doration, Language, age,time1,time2,time3);
                        int i = 0;
                        if (getAllItems() != null) {
                            listMovie = new String[50];
                            for (Items b : getAllItems()) {
                                if (i != 50) {
                                    listMovie[i] = b.toString();
                                    i++;
                                }
                            }
                            jList1.setModel(new DefaultComboBoxModel<>(listMovie));
                        }

                    }
                }else {
                    JOptionPane.showMessageDialog(this, "Pleas Enter number greater than zero at price filed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pleas Enter number at price filed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                     

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        employee d= new employee(id);
        d.setTitle("Dash Bord");
        d.setVisible(true);    }                                     

    private void DeleteB1ActionPerformed(java.awt.event.ActionEvent evt) {
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
                        listMovie =new String[50];
                        for (movieName b: getAllItems()){
                            if (i!=50){
                                listMovie[i]=b.toString();
                                i++;
                            }
                        }
                        jList1.setModel(new DefaultComboBoxModel<>(listMovie));
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
            java.util.logging.Logger.getLogger(movieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(movieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(movieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(movieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movieUpdate().setVisible(true);
            }
        });
    }

    public List<movieName> getAllItems(){
        List<movieName> getingItems =null;
        ResultSet resultSet=null;
        DB n= new DB();
        Connection dbconn =n.connectDB();
        PreparedStatement getMovie =null;
        try {
            getMovie = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM movie");
            resultSet= getMovie.executeQuery();
            getingItems =new ArrayList<movieName>();
            while (resultSet.next()){
                getingItems.add(new movieName(resultSet.getInt("movie_id"),
                        resultSet.getString("movie_name"),
                        resultSet.getDouble("movie_price"),
                        resultSet.getString("doration"),
                        resultSet.getString("Language"),
                        resultSet.getString("age")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                dbconn.close();
                getMovie.close();
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
            delete =(PreparedStatement) dbconn.prepareStatement("DELETE FROM movie WHERE (movie_id = ?)");
            delete.setInt(1,index);
            int resultSet=delete.executeUpdate();
            getAllItems();
            if (resultSet!=0) {
                int i=0;
                if (getAllItems()!=null){

                    listMovie =new String[50];
                    for (movieName b: getAllItems()){
                        if (i<=50){
                            listMovie[i]=b.toString();
                            i++;
                        }
                    }
                    jList1.setModel(new DefaultComboBoxModel<>(listMovie));
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

    private void Add_movie(String name, double price1, String doration, String language, String age,String time1,String time2,String time3) {

        DB n= new DB();
        Connection dbconn =n.connectDB();
        int last_id=0;
        String [] times=new String[3];
        times[0]=time1;
        times[1]=time2;
        times[2]=time3;
        try {
            PreparedStatement id_p=(PreparedStatement) dbconn.prepareStatement("SELECT * FROM movie");
            ResultSet resultSet=id_p.executeQuery();

            while (resultSet.next()){
                last_id = resultSet.getInt("movie_id");
            }
            int s=last_id+1;
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("insert into movie(movie_id,movie_name,movie_price,doration,Language,age) values (?,?,?,?,?,?)  ");
            st.setInt(1, s);
            st.setString(2, name);
            st.setDouble(3,price1);
            st.setString(4, doration);
            st.setString(5, language);
            st.setString(6, age);
            int res2 = st.executeUpdate();
            if (res2==1){
                int i=0;
                boolean timeDone=false;
               while ( i<3){
                   timeDone=false;
                   PreparedStatement time = (PreparedStatement) dbconn.prepareStatement("insert into movie_time(movie_id,time) values (?,?) ");
                   time.setInt(1,s);
                   time.setString(2,times[i]);
                   int insetTime=time.executeUpdate();
                   if (insetTime==1){
                       i++;
                       timeDone=true;
                   }
               }
               if(timeDone){
                   getAllItems();
                   JOptionPane.showMessageDialog(this, "movie Added", "done!", JOptionPane.INFORMATION_MESSAGE);
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


    // Variables declaration - do not modify                     
    private javax.swing.JButton BackB;
    private javax.swing.JButton DeleteB1;
    private javax.swing.JTextField DorationTextField3;
    private javax.swing.JTextField LanguageTextField2;
    private javax.swing.JTextField NameTextField3;
    private javax.swing.JTextField PriceTextField1;
    private javax.swing.JButton addB1;
    private javax.swing.JTextField ageTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField time1_TextField;
    private javax.swing.JTextField time2_TextField;
    private javax.swing.JTextField time3_TextField;
    // End of variables declaration                   
}
