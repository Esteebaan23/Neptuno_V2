package neptuno;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Factura {
       private String user;
    private String password;
    private String db;
    private String host; //nombre de donde esta la base de datos
    private String url; //de donde esta la carpeta de la base de datos
    private Connection conn = null; //comunicacion de la base de datos
    private Statement stm;// permite guardar comandos SQL 
    String idCliente;
    
     public Factura(String usuario, String contrasena, String bd, String servidor)
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
    public void conectarFactura()
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
    
    
    
    
    
    	public ResultSet consultarProducto (String id) throws SQLException
	{
		return stm.executeQuery("select idProducto,PrecioUnidad from productos");
	}
        
             public ResultSet consultarProducto2(String nombre) throws SQLException{
    
    return stm.executeQuery("select PrecioUnidad,NombreProducto from productos where idProducto ='"+nombre+"' ");
}
        
        
        
        
	public ResultSet cargarClientes() throws SQLException
	{
		return stm.executeQuery("select nombreCompañía from clientes");
	}

	public ResultSet consultarClientes() throws SQLException
	{
		return stm.executeQuery("select NombreContacto, Dirección, Teléfono from clientes");
	}
        
        public ResultSet consultarClientes2(String nombre) throws SQLException{
    
    return stm.executeQuery("select idCliente,Dirección, Teléfono from clientes where NombreContacto ='"+nombre+"' ");
}
           
        
        
        
        
        
	public void guardarPedido(String idCliente, String idEmpleado, String fecha) throws SQLException 
	{
		stm.execute("insert into pedidos(idCliente, idEmpleado, fechaPedido,CódPostalDestinatario) values('"+idCliente+"', '"+idEmpleado+"', '"+fecha+"', 12345)");
	}

        
	public void guardarDetalle(String idPedido, String idProducto, String cantidad, String precio ) throws SQLException 
	{
		stm.execute("insert into `detalles de pedidos`(idpedido, idproducto, cantidad, precioUnidad) values ('"+idPedido+"', '"+idProducto+"','"+cantidad+"','"+precio+"')");
	}
        
        public ResultSet numeroPedido() throws SQLException
        {
            return stm.executeQuery("select max(idPedido)+1 from pedidos");
        }
        
        
        
        public ResultSet cargarProducto () throws SQLException
	{
		return stm.executeQuery("select idProducto from productos");
	}

    
}
