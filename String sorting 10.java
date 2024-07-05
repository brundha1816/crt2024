Write a program to sort the given string.

Input Format

Read a string

Constraints

string

Output Format

print the ascending order of given string.

Sample Input 0

god
Sample Output 0

dgo
Sample Input 1

python
Sample Output 1

hnopty

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char a[]=s1.toCharArray();
        Arrays.sort(a);
        System.out.println(a);
    }
}
