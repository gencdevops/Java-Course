package org.csystem.app.samples.lottosimulationapp;

import org.csystem.util.NumberUtil;

public class Lotto {
	public java.util.Random random;
	public boolean firstGameWinFlag;
	public boolean secondGameWinFlag;
	public boolean thirdGameWinFlag;

	public Lotto()
	{
		random = new java.util.Random();
	}
	
	public Lotto(java.util.Random r)
	{
		random = r;
	}
	
	public int getFirst()
	{
		return random.nextInt(99) + 1;
	}
	
	public int getSecond(int first)
	{
		int second;
		
		while ((second = random.nextInt(99) + 1) == first)
			;
		
		return second;		
	}	
	
	public int getThird(int first, int second)
	{
		int third;
		
		while ((third =  random.nextInt(99) + 1) == first || third == second)
			;
		
		return third;				
	}
	
	public void playFirstGame(int first, int second, int third)
	{
		firstGameWinFlag = first + second + third < 150;
	}
	
	public void playSecondGame(int first, int second, int third)
	{
		secondGameWinFlag = NumberUtil.isPrime(first + second + third);
	}		
	
	public void playThirdGame(int first, int second, int third)
	{
		int min = Math.min(first, Math.min(second,  third));
		int mid = NumberUtil.mid(first, second, third);
		int max = Math.max(first, Math.max(second,  third));
		
		thirdGameWinFlag = max - min > mid;
	}
	
	public void play()
	{
		int first = getFirst();
		int second = getSecond(first);
		int third = getThird(first, second);
		
		playFirstGame(first, second, third);
		playSecondGame(first, second, third);
		playThirdGame(first, second, third);
	}
}
