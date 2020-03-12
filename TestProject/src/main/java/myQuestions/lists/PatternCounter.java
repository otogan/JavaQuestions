package myQuestions.lists;

import java.util.HashMap;

public class PatternCounter {
    public static void main(String[] args) {
        solutionWithMap("aabbbbcccdddddddsee");
        solutionWOutMap("fjdkaadddsaaasssdd");
    }

    private static void solutionWOutMap(String input) {
        System.out.println("The pattern is " + input);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            boolean isUnique = true;
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (c == input.charAt(j)) {
                    if (j < i) {
                        isUnique = false;
                        break;
                    } else {
                        count++;
                    }
                }
            }
            if (isUnique) System.out.println("The pattern has " + count + " " + c);
        }
    }

    public static void solutionWithMap(String input) {
        System.out.println("The pattern is " + input);

        char[] charArray = input.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (Character c : charArray) {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        for (Character c : counts.keySet()) {
            System.out.println("The pattern has " + counts.get(c) + " " + c);
        }
    }
}
