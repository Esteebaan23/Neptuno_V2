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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class FrmProveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmProveedores
     */
    public FrmProveedores() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        JButton[] botones={btnNuevo,btnGuardar,btnModificar,btnElminar,btnImprimir};
        JLabel[] label={lblidproov,lblname,lblNombrecontacto,lblCargocontacto,lblDireccion,lblCiudad,lblRegion,lblCodigoPostal,lblPais,lblTelefono,lblFax};
 JLabel[] label2={lblID,lblname2};
JTextField[] texto1={txtidprov,txtnombrecomp,txtnombrecont,txtcargocont,txtdir,txtciudad,txtregion,txtcodpostal,txtpais,txttelf,txtfax};

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
        
        separacionlbl=100;
        for(JLabel lbl:label2)
        {
            lbl.setBounds(separacionlbl,525,120,30);
            separacionlbl+=250;
        }
        
        separacionlbl=100;
        
              for(JTextField txt:texto1)
        {
            txt.setBounds(230,separacionlbl,100,20);
            separacionlbl+=35;
        }
             lblpag.setBounds(390,100,100,20);
             txtpagprin.setBounds(500,100,100,20);
             
             
              separaciontxt=160;
          for(JTextField txt:texto2)
        {
            txt.setBounds(separaciontxt,535,100,20);
            separaciontxt+=310;
        }
          txtpais.setBounds(1000, 1000, 100, 20);
          
             
             
    }
    
            public void Habilitarbtn()
    {
     
        JTextField[] texto1={txtidprov,txtnombrecomp,txtnombrecont,txtcargocont,txtdir,txtciudad,txtregion,txtcodpostal,txtpais,txttelf,txtfax,txtpagprin};
           
       if(!texto1[0].getText().isEmpty() && !texto1[1].getText().isEmpty() && !texto1[2].getText().isEmpty() &&
          !texto1[3].getText().isEmpty() && !texto1[4].getText().isEmpty() && !texto1[5].getText().isEmpty() &&
          !texto1[6].getText().isEmpty() && !texto1[7].getText().isEmpty() && !texto1[8].getText().isEmpty() &&
          !texto1[9].getText().isEmpty() && !texto1[10].getText().isEmpty()&& !texto1[11].getText().isEmpty() )
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

        jSeparator1 = new javax.swing.JSeparator();
        lblMantenimiento = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        lblidproov = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblNombrecontacto = new javax.swing.JLabel();
        lblCargocontacto = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        lblCodigoPostal = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        txttelf = new javax.swing.JTextField();
        txtpagprin = new javax.swing.JTextField();
        txtpais = new javax.swing.JTextField();
        txtcodpostal = new javax.swing.JTextField();
        txtregion = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txtnombrecomp = new javax.swing.JTextField();
        txtnombrecont = new javax.swing.JTextField();
        txtidprov = new javax.swing.JTextField();
        txtcargocont = new javax.swing.JTextField();
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
        lblpag = new javax.swing.JLabel();
        txtfax = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        cbxpais = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(763, 824));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(115, 75, 560, 10);

        lblMantenimiento.setText("Mantenimiento");
        getContentPane().add(lblMantenimiento);
        lblMantenimiento.setBounds(20, 60, 84, 16);

        lblBusqueda.setText("Búsqueda");
        getContentPane().add(lblBusqueda);
        lblBusqueda.setBounds(11, 479, 70, 16);

        lblidproov.setText("Id Proveedores");
        getContentPane().add(lblidproov);
        lblidproov.setBounds(87, 103, 86, 16);

        lblname.setText("Nombre Companía");
        getContentPane().add(lblname);
        lblname.setBounds(67, 130, 106, 16);

        lblNombrecontacto.setText("Nombre Contacto");
        getContentPane().add(lblNombrecontacto);
        lblNombrecontacto.setBounds(77, 170, 99, 16);

        lblCargocontacto.setText("Cargo Contacto");
        getContentPane().add(lblCargocontacto);
        lblCargocontacto.setBounds(87, 200, 88, 16);

        lblDireccion.setText("Dirección");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(127, 240, 52, 16);

        lblCiudad.setText("Ciudad");
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(137, 270, 39, 16);

        lblRegion.setText("Región");
        getContentPane().add(lblRegion);
        lblRegion.setBounds(137, 300, 39, 16);

        lblCodigoPostal.setText("Código Postal");
        getContentPane().add(lblCodigoPostal);
        lblCodigoPostal.setBounds(97, 330, 77, 16);

        lblPais.setText("País");
        getContentPane().add(lblPais);
        lblPais.setBounds(147, 360, 23, 16);

        lblTelefono.setText("Teléfono");
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(127, 390, 50, 16);

        lblFax.setText("Fax");
        getContentPane().add(lblFax);
        lblFax.setBounds(147, 420, 20, 16);

        txttelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelfKeyTyped(evt);
            }
        });
        getContentPane().add(txttelf);
        txttelf.setBounds(420, 350, 123, 22);

        txtpagprin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpagprinKeyReleased(evt);
            }
        });
        getContentPane().add(txtpagprin);
        txtpagprin.setBounds(472, 100, 123, 22);

        txtpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpaisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaisKeyTyped(evt);
            }
        });
        getContentPane().add(txtpais);
        txtpais.setBounds(440, 280, 123, 22);

        txtcodpostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodpostalActionPerformed(evt);
            }
        });
        txtcodpostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodpostalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodpostalKeyTyped(evt);
            }
        });
        getContentPane().add(txtcodpostal);
        txtcodpostal.setBounds(219, 327, 123, 22);

        txtregion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtregionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtregionKeyTyped(evt);
            }
        });
        getContentPane().add(txtregion);
        txtregion.setBounds(219, 297, 123, 22);

        txtciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtciudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciudadKeyTyped(evt);
            }
        });
        getContentPane().add(txtciudad);
        txtciudad.setBounds(219, 267, 123, 22);

        txtdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdirKeyReleased(evt);
            }
        });
        getContentPane().add(txtdir);
        txtdir.setBounds(219, 237, 123, 22);

        txtnombrecomp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombrecompKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrecompKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombrecomp);
        txtnombrecomp.setBounds(219, 127, 123, 22);

        txtnombrecont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombrecontKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrecontKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombrecont);
        txtnombrecont.setBounds(219, 167, 123, 22);

        txtidprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidprovActionPerformed(evt);
            }
        });
        txtidprov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidprovKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidprovKeyTyped(evt);
            }
        });
        getContentPane().add(txtidprov);
        txtidprov.setBounds(219, 100, 123, 22);

        txtcargocont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcargocontKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargocontKeyTyped(evt);
            }
        });
        getContentPane().add(txtcargocont);
        txtcargocont.setBounds(219, 197, 123, 22);

        lblID.setText("Id Prov.");
        getContentPane().add(lblID);
        lblID.setBounds(120, 530, 44, 16);

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbucarporcompaniaKeyTyped(evt);
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
        jScrollPane1.setBounds(131, 581, 452, 94);
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

        lblpag.setText("Página Principal");
        getContentPane().add(lblpag);
        lblpag.setBounds(360, 103, 90, 16);

        txtfax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfaxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfaxKeyTyped(evt);
            }
        });
        getContentPane().add(txtfax);
        txtfax.setBounds(420, 410, 123, 22);

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

        cbxpais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        cbxpais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxpaisItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxpais);
        cbxpais.setBounds(230, 380, 100, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodpostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodpostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodpostalActionPerformed

    private void txtidprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidprovActionPerformed

    private void txtbuscarporidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarporidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarporidActionPerformed

    private void txtbucarporcompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbucarporcompaniaActionPerformed

    private void txtnombrecompKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrecompKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
         txtnombrecomp.setText( txtnombrecomp.getText().toUpperCase());
    }//GEN-LAST:event_txtnombrecompKeyTyped

    private void txtnombrecontKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrecontKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
         txtnombrecont.setText( txtnombrecont.getText().toUpperCase());
    }//GEN-LAST:event_txtnombrecontKeyTyped

    private void txtcargocontKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargocontKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
         txtcargocont.setText( txtcargocont.getText().toUpperCase());
    }//GEN-LAST:event_txtcargocontKeyTyped

    private void txtciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudadKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
         txtciudad.setText( txtciudad.getText().toUpperCase());
    }//GEN-LAST:event_txtciudadKeyTyped

    private void txtregionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtregionKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
         txtregion.setText( txtregion.getText().toUpperCase());
    }//GEN-LAST:event_txtregionKeyTyped

    private void txtpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaisKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
         txtpais.setText( txtpais.getText().toUpperCase());
    }//GEN-LAST:event_txtpaisKeyTyped

    private void txtbucarporcompaniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaKeyTyped
     char validar=evt.getKeyChar();
        if(Character.isDigit(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
        }
         txtbucarporcompania.setText( txtbucarporcompania.getText().toUpperCase());
    }//GEN-LAST:event_txtbucarporcompaniaKeyTyped

    private void txtidprovKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidprovKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtidprovKeyTyped

    private void txtcodpostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodpostalKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtcodpostalKeyTyped

    private void txttelfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txttelfKeyTyped

    private void txtfaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfaxKeyTyped
       char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtfaxKeyTyped

    private void txtbuscarporidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarporidKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtbuscarporidKeyTyped

    private void txtidprovKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidprovKeyReleased
Habilitarbtn();        // TODO add your handling code here:
    }//GEN-LAST:event_txtidprovKeyReleased

    private void txtnombrecompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrecompKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecompKeyReleased

    private void txtnombrecontKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrecontKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecontKeyReleased

    private void txtcargocontKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargocontKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtcargocontKeyReleased

    private void txtdirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdirKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtdirKeyReleased

    private void txtciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciudadKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadKeyReleased

    private void txtregionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtregionKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtregionKeyReleased

    private void txtcodpostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodpostalKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtcodpostalKeyReleased

    private void txtpaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaisKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtpaisKeyReleased

    private void txttelfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelfKeyReleased
txtfax.setText(txttelf.getText());
        Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txttelfKeyReleased

    private void txtfaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfaxKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtfaxKeyReleased

    private void txtpagprinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpagprinKeyReleased
Habilitarbtn();         // TODO add your handling code here:
    }//GEN-LAST:event_txtpagprinKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        
        Proveedores proveedores = new Proveedores("root","Daniela23<3171561","neptuno", "localhost:3308");
        proveedores.conectarProveedores();
        JOptionPane.showMessageDialog(null, proveedores.guardarProveedores(txtidprov.getText(),txtnombrecomp.getText(),txtnombrecont.getText(),txtcargocont.getText()
    ,txtdir.getText(),txtciudad.getText(),txtregion.getText(),txtcodpostal.getText(),txtpais.getText(),txttelf.getText(),
    txtfax.getText())); 
        proveedores.cerrar();
        
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarMouseClicked
    btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnElminar.setEnabled(true);
    
               System.out.println(""+tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 1));
        
        this.txtidprov.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 0).toString());
        this.txtnombrecomp.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 1).toString());
        this.txtnombrecont.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 2).toString());
        this.txtcargocont.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 3).toString());
        this.txtdir.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 4).toString());
        this.txtciudad.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 5).toString());
        
