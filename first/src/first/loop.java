package first;
import java.util.*;
public class loop {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter any num:");
	int n = sc.nextInt();
	for( ;n>0;n--) {
		if(n%10==0) {
		System.out.println(n);	
		
		}
		else System.out.println("is not divisible by ten");
	break;
}
}
}