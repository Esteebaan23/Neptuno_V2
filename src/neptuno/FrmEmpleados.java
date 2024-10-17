package neptuno;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class FrmEmpleados extends javax.swing.JInternalFrame {

    JFileChooser Seleccionar=new JFileChooser();
File archivo;
byte[] imagen;
FileInputStream entrada;
FileOutputStream salida;
    public FrmEmpleados() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        JButton[] botones={btnNuevo,btnGuardar,btnModificar,btnElminar,btnImprimir};
        JLabel[] label={lblEmpleado,lblApellido,lblNombre,lblTratamiento,lblNacimiento,lblContratacion,lblDireccion,lblCiudad,lblRegion,lblPostal,lblPais};
        JLabel[] label3={lblDomicilio,lblExtension,lblNotas,lblJefe};
 JLabel[] label2={lblID,lblname2};
JTextField[] texto1={txtidempleado,txtapellidos,txtnombre,txttratamiento,txtfechanac,txtfechcont,txtdireccion,txtciudad,txtregion,txtcodpostal,txtpais};
JTextField[] texto3={txtteldom,txtextension,txtnotas,txtjefe};
JTextField[] texto2={txtbuscarporid,txtbucarporcompania};

lblFoto.setBounds(350, 230, 120, 30);
txtFoto.setBounds(460, 230, 100, 120);
btnExaminar.setBounds(570, 230, 20, 20);


jSeparator1.setBounds(105, 70, 570, 30);
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

 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
Date date = new Date();
txtfechanac.setText(dateFormat.format(date));
txtfechcont.setText(dateFormat.format(date));

 int separacionbtn=30;
        int separacionlbl=90;
        int separaciontxt=170;
        for(JButton btn:botones)
        {
            btn.setBounds(separacionbtn,20,30,30);
            separacionbtn+=30;
        }
        
         for(JLabel lbl:label)
        {
            lbl.setBounds(100,separacionlbl,120,30);
            separacionlbl+=35;
        }
         
         separacionlbl=90;
          for(JLabel lbl:label3)
        {
            lbl.setBounds(350,separacionlbl,120,30);
            separacionlbl+=35;
        }
         
        separacionlbl=100;
        
              for(JTextField txt:texto1)
        {
            txt.setBounds(230,separacionlbl,100,20);
            separacionlbl+=35;
        }
              
              
              separacionlbl=100;
        
              for(JTextField txt:texto3)
        {
            txt.setBounds(460,separacionlbl,100,20);
            separacionlbl+=35;
        }
              
                      separaciontxt=160;
          for(JTextField txt:texto2)
        {
            txt.setBounds(separaciontxt,535,100,20);
            separaciontxt+=310;
        }
          
           separacionlbl=100;
        for(JLabel lbl:label2)
        {
            lbl.setBounds(separacionlbl,525,120,30);
            separacionlbl+=250;
        }
        txtfechanac.setBounds(1000, 1000, 100, 30);
        txtFoto.setBounds(2000, 2000, 1, 1);
    }
    
            public void Habilitarbtn()
    {
        
        JTextField[] texto1={txtidempleado,txtapellidos,txtnombre,txttratamiento,txtfechanac,txtfechcont,txtdireccion,txtciudad,txtregion,txtcodpostal,txtpais,txtteldom,txtextension,txtnotas,txtjefe};

     
    
           
       if(!texto1[0].getText().isEmpty() && !texto1[1].getText().isEmpty() && !texto1[2].getText().isEmpty() &&
          !texto1[3].getText().isEmpty() && !texto1[4].getText().isEmpty() && !texto1[5].getText().isEmpty() &&
          !texto1[6].getText().isEmpty() && !texto1[7].getText().isEmpty() && !texto1[8].getText().isEmpty() &&
          !texto1[9].getText().isEmpty() && !texto1[10].getText().isEmpty() && !texto1[11].getText().isEmpty() &&
          !texto1[12].getText().isEmpty() && !texto1[13].getText().isEmpty() && !texto1[14].getText().isEmpty()  )
       {
           btnGuardar.setEnabled(true);
       }
       else{
           btnGuardar.setEnabled(false);
       }
    }
            
            
             public String GuardarArchivo (File archivo,byte[] imagen) {
               String mensaje=null;
    try {
        salida=new FileOutputStream(archivo);
         salida.write(imagen);
         mensaje="Archivo Guardado";
    }catch (Exception e){
        
    }
            
             
return mensaje;
               
           }
           
     public byte[] AbrirArchivo   (File archivo){
         byte[]imagen=new byte[1024*100];
     try{   
             entrada=new FileInputStream(archivo);
             entrada.read(imagen);
     }catch(Exception e)
     {
      
     }    
        return imagen;
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblMantenimiento = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTratamiento = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblContratacion = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        lblPostal = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        txtcodpostal = new javax.swing.JTextField();
        txtpais = new javax.swing.JTextField();
        txtregion = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtfechcont = new javax.swing.JTextField();
        txtfechanac = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();
        txttratamiento = new javax.swing.JTextField();
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
        txtjefe = new javax.swing.JTextField();
        txtextension = new javax.swing.JTextField();
        txtteldom = new javax.swing.JTextField();
        txtnotas = new javax.swing.JTextField();
        lblDomicilio = new javax.swing.JLabel();
        lblExtension = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblNotas = new javax.swing.JLabel();
        lblJefe = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        lblFoto1 = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        txtFoto = new javax.swing.JTextField();
        jdt = new com.toedter.calendar.JDateChooser();
        lblIcon = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(706, 785));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(105, 77, 560, 10);

        lblMantenimiento.setText("Mantenimiento");
        getContentPane().add(lblMantenimiento);
        lblMantenimiento.setBounds(10, 62, 84, 16);

        lblBusqueda.setText("Búsqueda");
        getContentPane().add(lblBusqueda);
        lblBusqueda.setBounds(0, 482, 70, 16);

        lblEmpleado.setText("Id Empleado");
        getContentPane().add(lblEmpleado);
        lblEmpleado.setBounds(79, 102, 71, 16);

        lblApellido.setText("Apellidos");
        getContentPane().add(lblApellido);
        lblApellido.setBounds(99, 131, 51, 16);

        lblNombre.setText("Nombre ");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(101, 163, 49, 16);

        lblTratamiento.setText("Tratamiento");
        getContentPane().add(lblTratamiento);
        lblTratamiento.setBounds(80, 198, 70, 16);

        lblNacimiento.setText("Fecha Nacimiento");
        getContentPane().add(lblNacimiento);
        lblNacimiento.setBounds(49, 227, 101, 16);

        lblContratacion.setText("Fecha Contratación");
        getContentPane().add(lblContratacion);
        lblContratacion.setBounds(40, 262, 110, 16);

        lblDireccion.setText("Dirección");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(98, 297, 52, 16);

        lblCiudad.setText("Ciudad");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(111, 329, 39, 16);

        lblRegion.setText("Región");
        getContentPane().add(lblRegion);
        lblRegion.setBounds(111, 358, 39, 16);

        lblPostal.setText("Cod Postal");
        getContentPane().add(lblPostal);
        lblPostal.setBounds(90, 387, 60, 16);

        lblPais.setText("País");
        getContentPane().add(lblPais);
        lblPais.setBounds(127, 416, 23, 16);

        txtcodpostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodpostalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodpostalKeyTyped(evt);
            }
        });
        getContentPane().add(txtcodpostal);
        txtcodpostal.setBounds(168, 385, 123, 22);

        txtpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpaisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaisKeyTyped(evt);
            }
        });
        getContentPane().add(txtpais);
        txtpais.setBounds(168, 414, 123, 22);

        txtregion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtregionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtregionKeyTyped(evt);
            }
        });
        getContentPane().add(txtregion);
        txtregion.setBounds(168, 356, 123, 22);

        txtciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudadActionPerformed(evt);
            }
        });
        txtciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtciudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudadKeyTyped(evt);
            }
        });
        getContentPane().add(txtciudad);
        txtciudad.setBounds(168, 321, 123, 22);

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdireccionKeyReleased(evt);
            }
        });
        getContentPane().add(txtdireccion);
        txtdireccion.setBounds(168, 294, 123, 22);

        txtfechcont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfechcontKeyReleased(evt);
            }
        });
        getContentPane().add(txtfechcont);
        txtfechcont.setBounds(168, 259, 123, 22);

        txtfechanac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfechanacKeyReleased(evt);
            }
        });
        getContentPane().add(txtfechanac);
        txtfechanac.setBounds(168, 224, 123, 22);

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellidos);
        txtapellidos.setBounds(168, 131, 123, 22);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(168, 160, 123, 22);

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
        txtidempleado.setBounds(168, 102, 123, 22);

        txttratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttratamientoKeyReleased(evt);
            }
        });
        getContentPane().add(txttratamiento);
        txttratamiento.setBounds(168, 195, 123, 22);

        lblID.setText("Id Empl.");
        getContentPane().add(lblID);
        lblID.setBounds(104, 534, 47, 16);

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
        txtbuscarporid.setBounds(176, 531, 123, 22);

        lblname2.setText("Nombre Empl.");
        getContentPane().add(lblname2);
        lblname2.setBounds(340, 534, 81, 16);

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
        txtbucarporcompania.setBounds(458, 531, 123, 22);

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
        jSeparator3.setBounds(665, 77, 50, 650);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 732, 664, 54);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 512, 50, 220);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(2, 90, 50, 378);

        txtjefe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjefeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjefeKeyTyped(evt);
            }
        });
        getContentPane().add(txtjefe);
        txtjefe.setBounds(431, 230, 123, 22);

        txtextension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtextensionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtextensionKeyTyped(evt);
            }
        });
        getContentPane().add(txtextension);
        txtextension.setBounds(431, 131, 123, 22);

        txtteldom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteldomActionPerformed(evt);
            }
        });
        txtteldom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtteldomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtteldomKeyTyped(evt);
            }
        });
        getContentPane().add(txtteldom);
        txtteldom.setBounds(431, 102, 123, 22);

        txtnotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnotasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnotasKeyTyped(evt);
            }
        });
        getContentPane().add(txtnotas);
        txtnotas.setBounds(431, 201, 123, 22);

        lblDomicilio.setText("Tel Domicilio");
        getContentPane().add(lblDomicilio);
        lblDomicilio.setBounds(340, 102, 73, 16);

        lblExtension.setText("Extensión");
        getContentPane().add(lblExtension);
        lblExtension.setBounds(359, 131, 54, 16);

        lblFoto.setText("Foto");
        getContentPane().add(lblFoto);
        lblFoto.setBounds(388, 169, 25, 16);

        lblNotas.setText("Notas");
        getContentPane().add(lblNotas);
        lblNotas.setBounds(381, 204, 32, 16);

        lblJefe.setText("Jefe");
        getContentPane().add(lblJefe);
        lblJefe.setBounds(390, 233, 23, 16);

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
        getContentPane().add(lblFoto1);
        lblFoto1.setBounds(440, 170, 0, 0);

        btnExaminar.setText("...");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExaminar);
        btnExaminar.setBounds(500, 320, 30, 25);
        getContentPane().add(txtFoto);
        txtFoto.setBounds(430, 170, 110, 22);
        getContentPane().add(jdt);
        jdt.setBounds(230, 240, 110, 22);
        getContentPane().add(lblIcon);
        lblIcon.setBounds(460, 230, 100, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadActionPerformed

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void txtbuscarporidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarporidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarporidActionPerformed

    private void txtbucarporcompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbucarporcompaniaActionPerformed

    private void txtteldomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteldomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteldomActionPerformed

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

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtnombre.setText(txtnombre.getText().toUpperCase());  
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudadKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtciudad.setText(txtciudad.getText().toUpperCase());  
    }//GEN-LAST:event_txtciudadKeyTyped

    private void txtregionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtregionKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtregion.setText(txtregion.getText().toUpperCase());  
    }//GEN-LAST:event_txtregionKeyTyped

    private void txtpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaisKeyTyped
      char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtpais.setText(txtpais.getText().toUpperCase());  
    }//GEN-LAST:event_txtpaisKeyTyped

    private void txtnotasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnotasKeyTyped
    char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtnotas.setText(txtnotas.getText().toUpperCase());  
    }//GEN-LAST:event_txtnotasKeyTyped

    private void txtjefeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjefeKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtjefe.setText(txtjefe.getText().toUpperCase());  
    }//GEN-LAST:event_txtjefeKeyTyped

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

    private void txtcodpostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodpostalKeyTyped
