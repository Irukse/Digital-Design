package ru.irute.unpacking;
import org.apache.commons.lang3.StringUtils;

public class Unpacking {



    public String unpacking(char[] inputStr) {
        String stringReturn = "";
        String stringReturnFirst="";
        String result="";
        String repeatResult="";

//      счётчик для скобок
        int count = 0;

//      коэффициент повторений символов внутри скобок
        int repeat = 0;
//      результат вычислений
        StringBuilder stringBuilder=new StringBuilder();


        for (int i = 0; i < inputStr.length; i++) {

//           если символ - буква вне скобок, добавить к возвращаемой строке
            if (Character.isLetter(inputStr[i]) && count== 0) {
                stringReturnFirst += inputStr[i];
            }
//          если символ - цифра, то парсим в значение
            if(Character.isDigit(inputStr[i])) {
                repeat = Integer.parseInt(String.valueOf(inputStr[i]));
            }

            if(inputStr[i] == '[') {
                count++;
            }
            if (inputStr[i] == ']') {
                count--;
            }

            if (count == 0) {
//           когда скобка закрылась - умгожаем строку на repeat
                repeatResult = StringUtils.repeat(String.valueOf(stringReturn), repeat);
//           обнуляем значение stringReturn
                stringReturn="";
            }
//            записываем символы в скобках в переменную stringReturn
            if(count!=0 && Character.isLetter(inputStr[i])){
                stringReturn += inputStr[i];

            }
//          добавляем в результирующую часть и обнуляем repeatResult
            stringBuilder.append(repeatResult);
            repeatResult ="";

        }
//      добавляем к умноженным элементам букву вне скобок
        result+=   stringReturnFirst+stringBuilder;
        return result;
    }

}
