import java.util.*;
public class java_exercicse16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        int A = sc.nextInt();
        System.out.println("Segundo numero:  ");
        int B = sc.nextInt();

        System.out.println("Digite o numero da operação");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int op = sc.nextInt();
        int resultado;

        switch(op) {
            case 1:
                resultado = A+B;
                System.out.println(resultado);
                break;

            case 2:
                resultado = A-B;
                System.out.println(resultado);
                break;

            case 3:
                resultado = A*B;
                System.out.println(resultado);
                break;

            case 4:
                resultado = A/B;
                System.out.println(resultado);
                break;
        }
    }
}