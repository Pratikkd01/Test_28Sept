package packOne;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Pratik Pradip Kadam";
		String s1 =new String("Hello welcome");
		String[] name = s.split(" ");
		System.out.println(name[0]);
		String[] a = s.split("Pradip");
		System.out.println(a[1].trim());   //remove spaces in string
		
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
		}
	}

