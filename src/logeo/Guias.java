package logeo;


import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static logeo.res.nombre;

public class Guias extends javax.swing.JFrame {
    public Guias() {
        initComponents();
        cargarTable();
        txtid.setVisible(false);
        this.setLocationRelativeTo(null);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_regresa = new javax.swing.JButton();
        lbusu = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        txtatractivo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_guias = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lbfoto = new javax.swing.JLabel();
        btnfoto = new javax.swing.JButton();
        txtfoto = new javax.swing.JTextField();
        jabel = new javax.swing.JLabel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Nombre del Guia:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Foto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Atractivo Asociado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(255, 153, 51));
        btn_eliminar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 70, 30));

        btn_modificar.setBackground(new java.awt.Color(255, 153, 51));
        btn_modificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(null);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 70, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        btn_regresa.setBackground(new java.awt.Color(255, 153, 51));
        btn_regresa.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_regresa.setText("Regresar al menu");
        btn_regresa.setToolTipText("");
        btn_regresa.setBorder(null);
        btn_regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 130, 30));

        lbusu.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbusu.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(lbusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 30));

        btn_registrar.setBackground(new java.awt.Color(255, 153, 51));
        btn_registrar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 30));

        txtatractivo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtatractivo.setBorder(null);
        txtatractivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtatractivoActionPerformed(evt);
            }
        });
        jPanel1.add(txtatractivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 290, 30));

        txtnombre.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 300, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Guias");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, -1));

        table_guias.setBackground(new java.awt.Color(255, 153, 153));
        table_guias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table_guias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Guia", "Atractivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_guias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_guiasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_guias);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 580, 160));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Vista Previa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));
        jPanel1.add(lbfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 140, 150));

        btnfoto.setBackground(new java.awt.Color(255, 153, 51));
        btnfoto.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        btnfoto.setText("foto");
        btnfoto.setBorder(null);
        btnfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 70, 20));
        jPanel1.add(txtfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 220, 30));

        jabel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jabel.setForeground(new java.awt.Color(255, 51, 51));
        jabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/abstract-1.jpg"))); // NOI18N
        jPanel1.add(jabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 530));

        txtid.setText("jTextField1");
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String guia = txtnombre.getText();
        String atractivo = txtatractivo.getText();
        String foto = txtfoto.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;    
            ps = con.prepareStatement("INSERT INTO Guias (guia,foto,atractivo) VALUES (?,?,?)");
            ps.setString(1, guia);
            ps.setString(2, foto);
            ps.setString(3, atractivo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM Guias WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void table_guiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_guiasMouseClicked
        try {
            int fila = table_guias.getSelectedRow();
            int id = Integer.parseInt(table_guias.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT guia,foto,atractivo FROM Guias WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                txtid.setText(String.valueOf(id));
                txtnombre.setText(rs.getString("guia")); 
                txtatractivo.setText(rs.getString("atractivo"));
                txtfoto.setText(rs.getString("foto"));
                Image foto = getToolkit().getImage(txtfoto.getText());
                foto = foto.getScaledInstance(125, 125, Image.SCALE_DEFAULT);
                lbfoto.setIcon(new ImageIcon(foto));
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        res texto = new res();
        System.out.println(texto.nombre);
//        lbusu.setText(texto.nombre);
    }//GEN-LAST:event_table_guiasMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String guia = txtnombre.getText();
        String atractivo = txtatractivo.getText();
        String foto = txtfoto.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE Guias SET guia = ?, foto = ? ,atractivo = ? WHERE id = ?");
            ps.setString(1, guia);
            ps.setString(2, foto);
            ps.setString(3, atractivo);
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txtatractivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtatractivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtatractivoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfotoActionPerformed
//        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Filtros de Archivos JPEG()");
        JFileChooser archivo = new JFileChooser();
//        archivo.addChoosableFileFilter(filtro);
//        archivo.setDialogTitle("Abrir Archivo");
        File ruta = new File("A:\\Descargas");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archivo.getSelectedFile();
            txtfoto.setText(String.valueOf(file));
            
        }
    }//GEN-LAST:event_btnfotoActionPerformed

    private void btn_regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresaActionPerformed
        regresa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        lbusu.setText(nombre);
    }//GEN-LAST:event_formWindowActivated

    private void limpiar(){
        txtnombre.setText("");
        txtatractivo.setText("");
        txtfoto.setText("");
        txtid.setText("");
        lbfoto.setIcon(null);
    }
    
    private void cargarTable(){
        DefaultTableModel modelo = (DefaultTableModel) table_guias.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT id, guia, atractivo FROM Guias");
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
            java.util.logging.Logger.getLogger(Guias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresa;
    private javax.swing.JButton btnfoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jabel;
    private javax.swing.JLabel lbfoto;
    public javax.swing.JLabel lbusu;
    private javax.swing.JTable table_guias;
    private javax.swing.JTextField txtatractivo;
    private javax.swing.JTextField txtfoto;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
public static res regresa = new res();
}
