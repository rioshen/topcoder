import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueTest {
	
	@Test(timeout=2000)
	public void test0() {
		String S = "banana";
		assertEquals("ban", new Unique().removeDuplicates(S));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String S = "aardvark";
		assertEquals("ardvk", new Unique().removeDuplicates(S));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String S = "xxxxx";
		assertEquals("x", new Unique().removeDuplicates(S));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String S = "topcoder";
		assertEquals("topcder", new Unique().removeDuplicates(S));
	}
}
