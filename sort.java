import java.util.Scanner;
class Sort
{
  public static int cal(int [] arr)
  {
   for(int j=0;j<x.length-1;j++)
    {
       for(int i=0;i<x.length-1;i++)
      {
         if(x[i]>x[i+1])
         {
             int temp=x[i];
             x[i]=x[i+1];
             x[i+1]=temp;

         }
      }
    }
   return arr;
  }
  public static void main(String []str)
  {
    int [] x={4,9,1,5,3,6};
    for(int item:x)
    {
     System.out.print(item+" ");
    }
    int catch=cal(x);
    for(int item:catch)
    {
     System.out.print(item+" ");
    }
    System.out.println();
    
  }
}