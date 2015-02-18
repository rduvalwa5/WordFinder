import java.util.ArrayList;
import org.apache.log4j.Logger;


public class FindWords {
	
	public static Logger Log;
	
	// "The quick brown fox jumps over the lazy dog"
	String logFile = "TestAutomation.log";
	String word = "";
	ArrayList words = new ArrayList();
	ArrayList dictionary = new ArrayList();
	ArrayList exclusions = new ArrayList();

	public void findWords(String input) {
		String className = this.getClass().getName();
		Logger Log = Logger.getLogger(this.getClass().getName());
		setLogger(Log);
		char[] inArray = input.toCharArray();
		int idx = 0;
		while (idx < input.length()) {
			word = word + input.charAt(idx);
			// System.out.println(dictionary);
			if (exclusions.contains(word)) {
				idx++;
				word = "";
			} else {
				if (dictionary.contains(word)) {
					printStep("Test is " + className);
					printStep("dic word is " + word);
					System.out.println("dic word is " + word);
					words.add(word);
					word = "";
					idx++;
				} else {
					idx++;
					// System.out.println("word is " + word);
				}
			}
		}
		printStep("Words " + words.toString());
		System.out.println("Words " + words.toString());
	}

	public void loadDictionry(String[] dict) {
		for (String wrd : dict) {
			dictionary.add(wrd);
		}
	}

	public void loadExclusions(String[] exc) {
		for (String e : exc) {
			exclusions.add(e);
		}
		// System.out.println("Disctionary " + dictionary.toString());

	}

	public static void printStep(String step){
		Logger theLog = getLogger();
		theLog.info(step );
		}
	
	public static void setLogger(Logger x)
	{
					Log = x;
	}
	
				
	public static Logger getLogger()
	{
		return Log;
	}
	
	// For test
	public static void main(String[] args) {
		String dictWords[] = { "The", "quick", "brown", "fox", "jumps", "over",
				"the", "lazy", "dog" };
		String exclude[] = { " ", ".", "?", "!", "@", "#", "$", "%", "^", "&",
				"*", "(", ")", "?", "<", ">", "~" };
		FindWords newFind = new FindWords();
		String input = "Thequickbrownfoxjumps?";
		newFind.loadExclusions(exclude);
		newFind.loadDictionry(dictWords);
		newFind.findWords(input);
	}
}
