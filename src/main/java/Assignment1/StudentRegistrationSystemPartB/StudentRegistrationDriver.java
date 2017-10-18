package Assignment1.StudentRegistrationSystemPartB;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import Assignment1.StudentRegistrationSystemPartA.CourseDetails;
import Assignment1.StudentRegistrationSystemPartA.ModuleDetails;
import Assignment1.StudentRegistrationSystemPartA.StudentDetails;

public class StudentRegistrationDriver {

		public static void main(String[] args){
	        
	        StudentDetails harry = new StudentDetails("harry green", 21);
	        StudentDetails henry = new StudentDetails("henry ford", 22);
	        StudentDetails sarah = new StudentDetails("sarah butler", 20);
	        
	        ModuleDetails m1 = new  ModuleDetails("Modern Information Management", "CT411");
	        ModuleDetails m2 = new  ModuleDetails("Systems Modelling and Simulation", "CT423");
	        ModuleDetails m3 = new  ModuleDetails("Software Engineering III", "CT435");
	        
	        ModuleDetails ct411 = new ModuleDetails("Modern Information Management", "CT411");
	        ct411.addStudent(henry);
	        ct411.addStudent(sarah);
	        
	        ModuleDetails ct423 = new ModuleDetails("Systems Modelling and Simulation", "CT423");
	        ct423.addStudent(harry);
	        ct423.addStudent(sarah);
	        
	        ModuleDetails ct435 = new ModuleDetails("Software Engineering III", "CT435");
	        ct435.addStudent(harry);
	        ct435.addStudent(henry);
	        
	        ArrayList<ModuleDetails> modules = new ArrayList<ModuleDetails>();
	        modules.add(m1);modules.add(m2);modules.add(m3);
	        
	        CourseDetails gy350 = new CourseDetails("Computer Science", modules, new LocalDate(2014, 9, 1), new LocalDate(2018, 5, 31));
	        gy350.addModule(ct411);
	        gy350.addModule(ct423);
	        gy350.addModule(ct435);
	        

	        System.out.println("Course Name: "+gy350.getCourseName());
	        for (ModuleDetails mod : gy350.getListOfModules()){
	        	System.out.println("Module Name: " + mod.getModuleName());
	        	System.out.println("List of Students Registered: ");
	        	for (StudentDetails stud : mod. getListOfStudents()){
	        		System.out.println(stud.getName());
	        	}
	        }
		}
	}

