public class LongestSubString {
    public static String LongestSubString (String s) {
        String result = " ";
        for(int i=0; i < s.length(); i++) {
            String str = " ";
            for(int j = i; j < s.length(); j++) {
                if (str.contains("" + s.charAt(j))) {
                    break;
                }
                str += s.charAt(j);
            }
            if(str.length() > result.length()) {
                result = str;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = LongestSubString("abcabcbb");
        System.out.println("abcabcbb -> longest substring without repeating character is " + s + " and it's length is " + s.length());
        s = LongestSubString("bbbbb");
        System.out.println("bbbbb -> longest substring without repeating character is " + s + " and it's length is " + s.length());
        s = LongestSubString("pwwkew");
        System.out.println("pwwkew -> longest substring without repeating character is " + s + " and it's length is " + s.length());
    }
}
