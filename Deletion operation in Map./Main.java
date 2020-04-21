import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	TreeMap<String,String> linkedList=new TreeMap<String,String>();
      		int str = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+str);    
      for(int i=0; i<str; i++){
          String str1=br.readLine();
            String n=br.readLine();
          linkedList.put(str1,n);
          }
        System.out.println(linkedList);
                  String str2=br.readLine();
System.out.println("Enter the index to be removed:"+str2);
                linkedList.remove(str2);

            System.out.println(linkedList);
                  String str3=br.readLine();
                        String str4=br.readLine();

      System.out.println("Enter the index to insert:"+str3);
      System.out.println("Enter the value to be inserted:"+str4);
      linkedList.put(str3,str4);
            System.out.println(linkedList);

                
 
      
      
    }
}