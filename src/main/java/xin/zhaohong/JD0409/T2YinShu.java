package xin.zhaohong.JD0409;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class T2YinShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(helper(arr[i]));
        }
    }
    public static String helper(long n) {
        if (n % 2 != 0) return "No";
        long y = 2;
        long x = n/2;
        while ((x & 1) != 1) {
            y = y*2;
            if (n % y != 0) return "No";
            x = x/2;
        }
        return x + " " + y;
    }
}