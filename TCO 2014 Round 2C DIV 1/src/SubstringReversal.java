/**
 * String Manipulation problem
 */
public class SubstringReversal {
	private String reverse(String s, int start, int end) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < start; i++) {
			sb.append(s.charAt(i));
		}
		for (int i = end; i >= start; i--) {
			sb.append(s.charAt(i));
		}
		for (int i = end + 1; i < s.length(); i++) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public int[] solve(String S) {
		int[] result = new int[]{0, 0};
		if (S == null || S.length() == 0) {
			return result;
		}

		for (int i = 0; i < S.length() - 1; i++) {
			char c = S.charAt(i);
			boolean startHere = false;
			for (int j = i + 1; j < S.length(); j++) {
				if (S.charAt(j) < c) {
					startHere = true;
				}
			}
			if (startHere) {
				String smallest = S;
				for (int j = i + 1; j < S.length(); j++) {
					String T = reverse(S, i, j);
					if (T.compareTo(smallest) < 0) {
						smallest = T;
						result[0] = i;
						result[1] = j;
					}
				}
				break;
			}
		}
		return result;
	}
}
