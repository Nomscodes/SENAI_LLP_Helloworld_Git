import java.util.Scanner;

class Triangulo {
public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);
    System.out.print("Digite a altura do Triangulo: ");
    float altura = leia.nextFloat();
    System.out.print("Digite a base do Triangulo: ");
    float base = leia.nextFloat();
    float area = (base * altura)/2;
    System.out.print("A área do retângulo é: " + area);
 } 
}