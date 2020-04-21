//import required packages here
import java.util.Scanner;
class Item
{
  public int price;
  //create various method to return attribute value(s)
  public void setPrice(int price){
  this.price=price;
  }
  public int getPrice(){
  return  price;
  }
}
   
class Customer extends Item
{
  public String product;
  public int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product){
  this.product=product;
  }
  public String getProduct(){
  return product;
  }
  public void setQuantity(int quantity){
  this.quantity=quantity;
  }
  public int getQuantity(){
  return quantity;
  }
}


class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    
    //write the logic here
    Scanner in = new Scanner(System.in);
    String pro = in.nextLine();
    c.product=pro;
    int pri=in.nextInt();
    i.price=pri;
    int quan=in.nextInt();
    c.quantity=quan;
    
   System.out.println("Total Price is : "+c.quantity*i.price);
  }
}