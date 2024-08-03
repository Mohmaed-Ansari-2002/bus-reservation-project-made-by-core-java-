package first;

public class newi {
	
	    public static void main(String[] args) {
	        int n = 5;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                System.out.println("*");
	                continue;
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}


