import java.util.Arrays;
import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
        // https://github.com/MrSosu/Corso-Java-backend-2022-03/tree/main/module_08/src/Exceptions
        MainExceptions main = new MainExceptions();
        line();
        main.part1(); // NullPointerException
        line();
        main.part2(); // ArithmeticException
        line();
        main.part3(); // ArrayIndexOutOfBoundsException
        line();
    }

    public static void line() {
        System.out.println("***************************************");
    }

    public void part1() {
        System.out.println("Hello NullPointerException!");

        // https://github.com/MrSosu/Corso-Java-backend-2022-03/tree/main/module_08/src/Exceptions/ex1_NullPointer
        try {
            int[] array = null;
            array[0] = 1;
        } catch (NullPointerException e) {
            System.out.println("caught a NullPointerException!");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        try {
            // https://github.com/MrSosu/Corso-Java-backend-2022-03/tree/main/module_08/src/Exceptions/ex2_NullPointer
            String stringa = null;
            int lunghezza = stringa.length();
        } catch (NullPointerException e) {
            System.out.println("caught a NullPointerException!");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

    }

    public void part2() {
        // https://github.com/MrSosu/Corso-Java-backend-2022-03/tree/main/module_08/src/Exceptions/ex3_DivisionBy0

        try {
            double result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void part3() {
        // https://github.com/MrSosu/Corso-Java-backend-2022-03/tree/main/module_08/src/Exceptions/ex4_IndexOutOfBounds
        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Accessories"};

        System.out.println(Arrays.toString(categories));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Make a choice beginning from 0 : ");
        int choice = scanner.nextInt();

        try {

            System.out.println("Chosen option: " + categories[choice]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Wrong Option");
        }
    }
}