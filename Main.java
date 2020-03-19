import java.util.Scanner;

public class Main{
	

	static Terjemahan t = new Terjemahan();

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		t.textToTranslate = input.nextLine();
		t.translatedText = Translator.translate(t);
		System.out.println("Translated text: " + translatedText);
	}
	
}
