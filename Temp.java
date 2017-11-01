
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.acl.Group;
import javax.swing.*;


public final class Temp {

    public static void main(String... aArgs){
        Temp app = new Temp();
        app.buildAndDisplayGui();
    }

    private void buildAndDisplayGui(){
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(400,400);
        buildContent(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    private void buildContent(JFrame aFrame){
        JPanel panel = new JPanel();

        JLabel tempTextC = new JLabel("Temperature [C]");
        JLabel tempTextF = new JLabel("Temperature [F]");

        JTextField textFieldC = new JTextField();
        JTextField textFieldF = new JTextField();

        JButton buttonFromCtoF = new JButton("Calculate C to F");
        JButton buttonFromFtoC = new JButton("Calculate F to C");


        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(tempTextC)
                        .addComponent(tempTextF)
        );

        JTextArea textArea = new JTextArea();
        panel.add(textArea);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

//        JButton buttonOK = new JButton("OK");
////        buttonOK.addActionListener(new ShowDialog(aFrame));
//        panel.add(buttonOK);
        aFrame.getContentPane().add(panel);
    }

//    private static final class ShowDialog implements ActionListener {
//        /** Defining the dialog's owner JFrame is highly recommended. */
//        ShowDialog(JFrame aFrame){
//            fFrame = aFrame;
//        }
//        @Override public void actionPerformed(ActionEvent aEvent) {
//            JOptionPane.showMessageDialog(fFrame, "This is a dialog");
//        }
//        private JFrame fFrame;
//    }
}
