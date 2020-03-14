import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Product1
{
int id;
String name;
double price;
public Product1(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
@Override
public String toString() {
	return "Product1 [id=" + id + ", name=" + name + ", price=" + price + "]";
}

public class Streamex 
{

	public static void main(String[] args) {
		Product1 p1=new Product1(1001,"Samsung",50000);
		Product1 p2=new Product1(1002,"Onida",40000);
		Product1 p3=new Product1(1003,"Samsung",25000);
		Product1 p4=new Product1(1004,"Apple",56000);
		Product1 p5=new Product1(1005,"Apple",35000);