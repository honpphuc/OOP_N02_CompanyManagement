
package main;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

import company.*;
import java.util.ArrayList;


/**
 *
 * @author PHUC
 */
public class MainFrame extends javax.swing.JFrame {
    

    
    DefaultTableModel dtmNV, dtmCV; //Giúp lưu dữ liệu trong bảng Nhân Viên
    int row, index;
    List <NhanSu> dsNhanVien;
    List <CongViec> dsCongViec;
    private QuanLy quanLy;
    
    public MainFrame() {
        quanLy = new QuanLy();
        setLocationRelativeTo(null);
        initComponents();
        dtmNV = new DefaultTableModel();
        dtmCV = new DefaultTableModel();
        dsNhanVien = new ArrayList<>();
        dsCongViec = new ArrayList<>();
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maNVField = new javax.swing.JTextField();
        tenNVField = new javax.swing.JTextField();
        namSinhField = new javax.swing.JTextField();
        namRadioButton = new javax.swing.JRadioButton();
        nuRadioButton = new javax.swing.JRadioButton();
        phongComboBox = new javax.swing.JComboBox<>();
        themNVButton = new javax.swing.JButton();
        suaNVButton = new javax.swing.JButton();
        xoaNVButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NVTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        maCVField = new javax.swing.JTextField();
        tenCVField = new javax.swing.JTextField();
        gioCVField = new javax.swing.JTextField();
        maNVPhuTrachField = new javax.swing.JTextField();
        themCVButton = new javax.swing.JButton();
        suaCVButton = new javax.swing.JButton();
        xoaCVButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CVTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã Nhân Viên:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên Nhân Viên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Năm Sinh:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giới Tính:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Phòng Ban:");

        buttonGroup1.add(namRadioButton);
        namRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namRadioButton.setText("Nam");

        buttonGroup1.add(nuRadioButton);
        nuRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nuRadioButton.setText("Nữ");
        nuRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuRadioButtonActionPerformed(evt);
            }
        });

        phongComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giám Đốc", "Kế Hoạch", "Kế Toán", "Nhân Sự" }));

        themNVButton.setText("Thêm");
        themNVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themNVButtonActionPerformed(evt);
            }
        });

        suaNVButton.setText("Sửa");
        suaNVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaNVButtonActionPerformed(evt);
            }
        });

        xoaNVButton.setText("Xóa");
        xoaNVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaNVButtonActionPerformed(evt);
            }
        });

        NVTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Năm Sinh", "Giới Tính", "Phòng Ban"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NVTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NVTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NVTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(namRadioButton)
                        .addGap(52, 52, 52)
                        .addComponent(nuRadioButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(444, 444, 444))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(themNVButton))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(maNVField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(namSinhField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tenNVField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(phongComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(199, 199, 199))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(suaNVButton)
                                            .addGap(63, 63, 63)
                                            .addComponent(xoaNVButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(maNVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tenNVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namSinhField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namRadioButton)
                            .addComponent(nuRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(phongComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(xoaNVButton)
                            .addComponent(suaNVButton)
                            .addComponent(themNVButton))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nhân Viên", jPanel1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mã Công Việc:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tên Công Việc:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Số Giờ Làm Việc:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mã NV Phụ Trách:");

        themCVButton.setText("Thêm");
        themCVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themCVButtonActionPerformed(evt);
            }
        });

        suaCVButton.setText("Sửa");
        suaCVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaCVButtonActionPerformed(evt);
            }
        });

        xoaCVButton.setText("Xóa");
        xoaCVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaCVButtonActionPerformed(evt);
            }
        });

        CVTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CV", "Tên CV", "Số Giờ Làm", "Mã NV Phụ Trách"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CVTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CVTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CVTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(themCVButton))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(maCVField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(tenCVField)
                            .addComponent(gioCVField)
                            .addComponent(maNVPhuTrachField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(suaCVButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(xoaCVButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(maCVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tenCVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(gioCVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(maNVPhuTrachField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(themCVButton)
                            .addComponent(suaCVButton)
                            .addComponent(xoaCVButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Công Việc", jPanel2);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mã Nhân Viên hoặc Mã Công Việc cần tìm kiếm");

        jPanel5.setBackground(new java.awt.Color(204, 255, 153));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        searchLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchLabel.setText("Thông tin cần tìm kiếm sẽ hiển thị ở đây");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setText("Tìm Kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchField))
                        .addGap(74, 74, 74)
                        .addComponent(searchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Tìm Kiếm", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void nuRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuRadioButtonActionPerformed

    private void suaNVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaNVButtonActionPerformed
        String maNV = maNVField.getText();
        String tenNV = tenNVField.getText();
        int namSinh = Integer.parseInt(namSinhField.getText());
        String gioiTinh = "";
        if(namRadioButton.isSelected()){
            gioiTinh = "Nam";
        }else{
            gioiTinh = "Nữ";
        }
        String phongBan = phongComboBox.getSelectedItem().toString();
        
        if(maNV.equals("") || tenNV.equals("") || gioiTinh.equals("") || phongBan.equals("")){
            JOptionPane.showMessageDialog(phongComboBox, "Dữ liệu không được bỏ trống!");
        } else{
            //Cập nhật dữ liệu trong bảng
            dtmNV.setValueAt(maNVField.getText(), row, 0);
            dtmNV.setValueAt(tenNVField.getText(), row, 1);
            dtmNV.setValueAt(Integer.valueOf(namSinhField.getText()), row, 2);
            dtmNV.setValueAt(gioiTinh, row, 3);
            dtmNV.setValueAt(phongComboBox.getSelectedItem(), row, 4);
            NVTable.setModel(dtmNV);
            
            //Cập nhật dữ liệu trong List Nhân Viên
            for (int i = 0; i < dsNhanVien.size(); i++){
                NhanSu nv = dsNhanVien.get(index); //Lấy ra vị trí
                if(nv.getIdNhanVien().equals(maNV)){
                    //Thay đổi dữ liệu
                    nv.setIdNhanVien(maNV);
                    nv.setTenNhanVien(tenNV);
                    nv.setNamSinh(namSinh);
                    nv.setGioiTinh(gioiTinh);
                    nv.setPhongBan(phongBan);
                    break;
                }
            }
            JOptionPane.showMessageDialog(this, "Thay đổi thông tin nhân viên thành công!");
            clearDataNV();
            themNVButton.setEnabled(true);
        }
    }//GEN-LAST:event_suaNVButtonActionPerformed

    private void suaCVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaCVButtonActionPerformed
        String maCV = maCVField.getText();
        String tenCV = tenCVField.getText();
        String soGioLamStr = gioCVField.getText();
        String maNV = maNVPhuTrachField.getText();
        
        if (maCV.equals("") || tenCV.equals("") || soGioLamStr.equals("") || maNV.equals("")){
                JOptionPane.showMessageDialog(maNVPhuTrachField, "Không được để trống dữ liệu!");  
                return;
            }else{

            float soGioLam;
            try {
                soGioLam = Float.parseFloat(soGioLamStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(gioCVField, "Số giờ làm phải là số!");
                return;
            }

            //Kiểm tra nhân viên
        boolean check = false;
        for(NhanSu nv : dsNhanVien){
            if(nv.getIdNhanVien().equals(maNV)){
                    
                //Cập nhật dữ liệu vào bảng Công việc
                dtmCV.setValueAt(maCV, row, 0);
                dtmCV.setValueAt(tenCV, row, 1);
                dtmCV.setValueAt(soGioLamStr, row, 2);
                dtmCV.setValueAt(maNV, row, 3);
                CVTable.setModel(dtmCV);

                //Thêm dữ liệu vào List Công việc
                for(CongViec cv : dsCongViec){
                    if(cv.getMaCV().equals(maCV)){
                        cv.setMaCV(maCV);
                        cv.setTenCV(tenCV);
                        cv.setSoGioLam(soGioLam);
                        cv.setMaNV(maNV);
                    }
                }
                //nv.setLuong(nv.tinhLuong());
                check = true;
                break;
            }
        }

        if (check) {
        JOptionPane.showMessageDialog(this, "Thay đổi thông tin công việc thành công!");
        clearDataCV();
        themCVButton.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(maNVPhuTrachField, "Mã nhân viên phải trùng với mã nhân viên đã nhập vào!");
            maNVPhuTrachField.setText("");
        }
    }
}//GEN-LAST:event_suaCVButtonActionPerformed

    private void themNVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themNVButtonActionPerformed
        String maNV = maNVField.getText();
        String tenNV = tenNVField.getText();
        String namSinhStr = namSinhField.getText();
        String gioiTinh = "";
        if(namRadioButton.isSelected()){
            gioiTinh = "Nam";
        }else{
            gioiTinh = "Nữ";
        }
        String phongBan = phongComboBox.getSelectedItem().toString();
        
        if(maNV.equals("") || tenNV.equals("") || gioiTinh.equals("") || phongBan.equals("")){
            JOptionPane.showMessageDialog(phongComboBox, "Dữ liệu không được bỏ trống!");
            return;
        }

        int namSinh;
        try {
            namSinh = Integer.parseInt(namSinhStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(namSinhField, "Năm sinh phải là số!");
            return;
        }

        //Thêm thông tin vào bảng NVTable
        dtmNV = (DefaultTableModel) NVTable.getModel();
        dtmNV.addRow(new Object[] {maNV, tenNV, namSinhStr, gioiTinh, phongBan}); //Thêm dữ liệu vào bảng
        NVTable.setModel(dtmNV);
            
        //Thêm Nhân viên vào List dsNhanVien
        NhanSu nhanSu = new NhanSu(maNV, tenNV, namSinh, gioiTinh, phongBan);
        dsNhanVien.add(nhanSu);
        quanLy.themNhanSu(nhanSu);

        JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
        clearDataNV();
    }
//GEN-LAST:event_themNVButtonActionPerformed

    //Lấy dữ liệu khi nhấp chuột vào dòng dữ liệu
    private void NVTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NVTableMouseClicked
        dtmNV = (DefaultTableModel) NVTable.getModel();
        row = NVTable.getSelectedRow();
        maNVField.setText((String) NVTable.getValueAt(row, 0));
        tenNVField.setText((String) NVTable.getValueAt(row, 1));
        namSinhField.setText("" + NVTable.getValueAt(row, 2));
        String gioiTinh = (String) NVTable.getValueAt(row, 3);
        if (gioiTinh.equals("Nam")){
            namRadioButton.setSelected(true);
        }else{
            nuRadioButton.setSelected(true);
        }
        phongComboBox.setSelectedItem(NVTable.getValueAt(row, 4));
        
        themNVButton.setEnabled(false);
    }//GEN-LAST:event_NVTableMouseClicked

    //Xóa thông tin Nhân Viên
    private void xoaNVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaNVButtonActionPerformed
        //Xóa thông tin từ bảng NV
        dtmNV.removeRow(row);
        //Xóa nhân viên trong List
        String maNV = maNVField.getText();
        for(NhanSu nv : dsNhanVien){
            if(nv.getIdNhanVien().equals(maNV)){
                dsNhanVien.remove(nv);
                JOptionPane.showMessageDialog(phongComboBox, "Xóa nhân viên thành công");
                break;
            }
        }
        clearDataNV();
        themNVButton.setEnabled(true);
    }//GEN-LAST:event_xoaNVButtonActionPerformed

    //Làm trống ô nhập thông tin tab Nhân viên
    public void clearDataNV(){
        maNVField.setText("");
        tenNVField.setText("");
        namSinhField.setText("");
        buttonGroup1.clearSelection();
    }
    
    //Thêm công việc
    private void themCVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themCVButtonActionPerformed
        String maCV = maCVField.getText();
        String tenCV = tenCVField.getText();
        String soGioLamStr = gioCVField.getText();
        String maNV = maNVPhuTrachField.getText();
        
    if (maCV.equals("") || tenCV.equals("") || soGioLamStr.equals("") || maNV.equals("")){
            JOptionPane.showMessageDialog(maNVPhuTrachField, "Mã nhân viên phụ trách phải trùng mới mã nhân viên đã nhập vào!");  
        }
    float soGioLam;
    try {
        soGioLam = Float.parseFloat(soGioLamStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(gioCVField, "Số giờ làm phải là số!");
        return;
    }

    //Kiểm tra nhân viên
    boolean check = false;
        
    for(NhanSu nv : dsNhanVien){
        if(nv.getIdNhanVien().equals(maNV)){
                    
        //Thêm dữ liệu vào bảng Công việc
        dtmCV = (DefaultTableModel) CVTable.getModel();
        dtmCV.addRow(new Object[] {maCV, tenCV, soGioLamStr, maNV} );
        CVTable.setModel(dtmCV);
                
        //Thêm dữ liệu vào List Công việc
        CongViec cv = new CongViec(maCV, tenCV, soGioLam, maNV);
        dsCongViec.add(cv);
        quanLy.themCongViec(cv);   
        nv.getDsCongViec().add(cv); //Thêm công việc vào danh sách công việc của nhân viên
        nv.setLuong(nv.tinhLuong());
        check = true;
        break;
        }
    }
    if(check){
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
            clearDataCV();
    }else{
        JOptionPane.showMessageDialog(maNVPhuTrachField,"Mã nhân viên phải trùng với mã nhân viên đã nhập vào!");
        maNVPhuTrachField.setText("");
        
    }
}//GEN-LAST:event_themCVButtonActionPerformed

    private void CVTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVTableMouseClicked
        dtmCV = (DefaultTableModel) CVTable.getModel();
        row = CVTable.getSelectedRow();
        maCVField.setText((String) CVTable.getValueAt(row, 0));
        tenCVField.setText((String) CVTable.getValueAt(row, 1));
        gioCVField.setText((String) CVTable.getValueAt(row, 2));
        maNVPhuTrachField.setText((String) CVTable.getValueAt(row, 3));
        themCVButton.setEnabled(false);
    }//GEN-LAST:event_CVTableMouseClicked

    //Xóa công việc
    private void xoaCVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaCVButtonActionPerformed
        dtmCV.removeRow(row);
        String maCV = maCVField.getText();
        for(CongViec cv : dsCongViec){
            if(cv.getMaCV().equals(maCV)){
                dsCongViec.remove(cv);
                JOptionPane.showMessageDialog(phongComboBox, "Đã xóa công việc!");
            }
        }
        clearDataCV();
        themCVButton.setEnabled(true);
    }//GEN-LAST:event_xoaCVButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchKey = searchField.getText();
        if (searchKey.equals("")) {
            JOptionPane.showMessageDialog(searchField, "Vui lòng nhập mã nhân viên/ công việc cần tìm kiếm");
            return;
        } else {
            CongViec cv = quanLy.timCongViec(searchKey);
            if (cv != null) {
                String maNVPhuTrach = cv.getMaNV();
                NhanSu nhanSu = quanLy.timNhanSu(maNVPhuTrach);
                searchLabel.setText("<html>Công việc: " + cv.getTenCV() + "<br/>" + 
                                "Mã công việc: " + cv.getMaCV() + "<br/>" + 
                                "Số giờ làm việc: " + cv.getSoGioLam() + "<br/>" + 
                                "Tên nhân viên phụ trách: " + nhanSu.getTenNhanVien() + "<br/>" + 
                                "Mã nhân viên: " + nhanSu.getIdNhanVien() + "</html>");
                return;
            }

            NhanSu nv = quanLy.timNhanSu(searchKey);
            if (nv != null) {
                float luong = nv.tinhLuong();
                searchLabel.setText("<html>Tên nhân viên: " + nv.getTenNhanVien() + "<br/>" + 
                                "Mã nhân viên: " + nv.getIdNhanVien() + "<br/>" + 
                                "Năm sinh: " + nv.getNamSinh() + "<br/>" + 
                                "Giới tính: " + nv.getGioiTinh() + "<br/>" + 
                                "Phòng ban: " + nv.getPhongBan() + "<br/>" + 
                                "Số công việc phụ trách: " + nv.getDsCongViec().size() + "<br/>" + 
                                "Lương: " + String.format("%.0f", luong) + "</html>");
            }else{
                JOptionPane.showMessageDialog(searchField, "Không tìm thấy thông tin!");
                searchLabel.setText("");
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    
    //Làm trống ô nhập thông tin tab CôngViệc
    public void clearDataCV(){
        maCVField.setText("");
        tenCVField.setText("");
        gioCVField.setText("");
        maNVPhuTrachField.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CVTable;
    private javax.swing.JTable NVTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField gioCVField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField maCVField;
    private javax.swing.JTextField maNVField;
    private javax.swing.JTextField maNVPhuTrachField;
    private javax.swing.JRadioButton namRadioButton;
    private javax.swing.JTextField namSinhField;
    private javax.swing.JRadioButton nuRadioButton;
    private javax.swing.JComboBox<String> phongComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JButton suaCVButton;
    private javax.swing.JButton suaNVButton;
    private javax.swing.JTextField tenCVField;
    private javax.swing.JTextField tenNVField;
    private javax.swing.JButton themCVButton;
    private javax.swing.JButton themNVButton;
    private javax.swing.JButton xoaCVButton;
    private javax.swing.JButton xoaNVButton;
    // End of variables declaration//GEN-END:variables

    void getVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
