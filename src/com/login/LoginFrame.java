package com.login;

import com.home.HomeFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author David Pude
 */
public class LoginFrame extends JFrame implements ActionListener {
    
    private final Container c;
    private final JLabel title;
    private final JLabel uname;
    private final JTextField tuname;
    private final JLabel password;
    private final JPasswordField tpassword;
    private final JButton sub;
    private final JButton register;
    private final JLabel res;
 
 
    public LoginFrame()
    {
        setTitle("Login");
        setBounds(300, 90, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Login");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(100, 30);
        c.add(title);
        
        uname = new JLabel("Username");
        uname.setFont(new Font("Arial", Font.PLAIN, 20));
        uname.setSize(100, 20);
        uname.setLocation(100, 100);
        c.add(uname);
 
        tuname = new JTextField();
        tuname.setFont(new Font("Arial", Font.PLAIN, 15));
        tuname.setSize(190, 20);
        tuname.setLocation(200, 100);
        c.add(tuname);
        
        password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setSize(100, 20);
        password.setLocation(100, 150);
        c.add(password);
 
        tpassword = new JPasswordField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(190, 20);
        tpassword.setLocation(200, 150);
        c.add(tpassword);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 200);
        sub.addActionListener(this);
        c.add(sub);
        
        register = new JButton("Register");
        register.setFont(new Font("Arial", Font.PLAIN, 15));
        register.setSize(100, 20);
        register.setLocation(270, 200);
        register.addActionListener(this);
        c.add(register);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 300);
        c.add(res);
 
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            String username = tuname.getText();
            String pwd = tpassword.getText();
            
            UserRepository userRepo = new UserRepository();

            // login
            String id = userRepo.login(username, pwd);
            
            if (id != null) {
                setVisible(false);
                
                HomeFrame home = new HomeFrame(id);
                home.setVisible(true);
            }
        } else if (e.getSource() == register) {
            setVisible(false);
            
            RegistrationFrame registration = new RegistrationFrame();
            registration.setVisible(true);
        }
    }
}
