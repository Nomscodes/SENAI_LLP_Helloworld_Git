import java.util.Scanner;

class Caixa {
public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);
    System.out.print("Digite o comprimento da caixa: ");
    float comprimento = leia.nextFloat();

    System.out.print("Digite a altura da caixa: ");
    float altura = leia.nextFloat();

    System.out.print("Digite a largura da caixa: ");
    float largura = leia.nextFloat();
    float area = 2 * (comprimento * largura + comprimento * altura + largura * altura); 

    System.out.print("A área da caixa é: " + area);
 }
}