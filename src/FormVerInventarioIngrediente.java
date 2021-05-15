
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class FormVerInventarioIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form FormIngrediente
     */
    public FormVerInventarioIngrediente() {
        initComponents();
        setResizable(false);
        actualizarListado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        btnActualizarListadoIngrediente = new javax.swing.JButton();

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

        btnActualizarListadoIngrediente.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        btnActualizarListadoIngrediente.setText("Actualizar Listado");
        btnActualizarListadoIngrediente.setName(""); // NOI18N
        btnActualizarListadoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListadoIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(btnActualizarListadoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarListadoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1124, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarListadoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarListadoIngredienteActionPerformed

        // Actualizar listado (llenar la tabla con los datos contenidos en el arreglo Test.ap.arr_p )
        this.actualizarListado();
    }//GEN-LAST:event_btnActualizarListadoIngredienteActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngredientes;
    // End of variables declaration//GEN-END:variables
}
