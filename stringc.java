/*aaabbcc -> a3b2c2 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stringc
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    int[] count = new int[256];
	    int n = s1.length();
	    char[] res = new char[1];
	    int i;
	    
	    for(i=0;i<n;i++){
	        count[s1.charAt(i)]++;
	        
	    }  
	    for(i=0;i<n;i++){
	        if(count[s1.charAt(i)]>0 && res[0] != s1.charAt(i)){
	             res[0] = s1.charAt(i);
	            //int c = (int)s1.charAt(i);
	             System.out.print(res[0]);
	             System.out.print(count[res[0]]);
	        } 
	        
	        
	    }
	    
	   
	}
}
