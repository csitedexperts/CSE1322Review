package constructor;
public class Student
  {
  public int  Roll;	
  public String Name;
  public float Mark;	
  
  public Student()  	// Default Constructor
   {
   Roll = 318;
   Name = "Mokter"; 
   Mark = 95.5F;
  }

  Student(int R, String N, float M)  // Argumented Constructor
   {
   Roll = R;
   Name = N; 
   Mark = M;
   }
Student(Student S)	// Copy Constructor
  {     
   Roll = S.Roll ; 
   Name = S.Name ; 
   Mark = S.Mark;
  }   	// Copy Constructor Defined

 void display()
   {
   System.out.println("Roll is : " +Roll);                 
   System.out.println("Name is : " +Name);
   System.out.println("Mark is : " +Mark);
   }

 
	
  }  
