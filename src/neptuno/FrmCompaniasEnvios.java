/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neptuno;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FrmCompaniasEnvios extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCompaniasEnvios
     */
    public FrmCompaniasEnvios() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
           JButton[] botones={btnNuevo,btnGuardar,btnModificar,btnElminar,btnImprimir};
        JLabel[] label={lblEmpleado,lblApellido,lblNombre};
        
 JLabel[] label2={lblID,lblname2};
JTextField[] texto1={txtidempleado,txtapellidos,txtnombre};

JTextField[] texto2={txtbuscarporid,txtbucarporcompania};
jSeparator1.setBounds(105, 70, 570, 10);
jSeparator3.setBounds(675, 70, 10, 660);
jSeparator4.setBounds(10, 728, 665, 10);
jSeparator6.setBounds(10, 500, 10, 230);
jSeparator7.setBounds(10, 75, 10, 400);
jSeparator2.setBounds(80, 490, 595, 10);
lblMantenimiento.setBounds(12, 57, 100, 20);
lblBusqueda.setBounds(12, 478, 100, 20);
btnGuardar.setEnabled(false);
btnModificar.setEnabled(false);
btnElminar.setEnabled(false);
btnImprimir.setEnabled(false);
lbltelf.setBounds(210, 690, 120, 20);
txtbustelf.setBounds(350, 690, 120, 20);

 int separacionbtn=30;
        int separacionlbl=200;
        int separaciontxt=170;
        for(JButton btn:botones)
        {
            btn.setBounds(separacionbtn,20,30,30);
            separacionbtn+=30;
        }
  
        
            for(JLabel lbl:label)
        {
            lbl.setBounds(200,separacionlbl,120,30);
            separacionlbl+=50;
        }
 
         
        separacionlbl=210;
        
              for(JTextField txt:texto1)
        {
            txt.setBounds(325,separacionlbl,120,20);
            separacionlbl+=50;
        }

                      separaciontxt=160;
          for(JTextField txt:texto2)
        {
            txt.setBounds(separaciontxt,535,120,20);
            separaciontxt+=310;
        }
          
           separacionlbl=100;
        for(JLabel lbl:label2)
        {
            lbl.setBounds(separacionlbl,525,120,30);
            separacionlbl+=250;
        }
        
   
    }
    
            public void Habilitarbtn()
    {
     
         JTextField[] texto1={txtidempleado,txtapellidos,txtnombre};     
       
           
       if(!texto1[0].getText().isEmpty() && !texto1[1].getText().isEmpty() && !texto1[2].getText().isEmpty() 
          )
       {
           btnGuardar.setEnabled(true);
       }
       else{
           btnGuardar.setEnabled(false);
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

        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblMantenimiento = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtbuscarporid = new javax.swing.JTextField();
        lblname2 = new javax.swing.JLabel();
        txtbucarporcompania = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lbltelf = new javax.swing.JLabel();
        txtbustelf = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(706, 785));
        getContentPane().setLayout(null);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(12, 2, 28, 35);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(47, 2, 28, 35);

        btnElminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/eliminar.png"))); // NOI18N
        btnElminar.setText("Eliminar");
        btnElminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnElminar);
        btnElminar.setBounds(117, 2, 28, 35);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(82, 2, 28, 37);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(152, 2, 28, 35);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(105, 77, 560, 10);

        lblMantenimiento.setText("Mantenimiento");
        getContentPane().add(lblMantenimiento);
        lblMantenimiento.setBounds(10, 62, 84, 16);

        lblBusqueda.setText("Búsqueda");
        getContentPane().add(lblBusqueda);
        lblBusqueda.setBounds(0, 482, 70, 16);

        lblEmpleado.setText("Id Compania Envios");
        getContentPane().add(lblEmpleado);
        lblEmpleado.setBounds(79, 102, 112, 16);

        lblApellido.setText("Nombre Compania");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(99, 131, 106, 16);

        lblNombre.setText("Telefono");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(101, 163, 50, 16);

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellidos);
        txtapellidos.setBounds(240, 130, 123, 22);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(240, 160, 123, 22);

        txtidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempleadoActionPerformed(evt);
            }
        });
        txtidempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidempleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidempleadoKeyTyped(evt);
            }
        });
        getContentPane().add(txtidempleado);
        txtidempleado.setBounds(240, 100, 123, 22);

        lblID.setText("Id Comp.");
        getContentPane().add(lblID);
        lblID.setBounds(100, 380, 52, 16);

        txtbuscarporid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarporidActionPerformed(evt);
            }
        });
        txtbuscarporid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarporidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarporidKeyTyped(evt);
            }
        });
        getContentPane().add(txtbuscarporid);
        txtbuscarporid.setBounds(170, 380, 123, 22);

        lblname2.setText("Nombre Companía");
        getContentPane().add(lblname2);
        lblname2.setBounds(340, 380, 106, 16);

        txtbucarporcompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbucarporcompaniaActionPerformed(evt);
            }
        });
        txtbucarporcompania.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbucarporcompaniaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbucarporcompaniaKeyTyped(evt);
            }
        });
        getContentPane().add(txtbucarporcompania);
        txtbucarporcompania.setBounds(460, 380, 123, 22);

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(115, 584, 452, 94);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(83, 492, 580, 16);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(720, 80, 50, 650);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 732, 664, 54);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 512, 50, 220);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(665, 77, 50, 650);

        lbltelf.setText("Telefono:");
        getContentPane().add(lbltelf);
        lbltelf.setBounds(220, 700, 100, 16);

        txtbustelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbustelfKeyReleased(evt);
            }
        });
        getContentPane().add(txtbustelf);
        txtbustelf.setBounds(350, 690, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void txtbuscarporidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarporidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarporidActionPerformed

    private void txtbucarporcompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbucarporcompaniaActionPerformed

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtapellidos.setText(txtapellidos.getText().toUpperCase());  
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtbucarporcompaniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtbucarporcompania.setText(txtbucarporcompania.getText().toUpperCase());  
    }//GEN-LAST:event_txtbucarporcompaniaKeyTyped

    private void txtidempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidempleadoKeyTyped
     char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtidempleadoKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtbuscarporidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarporidKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtbuscarporidKeyTyped

    private void txtidempleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidempleadoKeyReleased
       Habilitarbtn() ;// TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoKeyReleased

    private void txtapellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyReleased
