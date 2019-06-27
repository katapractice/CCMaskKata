package controller;

import javax.lang.model.element.Element;

public class Controller
{
	
	public Controller()
	{
		
	}
	
	public void start()
	{
		System.out.println(maskString("hioel"));
	}
	
	
	private String maskString(String str)
	{
		String returnMe = "";
		
		if(str.length() <= 4)
		{
			return str;
		}
		else
		{
			char ccArray[] = str.toCharArray();
			
			
			int i = 0;
			while(i < ccArray.length)
			{
				if((ccArray.length - i) > 4)
				{
					ccArray[i] = '#';
				}
				returnMe = returnMe.concat(String.valueOf(ccArray[i]));
				
				i++;
			}
		}
		
		
		
		return returnMe;
	}
}
