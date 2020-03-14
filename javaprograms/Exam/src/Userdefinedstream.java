import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Product{
int id;
String name;
double price;
public Product(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
public class Userdefinedstream {

	public static void main(String[] args) {
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Onida",40000);
		Product p3=new Product(1003,"Hutch",25000);
		Product p4=new Product(1004,"Apple",56000);
		Product p5=new Product(1005,"Voltos",35000);
		Product p6=new Product(1006,"haier",30000);
		Product p7=new Product(1007,"Vodofone",25000);
		Product p8=new Product(1008,"Apple",55000);
		Product p9=new Product(1009,"sony",10000);
		Product p10=new Product(1010,"Apple",60000);
ArrayList<Product> a=new ArrayList<Product>();
                     a.add(p1);
                     a.add(p2);
                     a.add(p3);
                     a.add(p4);
                     a.add(p5);
                     a.add(p6);
                     a.add(p7);
                     a.add(p8);
                     a.add(p9);
                     a.add(p10);
       Product prod = a.stream()
    		   .filter(p->p.name=="Apple")
    		   .max((Product x,Product y)->x.price>y.price?1:-1)
    		   .get();         
	   System.out.println(prod);
	}

}
