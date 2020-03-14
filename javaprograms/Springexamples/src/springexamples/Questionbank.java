package springexamples;

import java.util.Iterator;
import java.util.List;

public class Questionbank {
 int qid;
 String name;
 List<String> list;
public Questionbank(int qid, String name, List<String> list) {
	super();
	this.qid = qid;
	this.name = name;
	this.list = list;
}
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
 public void showanswers()
 {
	 System.out.println("id:"+qid);
	 System.out.println("name:"+name);
	 Iterator li=list.iterator();
	 while(li.hasNext())
	 {
		 //li.next();
		 System.out.println(li.next());
	 }
 }
}
