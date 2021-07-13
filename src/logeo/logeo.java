package logeo;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio Tristan
 */
public class logeo extends javax.swing.JFrame {  
    public conexion con;
    public logeo() {
        initComponents();
        con = new conexion();
        con.conectar(); 
        setSize(295,390);
        txtusu.setOpaque(false);
        jpass.setOpaque(false);
        this.setLocationRelativeTo(null);
    }
    public String nombre = "";
    public String estatus = "";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusu = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        btn_comun = new javax.swing.JButton();
        btentrar = new javax.swing.JButton();
        jpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Clave:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtusu.setFont(new java.awt.Font("OCR A Extended", 3, 14)); // NOI18N
        txtusu.setForeground(new java.awt.Color(255, 255, 255));
        txtusu.setBorder(null);
        txtusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuActionPerformed(evt);
            }
        });
        getContentPane().add(txtusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 233, 12));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/icons8_customer_32px_1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/icons8_Key_32px.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        btncerrar.setBackground(new java.awt.Color(102, 153, 255));
        btncerrar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 153, 51));
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/salir.png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setSelected(true);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, 40));

        btn_comun.setBackground(new java.awt.Color(255, 102, 51));
        btn_comun.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btn_comun.setForeground(new java.awt.Color(255, 255, 255));
        btn_comun.setText("Invitado");
        btn_comun.setBorder(null);
        btn_comun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comunActionPerformed(evt);
            }
        });
        getContentPane().add(btn_comun, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 30));

        btentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/Enter_OFF.png"))); // NOI18N
        btentrar.setBorder(null);
        btentrar.setBorderPainted(false);
        btentrar.setContentAreaFilled(false);
        btentrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/Enter_ON.png"))); // NOI18N
        btentrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/Enter_ON.png"))); // NOI18N
        btentrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/Enter_ON.png"))); // NOI18N
        btentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btentrarActionPerformed(evt);
            }
        });
        getContentPane().add(btentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 100, 30));

        jpass.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jpass.setForeground(new java.awt.Color(255, 255, 255));
        jpass.setBorder(null);
        jpass.setCaretColor(new java.awt.Color(255, 255, 255));
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/icons8_User_96px_2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/fondo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuActionPerformed

    private void btentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btentrarActionPerformed
    
        try { 
            String valor = new String(jpass.getPassword());
            if(con.logeo(txtusu.getText(), valor) == 1) {
                mp.nombre = con.getNombre();
                mp.estatus = con.getEstatus();
                mp.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(logeo.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_btentrarActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btn_comunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comunActionPerformed
        Usuario usu = new Usuario();
        usu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_comunActionPerformed

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
            java.util.logging.Logger.getLogger(logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                l.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btentrar;
    private javax.swing.JButton btn_comun;
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
public static logeo l = new logeo();
public static res mp = new res();
public static Estados reg = new Estados();
public static Guias guias = new Guias();
public static Hoteles hoteles = new Hoteles();
public static Atractivo atractivo = new Atractivo();
public static Destinos destinos = new Destinos();
}
