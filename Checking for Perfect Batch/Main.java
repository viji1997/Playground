import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
 int size = in.nextInt();
    int arr[]=new int[size];
    for(int i=0; i<size; i++){
    arr[i] = in.nextInt();
    }
    batch(arr,size);
 }
  public static void batch(int arr[],int size){
  int sum=arr[0]+arr[1]+arr[2];
    boolean is=true;
    for(int i=3;i<size;i+=3){
    int current=arr[i]+arr[i+1]+arr[i+2];
      if(sum!=current){
       is=false;
      }else{
      is=true;
      }
    }
    if(is==true){
    System.out.println("Perfect Batch");
    }else{
    System.out.println("Not a Perfect Batch");
    }
  }
 
}