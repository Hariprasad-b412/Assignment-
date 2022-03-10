
public class Student {

		  String firstName;
		  String lastName;
		  int age;

  
		  public Student(){
		      firstName = "john";
		      lastName = "doe";
		      age = 25;
		  }
		  
		  public void Student(String firstName,String lastName,int age,float percentage)
		  {
			  firstName="mohan";
			  lastName="raj";
			  age=15;
			  percentage=20;
		  }
		  
		  public static void main(String args[]) {
		      Student myStudent = new Student();
		      System.out.println(myStudent.firstName);
		      
		  }
		}

