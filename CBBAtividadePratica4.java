import java.util.Scanner;

public class CBBAtividadePratica4 {
    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite as dimensões em metros da piscina:");
        System.out.print("Comprimento: ");
        float comp = Scan.nextFloat();
        System.out.print("Largura: ");
        float larg = Scan.nextFloat();
        System.out.print("Profundidade: ");
        float prof = Scan.nextFloat();
        float volume = comp * larg * prof;
        float valorFinal = volume * 100;
        System.out.printf("O valor orçado para a piscina é R$ %f" , valorFinal);        
    }
}