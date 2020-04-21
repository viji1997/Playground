import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	LinkedList<String> linkedList=new LinkedList<String>();
      		String str = br.readLine();
String arr[] = str.split(",");
	for(int i=0; i<arr.length; i++) {
		linkedList.add(arr[i]);
		}
           System.out.println(linkedList);

	String check=br.readLine();
	System.out.println("Size of the linked list: "+linkedList.size());
	System.out.println("Is LinkedList empty? "+linkedList.isEmpty());
	System.out.println("Does LinkedList contains "+check+"?");
	System.out.println(linkedList.contains(check));
	
    }
}