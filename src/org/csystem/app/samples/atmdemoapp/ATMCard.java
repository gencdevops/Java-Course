package org.csystem.app.samples.atmdemoapp;

public class ATMCard {
	public int tryNum;
	public String username;
	public String password;
	public int count;
	//...
	
	public ATMCard(int num)
	{
		tryNum = num;
		username = "test";
		password = "1234";					
	}
	
	public int getStatus(String uname, String passwd)
	{
		if (tryNum == count + 1)
			return -1;		
		
		int status = uname.equals(username) && passwd.equals(password) ? 1 : 0;
		
		count += 1 - status; 
		
		return status;  
	}
}
