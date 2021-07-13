package logeo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Estados extends javax.swing.JFrame {
    
    public Estados() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTable();
        txtid.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_estados = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        lbusu = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        txtestado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Estado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Estados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        tabla_estados.setBackground(new java.awt.Color(255, 153, 153));
        tabla_estados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabla_estados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Estados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_estados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_estadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_estados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 360, 180));

        btn_agregar.setBackground(new java.awt.Color(255, 153, 51));
        btn_agregar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_agregar.setText("Registrar");
        btn_agregar.setBorder(null);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 80, 30));

        lbusu.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbusu.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(lbusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 30));

        btn_eliminar.setBackground(new java.awt.Color(255, 153, 51));
        btn_eliminar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 70, 30));

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton1.setText("Regresar al menu");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 30));

        btn_modificar.setBackground(new java.awt.Color(255, 153, 51));
        btn_modificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(null);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 80, 30));
        jPanel1.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 270, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/abstract-1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 30, 10, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String estado = txtestado.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("INSERT INTO Estados (estados) VALUES (?)");
            ps.setString(1, estado);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tabla_estadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_estadosMouseClicked
        try {
            int fila = tabla_estados.getSelectedRow();
            int id = Integer.parseInt(tabla_estados.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT estados FROM Estados WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                txtid.setText(String.valueOf(id));
                txtestado.setText(rs.getString("estados"));
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tabla_estadosMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM Estados WHERE id = ?");
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
        String estado = txtestado.getText();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE Estados SET estados = ? WHERE id = ?");
            ps.setString(1, estado);
            ps.setInt(2, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        regresa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiar(){
        txtestado.setText("");
        txtid.setText("");
    }
    
    private void cargarTable(){
        DefaultTableModel modelo = (DefaultTableModel) tabla_estados.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT id,estados FROM Estados");
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
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbusu;
    private javax.swing.JTable tabla_estados;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
public static res regresa = new res();
}
