import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        int i;
        for(i=0;i<n1;i++){
            a1[i]=s.nextInt();
    }
for(i=0;i<n2;i++){
a2[i]=s.nextInt();
}
    if(n1!=n2){
System.out.println("Not Same");
        System.exit(0);
    }
    else{
    for(i=0;i<n1;i++){
        if(a1[i]!=a2[i]){
            System.out.println("Not Same");
            System.exit(0);
        }
            
        }
    }
    if(i==n1){
        System.out.println("Same");
        System.exit(0);
      } 
    }
}
