Students in a class have been assigned a unique ID. As part of a quiz competition, the class teacher wishes to form two different groups from the N number of students who are participating the quiz. All participants are currently sitting a random manner, but teacher wishes all of them to sit according their ID’s. Two groups will be formed in such a way that students whose seat number in an odd number will be the first group and students whose seat number is an even number will be in the second group. Write an algorithm to find the list of which students IDs should be in the first group, followed by the student ID’s which should be in the second group as per the teacher’s instructions.

Input Format

First line n denotes number of students Second line n elements representing students IDs for all the participants.

Constraints

1<=n<=10^7

Output Format

Print N space separated integers representing the students IDs of first group followed by the student’s IDs of the second group.

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
        Arrays.sort(a);
        for(i=0;i<n;i+=2){
            System.out.print(a[i]+" ");
        }
        for(i=1;i<n;i+=2){
            System.out.print(a[i]+" ");
        }
    }
}
