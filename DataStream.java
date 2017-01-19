import java.io.*;

class DataStream
{
  public static void main(String... s1) throws IOException
   { 
     DataInputStream din=new DataInputStream(System.in);
     FileOutputStream fout=new FileOutputStream("tanishk4.txt");
      
     PrintStream dout=new PrintStream(fout);
     String s="";
     
     while(!s.equals("stop"))
     {
      s=din.readLine();
      System.out.println(s);
      
//      dout.writeUTF(s);
      dout.println(s);
     
      dout.flush();
     }

    din.close();
    dout.close();
   } 

}