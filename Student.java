package springdemo.java.roy;

public class Student 
{
	    int RollNo;
		String StudentName;
	
		//setter method of RollNo
		public void setRollNo(int rollNo) 
		{
		RollNo = rollNo;
		}
		
		//setter method of StudentName
		public void setStudentName(String studentName) 
		{
		StudentName = studentName;
		}

        public void DisplayStudent()
		{
		 System.out.println("Student Name is:"+ StudentName + "\nStudent Roll no is:"+ RollNo);
		}	
}
