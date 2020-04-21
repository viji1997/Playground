

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println(greater(n1,n2,n3));


    }
    public static int greater(int a, int b,int c)
    {
        int first_greater = 0;
        if(a>b)
        {
            first_greater=a;
        }
        else
        {
            first_greater=b;
        }
        int second_greater = 0;
        if(first_greater>c)
        {
            second_greater = first_greater;
        }
        else{
            second_greater = c;
        }
        return second_greater;
    }
}
