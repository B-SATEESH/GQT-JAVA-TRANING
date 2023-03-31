package gqtcodes;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==(n/2) || i==(n/2) && j<=(n/2) || i==0 && j<=(n/2)) {
				System.out.print("$ ");	
				}
				else {
				System.out.print("  ");
			}
				
		}
			System.out.println();	

	}

}
}
/*
public class program2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==(n/2) || i==(n/2) && j<=(n/2)) {
				System.out.print("H");	
				}
				else {
				System.out.print(" ");
				}
				
		}
			System.out.println();	

	}

}
}
Enter the value: 11
H    H     
H    H     
H    H     
H    H     
H    H     
HHHHHH     
H    H     
H    H     
H    H     
H    H     
H    H  


public class program2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==(n/4) 
						|| i==0 && j<=(n/2)
						|| (i==(n-1) && i<=(n/4))
						|| j==0 && i>=(3*n/4)) {
				System.out.print("H");	
				}
				else {
				System.out.print(" ");
				}
				
		}
			System.out.println();	

	}

}
}
Enter the value: 11
HHHHHH     
  H        
  H        
  H        
  H        
  H        
  H        
  H        
H H        
H H        
H H        







public class program2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j!=0 && j<(n/2)
						|| i==(n/2) && j!=0 && j<(n/2)
						|| i==(n-1) && j!=0 && j<(n/2)
						|| j==0 && i!=0 && i!=(n-1)
						|| j==(n/2) && i!=0 && i!=(n/2) && i!=(n-1)) {
				System.out.print("*");	
				}
				else {
				System.out.print(" ");
				}
				
		}
		
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j!=0 && j<(n/2)							
						|| i==(n/2) && j!=0 && j<(n/2)
							|| i==(n-1) && j!=0 && j<(n/2)
							|| j==0 && i!=0 && i<=(n/2)
							|| j==(n/2) && i>(n/2) && i!=(n-1)
							
							) {
				System.out.print("*");	
				}
				else {
				System.out.print(" ");
				}					
		}
		
		
			for(int j=0;j<=n-1;j++) {
			    if(j==0 && i!=0 
						|| i==0 && j!=0 && j<(n/2)
						|| i==(n/2) && j!=0 && j<(n/2)
						|| j==(n/2) && i!=0 && i<(n/2)
						|| i==j && j>(n/2)
						) {
			    System.out.print("*");	
			    }
			    else {
			    System.out.print(" ");
			    }					
	    }
	
	   System.out.println();	
	   }
}
}
/*
Enter the value: 20
 *********           *********           *********          
*         *         *                   *         *         
*         *         *                   *         *         
*         *         *                   *         *         
*         *         *                   *         *         
*         *         *                   *         *         
*         *         *                   *         *         
*         *         *                   *         *         
*         *         *                   *         *         
*         *         *                   *         *         
**********          **********          **********          
*         *                   *         *          *        
*         *                   *         *           *       
*         *                   *         *            *      
*         *                   *         *             *     
*         *                   *         *              *    
*         *                   *         *               *   
*         *                   *         *                *  
*         *                   *         *                 * 
 *********           *********          *                  *




/*public class program2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0 && i!=0
						|| i==j && i<(n/2) 
						|| i+j==(n-1) && j>(n/2)
						|| j==(n-1) && i!=0) {
				System.out.print("*");	
				}
				else {
				System.out.print(" ");
				}
				
		}
		System.out.print("    ");
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j!=0 
						|| j==0 && i!=0
						|| i==(n-1) && j<(n/2)
						|| j==(n/2) && i>(n/2)
						|| i==(n/2) && j>(n/2)
						|| j==(n-1) && i>(n/2)
						
							
							) {
				System.out.print("*");	
				}
				else {
				System.out.print(" ");
				}					
		}
		
		System.out.print("     ");
			for(int j=0;j<=n-1;j++) {
			    if(j==0 && i!=0 
						|| i==0 && j!=0 
						|| i==(n/2) && j!=0 
						|| j==(n-1) && i!=0 && i<(n/2)
						|| i==j && j>(n/2)
						) {
			    System.out.print("*");	
			    }
			    else {
			    System.out.print(" ");
			    }					
	    }
	
	   System.out.println();	
	   }
}
}

*/

