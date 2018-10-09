package com.thirdware.day1;
import java.time.*;
import java.util.Scanner;

public class calculateDob
{
	public static void main(String[] args) {
		
		System.out.println("enter date of birth");
		Scanner scn = new Scanner(System.in);
		String birthDay=scn.next();
		LocalDate birthday=LocalDate.parse(birthDay);
		System.out.println(calculateAge(birthday));
	}
	public static int calculateAge(LocalDate birthday)
	{
		LocalDate today=LocalDate.now();
		int  p=Period.between(birthday,today).getYears();
		return p;
	}
}
