package neptuno;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MejoresClientes {
     
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
    public MejoresClientes(String usuario, String contrasena, String bd, String servidor)
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
    public void conectarMejoresClientes()
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
    
    
        public ResultSet MejoresClientes() throws SQLException
            
    {
        return stm.executeQuery("select c.nombreCompañía, sum(d.cantidad*d.precioUnidad) from clientes as c, pedidos as p, `detalles de pedidos` as d, \n" +
"					productos as x where c.idCliente=p.idCliente and p.idPedido=d.idPedido and d.idProducto=x.idProducto\n" +
"					group by c.idCLiente order by sum(d.cantidad*d.precioUnidad) desc limit 10");
       
    }
        
                public ResultSet MejoresClientes2() throws SQLException
            
    {
        return stm.executeQuery("select c.nombreCompañía, sum(d.cantidad*d.precioUnidad) from clientes as c, pedidos as p, `detalles de pedidos` as d, \n" +
"					productos as x where c.idCliente=p.idCliente and p.idPedido=d.idPedido and d.idProducto=x.idProducto\n" +
"					group by c.idCLiente order by sum(d.cantidad*d.precioUnidad) asc limit 10");
       
    }
        
        
        	ResultSet ventasCategoria(String fecha1,String fecha2) throws SQLException 
	{
return stm.executeQuery("select c.nombreCategoría, sum(d.cantidad * d.precioUnidad) from Categorías as c, Productos as p, `Detalles de pedidos` as d, pedidos as x where c.idCategoría = p.idCategoría and p.idProducto = d.idProducto and d.idPedido = x.idPedido and x.fechaPedido between '"+fecha1+"' and '"+fecha2+"' group by c.nombreCategoría");
}

        
        
    
    
}
