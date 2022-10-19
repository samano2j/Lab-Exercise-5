import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q1 {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
        Random randomInt = new Random();
        Scanner scan = new Scanner(System.in);
        int userPrompt;
        boolean checkList;

        for (int i = 0; i < 10; i++) {
            integerList.add(randomInt.nextInt(50)+ 1);
        }

        System.out.println(integerList);

        System.out.println("Enter an interger:");
        userPrompt = scan.nextInt();

        checkList = (integerList.contains(userPrompt)) ? true : false;

        if (checkList) {
            System.out.println("Number is in the list");
        }
        else {
            System.out.println("Number is not in the list");
        }

        scan.close();
	}

}
