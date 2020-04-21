import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in  = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int id=0; id<size; id++)
      {
        arr[id]=in.nextInt();
      }
      int ele1 = in.nextInt();
      int ele2 = in.nextInt();
      int one = 0;
      int val1=0;
      for(int id=0; id<size; id++)
      {
        if(ele1==arr[id])
        {
          one = 1;
          val1=id;
          break;
    
        }
           else{
       one = 0;
      }
    }
      if(one==1)
      {
        System.out.println(val1);
      }
      else
      {
        System.out.println("-1");
      }
      
      
      
      int two =0;
      int val2=0;
       for(int id=0; id<size; id++)
      {
        if(ele2==arr[id])
        {
          two = 1;
          val2=id;
          break;
    
        }
           else{
       one = 0;
      }
    }
      if(two==1)
      {
        System.out.println(val2);
      }
      else
      {
        System.out.println("-1");
      }
    }
}