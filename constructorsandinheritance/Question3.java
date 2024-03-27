package constructorsandinheritance;

class Zsgs
{
	protected String incubationId;
	
	Zsgs(String incubationId)
	{
		this.incubationId=incubationId;
	}
	
	
	
}

class Student extends Zsgs
{

	private String name;
	
	private String phoneno;
	
	private String mailId;
	
	public Student(String incubationId, String name, String phoneno, String mailId) {
		super(incubationId);
		this.name = name;
		this.phoneno = phoneno;
		this.mailId = mailId;

	}

    public void display()
    {
    	System.out.println("INCUBATION ID:"+incubationId+"\nSTUDENT NAME:"+name+"\nPHONENO"+phoneno+"\nMAILID"+mailId);
    }
	
}

public class Question3 {
	
	public static void main(String[] args)
	{
		Student student=new Student("1234","praveen","9828289384","Prav@gmail.com");
		student.display();
	
	}


}
