package myQuestions;

public class NumberPalindrome {
    public static void main(String[] args) {
        int input = 123454321;
        int temp = input;
        int reversed = 0;
        while (temp > 0) {
            reversed *= 10;
            int digit = temp % 10;
            temp = temp / 10;
            reversed += digit;
        }
        if (input == reversed) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}
