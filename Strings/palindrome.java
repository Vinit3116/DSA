package Strings;


public class palindrome{

    //Substring in a Sring///

    // public static String subString(String str,int si,int ei){
    //     String subStr = "";
    //     for(int i=0;i<ei;i++){
    //         subStr += str.charAt(i);
    //     }
    //     return subStr;
    // }
    
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));
        //String str = "HelloWorld";
        // System.out.println(subString(str, 0, 5));
    }
}