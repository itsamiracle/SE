import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button3 implements ActionListener {

    JFrame frame = null;

    public static void main(String[] args) {

        Button3 gui = new Button3();
        gui.los();
    }

    public void los() {
        frame = new JFrame("Fenster");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.getContentPane().setBackground(Color.WHITE);

        JButton greenButton = new JButton("Green");
        greenButton.addActionListener(this);

        JButton blueButton = new JButton("Blue");
        blueButton.addActionListener(this);

        System.out.println(blueButton.getText());

        frame.getContentPane().add(BorderLayout.NORTH, greenButton);
        frame.getContentPane().add(BorderLayout.SOUTH, blueButton);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Perform some action when clicked
        JButton currentButton = (JButton) e.getSource();
        
        if (currentButton.getText() == "Green"){
            frame.getContentPane().setBackground(Color.green);
            System.out.println("Green Button clicked !");
        }
        else if (currentButton.getText() == "Blue") {
            frame.getContentPane().setBackground(Color.blue);
            System.out.println("Blue Button clicked !");
        }
        frame.validate();
    }
}
