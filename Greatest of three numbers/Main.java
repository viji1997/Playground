import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int Greater;
      if(n1 > n2)
      {
        Greater = n1;
      }
      else
      {
        Greater = n2;
      }
      if(Greater > n3)
      {
        Greater = Greater;
      }
      else
      {
        Greater = n3;
      }
      System.out.println(Greater);
    }
}