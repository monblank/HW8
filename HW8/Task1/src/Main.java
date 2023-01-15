import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	int[] array = new int[10];
    	int[] arrayTemp = new int[10];
    	for (int i = 0; i < array.length; i++) {
    		array[i] = new Random().nextInt(100);
    		System.out.println(array[i]);
    	}
    	for (int i = 0; i < array.length; i++) {
    		System.out.println(array[array.length - (i + 1)]);
    	}
    	for (int i = 0; i < array.length; i++) {
    		arrayTemp[i] = array[array.length - (i + 1)];
    		System.out.println(arrayTemp[i]);
    	}
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
    }
}
