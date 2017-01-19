import java.io.*;
class DataRead
{
 public static void main(String... s) throws IOException
  {
   DataInputStream din=new DataInputStream(new FileInputStream("Tanishk4.txt"));
   String s1="";
   while(s1!=null)
   {
     s1=din.readLine();
     if(s1!=null)
     System.out.println(s1);
        
   }
    din.close();
   
   }
}