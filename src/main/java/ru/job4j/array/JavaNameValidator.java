package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        char[] array = name.toCharArray();
        int code = name.codePointAt(0);
        return !Character.isDigit(array[0])
                && !isSpecialSymbol(code) && !isUpperLatinLetter(code)
                && isLowerLatinLetter(code);
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        for (int i = 65; i <= 90; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        for (int i = 97; i <= 122; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }
}
