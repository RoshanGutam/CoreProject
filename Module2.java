
public class Module2 
{
	public void input()
	{
		System.out.println("The Avaliable Books Depertment are : ");
	}
	

	 public void Computer()
	 {
		 System.out.println(" ");
		 String Comp[]= {"1. JAva","2. C Programming","3. ANCIT","4. Python"};
		 
		 System.out.println("The Booke Avaliable in Computer Language Depertment are as Follows \n");
		 
		 
		 for(int i=0;i< Comp.length;i++)
		 {
			System.out.println(Comp[i]);  
		 }
		 
	 }
	 
	 public void Civil()
	 {
		 System.out.println(" ");
		String Civ[]= {"1. Civil","2. Construction","3. BMC","4. CCD"};
	    System.out.println("The Booke Avaliable in Civil Depertment are as Follows \n");
		 
	    for(int i=0;i< Civ.length;i++)
	    {
	    	System.out.println(Civ[i]);
	    }
		
	 }
	 
	 public void Physics()
	 {
		 System.out.println(" ");
		 String Phy[]= {"1. Mechanics","2. Dynemics","3. Solid State Physics","4. Gravity"};
		 System.out.println("The Booke Avaliable in Physics Depertment are as Follows \n");
		 
		 for(int i=0;i< Phy.length;i++)
		 {
			 System.out.println(Phy[i]);
		 }
	 }
	 
	 public void Electrical()
	 {
		 System.out.println(" ");
		 String Ele[]= {"1. Electrical Wiring","2. Basic Electrical Engineering","3. Power Systems","4. Electrical Motors"};
		 
		 System.out.println("The Books Avaliable in Electrical Depertment are as Follows \n");
		 
		 for(int i=0;i< Ele.length;i++)
		 {
			 System.out.println(Ele[i]);
		 }
	 }

}
