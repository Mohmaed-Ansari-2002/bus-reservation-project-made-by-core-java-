package first;

public class stack {
char a[]=new char[10];
int tos;


 stack() {
	 tos=-1;
	 
 }
void push(char i){
	if (tos==9) {
		System.out.println("stack is full");
	}
	 a[++tos]=i;
 }
 char  pop() {
	 if(tos<0) {
		 System.out.println("stack is empty");
	 }
	  return a[tos--];
			 }
}
