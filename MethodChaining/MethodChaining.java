// Without method chaining

/*public class Product  
{  
private String pname;  
private int pcost;  
private int quantity;  
public void setPname (String pname)   
{  
this.pname = pname;  
}  
public void setPcost(int pcost)   
{  
this.pcost = pcost;  
}  
public void setQuantity (int quantity)   
{  
this.quantity = quantity;  
}  
public void detail()   
{  
System.out.println("The product name is " + pname + ". It's cost is " + pcost + ". Available quantity is "+quantity);  
}  
public static void main(String args[])   
{  
//creating an object of the Product class      
Product product = new Product();  
//calling methos without using chaining   
product.setPname("AC");  
product.setPcost(20000);  
product.setQuantity(4);  
product.detail();  
}  
}    */


// With method chaining 

public class MethodChaining {
  
private int id;      
private String name;  
private int age;  
private int std;  
public MethodChaining setId(int id)   
{  
this.id = id;  
//"this" (the current MethodChaining object) to allow for further chained method calls  
return this;  
}  
public MethodChaining setName(String name)   
{  
this.name = name;  
return this;  
}  
public MethodChaining setAge(int age)   
{  
this.age = age;  
return this;  
}  
public MethodChaining setStd(int std)   
{  
this.std = std;  
return this;  
}  
public void detail()   
{  
System.out.println("MethodChaining Detail is:\n");  
System.out.println("Id: "+id+ "\nName: "+name+"\nAge: "+age+ "\nStandard: "+std);  
}  
public static void main(String args[])   
{  
MethodChaining MethodChaining = new MethodChaining();  
//method chaining  
MethodChaining.setId(1183).setName("Herry Tangri").setAge(17).setStd(9).detail();  
}  
}  
