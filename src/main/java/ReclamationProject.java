/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * a function to find the same part of two strings.
 * <p>
 */
public class ReclamationProject {
/**
 * @param first the first string
 * @param second the second string
 * @return return the same part
 */
    static String doit(final String first, final String second) {
        String a = first;
        String b = second;
        if (first.length() > second.length()) {
            String c = first;
            a = second;
            b = c;
            }
        String r = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                    }
                        }
                }
        return r;
        }
}
