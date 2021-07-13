package logeo;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Atractivo extends javax.swing.JFrame {

    public Atractivo() {
        initComponents();
        cargarTable();
        txtid.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        atract = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_at = new javax.swing.JTable();
        txtdescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtimagen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_foto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        btn_registrar = new javax.swing.JButton();
        lbusu = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbimagen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Atractivo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Descripcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        atract.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        atract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atractActionPerformed(evt);
            }
        });
        jPanel1.add(atract, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("Atractivos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Imagen:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        table_at.setBackground(new java.awt.Color(255, 153, 153));
        table_at.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table_at.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Atractivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_at.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_at.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_atMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_at);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 180));
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, 20));

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton1.setText("Texto");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 60, 20));
        jPanel1.add(txtimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Breve Descripcion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        btn_foto.setBackground(new java.awt.Color(255, 153, 51));
        btn_foto.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_foto.setText("Foto");
        btn_foto.setBorder(null);
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, 20));

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane2.setViewportView(txt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 320, 170));

        btn_registrar.setBackground(new java.awt.Color(255, 153, 51));
        btn_registrar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, 30));

        lbusu.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbusu.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(lbusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 180, 30));

        btn_regresar.setBackground(new java.awt.Color(255, 153, 51));
        btn_regresar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_regresar.setText("Regresar al menu");
        btn_regresar.setBorder(null);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 150, 30));

        btn_eliminar.setBackground(new java.awt.Color(255, 153, 51));
        btn_eliminar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 90, 30));

        btn_modificar.setBackground(new java.awt.Color(255, 153, 51));
        btn_modificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(null);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 90, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Vista previa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));
        jPanel1.add(lbimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 180, 180));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/abstract-1.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        txtid.setText("jTextField1");
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ///falta la chinagdera de renderear el documento .txt
    private void table_atMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_atMouseClicked
        try {
            int fila = table_at.getSelectedRow();
            int id = Integer.parseInt(table_at.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT descripcion,imagen FROM Atractivos WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                FileReader leer = new FileReader(rs.getString("descripcion"));
                BufferedReader br = new BufferedReader(leer);
                String cadena;
                while((cadena=br.readLine())!=null){
                txt.setText(cadena);
                }
                txtid.setText(String.valueOf(id));
                txtimagen.setText(rs.getString("imagen"));
                Image foto = getToolkit().getImage(txtimagen.getText());
                foto = foto.getScaledInstance(125, 125, Image.SCALE_DEFAULT);
                lbimagen.setIcon(new ImageIcon(foto));
                
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_table_atMouseClicked

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String descrip = txtdescripcion.getText();
        String atra = (String) atract.getSelectedItem();
        String image = txtimagen.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("INSERT INTO Atractivos (atractivo,descripcion,imagen) VALUES (?,?,?)");
            ps.setString(1, atra);
            ps.setString(2, descrip);
            ps.setString(3, image);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void atractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atractActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM Atractivos WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String desc = txtdescripcion.getText();
        String atractivo = (String) atract.getSelectedItem();
        String img = txtimagen.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE Atractivo SET atractivo = ?, descripcion = ?, imagen = ? WHERE id = ?");
            ps.setString(1, atractivo);
            ps.setString(2, desc);
            ps.setString(3, img);
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
        JFileChooser archivo = new JFileChooser();
        File ruta = new File("A:\\Descargas");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archivo.getSelectedFile();
            txtimagen.setText(String.valueOf(file));
        }
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser archiv = new JFileChooser();
        File rut = new File("A:\\Descargas");
        archiv.setCurrentDirectory(rut);
        int ventana = archiv.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archiv.getSelectedFile();
            txtdescripcion.setText(String.valueOf(file));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        regresa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void limpiar() {
        txtdescripcion.setText("");
        txtimagen.setText("");
        txtid.setText("");
        lbimagen.setIcon(null);
        txtdescripcion.setText("");
    }

    private void cargarTable() {
        DefaultTableModel modelo = (DefaultTableModel) table_at.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT id,atractivo FROM Atractivos");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        atract.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = conect.esta();
        for (int i = 0; i < lista.size(); i++) {
            atract.addItem(lista.get(i));
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
            java.util.logging.Logger.getLogger(Atractivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atractivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atractivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atractivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atractivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> atract;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbimagen;
    public javax.swing.JLabel lbusu;
    private javax.swing.JTable table_at;
    private javax.swing.JTextArea txt;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtimagen;
    // End of variables declaration//GEN-END:variables
public static res regresa = new res();
}
