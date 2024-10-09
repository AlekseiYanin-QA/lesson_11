public class StringCleaner {
    // Метод для удаления букв и пробелов из строки
    public static String removeLettersAndSpaces(String input) {
        // Заменяем все буквы и пробелы на пустую строку
        return input.replaceAll("[a-zA-Zа-яА-ЯёЁ\\s]", "");
    }

    // Метод для вывода результата
    public static void printResultCleaner(String input) {
        String cleanedString = removeLettersAndSpaces(input);
        System.out.println("Результат: " + cleanedString);
    }
}


