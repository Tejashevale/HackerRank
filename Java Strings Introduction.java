Java Strings Introduction

https://www.hackerrank.com/challenges/java-strings-introduction/problem

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java


Program:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i=A.compareTo(B);
        if(i>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    String a=A.substring(0,1).toUpperCase()+A.substring(1);
    String b=B.substring(0,1).toUpperCase()+B.substring(1);
    System.out.print(a+" "+b);
    }
}



