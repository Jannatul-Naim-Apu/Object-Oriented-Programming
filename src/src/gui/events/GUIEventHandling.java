package gui.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIEventHandling {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("GUI Event Handling");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Container
        Container c = frame.getContentPane();
        c.setLayout(new FlowLayout());

        // Components
        JTextField textField = new JTextField(15);
        JButton btnSubmit = new JButton("Submit");
        JButton btnClear = new JButton("Clear");
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);

        c.add(textField);
        c.add(btnSubmit);
        c.add(btnClear);
        c.add(textArea);

        // Event handling: Submit
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnSubmit) {
                    textArea.append("Submitted: " + textField.getText() + "\n");
                }
            }
        });

        // Event handling: Clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == btnClear) {
                    textField.setText("");
                    textArea.setText("");
                }
            }
        });

        frame.setVisible(true);
    }
}
