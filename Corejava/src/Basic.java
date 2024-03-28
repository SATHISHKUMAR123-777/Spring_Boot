import java.util.Scanner;

class Main {
    void myMethod() {
    	for(int i=0;i<5;i++) {
    		for(int j=i;j<5;j--) {
    			System.out.print("*");
    		}
    		System.out.println("");
    	}
	  
    System.out.println("Welcome to all!");
    
  }
    
    void mymethod2() {
    	Scanner Sc=new Scanner(System.in);
    	System.out.println("Enter the number1");
    	int a=Sc.nextInt();
    	int b=Sc.nextInt();
    	int c=a+b;
    	System.out.println("result"+c);
    }
    
    
    void mymethod3() {
    	int a=10;
    	int b=20;
    	int c=340;
    	int bignumbers;
    	if(a>=b&&a>=c) {
    		bignumbers=a;
    	}
    	else if(b>=a&&b>=c) {
    		bignumbers=b;
    	}
    	else {
    		bignumbers=c;
    	}
    	System.out.println("result"+bignumbers);
    }
//    void myMethod1() {
//    	
//    	int count=5,p;
//    	p=count++;
//    	System.out.println(count);
//    	
//    	System.out.println(p);
//    	
//    	 Scanner Sc=new Scanner(System.in);
//    	 System.out.println("Enter the Numbers");
//    	 int a=Sc.nextInt();
//    	 int b=Sc.nextInt();
//    	 System.out.println(a+b);
//   
//    }
  
}  
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Main b=new Main();
//		b.myMethod();
//		b.mymethod2();
//		b.myMethod1();
		b.mymethod3();
	}

}
   
