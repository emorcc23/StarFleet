/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.design.add;

import branches.fev2.files.Ship;
import java.sql.SQLException;

/**
 *
 * @author Álvaro Santos
 */
public class AddShip extends javax.swing.JDialog {

      /**
       * Creates new form addShip
       */
      public AddShip(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
            try {
                  int lastId = Ship.getInstance().extractLastId();
                  txtIdShip.setText(String.valueOf(lastId));
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
            jLabel3 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            txtIdShip = new javax.swing.JTextField();
            txtCaptain = new javax.swing.JTextField();
            txtName = new javax.swing.JTextField();
            txtRegister = new javax.swing.JTextField();
            txtType = new javax.swing.JTextField();
            txtImage = new javax.swing.JTextField();
            btnAddShip = new javax.swing.JButton();
            jLabel9 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("FlotaEstelar");

            jPanel1.setLayout(null);

            jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("Captain");
            jPanel1.add(jLabel3);
            jLabel3.setBounds(160, 190, 70, 14);

            jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Add a ship");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(140, 70, 110, 21);

            jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("ID of the ship");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(150, 140, 90, 16);

            jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Name");
            jPanel1.add(jLabel4);
            jLabel4.setBounds(170, 240, 35, 14);

            jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Register");
            jPanel1.add(jLabel5);
            jLabel5.setBounds(160, 290, 60, 14);

            jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setText("Type");
            jPanel1.add(jLabel6);
            jLabel6.setBounds(170, 340, 31, 14);

            jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setText("Image");
            jPanel1.add(jLabel7);
            jLabel7.setBounds(170, 390, 38, 14);

            txtIdShip.setEditable(false);
            txtIdShip.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            txtIdShip.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            jPanel1.add(txtIdShip);
            txtIdShip.setBounds(40, 160, 290, 26);

            txtCaptain.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            txtCaptain.setToolTipText("");
            jPanel1.add(txtCaptain);
            txtCaptain.setBounds(40, 210, 290, 26);

            txtName.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            txtName.setToolTipText("");
            jPanel1.add(txtName);
            txtName.setBounds(40, 260, 290, 26);

            txtRegister.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            txtRegister.setToolTipText("");
            jPanel1.add(txtRegister);
            txtRegister.setBounds(40, 310, 290, 26);

            txtType.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            txtType.setToolTipText("");
            jPanel1.add(txtType);
            txtType.setBounds(40, 360, 290, 26);

            txtImage.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            txtImage.setToolTipText("");
            jPanel1.add(txtImage);
            txtImage.setBounds(40, 410, 290, 26);

            btnAddShip.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnAddShip.setText("Add");
            btnAddShip.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnAddShipActionPerformed(evt);
                  }
            });
            jPanel1.add(btnAddShip);
            btnAddShip.setBounds(43, 490, 290, 26);

            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/AddShip.JPG"))); // NOI18N
            jPanel1.add(jLabel9);
            jLabel9.setBounds(0, 0, 370, 560);

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

      private void btnAddShipActionPerformed(java.awt.event.ActionEvent evt) {
            try {

                  String captain = txtCaptain.getText();
                  String name = txtName.getText();
                  String register = txtRegister.getText();
                  String type = txtType.getText();
                  String image = txtImage.getText();

                  Ship ship = new Ship(captain, name, register, type, image);
                  ship.insert();
                  System.out.println("Added Successfully");
            } catch (Exception e) {
                  System.out.println("Hasn`t registeres succesfully");
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
                  java.util.logging.Logger.getLogger(AddShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(AddShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(AddShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(AddShip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        AddShip dialog = new AddShip(new javax.swing.JFrame(), true);
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
      private javax.swing.JButton btnAddShip;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JTextField txtCaptain;
      private javax.swing.JTextField txtIdShip;
      private javax.swing.JTextField txtImage;
      private javax.swing.JTextField txtName;
      private javax.swing.JTextField txtRegister;
      private javax.swing.JTextField txtType;
      // End of variables declaration      
}
