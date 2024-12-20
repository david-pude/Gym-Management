
   
    import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class connection
{
private static java.sql.Connection cnct;
    
     public static java.sql.Connection getConnected() {
        if(cnct==null){
            try{
                String url=" jdbc:mysql://localhost:3306/egym?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String user ="root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                cnct=DriverManager.getConnection(url,user,password);
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
    }
    return cnct;
}
public static void main(String[] args) {
        // TODO code application logic here
    }


}
