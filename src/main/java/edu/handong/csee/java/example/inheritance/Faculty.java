package edu.handong.csee.java.example.inheritance;

public class Faculty extends Student{
	private int level;
	public Faculty() {
		super();
		level = 1;
	}
	public Faculty(String initial_name, int initial_num, int initial_level) {
		super(initial_name, initial_num);
		setLevel(initial_level);
	}
	

	public void reset(String newName, int newStudentNumber, int newLevel) { 
		reset(newName, newStudentNumber); //Student's reset        
		setLevel(newLevel); //Checks 1 <= newLevel <= 4    
	}

	public int getLevel() {
		return level;    
	} 
	
	public void setLevel(int newLevel)    {
		if ((1 <= newLevel) && (newLevel <= 4))           
			level = newLevel;
		else {
			System.out.println("Illegal level!");            
			System.exit(0);       
		}    
	} 
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student level:"+level);
	}

	public boolean equals(Faculty otherFaculty) { 
		return equals((Student)otherFaculty) && (this.level == otherFaculty.level);    
	} 
}
