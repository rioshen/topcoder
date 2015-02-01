import java.util.HashSet;
import java.util.Set;

/**
 * In this problem, we can just process the characters of the string one at a time.
 * Each time we look at a character, we ask the question: is this character new,
 * or have we seen it before? And the easiest way how to answer this question is
 * to compare the character to all its predecessors. Or, equivalently, to all
 * characters we already have in the answer.
 */
public class Unique {
	/**
	 * Time: O(N)
	 * Space: O(N)
	 * @param S
	 * @return
	 */
	public String removeDuplicates(String S) {
		if (S == null || S.length() == 0) {
			return "";
		}

		Set<Character> seen = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : S.toCharArray()) {
			if (seen.add(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * O(N), O(1)
	 * @param s
	 * @return
	 */
	public String removeDuplicates2(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		boolean seen = false;
		String ans = "";
		for (char c : s.toCharArray()) {
			seen = false;
			for (char d : ans.toCharArray()) {
				if (c == d) {
					seen = true;
				}
			}
			if (!seen) {
				ans	+= c;
			}
		}

		return ans;
	}
}
