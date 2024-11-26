import java.awt.*;
class Awt extends Frame{
    Awt()
    {
        Label firstname=new Label("First name");
        firstname.setBounds(20,50,80,20);
        Label lastname=new Label("Last Name");
        lastname.setBounds(20,80,80,20);
        Label  dob=new Label("Date Of Birth");
        dob.setBounds(20,110,80,20);


        TextField firstnameTf=new TextField("Omkar");
        firstnameTf.setBounds(120,50,160,20);

        TextField lastnameTf=new TextField("Barad");
        lastnameTf.setBounds(120,80,160,20);

        TextField dobTf=new TextField("20-09-2003");
        dobTf.setBounds(120,110,160,20);

        Button submit=new Button("submit");
        submit.setBounds(20,160,100,30);

        Button reset=new Button("Reset");
        reset.setBounds(120,160,100,30);

        add(firstname);
        add(firstnameTf);
        add(lastname);
        add(lastnameTf);
        add(dob);
        add(dobTf);
        add(submit);
        add(reset);

        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
    
   


}


public class AwtOperation {
    public static void main(String[] args)
    {
        Awt d=new Awt();
    }
    
}

