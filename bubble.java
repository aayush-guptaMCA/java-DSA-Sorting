// Implementation of bubble sort 
class bubblesort
{
  public static void main(String str[])
  {
      int arr[]={4,5,1,7,2,9,11,0,45,23,12};
      int size=arr.length;
      for(int item:arr)
       {
          System.out.print(item+"  ");
       }
     for(int i=0;i<size-1;i++) // for number of pass
      {
         for(int j=0;j<size-1-i;j++)// for inner swapping
         {
             if(arr[j]>arr[j+1])
              {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
              }
         }
      }
         
          printarray(arr,size);
    
  }
    public static void printarray(int arr[],int size)
     {
        
        System.out.println("Sorting is complete");
          for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
     }
}