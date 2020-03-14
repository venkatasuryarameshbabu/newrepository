package model;

import java.util.Set;

public class Cart {

private long id;
private double total;
private String name;
private Set<Item> item;
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public double getTotal() {
return total;
}
public void setTotal(double total) {
this.total = total;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Set<Item> getItem() {
return item;
}
public void setItem(Set<Item> item) {
this.item = item;
}

}