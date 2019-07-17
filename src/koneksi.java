import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con; 
    public koneksi(){
        String id, pass, driver, url;
        id = "root";
        pass = "";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/pbopraktek";
        try{ 
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url,id,pass);
            if (con==null){
                
            }else{
                
            }
        }catch (Exception e){
            System.out.println(""+e.getMessage());
        }
    }    
}
