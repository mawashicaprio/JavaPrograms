public class Bubble
{ 
static int i,k,temp;
  
static void bubsort(int x[])
 {
   int n=x.length;
   for(k=0;k<n-1;k++)
   {
     for(i=0;i<n-k-1;i++)
     {
      if(x[i]>x[i+1])
       {
        temp=x[i];
        x[i]=x[i+1];
        x[i+1]=temp;
       }
      
     }
   }
  
 }

static void show(int x[])
 {
  for(i=0;i<x.length;i++)
  System.out.println(x[i]);
 }

public static void main(String... s)
  {
    int a[]={1,7,5,3,4,5,2};
    bubsort(a);
    show(a);    
    
  }
}