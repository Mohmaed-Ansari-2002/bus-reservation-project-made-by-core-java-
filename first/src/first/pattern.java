package first;
import java.util.*;
public class pattern {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	l1:
	for( int i=1;i<=5;i++) {
	l2:
		for(int j=1;j<=5;j++) {	
		if(i==2 && j==2 && j==3 && j==4 && j==5) 
			  continue ;
		
		System.out.print("*");
	}
	System.out.print("\n");
	}
}
}
