package ru.irute.unpacking;

public class IsValid {


    public boolean IsValid(String inputStr) {
        int count = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
//          смотрим каждый символ и сравниваем с допустимыми значениями
            if ((ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch == '[' || ch == ']')) {
//            если после числа нет цифры, то false
                if (Character.isDigit(ch)) {
                    if (inputStr.toCharArray()[i+1] != '[') {
                        return false;
                    }
                }
            }
            if (inputStr.toCharArray()[i] == '[') {
                count++;
            }
            if (inputStr.toCharArray()[i] == ']') {
                count--;
                if (count < 0) {
                    return false;
                }
            }

        }

        return true;
    }
}
