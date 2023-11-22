import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть урл: ");
        String url = scanner.nextLine();

        boolean isUrlValid = isValidUrl(url);

        if(!isUrlValid) {
            System.out.println("Урл не валідний");
            return;
        }

        String modifiedUrl = Replacer.replace(url);
        System.out.println("Змінений урл: " + modifiedUrl);
    }

    public static boolean isValidUrl(String url) {
        String urlRegex = "^(https?|ftp):\\/\\/[a-zA-Z0-9+&@#\\/%?=~_|!:,.;]*" +
                          "[a-zA-Z0-9+&@#\\/%=~_|]$";

        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(url);

        return matcher.matches();
    }
}

// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// // Замінити домейн на педостанню букву
// // Взяти всі числа в урл додати їх і замінити їх на суму
// // Тест який перевіряє чи валідна урла

// // Це тестовий текст. Це речення 1. В другому реченні немає запитання. Чи працює програма правильно? Запитання 2. Програмування - це цікаво! Якщо у вас немає запитань, будь ласка, введіть слово завдовжки 5 символів. Це інший приклад речення 3? Текст також може містити числа, наприклад, 12345. Запитання 4: це останнє речення?

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Введіть текст: ");
//         String text = scanner.nextLine();

//         System.out.print("Введіть довжину слів для пошуку: ");
//         int wordLength = scanner.nextInt();

//         HashSet<String> uniqueWords = findWords(text, wordLength);

//         if (!uniqueWords.isEmpty()) {
//             System.out.println("Унікальні слова заданої довжини в запитальних реченнях:");
//             for (String uniqueWord : uniqueWords) {
//                 System.out.println(uniqueWord);
//             }
//         } else {
//             System.out.println("Слів заданої довжини не знайдено в тексті.");
//         }
//     }

//     public static HashSet<String> findWords(String text, int wordLength) {
//         String regex = "([А-ЯA-Z][^.!?]*[?])";
//         Pattern pattern = Pattern.compile(regex);
//         Matcher matcher = pattern.matcher(text);
    
//         HashSet<String> uniqueWords = new HashSet<>();
    
//         while (matcher.find()) {
//             String sentence = matcher.group();
//             HashSet<String> wordsInSentence = extractWordsFromSentence(sentence, wordLength);
//             uniqueWords.addAll(wordsInSentence);
//         }
    
//         return uniqueWords;
//     }
    
//     public static HashSet<String> extractWordsFromSentence(String sentence, int wordLength) {
//         HashSet<String> words = new HashSet<>();
//         String[] sentenceWords = sentence.split("\\s+");
    
//         for (String word : sentenceWords) {
//             word = word.replaceAll("[.,!?]", "");
//             if (word.length() == wordLength) {
//                 words.add(word);
//             }
//         }
    
//         return words;
//     }
// }