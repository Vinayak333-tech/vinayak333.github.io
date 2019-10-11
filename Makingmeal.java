/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Makingmeal
{
	public static void main (String[] args) throws java.lang.Exception
	{   Scanner sc=new Scanner(System.in);
        int t;
        
        t=sc.nextInt();
        while(t-->0)
        {   String s;
            int n;
            int a[]=new int[26];
            n=sc.nextInt();
            while(n-->0){
                s=sc.next();
                for(int i=0;i<s.length();i++)
                {int value=s.charAt(i)-97;
                a[value]++;
                }
            }
            int arr[]=new int[6];
            arr[0]=a[2]/2;
            arr[1]=a[14];
            arr[2]=a[3]/2;
            arr[3]=a[4];
            arr[4]=a[7];
            arr[5]=a[5];
            int  min=arr[0];
            System.out.println(min);
            for(int j=1;j<6;j++)
            {min=Math.min(min,arr[j]);
            System.out.println(arr[j]);}
            System.out.println(min);
            
        }
        
	}
}
