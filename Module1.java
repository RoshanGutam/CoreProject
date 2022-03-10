import java.util.Scanner;

public class Module1
{
    String name,fname,uni_id,uid;   
    int sem;
    
    public void getdata(String name,String uni_id,String uni,int sem)         
    {
       this.name=name;
       this.uni_id=uni_id;
       this.uid=uid;
       this.sem=sem;
       
    }
    
    public void setdata()
    {
    	System.out.println(" Student Name : "+name);
    	System.out.println(" University ID :"+uni_id);
    	System.out.println(" User ID :"+uid);
    	System.out.println(" Semister :"+sem);
    	
    }
	
}
class CRUDDemo
{
	//public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 int ch =0;
		 do 
		 {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			
			System.out.println("Enter your choice: ");
		 }while(ch!=0);
	}
}
