
import java.awt.Toolkit;

public class FormAgregarIngrediente extends javax.swing.JFrame {

    public FormAgregarIngrediente() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCantidadAgregarIngrediente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCodigoAgregarIngrediente = new javax.swing.JTextField();
        btnAceptarAgregarIngrediente = new javax.swing.JButton();
        btnCancelarAgregarIngrediente = new javax.swing.JButton();
        btnVerInventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Ingrediente");
        setName("AgregarIngrediente"); // NOI18N

        txtCantidadAgregarIngrediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadAgregarIngredienteKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad Ingrediente:");

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel2.setText("Código:");

        txtNombreCodigoAgregarIngrediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCodigoAgregarIngredienteKeyTyped(evt);
            }
        });

        btnAceptarAgregarIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnAceptarAgregarIngrediente.setText("Aceptar");
        btnAceptarAgregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAgregarIngredienteActionPerformed(evt);
            }
        });

        btnCancelarAgregarIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnCancelarAgregarIngrediente.setText("Cancelar");
        btnCancelarAgregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAgregarIngredienteActionPerformed(evt);
            }
        });

        btnVerInventario.setText("Ver Inventario");
        btnVerInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(btnCancelarAgregarIngrediente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptarAgregarIngrediente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCodigoAgregarIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(txtCantidadAgregarIngrediente))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(btnVerInventario)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCodigoAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidadAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarAgregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgregarIngredienteActionPerformed

        if (Utilitaria.validarCadenaVacia(this.txtNombreCodigoAgregarIngrediente.getText())
                && Utilitaria.validarCadenaVacia(this.txtCantidadAgregarIngrediente.getText())) {
            Utilitaria.imprimirEnVentanaInformativa("Debe digitar:\n * Nombre\n"
                    + " * Cantidad\n", "Atención");
            this.txtNombreCodigoAgregarIngrediente.requestFocus();
        } else if (Utilitaria.validarCadenaVacia(this.txtNombreCodigoAgregarIngrediente.getText())) {
            Utilitaria.imprimirEnVentanaInformativa("Debe digitar el nombre o código del ingrediente a agregar", "Atención");
            this.txtNombreCodigoAgregarIngrediente.requestFocus();

        } else if (Utilitaria.validarCadenaVacia(this.txtCantidadAgregarIngrediente.getText())) {
            Utilitaria.imprimirEnVentanaInformativa("Debe digitar la cantidad de ingrediente a agregar", "Atención");
            this.txtCantidadAgregarIngrediente.requestFocus();
        } else {

            String cad = (this.txtNombreCodigoAgregarIngrediente.getText());
            int pos = Test.ai.buscarIngredienteXCodigo(cad);            
            Test.ai.arr_i[pos].stock = Test.ai.arr_i[pos].stock + Integer.parseInt(this.txtCantidadAgregarIngrediente.getText());

            Utilitaria.imprimirEnVentanaInformativa(" Se agregaron\t " + this.txtCantidadAgregarIngrediente.getText() 
                                                    + " cantidades del ingrediente " + this.txtNombreCodigoAgregarIngrediente.getText(), "Atención");

            this.txtNombreCodigoAgregarIngrediente.setText("");
            this.txtCantidadAgregarIngrediente.setText("");
        }


    }//GEN-LAST:event_btnAceptarAgregarIngredienteActionPerformed

    private void txtCantidadAgregarIngredienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadAgregarIngredienteKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadAgregarIngredienteKeyTyped

    private void btnCancelarAgregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgregarIngredienteActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarAgregarIngredienteActionPerformed

    private void txtNombreCodigoAgregarIngredienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCodigoAgregarIngredienteKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCodigoAgregarIngredienteKeyTyped

    private void btnVerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInventarioActionPerformed
        FormVerInventarioIngrediente nene = new FormVerInventarioIngrediente();
        nene.setVisible(true);
    }//GEN-LAST:event_btnVerInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormAgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgregarIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarAgregarIngrediente;
    private javax.swing.JButton btnCancelarAgregarIngrediente;
    private javax.swing.JButton btnVerInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCantidadAgregarIngrediente;
    private javax.swing.JTextField txtNombreCodigoAgregarIngrediente;
    // End of variables declaration//GEN-END:variables
}
