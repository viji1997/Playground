import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	LinkedHashMap<String,Integer> linkedList=new LinkedHashMap<String,Integer>();
      		int str = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+str);    
      for(int i=0; i<str; i++){
          String str1=br.readLine();
            int n=Integer.parseInt(br.readLine());
          linkedList.put(str1,n);
          }
        System.out.println(linkedList);
                  String str2=br.readLine();
System.out.println("Enter the index to be removed:"+str2);
                linkedList.remove(str2);

            System.out.println(linkedList);

                System.out.println("Size of map is : "+linkedList.size());

    
    }
}