package com.company;

public class OperatorsTheme {
    public static void main(String[] args){
        //ОПЕРАТОРЫ
        //Операторы сравнения (==,>,<,>=,<=,!=,&&,||)
        /*
        System.out.println("10 > 1 = " + (10 > 1));
        System.out.println("4 >= 4 =" + (4 >= 4));
        System.out.println("A != a = " + ('A' != 'a'));
        System.out.println("A == a = " + ('A' == 'a'));
        System.out.println("true && false = " + (true && false));
        System.out.println("true || false = " + (true || false));
        */


        // Условные операторы
        //IF STATEMENT
       /*
       System.out.println("enter your age ");
        int userAge = reader.nextInt();
        if (userAge <=0) {                                       // если
            System.out.println("Your age is incorrect");
        } else if (userAge >= 18) {                             // иначе если
            System.out.println("you can buy an alcohol");
        } else {                                               // в противном случае (ИНАЧЕ)
            System.out.println("you can't buy an alcohol drink, it's permitted for your age");
        }
        */

        /* ПРИМЕР
        String animal = "cat";
        String enteredAnimal = "";
        do {
            System.out.println("Enter an animal");
            enteredAnimal = reader.nextLine();
            if (animal.equals(enteredAnimal)) {
                System.out.println("YOU'R RIGHT!");
            } else {
                System.out.println("Don't worry, try again");
            }
        } while (!animal.equals(enteredAnimal));*/

        //ТЕРНАРНЫЙ ОПЕРАТОР ? : (упрощенная форма записи if и
        // используется, тогда когда ты хочешь записать значение переменной в зависимости от выполненного условия)
        // Пример
        boolean hasLenght = "".length() > 0 ? true : false;
        String word = "Hello World!".charAt(1) == 'e' ? "Yes" : "No";
        //System.out.println(word);

        /* String word1;
        if ("Hello Word!".charAt(1) == 'e') {
            word1 = "Yes";
        } else {
            word1 = "No";
        }*/
        //System.out.println(word1);


        // ОПЕРАТОР ВЫБОРА switch
      /*  word1 = "Yes";
        switch (word1){   //передаем значение переменной, которую хотим проверить
            case "Yes" :   // указываем конкретное значение
                System.out.println("word1 = Yes");
                break;
            case "No" :
                System.out.println("word1 = No");
                break;
            default:
                System.out.println("word1 = " + word1);
                break;
        }*/


    }
}
