class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == haystack.length()) {
            boolean work = checkerMethod(needle, haystack);
            if (work == true) {
                return 0;
            } else {
                return -1;
            }
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (needle.length() > haystack.length()) {
                return -1;
            }

            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean find = checkerMethod(haystack.substring(i, i + needle.length()), needle);
                if (find == true) {
                    return i;
                } else {
                    continue;
                }
            }
        }
        return -1;
    }

    public static boolean checkerMethod(String a, String b) {
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}
// finding a needle in haystack problem by splicing it up.
