import java.util.Scanner;

public class CBBAtividadePratica3{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        System.out.print("Digite o valor da base do retângulo: ");
        int base = Scan.nextInt();
        System.out.print("Digite o valor da altura do retângulo: ");
        int altura = Scan.nextInt();
        int area = base * altura;
        System.out.printf("A área do retângulo é %d . ", area);
    }
}