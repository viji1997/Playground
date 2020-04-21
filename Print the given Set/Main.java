import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	LinkedList<String> linkedList=new LinkedList<String>();
      		String str = br.readLine();
String arr[] = str.split(",");
	for(int i=0; i<arr.length; i++) {
		linkedList.add(arr[i]);
		}
           System.out.println(linkedList);
    }
}