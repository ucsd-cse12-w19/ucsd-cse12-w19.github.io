//An implementation that passes all three tests in StudentTest.java
public class StudentC implements Student{
	private String name;
	private Course[] courses;

	public StudentC(String name, Course[] courses){
    		this.name = name;
    		this.courses = courses;
	}
	
	public String getName(){
		return name;
	}
	
	public Course[] getCourses(){
		return courses;
	}
	
	public void addCourse(Course course){
		int size = courses.length + 1;
		Course[] newCourseList = new Course[size];

		for(int i = 0; i < courses.length; i++){
			if(course.isEqualTo(courses[i])){
				return;
			}
		}
		
        	int i;
		for(i = 0; i < size - 1; i++){
    			newCourseList[i] = courses[i];
		}
		newCourseList[i] = course;
		courses = newCourseList;
	}
}
