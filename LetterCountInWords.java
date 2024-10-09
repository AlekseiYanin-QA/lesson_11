public class LetterCountInWords {
    public static void countEsInWords(String input) {
        String[] words = input.split("\\s+");
        for (String word : words) {
            int countE = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'е' || word.charAt(i) == 'Е') {
                    countE++;
                }
            }
            System.out.println("В слове: " + word + ", количество букв 'е': " + countE);
        }
    }
}
