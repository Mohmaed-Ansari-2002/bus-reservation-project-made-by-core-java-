package first;

public class ded {
	
	    public static void main(String[] args) {
	        printWelcomeMessageInBox("Welcome to Java Programming!");
	    }
	    
	    public static void printWelcomeMessageInBox(String message) {
	        int length = message.length();
	        printLine(length + 4);
	        System.out.println("| " + message + " |");
	        printLine(length + 4);
	    }
	    
	    public static void printLine(int length) {
	        for (int i = 0; i < length; i++) {
	            System.out.print("-");
	        }
	        System.out.println(" ");
	    }
	}


