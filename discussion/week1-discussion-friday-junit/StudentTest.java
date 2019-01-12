//A reference implementation of a couple example JUnit tests for testing addCourse (for Alex and Sophia)
import java.util.Collection;
import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StudentTest{
	public static Collection<Object[]> STUDENTNUMS =
			Arrays.asList(new Object[][] { {'A'}, {'B'}, {'C'} });
	private int studentType;

	public StudentTest(char studentType) {
		super();
		this.studentType = studentType;
	}
	
	//Helper method to check whether two course lists have same course names
	public static boolean correctCourseList(Course[] expected, Course[] returned){
		if(expected.length != returned.length){
			return false;
		}
		
		for(int i = 0; i < expected.length; i++){
			int count = 0;
			for(int j = 0; j < returned.length; j++){
				if(expected[i].isEqualTo(returned[j])){
					count++;
				}
			}
			if(count != 1){
				return false;
			}
		}
		return true;
	}

	@Parameterized.Parameters(name = "Student{0}")
	public static Collection<Object[]> students() {
		return STUDENTNUMS;
	}
		
	private Student makeStudent(String name, Course[] courses) {
		switch(this.studentType) {
			case 'A': return new StudentA(name, courses);
			case 'B': return new StudentB(name, courses);
			case 'C': return new StudentC(name, courses);
		}
		return null;
	}

	//Some possible JUnit tests below	
	@Test
	public void addedHasCount1() {
		String n = "Alex";
		Course[] courses = {};
		Student studentToTest = makeStudent(n, courses);

		studentToTest.addCourse(new Course("CSE12"));
		assertEquals(1, studentToTest.getCourses().length);
	}
	
	@Test
	public void cantAddDuplicate() {
		String n = "Sophia";
		Course[] courses = {new Course("CSE12"), new Course("CSE15L")};
		Student studentToTest = makeStudent(n, courses);
		
		Course test = new Course("CSE12");
		studentToTest.addCourse(test);
		assertEquals(true, correctCourseList(courses, studentToTest.getCourses()));
	}

	@Test
	public void addReturnsCorrectCourselist() {
		String n = "Sophia";
		Course[] courses = {new Course("CSE12"), new Course("CSE15L")};
		Student studentToTest = makeStudent(n, courses);
		
		Course test = new Course("CSE20");
		studentToTest.addCourse(test);
		Course[] updated = {courses[0], courses[1], test};

		assertEquals(true, correctCourseList(updated, studentToTest.getCourses()));
	}
}