Habilitarbtn() ;        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosKeyReleased

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
Habilitarbtn() ;        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        CompEnvios compania = new CompEnvios("root","Daniela23<3171561","neptuno", "localhost:3308");
        compania.conectarCompEnvios();
      JOptionPane.showMessageDialog(null, compania.guardarCompEnvios(txtidempleado.getText(),txtapellidos.getText(),txtnombre.getText())); 
        compania.cerrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       CompEnvios compania = new CompEnvios("root","Daniela23<3171561","neptuno", "localhost:3308");
        compania.conectarCompEnvios();
      JOptionPane.showMessageDialog(null, compania.modificarCompEnvios(txtidempleado.getText(),txtapellidos.getText(),txtnombre.getText())); 
        compania.cerrar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnElminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarActionPerformed
      CompEnvios compania = new CompEnvios("root","Daniela23<3171561","neptuno", "localhost:3308");
        compania.conectarCompEnvios();
      JOptionPane.showMessageDialog(null, compania.eliminarCompEnvios(txtidempleado.getText())); 
        compania.cerrar();
    }//GEN-LAST:event_btnElminarActionPerformed

    private void txtbuscarporidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarporidKeyReleased
      
          try {
            // TODO add your handling code here:
            CompEnvios compania = new CompEnvios("root","Daniela23<3171561","neptuno", "localhost:3308");
        compania.conectarCompEnvios();
            ResultSet rsCliente = compania.buscarPorId(txtbuscarporid.getText());
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel(); //crear el esquema de la tabal que se va a crear
            tblBuscar.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            ResultSetMetaData rsMd = rsCliente.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rsCliente.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rsCliente.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            compania.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }//GEN-LAST:event_txtbuscarporidKeyReleased

    private void txtbucarporcompaniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaKeyReleased
             
          try {
            // TODO add your handling code here:
            CompEnvios compania = new CompEnvios("root","Daniela23<3171561","neptuno", "localhost:3308");
        compania.conectarCompEnvios();
            ResultSet rsCliente = compania.buscarPorNombre(txtbucarporcompania.getText());
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel(); //crear el esquema de la tabal que se va a crear
            tblBuscar.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            ResultSetMetaData rsMd = rsCliente.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rsCliente.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rsCliente.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            compania.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_txtbucarporcompaniaKeyReleased

    private void tblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarMouseClicked
       
               btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnElminar.setEnabled(true);
    
               System.out.println(""+tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 1));
        
        this.txtidempleado.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 0).toString());
        this.txtapellidos.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 1).toString());
        this.txtnombre.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 2).toString());
        
        
    }//GEN-LAST:event_tblBuscarMouseClicked

    private void txtbustelfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbustelfKeyReleased
           
          try {
            // TODO add your handling code here:
            CompEnvios compania = new CompEnvios("root","Daniela23<3171561","neptuno", "localhost:3308");
        compania.conectarCompEnvios();
            ResultSet rsCliente = compania.buscarTelefono(txtbustelf.getText());
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel(); //crear el esquema de la tabal que se va a crear
            tblBuscar.setModel(modelo);
            //Para conectarnos a nuestra base de datos
            ResultSetMetaData rsMd = rsCliente.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rsCliente.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rsCliente.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            compania.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_txtbustelfKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lbltelf;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbucarporcompania;
    private javax.swing.JTextField txtbuscarporid;
    private javax.swing.JTextField txtbustelf;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
