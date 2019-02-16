import java.io.IOException;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

class FileIO {
	public static File[] getEntries(File f){
		return f.listFiles();
	}
	public static void printEntries(File f){
		File[] entries = getEntries(f);
		System.out.println("The entries in " + f.getName() + " are:");
		for(int i = 0; i < entries.length; i++){
			System.out.println(entries[i].getName());
		}
		System.out.println("");
	}
	public static ArrayList<File> getSubfiles(File f){
		File[] entries = f.listFiles();
		ArrayList<File> subfiles = new ArrayList<>();
		for (int i = 0; i < entries.length; i++) {
			  if (entries[i].isFile()) {
				  subfiles.add(entries[i]);
			  }
		}
		return subfiles;
	}
	public static void printSubfiles(File f){
		ArrayList<File> subfiles = getSubfiles(f);
		System.out.println("The files in " + f.getName() + " are:");
		for(int i = 0; i < subfiles.size(); i++){
			System.out.println(subfiles.get(i).getName());
		}
		System.out.println("");
	}
	public static ArrayList<File> getSubdirs(File f){
		File[] entries = f.listFiles();
		ArrayList<File> subdirs = new ArrayList<>();
		for (int i = 0; i < entries.length; i++) {
			  if (entries[i].isDirectory()) {
				  subdirs.add(entries[i]);
			  }
		}
		return subdirs;
	}
	public static void printSubdirs(File f){
		ArrayList<File> subdirs = getSubdirs(f);
		System.out.println("The subdirectories " + f.getName() + " are:");
		for(int i = 0; i < subdirs.size(); i++){
			System.out.println(subdirs.get(i).getName());
		}
		System.out.println("");
	}
	// expects a particular text file structure and integer contents
	public static double getAverageFromFiles(File f) throws IOException{
		ArrayList<File> subfiles = getSubfiles(f);
		Scanner scanner;
		double sum = 0.0;
		int players = 0;

		for(int i = 0; i < subfiles.size(); i++){
		    scanner = new Scanner(subfiles.get(i));
		    while (scanner.hasNextLine()){
		    	sum += Double.valueOf(scanner.nextLine());
		    	players++;
		    }
		}
		return sum/players;
	}
	public static ArrayList<String> getWordsFromFile(File f) throws IOException{
		ArrayList<String> words = new ArrayList<>();
		Scanner scanner = new Scanner(f);
		while(scanner.hasNext()){
			words.add(scanner.next());
		}
		scanner.close();
		return words;
	}
	
	public static ArrayList<String> getEveryOtherWordFromFile(File f) throws IOException{
		ArrayList<String> words = new ArrayList<>();
		Scanner scanner = new Scanner(f);
		while(scanner.hasNext()){
			words.add(scanner.next());
			if(scanner.hasNext()){
				scanner.next();
			}
		}
		scanner.close();
		return words;
	}
	public static void main(String[] args) throws IOException{
		// get current working directory
		Path workingDirPath = FileSystems.getDefault().getPath("");
		String workingDirName = workingDirPath.toAbsolutePath().toString();
		System.out.println("The current working directory is: " + workingDirName + "\n");

		// list entries in current working directory
		File currentDir = new File(".");

		printEntries(currentDir);
		printSubfiles(currentDir);
		printSubdirs(currentDir);

		// print entries in parent directory
		printEntries(new File("../"));

		// print entries in HomeRuns directory
		printEntries(new File("HomeRuns"));

		// get average home runs for CA teams in 2018 season
		double average = getAverageFromFiles(new File("HomeRuns"));
		System.out.println("The average number of home runs by CA MLB team players was: " + average);

		// get words from one of the Joe quote files
		ArrayList<String> quote = getWordsFromFile(new File("JoeWisdom/ShriramKrishnamurthi.txt"));
		System.out.println("\nJoe's quote by Shriram Krishnamurthi:");
		System.out.println(quote);

		System.out.println("\nJoe's quote by Shriram Krishnamurthi (sorted):");
		Collections.sort(quote);
		System.out.println(quote);
		
		ArrayList<String> everyOtherWordQuote = getEveryOtherWordFromFile(new File("JoeWisdom/ShriramKrishnamurthi.txt"));
		System.out.println("\nJoe's quote by Shriram Krishnamurthi (every other word):");
		System.out.println(everyOtherWordQuote);
		
		ArrayList<String> unmergedQuote = getEveryOtherWordFromFile(new File("merged.txt"));
		System.out.println("\nUnmerged:");
		System.out.println(unmergedQuote);
	}
}