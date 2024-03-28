
public class Member_method {
 
		private String Brand1;
		private String Brand2;
  
		Member_method(String Brand1,String Brand2){
			this.Brand1=Brand1;
			this.Brand2=Brand2;
		}
		
		public void Displydetail() {
			System.out.println("Brand1"+Brand1);
			System.out.println("Brand2"+Brand2);
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_method myobj=new Member_method("Sathiash","Kumar");
		myobj.Displydetail();
		

	}

}
