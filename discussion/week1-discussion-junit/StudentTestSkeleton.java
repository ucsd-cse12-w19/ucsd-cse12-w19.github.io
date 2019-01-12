//Skeleton framework for students to help us build a test or two
//Mimics skeleton framework for BasketTest.java in pa1
import java.util.Collection;
import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StudentTestSkeleton{
	public static Collection<Object[]> STUDENTNUMS =
			Arrays.asList(new Object[][] { {'A'}, {'B'}, {'C'} });
	private int studentType;

	public StudentTestSkeleton(char studentType) {
		super();
		this.studentType = studentType;
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
		
	//Implement JUnit tests below...
	@Test
	public void someTest() {
		assertEquals(true, false);
	}
}
