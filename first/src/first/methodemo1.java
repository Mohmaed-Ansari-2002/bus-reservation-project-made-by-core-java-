package first;

public class methodemo1 {
static boolean twoDigitOrNot(int a) {
	if (a>9 && a<99) {
		System.out.println("two didigit");
	return true;}
	 if(a>99) {
		
	System.out.println("this num moretha two digit");
	return false;
	}
	

	else {
		System.out.println("its not two digiy");
	}
	return false; 
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(twoDigitOrNot(900));
	}

}
