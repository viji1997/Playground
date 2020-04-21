import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
      int f1 = n/100;
    int f2 =((n/10)%10);
    int f3 = n%10;
    int reverse = (f3*100)+(f2*10)+(f1);
    System.out.println(reverse);
  }
}