package xin.zhaohong.JD0409;

import java.util.Scanner;

public class T1HuiWen
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
		String str = myScanner.nextLine();
		int len = str.length();
		long[][] dp = new long[len][len];
		for (int i = 0; i < len; i++)
			dp[i][i] = 1;
		for (int m = 1; m < len; m++)
		{
			for (int i = 0; i < len - m; i++)
			{
				int j = i + m;
				if (str.charAt(i) != str.charAt(j))
					dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
				else
					dp[i][j] = dp[i + 1][j] + dp[i][j - 1] + 1;
			}
		}
		System.out.println(dp[0][len - 1]);
	}

}
