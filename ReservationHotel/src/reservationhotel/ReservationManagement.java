
package reservationhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservationManagement extends javax.swing.JFrame {

    /**
     * Creates new form ReservationManagement
     */
    public ReservationManagement() {
        initComponents();
        LoadReservation("");
       
    }
   public void loadReservationsTable() {

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRoomNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jContact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckInDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckOutDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jSearch = new javax.swing.JTextField();
        jS = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPrice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcbPayment = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSubmit = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reservation");

        jLabel1.setText("Room No");

        jRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoomNoActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Payments");

        jLabel7.setText("CheckIn");

        jCheckInDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckInDateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Name", "Contact No.", "Email", "Check In", "Check Out", "Payments", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jS.setText("Search");
        jS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setText("(YYYY-MM-DD)");

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Price");

        jLabel15.setText("Check Out");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel17.setText("(YYYY-MM-DD)");

        jcbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "E-Wallet", "Bank Transper", " ", " " }));
        jcbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaymentActionPerformed(evt);
            }
        });

        jLabel8.setText("Contact");

        jSubmit.setBackground(new java.awt.Color(0, 255, 0));
        jSubmit.setText("Submit");
        jSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitActionPerformed(evt);
            }
        });

        jCancel.setBackground(new java.awt.Color(255, 0, 0));
        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jUpdate1.setBackground(new java.awt.Color(0, 0, 204));
        jUpdate1.setText("Update");
        jUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jContact, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel17))
                        .addComponent(jCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(4, 4, 4)
                            .addComponent(jLabel13))
                        .addComponent(jCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jcbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel11))
                            .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUpdate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCancel)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jS))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel9)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel17)))
                                .addGap(12, 12, 12)
                                .addComponent(jCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(jContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSActionPerformed
       String keywords = jSearch.getText();
       LoadReservation(keywords);
        if (jTable1.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No matching guests found.", "Search", JOptionPane.INFORMATION_MESSAGE);
    }  
    }//GEN-LAST:event_jSActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                                       
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int row = jTable1.getSelectedRow();

    // Fill text fields from selected JTable row
    jRoomNo.setText(model.getValueAt(row, 0).toString());
    jName.setText(model.getValueAt(row, 1).toString());
    jContact.setText(model.getValueAt(row, 2).toString());
    jAddress.setText(model.getValueAt(row, 3).toString());
    jCheckInDate.setText(model.getValueAt(row, 4).toString());
    jCheckOutDate.setText(model.getValueAt(row, 5).toString());

    // Payment combo box
    jcbPayment.setSelectedItem(model.getValueAt(row, 6).toString());

    // Price
    jPrice.setText(model.getValueAt(row, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRoomNoActionPerformed
          
    }//GEN-LAST:event_jRoomNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPaymentActionPerformed
    private void ClearForm(){
        jRoomNo.setText("");
        jName.setText("");
        jContact.setText("");
        jAddress.setText("");
        jcbPayment.setSelectedIndex(0);
        jCheckInDate.setText("");
        jCheckOutDate.setText("");
        jPrice.setText("");
    }
    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed
             try{
                 
        // check if the Filled is have a missing infomation
        if (jRoomNo.getText().trim().isEmpty() ||
        jName.getText().trim().isEmpty() ||
        jContact.getText().trim().isEmpty() ||
        jAddress.getText().trim().isEmpty() ||
        jCheckInDate.getText().trim().isEmpty() ||
        jCheckOutDate.getText().trim().isEmpty() || 
        jcbPayment.getSelectedIndex()==0||
        jPrice.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,"Please fill out all fields before submitting!","",JOptionPane.ERROR_MESSAGE);
        return;   
        }
        
        int RoomNo = Integer.parseInt(jRoomNo.getText());
        String Name = jName.getText();
        String Contact = jContact.getText();
        String Address = jAddress.getText();
        String Payment = (String) jcbPayment.getSelectedItem();
        
        //format for in and out Dates
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date inDate = sdf.parse(jCheckInDate.getText());
        Date outDate = sdf.parse(jCheckOutDate.getText());
        long diffInMillies = outDate.getTime() - inDate.getTime();
        long totalDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS); 
        
        //compute the total days 
        double dailyPrice = Double.parseDouble(jPrice.getText());
        double totalPrice = totalDays * dailyPrice; 
        
        // check if the Contact Numbers is not 11 digits
        if (!Contact.matches("\\d{11}")) { // check if the Contact Numbers is not 11 digits
        JOptionPane.showMessageDialog(this, "Contact number must be exactly 11 digits!","Invalid Contact",JOptionPane.ERROR_MESSAGE);
        return;
        }
         //Insert data in database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/reservation", "root", "");
        PreparedStatement stmt = con.prepareStatement("INSERT INTO reservation_management (`RoomNo`,`Name`,`Contact`,`Address`,`In`,`Out`,`Payment`,`Price`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

        stmt.setInt(1, RoomNo);
        stmt.setString(2, Name);
        stmt.setString(3, Contact);
        stmt.setString(4, Address);
        stmt.setString(5, jCheckInDate.getText());
        stmt.setString(6, jCheckOutDate.getText());
        stmt.setString(7, Payment);
        stmt.setDouble(8, totalPrice);
        stmt.executeUpdate(); 
        
        PreparedStatement updateRoom = con.prepareStatement("UPDATE roommanagement SET Status = 'Occupied' WHERE RoomNo = ?");
        updateRoom.setInt(1, RoomNo);
        updateRoom.executeUpdate();
        JOptionPane.showMessageDialog(this,"Sucessfull Reserve the Room.");
        LoadReservation("");
        ClearForm();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(RoomManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Driver not found.");
    }   catch (ParseException ex) {
            Logger.getLogger(ReservationManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jSubmitActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        //Ask Before Cancel
        int confirm = JOptionPane.showConfirmDialog(this,"Are you sure you want to cancel?","",JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;
        try {
        int roomNo = Integer.parseInt(jRoomNo.getText());

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/reservation", "root", "");

        // Delete Reservation
        PreparedStatement deleteStmt = con.prepareStatement(
            "DELETE FROM reservation_management WHERE `RoomNo`=?"
        );
        deleteStmt.setInt(1, roomNo);
        deleteStmt.executeUpdate();

        // UPDATE ROOM STATUS to Available
        PreparedStatement updateRoom = con.prepareStatement(
            "UPDATE roommanagement SET Status='Available' WHERE RoomNo=?"
        );
        updateRoom.setInt(1, roomNo);
       
        updateRoom.executeUpdate();

        JOptionPane.showMessageDialog(this, "Booking Cancelled. Room is now Available.");

        LoadReservation("");
        ClearForm();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Cancel Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jCancelActionPerformed

    private void jUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdate1ActionPerformed
      try {
        int RoomNo = Integer.parseInt(jRoomNo.getText());
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/reservation", "root", "");
        //Update the Reservation
        PreparedStatement stmt = con.prepareStatement(
            "UPDATE reservation_management SET `Name`=?, `Contact`=?, `Address`=?, `In`=?, `Out`=?, `Payment`=?, `Price`=? WHERE `RoomNo`=?");

        stmt.setString(1, jName.getText());
        stmt.setString(2, jContact.getText());
        stmt.setString(3, jAddress.getText());
        stmt.setString(4, jCheckInDate.getText());
        stmt.setString(5, jCheckOutDate.getText());
        stmt.setString(6, (String) jcbPayment.getSelectedItem());
        stmt.setDouble(7, Double.parseDouble(jPrice.getText()));
        stmt.setInt(8, RoomNo);

        stmt.executeUpdate();

        JOptionPane.showMessageDialog(this, "Reservation Updated Successfully");

        LoadReservation("");
        ClearForm();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Update Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jUpdate1ActionPerformed

    private void jCheckInDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckInDateActionPerformed
        
    }//GEN-LAST:event_jCheckInDateActionPerformed
    public void LoadReservation(String searchText){
        try {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/reservation", "root", "");

        String sql = "SELECT `RoomNo`, `Name`, `Contact`, `Address`, `In`, `Out`, `Payment`, `Price` FROM reservation_management";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        // Clear table first
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Add rows to table
        while (rs.next()) {
            Object[] row = {
                rs.getInt("RoomNo"),
                rs.getString("Name"),
                rs.getString("Contact"),
                rs.getString("Address"),
                rs.getString("In"),
                rs.getString("Out"),
                rs.getString("Payment"),
                rs.getDouble("Price")
            };
            model.addRow(row);
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Table Load Error: " + ex.getMessage());
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
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddress;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCancel;
    private javax.swing.JTextField jCheckInDate;
    private javax.swing.JTextField jCheckOutDate;
    private javax.swing.JTextField jContact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPrice;
    private javax.swing.JTextField jRoomNo;
    private javax.swing.JButton jS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearch;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUpdate1;
    private javax.swing.JComboBox<String> jcbPayment;
    // End of variables declaration//GEN-END:variables

  
}
