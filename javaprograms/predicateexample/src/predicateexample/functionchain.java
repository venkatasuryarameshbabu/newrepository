package predicateexample;
import java.util.function.Fuction;
import java.util.function.Function;

public class functionchain {

	public static void main(String[] args) {
		Function<String,String>f1=s->s.substring(0,9);
		Function<String,String>f2=s->s.toUpperCase();
		System.out.println("the result of f1 is:"+f1.apply("suryarameshbabu"));
		System.out.println("the result of f2 is:"+f2.apply("suryarameshbabu"));
		System.out.println("the result of f1.andThen(f2):"+f1.andThen(f2).apply("Suryarameshbabu"));
		System.out.println("the resukt of the f1.compose(f2):"+f1.compose(f2).apply("suryarameshbabu"));

	}

}
