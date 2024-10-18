/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.signup;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo Ideapad
 */
public class SignUp extends JFrame implements ActionListener{
      JTextField nameField, usernameField, contactField;
    JPasswordField passwordField, retypePasswordField;
    JButton signUpButton;
    JLabel messageLabel;

    public SignUp() {
        setTitle("Sign Up");
        setSize(600, 600);
        setLayout(null); 

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 30, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(130, 30, 150, 25);
        add(nameField);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20, 60, 100, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(130, 60, 150, 25);
        add(usernameField);
        
        JLabel contactLabel = new JLabel("Contact");
        contactLabel.setBounds(20, 90, 100, 25);
        add(contactLabel);
        
        contactField = new JTextField();
        contactField.setBounds(130, 90, 150, 25);
        add(contactField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 120, 100, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 120, 150, 25);
        add(passwordField);

        JLabel retypeLabel = new JLabel("Retype Password:");
        retypeLabel.setBounds(20, 150, 120, 25);
        add(retypeLabel);

        retypePasswordField = new JPasswordField();
        retypePasswordField.setBounds(130, 150, 150, 25);
        add(retypePasswordField);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(150, 230, 100, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);

        messageLabel = new JLabel();
        messageLabel.setBounds(140, 260, 300, 25);
        add(messageLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String password = new String(passwordField.getPassword());
        String retypePassword = new String(retypePasswordField.getPassword());

        if (!password.equals(retypePassword)) {
            messageLabel.setText("Passwords do not match!");
            
        } else {
            messageLabel.setText(" Sign up successful!");
        }
    }
    
}
