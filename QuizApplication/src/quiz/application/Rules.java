package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome to Zquiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Cambria", Font.BOLD, 28)); // Keeping Cambria font
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Cambria", Font.PLAIN, 16)); // Keeping Cambria font
        rules.setText(
            "<html>"+ 
                "1. Coding skills are valued here, but creativity counts too." + "<br><br>" +
                "2. Collaboration is key; consider your fellow programmers." + "<br><br>" +
                "3. Every question is an opportunity for growth." + "<br><br>" +
                "4. Tears are okay; debugging can be emotional." + "<br><br>" +
                "5. Ask wisely, answer kindly." + "<br><br>" +
                "6. Stay focused, success doesn't always come first." + "<br><br>" +
                "7. Embrace challenges; they're the path to improvement." + "<br><br>" +
                "8. Aim to surpass even the greatest of minds. Good luck!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
