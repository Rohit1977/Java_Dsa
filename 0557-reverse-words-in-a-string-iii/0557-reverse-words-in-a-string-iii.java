class Solution {

    void reverse(StringBuilder sb, int s, int e) {
        while (s < e) {
            char temp = sb.charAt(s);
            sb.setCharAt(s, sb.charAt(e));
            sb.setCharAt(e, temp);
            s++;
            e--;
        }
    }

    public String reverseWords(String str) {

        StringBuilder sb = new StringBuilder(str);

        int s = 0;

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == ' ') {
                reverse(sb, s, i - 1);
                s = i + 1;
            }
        }

        // Reverse the last word
        reverse(sb, s, sb.length() - 1);

        return sb.toString();
    }
}