import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int [size];
    for(int i=0; i<size; i++){
    arr[i] = in.nextInt();
    }
    int max=0;
    int index=0;
    if(arr[0]>arr[1]){
    max=arr[0];
      index=0;
    }else{
    max=arr[1];
      index=1;
    }
    for(int i=2;i<size;i++){
    if(max<arr[i])
    {
    max=arr[i];
      index=i;
    }
    }
    System.out.println(index);
  }
}