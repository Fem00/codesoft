import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balance_enquiry extends JFrame implements ActionListener {

    JButton back;


    //public int Balance = 1000000;
    Balance_enquiry(){
        setTitle("main page ");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addcomponents();
    }

    public void addcomponents(){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);

        JLabel text=new JLabel("Your current  Balance is $ " +Bank.getBalance());
        text.setBounds(170,300,400,30);
        text.setForeground(Color.gray);
        image.add(text);
        setVisible(true);

        back=new JButton("Back");
        back.setBounds(200,360,100,30);
        image.add(back);
        back.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back){
            dispose();
            new Transaction().setVisible(true);
        }

    }
}
