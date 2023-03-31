package com.gqt.arrayproj.package1;
import java.util.Scanner;
public class arraycode3 {
/* [i]				[j]			[k]
 * school        class         students
 * 0				0				3
 * 					1				3
 * 					2				3
 * 1				0				3
 * 					1				3			
 * 					2				3
 * 2				0				3
 * 					1				3			
 * 					2				3
 * 
 
 *  
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of the School: ");
		int school = sc.nextInt();
		System.out.print("Enter the count of the class in each school; ");
		int clas = sc.nextInt();
		System.out.print("Enter the count of the students in each class:  ");
		int student =sc.nextInt();
		int arr[][][] = new int[school][clas][student];
		
		//storing
	
		
		for(int i=0;i<school;i++) {
			System.out.print("Inside the School:  "+(i+1));
			for(int j=0;j<clas;j++) {
				System.out.print("Inside the class: "+(j+1));
				for(int k=0;k<student;k++) {
				System.out.print("Enter the marks of the student: "+(k+1));
				arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("------------MARKS------------");
		//fecting
		for(int i=0;i<school;i++) {
			System.out.println("Inside the School:  "+(i+1));
			for(int j=0;j<clas;j++) {
				System.out.println("Inside the class:  "+(j+1));
				for(int k=0;k<student;k++) {
				System.out.println("Enter the marks of the student:  "+(k+1)+"is:"+arr[i][j][k]);
				}
			}
		
	}
	
	
	
}
}
