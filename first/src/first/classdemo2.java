package first;
class student{
	String name;
	int rollNo;
	int mark[][]=new int[6][7];
	
	 int markTotal() {
		 int sum=0;
		 for(int[] x: mark)
			for (int element:x)
				sum=sum+element;
		 return sum;}
	 student(String name, int rollNo){
		 this.name = name;
	        this.rollNo = rollNo;
	 }
	 
		  
	 public student(String name, int rollNo, int[][] mark) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.mark = mark;
	 }
	 void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Total Marks: " + markTotal());
	        System.out.println("\n");
	    }
	 
}



public class classdemo2 {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
student student1=new student();
student1.name="mohamed";
student1.rollNo=8010;
student1.mark[0][0]=95;
student1.mark[0][1]=93;
student1.mark[0][2]=94;
student1.mark[0][3]=93;

student student2=new student();
student2.name="ansari";
student2.rollNo=8011;
student2.mark[1][0]=85;
student2.mark[1][1]=83;
student2.mark[1][2]=99;
student2.mark[1][3]=95;




student student3=new student();
student3.name="moh";
student3.rollNo=80111;
student1.mark[2][0]=99;





student student4=new student();
student4.name="mohamed ansari";
student4.rollNo=812300017;
student4.mark[3][0]=100;*/

		 int[][] marks1 = {
		            {95, 93, 94, 93, 99, 66, 40},
		           
		 } ;
		        student student1 = new student("mohamed", 8010, marks1);


		        int[][] marks3 = {
		                {99, 0, 0, 0},
		                {0, 88, 0, 0},
		                {0, 0, 0, 0},
		                {0, 0, 0, 0},
		                {0, 0, 0, 0},
		                {0, 0, 0, 0}
		            };
		            student student3 = new student("moh", 80111,marks3);

student3.display();
student1.display();
	}

}
