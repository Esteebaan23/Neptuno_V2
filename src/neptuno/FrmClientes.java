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


public class FrmClientes extends javax.swing.JInternalFrame {

  
    public FrmClientes() {
        initComponents();
        
        txtcontacto.setEnabled(false);
        txtcargo.setEnabled(false);
        txtdireccion.setEnabled(false);
        txtpais.setEnabled(false);
        txttelf.setEnabled(false);
        txtfax.setEnabled(false);
         
        this.getContentPane().setBackground(Color.white);
        JButton[] botones={btnNuevo,btnGuardar,btnModificar,btnElminar,btnImprimir};
        JLabel[] label={lblIdCliente,lblNombreCompania,lblNombrecontacto,lblCargo,lblDireccion,lblCiudad,lblRegion,lblCodigoPostal,lblPais,lblTelefono,lblFax};
        JTextField[] texto1={txtidcliente,txtname,txtcontacto,txtcargo,txtdireccion,txtciudad,txtregion,txtcodigopostal,txtpais,txttelf,txtfax};
        JLabel[] label2={lblcliente2,lblname2};
        JTextField[] texto2={txtbuscarporid,txtbucarporcompania};
        int separacionbtn=30;
        int separacionlbl=100;
        int separaciontxt=100;
        jSeparator1.setBounds(105, 70, 570, 10);
jSeparator3.setBounds(675, 70, 10, 660);
jSeparator4.setBounds(10, 728, 665, 10);
jSeparator6.setBounds(10, 500, 10, 230);
jSeparator7.setBounds(10, 75, 10, 400);
jSeparator2.setBounds(80, 490, 595, 10);
lblMantenimiento.setBounds(12, 57, 100, 20);
lblBusqueda.setBounds(12, 478, 100, 20);
btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnElminar.setEnabled(false);
        btnImprimir.setEnabled(false);
        for(JButton btn:botones)
            
        {
            btn.setBounds(separacionbtn,20,30,30);
            separacionbtn+=30;
            
        }
        
        for(JLabel lbl:label)
        {
            lbl.setBounds(150,separacionlbl,120,30);
            separacionlbl+=35;
        }
        
        separacionlbl=100;
         for(JLabel lbl:label2)
        {
            lbl.setBounds(separacionlbl,530,120,30);
            separacionlbl+=250;
        }
        
        
         for(JTextField txt:texto1)
        {
            txt.setBounds(300,separaciontxt,150,20);
            separaciontxt+=35;
        }
         
         separaciontxt=160;
          for(JTextField txt:texto2)
        {
            txt.setBounds(separaciontxt,535,100,20);
            separaciontxt+=310;
        }
          tblBuscar.setBounds(20,460,100,100);
    }
    
    public void Habilitarbtn()
    {
         JTextField[] texto1={txtidcliente,txtname,txtcontacto,txtcargo,txtdireccion,txtciudad,txtregion,txtcodigopostal,txtpais,txttelf,txtfax};       
           
       if(!texto1[0].getText().isEmpty() && !texto1[1].getText().isEmpty() && !texto1[2].getText().isEmpty() &&
          !texto1[3].getText().isEmpty() && !texto1[4].getText().isEmpty() && !texto1[5].getText().isEmpty() &&
          !texto1[6].getText().isEmpty() && !texto1[7].getText().isEmpty() && !texto1[8].getText().isEmpty() &&
          !texto1[9].getText().isEmpty() && !texto1[10].getText().isEmpty() )
       {
           btnGuardar.setEnabled(true);
       }
       else{
           btnGuardar.setEnabled(false);
       }
    }
       
