Q4. Create pascal triangle using 2D arrary

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8


package training_java;

import java.util.Scanner;
public class pattern2DArray {

	public static void main(String args[]) {
		int n,i,j,a[][],s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of steps:");
		n=sc.nextInt();
		s=n-1;
		a=new int[n][n];
		for(i=0;i<n;i++) {
			a[i][i]=a[i][0]=1;
		}
		for(i=0;i<n;i++) {
			for(j=1;j<i;j++) {
					a[i][j]=a[i-1][j-1]+a[i-1][j];		
			}
		}
		System.out.println("OUTPUT");
		for(i=0;i<n;i++) {
			for(j=0;j<s;j++)
				System.out.print(" ");
			s--;
			for(j=0;j<=i;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		sc.close();		
	}
	
}