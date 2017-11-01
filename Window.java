

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener {

    JFrame frame = null;
    JTextArea textArea;

    public static void main(String[] args) {

        Window gui = new Window();
        gui.los();
    }

    public void los() {
        frame = new JFrame("A really modern 1996 awt App ...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        // frame.getContentPane().setBackground(Color.GRAY);

        JButton blueButton = new JButton("Click here");
        blueButton.addActionListener(this);

        textArea = new JTextArea(5,5 );

        frame.getContentPane().add(BorderLayout.SOUTH, blueButton);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Perform some action when clicked

        textArea.append("Button wurde angeklikt\n");

        frame.validate();

    }

}
