public class Largearr
{
 
 static int max(int x[])
 {
  
  int large=x[0];
  for(int i=0;i<x.length;i++)
   {
     if(large<x[i])
       large=x[i];
   }
  return large;
 }


 static int min(int x[])
 {
   int small=x[0];
  for(int i=0;i<x.length;i++)
   {
     if(small>x[i])
       small=x[i];
   }
  return small;
 }

public static void main(String... s)
  {
   int a[]={5,1,4,7,2,3};
   int large= max(a);
   int small= min(a);
   System.out.println("largest value in given array is " + large); 
   System.out.println("smallest value in given array is " + small);  
   }
}