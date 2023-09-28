package packOne;	

public class Array {
	     
	    
	    public static void main(String[] args) {
	    	int [] Arr = {2,3,4,5,6};
	    	int [] ar = new int[4];
	    	ar[0]=1;
	    	ar[1]=2;
	    	ar[2]=3;
	    	ar[3]=5;
	    	for (int i=0; i<Arr.length; i++){
	        System.out.print(Arr[i]+" ");
	    	}
	        System.out.println(ar[3]);
	        
	        String [] ar1 = {"Pratik","kadam"};
	        for (String p:ar1) {
	        	System.out.println(p);
	        }
	        
	        int [] p = {2,3,4,5,6,7,8};
	        for (int i=0; i<p.length; i++) {
	        	if (p[i] % 2==0) {
	        		System.out.print(p[i]);
	        		break; //Condition satisfied so not checked other int
	        	}else {
	        		System.out.print(p[i]);
	        	}
	        }
	    }
	}

