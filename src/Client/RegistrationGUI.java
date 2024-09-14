package Client;

import Server.ServerHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegistrationGUI extends JFrame {
    private final int WIDTH = 350;
    private final int HEIGHT = 100;
    JTextField authorizationField = new JTextField();
    JTextField login = new JTextField("login");
    JPanel panel = new JPanel(new GridLayout(2, 1));

    public RegistrationGUI() {
        setTitle("registration");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        login.setEditable(false);
        textFieldHandler(authorizationField);
        panel.add(login);
        panel.add(authorizationField);
        add(panel, BorderLayout.CENTER);


    }

    private void textFieldHandler(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textField.getText();
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                    textField.setEditable(false);
                    textField.setEnabled(false);
                    ServerHandling serverHandling=new ServerHandling();
                    serverHandling.addClient();
                    setVisible(false);

                }
            }
        });
    }
}
