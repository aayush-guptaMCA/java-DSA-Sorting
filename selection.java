// Implementation of selection sort
class selection
{

  public static void main(String str[])
  {
    int [] arr={9,45,1,23,12,56,2,4,3,0,8,7,9};
    for(int item:arr)
    {
       System.out.print(item+" ");
    }
     System.out.println();
     System.out.println("------Sorting complete---");
    for(int i=0;i<arr.length-1;i++)
    {
       int min=i;
      for(int j=i+1;j<arr.length;j++)
        {
           if(arr[j]<arr[min])
           {
              min=j;
           }
           
           

        }
        
              int temp=arr[i];
              arr[i]=arr[min];
              arr[min]=temp;
           
      
    }
   for(int item:arr)
   {
        System.out.print(item+" ");
   }
  }

}