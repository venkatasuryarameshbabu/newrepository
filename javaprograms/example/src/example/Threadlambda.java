package example;

public class Threadlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable s=()->{
	for(int i=1;i<=10;i++)
		System.out.println(i);
};
  Thread tl=new Thread(s);
   tl.start();
	
	}
}
