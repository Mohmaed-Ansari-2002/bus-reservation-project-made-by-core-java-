package first;
import java.util.*;


public class methodover {

	  static double findavg(double a,double b) {
		 return (a+b)/2;
	 }
	  
	  static double findavg(double a,double b,double c) {
		  return(a+b+c)/3;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(findavg(1,2));

System.out.println(findavg(1,2,3));


	}

}