//      this.txtregion.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 6).toString());
        this.txtcodpostal.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 7).toString());
        this.txtpais.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 8).toString());
        this.txttelf.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 9).toString());
       // this.txtfax.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 10).toString());     
   
        
       
        
    }//GEN-LAST:event_tblBuscarMouseClicked

    private void txtbuscarporidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarporidKeyReleased
          try {
            // TODO add your handling code here:
            Proveedores proveedores = new Proveedores("root","Daniela23<3171561","neptuno", "localhost:3308");
        proveedores.conectarProveedores();
            ResultSet rsCliente = proveedores.buscarPorId(txtbuscarporid.getText());
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
            proveedores.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtbuscarporidKeyReleased

    private void txtbucarporcompaniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbucarporcompaniaKeyReleased
                 try {
            // TODO add your handling code here:
            Proveedores proveedores = new Proveedores("root","Daniela23<3171561","neptuno", "localhost:3308");
        proveedores.conectarProveedores();
            ResultSet rsCliente = proveedores.buscarPorNombre(txtbucarporcompania.getText());
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
            proveedores.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtbucarporcompaniaKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          Proveedores proveedores = new Proveedores("root","Daniela23<3171561","neptuno", "localhost:3308");
        proveedores.conectarProveedores();
        JOptionPane.showMessageDialog(null, proveedores.modificarProveedores(txtidprov.getText(),txtnombrecomp.getText(),txtnombrecont.getText(),txtcargocont.getText()
    ,txtdir.getText(),txtciudad.getText(),txtregion.getText(),txtcodpostal.getText(),txtpais.getText(),txttelf.getText(),
    txtfax.getText())); 
        proveedores.cerrar();
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnElminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarActionPerformed
             Proveedores proveedores = new Proveedores("root","Daniela23<3171561","neptuno", "localhost:3308");
        proveedores.conectarProveedores();
        JOptionPane.showMessageDialog(null, proveedores.eliminarProveedores(txtidprov.getText())); 
        proveedores.cerrar();
        
    }//GEN-LAST:event_btnElminarActionPerformed

    private void cbxpaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxpaisItemStateChanged
       txtpais.setText(cbxpais.getSelectedItem().toString());
    }//GEN-LAST:event_cbxpaisItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxpais;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCargocontacto;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblNombrecontacto;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblidproov;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lblpag;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtbucarporcompania;
    private javax.swing.JTextField txtbuscarporid;
    private javax.swing.JTextField txtcargocont;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcodpostal;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextField txtidprov;
    private javax.swing.JTextField txtnombrecomp;
    private javax.swing.JTextField txtnombrecont;
    private javax.swing.JTextField txtpagprin;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtregion;
    private javax.swing.JTextField txttelf;
    // End of variables declaration//GEN-END:variables
}