//       char validar=evt.getKeyChar();
//        if(Character.isLetter(validar))
//        {
//            getToolkit().beep();
//            evt.consume();
//             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
//        }
    }//GEN-LAST:event_txtcodpostalKeyTyped

    private void txtteldomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtteldomKeyTyped

    }//GEN-LAST:event_txtteldomKeyTyped

    private void txtextensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtextensionKeyTyped
     char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtextensionKeyTyped

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
Habilitarbtn();        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoKeyReleased

    private void txtapellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosKeyReleased

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txttratamientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttratamientoKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txttratamientoKeyReleased

    private void txtfechanacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechanacKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtfechanacKeyReleased

    private void txtfechcontKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechcontKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtfechcontKeyReleased

    private void txtdireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyReleased

    private void txtciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudadKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadKeyReleased

    private void txtregionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtregionKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtregionKeyReleased

    private void txtcodpostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodpostalKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtcodpostalKeyReleased

    private void txtpaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaisKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtpaisKeyReleased

    private void txtteldomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtteldomKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtteldomKeyReleased

    private void txtextensionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtextensionKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtextensionKeyReleased

    private void txtnotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnotasKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtnotasKeyReleased

    private void txtjefeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjefeKeyReleased
Habilitarbtn();          // TODO add your handling code here:
    }//GEN-LAST:event_txtjefeKeyReleased

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
      if(Seleccionar.showDialog(null,null)==JFileChooser.APPROVE_OPTION)
        {
          
            archivo=Seleccionar.getSelectedFile();
            this.txtFoto.setText(archivo.getName());
            if(archivo.canRead())
            {
                if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif"));
            imagen=AbrirArchivo(archivo);
            lblIcon.setIcon(new ImageIcon(imagen));
            
            
            }
            else{
              JOptionPane.showMessageDialog(null, "Archivo no compatible");  
            }
        }

    }//GEN-LAST:event_btnExaminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
             String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
