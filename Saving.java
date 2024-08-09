public class Saving 
{
    private double savingbalance;
    private static double interest;
    Saving(double savingbalance)
    {
        this.savingbalance=savingbalance;
    }
    public static modifyInterestRate(double newrate)
    {
        interest=newrate;
    }
    public void claculatebalance()
    {
        double m_intrest=(savingbalance*(interest/12))/100;
        savingbalance=savingbalance+m_intrest;
    }
    public void displayblance()
    {
        system.out.println(" customer balance :-"+savingbalance);
    }
    public static void main(String[]args)
    {
        Saving saver1=new Saving(4000.00);
        Saving saver2=new Saving(10000.00);
        Saving.modifyInterestRate(4.00);
        System.out.print("sever1");
        sever1.displaybalance();
        System.out.print("sever2");
        saver2.displaybalance();
        Saving.modifyInterestRate(6.00);
        System.out.print("saver1 balance after modify");
        saver1.calculatebalance();
        saver1.displaybalance();
        System.out.print("saver2 balance after modify");
        saver2.displaybalance();
        saver2.calculatebalance();

    }
}
