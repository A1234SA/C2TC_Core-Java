
public class FORWhileDoWhileLoop {

	public static void main(String[] args) {
		 // for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }


		  // while loop 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
		// Do while loop
			int x = 1,y = 1;
			do {
				x++;
			    y++;
				System.out.println("i=" + x + " and j=" + y);
			    } while (x < 10 || y < 10);
	}

}
