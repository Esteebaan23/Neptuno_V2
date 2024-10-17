
package neptuno;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FrmFactura extends javax.swing.JInternalFrame {

  String verificar;
  int activar;
  Font fuente = new Font("Comic Sans MS", Font.PLAIN, 10);
    PrintJob pj; 
    Graphics pagina;
    int inc = 110;
    String ID1,ID2,ID3,ID4;
    String direccion;
    String telefono;
    float sub1,sub2,sub3,sub4,sub5;
    float descontar;
    String idCliente;
           

    public FrmFactura() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
         JButton[] botones={btnNuevo,btnGuardar,btnModificar,btnElminar,btnImprimir};
        JLabel[] label={lblCliente,lblFecha};
        JLabel[] label2={lblDireccion,lblTelefono};
        JLabel[] label3={lblCodigo,lblDescripcion,lblCantidad,lblPrecio,lblSubtotal};
        JLabel[] label4={lblCliente1,lblDescuento,lblIva,lblTotal};
        JLabel[] label5={lblPorcentaje1,lblPorcentaje2};
        JTextField[] texto={txtDireccion,txtTelefono};
        JTextField[] texto1={txtDescripcion1,txtCantidad1,txtPrecio1,txtSubtotal1};
        JTextField[] texto2={txtDescripcion2,txtCantidad2,txtPrecio2,txtSubtotal2};
        JTextField[] texto3={txtDescripcion3,txtCantidad3,txtPrecio3,txtSubtotal3};
        JTextField[] texto4={txtDescripcion4,txtCantidad4,txtPrecio4,txtSubtotal4};
         JTextField[] texto7={txtDescripcion5,txtCantidad5,txtPrecio5,txtSubtotal5};
        JTextField[] texto5={txtCliente,txtDescuento,txtIva,txtTotal};
        JTextField[] texto6={txtPorcentaje1,txtPorcentaje2};
        JComboBox[] combo1={cbxCodigo1,cbxCodigo2,cbxCodigo3,cbxCodigo4,cbxCodigo5};
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnElminar.setEnabled(false);
        btnImprimir.setEnabled(true);
        lblNumero.setBounds(450, 50, 100, 20);
        
        cbxCodigo5.setEnabled(false);
        txtDescripcion5.setEnabled(false);
        txtPrecio5.setEnabled(false);
        txtCantidad5.setEnabled(false);
        txtSubtotal5.setEnabled(false);
        
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
Date date = new Date();
txtFecha.setText(dateFormat.format(date));
txtCantidad1.setText("0");
txtCantidad2.setText("0");
txtCantidad3.setText("0");
txtCantidad4.setText("0");
txtidCliente.setBounds(1000, 500, 100, 20);
txtCantidad5.setText("0");
        int separacionbtn=30;
        int separacionlbl=75;
        int separaciontxt=150;
        for(JButton btn:botones)
        {
            btn.setBounds(separacionbtn,30,30,30);
            separacionbtn+=30;
        }
        
         for(JLabel lbl:label)
        {
            lbl.setBounds(separacionlbl,105,50,30);
            separacionlbl+=270;
        }
         separacionlbl=75;
         
          for(JLabel lbl:label2)
        {
            lbl.setBounds(separacionlbl,145,70,30);
            separacionlbl+=270;
        }
          
          separacionlbl=50;
          
            for(JLabel lbl:label3)
        {
            lbl.setBounds(separacionlbl,200,70,30);
            separacionlbl+=130;
        }
            
            
                 for(JTextField txt:texto)
        {
            txt.setBounds(separaciontxt,150,150,20);
            separaciontxt+=270;
        }
                 txtFecha.setBounds(420, 110, 70, 20);
            
        separaciontxt=180;    
        
                   for(JTextField txt:texto1)
        {
            txt.setBounds(separaciontxt,235,70,20);
            separaciontxt+=130;
        }
                   separaciontxt=180;    
        
                   for(JTextField txt:texto2)
        {
            txt.setBounds(separaciontxt,280,70,20);
            separaciontxt+=130;
        }
           separaciontxt=180;         
                     for(JTextField txt:texto3)
        {
            txt.setBounds(separaciontxt,325,70,20);
            separaciontxt+=130;
        }
                     
                       separaciontxt=180;         
                     for(JTextField txt:texto4)
        {
            txt.setBounds(separaciontxt,370,70,20);
            separaciontxt+=130;
        }
                     
                     
                     separaciontxt=180;         
                     for(JTextField txt:texto7)
        {
            txt.setBounds(separaciontxt,415,70,20);
            separaciontxt+=130;
        }
                     separaciontxt=460;
                     
           for(JTextField txt:texto5)
        {
            txt.setBounds(570,separaciontxt,70,20);
            separaciontxt+=45;
        }
           
           separaciontxt=505;
                     
           for(JTextField txt:texto6)
        {
            txt.setBounds(510,separaciontxt,20,20);
            separaciontxt+=45;
        }
           separaciontxt=460;
                 
              for(JLabel lbl:label4)
        {
            lbl.setBounds(440,separaciontxt,70,20);
            separaciontxt+=45;
        }
              separaciontxt=505;
              
                 for(JLabel lbl:label5)
        {
            lbl.setBounds(530,separaciontxt,70,20);
            separaciontxt+=45;
        }
                 separaciontxt=235;
                 
                   for(JComboBox cbx:combo1)
        {
            cbx.setBounds(50,separaciontxt,110,20);
            separaciontxt+=45;
        }
            cbxCliente.setBounds(150, 110, 150, 20);
        
        
    }
    
     public void Subtotal()
    {
        if(!txtSubtotal1.getText().isEmpty())
        {
            sub1=Float.parseFloat(txtSubtotal1.getText());
        }
        else
        {
            sub1=0;
        }
        
        if(!txtSubtotal2.getText().isEmpty())
        {
            sub2=Float.parseFloat(txtSubtotal2.getText());
        }
        else
        {
            sub2=0;
        }
        if(!txtSubtotal3.getText().isEmpty())
        {
            sub3=Float.parseFloat(txtSubtotal3.getText());
        }
        else
        {
            sub3=0;
        }
        if(!txtSubtotal4.getText().isEmpty())
        {
            sub4=Float.parseFloat(txtSubtotal4.getText());
        }
        else
        {
            sub4=0;
        }
        
        if(!txtSubtotal5.getText().isEmpty())
        {
            sub5=Float.parseFloat(txtSubtotal5.getText());
        }
        else
        {
            sub5=0;
        }
        
        
        float subtotal=sub1+sub2+sub3+sub4+sub5;
        txtCliente.setText(Float.toString(subtotal));
        
     
        
    }
     
     
  
    
        public void Habilitarbtn()
    {
     
         JTextField[] texto1={txtDireccion,txtTelefono,txtDescripcion1,txtCantidad1,txtPrecio1,txtSubtotal1,txtCliente,txtDescuento,
         txtIva,txtTotal,txtPorcentaje1,txtPorcentaje2,txtFecha};       
           
       if(!texto1[0].getText().isEmpty() && !texto1[1].getText().isEmpty() && !texto1[2].getText().isEmpty() &&
          !texto1[3].getText().isEmpty() && !texto1[4].getText().isEmpty() && !texto1[5].getText().isEmpty() &&
          !texto1[6].getText().isEmpty() && !texto1[7].getText().isEmpty() && !texto1[8].getText().isEmpty() &&
          !texto1[9].getText().isEmpty() && !texto1[10].getText().isEmpty() && !texto1[11].getText().isEmpty() &&
          !texto1[12].getText().isEmpty() )
       {
           btnGuardar.setEnabled(true);
           btnImprimir.setEnabled(true);
       }
       else{
           btnGuardar.setEnabled(false);
           btnImprimir.setEnabled(false);
       }
    }
        
        public void imprimir(String Cliente, String Fecha, String Direccion, String Telefono, String cod1, String cod2,String cod3,String cod4,String desc1,String desc2,String desc3,String desc4
        ,String pre1,String pre2,String pre3,String pre4,String ub1,String ub2,String ub3,String ub4,String sub,String desc,String iva,String tot,String des,String ivv,String cant1,String cant2,String cant3,String cant4){
        try{
            pagina = pj.getGraphics();
            pagina.setFont(fuente);
            pagina.setColor(Color.black);
            pagina.drawString(Cliente, 150,110);
            pagina.drawString(Fecha, 420, 110);
            pagina.drawString(Direccion, 150,145);
            pagina.drawString(Telefono, 420, 145);
            
            int x=50;
            pagina.drawString(cod1, x, 235);
            pagina.drawString(cod2, x, 280);
            pagina.drawString(cod3, x, 325);
            pagina.drawString(cod4, x, 370);
            
            x+=115;
            pagina.drawString(desc1, x, 235);
            pagina.drawString(desc2, x, 280);
            pagina.drawString(desc3, x, 325);
            pagina.drawString(desc4, x, 370);
            
               x+=115;
            pagina.drawString(cant1, x, 235);
            pagina.drawString(cant2, x, 280);
            pagina.drawString(cant3, x, 325);
            pagina.drawString(cant4, x, 370);
            
            
                 x+=115;
            pagina.drawString(pre1, x, 235);
            pagina.drawString(pre1, x, 280);
            pagina.drawString(pre1, x, 325);
            pagina.drawString(pre1, x, 370);
            
               x+=115;
            pagina.drawString(ub1, x, 235);
            pagina.drawString(ub2, x, 280);
            pagina.drawString(ub3, x, 325);
            pagina.drawString(ub4, x, 370);
            
            
            pagina.drawString(sub, x, 415);
            pagina.drawString(desc, x, 460);
            pagina.drawString(iva, x, 505);
            pagina.drawString(tot, x, 550);
            
            pagina.drawString(des, 480, 460);
            pagina.drawString(ivv, 480, 505);
            
            
            pagina.dispose();
            pj.end();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Impresión cancelada...", "Aviso",JOptionPane.WARNING_MESSAGE);
    }
}


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente1 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        cbxCodigo1 = new javax.swing.JComboBox<>();
        txtDescripcion1 = new javax.swing.JTextField();
        txtCantidad1 = new javax.swing.JTextField();
        txtPrecio1 = new javax.swing.JTextField();
        txtSubtotal1 = new javax.swing.JTextField();
        cbxCodigo2 = new javax.swing.JComboBox<>();
        txtDescripcion2 = new javax.swing.JTextField();
        txtCantidad2 = new javax.swing.JTextField();
        txtPrecio2 = new javax.swing.JTextField();
        txtSubtotal2 = new javax.swing.JTextField();
        txtPrecio4 = new javax.swing.JTextField();
        txtSubtotal4 = new javax.swing.JTextField();
        cbxCodigo3 = new javax.swing.JComboBox<>();
        txtDescripcion3 = new javax.swing.JTextField();
        txtCantidad3 = new javax.swing.JTextField();
        txtPrecio3 = new javax.swing.JTextField();
        txtSubtotal3 = new javax.swing.JTextField();
        cbxCodigo4 = new javax.swing.JComboBox<>();
        txtDescripcion4 = new javax.swing.JTextField();
        txtCantidad4 = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        cbxCliente = new javax.swing.JComboBox<>();
        txtPorcentaje1 = new javax.swing.JTextField();
        txtPorcentaje2 = new javax.swing.JTextField();
        lblPorcentaje1 = new javax.swing.JLabel();
        lblPorcentaje2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        lblNumero = new javax.swing.JTextField();
        txtidCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbxCodigo5 = new javax.swing.JComboBox<>();
        txtPrecio5 = new javax.swing.JTextField();
        txtSubtotal5 = new javax.swing.JTextField();
        txtCantidad5 = new javax.swing.JTextField();
        txtDescripcion5 = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(706, 784));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        lblCliente1.setText("Subtotal");
        getContentPane().add(lblCliente1);
        lblCliente1.setBounds(250, 430, 47, 16);

        lblDireccion.setText("Direccion");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(80, 150, 52, 16);

        lblCodigo.setText("Codigo");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(60, 200, 39, 16);

        lblDescripcion.setText("Descripcion");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(150, 200, 65, 16);

        lblCantidad.setText("Cantidad");
        getContentPane().add(lblCantidad);
        lblCantidad.setBounds(240, 200, 50, 16);

        lblPrecio.setText("Precio");
        getContentPane().add(lblPrecio);
        lblPrecio.setBounds(330, 200, 35, 16);

        lblSubtotal.setText("Subtotal");
        getContentPane().add(lblSubtotal);
        lblSubtotal.setBounds(410, 200, 47, 16);

        cbxCodigo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto" }));
        cbxCodigo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCodigo1ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxCodigo1);
        cbxCodigo1.setBounds(49, 235, 142, 22);

        txtDescripcion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcion1KeyReleased(evt);
            }
        });
        getContentPane().add(txtDescripcion1);
        txtDescripcion1.setBounds(150, 235, 6, 22);

        txtCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad1ActionPerformed(evt);
            }
        });
        txtCantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidad1KeyReleased(evt);
            }
        });
        getContentPane().add(txtCantidad1);
        txtCantidad1.setBounds(231, 235, 6, 22);

        txtPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecio1KeyReleased(evt);
            }
        });
        getContentPane().add(txtPrecio1);
        txtPrecio1.setBounds(312, 235, 6, 22);

        txtSubtotal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubtotal1KeyReleased(evt);
            }
        });
        getContentPane().add(txtSubtotal1);
        txtSubtotal1.setBounds(399, 235, 6, 22);

        cbxCodigo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto" }));
        cbxCodigo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCodigo2ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxCodigo2);
        cbxCodigo2.setBounds(49, 275, 142, 22);

        txtDescripcion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcion2KeyReleased(evt);
            }
        });
        getContentPane().add(txtDescripcion2);
        txtDescripcion2.setBounds(150, 275, 6, 22);

        txtCantidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidad2KeyReleased(evt);
            }
        });
        getContentPane().add(txtCantidad2);
        txtCantidad2.setBounds(231, 275, 6, 22);

        txtPrecio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecio2KeyReleased(evt);
            }
        });
        getContentPane().add(txtPrecio2);
        txtPrecio2.setBounds(312, 275, 6, 22);

        txtSubtotal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubtotal2KeyReleased(evt);
            }
        });
        getContentPane().add(txtSubtotal2);
        txtSubtotal2.setBounds(399, 275, 6, 22);

        txtPrecio4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecio4KeyReleased(evt);
            }
        });
        getContentPane().add(txtPrecio4);
        txtPrecio4.setBounds(312, 355, 6, 22);

        txtSubtotal4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubtotal4KeyReleased(evt);
            }
        });
        getContentPane().add(txtSubtotal4);
        txtSubtotal4.setBounds(399, 355, 6, 22);

        cbxCodigo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto" }));
        cbxCodigo3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCodigo3ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxCodigo3);
        cbxCodigo3.setBounds(49, 315, 142, 22);

        txtDescripcion3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcion3KeyReleased(evt);
            }
        });
        getContentPane().add(txtDescripcion3);
        txtDescripcion3.setBounds(150, 315, 6, 22);

        txtCantidad3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidad3KeyReleased(evt);
            }
        });
        getContentPane().add(txtCantidad3);
        txtCantidad3.setBounds(231, 315, 6, 22);

        txtPrecio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio3ActionPerformed(evt);
            }
        });
        txtPrecio3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecio3KeyReleased(evt);
            }
        });
        getContentPane().add(txtPrecio3);
        txtPrecio3.setBounds(312, 315, 6, 22);

        txtSubtotal3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubtotal3KeyReleased(evt);
            }
        });
        getContentPane().add(txtSubtotal3);
        txtSubtotal3.setBounds(399, 315, 6, 22);

        cbxCodigo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto" }));
        cbxCodigo4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCodigo4ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxCodigo4);
        cbxCodigo4.setBounds(50, 350, 142, 22);

        txtDescripcion4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcion4KeyReleased(evt);
            }
        });
        getContentPane().add(txtDescripcion4);
        txtDescripcion4.setBounds(150, 355, 6, 22);

        txtCantidad4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidad4KeyReleased(evt);
            }
        });
        getContentPane().add(txtCantidad4);
        txtCantidad4.setBounds(231, 355, 6, 22);

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(150, 149, 6, 22);

        lblFecha.setText("Fecha");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(340, 110, 34, 16);

        lblTelefono.setText("Telefono");
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(330, 150, 50, 16);

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaKeyReleased(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(399, 109, 6, 22);

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
        txtTelefono.setBounds(399, 149, 6, 22);

        lblCliente.setText("Cliente");
        getContentPane().add(lblCliente);
        lblCliente.setBounds(80, 110, 39, 16);

        lblDescuento.setText("Descuento");
        getContentPane().add(lblDescuento);
        lblDescuento.setBounds(250, 470, 59, 16);

        lblIva.setText("Iva");
        getContentPane().add(lblIva);
        lblIva.setBounds(260, 510, 17, 16);

        lblTotal.setText("Total");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(250, 550, 29, 16);

        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyReleased(evt);
            }
        });
        getContentPane().add(txtDescuento);
        txtDescuento.setBounds(399, 466, 6, 22);

        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
        });
        getContentPane().add(txtTotal);
        txtTotal.setBounds(399, 546, 6, 22);

        txtIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIvaKeyReleased(evt);
            }
        });
        getContentPane().add(txtIva);
        txtIva.setBounds(399, 506, 6, 22);

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });
        getContentPane().add(txtCliente);
        txtCliente.setBounds(399, 426, 6, 22);

        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxClienteItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxCliente);
        cbxCliente.setBounds(150, 109, 31, 22);

        txtPorcentaje1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcentaje1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentaje1KeyTyped(evt);
            }
        });
        getContentPane().add(txtPorcentaje1);
        txtPorcentaje1.setBounds(312, 466, 23, 22);

        txtPorcentaje2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcentaje2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentaje2KeyTyped(evt);
            }
        });
        getContentPane().add(txtPorcentaje2);
        txtPorcentaje2.setBounds(312, 506, 23, 22);

        lblPorcentaje1.setText("%");
        getContentPane().add(lblPorcentaje1);
        lblPorcentaje1.setBounds(350, 470, 12, 16);

        lblPorcentaje2.setText("%");
        getContentPane().add(lblPorcentaje2);
        lblPorcentaje2.setBounds(350, 510, 12, 16);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neptuno/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
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
        btnGuardar.setBounds(30, 0, 28, 35);

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
        getContentPane().add(lblNumero);
        lblNumero.setBounds(420, 20, 6, 22);

        txtidCliente.setText(" ");
        getContentPane().add(txtidCliente);
        txtidCliente.setBounds(870, 380, 10, 22);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 410, 41, 25);

        cbxCodigo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto" }));
        cbxCodigo5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCodigo5ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxCodigo5);
        cbxCodigo5.setBounds(50, 410, 142, 22);

        txtPrecio5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecio5KeyReleased(evt);
            }
        });
        getContentPane().add(txtPrecio5);
        txtPrecio5.setBounds(310, 400, 30, 22);

        txtSubtotal5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubtotal5KeyReleased(evt);
            }
        });
        getContentPane().add(txtSubtotal5);
        txtSubtotal5.setBounds(400, 400, 30, 22);

        txtCantidad5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidad5KeyReleased(evt);
            }
        });
        getContentPane().add(txtCantidad5);
        txtCantidad5.setBounds(230, 400, 30, 22);

        txtDescripcion5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcion5KeyReleased(evt);
            }
        });
        getContentPane().add(txtDescripcion5);
        txtDescripcion5.setBounds(170, 390, 40, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidad1ActionPerformed

    private void txtPrecio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio3ActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      JTextField[] texto={txtDireccion,txtTelefono};
        JTextField[] texto1={txtDescripcion1,txtCantidad1,txtPrecio1,txtSubtotal1};
        JTextField[] texto2={txtDescripcion2,txtCantidad2,txtPrecio2,txtSubtotal2};
        JTextField[] texto3={txtDescripcion3,txtCantidad3,txtPrecio3,txtSubtotal3};
        JTextField[] texto4={txtDescripcion4,txtCantidad4,txtPrecio4,txtSubtotal4};
        JTextField[] texto5={txtCliente,txtDescuento,txtIva,txtTotal};
        JTextField[] texto6={txtPorcentaje1,txtPorcentaje2};
        for(JTextField txt:texto)
        {
            txt.setText("");
            
        }
        for(JTextField txt:texto1)
        {
            txt.setText("");
            
        }
        for(JTextField txt:texto2)
        {
            txt.setText("");
            
        }
        for(JTextField txt:texto3)
        {
            txt.setText("");
            
        }
        for(JTextField txt:texto4)
        {
            txt.setText("");                                                                                                                                                                                 
            
        }
        for(JTextField txt:texto5)
        {
            txt.setText("");
            
        }
        for(JTextField txt:texto6)
        {
            txt.setText("");
            
        }
        txtFecha.setText("");
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyReleased
Habilitarbtn();
       
    }//GEN-LAST:event_txtFechaKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
     Habilitarbtn();
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
Habilitarbtn();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtDescripcion1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcion1KeyReleased
 Habilitarbtn();
    }//GEN-LAST:event_txtDescripcion1KeyReleased

    private void txtDescripcion2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcion2KeyReleased
     Habilitarbtn();  // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcion2KeyReleased

    private void txtDescripcion3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcion3KeyReleased
   Habilitarbtn(); // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcion3KeyReleased

    private void txtDescripcion4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcion4KeyReleased
    Habilitarbtn();   // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcion4KeyReleased

    private void txtCantidad1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad1KeyReleased
   Habilitarbtn(); // TODO add your handling code here:
