package crps.maven.test;

public class Application {


	public Application(){
		System.out.println("Inside Application");
	}

	// method main(): ALWAYS tthe APPLICATION entry point

	public static void main(String[] args){
		System.out.println("Starting Application");
		Application app = new Application();
	}

}