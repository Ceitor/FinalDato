/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logeo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static logeo.Guias.regresa;

/**
 *
 * @author Antonio Tristan
 */
public class Destinos extends javax.swing.JFrame {

    public Destinos() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtid.setVisible(false);
        cargarTable();
        
        est.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = conect.esta();
        for (int i = 0; i < lista.size(); i++) {
            est.addItem(lista.get(i));
        }
        
        des.removeAllItems();
        ArrayList<String> lis = new ArrayList<String>();
        lis = conect.des();
        for (int i = 0; i < lis.size(); i++) {
            des.addItem(lis.get(i));
        }
        
        atra.removeAllItems();
        ArrayList<String> li = new ArrayList<String>();
        li = conect.atra();
        for (int i = 0; i < li.size(); i++) {
            atra.addItem(li.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_destinos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        lbusu = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        est = new javax.swing.JComboBox<>();
        des = new javax.swing.JComboBox<>();
        atra = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_destinos.setBackground(new java.awt.Color(255, 153, 153));
        table_destinos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table_destinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Estados", "Destinos", "Atractivos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_destinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_destinosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_destinos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 180));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Destinos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Estado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Atractivos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        btn_modificar.setBackground(new java.awt.Color(255, 153, 51));
        btn_modificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(null);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 90, 30));

        lbusu.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbusu.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(lbusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 180, 30));

        btn_regresar.setBackground(new java.awt.Color(255, 153, 51));
        btn_regresar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_regresar.setText("Regresar al menu");
        btn_regresar.setBorder(null);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 150, 30));

        btn_agregar.setBackground(new java.awt.Color(255, 153, 51));
        btn_agregar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_agregar.setText("Registrar");
        btn_agregar.setBorder(null);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 90, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Destinos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(255, 153, 51));
        btn_eliminar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 90, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        est.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        est.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        est.setBorder(null);
        est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estActionPerformed(evt);
            }
        });
        jPanel1.add(est, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        des.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        des.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        des.setBorder(null);
        jPanel1.add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        atra.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        atra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        atra.setBorder(null);
        jPanel1.add(atra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/abstract-1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 470));

        txtid.setText("jTextField1");
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_destinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_destinosMouseClicked
        try {
            int fila = table_destinos.getSelectedRow();
            int id = Integer.parseInt(table_destinos.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT estados,destino,atractivo FROM Destinos WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                txtid.setText(String.valueOf(id));
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_table_destinosMouseClicked
    
    
    private void limpiar(){
        txtid.setText("");
    }
    private void estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String estado = (String) est.getSelectedItem();
        String destino = (String) des.getSelectedItem();
        String atractivo = (String) atra.getSelectedItem();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;    
            ps = con.prepareStatement("INSERT INTO Destinos (estados,destino,atractivo) VALUES (?,?,?)");
            ps.setString(1, estado);
            ps.setString(2, destino);
            ps.setString(3, atractivo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTable();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM Destinos WHERE id = ?");
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
        String estado = (String) est.getSelectedItem();
        String destino = (String) des.getSelectedItem();
        String atractivo = (String) atra.getSelectedItem();
        try {
            Connection con = conect.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE Destinos SET estados = ?, destino = ? ,atractivo = ? WHERE id = ?");
            ps.setString(1, estado);
            ps.setString(2, destino);
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

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        regresa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed
    
    
    private void cargarTable(){
        DefaultTableModel modelo = (DefaultTableModel) table_destinos.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT id,estados,destino,atractivo FROM Destinos");
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
            java.util.logging.Logger.getLogger(Destinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Destinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Destinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Destinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Destinos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> atra;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> des;
    private javax.swing.JComboBox<String> est;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbusu;
    private javax.swing.JTable table_destinos;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
public static res regresa = new res();
}
