package skypro.java.course1.hw_1;

public class Task_1234 {
    public static void main(String[] args) {

        /* Задача 1
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
        массива: с помощью ключевого слова или сразу заполненный элементами. */
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;   // объявление первого массива
        double[] secondArray = {1.57, 7.654, 9.986};    // объявление второго массива
        char[] thirdArray = new char[2];
        thirdArray[0] = 'S';
        thirdArray[1] = 'M';   // объявление третьего массива

        /* Задача 2
        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
        через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.   */
        System.out.println("\nЗадание №2.");
        for (int i = 0; i < 3; i++) {
            if (i != firstArray.length - 1) {
                System.out.printf("%d, ", firstArray[i]);
            } else {
                System.out.printf("%d\n", firstArray[i]);
            }
        }    // вывод первого массива
        for (int i = 0; i < secondArray.length; i++) {
            if (i != secondArray.length - 1) {
                System.out.printf("%.3f, ", secondArray[i]);
            } else {
                System.out.printf("%.3f\n", secondArray[i]);
            }
        }    // вывод второго массива
        System.out.printf("%c, %c\n", thirdArray[0], thirdArray[1]);   // вывод третьего массива

                /* Задача 3
        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента
        массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива
        располагаются на одной строчке, а элементы другого массива – на другой. Запятая между последним элементом одного
        массива и первым элементом следующего не нужна.   */
        System.out.println("\nЗадание №3.");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.printf("%d, ", firstArray[i]);
            } else {
                System.out.printf("%d\n", firstArray[i]);
            }
        }   // вывод первого массива в обратном порядке
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.printf("%.3f, ", secondArray[i]);
            } else {
                System.out.printf("%.3f\n", secondArray[i]);
            }
        }   // вывод второго массива в обратном порядке
        System.out.printf("%c, %c\n", thirdArray[1], thirdArray[0]);   // вывод третьего массива в обратном порядке


    }
}
