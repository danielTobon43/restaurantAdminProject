
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class FormGrupoAlimentos extends javax.swing.JFrame {

    /**
     * Creates new form FormIngrediente
     */
    public FormGrupoAlimentos() {
        initComponents();
        setResizable(false);
        actualizarListado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGruposAlimentos = new javax.swing.JTable();
        btnNuevoGrupoAlimento = new javax.swing.JButton();
        btnActualizarListadoGrupoAlimento = new javax.swing.JButton();
        btnOrdenarXCodigoDESC = new javax.swing.JButton();
        btnOrdenarXNombreDESC = new javax.swing.JButton();
        btnBorrarGrupo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grupos de Alimentos");
        setResizable(false);

        tblGruposAlimentos.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        tblGruposAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGruposAlimentos);

        btnNuevoGrupoAlimento.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnNuevoGrupoAlimento.setText("Nuevo Grupo de Alimento");
        btnNuevoGrupoAlimento.setName(""); // NOI18N
        btnNuevoGrupoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoGrupoAlimentoActionPerformed(evt);
            }
        });

        btnActualizarListadoGrupoAlimento.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnActualizarListadoGrupoAlimento.setText("Actualizar Listado");
        btnActualizarListadoGrupoAlimento.setName(""); // NOI18N
        btnActualizarListadoGrupoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListadoGrupoAlimentoActionPerformed(evt);
            }
        });

        btnOrdenarXCodigoDESC.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnOrdenarXCodigoDESC.setText("Ordenar X Código DESC");
        btnOrdenarXCodigoDESC.setToolTipText("");
        btnOrdenarXCodigoDESC.setName(""); // NOI18N
        btnOrdenarXCodigoDESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXCodigoDESCActionPerformed(evt);
            }
        });

        btnOrdenarXNombreDESC.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnOrdenarXNombreDESC.setText("Ordenar X Nombre DESC");
        btnOrdenarXNombreDESC.setName(""); // NOI18N
        btnOrdenarXNombreDESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXNombreDESCActionPerformed(evt);
            }
        });

        btnBorrarGrupo.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnBorrarGrupo.setText("Borrar Grupo de Alimento");
        btnBorrarGrupo.setName(""); // NOI18N
        btnBorrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnActualizarListadoGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnNuevoGrupoAlimento)
                .addGap(37, 37, 37)
                .addComponent(btnBorrarGrupo)
                .addGap(34, 34, 34)
                .addComponent(btnOrdenarXCodigoDESC)
                .addGap(38, 38, 38)
                .addComponent(btnOrdenarXNombreDESC)
                .addContainerGap(133, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarListadoGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarXCodigoDESC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarXNombreDESC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(200, 200, 1124, 329);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoGrupoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoGrupoAlimentoActionPerformed

        FormCrearGrupoAlimento x = new FormCrearGrupoAlimento();
        x.setVisible(true);
    }//GEN-LAST:event_btnNuevoGrupoAlimentoActionPerformed

    void actualizarListado() {

        DefaultTableModel tabla = (DefaultTableModel) this.tblGruposAlimentos.getModel();

        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            tabla.removeRow(i);
        }

        for (int i = 0; i <  Test.grupo.n_i; i++) {
            Object datos[] = {Test.grupo.arr_i[i].codigo,
                              Test.grupo.arr_i[i].nombreGrupoAlimento};
            
           

            tabla.addRow(datos);
        }
    }

    private void btnOrdenarXCodigoDESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXCodigoDESCActionPerformed

        Test.grupo.ordenarXCodigoDESC();
        this.actualizarListado();

    }//GEN-LAST:event_btnOrdenarXCodigoDESCActionPerformed

    private void btnOrdenarXNombreDESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXNombreDESCActionPerformed

        Test.grupo.ordenarXNombreDESC();
        this.actualizarListado();
    }//GEN-LAST:event_btnOrdenarXNombreDESCActionPerformed

    private void btnBorrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarGrupoActionPerformed

        String cod = Utilitaria.leerCadena("Digite el código del grupo de alimento a borrar:");
        int pos = Test.grupo.buscarIngredienteXCodigo(cod);
        if (pos == -1) {
            
        }else if(Utilitaria.validarCadenaVacia(cod)){
            Utilitaria.imprimir("Debe digitar un código valido");
        }else{

        
        Test.grupo.eliminarGrupoAlimento(pos);

        this.actualizarListado();
        Utilitaria.imprimirEnVentanaInformativa("Un (1) Grupo borrado.", "Atención");
        }

    }//GEN-LAST:event_btnBorrarGrupoActionPerformed

    private void btnActualizarListadoGrupoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarListadoGrupoAlimentoActionPerformed

       
        this.actualizarListado();
    }//GEN-LAST:event_btnActualizarListadoGrupoAlimentoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introducod in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(FormIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIngrediente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarListadoGrupoAlimento;
    private javax.swing.JButton btnBorrarGrupo;
    private javax.swing.JButton btnNuevoGrupoAlimento;
    private javax.swing.JButton btnOrdenarXCodigoDESC;
    private javax.swing.JButton btnOrdenarXNombreDESC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGruposAlimentos;
    // End of variables declaration//GEN-END:variables
}
