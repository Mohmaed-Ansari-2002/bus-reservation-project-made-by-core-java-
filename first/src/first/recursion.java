package first;

public class recursion {
  static int fibonacci(int a) {
	  if(a==0) 
		  return 0;
	  return a+fibonacci(a-1);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;

System.out.println();
System.out.println(fibonacci(a));
	}

}
