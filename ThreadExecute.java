class ThreadA extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread A:"+i);
            try
            {
                    Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread B:"+i);
            try
            {
                    Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}


public class ThreadExecute 
{
    public static void main(String[] args)
    {
        Thread a=new ThreadA();
        Thread b=new ThreadB();
        a.start();
        b.start();

    }
    
}
