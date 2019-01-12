//An implementation that fails cantAddDuplicate and addReturnsCorrectCourselist tests
public class StudentB implements Student{
	private String name;
	private Course[] courses;

	public StudentB(String name, Course[] courses){
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
			//.equals compares object references
			if(course.equals(courses[i])){
				return;
			}
		}
		
	        int i;
		for(i = 0; i < size - 1; i++){
			//logic error - fills whole course list with new course
    			newCourseList[i] = course;
		}
		newCourseList[i] = course;
		courses = newCourseList;
		
		return;
	}
}
