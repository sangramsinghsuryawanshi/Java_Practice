/*
 * 
1. String Compression Algorithm  
   Write a Java method that compresses a string using the 
   counts of repeated characters. For example, `"aabcccccaaa"`
    should become `"a2b1c5a3"`. If the compressed string is 
    not shorter, return the original string.
 */
package com.String;

public class CompressionAlgorithm 
{
	public static void isCA(String s1)
	{
		char s[]=s1.toCharArray();
		for(int i=0;i<s.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					cnt++;
					s[j]='0';
				}
				else
				{
					break;
				}
			}
			if(s[i]!='0')
			System.out.print(s[i]+""+cnt);
		}
	}
	public static void main(String[] args) 
	{
		String s = "aabcccccaaa";
		isCA(s);
	}
}
