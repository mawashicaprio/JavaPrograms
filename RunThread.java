class Thread1 extends Thread{
  Thread1(String s)
  {
   super(s);
 
   }
public void run()
{
 for(int i=1;i<5;i++)
  {
    System.out.println(getName());
  }
}
}

class Thread2 extends Thread
{
 
Thread2(String s)
  {
    super(s);
  }
     public void run()
    {
      for(int i=1;i<10;i++)
       { 
         System.out.println(getName());
       }
    }
  }


class Thread3 extends Thread
{
    Thread3(String s)
      {
        super(s);
       }
      public void run() 
      {
        for(int i=1;i<15;i++)
        {
          System.out.println(getName());
        }
      }
}

class RunThread
{
public static void main(String... s)
 {
  Thread t1=new Thread1("Thread1");
   Thread t2=new Thread2("Thread2");
   Thread t3=new Thread3("Thread3");


t1.start();
t2.start();
t3.start();

   for(int i=1;i<=20;i++)
   {  System.out.println(Thread.currentThread().getName());
   }
}
}