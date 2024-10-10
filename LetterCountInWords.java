public class LetterCountInWords {
    public static void countEsInWords(String input) {
        // Удаляем знаки препинания с помощью регулярного выражения
        String cleanedInput = input.replaceAll("[^\\p{L}\\s]", "");
        String[] words = cleanedInput.split("\\s+");

        for (String word : words) {
            int countE = 0;
            // Приводим слово к нижнему регистру
            String lowerCaseWord = word.toLowerCase();

            for (int i = 0; i < lowerCaseWord.length(); i++) {
                if (lowerCaseWord.charAt(i) == 'е') {
                    countE++;
                }
            }
            System.out.println("В слове: " + word + ", количество букв 'е': " + countE);
        }
    }
}
