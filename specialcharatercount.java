import java.util.Scanner;

public class spe chara count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the statement: ");
        String statement = scanner.nextLine();
        System.out.println("Number of special Characters: " + countSpecialCharacters(statement));
    }

    private static int countSpecialCharacters(String statement) {
        int specialCharactersCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            char currentChar = statement.charAt(i);
            if (!Character.isLetterOrDigit(currentChar) && !Character.isWhitespace(currentChar)) {
                specialCharactersCount++;
            }
        }
        return specialCharactersCount;
    }
}
