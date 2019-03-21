
package Validatepassword;

import java.util.Scanner;

public class Validatepassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println(" A valid password should contain  atleast one uppercase,1 lowercaseand digits also ");
	
		boolean win=false;
		while(win==false)
		{
	    System.out.println(" Craete a password");
		String Password=sc.next();
		if (isValid(Password))
		{
			System.out.println(" Password is Valid");
			win=true;
		}
		else
		{
			System.out.println(" Password is not Valid");
		}
	    }
	}
	public static boolean isValid(String password)
	{
		boolean upperCase=false;
		boolean lowerCase=false;
		boolean isDigit=false;
		if(password.length()>=10)
		{
			for(int i=0; i<password.length()-1;i++)
			{
				if(Character.isLowerCase(password.charAt(i)))
				{
				lowerCase=true;	
				}

				if(Character.isUpperCase(password.charAt(i)))
				{
				upperCase=true;	
				}

				if(Character.isDigit(password.charAt(i)))
				{
				isDigit=true;	
				}
			}
		}
		return (upperCase&& lowerCase&& isDigit);
	}

}