import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame implements ActionListener {

    Double Amount;

    JButton back, DepositB;
    JTextField AmountD;
    Bank bank = new Bank(0);

    Deposit() {
        setTitle("main page ");
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

        JLabel text = new JLabel("Enter the amount you want to Deposit");
        text.setForeground(Color.GREEN);
        text.setFont(new Font("system", Font.BOLD, 16));
        text.setBounds(150, 250, 400, 20);
        image.add(text);

        AmountD = new JTextField();
        AmountD.setFont(new Font("Raleway", Font.BOLD, 20));
        AmountD.setBounds(150, 280, 320, 25);
        image.add(AmountD);
        AmountD.addActionListener(this);

        DepositB = new JButton("Deposit");
        DepositB.setBounds(280, 350, 150, 30);
        image.add(DepositB);
        DepositB.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(280, 380, 150, 30);
        image.add(back);
        back.addActionListener(this);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            dispose();
            new Transaction().setVisible(true);
        }
        if (e.getSource() == DepositB){
            try {
                double depositAmount = Double.parseDouble(AmountD.getText());
                Bank.deposit(depositAmount);
                AmountD.setText(null);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"Invalid amount");
            }
        }
    }

}





