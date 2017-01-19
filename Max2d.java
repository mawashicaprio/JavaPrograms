
public class Max2d
{

static int max1(int x[][])
 {
   int large=x[0][0];
   
   for(int i=0;i<x.length;i++)
    {
     for(int j=0;j<x[i].length;j++)
     {
      if(large<x[i][j])
       large=x[i][j];
     }
    }
   return large;
 }

static int min1(int x[][])
 {
   int small=x[0][0];
   
   for(int i=0;i<x.length;i++)
    {
     for(int j=0;j<x[i].length;j++)
     {
      if(small>x[i][j])
       small=x[i][j];
     }
    }
   return small;
 }

public static void main(String... s)
 {
  int x[][]={{1,5,3},{6,4,2},{1,7,8}};
  
  int large=max1(x);
  int small=min1(x); 
  System.out.println(large); 
  System.out.println(small);  
 }
}