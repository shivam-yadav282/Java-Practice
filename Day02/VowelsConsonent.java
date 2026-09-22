package Day02;


import java.util.Scanner;

public class VowelsConsonent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {

            ch = Character.toLowerCase(ch);

            if ("aeiou".indexOf(ch) != -1) {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }

        } else {
            System.out.println(ch + " is not an alphabet");
        }

        sc.close();
    }
}