class Custom{
 int age;
 void get(int age) throws AgeException
 {
  if(age<18)
   { throw new AgeException("Hey kid,Go to ur mamma");}
      
        else{
         this.age=age;
          }
  }
  public static void main(String... s)
   { 
     Custom c=new Custom();
     try 
     {
     c.get(10);
     }
    catch(AgeException e)
    { 
     System.out.println(e);
    }
  }
}

class AgeException extends Exception{
   AgeException(String s)
   {
    super(s);
   }
 }