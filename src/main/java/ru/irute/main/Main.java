package ru.irute.main;

import java.util.Scanner;
import ru.irute.unpacking.IsValid;
import ru.irute.unpacking.Unpacking;

public class Main {
    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        Unpacking unpacking = new Unpacking();
        Scanner scanner = new Scanner(System.in);
        String inputStr;
        inputStr = scanner.nextLine();

        if ( isValid.IsValid(inputStr)) {
            System.out.println( unpacking.unpacking(inputStr.toCharArray()));
        } else
            System.out.println("the string is not valid");
    }

}
