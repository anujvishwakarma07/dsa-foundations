public class isPalindrome9 {
    public static boolean isPlaindromeOrNot(int num) {
        boolean isPalindrom = false;
        int reverseNumber = 0;
        int temp = num;
        while(temp > 0) {
            int reminder = temp % 10;
            reverseNumber = (reverseNumber * 10) + reminder;
            temp /= 10;
        }

        if(reverseNumber == num) {
            isPalindrom = true;
        }

        return isPalindrom;

        
    }
    public static void main(String[] args) {
        int num = 11100;
        System.out.println(isPlaindromeOrNot(num));

    }
}
