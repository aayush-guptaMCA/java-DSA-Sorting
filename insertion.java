//implementation of insertion sort
class insertionsort
{
    public static void main(String [] arg)
   {
       int arr[]={45,12,78,1,6,2,8,3,7,4,0,23};
       int size=arr.length;
       // collection loop for printing the array
        for(int item:arr)
        {
           System.out.print(item+" ");
  
        }
       
        for(int i=1;i<size;i++)
         {
              int temp=arr[i];
              int j=i-1;
            while(j>=0 && arr[j]>temp)
             {
                arr[j+1]=arr[j];
                j=j-1;
             }
            arr[j+1]=temp;
         }
      printarray(arr);
   }
      static void printarray(int arr[])
       {
          System.out.println(" Sorting is complete");
          for(int item:arr)
           {
              System.out.print(item +" ");
           }
       }
}