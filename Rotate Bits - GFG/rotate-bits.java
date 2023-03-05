//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        D = D%16;
        String str = Integer.toBinaryString(N);
    while(str.length()<16)
        {
            str = "0" + str;
        }
        String left = str.substring(D)+str.substring(0,D);
        String right = str.substring(str.length()-D)+str.substring(0,str.length()-D);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(left,2));
        list.add(Integer.parseInt(right,2));
        return list;
    }
}