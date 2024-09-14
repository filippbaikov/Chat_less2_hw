package Client;

import Server.ServerHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ClientGUI extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;

    private JTextField messageField = new JTextField();
    private JTextArea textArea = new JTextArea();
    JButton exit = new JButton("exit");
    JPanel panel = new JPanel(new GridLayout(2, 1));
    ServerHandling serverHandling = new ServerHandling();


    public ClientGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        textArea.setEditable(false);
        textAreaHandler(textArea);
        add(textArea);
        panel.add(messageField);
        panel.add(exit, BorderLayout.SOUTH);
        add(panel, BorderLayout.SOUTH);


        messageFieldHandler(messageField);


    }


    public void messageFieldHandler(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                String text=messageField.getText();
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                    serverHandling.appendTextFromClient(text);
                    textArea.append(serverHandling.serverAnswer());
                    textArea.setVisible(true);
                }
            }
        });
    }
    public void textAreaHandler(JTextArea textArea){
        textArea.append(serverHandling.readFromFile());

    }

}
