/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.design.list;

import branches.fev2.methods.Methods;
import java.sql.SQLException;

/**
 *
 * @author Álvaro Santos
 */
public class ListLogbook extends javax.swing.JDialog {

      /**
       * Creates new form ListShip
       */
      public ListLogbook(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
            try {
                  Methods.getInstance().designTables(tableListLogbooks, jScrollPane1);
            } catch (SQLException e) {

            }
      }

      /**
       * This method is called from within the constructor to initialize the form. 
       */
      @SuppressWarnings("unchecked")
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tableListLogbooks = new javax.swing.JTable();
            jLabel4 = new javax.swing.JLabel();
            btnExit = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            jPanel1.setLayout(null);

            jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("List all logbooks");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(360, 50, 180, 21);

            tableListLogbooks.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            tableListLogbooks.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                  },
                  new String [] {
                        "ID of the logbook", "ID of the ship", "Date", "Description", "Audio"
                  }
            ) {
                  Class[] types = new Class [] {
                        java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                  };
                  boolean[] canEdit = new boolean [] {
                        false, true, true, true, true
                  };

                  public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jScrollPane1.setViewportView(tableListLogbooks);
            if (tableListLogbooks.getColumnModel().getColumnCount() > 0) {
                  tableListLogbooks.getColumnModel().getColumn(0).setResizable(false);
                  tableListLogbooks.getColumnModel().getColumn(1).setResizable(false);
                  tableListLogbooks.getColumnModel().getColumn(2).setResizable(false);
                  tableListLogbooks.getColumnModel().getColumn(3).setResizable(false);
                  tableListLogbooks.getColumnModel().getColumn(4).setResizable(false);
            }

            jPanel1.add(jScrollPane1);
            jScrollPane1.setBounds(100, 110, 710, 340);

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/ListShip1.JPG"))); // NOI18N
            jPanel1.add(jLabel4);
            jLabel4.setBounds(-20, 0, 330, 270);

            btnExit.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnExit.setText("Exit");
            btnExit.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnExitActionPerformed(evt);
                  }
            });
            jPanel1.add(btnExit);
            btnExit.setBounds(300, 490, 300, 26);

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/ListShip1.JPG"))); // NOI18N
            jPanel1.add(jLabel3);
            jLabel3.setBounds(600, 270, 330, 270);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/ListShip.JPG"))); // NOI18N
            jPanel1.add(jLabel1);
            jLabel1.setBounds(-190, 0, 1100, 550);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>                        

      private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
            this.setVisible(false);
            this.dispose();
      }                                       

      /**
       * @param args the command line arguments
       */
      public static void main(String args[]) {
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(ListLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(ListLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(ListLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(ListLogbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        ListLogbook dialog = new ListLogbook(new javax.swing.JFrame(), true);
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
      private javax.swing.JButton btnExit;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTable tableListLogbooks;
      // End of variables declaration          
}
