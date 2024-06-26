package Forms;
import Clases.Agregar;
import Clases.Busqueda;
import Clases.Editar;
import Clases.Eliminar;
import Clases.Usuario;
import Clases.UsuarioLogIn;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.TransformerException;
public class Usuarios extends javax.swing.JFrame {

 
    private DefaultTableModel modelo;
    private UsuarioLogIn usuarioLogIn;
    
    public Usuarios(UsuarioLogIn usuarioLogIn) {
        initComponents();
        this.usuarioLogIn = usuarioLogIn;
        modelo = (DefaultTableModel) jTable1.getModel();
        obtenerdatostabla();
        verificarTipoAcceso();
    }
  
    private void verificarTipoAcceso(){
        
            if (usuarioLogIn.getUsuario().getTipoAcceso()) {
           BtnModifcarAcceso.setEnabled(true);
           
           
            
        }else{
            BtnModifcarAcceso.setEnabled(false);
        }
    }
    
    private void obtenerdatostabla(){
        try {
            
            Busqueda busqueda = new Busqueda();
            Object[] usuarios = busqueda.obtenerTodosLosUsuario();
            for(Object usuario : usuarios){
                modelo.addRow((Object[]) usuario);
            }
        } catch(SQLException e){
            e.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        BtnModifcarAcceso = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnCambiatUsuario = new javax.swing.JButton();
        BtnCambiarContraseña = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnModifcarAcceso.setBackground(new java.awt.Color(68, 180, 138));
        BtnModifcarAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder/icons8-análisis-de-stock-20.png"))); // NOI18N
        BtnModifcarAcceso.setText("Modificar acceso");
        BtnModifcarAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifcarAccesoActionPerformed(evt);
            }
        });

        BtnMenu.setBackground(new java.awt.Color(68, 180, 138));
        BtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder/icons8-almacén-20.png"))); // NOI18N
        BtnMenu.setText("Volver al menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Tipo de acceso"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        BtnCambiatUsuario.setBackground(new java.awt.Color(68, 180, 138));
        BtnCambiatUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder/icons8-añadir-usuario-tipo-de-piel-masculina-7-20.png"))); // NOI18N
        BtnCambiatUsuario.setText("Cambiar tu usuario");
        BtnCambiatUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiatUsuarioActionPerformed(evt);
            }
        });

        BtnCambiarContraseña.setBackground(new java.awt.Color(68, 180, 138));
        BtnCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder/Copia de icons8-análisis-de-stock-20.png"))); // NOI18N
        BtnCambiarContraseña.setText("Cambiar tu contraseña");
        BtnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiarContraseñaActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(68, 180, 138));

        jMenu1.setText("AGREGAR");

        jMenu3.setText("Agregar nuevo usuario");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu5.setText("Agregar Administrador");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("ELIMINAR");

        jMenu7.setText("Eliminar Usuario");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenu7);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnModifcarAcceso)
                        .addGap(85, 85, 85)
                        .addComponent(BtnMenu)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCambiatUsuario)
                .addGap(56, 56, 56)
                .addComponent(BtnCambiarContraseña)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCambiatUsuario)
                    .addComponent(BtnCambiarContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenu)
                    .addComponent(BtnModifcarAcceso))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModifcarAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifcarAccesoActionPerformed
        // TODO add your handling code here:
        int filaseleccionada = jTable1.getSelectedRow();
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Deseas cambiar el tipo de acceso ?");
        if(filaseleccionada != -1 && confirmacion == JOptionPane.YES_OPTION){
            String usuarioSeleccionado = (String) modelo.getValueAt(filaseleccionada, 0);
            Boolean usuarioAcceso = (Boolean) modelo.getValueAt(filaseleccionada, 1);
            Usuario usuario = new Usuario(usuarioSeleccionado);
            Editar editar = new Editar(); 
            try {
                editar.editarUsuarioAcceso(usuario, !usuarioAcceso);
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BtnModifcarAccesoActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        try {
            // TODO add your handling code here:
            Main principal = new Main(usuarioLogIn);
            principal.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnCambiatUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiatUsuarioActionPerformed
        // TODO add your handling code here:
        String nuevoUsuario = JOptionPane.showInputDialog("Nombre de Usuario Nuevo");
        Editar edicion = new Editar();
        Usuario usuario = new Usuario(nuevoUsuario, usuarioLogIn.getUsuario().getContrasena(), usuarioLogIn.getUsuario().getTipoAcceso());
        try {
            edicion.editarUsuarioCompleto(usuarioLogIn.getUsuario(), usuario);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCambiatUsuarioActionPerformed

    private void BtnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiarContraseñaActionPerformed
        String nuevaContrasena = JOptionPane.showInputDialog("Contraseña de Usuario Nuevo");
        Editar edicion = new Editar();
        Usuario usuario = new Usuario(usuarioLogIn.getUsuario().getUsuario(), nuevaContrasena,usuarioLogIn.getUsuario().getTipoAcceso());
        try {
            edicion.editarUsuarioCompleto(usuarioLogIn.getUsuario(), usuario);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCambiarContraseñaActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario a crear");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del usuario a agregar");
        
        Agregar agregar = new Agregar();
        
        Usuario usuarioNuevo = new Usuario(usuario, contrasena, false);
        
        try {
            agregar.agregarUsuario(usuarioNuevo);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario a crear");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del usuario a agregar");
        
        Agregar agregar = new Agregar();
        
        Usuario usuarioNuevo = new Usuario(usuario, contrasena, true);
        
        try {
            agregar.agregarUsuario(usuarioNuevo);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre del Usuario que va a eliminar");
        
        Eliminar eliminar = new Eliminar();
        try {
            eliminar.eliminarUsuario(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu7ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCambiarContraseña;
    private javax.swing.JButton BtnCambiatUsuario;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnModifcarAcceso;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
