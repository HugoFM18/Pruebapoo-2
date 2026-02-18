import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer dos numeros y deducir si estan ordenados en creciente a<=b
        int a = 0, b = 0;

        System.out.print("Digite a:");// Solicitamos el valor de 'a'
        a = sc.nextInt();// capturamos el valor de 'a'
        System.out.print("Digite b:");
        b = sc.nextInt();
        //Condicional para deducir si estan en orden creciente o decreciente
        if (a <= b) {
            System.out.println("Orden en creciente");
        } else {
            System.out.println("Orden en decreciente");
        }
        sc.close();
    }
}
