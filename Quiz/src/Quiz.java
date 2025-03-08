import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int num1 = input.nextInt();

        for (int i = 1; i <= num1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(j + " ");
                

            }
        }
        


    }
}
