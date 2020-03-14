package springexamples;

public class Employee {
 private String name;
 private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void message()
{
	System.out.println("my name is:"+name);
	System.out.println("my id is:"+id);
}
}
