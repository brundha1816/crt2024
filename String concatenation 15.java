Write a program to find the concatenation of the given two strings

Input Format

Input consists of 2 strings.

Constraints

string

Output Format

print result string

Sample Input 0

Sun
Microsystems
Sample Output 0

Sun Microsystems
Sample Input 1

Oracle
Corporation
Sample Output 1

Oracle Corporation

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        String s3=s1+" "+s2;  
        System.out.println(s3);
    }
}
