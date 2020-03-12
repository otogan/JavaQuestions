package myQuestions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupSubString {

    public static void main(String[] args) {
        String input = "asdf343lKj1234lkjl";
        Pattern pattern = Pattern.compile("[0-9]+|[A-z]+");
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            if (sb.length() > 0) sb.append(",");
            sb.append("(" + input.substring(matcher.start(), matcher.end()) + ")");
        }

        System.out.println(sb);

    }

}
