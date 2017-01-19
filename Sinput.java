import java.io.*;
import java.util.*;

class Sinput
{
 public static void main(String... s1) throws IOException
 {
 //SequenceInputStream sin =new SequenceInputStream(new FileInputStream                            ("chacha.txt"),new FileInputStream("chachi.txt"));
 
 SequenceInputStream sin=new SequenceInputStream(new MyEnum());
 DataInputStream din=new DataInputStream(sin);

 String s="";

 while(s!=null)
  {
  s=din.readLine();
  if(s!=null)
  System.out.println(s);
  }
  din.close();
  
  }
 
}


class MyEnum implements Enumeration
 {
  InputStream in[];
  int i=0;
  
  MyEnum()
  {
   try
     {
      in=new InputStream[]{
           new FileInputStream("tanishk.txt"),
           new FileInputStream("tanishk4.txt"),
           new FileInputStream("lalu.txt")};
      }catch(Exception e){}

   }
  public boolean hasMoreElements()
  {
   if(i<in.length)
    return true;
   else return false;
   }
 
  public Object nextElement()
  {
   return in[i++];
   } 
 }