       public void Habilitarbtn2()
    {
         JTextField[] texto1={txtidcliente,txtname,txtciudad,txtregion,txtcodigopostal};       
           
       if(!texto1[0].getText().isEmpty() && !texto1[1].getText().isEmpty() && !texto1[2].getText().isEmpty() &&
          !texto1[3].getText().isEmpty() && !texto1[4].getText().isEmpty())
       {
           btnGuardar.setEnabled(true);
       }
       else{
           btnGuardar.setEnabled(false);
       }
       
 
       
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblMantenimiento = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        lblNombreCompania = new javax.swing.JLabel();
        lblNombrecontacto = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        lblCodigoPostal = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        txttelf = new javax.swing.JTextField();
        txtfax = new javax.swing.JTextField();
        txtpais = new javax.swing.JTextField();
        txtcodigopostal = new javax.swing.JTextField();
        txtregion = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcontacto = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        lblcliente2 = new javax.swing.JLabel();
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
        txtname = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jcbx = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(51, 255, 102));
        setPreferredSize(new java.awt.Dimension(706, 784));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(115, 75, 560, 10);

        lblMantenimiento.setText("Mantenimiento");
        getContentPane().add(lblMantenimiento);
        lblMantenimiento.setBounds(20, 60, 84, 16);

        lblBusqueda.setText("Búsqueda");
        getContentPane().add(lblBusqueda);
        lblBusqueda.setBounds(10, 480, 70, 16);

        lblIdCliente.setText("IdCliente");
        getContentPane().add(lblIdCliente);
        lblIdCliente.setBounds(170, 103, 50, 16);

        lblNombreCompania.setText("Nombre Compañía");
        getContentPane().add(lblNombreCompania);
        lblNombreCompania.setBounds(120, 140, 106, 16);

        lblNombrecontacto.setText("Nombre Contacto");
        getContentPane().add(lblNombrecontacto);
        lblNombrecontacto.setBounds(120, 170, 99, 16);

        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(186, 207, 34, 16);

        lblDireccion.setText("Dirección");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(170, 240, 80, 16);

        lblCiudad.setText("Ciudad");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(181, 276, 39, 16);

        lblRegion.setText("Región");
        getContentPane().add(lblRegion);
        lblRegion.setBounds(181, 305, 39, 16);

        lblCodigoPostal.setText("Código Postal");
        getContentPane().add(lblCodigoPostal);
        lblCodigoPostal.setBounds(143, 334, 130, 16);

        lblPais.setText("País");
        getContentPane().add(lblPais);
        lblPais.setBounds(197, 363, 60, 16);

        lblTelefono.setText("Teléfono");
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(170, 392, 50, 16);

        lblFax.setText("Fax");
        getContentPane().add(lblFax);
        lblFax.setBounds(200, 421, 20, 16);

        txttelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelfKeyTyped(evt);
            }
        });
        getContentPane().add(txttelf);
        txttelf.setBounds(268, 386, 123, 22);

        txtfax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfaxActionPerformed(evt);
            }
        });
        txtfax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfaxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfaxKeyTyped(evt);
            }
        });
        getContentPane().add(txtfax);
        txtfax.setBounds(268, 415, 123, 22);

        txtpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpaisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaisKeyTyped(evt);
            }
        });
        getContentPane().add(txtpais);
        txtpais.setBounds(268, 357, 123, 22);

        txtcodigopostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigopostalActionPerformed(evt);
            }
        });
        txtcodigopostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodigopostalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigopostalKeyTyped(evt);
            }
        });
        getContentPane().add(txtcodigopostal);
        txtcodigopostal.setBounds(268, 328, 123, 22);

        txtregion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtregionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtregionKeyTyped(evt);
            }
        });
        getContentPane().add(txtregion);
        txtregion.setBounds(268, 299, 123, 22);

        txtciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtciudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudadKeyTyped(evt);
            }
        });
        getContentPane().add(txtciudad);
        txtciudad.setBounds(268, 270, 123, 22);

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        getContentPane().add(txtdireccion);
        txtdireccion.setBounds(270, 240, 123, 22);

        txtcontacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontactoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontactoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcontacto);
        txtcontacto.setBounds(268, 172, 123, 22);

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });
        txtidcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidclienteKeyReleased(evt);
            }
        });
        getContentPane().add(txtidcliente);
        txtidcliente.setBounds(268, 103, 123, 22);

        txtcargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcargoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcargo);
        txtcargo.setBounds(270, 210, 120, 22);

        lblcliente2.setText("Id Cliente");
        getContentPane().add(lblcliente2);
        lblcliente2.setBounds(120, 530, 54, 16);

        txtbuscarporid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarporidActionPerformed(evt);
            }
        });
        txtbuscarporid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarporidKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscarporid);
        txtbuscarporid.setBounds(180, 530, 123, 22);

        lblname2.setText("Nombre Companía");
        getContentPane().add(lblname2);
        lblname2.setBounds(340, 530, 106, 16);

        txtbucarporcompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbucarporcompaniaActionPerformed(evt);
            }
        });
        txtbucarporcompania.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbucarporcompaniaKeyReleased(evt);
            }
        });
        getContentPane().add(txtbucarporcompania);
        txtbucarporcompania.setBounds(460, 530, 123, 22);

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
        jScrollPane1.setBounds(130, 590, 452, 94);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(93, 490, 580, 16);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(675, 75, 50, 650);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 730, 664, 54);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(10, 510, 50, 220);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(12, 88, 50, 378);

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(270, 140, 120, 22);

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
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(152, 2, 28, 35);

        jcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxActionPerformed(evt);
            }
        });
        getContentPane().add(jcbx);
        jcbx.setBounds(50, 80, 30, 25);

        jLabel1.setText("Habilitar Campos No Obligatorios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 50, 340, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtcodigopostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigopostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigopostalActionPerformed

    private void txtbuscarporidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarporidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarporidActionPerformed

    private void txtbucarporcompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbucarporcompaniaActionPerformed

    private void txtidclienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidclienteKeyReleased
       
     if(txtidcliente.getText().length()<=5)
     {
         txtidcliente.setText(txtidcliente.getText().toUpperCase());
     }
     else
     {
         getToolkit().beep();
      JOptionPane.showMessageDialog(null,"Maximo 5 caracteres");
      txtidcliente.setText(txtidcliente.getText().substring(0,5));
     }
     
    
  
     Habilitarbtn();
      Habilitarbtn2();
   
     
 
     

        
        
        
        
        
    }//GEN-LAST:event_txtidclienteKeyReleased

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
       
         
          if(txtname.getText().length()>20)
                {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"Maximo 20 caracteres");
      txtname.setText(txtname.getText().substring(0,txtname.getText().length()-1));
                }
          else
          {
              txtname.setText(txtname.getText().toUpperCase());
          }
          
          Habilitarbtn();
            Habilitarbtn2();
          
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtcontactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactoKeyReleased
       if(txtcontacto.getText().length()>20)
     {
          getToolkit().beep();
      JOptionPane.showMessageDialog(null,"Maximo 20 caracteres");
      txtcontacto.setText(txtcontacto.getText().substring(0,txtcontacto.getText().length()-1));
     }
       Habilitarbtn();   
         Habilitarbtn2();
      
    }//GEN-LAST:event_txtcontactoKeyReleased

    private void txtcargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoKeyReleased
          if(txtcargo.getText().length()>20)
                {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"Maximo 20 caracteres");
      txtcargo.setText(txtcargo.getText().substring(0,txtcargo.getText().length()-1));
                }
          else
          {
              txtcargo.setText(txtcargo.getText().toUpperCase());
          }
          Habilitarbtn();
            Habilitarbtn2();
    }//GEN-LAST:event_txtcargoKeyReleased

    private void txtciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudadKeyReleased
    
         
          if(txtciudad.getText().length()>20)
                {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"Maximo 20 caracteres");
      txtciudad.setText(txtciudad.getText().substring(0,txtciudad.getText().length()-1));
                }
          else
          {
              txtciudad.setText(txtciudad.getText().toUpperCase());
          }
          Habilitarbtn();
            Habilitarbtn2();
 
    }//GEN-LAST:event_txtciudadKeyReleased

    private void txtregionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtregionKeyReleased
        
         
          if(txtregion.getText().length()>20)
                {
                    JOptionPane.showMessageDialog(null,"Maximo 20 caracteres");
                    getToolkit().beep();
      txtregion.setText(txtregion.getText().substring(0,txtregion.getText().length()-1));
                }
          else
          {
              txtregion.setText(txtregion.getText().toUpperCase());
          }
          Habilitarbtn();
            Habilitarbtn2();
      
    }//GEN-LAST:event_txtregionKeyReleased

    private void txtpaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaisKeyReleased
        
         
          if(txtpais.getText().length()>20)
                {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"Maximo 20 caracteres");
      txtpais.setText(txtpais.getText().substring(0,txtpais.getText().length()-1));
                }
          else
          {
              txtpais.setText(txtpais.getText().toUpperCase());
          }
          Habilitarbtn();
            Habilitarbtn2();
  
    }//GEN-LAST:event_txtpaisKeyReleased

    private void txttelfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
        
    }//GEN-LAST:event_txttelfKeyTyped

    private void txtcodigopostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigopostalKeyReleased
     
       if(txtcodigopostal.getText().length()>6)
     {
          getToolkit().beep();
      JOptionPane.showMessageDialog(null,"Maximo 6 caracteres");
      txtcodigopostal.setText(txtcodigopostal.getText().substring(0,txtcodigopostal.getText().length()-1));
     }
    
        
        Habilitarbtn();
          Habilitarbtn2();
        
        
    }//GEN-LAST:event_txtcodigopostalKeyReleased

    private void txtcodigopostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigopostalKeyTyped
          char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
               
            
        }
        
    }//GEN-LAST:event_txtcodigopostalKeyTyped

    private void txtcontactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactoKeyTyped
          char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtcontacto.setText(txtcontacto.getText().toUpperCase());

    }//GEN-LAST:event_txtcontactoKeyTyped

    private void txtfaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfaxKeyTyped
  
    }//GEN-LAST:event_txtfaxKeyTyped

    private void txttelfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyReleased
         if(txttelf.getText().length()>10)
     {
          getToolkit().beep();
      JOptionPane.showMessageDialog(null,"Maximo 10 caracteres");
      txttelf.setText(txttelf.getText().substring(0,txttelf.getText().length()-1));
     }
         Habilitarbtn();
           Habilitarbtn2();
    }//GEN-LAST:event_txttelfKeyReleased

    private void txtfaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfaxKeyReleased
           if(txtfax.getText().length()>20)
     {
          getToolkit().beep();
      JOptionPane.showMessageDialog(null,"Maximo 10 caracteres");
      txtfax.setText(txtfax.getText().substring(0,txtfax.getText().length()-1));
     }
           
     Habilitarbtn();      
   
             Habilitarbtn2();
           
           
           
           
           
           
           
           
           
    }//GEN-LAST:event_txtfaxKeyReleased

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        
        
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtdireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyReleased
        if(txtdireccion.getText().length()<=80)
     {
         txtdireccion.setText(txtdireccion.getText().toUpperCase());
     }
     else
     {
         getToolkit().beep();
      JOptionPane.showMessageDialog(null,"Maximo 80 caracteres");
      txtdireccion.setText(txtdireccion.getText().substring(0,80));
     }
        Habilitarbtn();
          Habilitarbtn2();
    }//GEN-LAST:event_txtdireccionKeyReleased

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
         char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtname.setText(txtname.getText().toUpperCase());  
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtcargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
        txtcargo.setText(txtcargo.getText().toUpperCase());  
    }//GEN-LAST:event_txtcargoKeyTyped

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

    private void tblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarMouseClicked
   
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnElminar.setEnabled(true);
    
               System.out.println(""+tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 1));
        
        this.txtidcliente.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 0).toString());
        this.txtname.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 1).toString());
        this.txtcontacto.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 2).toString());
        this.txtcargo.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 3).toString());
        this.txtdireccion.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 4).toString());
        this.txtciudad.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 5).toString());
        
