class MyModel1 {
    //write your logic here
    public int size=2;
    MyModel1()

    {

        System.out.println("Features of MyModel 1");

        System.out.println("Camera mega pixels: "+size);
    }
}
class MyModel2 extends MyModel1 {
    //write your logic here
    public String lock ="Fingerprint";
public int dsize=5;
    MyModel2()

    {

        System.out.println("Features of MyModel 2");
        System.out.println("Camera mega pixels: "+(size+3));
        System.out.println("Lock mechanism: " + (lock));
        System.out.println("Display size: " + dsize);


    }
}
class MyModel2T extends MyModel2 {
    //write your logic here
    MyModel2T()

    {
        System.out.println("Features of MyModel 2T");
        System.out.println("Camera mega pixels: "+(size+14));
        System.out.println("Lock mechanism: " + lock);
        System.out.println("Display size: " + (dsize + 1));
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel2T o = new MyModel2T();
    }
}