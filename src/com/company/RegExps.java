package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExps {

    public static void main(String[] args) {

        String s1=" ";
        String s2="ab";
        Pattern pattern=Pattern.compile(".");
        Matcher matcher= pattern.matcher(s2);
      //  System.out.println(matcher.matches());
        // Строка содержит только один символ
        check(".."," ","ab");
        check(".{5}","12345","234");
        //Строка содержит одну или более букву "a", а за ней одну букву "b"
        check("a+b","aab","abb");
        //Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"
        check("a*b","b","abb");
        //Слово состоит из двух букв, первая из которых "a"
        check("a.","ab","abb");
        //Последняя буква в строке а(.*)-0 и более любых символов
        check(".*a","ba","abb");
        //Третья позиция а
        check(".{2}a.*","bba","abb");
        //Первая и последняя -а
        check("a.*+","aba","abb");
        //Первая и последняя одинаковы
        check("^(.).*\\1","aba","baa");
        //Не должно начинаться с -а или b
        check("[^ab].*","aba","baa");
        //Четные символы а
        check("(.a)+","ababa","bababa");
        //Первая и последняя ne одинаковы work home it
        //Строка не содержит "a"
        check("[^a]+","bbbb","abbb");
        //Слово содержит букву "a"
        check("[a-zA-Z]*a[a-zA-Z]","babab","hdh f");
        //В строке содержатся цифры
        check("[a-zA-Z]*\\d[a-zA-Z]","babab","hdh8f");
        //В строке содержатся цифры
        check("\\d+","babahhb","5465465");
        //Строка является вещественным числом с фиксированной точкой
        check("[+-]?\\d+[.]?\\d*?","+1","5465465");
        //Проверить написание номера телефонав формате 8(023)-123-45-67
        check("8\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}","+1","8(029)-814-62-91");





    }

    public  static void check(String pattern,String s1,String s2){
        boolean b1=Pattern.compile(pattern).matcher(s1).matches();
        boolean b2=Pattern.compile(pattern).matcher(s2).matches();
        System.out.println(b1+" "+b2);
    }
}
