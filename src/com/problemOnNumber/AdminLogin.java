package com.problemOnNumber;


import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

class AdminLogin extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
    private Container c;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private Timer timer;

    public AdminLogin() {
        setTitle("Admin Login");
        setBounds(400, 200, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 30, 80, 20);
        c.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 30, 150, 20);
        c.add(usernameField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 60, 80, 20);
        c.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 60, 150, 20);
        c.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 90, 80, 30);
        loginButton.addActionListener(this);
        c.add(loginButton);

        setVisible(true);

        // Set up a timer for 30 seconds
        timer = new Timer(30000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AdminLogin.this, "Session timed out. Exiting.");
                System.exit(0);
            }
        });
        timer.setRepeats(false); // Set to non-repeating
        timer.start();

        // Add mouse listeners to reset the timer on user activity
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("root") && password.equals("123")) {
                dispose(); // Close the login window
                new vts(); // Open the main voting system window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Implementing MouseListener and MouseMotionListener methods
    public void mouseClicked(MouseEvent e) {
        resetTimer();
    }

    public void mousePressed(MouseEvent e) {
        resetTimer();
    }

    public void mouseReleased(MouseEvent e) {
        resetTimer();
    }

    public void mouseEntered(MouseEvent e) {
        resetTimer();
    }

    public void mouseExited(MouseEvent e) {
        resetTimer();
    }

    public void mouseMoved(MouseEvent e) {
        resetTimer();
    }

    public void mouseDragged(MouseEvent e) {
        resetTimer();
    }

    private void resetTimer() {
        // Reset the timer when there is user activity
        // Stop the existing timer
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        // Start a new timer
        timer = new Timer(30000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AdminLogin.this, "Session timed out. Exiting.");
                System.exit(0);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}

class vts extends JFrame implements ActionListener {
    private Container c;
    private JOptionPane parent;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel canname;
    private JRadioButton candidate1;
    private JRadioButton candidate2;
    private JRadioButton candidate3;
    private JRadioButton candidate4;
    private JRadioButton candidate5;
    private ButtonGroup cangp;

    private JLabel count;
    private JLabel count1;
    private JLabel count2;
    private JLabel count3;
    private JLabel count4;
    private JLabel count5;

    private JTextField tcount1;
    private JTextField tcount2;
    private JTextField tcount3;
    private JTextField tcount4;
    private JTextField tcount5;

    private JButton sub;
    private JButton reset;
    private JButton print;
    private JTextArea tout;

    public vts() {
        setTitle("Voting System");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Voting System");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Voter ID");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        canname = new JLabel("Candidate");
        canname.setFont(new Font("Arial", Font.PLAIN, 20));
        canname.setSize(100, 20);
        canname.setLocation(100, 200);
        c.add(canname);

        candidate1 = new JRadioButton("Candidate 1");
        candidate1.setFont(new Font("Arial", Font.PLAIN, 15));
        candidate1.setSelected(true);
        candidate1.setSize(120, 20);
        candidate1.setLocation(200, 200);
        c.add(candidate1);

        candidate2 = new JRadioButton("Candidate 2");
        candidate2.setFont(new Font("Arial", Font.PLAIN, 15));
        candidate2.setSelected(false);
        candidate2.setSize(120, 20);
        candidate2.setLocation(200, 225);
        c.add(candidate2);

        candidate3 = new JRadioButton("Candidate 3");
        candidate3.setFont(new Font("Arial", Font.PLAIN, 15));
        candidate3.setSelected(false);
        candidate3.setSize(120, 20);
        candidate3.setLocation(200, 250);
        c.add(candidate3);

        candidate4 = new JRadioButton("Candidate 4");
        candidate4.setFont(new Font("Arial", Font.PLAIN, 15));
        candidate4.setSelected(false);
        candidate4.setSize(120, 20);
        candidate4.setLocation(200, 275);
        c.add(candidate4);

        candidate5 = new JRadioButton("Candidate 5");
        candidate5.setFont(new Font("Arial", Font.PLAIN, 15));
        candidate5.setSelected(false);
        candidate5.setSize(120, 20);
        candidate5.setLocation(200, 300);
        c.add(candidate5);


        cangp = new ButtonGroup();
        cangp.add(candidate1);
        cangp.add(candidate2);
        cangp.add(candidate3);
        cangp.add(candidate4);
        cangp.add(candidate5);

        count = new JLabel("Vote Count");
        count.setFont(new Font("Arial", Font.PLAIN, 20));
        count.setSize(100, 20);
        count.setLocation(100, 340);
        c.add(count);

        count1 = new JLabel("Candidate 1");
        count1.setFont(new Font("Arial", Font.PLAIN, 16));
        count1.setSize(100, 20);
        count1.setLocation(365, 340);
        c.add(count1);
        tcount1 = new JTextField("0");
        tcount1.setFont(new Font("Arial", Font.PLAIN, 15));
        tcount1.setSize(150, 20);
        tcount1.setLocation(210, 340);
        c.add(tcount1);

        count2 = new JLabel("Candidate 2");
        count2.setFont(new Font("Arial", Font.PLAIN, 16));
        count2.setSize(100, 20);
        count2.setLocation(365, 360);
        c.add(count2);
        tcount2 = new JTextField("0");
        tcount2.setFont(new Font("Arial", Font.PLAIN, 15));
        tcount2.setSize(150, 20);
        tcount2.setLocation(210, 360);
        c.add(tcount2);

        count3 = new JLabel("Candidate 3");
        count3.setFont(new Font("Arial", Font.PLAIN, 16));
        count3.setSize(100, 20);
        count3.setLocation(365, 380);
        c.add(count3);
        tcount3 = new JTextField("0");
        tcount3.setFont(new Font("Arial", Font.PLAIN, 15));
        tcount3.setSize(150, 20);
        tcount3.setLocation(210, 380);
        c.add(tcount3);

        count4 = new JLabel("Candidate 4");
        count4.setFont(new Font("Arial", Font.PLAIN, 16));
        count4.setSize(100, 20);
        count4.setLocation(365, 400);
        c.add(count4);
        tcount4 = new JTextField("0");
        tcount4.setFont(new Font("Arial", Font.PLAIN, 15));
        tcount4.setSize(150, 20);
        tcount4.setLocation(210, 400);
        c.add(tcount4);

        count5 = new JLabel("Candidate 5");
        count5.setFont(new Font("Arial", Font.PLAIN, 16));
        count5.setSize(100, 20);
        count5.setLocation(365, 420);
        c.add(count5);
        tcount5 = new JTextField("0");
        tcount5.setFont(new Font("Arial", Font.PLAIN, 15));
        tcount5.setSize(150, 20);
        tcount5.setLocation(210, 420);
        c.add(tcount5);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(90, 20);
        sub.setLocation(100, 500);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(90, 20);
        reset.setLocation(210, 500);
        reset.addActionListener(this);
        c.add(reset);

        print = new JButton("Print");
        print.setFont(new Font("Arial", Font.PLAIN, 15));
        print.setSize(90, 20);
        print.setLocation(320, 500);
        print.addActionListener(this);
        c.add(print);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (tmno.getText().length() == 5) {
                Integer c1 = Integer.parseInt(tcount1.getText());
                Integer c2 = Integer.parseInt(tcount2.getText());
                Integer c3 = Integer.parseInt(tcount3.getText());
                Integer c4 = Integer.parseInt(tcount4.getText());
                Integer c5 = Integer.parseInt(tcount5.getText());

                String data
                        = "****************" +
                        "\n" + "                      Voting System" + "\n" +
                        "****************" + "\n";
                String data1
                        = "Name :                "
                        + tname.getText() + "\n"
                        + "Voter ID :            "
                        + tmno.getText() + "\n";

                if (candidate1.isSelected()) {
                    tcount1.setText(String.valueOf(c1 + 1));
                } else if (candidate2.isSelected()) {
                    tcount2.setText(String.valueOf(c2 + 1));
                } else if (candidate3.isSelected()) {
                    tcount3.setText(String.valueOf(c3 + 1));
                } else if (candidate4.isSelected()) {
                    tcount4.setText(String.valueOf(c4 + 1));
                } else if (candidate5.isSelected()) {
                    tcount5.setText(String.valueOf(c5 + 1));
                }

                String data8 = "\n" + "****************" + "\n" +
                        "                         Thank You For Voting...";
                tout.setText(data + data1 + data8);
                tout.setEditable(false);
                JOptionPane.showMessageDialog(parent, "Submitted!!!");
            } else {
                JOptionPane.showMessageDialog(parent, "Voter ID should be of 5 digits only!!!!");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tmno.setText(def);
            tout.setText(def);
        } else if (e.getSource() == print) {
            try {
                tout.print();
            } catch (PrinterException ex) {
                Logger.getLogger(vts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        new AdminLogin(); // Start with the admin login window
    }
}