package first;
class box{
	int length;
	int height;
	int width;


 int surfaceArea() {
	 
 int l=length;
 int h=height;
 int w= width;
 return(2*(l*h)+2*(l*w)+2*(h*w));
 }
}
public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		box woodBox=new box();
		woodBox.length=12;
		woodBox.width=11;
		woodBox.height=8;
		
		System.out.println(woodBox.surfaceArea());
		

	}

}
