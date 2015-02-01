import org.junit.Test;
import static org.junit.Assert.*;

public class SimilarSequencesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] seq = new int[] {1, 1};
		int bound = 3;
		assertEquals(5, new SimilarSequences().count(seq, bound));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] seq = new int[] {1, 2};
		int bound = 2;
		assertEquals(4, new SimilarSequences().count(seq, bound));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] seq = new int[] {999999999};
		int bound = 1000000000;
		assertEquals(1000000000, new SimilarSequences().count(seq, bound));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] seq = new int[] {1, 2, 3, 4, 5};
		int bound = 5;
		assertEquals(97, new SimilarSequences().count(seq, bound));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] seq = new int[] {5, 8, 11, 12, 4, 1, 7, 9};
		int bound = 1000000000;
		assertEquals(999999363, new SimilarSequences().count(seq, bound));
	}
}
