package src.ucsdcse12pa5student;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ClassPartitioner implements Partitioner{
	public static String[] makeRandomArr(int size){
		String[] randomArr = new String[size];
		for(int i = 0; i < size; i++){
			randomArr[i] = Integer.toString(ThreadLocalRandom.current().nextInt(-10, 11));
		}
		return randomArr;
	}	

	public static void swap(String[] array, int i1, int i2) {
		String temp = array[i1];
	        array[i1] = array[i2];
	        array[i2] = temp;
	}
	public int partition(String[] array, int low, int high) {
		if(low == high){
        	    return low;
                }
                int pivotIndex = high - 1;
		String pivot = array[pivotIndex];
		int smallerBeforeIndex = low;
		int largerAfterIndex = high - 2;
		while(largerAfterIndex >= smallerBeforeIndex) {
			if(Integer.parseInt(array[smallerBeforeIndex]) > Integer.parseInt(pivot)) {
				swap(array, smallerBeforeIndex, largerAfterIndex);
		                largerAfterIndex -= 1;
		        }
		        else {
		                smallerBeforeIndex += 1;
		        }
		}
		    
		if(Integer.parseInt(array[smallerBeforeIndex]) < Integer.parseInt(pivot)){
		   	swap(array, smallerBeforeIndex + 1, pivotIndex);
		   	System.out.println("array after: " + Arrays.toString(array));
		   	System.out.println("pivot moved to index " + (smallerBeforeIndex + 1) + "\n");
		   	return smallerBeforeIndex + 1;
		}
		else{
		   	swap(array, smallerBeforeIndex, pivotIndex);
		   	System.out.println("array after: " + Arrays.toString(array));
		   	System.out.println("pivot moved to index " + (smallerBeforeIndex) + "\n");
		   	return smallerBeforeIndex;
		}
	}
	
	public static void main(String[] args){
		ClassPartitioner partitioner = new ClassPartitioner();
		String[] smallArr = {"4", "9", "-3", "4", "2", "1"}; 
		String[] repeatedArr = {"7", "7", "7", "7", "7", "7", "7", "7", "7", "7"};
		String[] singleElementArr = {"-2"};
				
		System.out.println("small array before: " + Arrays.toString(smallArr));
		partitioner.partition(smallArr, 0, smallArr.length);
				
		System.out.println("repeated array before: " + Arrays.toString(repeatedArr));
		partitioner.partition(repeatedArr, 0, repeatedArr.length);
				
		System.out.println("single element array before: " + Arrays.toString(singleElementArr));
		partitioner.partition(singleElementArr, 0, singleElementArr.length);
			
		for(int i = 0; i < 5; i++){
			String[] randomArr = makeRandomArr(10);
			System.out.println("random array before: " + Arrays.toString(randomArr));
			partitioner.partition(randomArr, 0, randomArr.length);
		}
	}
}
