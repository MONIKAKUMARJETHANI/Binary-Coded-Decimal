import java.io.*;
public class BCD {

	

	public static void main(String[] args) {
		
		try
		{
		String val[]={"0001","0010","0011","0100","0101","0110","0111","1000","1001"};
		int n;
		System.out.println("Enter a number");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String temp=buf.readLine();
		int num=Integer.parseInt(temp);
		String s="";
		n=num;
		if(num==0)
		{
			System.out.println("Binary Coded Decimal Value for "+n +" is 0000");	
			System.exit(0);
		}
		
		while(num!=0)
		{
			int b=num%10;
			
			s=s+val[b-1];
			num=num/10;
		}
		System.out.println("Binary Coded Decimal Value for "+n +" is "+s);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
