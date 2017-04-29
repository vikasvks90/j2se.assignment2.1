package Assignment2;

public class Pattern {

	public static void main(String[] args) {
		
		for (int row=1; row<6; row++)  //outer loop for rows
        {  
            for (int col=1; col<6; col++)//inner loop for columns 
            {  
                if (row == col)  
                  System.out.print("*");  
                if (row == 1 && col == 5)  
                  System.out.print("*");   
                if (row == 2 && col == 4)  
                 System.out.print("*");
                if (row == 4 && col == 2)  
                 System.out.print("*");    
                if (row == 5 && col == 1)  
                 System.out.print("*");  
                else  
                  System.out.print(" "); //print blank space

            }
            System.out.println();  //introducing new line
    }

	}

}