if(!txtCantidad1.getText().isEmpty()&&!txtPrecio1.getText().isEmpty()){
   float cantidad=Float.parseFloat(txtCantidad1.getText());
   float precio=Float.parseFloat(txtPrecio1.getText());
   float subtotal=cantidad*precio;
   txtSubtotal1.setText(Float.toString(subtotal));
   
   Subtotal();
  
}
   
    }//GEN-LAST:event_txtCantidad1KeyReleased

    private void txtCantidad2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad2KeyReleased
    Habilitarbtn(); // TODO add your handling code here:
    if(!txtCantidad2.getText().isEmpty()&&!txtPrecio2.getText().isEmpty()){
   float cantidad=Float.parseFloat(txtCantidad2.getText());
   float precio=Float.parseFloat(txtPrecio2.getText());
   float subtotal=cantidad*precio;
   txtSubtotal2.setText(Float.toString(subtotal));
    Subtotal();
   
    }
    }//GEN-LAST:event_txtCantidad2KeyReleased

    private void txtCantidad3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad3KeyReleased
     Habilitarbtn();  // TODO add your handling code here:
     if(!txtCantidad3.getText().isEmpty()&&!txtPrecio3.getText().isEmpty()){
   float cantidad=Float.parseFloat(txtCantidad3.getText());
   float precio=Float.parseFloat(txtPrecio3.getText());
   float subtotal=cantidad*precio;
   txtSubtotal3.setText(Float.toString(subtotal));
    Subtotal();
    
     }
    }//GEN-LAST:event_txtCantidad3KeyReleased

    private void txtCantidad4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad4KeyReleased
  Habilitarbtn();
  if(!txtCantidad4.getText().isEmpty()&&!txtPrecio4.getText().isEmpty()){
   float cantidad=Float.parseFloat(txtCantidad4.getText());
   float precio=Float.parseFloat(txtPrecio4.getText());
   float subtotal=cantidad*precio;
   txtSubtotal4.setText(Float.toString(subtotal));
    Subtotal();
    
  }
    }//GEN-LAST:event_txtCantidad4KeyReleased

    private void txtPrecio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio1KeyReleased
     Habilitarbtn();  // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio1KeyReleased

    private void txtPrecio2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio2KeyReleased
    Habilitarbtn(); // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio2KeyReleased

    private void txtPrecio3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio3KeyReleased
    Habilitarbtn();  // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio3KeyReleased

    private void txtPrecio4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio4KeyReleased
   Habilitarbtn();// TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio4KeyReleased

    private void txtSubtotal1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubtotal1KeyReleased
    Habilitarbtn(); // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotal1KeyReleased

    private void txtSubtotal2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubtotal2KeyReleased
    Habilitarbtn();   // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotal2KeyReleased

    private void txtSubtotal3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubtotal3KeyReleased
    Habilitarbtn(); // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotal3KeyReleased

    private void txtSubtotal4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubtotal4KeyReleased
     Habilitarbtn();  // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotal4KeyReleased

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
     Habilitarbtn();  // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void txtIvaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaKeyReleased
     Habilitarbtn();   // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaKeyReleased

    private void txtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyReleased
     Habilitarbtn();   // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoKeyReleased

    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased
 Habilitarbtn();
    }//GEN-LAST:event_txtTotalKeyReleased

    private void txtPorcentaje1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentaje1KeyReleased
    Habilitarbtn(); // TODO add your handling code here:
 
             if(txtPorcentaje1.getText().length()==2)
    {
       float subtotal=Float.parseFloat(txtCliente.getText());
        float pdescuento=Float.parseFloat(txtPorcentaje1.getText());
        float descuento=((pdescuento)/100)*subtotal;
        descontar=subtotal-descuento;
        txtDescuento.setText(Float.toString(descuento));
        System.out.println(descontar);
    }    
    
    }//GEN-LAST:event_txtPorcentaje1KeyReleased

    private void txtPorcentaje2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentaje2KeyReleased
    Habilitarbtn();    // TODO add your handling code here:
                if(txtPorcentaje2.getText().length()==2)
    {
    float Piva=Float.parseFloat(txtPorcentaje2.getText());
    float iva=descontar*((Piva)/100);
    System.out.println(iva);
    txtIva.setText(Float.toString(iva));
    descontar=iva+descontar;
    txtTotal.setText(Float.toString(descontar));
    }
    

    
    
    
    
    }//GEN-LAST:event_txtPorcentaje2KeyReleased

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed

    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
              pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "Factura", null);
        this.imprimir((String)cbxCliente.getSelectedItem(), txtFecha.getText(),txtDireccion.getText(), txtTelefono.getText(),(String)cbxCodigo1.getSelectedItem() , (String)cbxCodigo2.getSelectedItem(),(String)cbxCodigo3.getSelectedItem(),(String)cbxCodigo4.getSelectedItem(),txtDescripcion1.getText(),txtDescripcion2.getText(),txtDescripcion3.getText(),txtDescripcion4.getText()
        ,txtPrecio1.getText(),txtPrecio2.getText(),txtPrecio3.getText(),txtPrecio4.getText(),txtSubtotal1.getText(),txtSubtotal2.getText(),txtSubtotal3.getText(),txtSubtotal4.getText(),txtCliente.getText(),txtDescuento.getText(),txtIva.getText(),txtTotal.getText(),txtPorcentaje1.getText(),txtPorcentaje2.getText(),txtCantidad1.getText(),txtCantidad2.getText(),txtCantidad3.getText(),txtCantidad4.getText());

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void cbxClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxClienteItemStateChanged
  
      try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
          
          ResultSet rsClientes2 =factura.consultarClientes2(cbxCliente.getSelectedItem().toString());
          
          
          while(rsClientes2.next())
          {
             txtDireccion.setText(rsClientes2.getObject(2).toString());
              txtTelefono.setText(rsClientes2.getObject(3).toString());
              txtidCliente.setText(rsClientes2.getObject(1).toString());
              idCliente=rsClientes2.getObject(1).toString();
              
          }
      
          
         
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }//GEN-LAST:event_cbxClienteItemStateChanged

    private void cbxCodigo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCodigo1ItemStateChanged
      try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
          ResultSet rsProveedores =factura.consultarProducto2(cbxCodigo1.getSelectedItem().toString());
          
          
          while(rsProveedores.next())
          {
              txtPrecio1.setText(rsProveedores.getObject(1).toString());
              txtDescripcion1.setText(rsProveedores.getObject(2).toString());
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }//GEN-LAST:event_cbxCodigo1ItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      
        
        try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
          ResultSet rsProveedores =factura.consultarProducto(ID1);
          
          
          while(rsProveedores.next())
          {
              cbxCodigo1.addItem(rsProveedores.getObject(1).toString());
              cbxCodigo2.addItem(rsProveedores.getObject(1).toString());
              cbxCodigo3.addItem(rsProveedores.getObject(1).toString());
              cbxCodigo4.addItem(rsProveedores.getObject(1).toString());
                cbxCodigo5.addItem(rsProveedores.getObject(1).toString());
            
          }
          
               
          
          
          
            ResultSet rsClientes =factura.consultarClientes();
          while(rsClientes.next())
          {
              cbxCliente.addItem(rsClientes.getObject(1).toString());
            
              
          }
          
          
          
          ResultSet rsPedido =factura.numeroPedido();
           while(rsPedido.next())
          {
              lblNumero.setText(rsPedido.getObject(1).toString());
            
              
          }
          
          
          
          
          
          
          
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbxCodigo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCodigo2ItemStateChanged
          try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
          ResultSet rsProveedores =factura.consultarProducto2(cbxCodigo2.getSelectedItem().toString());
          
          
          while(rsProveedores.next())
          {
              txtPrecio2.setText(rsProveedores.getObject(1).toString());
               txtDescripcion2.setText(rsProveedores.getObject(2).toString());
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_cbxCodigo2ItemStateChanged

    private void cbxCodigo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCodigo3ItemStateChanged
            try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
          ResultSet rsProveedores =factura.consultarProducto2(cbxCodigo3.getSelectedItem().toString());
          
          
          while(rsProveedores.next())
          {
              txtPrecio3.setText(rsProveedores.getObject(1).toString());
               txtDescripcion3.setText(rsProveedores.getObject(2).toString());
          }
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_cbxCodigo3ItemStateChanged

    private void cbxCodigo4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCodigo4ItemStateChanged
           try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
          ResultSet rsProveedores =factura.consultarProducto2(cbxCodigo4.getSelectedItem().toString());
          
          
          while(rsProveedores.next())
          {
              txtPrecio4.setText(rsProveedores.getObject(1).toString());
               txtDescripcion4.setText(rsProveedores.getObject(2).toString());
          }
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_cbxCodigo4ItemStateChanged

    private void txtPorcentaje2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentaje2KeyTyped

    
    }//GEN-LAST:event_txtPorcentaje2KeyTyped

    private void txtPorcentaje1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentaje1KeyTyped
 
    }//GEN-LAST:event_txtPorcentaje1KeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
         factura.guardarPedido(txtidCliente.getText(),"1",txtFecha.getText());
         factura.guardarDetalle(lblNumero.getText(), cbxCodigo1.getSelectedItem().toString(), txtCantidad1.getText(), txtPrecio1.getText());
         
         if(!txtCantidad2.getText().isEmpty() && !txtPrecio2.getText().isEmpty())
         {
         factura.guardarDetalle(lblNumero.getText(), cbxCodigo2.getSelectedItem().toString(), txtCantidad2.getText(), txtPrecio2.getText());
         }
          if(!txtCantidad3.getText().isEmpty() && !txtPrecio3.getText().isEmpty())
          {
         factura.guardarDetalle(lblNumero.getText(), cbxCodigo3.getSelectedItem().toString(), txtCantidad3.getText(), txtPrecio3.getText());
          }
           if(!txtCantidad4.getText().isEmpty() && !txtPrecio4.getText().isEmpty())
           {
         factura.guardarDetalle(lblNumero.getText(), cbxCodigo4.getSelectedItem().toString(), txtCantidad4.getText(), txtPrecio4.getText());
           }
           
            if(!txtCantidad5.getText().isEmpty() && !txtPrecio5.getText().isEmpty())
           {
         factura.guardarDetalle(lblNumero.getText(), cbxCodigo5.getSelectedItem().toString(), txtCantidad5.getText(), txtPrecio5.getText());
           }
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxCodigo5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCodigo5ItemStateChanged
         try {
          Factura factura = new Factura("root","Daniela23<3171561","neptuno","localhost:3308");
          factura.conectarFactura();
          ResultSet rsProveedores =factura.consultarProducto2(cbxCodigo5.getSelectedItem().toString());
          
          
          while(rsProveedores.next())
          {
              txtPrecio5.setText(rsProveedores.getObject(1).toString());
               txtDescripcion5.setText(rsProveedores.getObject(2).toString());
          }
      } catch (SQLException ex) {
          Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_cbxCodigo5ItemStateChanged

    private void txtPrecio5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio5KeyReleased

    private void txtSubtotal5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubtotal5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotal5KeyReleased

    private void txtCantidad5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidad5KeyReleased
         if(!txtCantidad5.getText().isEmpty()&&!txtPrecio5.getText().isEmpty()){
   float cantidad=Float.parseFloat(txtCantidad5.getText());
   float precio=Float.parseFloat(txtPrecio5.getText());
   float subtotal=cantidad*precio;
   txtSubtotal5.setText(Float.toString(subtotal));
    Subtotal();
         }
    }//GEN-LAST:event_txtCantidad5KeyReleased

    private void txtDescripcion5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcion5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcion5KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cbxCodigo5.setEnabled(true);
        txtDescripcion5.setEnabled(true);
        txtPrecio5.setEnabled(true);
        txtCantidad5.setEnabled(true);
        txtSubtotal5.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxCodigo1;
    private javax.swing.JComboBox<String> cbxCodigo2;
    private javax.swing.JComboBox<String> cbxCodigo3;
    private javax.swing.JComboBox<String> cbxCodigo4;
    private javax.swing.JComboBox<String> cbxCodigo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JTextField lblNumero;
    private javax.swing.JLabel lblPorcentaje1;
    private javax.swing.JLabel lblPorcentaje2;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad1;
    private javax.swing.JTextField txtCantidad2;
    private javax.swing.JTextField txtCantidad3;
    private javax.swing.JTextField txtCantidad4;
    private javax.swing.JTextField txtCantidad5;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescripcion1;
    private javax.swing.JTextField txtDescripcion2;
    private javax.swing.JTextField txtDescripcion3;
    private javax.swing.JTextField txtDescripcion4;
    private javax.swing.JTextField txtDescripcion5;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtPorcentaje1;
    private javax.swing.JTextField txtPorcentaje2;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtPrecio3;
    private javax.swing.JTextField txtPrecio4;
    private javax.swing.JTextField txtPrecio5;
    private javax.swing.JTextField txtSubtotal1;
    private javax.swing.JTextField txtSubtotal2;
    private javax.swing.JTextField txtSubtotal3;
    private javax.swing.JTextField txtSubtotal4;
    private javax.swing.JTextField txtSubtotal5;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtidCliente;
    // End of variables declaration//GEN-END:variables
}
