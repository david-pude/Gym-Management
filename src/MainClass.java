
import com.databaseCon.DB;
import com.home.HomeFrame;
import com.login.LoginFrame;

/**
 *
 * @author David Pude
 */
public class MainClass {
    public static void main(String[] args) {
        DB.loadConnection();
        
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
    }
}
