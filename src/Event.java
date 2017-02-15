import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Event extends JFrame{
    private JTextField item1 = new JTextField(10);
    private JTextField item2 = new JTextField("Enter the number", 20);
    private JTextField item3 = new JTextField("uneditable", 20);
    private JPasswordField passwordField = new JPasswordField("my password");

    //constructor
    public Event(){
        super("The title");
        setLayout(new FlowLayout()); //default
        add(item1);
        add(item2);
        item3.setEditable(false);
        add(item3);
        add(passwordField);

        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class thehandler implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String string = "";

            if(e.getSource() == item1)
              string = String.format("Field 1: %s", e.getActionCommand());
            else if(e.getSource() == item2)
                string = String.format("Field 2: %s", e.getActionCommand());
            else if(e.getSource() == item3)
                string = String.format("Field 3 : %s",e.getActionCommand());
            else if(e.getSource() == passwordField)
                string = String.format("The password field", e.getActionCommand());

            JOptionPane.showMessageDialog(null, string);
        }

    }

}
