import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton  EXIT, Enter;
    JPasswordField PASSWORD;
   private final int correct_pin = 1234;

    Login() {
        setTitle("login GUI ");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addcomponents();
    }

    public void addcomponents() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATM.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 800);
        add(image);

        JLabel text = new JLabel("ENTER YOUR PIN :");
        text.setForeground(Color.red);
        text.setFont(new Font("sytem", Font.BOLD, 16));
        text.setBounds(150, 250, 400, 20);
        image.add(text);

         PASSWORD = new JPasswordField();
        PASSWORD.setFont(new Font("Raleway", Font.BOLD, 20));
        PASSWORD.setBounds(150, 280, 320, 25);
        image.add(PASSWORD);

        Enter = new JButton("Enter");
       Enter.setBounds(280, 350, 150, 30);
        image.add(Enter );
        Enter.addActionListener(this);

        EXIT = new JButton("Exit");
        EXIT.setBounds(280, 380, 150, 30);
        image.add(EXIT);
        EXIT.addActionListener(this);


        setVisible(true);

    }
    private boolean ValidatePIN(String pin){
        if (pin.length() != 4){

        }
return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==  EXIT) {
            dispose();
        }if (e.getSource() == Enter){
            try {
                char [] enteredchar =PASSWORD.getPassword();
                String enteredPIN = new String(enteredchar);
                int enterdintPIN = Integer.parseInt(enteredPIN);
                if (enterdintPIN == correct_pin){
                    JOptionPane.showMessageDialog(this,"WELCOME !");
                    dispose();
                    new Transaction().setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(this,"INCORRECT PIN.PLEASE TRY AGAIN !!");
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"INVALID INPUT,ENTER A NUMERIC PIN.");
            }


          /*  JOptionPane.showMessageDialog(this," Login Success ! Welcome  ");
            dispose();
            new Transaction().setVisible(true);

           */
        }
    }
}
