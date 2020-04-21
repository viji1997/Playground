import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int firstd=0;
      int lastd=0;
      firstd=n/100;
      lastd=n%10;
      System.out.println(firstd+lastd);
	}
}