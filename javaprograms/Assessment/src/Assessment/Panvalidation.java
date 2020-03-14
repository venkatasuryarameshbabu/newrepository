package Assessment;
 
import java.util.*;
 
public class Panvalidation {
 
public static void main(String[] args) {
Scanner r = new Scanner(System.in);
String s1= r.next();
validate(s1);
}
 
public static void validate(String s1) {
if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
{
System.out.println("Valid");
}
else
System.out.println("Invalid");
}
}