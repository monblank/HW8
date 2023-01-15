import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
    	int[] array = new int[10];
    	int min = 40;
    	int max = 100;
    	int diff = max - min;
    	Random random = new Random();
    	int sum = 0;
    	int count = 0;
    	for (int i = 0; i < array.length; i++) {
    		array[i] = random.nextInt(diff) + min;
    		System.out.println(array[i]);
    		sum += array[i];
    		if (array[i] >= 60 && array[i] <= 80) {
    			count++;
    		}
    	}
    	System.out.println("Средний вес: " + sum / array.length);
    	System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно: " + count);
    }
}
