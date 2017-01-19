interface my{
  void display();
   }

interface my1 extends my{
  void show();
  }

class Me implements my1{

 public void show()
  {
   System.out.println("Show");
  }
 public void display() 
 {
  System.out.println("Display");
 }

public static void main(String... s)
 {
   my1 m=new Me();
   m.show();
   m.display();
  
 }
 }