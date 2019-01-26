package cse12pa3student;

//This is an example of some dummy implementations
//so that TestSolvers.java compiles and you can
//implement your methods incrementally. These
//dummy implementations do nothing meaningful.

/*
 * Class to implement SearchWorklist as a Stack and a Queue.
 * You can use any built-in Java collections for this class.
 */

//Dummy version of StackWorklist class so things first compile
class StackWorklist implements SearchWorklist {
	public void add(Square c){
		return;
	}
	public Square remove(){
		return new Square(0, 0, false);
	}
	public boolean isEmpty(){
		return false;
	}
}

//Dummy version of QueueWorklist class so things first compile
class QueueWorklist implements SearchWorklist {
	public void add(Square c){
		return;
	}
	public Square remove(){
		return new Square(0, 0, false);
	}
	public boolean isEmpty(){
		return false;
	}
}

public interface SearchWorklist {
	void add(Square c);
	Square remove();
	boolean isEmpty();
}