String fecha = (year + "-" + mes+ "-" + dia);
txtfechanac.setText(fecha);  
        
        Empleados clientes = new Empleados("root","Daniela23<3171561","neptuno", "localhost:3308");
        clientes.conectarEmpleados();
        JOptionPane.showMessageDialog(null, clientes.guardarEmpleados(txtidempleado.getText(),
                txtapellidos.getText(),txtnombre.getText(),txttratamiento.getText()
    ,txtfechanac.getText(),txtfechcont.getText(),txtdireccion.getText(),txtciudad.getText()
                ,txtregion.getText(),txtcodpostal.getText(),
    txtpais.getText(),txtteldom.getText(),txtextension.getText()
                ,txtFoto.getText(),txtnotas.getText(),txtjefe.getText())); 
        clientes.cerrar();
        
        
     
                
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtbuscarporidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarporidKeyReleased
    try {
            // TODO add your handling code here:
           Empleados empleados = new Empleados("root","Daniela23<3171561","neptuno", "localhost:3308");
        empleados.conectarEmpleados();
            ResultSet rsCliente = empleados.buscarPorId(txtbuscarporid.getText());
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
            empleados.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtbuscarporidKeyReleased

    private void txtbucarporcompaniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaKeyReleased
         try {
            // TODO add your handling code here:
           Empleados empleados = new Empleados("root","Daniela23<3171561","neptuno", "localhost:3308");
        empleados.conectarEmpleados();
            ResultSet rsCliente = empleados.buscarPorNombre(txtbucarporcompania.getText());
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
            empleados.cerrar();
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
        this.txttratamiento.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 4).toString());
        this.txtfechanac.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 5).toString());
        this.txtfechcont.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 6).toString());
        
       this.txtdireccion.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 7).toString());
        this.txtciudad.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 8).toString());
