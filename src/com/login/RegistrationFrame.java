package com.login;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author David Pude
 */
public class RegistrationFrame extends JFrame implements ActionListener {
    
    private final Container c;
    private final JLabel title;
    private final JLabel fname;
    private final JTextField tfname;
    private final JLabel lname;
    private final JTextField tlname;
    private final JLabel uname;
    private final JTextField tuname;
    private final JLabel password;
    private final JPasswordField tpassword;
    private final JLabel mno;
    private final JTextField tmno;
    private final JLabel gender;
    private final JRadioButton male;
    private final JRadioButton female;
    private final ButtonGroup gengp;
    private final JLabel dob;
    private final JComboBox date;
    private final JComboBox month;
    private final JComboBox year;
    private final JLabel add;
    private final JTextArea tadd;
    private final JButton sub;
    private final JButton login;
 
    private final String dates[]
        = { "01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private final String months[]
        = { "01", "02", "03", "04",
            "05", "06", "07", "08",
            "09", "10", "11", "12" };
    private final String years[]
        = { "1991","1992","1993","1994",
            "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020", "2021"};
 
    public RegistrationFrame()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 500, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(100, 30);
        c.add(title);
 
        fname = new JLabel("First Name");
        fname.setFont(new Font("Arial", Font.PLAIN, 20));
        fname.setSize(100, 20);
        fname.setLocation(100, 100);
        c.add(fname);
 
        tfname = new JTextField();
        tfname.setFont(new Font("Arial", Font.PLAIN, 15));
        tfname.setSize(190, 20);
        tfname.setLocation(200, 100);
        c.add(tfname);
        
        lname = new JLabel("Last Name");
        lname.setFont(new Font("Arial", Font.PLAIN, 20));
        lname.setSize(100, 20);
        lname.setLocation(100, 150);
        c.add(lname);
 
        tlname = new JTextField();
        tlname.setFont(new Font("Arial", Font.PLAIN, 15));
        tlname.setSize(190, 20);
        tlname.setLocation(200, 150);
        c.add(tlname);
        
        uname = new JLabel("Username");
        uname.setFont(new Font("Arial", Font.PLAIN, 20));
        uname.setSize(100, 20);
        uname.setLocation(100, 200);
        c.add(uname);
 
        tuname = new JTextField();
        tuname.setFont(new Font("Arial", Font.PLAIN, 15));
        tuname.setSize(190, 20);
        tuname.setLocation(200, 200);
        c.add(tuname);
        
        password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setSize(100, 20);
        password.setLocation(100, 250);
        c.add(password);
 
        tpassword = new JPasswordField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(190, 20);
        tpassword.setLocation(200, 250);
        c.add(tpassword);
 
        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 300);
        c.add(mno);
 
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(200, 300);
        c.add(tmno);
 
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 350);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 350);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 350);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 400);
        c.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 400);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 400);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 400);
        c.add(year);
 
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 450);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 450);
        tadd.setLineWrap(true);
        c.add(tadd);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 550);
        sub.addActionListener(this);
        c.add(sub);
 
        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setSize(100, 20);
        login.setLocation(270, 550);
        login.addActionListener(this);
        c.add(login);
 
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            String firstName = tfname.getText();
            String lastName = tlname.getText();
            String username = tuname.getText();
            String pwd = tpassword.getText();
            String mobileNumber = tmno.getText();
            String gdr = male.isSelected() ? "Male" : "Female";
            String birthdate = (String)year.getSelectedItem()
                  + "-" + (String)month.getSelectedItem()
                  + "-" + (String)date.getSelectedItem();
            String address = tadd.getText();

            UserEntity user = new UserEntity(username, pwd);
            MemberEntity member = new MemberEntity(0, firstName, lastName, 
                    birthdate, mobileNumber, gdr, address);

            UserRepository userRepo = new UserRepository();

            // Save registration info to DB
            userRepo.insertDataSignup(user, member);
        } else if (e.getSource() == login) {
            setVisible(false);
            
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        }
    }
}
