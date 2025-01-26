package org.example;

import org.apache.commons.lang3.StringUtils;

public class Task3 {

    public static void main( String[] args )
    {
       String str1 = "А роза упала на лапу Азора";
       String reversedStr = StringUtils.reverse(str1);
        System.out.println("Первоначальный текст: " + str1);
        System.out.println("Обработанный текст: " + reversedStr);

    }
}
