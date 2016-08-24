import java.util.*;
public class test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	Scanner in=new Scanner(System.in);
	int a = in.nextInt();
	int sum=1;
	char b[]=Integer.toString(a).toCharArray();
	int r=b.length-1,s=b.length-2;
	for(int i=1;i<b.length;i++)
	{
		sum =sum+(int) Math.pow(Character.getNumericValue(b[r]),Character.getNumericValue(b[s]));
		r--;
		s--;
	}
	System.out.println(sum);
	}
}
