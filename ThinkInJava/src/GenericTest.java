
import javax.lang.model.type.NullType;

public class GenericTest {

	public static void main(String[] args) {
		if (null instanceof NullType) {
			System.out.println("Yes it is.");
		} else if (null instanceof Object) {
			System.out.println("ok, boss, your are the boss of the world.");
		} else {
			System.out.println("No, your are wrong!");
		}
	}

}
