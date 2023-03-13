package org.example;
//Домашнее задание семинара № 2
//1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//3. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//4. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//6. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String firstString = "qwerty qwer werty erty";
        String secondString = "wer";
        CompareStr(firstString, secondString); // Решение задачи 1

        String thirdString = "qwerty";
        String fourthString = "ytrewq";
        ReverseStr(thirdString, fourthString); // Решение задачи 2

        int num1 = 3;
        int num2 = 56;
        StringBuilder sb = new StringBuilder(); // Решение задачи 3
        String result1 = String.valueOf(sb.append(num1).append(" + ").append(num2).append(" = ").append(num1+num2));
        System.out.println(result1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(num1).append(" - ").append(num2).append(" = ").append(num1-num2);
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(num1).append(" * ").append(num2).append(" = ").append(num1*num2);
        System.out.println(sb3);
        sb3.deleteCharAt(7); // Решение задачи 4
        sb3.insert(8, "равно ");
        System.out.println(sb3);
        sb2.replace(7, 7, " равно ");
        System.out.println(sb2);

//
//        String newString = "3+5=8";
//        StringBuilder newsb = new StringBuilder(newString);
//        newsb.deleteCharAt(3);
//        System.out.println(newsb);



    }
        static void CompareStr(String str1, String str2){
            if (str1.contains(str2)) {
                System.out.println("Сторока " + str1 + " содержит строку " + str2);
            } else System.out.println("Сторока " + str1 + " НЕ содержит строку " + str2);
        }

        static void ReverseStr(String str1, String str2){
            String revers = new StringBuilder(str2).reverse().toString();
            if (Objects.equals(str1, revers)){
                System.out.println("Сторока " + str2 + " является вращением строки " + str1);
            } else System.out.println("Сторока " + str2 + " НЕ является вращением строки " + str1);
        }
}
