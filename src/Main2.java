//в Джава объекты могут менять адреса

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        //для работы со троками в джава используют след классы
        //String. StringBuilder. StringBuffer
        //String


        //начиная сс 7 версии String представляет собой не массив символов, а массив типа byte
        //латинские символы хранятся в первых 128 символах таблицы кодировки
        //string в джава - адаптивный с точки зрения кол-ва памяти для символов

        //способы создания строк
        //1 способ
        String str1 = new String("Igor");
        System.out.println(str1);
        //2 способ
        String str2 = "Igor";//допустимо создание без new и конструктора

        String str3 = "Igor";//4 байта  из первых 128 Unicode
        String str4 = new String("Igor");
        String str5 = "Игорь";//8 байта  свыще первых 128 Unicode
        String str6 = "Игor";//8 байта  свыше первых 128 Unicode
        System.out.println(Arrays.toString(str3.getBytes()));//getBytes - возвращает массив byte
        System.out.println(Arrays.toString(str5.getBytes()));
        System.out.println(Arrays.toString(str6.getBytes()));
        System.out.println("------------------------------------");
        //charAt - обращение к символу
        System.out.println("Первый символ в строке str1 " + str1.charAt(0));
        System.out.println("Первый символ в строке str1 " + str5.charAt(0));
        //Изменение символа
        str4 = str4.replace('I', '+');//изменить символ по индексу нельзя, этот метод не меняет сущ объект, а создает новый
        System.out.println(str4);
        System.out.println("------------------------------------");

        // == - сравнивает не объекты по содержимому, а сравнивает значение ссылок, т.е. объектов
        if(str1 == str2){
            System.out.println("str1 / str2 - одинаковые адреса");
        }
        else{
            System.out.println("str1 / str2 - не одинаковые адреса");
        }

        //equals - метод для опеределения равенства объектов по их содержимому
        System.out.println("str1 = str2 "+ str1.equals(str2));

        //str1.intern() - интернирование строк, если ссылка указывает на объект в хипе, то проверяет наличие такого же объекта в string pool
        //и возвращает ссылку на такую строку из string pool

        //contains - содержит ли
        //endsWith - оканчивается ли / startsWith - начинает ли
        //trim - убирает пробелы вначале ив конце


    }
}
