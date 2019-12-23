1.	import java.util.Scanner;
2.	public class Sum_Average
3.	{
4.	    public static void main(String[] args) 
5.	    {
6.	        int n, sum = 0;
7.	        float average;
8.	        Scanner s = new Scanner(System.in);
9.	        System.out.print("Enter no. of elements you want in array:");
10.	        n = s.nextInt();
11.	        int a[] = new int[n];
12.	        System.out.println("Enter all the elements:");
13.	        for(int i = 0; i < n ; i++)
14.	        {
15.	            a[i] = s.nextInt();
16.	            sum = sum + a[i];
17.	        }
18.	        System.out.println("Sum:"+sum);
19.	        average = (float)sum / n;
20.	        System.out.println("Average:"+average);
21.	    }
	}

