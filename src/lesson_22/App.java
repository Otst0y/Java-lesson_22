package lesson_22;

public class App {

	public static void main(String[] args) {
		
		Pet cow = () -> System.out.println("Mooo");;
		Pet cat = () -> System.out.println("Meow");
		Pet dog = () -> System.out.println("Bark");
		cow.voice();
		cat.voice();
		dog.voice();

	}
	
	interface Pet {
		void voice();
	}
}
