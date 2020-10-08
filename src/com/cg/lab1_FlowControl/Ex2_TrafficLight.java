package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex2_TrafficLight {
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Select one of three lights: red/yellow/green");
		String color=s.next();
		color=color.toLowerCase();
		
		if(color.equals("red"))
		{
			System.out.println("stop");
		}
		else if(color.equals("yellow"))
		{
			System.out.println("ready");
		}
		else if(color.equals("green"))
		{
			System.out.println("go");
		}
		else {
			System.out.println("Wrong input");
		}
	}

}
