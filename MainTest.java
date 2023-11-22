import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test 
    public void testUrls() {
        String url1 = "http:";
        String url2 ="http:/";
        String url3 ="asdsad";
        String url4 ="ht://.com";
        String url5 ="htttps://.com";
        String url6 ="2131231://.com";
        String url7 ="2131231123132";

        String url8 = "http://mysite.com/orders/123/details/1";
        String url9 ="https://kahoot.com/10/orders/20/simple";
        String url10 ="http://kahoot.com/10/orders/20/simple";
        String url11 ="https://kahoot.com/20";

        assertFalse(Main.isValidUrl(url1));
        assertFalse(Main.isValidUrl(url2));
        assertFalse(Main.isValidUrl(url3));
        assertFalse(Main.isValidUrl(url4));
        assertFalse(Main.isValidUrl(url5));
        assertFalse(Main.isValidUrl(url6));
        assertFalse(Main.isValidUrl(url7));

        assertTrue(Main.isValidUrl(url8));
        assertTrue(Main.isValidUrl(url9));
        assertTrue(Main.isValidUrl(url10));
        assertTrue(Main.isValidUrl(url11));
    }
    // @Test
    // public void testExtractWordsFromSentence() {
    //     String sentence = "Це інший приклад речення 3?";
    //     int wordLength = 5;
    //     HashSet<String> words = Main.extractWordsFromSentence(sentence, wordLength);

    //     assertTrue(words.contains("інший"));

    //     assertFalse(words.contains("це"));
    //     assertFalse(words.contains("3"));
    //     assertFalse(words.contains("?"));
    // }

    // @Test
    // public void testExtractWordsFromSentenceWithPunctuationAndCase() {
    //     String sentence = "Це речення містить РОЗДІЛОВІ ЗНАКИ, та інші. Включає КапіталіЗовані слова СЛОВО і СЛОВОІФІВ.";
    //     int wordLength = 5;
    //     HashSet<String> words = Main.extractWordsFromSentence(sentence, wordLength);

    //     // Перевірка наявності унікальних слів (без врахування регістру)
    //     assertTrue(words.contains("СЛОВО"));
    //     assertTrue(words.contains("ЗНАКИ"));

    //     // Перевірка відсутності інших слів
    //     assertFalse(words.contains("це"));
    //     assertFalse(words.contains("речення"));
    //     assertFalse(words.contains("містить"));
    //     assertFalse(words.contains("СЛОВОІФІВ"));
    // }

    // @Test
    // public void testFindWords() {
    //     String text = "Це тестовий текст. Це речення 1. В другому реченні немає запитання. Чи працює програма правильно? Запитання 2. Програмування - це цікаво! Якщо у вас немає запитань, будь ласка, введіть слово завдовжки 5 символів. Це інший приклад речення 3? Текст також може містити числа, наприклад, 12345. Запитання 4: це останнє речення?";
    //     int wordLength = 7;
    //     HashSet<String> uniqueWords = Main.findWords(text, wordLength);
        
    //     assertTrue(uniqueWords.contains("приклад"));
    //     assertTrue(uniqueWords.contains("речення"));
    //     assertTrue(uniqueWords.contains("останнє"));

    //     assertFalse(uniqueWords.contains("тестовий"));
    //     assertFalse(uniqueWords.contains("текст"));
    //     assertFalse(uniqueWords.contains("речення1"));
    //     assertFalse(uniqueWords.contains("програму"));
    // }

    // @Test
    // public void testFindWordsEmptyInput() {
    //     String text = "";
    //     int wordLength = 5;
    //     HashSet<String> uniqueWords = Main.findWords(text, wordLength);

    //     assertTrue(uniqueWords.isEmpty());
    // }
}
