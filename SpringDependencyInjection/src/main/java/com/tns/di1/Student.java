package com.tns.di1;

public class Student 
{
	private MathCheat chit;

	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	public void cheating()
	{
		chit.mathCheat();
	}
}