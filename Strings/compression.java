package Strings;

public class compression {
    
    public static String compress(String str){
        String sb = " ";
        int n = str.length();

        for(int i=0;i<n;i++){
            Integer count = 1;
            while(i< n-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb += str.charAt(i);
            if(count > 1){
                sb += count.toString();
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
