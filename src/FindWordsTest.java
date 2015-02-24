import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FindWordsTest {


	
	@Before
	public void setUp() throws Exception {
		String dictWords[]; // =
							// {"The","quick","brown","fox","jumps","over","the","lazy","dog"};
		String exclude[]; // =
							// {" ",".","?","!","@","#","$","%","^","&","*","(",")","?","<",">","~"};
		FindWords newFind = new FindWords();
		String input = "Thequickbrownfoxjumps?";
		System.out.println("Begin Test Class");
	}

	@After
	public void tearDown() throws Exception {
		String dictWords[];// =
							// {"The","quick","brown","fox","jumps","over","the","lazy","dog"};
		String exclude[]; // =
							// {" ",".","?","!","@","#","$","%","^","&","*","(",")","?","<",">","~"};
		String input = "";
	}

	@Test
	public void testFindWordsWithNoExclusions() {
		System.out.println("Test testFindWordsWithNoExclusions()");
		String dictWords[] = { "The", "quick", "brown", "fox", "jumps", "over",
				"the", "lazy", "dog" };
		String exclude[] = { " ", ".", "?", "!", "@", "#", "$", "%", "^", "&",
				"*", "(", ")", "?", "<", ">", "~" };
		String expectedWords[] = { "The", "quick", "brown", "fox", "jumps" };
		ArrayList expected = new ArrayList();

		for (String wrd : expectedWords) {
			expected.add(wrd);
		}
		FindWords newFind = new FindWords();
		String input = "Thequickbrownfoxjumps";
		newFind.loadExclusions(exclude);
		newFind.loadDictionry(dictWords);
		newFind.findWords(input);
		System.out.println(expected.toString());
		System.out.println(newFind.words.toString());
		assertEquals("The dictionary load failed", expected.toString(),
				newFind.words.toString());

	}

	@Test
	public void testFindWordsWithExclusions() {
		System.out.println("Test testFindWordsWithExclusions()");
		String dictWords[] = { "The", "quick", "brown", "fox", "jumps", "over",
				"the", "lazy", "dog" };
		String exclude[] = { " ", ".", "?", "!", "@", "#", "$", "%", "^", "&",
				"*", "(", ")", "?", "<", ">", "~" };
		String expectedWords[] = { "The", "quick", "brown", "fox", "jumps" };
		ArrayList expected = new ArrayList();

		for (String wrd : expectedWords) {
			expected.add(wrd);
		}
		FindWords newFind = new FindWords();
		String input = "The?quick brownfox(jumps)";
		newFind.loadExclusions(exclude);
		newFind.loadDictionry(dictWords);
		newFind.findWords(input);
		System.out.println(expected.toString());
		System.out.println(newFind.words.toString());
		assertEquals("The dictionary load failed", expected.toString(),
				newFind.words.toString());

	}

	@Test
	public void testFindWordsWithAllExclusions() {
		System.out.println("Test testFindWordsWithAllExclusions()");
		String dictWords[] = { "The", "quick", "brown", "fox", "jumps", "over",
				"the", "lazy", "dog" };
		String exclude[] = { " ", ".", "?", "!", "@", "#", "$", "%", "^", "&",
				"*", "(", ")", "?", "<", ">", "~" };
		String expectedWords[] = { "" };
		ArrayList expected = new ArrayList();

		for (String wrd : expectedWords) {
			expected.add(wrd);
		}
		FindWords newFind = new FindWords();
		String input = "  ,?!@#$%^&*()cat()?~<>^";
		newFind.loadExclusions(exclude);
		newFind.loadDictionry(dictWords);
		newFind.findWords(input);
		System.out.println(expected.toString());
		System.out.println(newFind.words.toString());
		assertEquals("The dictionary load failed", expected.toString(),
				newFind.words.toString());

	}

	@Test
	public void testFindWordsWithNoWordsInDictionary() {
		System.out.println("testFindWordsWithNoWordsInDictionary()");
		String dictWords[] = { "The", "quick", "brown", "fox", "jumps", "over",
				"the", "lazy", "dog" };
		String exclude[] = { " ", ".", "?", "!", "@", "#", "$", "%", "^", "&",
				"*", "(", ")", "?", "<", ">", "~" };
		String expectedWords[] = { "" };
		ArrayList expected = new ArrayList();

		for (String wrd : expectedWords) {
			expected.add(wrd);
		}
		FindWords newFind = new FindWords();
		String input = "this cat in his hat is funny";
		newFind.loadExclusions(exclude);
		newFind.loadDictionry(dictWords);
		newFind.findWords(input);
		System.out.println(expected.toString());
		System.out.println(newFind.words.toString());
		assertEquals("The dictionary load failed", expected.toString(),
				newFind.words.toString());
	}

	@Test
	public void testLoadDictionry() {
		System.out.println("testLoadDictionry()");
		FindWords newFind = new FindWords();
		String dictWords[] = { "Hi", "O", "Silver", "the", "Lone", "Ranger",
				"!" };
		ArrayList expected = new ArrayList();
		for (String wrd : dictWords) {
			expected.add(wrd);
		}
		newFind.loadDictionry(dictWords);
		System.out.println(expected);
		System.out.println(newFind.dictionary);
		assertEquals("The dictionary load failed", expected, newFind.dictionary);
	}

	@Test
	public void testLoadExclusions() {
		System.out.println("testLoadExclusions()");
		FindWords newFind = new FindWords();
		String exclude[] = { " ", ".", "?", "!", "@", "#", "$", "%", "^", "&",
				"*", "(", ")", "?", "<", ">", "~" };
		ArrayList expected = new ArrayList();
		for (String wrd : exclude) {
			expected.add(wrd);
		}
		newFind.loadExclusions(exclude);
		assertEquals("The exclusions load failed", expected, newFind.exclusions);
	}
}
