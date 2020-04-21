//import required packages
import java.util.Scanner;

class Faculty
{
  public void salary(int sal)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+sal);
  }
}
class CSE extends Faculty
{
  public void salary(int sal)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+ (sal+3000));
  }
}
class IT extends CSE
{
  public void salary(int sal)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(sal+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int sal)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: " +((sal)+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
  Scanner in = new Scanner(System.in);
  int sal=in.nextInt();
  if(sal<=0){
  System.out.println("null");
  }else{
  
    Faculty obj1=new Faculty();
    obj1.salary(sal);
    CSE obj2=new CSE();
    obj2.salary(sal);
    IT obj3=new IT();
    obj3.salary(sal);
    ECE obj = new ECE();
   obj.salary(sal);
   
   
   
   //implement your required concept here
  }
  }
}