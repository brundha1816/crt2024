In a science research lab, combining two nuclear chemicals produces a maximum energy that is the product of the energy of the two chemicals. The energy values of the chemicals can be negative or positive. The scientist wishes to calculate the sum of the maximized energies of the two elements when the reaction happens. Write an algorithm to find the total energy produced by the chemicals when the reaction happens.

Input Format

The first line of the input consists of an integer numOfChem, representing the number of chemicals (N). The second line consists of N space-separated integers – enerp ener2, , enerN representing the energies of the chemicals.

Constraints

0 < num0fChem <=10^6

Output Format

Print an integer representing the total energy produced by the chemicals when the reaction happens.

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
        int s1=0;
        for(i=n-1;i>=n-2;i--){
            s1=s1+a[i];
        }
        System.out.println(s1);
    }
}
