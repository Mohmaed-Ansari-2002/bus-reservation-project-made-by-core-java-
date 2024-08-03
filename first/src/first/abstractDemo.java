package first;

public class abstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape s1=new square(5);
shape s2=new triangle(12,3,5);
shape s3=new triangle(12,5,5);
shape s4=new square(5);

shape[] s=new shape[4];
s[0]=new square(5);
s[1]=new triangle(5,4,12);
s[2]=new square(5);
s[3]=new triangle(5,12,3);
	
	for(shape se:s) {
		System.out.println(se.area());
	}

}}
