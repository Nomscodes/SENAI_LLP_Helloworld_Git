import java.util.Scanner;

class Bola {
public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);
    
    System.out.print("Digite o raio da bola: ");
    float raio = leia.nextFloat();
    double area = Math.PI * (raio * raio);
    System.out.print("A área da bola é: " + area);
 }
}