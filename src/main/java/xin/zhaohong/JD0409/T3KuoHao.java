package xin.zhaohong.JD0409;

import java.util.*;
public class T3KuoHao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int n = sc.nextInt();
        //String [] arr = new String[n];
        while(sc.hasNext()){
        	String str = sc.next();
            System.out.println(myMethod(str));
        }
    }
    
    
    public static String myMethod(String s) {
        char[] arr = s.toCharArray();
        if (s.equals("()")) return "No";
        if (arr.length % 2 != 0) return "No";
        Stack<Character> stack = new Stack<Character>();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ')') {
                if (!stack.isEmpty()) stack.pop();
                else {
                    flag++;
                    if (flag >= 2) return "No";
                }
            } else {
                stack.push('(');
            }
        }
        if (stack.isEmpty()) return "Yes";
        return stack.size() == 1 ? "Yes" : "No";
    }
}
