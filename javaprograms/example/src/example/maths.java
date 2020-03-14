package example;
interface Mathematics{
	public int add(int a,int b);
}
public class maths {
public static void main(String[] args)
{
	Mathematics s=(a,b)->a+b;

	System.out.println(s.add(2,4));
}
}

