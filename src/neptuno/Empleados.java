package neptuno;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import neptuno.Clientes;

public class Empleados {

 private String user;
    private String password;
    private String db;
    private String host; //nombre de donde esta la base de datos
    private String url; //de donde esta la carpeta de la base de datos
    private Connection conn = null; //comunicacion de la base de datos
    private Statement stm;// permite guardar comandos SQL
    
   
     //Constructor
    public Empleados(String usuario, String contrasena, String bd, String servidor)
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
    public void conectarEmpleados()
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
    
    public String guardarEmpleados(String idEmpleado, String Apellidos, String nombre, String tratamiento, String fechaNacimiento, 
            String FechaContratación, String Dirección, String Ciudad,String Región,String CódPostal
    ,String país,String telDomicilio,String Extensión,String Foto,String Notas,String Jefe)
    
    {
        
        try {
            stm.execute("INSERT INTO empleados (idEmpleado, Apellidos, nombre,tratamiento,fechaNacimiento,FechaContratación,Dirección,Ciudad,Región,CódPostal,país,telDomicilio,Extensión,Foto,Notas,Jefe ) VALUES "
                    + "('"+idEmpleado+"', '"+Apellidos+"', '"+nombre+"', '"+tratamiento+"', '"+fechaNacimiento+"', "
                            + "'"+FechaContratación+"', '"+Dirección+"', '"+Ciudad+"', '"+Región+"', '"+CódPostal+"', '"+país+"', '"+telDomicilio+"', '"+Extensión+"', '"+Foto+"','"+Notas+"', '"+Jefe+"' )");
            return "El registro se ha guardado";
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "El registro no se pudo guardar";
        }

    }
    //para actualizar el registro
    public String modificarEmpleados(String idEmpleado, String Apellidos, String nombre, String tratamiento, String fechaNacimiento, 
            String FechaContratación, String Dirección, String Ciudad,String Región,String CódPostal
    ,String país,String telDomicilio,String Extensión,String Foto,String Notas,String Jefe)
    {
        try {
            stm.execute("UPDATE empleados SET Apellidos='"+Apellidos+"' , nombre='"+nombre+"', tratamiento='"+tratamiento+"'"
                    + ", fechaNacimiento='"+fechaNacimiento+"', FechaContratación='"+FechaContratación+"', Dirección='"+Dirección+"', Ciudad='"+Ciudad+"', Región='"+Región+"', "
                            + "CódPostal='"+CódPostal+"', país='"+país+"', telDomicilio='"+telDomicilio+"', Extensión='"+Extensión+"', Foto='"+Foto+"', Notas='"+Notas+"', Jefe='"+Jefe+"'"
                                    + " WHERE idEmpleado='"+idEmpleado+"'");
            return "El registro se ha actualizado con exito";
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "El registro no se ha actualizado";
        }

    }
    
    public String eliminarEmpleados(String id)
    {
        try {
            stm.execute("DELETE FROM empleados WHERE idEmpleado='"+id+"' ");
            return "Registro borrado";
        } 
        catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "No se pudo borrar";
        }
    }
    
    public ResultSet buscarPorId(String id) throws SQLException
            
    {
        return stm.executeQuery("SELECT * FROM empleados where idEmpleado like '"+ id +"%'");
       //executeQuery para hacer un select si es insetrt deleto ahi solo es execute
       // el % es para decirle que empeice por tal y termine por tal "c%s"
    }


    public ResultSet buscarPorNombre(String nombre) throws SQLException
            
    {
        return stm.executeQuery("SELECT * FROM empleados where Nombre like '"+ nombre +"%'");
       
    }


    
}
