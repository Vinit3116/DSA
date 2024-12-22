package stacks;

import java.util.Stack;

public class reverseString {
    public static String reverseStrings(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            res.append(curr);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "Vinit";
        String result = reverseStrings(str);
        System.out.println(result);
    }
}
