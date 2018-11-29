package armen.javaui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

   private JTextArea textArea = new JTextArea();
   private JTextField textField = new JTextField();
   private JButton button = new JButton("OK");

   public MyFrame(){
       JPanel controlPanel = new JPanel();
       JPanel messagePanel = new JPanel();
       JScrollPane textPanel = new JScrollPane();

       textField.setForeground(Color.RED);
       textField.setFont(new Font(Font.MONOSPACED,Font.ITALIC,36));
       messagePanel.setLayout(new GridLayout(1, 1));

       controlPanel.add(button);
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               okActionButtonPreformed();
           }
       });

       textPanel.getViewport().add(textArea);
       messagePanel.add(textField);

       textArea.setFont(new Font(Font.SERIF,Font.BOLD,20));


       add(controlPanel, BorderLayout.NORTH);
       add(textPanel, BorderLayout.CENTER);
       add(messagePanel, BorderLayout.SOUTH);

       setSize(700,500);
       setLocation(700,300);
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


   }

    private void okActionButtonPreformed() {
      textField.setText("You wrote "+textArea.getText());
      textArea.setText("");
    }
}
