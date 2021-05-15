

import javax.swing.table.*;

public class FormPlato extends javax.swing.JFrame {
    Object tlbPlatos;

    
    public FormPlato() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlatos = new javax.swing.JTable();
        btnNuevoPlato = new javax.swing.JButton();
        btnActualizarListadoPlato = new javax.swing.JButton();
        btnBuscarXcodigoPlato = new javax.swing.JButton();
        btnOrdenarXGrupoASC = new javax.swing.JButton();
        btnOrdenarXDescripcionASC = new javax.swing.JButton();
        btnBorrarPlato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Platos");

        tblPlatos.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        tblPlatos.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Nombre", "Descripcion", "Precio", "Ingredientes", "Cant. Ingredientes", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPlatos);

        btnNuevoPlato.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnNuevoPlato.setText("Nuevo Plato");
        btnNuevoPlato.setName(""); // NOI18N
        btnNuevoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPlatoActionPerformed(evt);
            }
        });

        btnActualizarListadoPlato.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnActualizarListadoPlato.setText("Actualizar Listado");
        btnActualizarListadoPlato.setName(""); // NOI18N
        btnActualizarListadoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListadoPlatoActionPerformed(evt);
            }
        });

        btnBuscarXcodigoPlato.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnBuscarXcodigoPlato.setText("Buscar X Codigo");
        btnBuscarXcodigoPlato.setName(""); // NOI18N
        btnBuscarXcodigoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarXcodigoPlatoActionPerformed(evt);
            }
        });

        btnOrdenarXGrupoASC.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnOrdenarXGrupoASC.setText("Ordenar X Precio ASC");
        btnOrdenarXGrupoASC.setToolTipText("");
        btnOrdenarXGrupoASC.setName(""); // NOI18N
        btnOrdenarXGrupoASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXGrupoASCActionPerformed(evt);
            }
        });

        btnOrdenarXDescripcionASC.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnOrdenarXDescripcionASC.setText("Ordenar X Nombre DESC");
        btnOrdenarXDescripcionASC.setName(""); // NOI18N
        btnOrdenarXDescripcionASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXDescripcionASCActionPerformed(evt);
            }
        });

        btnBorrarPlato.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnBorrarPlato.setText("Borrar Plato");
        btnBorrarPlato.setName(""); // NOI18N
        btnBorrarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizarListadoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnBorrarPlato)
                .addGap(75, 75, 75)
                .addComponent(btnBuscarXcodigoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrdenarXGrupoASC)
                .addGap(35, 35, 35)
                .addComponent(btnOrdenarXDescripcionASC)
                .addContainerGap(94, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarListadoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarXcodigoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarXGrupoASC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarXDescripcionASC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(200, 200, 1115, 329);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPlatoActionPerformed

        FormCrearIngrediente x = new FormCrearIngrediente();
        x.setVisible(true);
    }//GEN-LAST:event_btnNuevoPlatoActionPerformed

    void actualizarListado() {

        DefaultTableModel tabla = (DefaultTableModel) this.tblPlatos.getModel();

        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            tabla.removeRow(i);
        }

        for (int i = 0; i < Test.menu.n_i; i++) {
            Object datos[] = {Test.ai.arr_i[i].getCodigo(),
                Test.menu.arr_i[i].getNombre(),
                Test.menu.arr_i[i].getDescripcion(),
                Test.menu.arr_i[i].getPrecio(),
                Test.menu.arr_i[i].getEstado()};

            tabla.addRow(datos);
        }
    }

    private void btnActualizarListadoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarListadoPlatoActionPerformed

        // Actualizar listado (llenar la tabla con los datos contenidos en el arreglo Test.ap.arr_p )
        this.actualizarListado();
    }//GEN-LAST:event_btnActualizarListadoPlatoActionPerformed

    private void btnBuscarXcodigoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarXcodigoPlatoActionPerformed

        String cod = Utilitaria.leerCadena("Digite el código del Ingrediente a buscar:");

        int pos = Test.ai.buscarIngredienteXCodigo(cod);

        if (pos == -1) {
            Utilitaria.imprimirEnVentanaInformativa("El código " + cod + " no se encuentra registrado.", "Atención");
        } else {
            this.actualizarListado();
            Utilitaria.imprimirEnVentanaInformativa("Un (1) Ingrediente encontrado.", "Atención");

            this.tblPlatos.changeSelection(pos, 1, false, false);

        }


    }//GEN-LAST:event_btnBuscarXcodigoPlatoActionPerformed

    private void btnOrdenarXGrupoASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXGrupoASCActionPerformed

        Test.ai.ordenarXGrupoASC();
        this.actualizarListado();

    }//GEN-LAST:event_btnOrdenarXGrupoASCActionPerformed

    private void btnOrdenarXDescripcionASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXDescripcionASCActionPerformed

        Test.ai.ordenarXDescripcionASC();
        this.actualizarListado();
    }//GEN-LAST:event_btnOrdenarXDescripcionASCActionPerformed

    private void btnBorrarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPlatoActionPerformed
    
        String cod = Utilitaria.leerCadena("Digite código del ingrediente a borrar:");        
         if(Utilitaria.validarCadenaVacia(cod))
                 Utilitaria.imprimirEnVentanaInformativa("Debe digitar un código", "Atención");
         else{
             Utilitaria.leerCadena("Digite código del ingrediente a borrar:");
         }          
       
         int pos = Test.ai.buscarIngredienteXCodigo(cod);            
             Test.ai.eliminarIngrediente(pos);       
        
            this.actualizarListado();
            Utilitaria.imprimirEnVentanaInformativa("Un (1) Ingrediente borrado.", "Atención");
        
    }//GEN-LAST:event_btnBorrarPlatoActionPerformed

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
    private javax.swing.JButton btnActualizarListadoPlato;
    private javax.swing.JButton btnBorrarPlato;
    private javax.swing.JButton btnBuscarXcodigoPlato;
    private javax.swing.JButton btnNuevoPlato;
    private javax.swing.JButton btnOrdenarXDescripcionASC;
    private javax.swing.JButton btnOrdenarXGrupoASC;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblPlatos;
    // End of variables declaration//GEN-END:variables

   
    
}
