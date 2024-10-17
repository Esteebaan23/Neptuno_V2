package neptuno;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FeGa
 */
public class Clientes {
    
    private String idCliente;
    private String nombreCompania;
    private String nombreContacto;
    private String cargoContacto;
    private String direccion;
    private String ciudad;
    private String region;
    private String codpostal;
    private String pais;
    private String telefono;
    private String fax;
    
    private String user;
    private String password;
    private String db;
    private String host; //nombre de donde esta la base de datos
    private String url; //de donde esta la carpeta de la base de datos
    private Connection conn = null; //comunicacion de la base de datos
    private Statement stm;// permite guardar comandos SQL
    
   
     //Constructor
    public Clientes(String usuario, String contrasena, String bd, String servidor)
    {
        this.user = usuario;
        this.password = contrasena;
        this.db = bd;
        this.host = servidor;
        //this.url = "jdbc:mysql://" + this.host + "/" + this.db; // se la utiliza cuando el SQL de 6 para abajo
	//quitar el comentario cuando se usa MySql 8 y superior
	this.url = "jdbc:mysql://" + this.host + "/" + this.db+"?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    }
    
    //Metodo para abrir la conexion a la BD
    public void conectarClientes()
    {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");//   org.gjt.mm.mysql.Driver 
                conn = DriverManager.getConnection(url, user, password);
                if (conn != null)
                {
                    System.out.println("Conexión a base de datos "+url+" ... Ok");
                    stm = conn.createStatement();
                }
            }   
        catch(SQLException ex) {
            System.out.println("Problema en la conexión a la base de datos "+url);
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    //Método para cerrar la conexión a la BD
    public void cerrar()
    {
        try{
            if(conn !=null){
                stm.close();
                conn.close();
                System.out.println("Conexi�n cerrada");
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public String guardarCliente(String idCliente, String nombreCompania, String nombreContacto, String cargoContacto, String direccion, String ciudad, String region, String codpostal, String pais,String telefono,String fax)
    
    {
        
        try {
            stm.execute("INSERT INTO clientes (idCliente, nombreCompañía, nombreContacto, cargoContacto,dirección,ciudad,región,Códpostal,país,teléfono,fax ) VALUES ('"+idCliente+"', '"+nombreCompania+"', '"+nombreContacto+"', '"+cargoContacto+"', '"+direccion+"', '"+ciudad+"', '"+region+"', '"+codpostal+"', '"+pais+"', '"+telefono+"', '"+fax+"' )");
            return "El registro se ha guardado";
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "El registro no se pudo guardar";
        }

    }
    //para actualizar el registro
    public String modificarCliente(String idCliente, String nombreCompania, String nombreContacto, String cargoContacto, String direccion, String ciudad, String región, String codpostal, String pais,String telefono,String fax)
    {
        try {
            stm.execute("UPDATE clientes SET nombreCompañía='"+nombreCompania+"', nombreContacto='"+nombreContacto+"' , cargoContacto='"+cargoContacto+"', dirección='"+direccion+"', ciudad='"+ciudad+"', región='"+región+"', Códpostal='"+codpostal+"', país='"+pais+"', teléfono='"+telefono+"', fax='"+fax+"' WHERE idCliente='"+idCliente+"'");
            return "El registro se ha actualizado con exito";
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "El registro no se ha actualizado";
        }

    }
    
    public String eliminarCliente(String id)
    {
        try {
            stm.execute("DELETE FROM clientes WHERE idCliente='"+id+"' ");
            return "Registro borrado";
        } 
        catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "No se pudo borrar";
        }
    }
    
    public ResultSet buscarPorId(String id) throws SQLException
            
    {
        return stm.executeQuery("SELECT * FROM clientes where idCliente like '"+ id +"%'");
       //executeQuery para hacer un select si es insetrt deleto ahi solo es execute
       // el % es para decirle que empeice por tal y termine por tal "c%s"
    }


    public ResultSet buscarPorCompania(String compania) throws SQLException
            
    {
        return stm.executeQuery("SELECT * FROM clientes where nombreCompañía like '"+ compania +"%'");
       
    }




    
}


