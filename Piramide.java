import java.util.Scanner;

class Piramide {
public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);

    System.out.print("Digite a base da Piramide: ");
    float base = leia.nextFloat();
    System.out.print("Digite a altura da Piramide : ");
    float altura = leia.nextFloat();
    float areabase = base * altura;

    System.out.print("Digite a base de uma face da Piramide: ");
    float baseface = leia.nextFloat();
    float areaface = (base * altura)/2;

    float areatotal = areabase + 2 *(baseface * altura);
    System.out.print("A área do retângulo é: " + areatotal);
 }
}