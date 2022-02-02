package com.hcl.studentrecord;
import java.util.Scanner;
public class Student {
public static void main (String[] args) {
	Scanner studentEntry = new Scanner (System.in);
	System.out.println ("Student name: ");
	String name = studentEntry.nextLine();
	System.out.println ("Student ID: ");
	int studentID = studentEntry.nextInt();
	System.out.println ("Student score: ");
	try {
	int score = studentEntry.nextInt();
	if (score < 0 || score > 100) {
		throw new InvalidScoreException();
	}
} catch (InvalidScoreException e) {
	System.out.println (e.getMessage());
}
}
}