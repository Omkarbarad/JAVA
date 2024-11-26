import javax.swing.*;
class Swing{
    Swing()
    {
        JFrame f=new JFrame();
        JLabel firstname=new JLabel("First name");
        firstname.setBounds(20,50,80,20);
        JLabel lastname=new JLabel("Last Name");
        lastname.setBounds(20,80,80,20);
        JLabel  dob=new JLabel("Date Of Birth");
        dob.setBounds(20,110,80,20);


        JTextField firstnameTf=new JTextField("Omkar");
        firstnameTf.setBounds(120,50,160,20);

        JTextField lastnameTf=new JTextField("Barad");
        lastnameTf.setBounds(120,80,160,20);

        JTextField dobTf=new JTextField("20-09-2003");
        dobTf.setBounds(120,110,160,20);

        JButton submit=new JButton("submit");
        submit.setBounds(20,160,100,30);

        JButton reset=new JButton("Reset");
        reset.setBounds(120,160,100,30);

        f.add(firstname);
        f.add(firstnameTf);
        f.add(lastname);
        f.add(lastnameTf);
        f.add(dob);
        f.add(dobTf);
        f.add(submit);
        f.add(reset);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
    
   


}


public class SwingOperation {
    public static void main(String[] args)
    {
        Swing d=new Swing();
    }
    
}
