import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	LinkedHashSet<String> linkedList=new LinkedHashSet<String>();
      		String str = br.readLine();
String arr[] = str.split(",");
	for(int i=0; i<arr.length; i++) {
		linkedList.add(arr[i]);
		}
           System.out.println(linkedList);
            String del=br.readLine();

      System.out.println("Enter the value to be deleted: "+del);
      
      linkedList.remove(del);
                 System.out.println(linkedList);
            String ad=br.readLine();

      System.out.println("Enter the value to be added: "+ad);
      linkedList.add(ad);
                 System.out.println(linkedList);

      
      
    }
}