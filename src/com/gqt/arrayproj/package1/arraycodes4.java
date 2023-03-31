package com.gqt.arrayproj.package1;
import java.util.Scanner;
//tryed jagged array
public class arraycodes4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total no.of students:   ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of the student no: "+(i+1));
			arr[i] =sc.nextInt();
		}
		System.out.println("-------MARKS----------");
		for(int i=0;i<n;i++) {
			System.out.println(" the marks of the student no: "+(i+1)+"is: "+arr[i]);
		}
	}

}


