//An implementation that fails addReturnsCorrectCourselist test
public class StudentA implements Student{
	private String name;
	private Course[] courses;

	public StudentA(String name, Course[] courses){
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
		
		for(int i = 0; i < size - 1; i++){
    			newCourseList[i] = courses[i];
		}
		courses = newCourseList;
		//logic error: forgot to add new course to courses
		return;
	}
}
