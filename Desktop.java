package week3.day2;

public abstract class Desktop implements Software {
	public int softRes()
	{
	return 65;	
	}
			
	public float DesktopModelRAM()
	{
	return 143.1f;	
	}
	public static void main(String[] args) {
		Dell Obj=new Dell();
		int s=Obj.softRes();
		System.out.println("No of software installed is:" +s);
		
		Dell Obj1=new Dell();
		float M=Obj1.DesktopModelRAM();
		System.out.println("Model Number is:" +M);
	}

}
