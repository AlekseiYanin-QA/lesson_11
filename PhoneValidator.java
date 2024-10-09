import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {

        public static boolean isValidInternationalPhoneNumber(String phoneNumber) {
            // Регулярное выражение для проверки международного телефонного номера
            String regex = "^\\+?[1-9][0-9]{0,2}[-.\\s]?\\(?[0-9]{1,4}\\)?[-.\\s]?[0-9]{1,4}[-.\\s]?[0-9]{1,9}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        }
}

