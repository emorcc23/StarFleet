/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.design.add;

import branches.fev2.dao.DaoLogbook;
import branches.fev2.files.Logbook;
import branches.fev2.files.Ship;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Álvaro Santos
 */
public class AddLogbook extends javax.swing.JDialog {
      
      /**
       * Creates new form AddLogbook
       */
      public AddLogbook(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
            try {
                  int lastId = DaoLogbook.getInstance().extractLastId();
                  txtIdLogbook.setText(String.valueOf(lastId));
                  ArrayList<Ship> listIdShip = DaoLogbook.getInstance().extractIdShip();
                  comboIdShip.removeAllItems();
                  for (int i = 0; i < listIdShip.size(); i++) {
                        String ids = Integer.toString(listIdShip.get(i).getId_ship());
                        comboIdShip.addItem(ids);
                  }
            } catch (SQLException e) {
                  System.out.println("Error Last Id");
                  System.out.println(e);
            }
      }

      /**
       * This method is called from within the constructor to initialize the form.
       */
      @SuppressWarnings("unchecked")                        
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            txtIdLogbook = new javax.swing.JTextField();
            txtDate = new javax.swing.JTextField();
            comboIdShip = new javax.swing.JComboBox<>();
            txtDescription = new javax.swing.JTextField();
            txtAudio = new javax.swing.JTextField();
            btnAddLogbook = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            jPanel1.setLayout(null);

            jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Add a logbook");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(110, 80, 150, 21);

            jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("ID of the logbook");
            jPanel1.add(jLabel3);
            jLabel3.setBounds(130, 150, 121, 14);

            jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("ID of the ship");
            jPanel1.add(jLabel4);
            jLabel4.setBounds(140, 200, 90, 14);

            jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Date");
            jPanel1.add(jLabel5);
            jLabel5.setBounds(170, 250, 32, 14);

            jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setText("Description");
            jPanel1.add(jLabel6);
            jLabel6.setBounds(150, 300, 81, 14);

            jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setText("Audio");
            jPanel1.add(jLabel7);
            jLabel7.setBounds(170, 350, 39, 14);

            txtIdLogbook.setEditable(false);
            txtIdLogbook.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtIdLogbook);
            txtIdLogbook.setBounds(30, 170, 310, 26);

            txtDate.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtDate);
            txtDate.setBounds(31, 270, 310, 26);

            comboIdShip.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(comboIdShip);
            comboIdShip.setBounds(30, 220, 310, 24);

            txtDescription.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtDescription);
            txtDescription.setBounds(31, 320, 310, 26);

            txtAudio.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtAudio);
            txtAudio.setBounds(31, 370, 310, 26);

            btnAddLogbook.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnAddLogbook.setText("Add");
            btnAddLogbook.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnAddLogbookActionPerformed(evt);
                  }
            });
            jPanel1.add(btnAddLogbook);
            btnAddLogbook.setBounds(33, 480, 300, 26);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/AddLogbook.JPG"))); // NOI18N
            jPanel1.add(jLabel1);
            jLabel1.setBounds(0, 0, 370, 560);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>                        

      private void btnAddLogbookActionPerformed(java.awt.event.ActionEvent evt) {                                              
            try {
                  int idShip = Integer.parseInt(comboIdShip.getSelectedItem().toString());
                  String date = txtDate.getText();
                  String description = txtDescription.getText();
                  String audio = txtAudio.getText();
                  Logbook logbook = new Logbook(idShip, date, description, audio);
                  DaoLogbook.getInstance().insert(logbook);
                  System.out.println("Add successfully");
                  JOptionPane.showMessageDialog(null, "Added successfully");
            } catch (Exception e) {
                  System.out.println(e);
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
                  java.util.logging.Logger.getLogger(AddLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(AddLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(AddLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(AddLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        AddLogbook dialog = new AddLogbook(new javax.swing.JFrame(), true);
                        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                              @Override
                              public void windowClosing(java.awt.event.WindowEvent e) {
                                    System.exit(0);
                              }
                        });
                        dialog.setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify                     
      private javax.swing.JButton btnAddLogbook;
      private javax.swing.JComboBox<String> comboIdShip;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JTextField txtAudio;
      private javax.swing.JTextField txtDate;
      private javax.swing.JTextField txtDescription;
      private javax.swing.JTextField txtIdLogbook;
      // End of variables declaration     
}
