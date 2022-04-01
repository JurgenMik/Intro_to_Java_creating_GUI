import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    // giving scope outside method

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {

        // import window frame AND layout
        // GUI constructor -> creating objects of GUI within the main method

        frame = new JFrame();
        panel = new JPanel();

        // attaching event.Listener to the button object
        JButton button = new JButton("Click");
        button.addActionListener(this);

        label = new JLabel("Number of Clicks ");

        // creating a panel structure -> layout, border
        panel.setBorder(BorderFactory.createEmptyBorder(30, 70, 30, 70));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // Adding conditions & properties to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        // constructor
        // creating GUI obj
        new GUI();

    }
    // Listens to actionPerformed due to attached event attribute
    public void actionPerformed(ActionEvent e) {

        count++;
        label.setText("Number of Clicks: " + count);

    }



}
