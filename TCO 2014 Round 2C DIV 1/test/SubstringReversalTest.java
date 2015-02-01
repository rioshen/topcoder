import org.junit.Test;
import static org.junit.Assert.*;

public class SubstringReversalTest {
	
	@Test(timeout=2000)
	public void test0() {
		String S = "abdc";
		assertArrayEquals(new int[] {2, 3 }, new SubstringReversal().solve(S));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String S = "aabbcc";
		assertArrayEquals(new int[] {0, 0 }, new SubstringReversal().solve(S));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String S = "misof";
		assertArrayEquals(new int[] {0, 4 }, new SubstringReversal().solve(S));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String S = "ivan";
		assertArrayEquals(new int[] {0, 2 }, new SubstringReversal().solve(S));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String S = "thisseemstobeaneasyproblem";
		assertArrayEquals(new int[] {0, 13 }, new SubstringReversal().solve(S));
	}
}
