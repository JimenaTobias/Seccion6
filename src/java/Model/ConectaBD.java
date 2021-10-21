package Model;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConectaBD {
    public static Connection con=null;
    private static String bd = "sistemalogin";
    public static String usuario = "root";
    public static String passw = "";
    public static String url = "jdbc:mysql://localhost:3306/"+bd;
    
    public static Connection abrir(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,passw);
            System.out.println("Conexión exitosa:"+con);    

        } catch (Exception e) {
            System.out.println("Error en la conexion...");
            e.printStackTrace();
            return null;
        }
        return con;
    }

    public static void cerrar(){
        try{
            if(con != null)
            con.close();
        } catch (Exception e){
            System.out.println("Error: No se logro cerrarla conexion:\n"+e);
        }
    }
}
