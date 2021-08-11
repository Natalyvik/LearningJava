package com.company;

public class LoopsTheme {
    public static void main(String[] args) {
        // ЦИКЛЫ
        // FOR - выполняет блок кода, который выполняется пока условие прописанное в нем истинно (валидно)
        // Форма записи
        /*
        for (initialValue; condition; value modification){
        do some task}
         */
// ПРИМЕР
        int[] array2 = {2, 3, 5, 6, 8, 5, 6, 7, 7, 8, 8, 9};
        for (int index = array2.length - 1; index >= 0; index--) { // условие вывода значений массива с последнего элемента до 1
            for (int index_ = 0; index < array2.length; index++) //условие вывода значений массива с 1 элемента до последнего
                System.out.printf("array[%d]=%d", index, array2[index]);
            System.out.println();
        }
        // for each loop - цикл
        for (int element : array2) { // цикл идущий по элементам массива : означает В МАССИВЕ
            System.out.println(element); //вывод элементов массива
        }

        // WHILE - Он повторяет оператор или блок операторов до тех пор, пока значение его управляющего выражения истинно.
        // Форма записи

      /* while(условие) {
            // тело цикла
        }*/

        // ЦИКЛЫ while & for ВЗАИМОЗАМЕНЯЕМЫ
// ПРИМЕР
        //цикл while
        int i = 3;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        //цикл for
        for (int j = 3; j >= 0; j--) {
            System.out.println(i);
        }


        // DO..WHILE -Отличие цикла do-while от цикла while состоит в том, что цикл do-while выполняется по крайней мере один раз,
        // даже если условие изначально ложно.
        // В цикле while такое не произойдёт, так как тело цикла не отработается. Цикл do-while используется реже, чем while
        // Форма записи
       /* do
            // команда (тело цикла)
            while(условие-логическое выражение)
        */
// ПРИМЕР
        int counter = 10;
        do {
            System.out.println("Осталось " + counter + " сек.\n");
            counter--;
        } while (counter > 0);

    }
}
