package com.gqt.arrayproj.package1;
import java.util.Scanner;
public class arrayscode2 {
/*
 * class         students
 * 0				5
 * 1				5
 * 2				5
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of the class: ");
		int cls = sc.nextInt();
		System.out.print("Enter the count of the student: ");
		int stu = sc.nextInt();
		int arr[][] = new int[cls][stu];
		
		//storing;
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class:  "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of student:  "+(j+1));
				arr[i][j] = sc.nextInt();
				
	
			}
		}
		System.out.println("-----------MARKS----------");
		// fecthing
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class:  "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of the student: "+(j+1)+"is:"+arr[i][j]);
			}
		}
		

	}

}
