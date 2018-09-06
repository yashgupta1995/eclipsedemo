import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UniqueEvenSum
{
	public static void main(String[] args)
{
		System.out.println("Enter the size of array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int x = addUniqueEven(arr,n);
		if(x == -1)
			System.out.println("no even numbers");
		else
			System.out.println(x);
}
public static int addUniqueEven(int[] input,int n)
{
		int j = 0;
		int i = 1;
		while (i < input.length)
		{
			if (input[i] == input[j])
			{
				i++;
			}
			else
			{
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++)
		{
			output[k] = input[k];
		}
		int sum = 0;
		for(int p = 0;p<output.length;p++)
		{
			if(output[p]%2 == 0)
			{
				sum = sum + output[p];
			}
		}
		if(sum > 0)
			return(sum);
		else
			return -1;
	}
		
}
