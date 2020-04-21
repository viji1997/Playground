public class Main {
	public static void main(String[] args) {
		Customers customerobj1 = new Customers(1000,"Saakshi",9000000000L,"Bangalore","16-jul-1990","F","Lakme Kajal,Salwar");
        Customers customerobj2 = new Customers(1008,"Rahul",9000000001L,"Chennai","27-jan-1992","M","T-shirts,jeans");
        Suppliers supplierobj1= new Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75f);
        Suppliers supplierobj2= new Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35f);

        //implement your required concept here
        customerobj1.displayprofiledetails();
        customerobj2.displayprofiledetails();
        supplierobj1.displayprofiledetails();
        supplierobj2.displayprofiledetails();
        customerobj1.editAddress();
        supplierobj1.editAddress();
        customerobj1.placeOrder();
        supplierobj1.increasestocklevel();
        supplierobj2.increasestocklevel();
    }
    }
class Users {
    //write the logic for the class Users
}

class Customers extends Users{
    //write the logic for the class Customers
    public long CID;
    public String name;
    public long mobileno;
    public String shippingad;
    public String dob;
    public String gender;
    public String orderHistry;
    Customers(long CID,String name, long mobileno, String shippingsd, String dob,String gender, String orderHistory) {
 this.CID=CID;
 this.name=name;
 this.mobileno=mobileno;
 this.shippingad=shippingsd;
 this.dob=dob;
 this.gender=gender;
 this.orderHistry=orderHistory;

    }
    public void editAddress(){
            System.out.println(name+", "+shippingad);
            System.out.println(name+", "+"Coimbatore");
        }
        public void placeOrder(){
            System.out.println("Order placed successfully!");
        }
        public void displayprofiledetails() {
            System.out.println(name+", "+mobileno);
        }

    }


class Suppliers extends Users {
    //write the logic for the class Suppliers
    public long SID;
    public String name;
    public long mobileno;
    public String billingad;
    public int itemsstock;
    public String paymentstatus;
    public float rating;
    Suppliers(long SID, String name, long mobileno, String billingad, int itemsstock, String paymentstatus, float rating) {


this.SID=SID;
this.name=name;
this.mobileno=mobileno;
this.billingad=billingad;
this.itemsstock=itemsstock;
this.paymentstatus=paymentstatus;
this.rating=rating;
    }
        public void editAddress()
    {
            System.out.println(name+", "+billingad);
            System.out.println(name+", "+"Delhi");
        }
        public void increasestocklevel(){
            if(itemsstock==10){
                System.out.println(name+", "+(itemsstock+5));
            }else{
                System.out.println(name+", "+(itemsstock+10));
            }
        }
        public void displayprofiledetails() {
            System.out.println(name+", "+mobileno);
        }
    }
