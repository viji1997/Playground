import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int option=in.nextInt();
      
        switch(option){
          case 1:
            int side=in.nextInt();
            int ans=side*side;
            System.out.println(ans);
            break;
          case 2:
            int length=in.nextInt();
            int breath=in.nextInt();
            ans=length*breath;
            System.out.println(ans);
            break;
            case 3:
             length=in.nextInt();
             breath=in.nextInt();
            ans=(length*breath)/2;
            System.out.println(ans);
            break;
            case 4:
            side=in.nextInt();
            double anss=3.14*side*side;
            System.out.println(anss);
            break;
            

        }
    }
}