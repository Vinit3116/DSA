package Strings;

public class longestPalindrome {
    
    public static StringBuilder longestPalindrome(String s){
        int n = s.length();
        int i=0;
        int j=n-1;

        StringBuilder res = new StringBuilder();
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                i++;
                j--;
            }
            else{
                res.append(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
