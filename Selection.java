public class Selection
{

  static void select(int a[])
  {
    int n=a.length;
    for(int i=0;i<n-1;i++)
    {

      int min=i;

      for(int j=i+1;j<n;j++)
      {
       if(a[j]<a[min])
       min=j;
      }

      int temp=a[min];
      a[min]=a[i];
      a[i]=temp;
    }
  }

  static void show(int a[])
  {
   for(int i=0;i<a.length;i++)
   System.out.println(a[i]);
   
  }	
  
  public static void main(String... s)
  {
    int a[]={1,5,4,3,9,7,3};
   
    select(a);
    show(a);
  }

}
