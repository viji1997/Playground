import java.util.Scanner;
class Main{
  public static int prime(int n1,int n2)
    
  {
    int pro=1;
    for(int i=1; i<=n2; i++)
    {
      pro=pro*n1;
    }
    return pro;
      
  }
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
        int m=in.nextInt();
      int b=in.nextInt();
      int ans=prime(m,b);
      System.out.println(ans);
      
	    // Type your code here
	}
}
