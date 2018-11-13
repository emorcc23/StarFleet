/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.design;

import branches.fev2.design.add.AddLogbook;
import branches.fev2.design.add.AddMission;
import branches.fev2.design.add.AddShip;
import branches.fev2.design.add.AddTripulant;
import branches.fev2.design.list.ListLogbook;
import branches.fev2.design.list.ListMission;
import branches.fev2.design.list.ListShip;
import branches.fev2.design.list.ListTripulant;
import branches.fev2.design.remove.RemoveLogbook;
import branches.fev2.design.remove.RemoveMission;
import branches.fev2.design.remove.RemoveShip;
import branches.fev2.design.remove.RemoveTripulant;
import branches.fev2.design.update.UpdateLogbook;
import branches.fev2.design.update.UpdateMission;
import branches.fev2.design.update.UpdateShip;
import branches.fev2.design.update.UpdateTripulant;
import javax.swing.JComboBox;

/**
 *
 * @author Álvaro Santos
 */
public class Main extends javax.swing.JFrame{
      /**
       * Creates new form Principal
       */
      public Main() {
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the form.
       */
      @SuppressWarnings("unchecked")
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            btnAdd = new javax.swing.JButton();
            btnList = new javax.swing.JButton();
            btnUpdate = new javax.swing.JButton();
            btnRemove = new javax.swing.JButton();
            btnExit = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jComboBox1 = new javax.swing.JComboBox<>();
            jLabel2 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("StarfleetV2");

            jPanel1.setLayout(null);

            btnAdd.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnAdd.setText("Add");
            btnAdd.addActionListener(new java.awt.event.ActionListener() {
                  @Override
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                        	btnAddActionPerformed(evt, jComboBox1);
                        } catch (Exception e) {
                        	
                        }
                  }
            });
            jPanel1.add(btnAdd);
            btnAdd.setBounds(10, 670, 250, 26);

            btnList.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnList.setText("List");
            btnList.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                        	btnListActionPerformed(evt, jComboBox1);
                        } catch (Exception e) {
                        	
                        }
                  }
            });
            jPanel1.add(btnList);
            btnList.setBounds(260, 670, 250, 26);

            btnUpdate.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnUpdate.setText("Update");
            btnUpdate.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                        	btnUpdateActionPerformed(evt, jComboBox1);
                        } catch (Exception e) {
                        	
                        }
                  }
            });
            jPanel1.add(btnUpdate);
            btnUpdate.setBounds(510, 670, 260, 26);

            btnRemove.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnRemove.setText("Remove");
            btnRemove.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                        	btnRemoveActionPerformed(evt, jComboBox1);
                        } catch (Exception e) {
                        	
                        }
                  }
            });
            jPanel1.add(btnRemove);
            btnRemove.setBounds(770, 670, 250, 26);

            btnExit.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnExit.setText("Exit");
            btnExit.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnExitActionPerformed(evt);
                  }
            });
            jPanel1.add(btnExit);
            btnExit.setBounds(1020, 670, 250, 26);

            jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(102, 102, 102));
            jLabel3.setText("Álvaro Santos");
            jPanel1.add(jLabel3);
            jLabel3.setBounds(600, 490, 90, 12);

            jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(102, 102, 102));
            jLabel1.setText("Starfleet V2");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(580, 470, 140, 21);

            jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(102, 102, 102));
            jLabel4.setText("Welcome...");
            jPanel1.add(jLabel4);
            jLabel4.setBounds(610, 580, 120, 14);

            jComboBox1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ship", "Tripulant", "Mission", "Logbook" }));
            jPanel1.add(jComboBox1);
            jComboBox1.setBounds(564, 600, 160, 24);

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/background.JPG"))); // NOI18N
            jPanel1.add(jLabel2);
            jLabel2.setBounds(0, -20, 1280, 750);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>                        

      private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
            this.setVisible(false);
            this.dispose();
      }

      private void btnAddActionPerformed(java.awt.event.ActionEvent evt, JComboBox combo) {          
          	String option = (String) combo.getSelectedItem();
          	switch (option) {
			case "Ship":
				AddShip a = new AddShip(this, false);
				a.setVisible(true);
				break;
			case "Tripulant":
				AddTripulant t = new AddTripulant(this,false);
				t.setVisible(true);
				break;
			case "Mission":
				AddMission m = new AddMission(this,false);
				m.setVisible(true);
				break;
			case "Logbook":
				AddLogbook l = new AddLogbook(this,false);
				l.setVisible(true);
			default:
				break;
			}
      }

      private void btnListActionPerformed(java.awt.event.ActionEvent evt, JComboBox combo) {
    	  String option = (String) combo.getSelectedItem();
        	switch (option) {
			case "Ship":
				ListShip a = new ListShip(this, false);
				a.setVisible(true);
				break;
			case "Tripulant":
				ListTripulant t = new ListTripulant(this,false);
				t.setVisible(true);
				break;
			case "Mission":
				ListMission m = new ListMission(this,false);
				m.setVisible(true);
				break;
			case "Logbook":
				ListLogbook l = new ListLogbook(this,false);
				l.setVisible(true);
			default:
				break;
			}
      }

      private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt, JComboBox combo) {
    	  String option = (String) combo.getSelectedItem();
      	switch (option) {
			case "Ship":
				UpdateShip a = new UpdateShip(this, false);
				a.setVisible(true);
				break;
			case "Tripulant":
				UpdateTripulant t = new UpdateTripulant(this,false);
				t.setVisible(true);
				break;
			case "Mission":
				UpdateMission m = new UpdateMission(this,false);
				m.setVisible(true);
				break;
			case "Logbook":
				UpdateLogbook l = new UpdateLogbook(this,false);
				l.setVisible(true);
			default:
				break;
			}
      }

      private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt, JComboBox combo) {
    	  String option = (String) combo.getSelectedItem();
        	switch (option) {
  			case "Ship":
  				RemoveShip a = new RemoveShip(this, false);
  				a.setVisible(true);
  				break;
  			case "Tripulant":
  				RemoveTripulant t = new RemoveTripulant(this,false);
  				t.setVisible(true);
  				break;
  			case "Mission":
  				RemoveMission m = new RemoveMission(this,false);
  				m.setVisible(true);
  				break;
  			case "Logbook":
  				RemoveLogbook l = new RemoveLogbook(this,false);
  				l.setVisible(true);
  			default:
  				break;
  			}
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
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new Main().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify                     
      private javax.swing.JButton btnAdd;
      private javax.swing.JButton btnExit;
      private javax.swing.JButton btnList;
      private javax.swing.JButton btnRemove;
      private javax.swing.JButton btnUpdate;
      private javax.swing.JComboBox<String> jComboBox1;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JPanel jPanel1;
      // End of variables declaration    
}
