public class Course{
	private String name;

	public Course(String name){
    		this.name = name;
	}
	
	public String getName(){
    		return this.name;
	}
	
	public boolean isEqualTo(Course other){
		try{
			if(this.name.equals(other.name)){
				return true;
			}
			else{
				return false;
			}
		}catch(NullPointerException e){
			System.out.println(e);
			return false;
		}
	}
}
