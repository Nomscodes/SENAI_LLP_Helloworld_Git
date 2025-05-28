import java.util.Scanner;

class Retangulo {
public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);
    System.out.print("Digite a altura do Retângulo: ");
    float alt = leia.nextFloat();
    System.out.print("Digite a altura do Retângulo: ");
    float bas = leia.nextFloat();
    float a = bas * alt;
    System.out.print("A área do retângulo é: " + a);
 }
}