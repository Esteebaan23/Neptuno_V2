package neptuno;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Productos {
     private String user;
    private String password;
    private String db;
    private String host; //nombre de donde esta la base de datos
    private String url; //de donde esta la carpeta de la base de datos
    private Connection conn = null; //comunicacion de la base de datos
    private Statement stm;// permite guardar comandos SQL 
    
    
    
     public Productos(String usuario, String contrasena, String bd, String servidor)
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
    public void conectarProductos()
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
    
    
    
    
    
    
    
    
      public String guardarProducto(String IdProducto, String NombreProducto,  String CantidadPorUnidad, 
              String PrecioUnidad, String UnidadesEnExisstencia, String UnidadesEnPedido, String NivelNuevoPedido,String Suspendido)
    
    {
        
        try {
            stm.execute("INSERT INTO productos (IdProducto, NombreProducto,CantidadPorUnidad,PrecioUnidad,UnidadesEnExistencia,UnidadesEnPedido,NivelNuevoPedido,Suspendido ) VALUES ('"+IdProducto+"', '"+
                    NombreProducto+"', '"+CantidadPorUnidad+"', '"+PrecioUnidad+"', '"+UnidadesEnExisstencia+"', '"+UnidadesEnPedido+"', '"
                            + ""+NivelNuevoPedido+"', '"+Suspendido+"' )");
            return "El registro se ha guardado";
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "El registro no se pudo guardar";
        }

    }  
    
    
    
    
    
    public String modificarProducto(String IdProducto, String NombreProducto,  String CantidadPorUnidad, 
              String PrecioUnidad, String UnidadesEnExistencia, String UnidadesEnPedido, String NivelNuevoPedido)
    {
        try {
            stm.execute("UPDATE productos SET NombreProducto='"+NombreProducto+"' , CantidadPorUnidad='"+CantidadPorUnidad+"',"
                    + " PrecioUnidad='"+PrecioUnidad+"', UnidadesEnExistencia='"+UnidadesEnExistencia+"', UnidadesEnPedido='"+UnidadesEnPedido+"', NivelNuevoPedido='"+NivelNuevoPedido+"'"
                    +"  WHERE IdProducto='"+IdProducto+"'");
            return "El registro se ha actualizado con exito";
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "El registro no se ha actualizado";
        }

    }
    
    public String eliminarProducto(String id)
    {
        try {
            stm.execute("DELETE FROM productos WHERE IdProducto='"+id+"' ");
            return "Registro borrado";
        } 
        catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            return "No se pudo borrar";
        }
    }
    
    
    
       public ResultSet buscarPorId(String id) throws SQLException
            
    {
        return stm.executeQuery("SELECT * FROM productos where idProducto like '"+ id +"%'");
       //executeQuery para hacer un select si es insetrt deleto ahi solo es execute
       // el % es para decirle que empeice por tal y termine por tal "c%s"
    }


    public ResultSet buscarPorNombre(String nombre) throws SQLException
            
    {
        return stm.executeQuery("SELECT * FROM productos where NombreProducto like '"+ nombre +"%'");
       
    }
    
    
    
    
    
    
public ResultSet cargarProveedores() throws SQLException
{
    return stm.executeQuery("select nombreCompañía from proveedores");
}

public ResultSet cargarCategorias() throws SQLException 
{
    return stm.executeQuery("select nombreCategoría from categorías");
}

public ResultSet consultarProveedor(String nombre) throws SQLException{
    return stm.executeQuery("select idProveedor from proveedores where nombreCompañía = '"+nombre+"' ");
}


public ResultSet consultarCategoria(String nombre) throws SQLException{
    
    return stm.executeQuery("select idCategoría from categorías where nombreCategoría ='"+nombre+"' ");
}


    
}
