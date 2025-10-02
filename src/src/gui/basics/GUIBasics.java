package gui.basics;

import javax.swing.*;
import java.awt.*;

public class GUIBasics {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("GUI Basics");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Container and layout
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        // Components
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);

        // Add components to container
        container.add(label);
        container.add(textField);
        container.add(button);
        container.add(textArea);

        frame.setVisible(true);
    }
}
