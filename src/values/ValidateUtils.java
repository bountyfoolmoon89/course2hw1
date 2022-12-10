package values;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class ValidateUtils {
    public static String validateString(String value) {
        return value.isBlank() | value.isEmpty() ? "Нет информации" : value;
    }

    public static Integer validateNum(Integer value) {
        return value < 0 ? 0 : value;
    }

    public static Integer validateYear(Integer value) {
        return value == null ? 2000 : value;
    }

    public static String validateCarParameters(String value) {
        return value == null ? "default" : value;
    }

    public static String validateCarColor(String value) {
        return value == null ? "Белый" : value;
    }

    public static Double validateDouble(Double value) {
        return value == null ? 1 : value;
    }

    public static String validateRegNumber(String regNumber){
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}",regNumber)){
            return regNumber;
        } else {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }
    public static String validateInsNumber(String number){
        if (Pattern.matches("[0-9]{9}", number)){
            return number;
        } else {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }
    public static LocalDate checkDuration(LocalDate duration){
        if (LocalDate.now().isAfter(duration)){
            System.out.println("Страховка просрочена!");
        }
        return duration;
    }
}
