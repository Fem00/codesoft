import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {
    JButton Deposit,Withdraw,Fast_cash,Balance_enquiry,exit;
    String pin_number;
    Transaction(){
       // this.pin_number=pinnumber;
        setTitle("main page ");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addcomponents();
    }
    public void addcomponents(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        setVisible(true);

        JLabel text=new JLabel("Please Select Your Transactions");
        text.setBounds(150,150,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        Deposit =new JButton("DEPOSIT");
        Deposit.setBounds(150,250,150,30);
        image.add(Deposit);
       Deposit.addActionListener((ActionListener) this);


        Withdraw =new JButton("WITHDRAW");
        Withdraw.setBounds(150,290,150,30);
        image.add(Withdraw);
        Withdraw.addActionListener(this);

        Fast_cash =new JButton("Fast_Cash");
        Fast_cash.setBounds(150,330,150,30);
        image.add(Fast_cash);
        Fast_cash.addActionListener(this);

        Balance_enquiry =new JButton("Balance_Enquiry");
        Balance_enquiry.setBounds(490,250,150,30);
        image.add(Balance_enquiry);
        Balance_enquiry.addActionListener(this);

        exit =new JButton("Exit");
        exit.setBounds(490,290,150,30);
        image.add(exit);
        exit.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource() == Deposit){
    new Deposit().setVisible(true);
    dispose();
}if (e.getSource() == Withdraw){
    new Withdraw().setVisible(true);
    dispose();
        }
if (e.getSource() == Balance_enquiry){
    new Balance_enquiry();
    dispose();
}if (e.getSource()== Fast_cash){
    JOptionPane.showMessageDialog(this," Take $100 Fast cash !!");
        }
else if (e.getSource() == exit)
JOptionPane.showMessageDialog(this,"Thank you for using our bank !!!");
dispose();
    }
}
