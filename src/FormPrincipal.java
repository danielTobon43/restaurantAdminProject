/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanePrincipal = new javax.swing.JPanel();
        btnPrincipalSedeDeseos = new javax.swing.JButton();
        btnPasionesPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNuevaSede = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarSede = new javax.swing.JTextField();
        btnBuscarSede = new javax.swing.JButton();
        btnCancelarSede = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeliricurasS.A. Inventario");

        jPanePrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btnPrincipalSedeDeseos.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        btnPrincipalSedeDeseos.setText("Sede Deseos");
        btnPrincipalSedeDeseos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalSedeDeseosActionPerformed(evt);
            }
        });

        btnPasionesPrincipal.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        btnPasionesPrincipal.setText("Mas Sedes");
        btnPasionesPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasionesPrincipalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel1.setText("  Deliricuras S.A.");

        btnNuevaSede.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        btnNuevaSede.setText("¿Nueva Sede?");
        btnNuevaSede.setName(""); // NOI18N
        btnNuevaSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSedeActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoDELIRICURA[1].JPG"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setText("Buscar Sede:");

        btnBuscarSede.setText("Buscar");
        btnBuscarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSedeActionPerformed(evt);
            }
        });

        btnCancelarSede.setText("Cancelar");
        btnCancelarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSedeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanePrincipalLayout = new javax.swing.GroupLayout(jPanePrincipal);
        jPanePrincipal.setLayout(jPanePrincipalLayout);
        jPanePrincipalLayout.setHorizontalGroup(
            jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanePrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(96, 96, 96))
            .addGroup(jPanePrincipalLayout.createSequentialGroup()
                .addGroup(jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanePrincipalLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanePrincipalLayout.createSequentialGroup()
                                    .addComponent(btnPasionesPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarSede)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelarSede)
                                    .addGap(16, 16, 16))
                                .addGroup(jPanePrincipalLayout.createSequentialGroup()
                                    .addComponent(btnPrincipalSedeDeseos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(104, 104, 104)
                                    .addGroup(jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBuscarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))))))
                    .addGroup(jPanePrincipalLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3))
                    .addGroup(jPanePrincipalLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanePrincipalLayout.setVerticalGroup(
            jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanePrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrincipalSedeDeseos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanePrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPasionesPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSede)
                    .addComponent(btnCancelarSede))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(651, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalSedeDeseosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalSedeDeseosActionPerformed
        
        FormRegistro registro = new FormRegistro();
        registro.setVisible(true);
        
    }//GEN-LAST:event_btnPrincipalSedeDeseosActionPerformed

    private void btnNuevaSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSedeActionPerformed
        FormCrearSede sede = new FormCrearSede();
        sede.setVisible(true);
    }//GEN-LAST:event_btnNuevaSedeActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnPasionesPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasionesPrincipalActionPerformed
       FormSede sede = new FormSede();
       sede.setVisible(true);
    }//GEN-LAST:event_btnPasionesPrincipalActionPerformed

    private void btnBuscarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSedeActionPerformed
       
        String cad = (this.txtBuscarSede.getText());
        int pos = Test.sede.buscarSedeXCodigo(cad);
        if (pos == -1) {
            Utilitaria.imprimirEnVentanaInformativa("Debe digitar un código valido", "Atención");

        } else {
             Utilitaria.imprimirEnVentanaInformativa(" Una (1) Sede encontrada", "Atención");
             FormSedeBuscada p = new FormSedeBuscada();
             FormSedeBuscada.txtAreaSedeBuscada.append("CÓDIGO: \t\t" + Test.sede.arr_i[pos].codigo + "\nNOMBRE: \t\t" + Test.sede.arr_i[pos].nombre + 
                     "\nDIRECCIÓN: \t\t" + Test.sede.arr_i[pos].direccion + "\nADMINISTRADOR: \t" + Test.sede.arr_i[pos].nomAdministrador + 
                     "\nTELEFONO:\t\t" + Test.sede.arr_i[pos].telefono + "\nESTADO:\t\t" + Test.sede.arr_i[pos].estado);
             
             p.setVisible(true);
             
        }
        
        this.txtBuscarSede.setText("");
        
    }//GEN-LAST:event_btnBuscarSedeActionPerformed

    private void btnCancelarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSedeActionPerformed
        this.txtBuscarSede.setText("");
    }//GEN-LAST:event_btnCancelarSedeActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarSede;
    private javax.swing.JButton btnCancelarSede;
    private javax.swing.JButton btnNuevaSede;
    private javax.swing.JButton btnPasionesPrincipal;
    private javax.swing.JButton btnPrincipalSedeDeseos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanePrincipal;
    private javax.swing.JTextField txtBuscarSede;
    // End of variables declaration//GEN-END:variables
}