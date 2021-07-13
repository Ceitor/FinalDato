package logeo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Hoteles extends javax.swing.JFrame {

    public Hoteles() {
        initComponents();
        txtid.setVisible(false);
        cargarTable();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        txthotel = new javax.swing.JTextField();
        txtcalle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcolonia = new javax.swing.JTextField();
        txtpoblacion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_hoteles = new javax.swing.JTable();
        lbusu = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Hotel:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtdestino.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txtdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 240, 30));

        txthotel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txthotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 240, 30));

        txtcalle.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txtcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 240, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Hoteles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Calle:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        txtcolonia.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txtcolonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 240, 30));

        txtpoblacion.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txtpoblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 240, 30));

        txttelefono.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 240, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Destino:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("Usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Poblacion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Colonia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        table_hoteles.setBackground(new java.awt.Color(255, 153, 153));
        table_hoteles.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table_hoteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Destino", "Hotel", "Calle", "Colonia", "Poblacion", "Telefonol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_hoteles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_hotelesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_hoteles);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 790, 180));

        lbusu.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbusu.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(lbusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, 30));

        btnregistrar.setBackground(new java.awt.Color(255, 153, 51));
        btnregistrar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.setBorder(null);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 80, 30));

        btneliminar.setBackground(new java.awt.Color(255, 153, 51));
        btneliminar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setBorder(null);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 80, 30));

        btn_regresar.setBackground(new java.awt.Color(255, 153, 51));
        btn_regresar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_regresar.setText("Regresar al menu");
        btn_regresar.setBorder(null);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 150, 30));

        btnmodificar.setBackground(new java.awt.Color(255, 153, 51));
        btnmodificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setBorder(null);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 90, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/abstract-1.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        String destino = txtdestino.getText();
        String hotel = txthotel.getText();
        String calle = txtcalle.getText();
        String colonia = txtcolonia.getText();
        String poblacion = txtpoblacion.getText();
        String telefono = txttelefono.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;    
            ps = con.prepareStatement("INSERT INTO Hoteles (destino,hotel,calle,colonia,poblacion,Telefono) VALUES (?,?,?,?,?,?)");
            ps.setString(1, destino);
            ps.setString(2, hotel);
            ps.setString(3, calle);
            ps.setString(4, colonia);
            ps.setString(5, poblacion);
            ps.setString(6, telefono);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM Hoteles WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void table_hotelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_hotelesMouseClicked
        try {
            int fila = table_hoteles.getSelectedRow();
            int id = Integer.parseInt(table_hoteles.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT destino,hotel,calle,colonia,poblacion,Telefono FROM Hoteles WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                txtid.setText(String.valueOf(id));
                txtdestino.setText(rs.getString("destino"));
                txthotel.setText(rs.getString("hotel"));
                txtcalle.setText(rs.getString("calle"));
                txtcolonia.setText(rs.getString("colonia"));
                txtpoblacion.setText(rs.getString("poblacion"));
                txttelefono.setText(rs.getString("Telefono"));
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_table_hotelesMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String destino = txtdestino.getText();
        String hotel = txthotel.getText();
        String calle = txtcalle.getText();
        String colonia = txtcolonia.getText();
        String poblacion = txtpoblacion.getText();
        String telefono = txttelefono.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE Hoteles SET destino = ?,hotel = ?,calle = ?,colonia = ?,poblacion = ?,Telefono = ? WHERE id = ?");
            ps.setString(1, destino);
            ps.setString(2, hotel);
            ps.setString(3, calle);
            ps.setString(4, colonia);
            ps.setString(5, poblacion);
            ps.setString(6, telefono);
            ps.setInt(7, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        regresa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    
    private void limpiar(){
        txtdestino.setText("");
        txthotel.setText("");
        txtcalle.setText("");
        txtcolonia.setText("");
        txtpoblacion.setText("");
        txttelefono.setText("");
    }
    
    private void cargarTable(){
        DefaultTableModel modelo = (DefaultTableModel) table_hoteles.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT id,destino,hotel,calle,colonia,poblacion,Telefono FROM Hoteles");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice = 0; indice<columnas; indice++){
                    fila[indice] = rs.getObject(indice + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(Hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoteles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lbusu;
    private javax.swing.JTable table_hoteles;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcolonia;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txthotel;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpoblacion;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
public static res regresa = new res();
}
