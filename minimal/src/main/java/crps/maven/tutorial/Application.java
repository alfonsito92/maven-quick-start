package crps.maven.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public int countWords(String words){
		String[] separateWords = words.split(" ");
		return (separateWords == null) ? 0: separateWords.length;
	}

	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");

		for(String greeting : greetings){
			System.out.println("Greeting: " + greeting);
		}
	}

	public Application(){
		System.out.println("Inside Application");
	}

	// method main(): ALWAYS tthe APPLICATION entry point

	public static void main(String[] args){
		System.out.println("Starting Application");
		Application app = new Application();

		app.greet();

		System.out.println("Word Count: " + app.countWords("· palabras hay"));
	}
}