import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageExample {

	public static void main(String[] args) {
	
		//The following line will take your computer's default locale and choose the correct language file. 
                //To see your 2nd language, you should change your system default locale within your computer's OS
		ResourceBundle rb = ResourceBundle.getBundle("language_files/rb");
		System.out.println(Locale.getDefault());
		
		System.out.println(rb.getString("intro"));
	}

}
