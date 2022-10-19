import java.util.ArrayList;
import java.util.Random;

public class Lab5Q2 {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>(10);
        ArrayList<Integer> copyList = new ArrayList<Integer>(10);
        Random randomInt = new Random();

        for (int i = 0; i < 10; i++) {
            integerList.add(randomInt.nextInt(50)+ 1);
        }

        for (int i = 0; i < 10; i++) {
            copyList.add(integerList.get(i));
        }

        copyList.set(9, -5);

        System.out.println(integerList);
        System.out.println(copyList);
	}

}