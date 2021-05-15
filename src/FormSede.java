
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class FormSede extends javax.swing.JFrame {

    /**
     * Creates new form FormIngrediente
     */
    public FormSede() {
        initComponents();
        setResizable(false);
        actualizarListado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSedes = new javax.swing.JTable();
        btnActualizarListadoIngrediente = new javax.swing.JButton();
        btnBuscarXcodigoSede = new javax.swing.JButton();
        btnOrdenarXGrupoASC = new javax.swing.JButton();
        btnOrdenarXDescripcionASC = new javax.swing.JButton();
        btnBorrarSede = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingredientes");

        tblSedes.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        tblSedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Dirección", "Nombre Administrador", "Telefono", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSedes);

        btnActualizarListadoIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnActualizarListadoIngrediente.setText("Actualizar Listado");
        btnActualizarListadoIngrediente.setName(""); // NOI18N
        btnActualizarListadoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListadoIngredienteActionPerformed(evt);
            }
        });

        btnBuscarXcodigoSede.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnBuscarXcodigoSede.setText("Buscar X Codigo");
        btnBuscarXcodigoSede.setName(""); // NOI18N
        btnBuscarXcodigoSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarXcodigoSedeActionPerformed(evt);
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

        btnBorrarSede.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnBorrarSede.setText("Borrar Sede");
        btnBorrarSede.setName(""); // NOI18N
        btnBorrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSedeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizarListadoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnBorrarSede)
                .addGap(69, 69, 69)
                .addComponent(btnBuscarXcodigoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnOrdenarXGrupoASC)
                .addGap(45, 45, 45)
                .addComponent(btnOrdenarXDescripcionASC)
                .addContainerGap(169, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizarListadoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarXcodigoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdenarXGrupoASC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdenarXDescripcionASC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        setBounds(200, 200, 1124, 329);
    }// </editor-fold>//GEN-END:initComponents

    void actualizarListado() {

        DefaultTableModel tabla = (DefaultTableModel) this.tblSedes.getModel();

        for (int i = tabla.getRowCount() - 1; i >= 0; i--) {
            tabla.removeRow(i);
        }

        for (int i = 0; i < Test.sede.n_i; i++) {
            Object datos[] = {Test.sede.arr_i[i].getCodigo(),
                Test.sede.arr_i[i].getNombre(),
                Test.sede.arr_i[i].getDireccion(),
                Test.sede.arr_i[i].getNomAdministrador(),
                Test.sede.arr_i[i].getTelefono(),
                Test.sede.arr_i[i].getEstado()};

            tabla.addRow(datos);
        }
    }

    private void btnBuscarXcodigoSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarXcodigoSedeActionPerformed

        String cod = Utilitaria.leerCadena("Digite el código del Ingrediente a buscar:");

        int pos = Test.ai.buscarIngredienteXCodigo(cod);

        if (pos == -1) {
           
        } else {
            this.actualizarListado();
            Utilitaria.imprimirEnVentanaInformativa("Un (1) Ingrediente encontrado.", "Atención");

            this.tblSedes.changeSelection(pos, 1, false, false);

        }


    }//GEN-LAST:event_btnBuscarXcodigoSedeActionPerformed

    private void btnOrdenarXGrupoASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXGrupoASCActionPerformed

        Test.ai.ordenarXGrupoASC();
        this.actualizarListado();

    }//GEN-LAST:event_btnOrdenarXGrupoASCActionPerformed

    private void btnOrdenarXDescripcionASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXDescripcionASCActionPerformed

        Test.ai.ordenarXDescripcionASC();
        this.actualizarListado();
    }//GEN-LAST:event_btnOrdenarXDescripcionASCActionPerformed

    private void btnBorrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSedeActionPerformed

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

    }//GEN-LAST:event_btnBorrarSedeActionPerformed

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
    private javax.swing.JButton btnBorrarSede;
    private javax.swing.JButton btnBuscarXcodigoSede;
    private javax.swing.JButton btnOrdenarXDescripcionASC;
    private javax.swing.JButton btnOrdenarXGrupoASC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSedes;
    // End of variables declaration//GEN-END:variables
}
