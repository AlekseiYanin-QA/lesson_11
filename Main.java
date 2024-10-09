public class Main {

    public static void main(String[] args) {
        String sampleText = "Домашнее задание! 123";


        String testStrings = "Привет 123, мир 456!";


        String[] testNumbers = {
                "+1 234-567-8901",
                "+12 345 678 9012",
                "0123-456-789",
                "+7 (123) 456-78-90",
                "1234567890",
                "+44 20 1234 5678",
             

        };
        System.out.println( "-------------------------------------------------------");

        LetterCounter.printResult(sampleText);

        System.out.println( "-------------------------------------------------------");

        for (String number : testNumbers) {
            if (PhoneValidator.isValidInternationalPhoneNumber(number)) {
                System.out.println(number + " номер телефона междунарадного стандарта.");
            } else {
                System.out.println(number + " номер телефона не является междунарадным стандартом.");
            }
        }

        System.out.println( "-------------------------------------------------------");

        StringCleaner.printResultCleaner(testStrings);
    }

}

