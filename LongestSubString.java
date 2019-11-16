import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static String LongestSubString (String s) {
        String result = " ";
        
        for(int i=0; i < s.length(); i++) {
            
        Set<Character> str = new HashSet<>();
        
        int j = i;
        
        for(; j<s.length(); j++){
            
            char currChar = s.charAt(j);
            
            if(str.contains(currChar)) {
                break;
            }else {
                str.add(currChar);
            }
        }
        if(result.length() < j-i+1) {
            result = s.substring(i, j);
        }
        }
        return result;    
    }
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
