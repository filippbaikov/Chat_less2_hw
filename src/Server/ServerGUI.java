package Server;


import Client.RegistrationGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerGUI extends JFrame {
    private final int WIDTH = 200;
    private final int HEIGHT = 200;
    private JButton joinToChat =new JButton("join to chat");



    public ServerGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        add(joinToChat);

        setVisible(true);

        joinToChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationGUI registrationGUI=new RegistrationGUI();
                registrationGUI.setVisible(true);

            }
        });
    }

}
