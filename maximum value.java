Write a program to find the maximum element in an array.

Input Format

Integer corresponds to the size of the array. Read n elements line by line

Constraints

1<=n<=10^7

Output Format

Print maximum value

Sample Input 0

5
1
2
33
4
5
Sample Output 0

33
Sample Input 1

3
10
210
90
Sample Output 1
210

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int m=a[0];
        for(int i=1;i<n;i++){
            if(m<a[i])
                m=a[i];
        }
        System.out.println(m);
    }
}
        
