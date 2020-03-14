package springexamples;

public class Person {
private String name;
private String id;
private String dep;
public Person(String value)
{
	System.out.println("hai i m from single parameterized constructor......");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
public void showdata()
{
	System.out.println("my name is:"+name);
	System.out.println("my id is:"+id);
	System.out.println("my dep is:"+dep);
}
}
