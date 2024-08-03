package first;

public abstract class shape {
	private int length;
	private  int width;
	private int height;
	shape(int l,int w, int h){
		length=l;
		width=w;
		height=h;
	}
	shape(int l){
		length=l;
		

	}

	
	  public int getlength() {
		  return length;
	  }
	  
	  public int getwidth() {
		  return width;
	  }
	  public int getheight() {
		  return height;
	  }
	  public  void setlength(int l) {
		  length=l;
	  }
 abstract int area();
 

}

class square extends shape{
	


	square(int l) {
		super(l);
		
	

	}
	int area(){
		
		// TODO Auto-generated method stub
		return getlength()*4;
	}
}
class triangle extends shape{
	triangle(int a,int b,int c){
		
	
	super(a,b,c);
	 }
	int area() {
		System.out.println();
		return (getlength()*getheight()*getwidth());
	}
}