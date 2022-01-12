import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class  menu extends JFrame{
    static int rows = 1;
    static int columns;
    static String name;

    public menu() {
        new diff();
        if (rows >= 8) {
            new name();
        }
    }
    public class name extends Frame {
        public name() {
            
            JFrame fn = new JFrame();
            JLabel l = new JLabel("Enter your name:");
            JLabel l1 = new JLabel("Please enter a valid name");
            JButton b = new JButton("Ok");
            JTextArea tf = new JTextArea();
            fn.setLayout(null);
            l.setBounds(20, 10, 200, 40);
            l.setFont(new Font("Verdana", Font.BOLD, 15));
            l1.setBounds(20, 65, 200, 20);
            l1.setFont(new Font("Verdana", Font.PLAIN, 11));
            tf.setBounds(20, 45, 150, 20);
            b.setBounds(125, 90, 50, 25);
            b.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                            String test = tf.getText(); 
                            
                            if (test.length() > 0) {
                                name = test;
                                new grid();
                                fn.dispose();
                            } else {
                                fn.add(l1);
                                fn.pack();
                                fn.setSize(200,150);
                            }
                        }  
                    });  
            fn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fn.setLocationRelativeTo(null);
            fn.add(tf);
            fn.add(l);
            fn.add(b);
            fn.setSize(200,150);
            fn.setVisible(true);
        }
    }
    public class diff {
        public diff() {

            int dif = 1;
            JFrame fd = new JFrame();
            fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Object[] options = {"Easy", "Medium", "Hard"};
            dif = JOptionPane.showOptionDialog(null, "Select a difficulty", "Difficulty",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options, 
                options[1] );

            if (dif == 0) {
             rows = 8;
            }
            else if (dif == 1) {
                rows = 12;
            }
            else if (dif == 2) {
                rows = 14;
            }
            columns = (rows + 4);
    
        }
    }


public static void main(String[] args) {
        new menu();
    }
}



    