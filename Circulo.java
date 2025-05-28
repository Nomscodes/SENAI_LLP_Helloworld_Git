import java.util.Scanner;

class Circulo {
public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);
    System.out.print("Digite o raio do circulo: ");
    float raio = leia.nextFloat();
    double area = Math.PI * raio * raio;
    System.out.print("A área do retângulo é: " + area);
 }
}