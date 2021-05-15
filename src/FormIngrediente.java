
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class FormIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form FormIngrediente
     */
    public FormIngrediente() {
        initComponents();
        setResizable(false);
        actualizarListado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        btnNuevoIngrediente = new javax.swing.JButton();
        btnActualizarListadoIngrediente = new javax.swing.JButton();
        btnBuscarXcodigoIngrediente = new javax.swing.JButton();
        btnOrdenarXGrupoASC = new javax.swing.JButton();
        btnOrdenarXDescripcionASC = new javax.swing.JButton();
        btnBorrarIngrediente = new javax.swing.JButton();
        btnAgregarIngrediente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingredientes");

        tblIngredientes.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Unidad de Medida", "Costo", "Stock", "Grupo Alimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblIngredientes);

        btnNuevoIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnNuevoIngrediente.setText("Nuevo Ingrediente");
        btnNuevoIngrediente.setName(""); // NOI18N
        btnNuevoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoIngredienteActionPerformed(evt);
            }
        });

        btnActualizarListadoIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnActualizarListadoIngrediente.setText("Actualizar Listado");
        btnActualizarListadoIngrediente.setName(""); // NOI18N
        btnActualizarListadoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListadoIngredienteActionPerformed(evt);
            }
        });

        btnBuscarXcodigoIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnBuscarXcodigoIngrediente.setText("Buscar X Codigo");
        btnBuscarXcodigoIngrediente.setName(""); // NOI18N
        btnBuscarXcodigoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarXcodigoIngredienteActionPerformed(evt);
            }
        });

        btnOrdenarXGrupoASC.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnOrdenarXGrupoASC.setText("Ordenar X Grupo ASC");
        btnOrdenarXGrupoASC.setToolTipText("");
        btnOrdenarXGrupoASC.setName(""); // NOI18N
        btnOrdenarXGrupoASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXGrupoASCActionPerformed(evt);
            }
        });

        btnOrdenarXDescripcionASC.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnOrdenarXDescripcionASC.setText("Ordenar X Descripcion ASC");
        btnOrdenarXDescripcionASC.setName(""); // NOI18N
        btnOrdenarXDescripcionASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXDescripcionASCActionPerformed(evt);
            }
        });

        btnBorrarIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnBorrarIngrediente.setText("Borrar Ingrediente");
        btnBorrarIngrediente.setName(""); // NOI18N
        btnBorrarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarIngredienteActionPerformed(evt);
            }
        });

        btnAgregarIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnAgregarIngrediente.setText("Agregar Ingrediente");
        btnAgregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizarListadoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoIngrediente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrarIngrediente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarXcodigoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdenarXGrupoASC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdenarXDescripcionASC)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarListadoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarXcodigoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarXGrupoASC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarXDescripcionASC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(200, 200, 1124, 329);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoIngredienteActionPerformed

        FormCrearIngrediente x = new FormCrearIngrediente();
        x.setVisible(true);
    }//GEN-LAST:event_btnNuevoIngredienteActionPerformed

    void actualizarListado() {

        DefaultTableModel tabla = (DefaultTableModel) this.tblIngredientes.getModel();

        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            tabla.removeRow(i);
        }

        for (int i = 0; i < Test.ai.n_i; i++) {
            Object datos[] = {Test.ai.arr_i[i].getCodigo(),
                Test.ai.arr_i[i].getNombre(),
                Test.ai.arr_i[i].getDescripcion(),
                Test.ai.arr_i[i].getUnidadMedida(),
                Test.ai.arr_i[i].getCosto(),
                Test.ai.arr_i[i].getStock(),
                Test.ai.arr_i[i].getGrupoAlimento()};

            tabla.addRow(datos);
        }
    }

    private void btnBuscarXcodigoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarXcodigoIngredienteActionPerformed

        String cod = Utilitaria.leerCadena("Digite el código del Ingrediente a buscar:");

        int pos = Test.ai.buscarIngredienteXCodigo(cod);

        if (pos == -1) {
           
        } else {
            this.actualizarListado();
            Utilitaria.imprimirEnVentanaInformativa("Un (1) Ingrediente encontrado.", "Atención");

            this.tblIngredientes.changeSelection(pos, 1, false, false);

        }


    }//GEN-LAST:event_btnBuscarXcodigoIngredienteActionPerformed

    private void btnOrdenarXGrupoASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXGrupoASCActionPerformed

        Test.ai.ordenarXGrupoASC();
        this.actualizarListado();

    }//GEN-LAST:event_btnOrdenarXGrupoASCActionPerformed

    private void btnOrdenarXDescripcionASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXDescripcionASCActionPerformed

        Test.ai.ordenarXDescripcionASC();
        this.actualizarListado();
    }//GEN-LAST:event_btnOrdenarXDescripcionASCActionPerformed

    private void btnBorrarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarIngredienteActionPerformed

        String cod = Utilitaria.leerCadena("Digite código del ingrediente a borrar:");
        int pos = Test.ai.buscarIngredienteXCodigo(cod);
        if (pos == -1) {
            
        } else if(Utilitaria.validarCadenaVacia(cod)){
            Utilitaria.imprimir("Debe digitar un código valido");
        }else{
            
        
        Test.ai.eliminarIngrediente(pos);

        this.actualizarListado();
        Utilitaria.imprimirEnVentanaInformativa("Un (1) Ingrediente borrado.", "Atención");
        }

    }//GEN-LAST:event_btnBorrarIngredienteActionPerformed

    private void btnAgregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIngredienteActionPerformed
        FormAgregarIngrediente p = new FormAgregarIngrediente();
        p.setVisible(true);
    }//GEN-LAST:event_btnAgregarIngredienteActionPerformed

    private void btnActualizarListadoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarListadoIngredienteActionPerformed

        // Actualizar listado (llenar la tabla con los datos contenidos en el arreglo Test.ap.arr_p )
        this.actualizarListado();
    }//GEN-LAST:event_btnActualizarListadoIngredienteActionPerformed

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
    private javax.swing.JButton btnActualizarListadoIngrediente;
    private javax.swing.JButton btnAgregarIngrediente;
    private javax.swing.JButton btnBorrarIngrediente;
    private javax.swing.JButton btnBuscarXcodigoIngrediente;
    private javax.swing.JButton btnNuevoIngrediente;
    private javax.swing.JButton btnOrdenarXDescripcionASC;
    private javax.swing.JButton btnOrdenarXGrupoASC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngredientes;
    // End of variables declaration//GEN-END:variables
}
