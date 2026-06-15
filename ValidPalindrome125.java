public class ValidPalindrome125 {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        
        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            if(!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            } else if(!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            } else if (s.charAt(l) != s.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
