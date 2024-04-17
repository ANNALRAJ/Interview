package org.sample;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("Desktop size is 50inch");
		
	}
	public static void main(String[] args)
	{
		Desktop e=new Desktop();
		e.computerModel();
		e.desktopSize();
	}

}
