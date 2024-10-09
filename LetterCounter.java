public class LetterCounter {

    // Метод для подсчета букв в строке
    public static int countLetters(String input) {
        int letterCount = 0;

        // Идем по всем символам строки
        for (char c : input.toCharArray()) {
            // Проверяем, является ли символ буквой
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        return letterCount;
    }

    // Метод для вывода результата
    public static void printResult(String input) {
        int count = countLetters(input);
        System.out.println("Количество букв в строке: " + count);
    }
}
