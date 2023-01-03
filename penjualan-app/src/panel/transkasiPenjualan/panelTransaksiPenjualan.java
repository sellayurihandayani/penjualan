package panel.transkasiPenjualan;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import method.dataForAllPanel;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class panelTransaksiPenjualan extends dataForAllPanel {

    modelTransaksiPenjualan modelTransaksi = new modelTransaksiPenjualan();

    public panelTransaksiPenjualan() {
        initComponents();
        modelTransaksi.initTable(tabelPenjualan);
    }

    public int confirm(String pesan) {
        return (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPenjualan = new javax.swing.JTable();
        txtKode = new javax.swing.JTextField();
        txtNamaPelanggan = new javax.swing.JTextField();
        txtTotalBayar = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        txtKodeBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtJumlahBeli = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnMasuk = new javax.swing.JButton();
        dateTanggal = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 255, 204));
        setMaximumSize(new java.awt.Dimension(1370, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA TRANSAKSI");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1200, 37));

        tabelPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nota ", "Kode", "Barang", "Jenis", "Harga", "Jumlah", "Potongan", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelPenjualan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 1080, 140));
        add(txtKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 200, -1));
        add(txtNamaPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, -1));
        add(txtTotalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 200, -1));

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 200, -1));
        add(txtKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, -1));
        add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 200, -1));

        txtKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeBarangActionPerformed(evt);
            }
        });
        add(txtKodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 200, -1));

        txtNamaBarang.setEditable(false);
        add(txtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 200, -1));

        txtHarga.setEditable(false);
        add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 200, -1));

        txtJumlahBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahBeliActionPerformed(evt);
            }
        });
        add(txtJumlahBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 200, -1));
        add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 200, -1));

        jLabel5.setText("Kode");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setText("Nama Pelanggan");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel8.setText("Total Bayar");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel7.setText("Bayar");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel11.setText("Kembalian");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel12.setText("Nota");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jLabel2.setText("Tanggal");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel4.setText("Kode Barang");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jLabel6.setText("Nama Barang");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jLabel9.setText("Harga");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel10.setText("Jumlah Beli");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jLabel14.setText("Sub Total");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 120, -1));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 120, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setText("Total: ");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, -1, -1));

        labelTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 180, 30));

        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, -1));
        add(dateTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void reload() {
        txtKode.setText("");
        txtNamaPelanggan.setText("");

        txtTotalBayar.setText("");
        txtBayar.setText("");
        txtKembalian.setText("");

        txtNota.setText("");
        dateTanggal.setDate(null);
        txtKode.setText("");
        txtNamaBarang.setText("");
        txtHarga.setText("");
        txtJumlahBeli.setText("");
        txtPotongan.setText("");

        txtSubTotal.setText("");
        txtSubPotongan.setText("");
        txtTotal.setText("");
    }

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        reload();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void simpan() {

        int banyakData = tabelPenjualan.getRowCount();
        for (int i = 0; i < banyakData; i++) {
            modelTransaksi.proses(""
                    + "INSERT INTO `dtpjl`(`kode_barang`, `kode_nota`, `tanggal`, `total_bayar`, `bayar`, `jumlah_beli`, `potongan`) VALUES\n"
                    + "(\"" + txtNota.getText() + "\", \n"
                    + "\"" + tabelPenjualan.getValueAt(i, 1).toString() + "\", \n"
                    + "	'" + ((JTextField) dateTanggal.getDateEditor().getUiComponent()).getText() + "',\n"
                    + "	" + txtTotalBayar.getText() + ",\n"
                    + "	" + txtBayar.getText() + ",\n"
                    + "	" + tabelPenjualan.getValueAt(i, 5).toString() + ",\n"
                    + "	" + txtSubPotongan.getText() + ")");
        }

    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if (confirm("Yakin ingin menyimpan \"" + txtNamaPelanggan.getText() + "\"?") == JOptionPane.YES_OPTION) {

            simpan();
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data transaksi");
            reload();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    int total = 0;
    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        dataPenjualan d = new dataPenjualan();

        d.setKode(txtKode.getText());
        d.setNamaPelanggan(txtNamaPelanggan.getText());
        d.setTotalBayar(Integer.valueOf(txtTotalBayar.getText()));
        d.setBayar(Integer.valueOf(txtBayar.getText()));
        d.setKembalian(Integer.valueOf(txtKembalian.getText()));

        d.setNota(txtNota.getText());
        d.setTanggal(dateTanggal.getDate());
        d.setKode(txtKode.getText());
        d.setNamaBarang(txtNamaBarang.getText());
        d.setJenisBarang(txtJenisBarang.getText());
        d.setHarga(Integer.valueOf(txtHarga.getText()));
        d.setJumlahBeli(Integer.valueOf(txtJumlahBeli.getText()));
        d.setPotongan(Integer.valueOf(txtPotongan.getText()));

        d.setSubTotal(Integer.valueOf(txtSubTotal.getText()));
        d.setSubPotongan(Integer.valueOf(txtSubPotongan.getText()));
        d.setTotal(Integer.valueOf(txtTotal.getText()));

        modelTransaksi.addTableValue(tabelPenjualan, d);

        total += Integer.valueOf(txtTotal.getText());
        txtTotalBayar.setText(String.valueOf(total));
        labelTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnMasukActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        int kembalian = Integer.valueOf(txtBayar.getText()) - Integer.valueOf(txtTotalBayar.getText());
        txtKembalian.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeBarangActionPerformed
        dataBarang d = modelTransaksi.getDataBarang(txtKodeBarang.getText());

        txtNamaBarang.setText(d.getNamaBarang());
        txtJenisBarang.setText(d.getJenis());
        txtHarga.setText(String.valueOf(d.getHargaJual()));
    }//GEN-LAST:event_txtKodeBarangActionPerformed

    int subTotal = 0;
    private void txtJumlahBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahBeliActionPerformed
        subTotal = Integer.valueOf(txtHarga.getText()) * Integer.valueOf(txtJumlahBeli.getText());

        txtSubTotal.setText(String.valueOf(subTotal));

        txtTotal.setText(String.valueOf(subTotal - subPotongan));
    }//GEN-LAST:event_txtJumlahBeliActionPerformed

    int subPotongan = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnTambah;
    private com.toedter.calendar.JDateChooser dateTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tabelPenjualan;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlahBeli;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNamaPelanggan;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables

}
