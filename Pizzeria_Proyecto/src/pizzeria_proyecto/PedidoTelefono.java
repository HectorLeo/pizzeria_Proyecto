/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria_proyecto;

import BDD.ConexionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author snakt
 */
public class PedidoTelefono extends javax.swing.JFrame {

    /**
     * Creates new form PedidoTelefono
     */
    public PedidoTelefono() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    void limpia_datos(){
        jTextFieldNombreCliente.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldDireccion.setText("");
        
    }
    
    void mostrar_datos(){
  
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("NombreC");
    modelo.addColumn("Telefono");
    modelo.addColumn("Direccion");
    
    
    //jTable1.setModel(modelo);
    String sql = "select * from ptelefono";
    String datos[]= new String [3];
    
        //Statement st;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                //datos[3]=rs.getString(4);
                //datos[4]=rs.getString(5);
             
                        
                modelo.addRow(datos);
            }
             //jTable1.setModel(modelo);
             } catch (SQLException ex) {
            Logger.getLogger(PedidoTelefono.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    
    
    public boolean  verificar(String Id) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/pizzeria","root","");       
        Statement statement= cn.createStatement();
        Statement Consul = cn.createStatement();
        String veri="";
        ResultSet sql = Consul.executeQuery("SELECT Id FROM ptelefono where Id='"+Id+"';");
        while (sql.next()){
            veri=sql.getString(1);
           }
        
        return veri.length() <= 0;
       }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDtelefono = new javax.swing.JTable();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFielID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(" Nombre del Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setText("Teléfono");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 94, -1, -1));

        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 143, -1, -1));

        jTableDtelefono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableDtelefono);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 193, 422, 100));
        getContentPane().add(jTextFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 51, 210, -1));
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 91, 148, -1));
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 140, 210, -1));

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAceptarMouseClicked(evt);
            }
        });
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 352, -1, -1));

        jButtonCancelar.setText("Cancelar");
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 352, -1, -1));

        jButtonRegresar.setText("Regresar");
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 352, -1, -1));

        jButtonMenu.setText("Menú");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 139, -1, -1));

        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jTextFielID.setEnabled(false);
        getContentPane().add(jTextFielID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseClicked
        // TODO add your handling code here:
        try {
            PreparedStatement pps = cn.prepareStatement("insert into ptelefono(NombreC, Telefono, Direccion) values (?,?,?)");
                    
            /*if(Id.getText().length()==0)
            {        
             
                pps.setString(1, Id.getText());       
                Error.setVisible(true);
                //Error.setText("Campo clave producto vacio");
               
                JOptionPane.showMessageDialog(null, "ID vacio");         
            }                 
            else */if(jTextFieldNombreCliente.getText().length()==0)
            {                
                pps.setString(1, jTextFieldNombreCliente.getText());
                //Error.setVisible(true);
                //Error.setText("Campo clave producto vacio");
                JOptionPane.showMessageDialog(null, "Nombre vacio");
            }     
            else if(jTextFieldTelefono.getText().length()==0)
            {             
                 pps.setString(2, jTextFieldTelefono.getText());
                 //Error.setVisible(true);
                 //Error.setText("Campo clave producto vacio");
                 JOptionPane.showMessageDialog(null, "Teléfono vacio vacio");
            }
            
            else if(jTextFieldDireccion.getText().length()==0)
            {                
                 pps.setString(3, jTextFieldDireccion.getText());
                 //Error.setVisible(true);
                 //Error.setText("Campo clave producto vacio");
                 JOptionPane.showMessageDialog(null, "Dirección vacia");
            }
            
            
            else{
                        //pps.setString(1, Id.getText()); 
                        pps.setString(1, jTextFieldNombreCliente.getText()); 
                        pps.setString(2, jTextFieldTelefono.getText()); 
                        pps.setString(3, jTextFieldDireccion.getText()); 
                         
                        //pps.setString(5, ei.getText()); 
                        pps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Los datos se han guardado");
                        limpia_datos();
                        mostrar_datos();
            }
                 
        } catch (SQLException ex) {
            Logger.getLogger(PedidoTelefono.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonAceptarMouseClicked

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CarpetaMenu newFrame= new CarpetaMenu();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoTelefono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDtelefono;
    private javax.swing.JTextField jTextFielID;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    ConexionDB cc= new ConexionDB();
    Connection cn= cc.conexion();
}
