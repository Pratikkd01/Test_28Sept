package packOne;

public class CreateMethod1 {
	public static void main(String[] args) {
		CreateMethod1 a = new CreateMethod1();
		String text = a.getdata();
		System.out.println(text);
	//	CreateMethod2 b =new CreateMethod2();
		CreateMethod2.getUserdata();
//		System.out.println(b);
		getdataone();
		
	}
	
	public String getdata() {
		System.out.println("Hello");
		return "Pratik Kadam";	
	}
	public static String getdataone() {
		System.out.println("Hello of method one");
		return "Pratik Kadam";	
	}

}
