import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int base=in.nextInt();
      int exponent=in.nextInt();
      int ans=1;
      int i=1;
      while(i<=exponent){
      ans=ans*base;
        i++;
      }
      System.out.println(ans);
    }
}