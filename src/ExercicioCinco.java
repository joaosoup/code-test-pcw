import java.util.Scanner;

// Resolução do exercício com utilização de Scanner e StringBuilder
public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner palindromo = new Scanner(System.in);

        System.out.println("Escreva uma palavra e descubra se ela é um palíndromo!");
        String original = palindromo.nextLine();
        String reverse = new StringBuilder(original).reverse().toString();


        if (original.equals(reverse)){
            System.out.println("Essa palavra é um palíndromo! Tem o mesmo sentido mesmo sendo lida de trás para frente.");
        } else {
            System.out.println("Essa palavra não é um palíndromo!");
        }

    }
}