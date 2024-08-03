package first;
class user{
	String name;
	int age;
	String  dep;
}

class book{
	String authuoeName;
	int remanCop;
	
}

class remainder{
	String messagae;
}
public class objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		user user1= new user();
		user1.name="mohamed ansari";
		user1.age=20;
		user1.dep="MCA";
		 
		System.out.println(user1.name);
		
		
		book book1=new book();
	
		book1.remanCop=20;
		System.out.println(user1.name +" "+ book1.remanCop);
	}

}
