/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reservationhotel;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
public class RoomManagement extends javax.swing.JFrame {

    private String Status;
  
    
   
    public RoomManagement() {
        initComponents();
        LoadRoomData();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtxtRoomID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbRoomType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbBed = new javax.swing.JComboBox<>();
        jtxtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room");

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Room No");

        jLabel2.setText("Room Type");

        jcbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Deluxe", "Suite", "Executive" }));

        jLabel3.setText("Bed");

        jcbBed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Queen" }));

        jLabel4.setText("Price");

        btnDelete.setBackground(new java.awt.Color(204, 51, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(102, 255, 153));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jUpdate.setBackground(new java.awt.Color(0, 51, 255));
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnUpdateLayout = new javax.swing.GroupLayout(btnUpdate);
        btnUpdate.setLayout(btnUpdateLayout);
        btnUpdateLayout.setHorizontalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnUpdateLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(btnUpdateLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnUpdateLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jtxtRoomID)
                                    .addComponent(jLabel2)
                                    .addComponent(jcbRoomType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jcbBed, 0, 280, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxtPrice))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(btnUpdateLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(btnInsert)
                                .addGap(18, 18, 18)
                                .addComponent(jUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(45, 45, 45))))))
        );
        btnUpdateLayout.setVerticalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnUpdateLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jcbBed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(btnUpdateLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void LoadRoomData(){
        try{
        Room room = new Room();
       
        List <RoomM> rooms = room.getRooms();
        // Add rows to table
        String [] [] data = new String [rooms.size()][5];
        for (int i = 0; i < rooms.size(); i++){
            data [i][0] = String.valueOf(rooms.get(i).getRoomNo());
            data [i][1] = rooms.get(i).getRoomType();
            data [i][2] = rooms.get(i).getBed();
            data [i][3] = String.valueOf(rooms.get(i).getPrice());
            data [i][4] = rooms.get(i).getStatus();
        }
        String [] columnRoom = {"RoomID","RoomType","Bed","Price","Status"};
        jTable1.setModel(new javax.swing.table.DefaultTableModel(data,columnRoom));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Error loading room data: "+ e.getMessage());
            LoadRoomData();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(RoomManagement.class.getName()).log(Level.SEVERE, null, e.getMessage());
        }
    }
    private void ClearForm(){
        jtxtRoomID.setText("");
        jcbRoomType.setSelectedIndex(0);
        jcbBed.setSelectedIndex(0);
        jtxtPrice.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       
    int RoomNo = Integer.parseInt(jtxtRoomID.getText());
    String RoomType = (String) jcbRoomType.getSelectedItem();
    String Bed = (String) jcbBed.getSelectedItem();
    int Price = Integer.parseInt(jtxtPrice.getText());
    Status = "Available";
     
    RoomM newRoom = new RoomM(RoomNo, RoomType, Bed, Price, Status); 
    try {
    Room room = new Room();
    int res = room.insert(newRoom);

    if (res == 1) {
        JOptionPane.showMessageDialog(this, "Created Successfully");
        this.ClearForm();
        LoadRoomData();
        
    } else {
        JOptionPane.showMessageDialog(this, "Error occurred while creating.");
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());

} catch (ClassNotFoundException ex) {
    Logger.getLogger(RoomManagement.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(this, "Driver not found.");
}
    }//GEN-LAST:event_btnInsertActionPerformed
   
    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
    int RoomNo = Integer.parseInt(jtxtRoomID.getText());
    String RoomType = (String) jcbRoomType.getSelectedItem();
    String Bed = (String) jcbBed.getSelectedItem();
    int Price = Integer.parseInt(jtxtPrice.getText());
    Status = "Available";
     
    RoomM updateRoom = new RoomM(RoomNo,RoomType, Bed, Price,Status); 
    try {
    Room room = new Room();
    int res = room.update(updateRoom);

    if (res == 1) {
        JOptionPane.showMessageDialog(this, "Updated Successfully");
        this.ClearForm();
        LoadRoomData();
        
    } else {
        JOptionPane.showMessageDialog(this, "Error occurred while updating.");
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());

} catch (ClassNotFoundException ex) {
    Logger.getLogger(RoomManagement.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(this, "Driver not found.");
}
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int selectedRow = jTable1.getSelectedRow();
       if(selectedRow != -1){
           
            jtxtRoomID.setText(jTable1.getValueAt(selectedRow, 0).toString());
            jcbRoomType.setSelectedItem(jTable1.getValueAt(selectedRow, 1).toString());
            jcbBed.setSelectedItem(jTable1.getValueAt(selectedRow, 2).toString());
            jtxtPrice.setText(jTable1.getValueAt(selectedRow, 3).toString());
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
       int confirm = JOptionPane.showConfirmDialog(this,"Delete selected room?","Delete Room",JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {

        try {
            int selectedRow = jTable1.getSelectedRow();

            if (selectedRow != -1) {

                // Get RoomNo from JTable column 0
                int RoomNo = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());

                Room room = new Room();
                int result = room.delete(RoomNo);

                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Room deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Error deleting room.");
                }

                this.ClearForm();
                LoadRoomData();

            } else {
                JOptionPane.showMessageDialog(this, "Please select a room to delete.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(RoomManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RoomManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JPanel btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUpdate;
    private javax.swing.JComboBox<String> jcbBed;
    private javax.swing.JComboBox<String> jcbRoomType;
    private javax.swing.JTextField jtxtPrice;
    private javax.swing.JTextField jtxtRoomID;
    // End of variables declaration//GEN-END:variables
}