//        this.txtregion.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 9).toString());
        this.txtcodpostal.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 10).toString());
        this.txtpais.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 11).toString());
                this.txtteldom.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 12).toString());
        this.txtextension.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 13).toString());
                this.txtjefe.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 16).toString());
        this.txtnotas.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 15).toString());
        txtFoto.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 14).toString());
        

        
    }//GEN-LAST:event_tblBuscarMouseClicked

    private void btnElminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarActionPerformed
          Empleados empleados = new Empleados("root","Daniela23<3171561","neptuno", "localhost:3308");
        empleados.conectarEmpleados();
        JOptionPane.showMessageDialog(null, empleados.eliminarEmpleados(txtidempleado.getText())); 
        empleados.cerrar();
    }//GEN-LAST:event_btnElminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
String fecha = (year + "-" + mes+ "-" + dia);
txtfechanac.setText(fecha);  
        
        Empleados empleados = new Empleados("root","Daniela23<3171561","neptuno", "localhost:3308");
        empleados.conectarEmpleados();
        JOptionPane.showMessageDialog(null, empleados.modificarEmpleados(txtidempleado.getText(),
                txtapellidos.getText(),txtnombre.getText(),txttratamiento.getText()
    ,txtfechanac.getText(),txtfechcont.getText(),txtdireccion.getText(),txtciudad.getText()
                ,txtregion.getText(),txtcodpostal.getText(),
    txtpais.getText(),txtteldom.getText(),txtextension.getText()
                ,txtFoto.getText(),txtnotas.getText(),txtjefe.getText())); 
        empleados.cerrar();
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnExaminar;
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
    private com.toedter.calendar.JDateChooser jdt;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblContratacion;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblExtension;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblJefe;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPostal;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JLabel lblname2;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbucarporcompania;
    private javax.swing.JTextField txtbuscarporid;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcodpostal;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtextension;
    private javax.swing.JTextField txtfechanac;
    private javax.swing.JTextField txtfechcont;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtjefe;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnotas;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtregion;
    private javax.swing.JTextField txtteldom;
    private javax.swing.JTextField txttratamiento;
    // End of variables declaration//GEN-END:variables
}
