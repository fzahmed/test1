package Learn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Laboni {

	@BeforeMethod
	public void run() {
		System.out.println("testing");
	}
	@Test
	public void test() {
		int a=2;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
}
