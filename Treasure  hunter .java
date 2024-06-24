Though there have been more successful pirates, Blackbeard is one of the best-known and widely-feared of his time. He commanded four ships and had a pirate army of 300 at the height of his career and defeated the famous warship, HMS “Scarborough” in sea-battle. He was known for barreling into battle clutching two swords with several knives and pistols at the ready. He captured over forty merchant ships in the Caribbean and without flinching killed many prisoners. Now, Blackbeard and his three pirates found a treasure of gold coins. Long Ben too joined them. They decided to share the treasure. Blackbeard agreed to give x% share for Long Ben. He then decided to take y% share from the remaining treasure. His other pirates will share the remaining gold coins equally. Write a program to compute their share's.

Input Format

Input consists of 3 integers. The first input corresponds to the number of gold coins in the treasure. The second input corresponds to Ben's share percentage and the last input is Blackbeard's share percentage.

Constraints

1<=n<=10^7

Output Format

The output consists of three integers. The first output integer corresponds to Long Ben's share. The second integer corresponds to Blackbeard's share. The last integer corresponds to other pirates share.

Sample Input 0

729
65
87
Sample Output 0

473
222
11

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int x,y,z;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        int r1=(x*y)/100;
            x=x-r1;
        int r2=(x*z)/100;
            x=x-r2;
        int r3=x/3;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
