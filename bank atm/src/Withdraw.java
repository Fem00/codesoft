import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdraw extends JFrame implements ActionListener {




   JButton back, withdraw;
   JTextField amountf;
   Bank bank = new Bank(1000);
    Withdraw(){
        setTitle("main page ");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addcomponents();
    }
    public void addcomponents(){

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATM.jpg"));
      Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
      ImageIcon i3 =new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0,0,800,800);
      add(image);

      JLabel text = new JLabel("Enter the amount you want to Withdraw");
      text.setForeground(Color.blue);
      text.setFont(new Font("system",Font.BOLD,16));
      text.setBounds(150,250,400,20);
      image.add(text);

        amountf =new JTextField();
        amountf.setFont(new Font("Raleway",Font.BOLD,20));
        amountf.setBounds(150,280,320,25);
        image.add(amountf);

       withdraw=new JButton("Withdraw");
        withdraw.setBounds(280,350,150,30);
        image.add(withdraw);
        withdraw.addActionListener(this);

        back=new JButton("Back");
        back.setBounds(280,380,150,30);
        image.add(back);
        back.addActionListener(this);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double withdrawamount = 0;
        if(e.getSource() == back){
            dispose();
            new Transaction().setVisible(true);
        }if (e.getSource() == withdraw){
            try {
                double WithdrawAmount = Double.parseDouble(amountf.getText());
                Bank.withdraw(WithdrawAmount);
                amountf.setText(null);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"Invalid input please enter a valid amount.");
            }

        }
        /*try {
            amount = Double.parseDouble(amountf.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid amount.");
            return;
        }

        if (e.getActionCommand().equals("Withdraw")) {
            bank.withdraw(amount);
            amountf.setText(null);
        } else if (e.getActionCommand().equals("Deposit")) {
            bank.deposit(amount);
        } else if (e.getActionCommand().equals("Check Balance")) {
            JOptionPane.showMessageDialog(this, "Balance: $" + bank.getBalance());
        }

         */

    }
}
