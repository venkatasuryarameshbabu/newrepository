package predicateexample;
import java.util.function.Function;

public class functionex {
	public static void main(String[] args)
	{
		Function<String,Integer> f=s->s.length();
	System.out.println("the lengtgh of the string india is:"+f.apply("india"));
	Function<String,Integer> f2=n->n*n;
	System.out.println("the square of the 4 is:"+f2.apply(4));
	}

}
