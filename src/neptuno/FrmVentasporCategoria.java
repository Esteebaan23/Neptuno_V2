/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neptuno;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FrmVentasporCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmVentasporCategoria
     */
    public FrmVentasporCategoria() {
        initComponents();
        JLabel[] label5={lblFecha,lblTelefono};
        JTextField[] texto={txtFecha,txtTelefono};
        btnBuscar.setBounds(290, 165, 100, 20);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
btnModificar.setEnabled(false);
btnElminar.setEnabled(false);
btnImprimir.setEnabled(false);
        int separaciontxt=120;
        this.getContentPane().setBackground(Color.white);
              
                 for(JLabel lbl:label5)
        {
            lbl.setBounds(70,separaciontxt,70,20);
            separaciontxt+=45;
        }
             
                 
                 separaciontxt=120;
            for(JTextField txt:texto)
        {
            txt.setBounds(140,1000,100,20);
            separaciontxt+=45;
        }
    }
    
    
    
    
    public void utilJTablePrint(JTable jTable, String header, String footer, boolean showPrintDialog){        
    boolean fitWidth = true;        
    boolean interactive = true;
    // We define the print mode (Definimos el modo de impresión)
    JTable.PrintMode mode = fitWidth ? JTable.PrintMode.FIT_WIDTH : JTable.PrintMode.NORMAL;
    try {
        // Print the table (Imprimo la tabla)             
        boolean complete = jTable.print(mode,
                new MessageFormat(header),
                new MessageFormat(footer),
                showPrintDialog,
                null,
                interactive);                 
        if (complete) {
            // Mostramos el mensaje de impresión existosa
            JOptionPane.showMessageDialog(jTable,
                    "Print complete (Impresión completa)",
                    "Print result (Resultado de la impresión)",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Mostramos un mensaje indicando que la impresión fue cancelada                 
            JOptionPane.showMessageDialog(jTable,
                    "Print canceled (Impresión cancelada)",
                    "Print result (Resultado de la impresión)",
                    JOptionPane.WARNING_MESSAGE);
        }
    } catch (PrinterException pe) {
        JOptionPane.showMessageDialog(jTable, 
                "Print fail (Fallo de impresión): " + pe.getMessage(), 
                "Print result (Resultado de la impresión)", 
                JOptionPane.ERROR_MESSAGE);
    }
    }

    
            public void Habilitarbtn()
    {
     
          JTextField[] texto1={txtFecha,txtTelefono};      
           
       if(!texto1[0].getText().isEmpty() && !texto1[1].getText().isEmpty() )
       {
           btnGuardar.setEnabled(true);
           btnBuscar.setEnabled(true);
       }
       else{
           btnGuardar.setEnabled(false);
           btnBuscar.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        jdt2 = new com.toedter.calendar.JDateChooser();
        jdt1 = new com.toedter.calendar.JDateChooser();

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
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(47, 2, 28, 35);

        btnElminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/eliminar.png"))); // NOI18N
        btnElminar.setText("Eliminar");
        getContentPane().add(btnElminar);
        btnElminar.setBounds(117, 2, 28, 35);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar);
        btnModificar.setBounds(82, 2, 28, 37);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(152, 2, 28, 35);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Ventas por Categoría");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 50, 230, 60);

        lblFecha.setText("Desde:");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(80, 120, 40, 16);

        lblTelefono.setText("Hasta:");
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(70, 160, 37, 16);

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaKeyReleased(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(140, 120, 6, 22);

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(140, 160, 6, 22);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(250, 160, 71, 25);

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
        jScrollPane1.setViewportView(tblBuscar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 250, 452, 90);
        getContentPane().add(jdt2);
        jdt2.setBounds(140, 160, 100, 22);
        getContentPane().add(jdt1);
        jdt1.setBounds(140, 120, 100, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyReleased
Habilitarbtn();        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

btnImprimir.setEnabled(true);


        String dia = Integer.toString(jdt1.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(jdt1.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(jdt1.getCalendar().get(Calendar.YEAR));
String fecha = (year + "-" + mes+ "-" + dia);
txtFecha.setText(fecha);

String dia1 = Integer.toString(jdt2.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes1 = Integer.toString(jdt2.getCalendar().get(Calendar.MONTH) + 1);
String year1 = Integer.toString(jdt2.getCalendar().get(Calendar.YEAR));
String fecha1 = (year + "-" + mes+ "-" + dia);
txtTelefono.setText(fecha1);
        
        
        
        try {
            MejoresClientes ventas = new MejoresClientes("root","Daniela23<3171561","neptuno", "localhost:3308");
            ventas.conectarMejoresClientes();
            ResultSet rsCliente = ventas.ventasCategoria(txtFecha.getText(),txtTelefono.getText());
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
            ventas.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmVentasporCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       
       utilJTablePrint(tblBuscar, "Ventas Por Categoria", " ", true); 
        
        
        
        
    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdt1;
    private com.toedter.calendar.JDateChooser jdt2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
