/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 *
 * @author Ing. Narvaez Mejia
 */
public class FrmClientes extends javax.swing.JFrame {

    /**
     * Creates new form FrmClientes
     */
    private DefaultTableModel dtm;
    private Object[] Cliente = new Object[4];
    private int filaSeleccionada;
    
    public FrmClientes() {
        initComponents();
        dtm = (DefaultTableModel) jTable1.getModel();
        cargarDatosClientes();
    }
 
    private void cargarDatosClientes() {
        try {
            // Conexión a la base de datos
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemarifas", 
                "root", 
                ""
            );
            String query = "SELECT * FROM usuarios";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Limpiar la tabla antes de cargar datos nuevos
            dtm.setRowCount(0);

            while (rs.next()) {
                // Agregar datos de la base al modelo de tabla
                dtm.addRow(new Object[]{
                    rs.getString("Nombre"),
                    rs.getString("apellido"),
                    rs.getString("direccion"),
                    rs.getString("telefono"),
                    rs.getString("correo")                
                });
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    


}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTRACION DE CLIENTES");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CREACION DE CLIENTES");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("DIRECCION:");

        jLabel5.setText("TELEFONO:");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Direccion", "Telefono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCargar.setText("CARGAR");
        btnCargar.setEnabled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("CORREO:");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtDireccion))
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCargar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
  String nombre = txtNombre.getText();
    String apellido = txtApellido.getText();
    String direccion = txtDireccion.getText();
    String telefono = txtTelefono.getText();
    String correo = txtCorreo.getText(); // Incluimos el correo

    // Validación de campos vacíos
    if (nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;  // Salir del método si algún campo está vacío
    }

    // Agregar los datos a la tabla (si quieres que se muestre en la JTable también)
    String[] Cliente = {nombre, apellido, direccion, telefono, correo}; // Incluimos correo en la tabla
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
    dtm.addRow(Cliente);  // Asegúrate de que jTable1 esté configurado correctamente

    // Guardar los datos en la base de datos
    try {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemarifas", // Asegúrate de que la base de datos sea correcta
                "root", // Usuario de la base de datos
                "" // Contraseña de la base de datos
        );
        System.out.println("Conexión exitosa a la base de datos");

        // Consulta SQL con correo
        String query = "INSERT INTO usuarios (nombre, apellido, direccion, telefono, correo) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nombre);
        ps.setString(2, apellido);
        ps.setString(3, direccion);
        ps.setString(4, telefono);
        ps.setString(5, correo);  // Agregar correo a la inserción

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Cliente guardado exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();  // Imprime detalles del error en consola
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Limpiar los campos de texto
    txtNombre.setText("");
    txtApellido.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    txtCorreo.setText("");  // Limpiar el campo de correo
    txtNombre.requestFocus();

    // Habilitar los botones
    btnCargar.setEnabled(true);
    btnEliminar.setEnabled(true);

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
   // Verificar si se ha seleccionado una fila en la JTable
    if (jTable1.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningún registro en la tabla", 
                                      "Error al cargar registro", JOptionPane.WARNING_MESSAGE);
    } else {
        // Obtener la fila seleccionada
        filaSeleccionada = jTable1.getSelectedRow();
        
        // Cargar los datos de la fila seleccionada en los campos de texto
        txtNombre.setText(dtm.getValueAt(filaSeleccionada, 0).toString());
        txtApellido.setText(dtm.getValueAt(filaSeleccionada, 1).toString());
        txtDireccion.setText(dtm.getValueAt(filaSeleccionada, 2).toString());
        txtTelefono.setText(dtm.getValueAt(filaSeleccionada, 3).toString());
        txtCorreo.setText(dtm.getValueAt(filaSeleccionada, 4).toString()); // Añadir correo si lo necesitas

        // Establecer el foco en el campo de nombre
        txtNombre.requestFocus();
        
        // Deshabilitar el botón de "Guardar" y "Cargar"
        btnGuardar.setEnabled(false);
        btnCargar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        // Habilitar el botón de "Modificar"
        btnModificar.setEnabled(true);
    }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "No ha seleccionado un registro en la tabla para modificar", 
                                      "Error al modificar", JOptionPane.WARNING_MESSAGE);
        return; // Si no se seleccionó ninguna fila, salir del método
    }

    // Obtener los datos modificados desde los campos de texto
    String nombre = txtNombre.getText().trim();
    String apellido = txtApellido.getText().trim();
    String direccion = txtDireccion.getText().trim();
    String telefono = txtTelefono.getText().trim();
    String correo = txtCorreo.getText().trim(); // Asumimos que tienes un campo txtCorreo para el correo

    // Actualizar la tabla con los nuevos datos
    dtm.setValueAt(nombre, filaSeleccionada, 0);
    dtm.setValueAt(apellido, filaSeleccionada, 1);
    dtm.setValueAt(direccion, filaSeleccionada, 2);
    dtm.setValueAt(telefono, filaSeleccionada, 3);
    dtm.setValueAt(correo, filaSeleccionada, 4);  // Asumimos que el correo está en la columna 4

    // Obtener el ID de la fila seleccionada (si está en la primera columna como Integer)
    int id = -1;
    try {
        // Intentar convertir el valor de la primera columna a Integer
        id = Integer.parseInt(dtm.getValueAt(filaSeleccionada, 0).toString());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: El ID no es un número válido.", 
                                      "Error al modificar", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Actualizar la base de datos
    try {
        // Crear la conexión con la base de datos
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemarifas", 
                "root", 
                "" // Ajusta la contraseña según sea necesario
        );
        
        // Crear la consulta SQL para actualizar los datos
        String query = "UPDATE usuarios SET nombre = ?, apellido = ?, direccion = ?, telefono = ?, correo = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, nombre);
        ps.setString(2, apellido);
        ps.setString(3, direccion);
        ps.setString(4, telefono);
        ps.setString(5, correo);  
        ps.setInt(6, id);  
        
        // Ejecutar la actualización
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            // Si la actualización fue exitosa, mostrar mensaje
            JOptionPane.showMessageDialog(this, "Cliente modificado exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si no se afectaron filas, mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Error al modificar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Cerrar la conexión
        ps.close();
        con.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), 
                                      "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Limpiar los campos de texto
    txtNombre.setText("");
    txtApellido.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    txtCorreo.setText(""); // Limpiar el campo de correo también
    txtNombre.requestFocus();
    
    // Habilitar botones
    btnGuardar.setEnabled(true);
    btnCargar.setEnabled(true);
    btnEliminar.setEnabled(true);
    btnModificar.setEnabled(false); // Deshabilitar el botón "Modificar"
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    // Verificar si se seleccionó una fila
    if (jTable1.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(null, 
                                      "No ha seleccionado ningún registro.", 
                                      "ERROR", 
                                      JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Confirmación de eliminación
    int confirm = JOptionPane.showConfirmDialog(null, 
                                                "¿Está seguro de que desea eliminar este usuario?", 
                                                "Confirmación", 
                                                JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Obtener el índice de la fila seleccionada
            int selectedRow = jTable1.getSelectedRow();
            
            // Obtener el valor del campo "correo" (por ejemplo, columna 2 en la JTable)
            String correo = jTable1.getValueAt(selectedRow, 2).toString(); 

            // Conexión a la base de datos
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemarifas", 
                                                          "root", "");

            // Consulta SQL para eliminar el registro basado en "correo"
            String query = "DELETE FROM usuarios WHERE correo = ?";
            PreparedStatement pst = con.prepareStatement(query);

            // Configurar el PreparedStatement con el valor del correo
            pst.setString(1, correo);

            // Ejecutar la consulta
            int rowsAffected = pst.executeUpdate();

            // Verificar si la eliminación fue exitosa
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, 
                                              "Usuario eliminado exitosamente.");
                
                // Eliminar la fila de la JTable
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(null, 
                                              "No se pudo eliminar el usuario. Verifique el correo.", 
                                              "ERROR", 
                                              JOptionPane.ERROR_MESSAGE);
            }

            // Cerrar la conexión y el PreparedStatement
            pst.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                                          "Error al intentar eliminar el usuario: " + e.getMessage(), 
                                          "ERROR", 
                                          JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientes().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
