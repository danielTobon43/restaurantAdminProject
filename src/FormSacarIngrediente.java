
import java.awt.Toolkit;

public class FormSacarIngrediente extends javax.swing.JFrame {

    public FormSacarIngrediente() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCantidadSacarIngrediente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCodigoSacarIngrediente = new javax.swing.JTextField();
        btnAceptarSacarIngrediente = new javax.swing.JButton();
        btnCancelarSacarIngrediente = new javax.swing.JButton();
        btnVerInventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sacar Ingrediente");
        setName("AgregarIngrediente"); // NOI18N

        txtCantidadSacarIngrediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadSacarIngredienteKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad Ingrediente:");

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel2.setText("Código:");

        txtNombreCodigoSacarIngrediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCodigoSacarIngredienteKeyTyped(evt);
            }
        });

        btnAceptarSacarIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnAceptarSacarIngrediente.setText("Aceptar");
        btnAceptarSacarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarSacarIngredienteActionPerformed(evt);
            }
        });

        btnCancelarSacarIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnCancelarSacarIngrediente.setText("Cancelar");
        btnCancelarSacarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSacarIngredienteActionPerformed(evt);
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
                    .addComponent(btnCancelarSacarIngrediente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptarSacarIngrediente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCodigoSacarIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(txtCantidadSacarIngrediente))
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
                    .addComponent(txtNombreCodigoSacarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidadSacarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarSacarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarSacarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarSacarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarSacarIngredienteActionPerformed

        if (Utilitaria.validarCadenaVacia(this.txtNombreCodigoSacarIngrediente.getText())
                && Utilitaria.validarCadenaVacia(this.txtCantidadSacarIngrediente.getText())) {
            Utilitaria.imprimirEnVentanaInformativa("Debe digitar:\n * Nombre\n"
                    + " * Cantidad\n", "Atención");
            this.txtNombreCodigoSacarIngrediente.requestFocus();
        } else if (Utilitaria.validarCadenaVacia(this.txtNombreCodigoSacarIngrediente.getText())) {
            Utilitaria.imprimirEnVentanaInformativa("Debe digitar el nombre o código del ingrediente a sacar", "Atención");
            this.txtNombreCodigoSacarIngrediente.requestFocus();

        } else if (Utilitaria.validarCadenaVacia(this.txtCantidadSacarIngrediente.getText())) {
            Utilitaria.imprimirEnVentanaInformativa("Debe digitar la cantidad de ingrediente a sacar", "Atención");
            this.txtCantidadSacarIngrediente.requestFocus();
        } else {

            String cad = (this.txtNombreCodigoSacarIngrediente.getText());
            int pos = Test.ai.buscarIngredienteXCodigo(cad);

            if (Integer.parseInt(this.txtCantidadSacarIngrediente.getText()) > Test.ai.arr_i[pos].stock) {
                Utilitaria.imprimirEnVentanaInformativa("\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t " 
                        + " ¡ Lo siento !\n \t No puede sacar mas de la cantidad existente en la bodega", "Atención");
            } else {
                Test.ai.arr_i[pos].stock = Test.ai.arr_i[pos].stock - Integer.parseInt(this.txtCantidadSacarIngrediente.getText());
                Utilitaria.imprimirEnVentanaInformativa(" Salieron \t " + this.txtCantidadSacarIngrediente.getText()
                        + " cantidades del ingrediente " + this.txtNombreCodigoSacarIngrediente.getText(), "Atención");
            }

            this.txtNombreCodigoSacarIngrediente.setText("");
            this.txtCantidadSacarIngrediente.setText("");
        }


    }//GEN-LAST:event_btnAceptarSacarIngredienteActionPerformed

    private void txtCantidadSacarIngredienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadSacarIngredienteKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadSacarIngredienteKeyTyped

    private void btnCancelarSacarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSacarIngredienteActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarSacarIngredienteActionPerformed

    private void txtNombreCodigoSacarIngredienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCodigoSacarIngredienteKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCodigoSacarIngredienteKeyTyped

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
    private javax.swing.JButton btnAceptarSacarIngrediente;
    private javax.swing.JButton btnCancelarSacarIngrediente;
    private javax.swing.JButton btnVerInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCantidadSacarIngrediente;
    private javax.swing.JTextField txtNombreCodigoSacarIngrediente;
    // End of variables declaration//GEN-END:variables
}
