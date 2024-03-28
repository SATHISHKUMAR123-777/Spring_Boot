package ferfgf;

public class Basic {
	
	void m1() {
		int first=0,second=1,third;
		
		
		
//		System.out.println(third);
		
		for(int i=0;i<5;i++) {
			if(first==2) {
				break;
			}
			third=first+second;
			first=second;
			second=third;
			System.out.println(first);
		}
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic Obj=new Basic();
		Obj.m1();

	}

}
