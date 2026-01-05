package reservationhotel;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// iText imports (PDF)
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.util.Calendar;

public class ReservationManagement extends javax.swing.JFrame {

    /**
     * Creates new form ReservationManagement
     */
    public ReservationManagement() {
        initComponents();
        LoadReservation("");

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
        jDays = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jSearch = new javax.swing.JTextField();
        jS = new javax.swing.JButton();
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
        jLabel6 = new javax.swing.JLabel();
        jGuestID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(73, 17, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reservation");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room No");

        jRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoomNoActionPerformed(evt);
            }
        });
        jRoomNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRoomNoKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mode of Payment");

        jContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContactActionPerformed(evt);
            }
        });
        jContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jContactKeyReleased(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CheckIn");

        jCheckInDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckInDateActionPerformed(evt);
            }
        });

        jDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDaysKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDaysKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Guest ID", "Name", "Contact", "Address", "Check In", "Days", "Check Out", "Mode of Payment", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(70);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(1).setMinWidth(70);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(4).setMinWidth(150);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(5).setMinWidth(80);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(6).setMinWidth(50);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(7).setMinWidth(80);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(8).setMinWidth(150);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(9).setMinWidth(85);
            jTable1.getColumnModel().getColumn(9).setMaxWidth(85);
        }

        jS.setText("Search");
        jS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Days");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("(YYYY-MM-DD)");

        jcbPayment.setForeground(new java.awt.Color(255, 255, 255));
        jcbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "E-Wallet", "Bank Transper" }));
        jcbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaymentActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Guest ID");

        jGuestID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuestIDActionPerformed(evt);
            }
        });
        jGuestID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jGuestIDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jContact, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(jRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel9)
                                        .addGap(96, 96, 96)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDays, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)
                                            .addComponent(jCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jcbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addGap(223, 223, 223))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                                        .addComponent(jSubmit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(19, 19, 19))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCancel, jSubmit, jUpdate1});

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(jContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDays, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel14)
                                .addGap(12, 12, 12)
                                .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCancel, jSubmit, jUpdate1});

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
    public void generateReceiptPDF(
            int roomNo,
            int guestID,
            String name,
            Date in,
            Date out,
            int days,
            double price,
            String payment
    ) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fileName = "Receipt_Room_" + roomNo + ".pdf";

            // Create PDF document
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            // Fonts
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Font bodyFont = new Font(Font.FontFamily.HELVETICA, 12);
            Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

            // Title
            Paragraph title = new Paragraph("TOUCH EN GO HOTEL\nRECEIPT\n\n", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            // Reservation details
            document.add(new Paragraph("Guest Name: " + name, bodyFont));
            document.add(new Paragraph("Guest ID: " + guestID, bodyFont));
            document.add(new Paragraph("Room No: " + roomNo, bodyFont));
            document.add(new Paragraph("Check-in Date: " + sdf.format(in), bodyFont));
            document.add(new Paragraph("Check-out Date: " + sdf.format(out), bodyFont));
            document.add(new Paragraph("Number of Days: " + days, bodyFont));
            document.add(new Paragraph("Payment Method: " + payment, bodyFont));
            document.add(new Paragraph("Total Price: ₱" + price, boldFont));

            document.add(new Paragraph("\n"));

            // Thank you text
            Paragraph thanks = new Paragraph("Thank you for choosing the Touch en Go Hotel!", boldFont);
            thanks.setAlignment(Element.ALIGN_CENTER);
            document.add(thanks);

            document.close();

            // Open PDF automatically if supported
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File(fileName));
            } else {
                System.out.println("PDF saved as: " + fileName);
            }

        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error generating PDF: " + e.getMessage());
        }
    }

    private void setError(JTextField field) {
        field.setBackground(Color.RED);
    }

    private void clearError(JTextField field) {
        field.setBackground(Color.WHITE);
    }

    private boolean isValidInt(JTextField field) {
        try {
            Integer.valueOf(field.getText().trim());
            clearError(field);
            return true;
        } catch (NumberFormatException e) {
            setError(field);
            return false;
        }
    }

    private boolean isValidDate(JTextField field) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            sdf.parse(field.getText().trim());
            clearError(field);
            return true;
        } catch (Exception e) {
            setError(field);
            return false;
        }
    }

    private boolean validateForm() {
        boolean valid = true;

        valid &= isValidInt(jRoomNo);
        valid &= isValidInt(jGuestID);
        valid &= isValidInt(jDays);
        valid &= isValidDate(jCheckInDate);

        if (!jContact.getText().matches("0\\d{10}")) {
            setError(jContact);
            valid = false;
        } else {
            clearError(jContact);
        }
        return valid;
    }

    private Date calculateCheckout(Date in, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(in);
        cal.add(Calendar.DAY_OF_MONTH, days);
        return cal.getTime();
    }

    private void ClearForm() {
        for (JTextField f : new JTextField[]{jRoomNo, jGuestID, jName, jContact, jAddress, jCheckInDate, jDays, jPrice}) {
            f.setText("");
            clearError(f);
        }
        jcbPayment.setSelectedIndex(0);
    }

    private void calculateTotalPrice() {
        if (roomDailyPrice <= 0) {
            jPrice.setText("");
            return;
        }

        try {
            int days = Integer.parseInt(jDays.getText().trim());
            if (days <= 0) {
                setError(jDays);
                jPrice.setText("");
                return;
            }
            clearError(jDays);
            double total = roomDailyPrice * days;
            jPrice.setText(String.valueOf(total));

        } catch (NumberFormatException e) {

            jPrice.setText("");
        }

    }
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

        if (row != -1) {
            jRoomNo.setText(model.getValueAt(row, 0).toString());
            jGuestID.setText(model.getValueAt(row, 1).toString());
            jName.setText(model.getValueAt(row, 2).toString());
            jContact.setText(model.getValueAt(row, 3).toString());
            jAddress.setText(model.getValueAt(row, 4).toString());
            jCheckInDate.setText(model.getValueAt(row, 5).toString());
            jDays.setText(model.getValueAt(row, 6).toString());

            jcbPayment.setSelectedItem(model.getValueAt(row, 8).toString());

            jPrice.setText(model.getValueAt(row, 9).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRoomNoActionPerformed

    }//GEN-LAST:event_jRoomNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPaymentActionPerformed

    private Date calculateCheckoutDate(Date checkInDate, int daysStayed) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(checkInDate);
        cal.add(Calendar.DAY_OF_MONTH, daysStayed);
        return cal.getTime();
    }
    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed

        if (!validateForm()) {
            JOptionPane.showMessageDialog(this, "Fill highlighted fields.");
            return;
        }
        try (Connection con = DbConnection.getConnection()) {

            int roomNo = Integer.parseInt(jRoomNo.getText());
            int guestID = Integer.parseInt(jGuestID.getText());
            int days = Integer.parseInt(jDays.getText());
            double price = Double.parseDouble(jPrice.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date in = sdf.parse(jCheckInDate.getText());
            Date out = calculateCheckout(in, days);

            PreparedStatement chk = con.prepareStatement("SELECT 1 FROM reservation " + "WHERE RoomNo = ? " + "AND ? < `Out` " + "AND ? > `IN`");
            chk.setInt(1, roomNo);
            chk.setDate(2, new java.sql.Date(in.getTime()));
            chk.setDate(3, new java.sql.Date(out.getTime()));

            ResultSet rs = chk.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Room already occupied for the selected dates!");
                return;
            }

            //INSERT RESERVATION
            PreparedStatement ps = con.prepareStatement( "INSERT INTO reservation (RoomNo, GuestID, Name, Contact, Address, `IN`, Days, `Out`, Payment, Price) VALUES (?,?,?,?,?,?,?,?,?,?)");

            ps.setInt(1, roomNo);
            ps.setInt(2, guestID);
            ps.setString(3, jName.getText());
            ps.setString(4, jContact.getText());
            ps.setString(5, jAddress.getText());
            ps.setDate(6, new java.sql.Date(in.getTime()));
            ps.setInt(7, days);
            ps.setDate(8, new java.sql.Date(out.getTime()));
            ps.setString(9, jcbPayment.getSelectedItem().toString());
            ps.setDouble(10, price);

            ps.executeUpdate();

            // GENERATE & OPEN PDF RECEIPT
            generateReceiptPDF(
                    roomNo,
                    guestID,
                    jName.getText(),
                    in,
                    out,
                    days,
                    price,
                    jcbPayment.getSelectedItem().toString()
            );

            JOptionPane.showMessageDialog(this, "Reservation Saved!");
            ClearForm();
            LoadReservation("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Submit Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jSubmitActionPerformed
    public void LoadReservation(String search) {
        try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement("SELECT * FROM reservation WHERE Name LIKE ? OR Contact LIKE ?")) {

            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            m.setRowCount(0);

            while (rs.next()) {
                m.addRow(new Object[]{
                    rs.getInt("RoomNo"), rs.getInt("GuestID"),
                    rs.getString("Name"), rs.getString("Contact"),
                    rs.getString("Address"), rs.getString("In"),
                    rs.getInt("Days"), rs.getString("Out"),
                    rs.getString("Payment"), rs.getDouble("Price")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Load Error: " + e.getMessage());
        }
    }
    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Cancel reservation?", "", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
            return;
        }

        try (Connection con = DbConnection.getConnection()) {
            int roomNo = Integer.parseInt(jRoomNo.getText());

            con.prepareStatement("DELETE FROM reservation WHERE RoomNo=" + roomNo).executeUpdate();

            con.prepareStatement("UPDATE roommanagement SET Status='Available' WHERE RoomNo=" + roomNo).executeUpdate();

            JOptionPane.showMessageDialog(this, "Succefully cancelled, Room is Available now!");
            ClearForm();
            LoadReservation("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cancel Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jCancelActionPerformed

    private void jUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdate1ActionPerformed
        if (!validateForm()) {
            JOptionPane.showMessageDialog(this, "Fix highlighted fields first.");
            return;
        }
        try (Connection con = DbConnection.getConnection()) {

            int roomNo = Integer.parseInt(jRoomNo.getText().trim());
            int guestID = Integer.parseInt(jGuestID.getText().trim());
            int days = Integer.parseInt(jDays.getText().trim());

            String name = jName.getText().trim();
            String contact = jContact.getText().trim();
            String address = jAddress.getText().trim();
            String payment = jcbPayment.getSelectedItem().toString();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date checkIn = sdf.parse(jCheckInDate.getText().trim());
            Date checkOut = calculateCheckout(checkIn, days);

            // USE TOTAL PRICE DIRECTLY
            double totalPrice = Double.parseDouble(jPrice.getText().trim());

            String sql = "UPDATE reservation SET Name=?, Contact=?, Address=?, `In`=?, Days=?, `Out`=?, Payment=?, Price=? WHERE RoomNo=? AND GuestID=?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setString(2, contact);
                ps.setString(3, address);
                ps.setString(4, sdf.format(checkIn));
                ps.setInt(5, days);
                ps.setString(6, sdf.format(checkOut));
                ps.setString(7, payment);
                ps.setDouble(8, totalPrice);
                ps.setInt(9, roomNo);
                ps.setInt(10, guestID);

                int updated = ps.executeUpdate();

                if (updated > 0) {
                    JOptionPane.showMessageDialog(this, "Reservation updated successfully!");
                    ClearForm();
                    LoadReservation("");
                } else {
                    JOptionPane.showMessageDialog(this, "Reservation not found.");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Numeric values are invalid.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Update Error: " + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_jUpdate1ActionPerformed

    private void jCheckInDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckInDateActionPerformed

    }//GEN-LAST:event_jCheckInDateActionPerformed

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed

    }//GEN-LAST:event_jNameActionPerformed

    private void jGuestIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuestIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGuestIDActionPerformed

    private void jGuestIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jGuestIDKeyReleased
        String guestID = jGuestID.getText().trim();
        if (guestID.isEmpty()) {
            jName.setText("");
            jContact.setText("");
            jAddress.setText("");
            return;

        }

        try {
            Connection con = DbConnection.getConnection();
            String sql = "SELECT Fname, Mname, Lname, Suffix, Contact, Address FROM guest WHERE GuestID = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(guestID));
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fname = rs.getString("Fname");
                String mname = rs.getString("Mname");
                String lname = rs.getString("Lname");
                String suffix = rs.getString("Suffix");
                String contact = rs.getString("Contact");
                String address = rs.getString("Address");

                // Merge name parts neatly
                StringBuilder fullName = new StringBuilder();
                fullName.append(fname);
                if (mname != null && !mname.isEmpty()) {
                    fullName.append(" ").append(mname);
                }
                fullName.append(" ").append(lname);
                if (suffix != null && !suffix.isEmpty()) {
                    fullName.append(" ").append(suffix);
                }
                jName.setText(fullName.toString());
                jContact.setText(contact != null ? contact : "");
                jAddress.setText(address != null ? address : "");

            } else {
                jName.setText("Guest not found");
                jContact.setText("Contact not found");
                jAddress.setText("Address not found");
            }

        } catch (NumberFormatException nfe) {
            jName.setText("Invalid GuestID");
            jContact.setText("Invalid GuestID");
            jAddress.setText("Invalid GuestID");
        } catch (Exception ex) {
            jName.setText("Error: " + ex.getMessage());
            jContact.setText("Error: " + ex.getMessage());
            jAddress.setText("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jGuestIDKeyReleased

    private void jContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContactKeyReleased

    }//GEN-LAST:event_jContactKeyReleased

    private void jContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContactActionPerformed

    }//GEN-LAST:event_jContactActionPerformed
    private double roomDailyPrice = 0.0;
    private void jRoomNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRoomNoKeyReleased
        if (jRoomNo.getText().trim().isEmpty()) {
            return;
        }

        try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement("SELECT Price FROM roommanagement WHERE RoomNo=?")) {

            ps.setInt(1, Integer.parseInt(jRoomNo.getText().trim()));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                roomDailyPrice = rs.getDouble("Price"); // ✅ DAILY PRICE
                clearError(jRoomNo);
                calculateTotalPrice();
            } else {
                roomDailyPrice = 0;
                setError(jRoomNo);
                jPrice.setText("");
            }

        } catch (Exception e) {
            roomDailyPrice = 0;
            setError(jRoomNo);
        }
    }//GEN-LAST:event_jRoomNoKeyReleased

    private void jDaysKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDaysKeyReleased
        calculateTotalPrice();
    }//GEN-LAST:event_jDaysKeyReleased

    private void jDaysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDaysKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jDaysKeyTyped

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
    private javax.swing.JTextField jContact;
    private javax.swing.JTextField jDays;
    private javax.swing.JTextField jGuestID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
