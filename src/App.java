import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;




public class App {
    public static void main(String[] args) throws Exception {
        // create a list of top 5 things
        String[] top5 = {
            "1. Coding",
            "2. Music",
            "3. Movies",
            "4. Sports",
            "5. Travel"
        };
        // variable to keep track of current index in the list
        int currentIndex = 0;

         // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("My Top 5 List");
        frame.setSize(500, 500);
        frame.setLayout(null);

        // create a Button and a Label
        JButton nextButton = new JButton("Next");
        JLabel outputLabel = new JLabel();

        // place and size for components
        // setBounds(x position, y position, width, height)
        nextButton.setBounds(100, 200, 100, 50);
        outputLabel.setBounds(100,100,200,50);
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 32));
        outputLabel.setForeground(Color.BLUE);

        // the output label will display the first item in the list initially
        outputLabel.setText(top5[currentIndex]);

        // add components to JFrame f
        frame.add(outputLabel);
        frame.add(nextButton);

        // add event listener for button click
        nextButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int index = currentIndex;
            index = (currentIndex == top5.length - 1) ? 0 : (index + 1);
            outputLabel.setText(top5[index]);
        }    });

        // make the frame visible
        frame.setVisible(true);
    }
}
