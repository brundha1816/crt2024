A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

Input Format

Read size of the array Read elements for in-guest array Read elements for out-guest array

Constraints

1<=n<=10^7

Output Format

Print highest guests available in a party based on hours

Sample Input 0

5
7 0 5 1 3 
1 2 1 3 4   
Sample Output 0

8

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int in[]=new int[n];
        int out[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            in[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            out[i]=s.nextInt();
        }
        int r=0,m=0;
        for(i=0;i<n;i++){
            r=r+in[i]-out[i];
            if(m<r)
                m=r;
        }
        System.out.println(m);
    }
}
