class Throw_s{

int age;
void getAge(int age) throws ArithmeticException
{
  if(age<18)
   {
    try
      { throw new ArithmeticException("invalid age kid :p");
       }
    catch(ArithmeticException e)
     {
       System.out.println(e);
     }
  }
else{this.age=age;
    }
}
public static void main(String... s)
{
 Throw_s t=new Throw_s();
 t.getAge(10);
}
}