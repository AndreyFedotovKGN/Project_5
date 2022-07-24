public class Main {
    public static void main(String[] args) {
//## 1 задача
//Объявите три массива:
//1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
// - Подсказка
// ```java
// //объявление массива из 12-ти элементов, заполненного нулями
//int [] weight = new int [12];
//        ```
//2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
//  - Подсказка
//```java
// //объявление целочисленного массива, заполненного 12 элементами
//int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
//        ```
//3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
// с помощью ключевого слова или сразу заполненный элементами.

// "Задание 1-1"
        int[]shelf = new int[3];
        shelf[0] = 1;
        shelf[1] = 2;
        shelf[2] = 3;
//Задание 2-1
        for (int i = 0; i < shelf.length; i++) {
            if (i < shelf.length-1) {
                System.out.print(shelf[i] + ",");
            } else {
                System.out.println(shelf[i] + " ");
            }
        }
//Задание 3-1
        for (int i = shelf.length-1; i < shelf.length; i--) {
            if (i > 0) {
                System.out.print(shelf[i] + ",");
            } else if (i==0) {
                System.out.println(shelf[i] + " ");
            }
        }

// "Задание 1-2"
        float [] showcase = {1.57f,7.654f,9.986f};

//Задание 2-2
        for (int i = 0; i < showcase.length; i++) {
            if (i < (showcase.length-1)) {
                System.out.print(showcase[i] + ",");
            } else if (i==showcase.length-1)  {
                System.out.println(showcase[i] + " ");
            }
        }
//Задание 3-2
        for (int i = showcase.length-1; i < showcase.length; i--) {
            if (i > 0) {
                System.out.print(showcase[i] + ",");
            } else if (i==0) {
                System.out.println(showcase[i] + " ");
            }
        }
// "Задание 1-3"
        int [] pencilBox = {5,10,15,20,25};

// "Задание 2-3"
        for (int i = 0; i < pencilBox.length; i++) {
            if (i < pencilBox.length-1) {
                System.out.print(pencilBox[i] + ",");
            } else if (i==pencilBox.length-1) {
                System.out.println(pencilBox[i]);
            }
        }
// "Задание 3-3"
        for (int i = pencilBox.length-1; i < pencilBox.length; i--) {
            if (i > 0) {
                System.out.print(pencilBox[i] + ",");
            } else if (i==0) {
                System.out.println(pencilBox[i] + " ");
            }
        }
//## 2 задача
//Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
// через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

//## 3 задача
//Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
// а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются
// на одной строчке, а элементы другого массива – на другой.
//Запятая между последним элементом одного массива и первым элементом следующего не нужна.
//
//Задание 4
//пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
//Распечатайте результат преобразования в консоль.
//
            for (int i = 0; i <shelf.length; i++) {
            if (shelf[i] % 2 != 0) {
                System.out.print((shelf[i] += 1) + " ");
            } else {
                System.out.print(shelf[i] + " ");
            }
        }

    }
}