package org.csystem.app.samples.atmdemoapp;

public class ATM {
	public ATMCard atmCard;
	public java.util.Scanner kb;
	//...
	
	public void doWorkForSuccess()
	{
		//...
		System.out.println("Giriş başarılı");
	}
	
	public void doWorkForTryFail()
	{
		//...
		System.out.println("Hatalı giriş yaptınız!!");
	}
	
	public void doWorkForFail()
	{
		//...
		System.out.println("Giriş başarısız. Deneme hakkınız bitti");		
	}
	
	public ATM(int tryNum)
	{
		//...
		atmCard = new ATMCard(tryNum);
		kb = new java.util.Scanner(System.in);
	}
	
	public void run()
	{
		int status;
		
		for (;;) {
			System.out.print("Kullanıcı adını giriniz:");
			String username = kb.nextLine();
			
			System.out.print("Şifreyi adını giriniz:");
			String password = kb.nextLine();
			
			status = atmCard.getStatus(username, password);
			
			if (status == 1 || status == -1)
				break;
			
			doWorkForTryFail();						
		}	
		
		if (status == 1)
			doWorkForSuccess();
		else
			doWorkForFail();
	}
}
