import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacer {
    public static String replace(String input) {
        String modifiedUrlSubdonamin = replaceSubdomain(input);
        String modifiedUrlNumbers = replaceNumbers(modifiedUrlSubdonamin);

        return modifiedUrlNumbers;
    }

    private static String replaceSubdomain(String url) {
        Pattern pattern = Pattern.compile("://([^/]+)\\.");
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
            String subdomain = matcher.group(1);

            if (subdomain.length() >= 2) {
                char secondLastLetter = subdomain.charAt(subdomain.length() - 2);
                String newSubdomain = String.valueOf(secondLastLetter);

                return url.replaceFirst("://([^/]+)\\.", "://" + newSubdomain + ".");
            } else {
                return "Піддомен занадто короткий для заміни передостанньою буквою.";
            }
        } else {
            return "Не вдалося знайти піддомен у введеному урл.";
        }
    }

    private static String replaceNumbers(String url) {
        Pattern numberPattern = Pattern.compile("\\d+");
        Matcher numberMatcher = numberPattern.matcher(url);

        int sum = 0;

        while (numberMatcher.find()) {
            int number = Integer.parseInt(numberMatcher.group());
            sum += number;
        }

        return url.replaceAll("\\d+", "" + sum);
    }
}