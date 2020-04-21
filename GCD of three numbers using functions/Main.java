import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println(gcd(n1,n2,n3));

    }
    public static int gcd(int a1,int a2,int a3)
    {
        int small1 = 0;
        if(a1<a2)
        {
            small1 = a1;
        }
        else{
            small1 = a2;
        }
        int gcd1 = 0;
        while(small1>=1)
        {

            if((a1%small1==0)&&(a2%small1==0))
            {
                gcd1= small1;
                break;
            }
            small1--;
        }
        int small2 = 0;
        if(gcd1<a3)
        {
            small2 = gcd1;
        }
        else{
            small2 = a3;
        }
        int gcdans = 0;
        while(small2>=1){

            if((a3%small2==0)&&(gcd1%small2==0))
            {
                gcdans=small2;
                break;
            }
            small2--;
        }
        return gcdans;
    }
}
