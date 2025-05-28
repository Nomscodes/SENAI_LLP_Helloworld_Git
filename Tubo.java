import java.util.Scanner;

class Tubo {
public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);

    System.out.print("Digite o raio do tubo: ");
    float raio = leia.nextFloat();
    System.out.print("Digite a altura do tubo: ");
    float altura = leia.nextFloat();
    double area = 2 * Math.PI * raio * (raio + altura);
    System.out.print("A área do tubo é: " + area);
 }
}