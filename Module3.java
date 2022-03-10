import java.util.*;
import java.util.Scanner;

public class Module3
{
     
     public  String name;
     public String uni_id;
     public String uni;
     public int sem;
     
     Module3(String name, String uni_id, String uni,int sem)
     {
    	 this.name=name;
    	 this.uni_id=uni_id;
    	 this.uni=uni;
    	 this.sem=sem;
     }
     public String getName()
     {
    	 return name;
     }
     public String getUni_id()
     {
    	 return uni_id;
     }
     public String getUnu()
     {
    	 return uni;
     }
     public int getSem()
     {
    	 return sem; 
     }
     
     
}
class CRUDDemo1
{
	public static void main(String args[])
	{
		Collection<Module3> c=new ArrayList<Module3>();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do
		{
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			
			System.out.println("Enter Your Choice : ");
			ch=sc.nextInt();
			
			switch (ch)
			{
			case 1:
				System.out.println("Enter Name : ");
				String name=sc.nextLine();
				System.out.println("Enter Univercity ID : ");
				String uni_id=sc.nextLine();
				System.out.println("Enter User ID : ");
				String uni=sc.nextLine();
				System.out.println("Enter Semester :");
				int sem=sc.nextInt();
			break;
			
			case 2:
				System.out.println(c);
				break;
			}
			
		}
		while(ch!=0); 
	}
}
