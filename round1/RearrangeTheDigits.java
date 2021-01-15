/*
  Given a number N, find the smallest number which can be obtained by rearranging the digits of N. The generated number should not have any leading zeroes.
*/

//Initial Template for Java

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    String N = sc.next();
		    Solution T = new Solution();
		    System.out.println(T.smallestnum(N));
		    
	    }
	
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String smallestnum(String N)
    {
        int[] arr = new int[N.length()];
        for(int i=0;i<N.length();i++)
        {
           arr[i] = Character.getNumericValue(N.charAt(i));
        }
        Arrays.sort(arr);
        int cnt0=0;
        int sindex=0;
        String s1="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                cnt0+=1;
            }
            if(arr[i]!=0)
            {
                sindex=i;
                break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                ;
            }
            else if(i==sindex)
            {
                s1+=String.valueOf(arr[i]);
                for(int j=0;j<cnt0;j++)
                {
                    s1+='0';
                }
            }
            else
            {
                s1+=String.valueOf(arr[i]);
            }
        }
        return s1;
    }
}

