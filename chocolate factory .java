A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array arrt of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

For Example: N=7 and arr = [4,5,0,1.9,0,5,0]. There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input Format

Read size of the array Read elements of the array line by line

Constraints

1<=n<=10^7

Output Format

Print the elements

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int c=0;
        for(i=0;i<n;i++){
            if(a[i]!=0){
                a[c]=a[i];
                c++;
            }
        }
        while(c<n){
            a[c]=0;
            c++;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
