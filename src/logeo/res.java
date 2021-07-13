package logeo;

import static logeo.logeo.mp;

/**
 *
 * @author Antonio Tristan
 */
public class res extends javax.swing.JFrame {

    public static String nombre = "";
    public static String estatus = "";
    public res() {
        initComponents();
        btsalir.setBackground(new java.awt.Color(0,0,0,3));   
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lbestatus = new javax.swing.JLabel();
        btsalir = new javax.swing.JButton();
        lbnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_guias = new javax.swing.JButton();
        btn_destinos = new javax.swing.JButton();
        btn_estados = new javax.swing.JButton();
        btn_atractivos = new javax.swing.JButton();
        btn_hoteles = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbestatus.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbestatus.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(lbestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 190, 31));

        btsalir.setBackground(new java.awt.Color(255, 255, 255));
        btsalir.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btsalir.setForeground(new java.awt.Color(255, 153, 153));
        btsalir.setText("Salir");
        btsalir.setBorder(null);
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 50, 30));

        lbnombre.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 220, 27));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Estatus:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Administrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Nombre usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 220, 10));

        btn_guias.setBackground(new java.awt.Color(255, 153, 51));
        btn_guias.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_guias.setText("Ver Guias");
        btn_guias.setBorder(null);
        btn_guias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guiasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 100, 30));

        btn_destinos.setBackground(new java.awt.Color(255, 153, 51));
        btn_destinos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_destinos.setText("Ver Destinos");
        btn_destinos.setBorder(null);
        btn_destinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_destinosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_destinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, 30));

        btn_estados.setBackground(new java.awt.Color(255, 153, 51));
        btn_estados.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_estados.setText("Ver Estados");
        btn_estados.setBorder(null);
        btn_estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 110, 30));

        btn_atractivos.setBackground(new java.awt.Color(255, 153, 51));
        btn_atractivos.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_atractivos.setText("Ver Atrativos");
        btn_atractivos.setBorder(null);
        btn_atractivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atractivosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atractivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 120, 30));

        btn_hoteles.setBackground(new java.awt.Color(255, 153, 51));
        btn_hoteles.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_hoteles.setText("Ver Hoteles");
        btn_hoteles.setBorder(null);
        btn_hoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hotelesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hoteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 110, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 190, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EJEMPLO2/abstract-1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lbnombre.setText(nombre);
        lbestatus.setText(estatus);
    }//GEN-LAST:event_formWindowActivated

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void btn_guiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guiasActionPerformed
        nombre = lbnombre.getText();
        gui.setVisible(true);
        gui.lbusu.setText(nombre);
        this.setVisible(false);
    }//GEN-LAST:event_btn_guiasActionPerformed

    private void btn_estadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadosActionPerformed
        nombre = lbnombre.getText();
        reg.setVisible(true);
        reg.lbusu.setText(nombre);
        this.setVisible(false);
    }//GEN-LAST:event_btn_estadosActionPerformed

    private void btn_hotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hotelesActionPerformed
        nombre = lbnombre.getText();
        hoteles.setVisible(true);
        hoteles.lbusu.setText(nombre);
        this.setVisible(false);
    }//GEN-LAST:event_btn_hotelesActionPerformed

    private void btn_destinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_destinosActionPerformed
        nombre = lbnombre.getText();
        destinos.setVisible(true);
        destinos.lbusu.setText(nombre);
        this.setVisible(false);
    }//GEN-LAST:event_btn_destinosActionPerformed

    private void btn_atractivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atractivosActionPerformed
        nombre = lbnombre.getText();
        atractivo.setVisible(true);
        atractivo.lbusu.setText(nombre);
        this.setVisible(false);
    }//GEN-LAST:event_btn_atractivosActionPerformed

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
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new res().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atractivos;
    private javax.swing.JButton btn_destinos;
    private javax.swing.JButton btn_estados;
    private javax.swing.JButton btn_guias;
    private javax.swing.JButton btn_hoteles;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbestatus;
    private javax.swing.JLabel lbnombre;
    // End of variables declaration//GEN-END:variables
public static Estados reg = new Estados();
public static Guias gui = new Guias();
public static Hoteles hoteles = new Hoteles();
public static Atractivo atractivo = new Atractivo();
public static Destinos destinos = new Destinos();

}
