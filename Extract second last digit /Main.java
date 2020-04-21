import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first=0;
      first=n/10;
      int ans=0;
      ans=first%10;
      System.out.println(ans);
	}
}