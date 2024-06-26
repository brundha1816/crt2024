Write a program to delete an element from the given location in an array. If index is out of range then print "Invalid Input"

Input Format

Read size of the array Read elements of the array Enter location to delete an element in the array

Constraints

1<=n<=10^7

Output Format

Print elements of array after delete the element

Sample Input 0

5
1
2
3
4
5
4
Sample Output 0

1
2
3
5
Sample Input 1

6
34
22
55
233
66
87
10
Sample Output 1

Invalid Input
Sample Input 2

6
65
23
11
6
44
23
2
Sample Output 2

65
11
6
44
23

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int location=s.nextInt();
        if(location<1||location>n)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            for(int i=0;i<n;i++)
                if(i!=location-1)
                {
                    System.out.println(a[i]+" ");
                }
        }
    }
 }
