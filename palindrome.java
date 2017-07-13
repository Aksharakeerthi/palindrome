# palindrome
import java.io.*;
import java.util.*;
public class palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k,m=0,a,l;
l=a;
System.out.println("Enter the number");
a=sc.nextInt();
for(;a!=0;a/=10){
k=a%10;
m=m*10+k;
}
if(l==m){
System.out.println("The number is palindrome");
}
else
System.out.println("The number is not a palindrome");
}
}
