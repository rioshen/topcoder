import java.util.Arrays;

public class EllysSortingTrimmer {
	/**
	 * Finally just return the smallest L characters, because of that,
	 * we first sort the rest part then sort the L part, then return
	 * the first L characters which is the smallest.
	 * @param S
	 * @param L
	 * @return
	 */
	public String getMin(String S, int L) {
		if (S == null || S.length() == 0) {
			return "";
		}
		char[] asChar = S.toCharArray();
		Arrays.sort(asChar, 1, S.length());
		Arrays.sort(asChar, 0, L);
		return new String(asChar, 0, L);
	}
}
