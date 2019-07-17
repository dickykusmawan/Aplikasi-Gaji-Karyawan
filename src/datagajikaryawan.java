import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class datagajikaryawan extends javax.swing.JFrame {
    boolean cekdata;
    koneksi koneksi = new koneksi();
    public datagajikaryawan() {
        initComponents();
        tampildata();
        tampilcombo();
        setdate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome, Admin Dicky");

        jLabel2.setText("Pilih ID Karyawan :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Pilih ID Karyawan -" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel3.setText("Nama Karyawan :");

        jLabel4.setText("Jabatan :");

        jLabel5.setText("Departemen :");

        jLabel6.setText("No. Transaksi :");

        jLabel7.setText("Tanggal Transaksi :");

        jLabel8.setText("Jumlah Hadir Karyawan :");

        jTextField2.setText("0");

        jLabel9.setText("Ketererangan Jumlah Tidak Hadir :");

        jTextField3.setText("0");

        jLabel10.setText("Sakit :");

        jLabel11.setText("Izin :");

        jLabel12.setText("Alpa / Tanpa Ket :");

        jLabel13.setText("Jumlah Potongan Tidak Hadir :");

        jTextField4.setText("0");

        jTextField5.setText("0");

        jTextField6.setText("0");

        jLabel14.setText("Potongan BPJS 3% :");

        jLabel15.setText("Lembur :");

        jLabel16.setText("Bonus Gaji :");

        jLabel17.setText("Tunjangan Jabatan :");

        jLabel18.setText("Total Gaji Kotor :");

        jLabel19.setText("Total Gaji Bersih :");

        jTextField7.setText("0");

        jTextField8.setText("0");

        jTextField9.setText("0");

        jTextField10.setText("0");

        jLabel20.setText("-");

        jLabel21.setText("-");

        jLabel22.setText("-");

        jLabel23.setText("-");

        jLabel24.setText("0");

        jLabel25.setText("0");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Karyawan", "Nama Karyawan", "Jabatan", "Departemen", "No Transaksi", "Tanggal Transaksi", "Jumlah Hadir", "Jumlah Tidak Hadir", "Total Gaji Kotor", "Total Gaji Bersih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("TAMBAH DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS DATA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SIMPAN DATA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("KEMBALI KE MASTER KARYAWAN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("DATA PENGGAJIAN KARYAWAN");

        jLabel27.setText("Create By : Dicky Kusmawan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox1, 0, 123, Short.MAX_VALUE)
                                        .addComponent(jTextField1))
                                    .addComponent(jLabel23))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(37, 37, 37)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel26)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel12))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4))))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(jTextField8)
                                .addComponent(jTextField9)
                                .addComponent(jTextField10)))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel27)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel16)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        munculotomatis();
        set();
        setdate();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertdata();
        tampildata();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hapusdata();
        tampildata();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editdata();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        simpandata();
        tampildata();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        masterkaryawan masterkaryawan = new masterkaryawan();
        masterkaryawan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datagajikaryawan().setVisible(true);
            }
        });
    }
    
    public void tampildata(){
        DefaultTableModel data = (DefaultTableModel) jTable1.getModel();
        data.getDataVector().removeAllElements();
        try {
            String sql = "select tb_karyawan.id_karyawan,tb_karyawan.nama_karyawan,tb_karyawan.jabatan,tb_karyawan.departement,tb_datagaji.no_transaksi,tb_datagaji.tanggal_transaksi,tb_datagaji.jumlah_hadir,tb_datagaji.jumlah_tidakhadir,tb_datagaji.total_gajikotor,tb_datagaji.total_gajibersih from tb_datagaji left join tb_karyawan on tb_datagaji.id_karyawan=tb_karyawan.id_karyawan";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String kolom[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)};
                data.addRow(kolom);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilcombo(){
        try {
            String sql = "select id_karyawan from tb_karyawan";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void munculotomatis(){
        try {
            String sql = "select nama_karyawan,jabatan,departement from tb_karyawan where id_karyawan='"+jComboBox1.getSelectedItem().toString()+"'";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                jLabel20.setText(rs.getString(1));
                jLabel21.setText(rs.getString(2));
                jLabel22.setText(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertdata(){
        try {
            int jumlahtdkhadir=Integer.parseInt(jTextField3.getText())+Integer.parseInt(jTextField4.getText())+Integer.parseInt(jTextField5.getText());
            String sql = "insert into tb_datagaji value ('"+jComboBox1.getSelectedItem().toString()+"','"+jTextField1.getText()+"','"+jLabel23.getText()+"','"+jTextField2.getText()+"','"+jumlahtdkhadir+"','"+jTextField9.getText()+"','"+jTextField10.getText()+"')";
            Statement st = koneksi.con.createStatement();
            int rs = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void setdate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        jLabel23.setText(formatter.format(date));
    }
    
    public void set(){
        int bpjs;
        int gajikotor;
        int gajibersih;
        int jumlahtidakhadir=(Integer.parseInt(jTextField3.getText())+Integer.parseInt(jTextField4.getText())+Integer.parseInt(jTextField5.getText()))*50000;
        jTextField6.setText(Integer.toString(jumlahtidakhadir));
        if(jLabel21.getText().equals("Junior associate")){
            jLabel25.setText("200000");
        }
        else if(jLabel21.getText().equals("Middle associate")){
            jLabel25.setText("300000");
        }
        else if(jLabel21.getText().equals("Senior associate")){
            jLabel25.setText("400000");
        }
        try {
            String sql = "select jabatan, rate_gaji from tb_karyawan where id_karyawan='"+jComboBox1.getSelectedItem().toString()+"'";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                bpjs=(rs.getInt(2)/100)*3;
                gajikotor=rs.getInt(2)+Integer.parseInt(jTextField7.getText())+Integer.parseInt(jTextField8.getText())+Integer.parseInt(jLabel25.getText());
                jLabel24.setText(Integer.toString(bpjs));
                jTextField9.setText(Integer.toString(gajikotor));
                gajibersih=gajikotor-Integer.parseInt(jTextField6.getText())-Integer.parseInt(jLabel24.getText());
                jTextField10.setText(Integer.toString(gajibersih));
            }
        } catch (SQLException ex) {
            Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hapusdata(){
        if(jTable1.getSelectedColumn()<0){
            JOptionPane.showMessageDialog(null, "Harap Pilih Data Yang Akan Dihapus Pada Table");
        }
        else if(jTable1.getSelectedColumn()==4){
            try {
                String sql = "DELETE FROM tb_datagaji WHERE no_transaksi='"+jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn())+"'";
                Statement st = koneksi.con.createStatement();
                int rs = st.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }
        else{
            JOptionPane.showMessageDialog(null, "Harap Pilih Pada Kolom No Transaksi");
        }
    }
    
    public void editdata(){
        if(jTable1.getSelectedColumn()<0){
            JOptionPane.showMessageDialog(null, "Harap Pilih Kolom No Transaksi Pada Table");
        }
        else if(jTable1.getSelectedColumn()==4){
                DefaultTableModel data1 = (DefaultTableModel) jTable1.getModel();
            try {
                String sql = "Select * from tb_datagaji where no_transaksi='"+jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString()+"'";
                Statement st = koneksi.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    jTextField1.setText(rs.getString(2));
                    jTextField2.setText(rs.getString(4));
                    jTextField9.setText(rs.getString(6));
                    jTextField10.setText(rs.getString(7));
                    cekdata=true;
                }
                rs.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Silakan Tekan Tombol Simpan Untuk Menyimpan");
        }
        else{
            JOptionPane.showMessageDialog(null, "Harap Pilih Kolom No Transaksi Pada Table");
        }
    }
    
    public void simpandata(){
        int jumlahtdkhadir=Integer.parseInt(jTextField3.getText())+Integer.parseInt(jTextField4.getText())+Integer.parseInt(jTextField5.getText());
        if(cekdata==true){
                try {
                String sql = "update tb_datagaji set tanggal_transaksi='"+jLabel23.getText()+"',jumlah_hadir='"+jTextField2.getText()+"',jumlah_tidakhadir='"+Integer.toString(jumlahtdkhadir)+"',total_gajikotor='"+jTextField9.getText()+"',total_gajibersih='"+jTextField10.getText()+"' where no_transaksi='"+jTextField1.getText()+"'";
                Statement st = koneksi.con.createStatement();
                int rs = st.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(masterkaryawan.class.getName()).log(Level.SEVERE, null, ex);
            }
                cekdata=false;
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        }
        else{
            JOptionPane.showMessageDialog(null, "Harap Tekan Tombol Edit Terlebih Dahulu");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
