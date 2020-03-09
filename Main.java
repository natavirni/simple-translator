import java.util.Scanner;

public class Main{
	

	static Terjemahan t = new Terjemahan();

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String textToTranslate = input.nextLine();
		String translatedText = Translator.translate(null);
		System.out.println("Translated text: " + translatedText);
	}
	
}
