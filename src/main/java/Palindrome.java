public class Palindrome {
    public static boolean isPalindrome(String word) {
        char[] words = word.toLowerCase().toCharArray();
        int middle = words.length/2;

        for (int i = 0, wordsLength = words.length; i < wordsLength; i++) {
            if(i!= middle){
                if(words[i]!=words[words.length-1-i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}