//      this.txtregion.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 6).toString());
        this.txtcodigopostal.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 7).toString());
        this.txtpais.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 8).toString());
        this.txttelf.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 9).toString());
//        this.txtfax.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 10).toString());
        
        
    }//GEN-LAST:event_tblBuscarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 
            txtcontacto.setEnabled(true);
        txtcargo.setEnabled(true);
        txtdireccion.setEnabled(true);
        txtpais.setEnabled(true);
        txttelf.setEnabled(true);
        txtfax.setEnabled(true);
        
        
        Clientes clientes = new Clientes("root","Daniela23<3171561","neptuno", "localhost:3308");
        clientes.conectarClientes();
        
        
        if(txtcontacto.isEnabled())
        {
        JOptionPane.showMessageDialog(null, clientes.guardarCliente(txtidcliente.getText(),txtname.getText(),txtcontacto.getText(),txtcargo.getText()
    ,txtdireccion.getText(),txtciudad.getText(),txtregion.getText(),txtcodigopostal.getText(),txtpais.getText(),txttelf.getText(),
    txtfax.getText())); 
        }
        else{
            JOptionPane.showMessageDialog(null, clientes.guardarCliente(txtidcliente.getText(),txtname.getText(),"",""
    ,"",txtciudad.getText(),txtregion.getText(),txtcodigopostal.getText(),"","",
    "")); 
        }
        clientes.cerrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
  Clientes clientes=new Clientes("root","Daniela23<3171561","neptuno","localhost:3308");    
       
        clientes.conectarClientes();
        JOptionPane.showMessageDialog(null, clientes.modificarCliente(txtidcliente.getText(),txtname.getText(),txtcontacto.getText(),txtcargo.getText()
    ,txtdireccion.getText(),txtciudad.getText(),txtregion.getText(),txtcodigopostal.getText(),txtpais.getText(),txttelf.getText(),
    txtfax.getText()) ); 
        clientes.cerrar();
     
     
   
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnElminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarActionPerformed
       Clientes clientes=new Clientes("root","Daniela23<3171561","neptuno","localhost:3308");    
        clientes.conectarClientes();
        JOptionPane.showMessageDialog(null, clientes.eliminarCliente(txtidcliente.getText()) ); 
        clientes.cerrar();

    }//GEN-LAST:event_btnElminarActionPerformed

    private void txtbuscarporidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarporidKeyReleased
        try {
            // TODO add your handling code here:
            Clientes clientes = new Clientes("root","Daniela23<3171561","neptuno", "localhost:3308");
            clientes.conectarClientes();
            ResultSet rsCliente = clientes.buscarPorId(txtbuscarporid.getText());
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
            clientes.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        // escoger la que dice surround block with Try catch

    }//GEN-LAST:event_txtbuscarporidKeyReleased

    private void txtbucarporcompaniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaKeyReleased
       
        try {
            // TODO add your handling code here:
            Clientes clientes = new Clientes("root","Daniela23<3171561","neptuno", "localhost:3308");
            clientes.conectarClientes();
            ResultSet rsCliente = clientes.buscarPorCompania(txtbucarporcompania.getText());
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
            clientes.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_txtbucarporcompaniaKeyReleased

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxActionPerformed
       if(jcbx.isSelected())
       {
        txtcontacto.setEnabled(true);
        txtcargo.setEnabled(true);
        txtdireccion.setEnabled(true);
        txtpais.setEnabled(true);
        txttelf.setEnabled(true);
        txtfax.setEnabled(true);
       }
       else{
            txtcontacto.setEnabled(false);
        txtcargo.setEnabled(false);
        txtdireccion.setEnabled(false);
        txtpais.setEnabled(false);
        txttelf.setEnabled(false);
        txtfax.setEnabled(false);
       }
    }//GEN-LAST:event_jcbxActionPerformed

    private void txtfaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfaxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JCheckBox jcbx;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblNombreCompania;
    private javax.swing.JLabel lblNombrecontacto;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblcliente2;
    private javax.swing.JLabel lblname2;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtbucarporcompania;
    private javax.swing.JTextField txtbuscarporid;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcodigopostal;
    private javax.swing.JTextField txtcontacto;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtregion;
    private javax.swing.JTextField txttelf;
    // End of variables declaration//GEN-END:variables
}
