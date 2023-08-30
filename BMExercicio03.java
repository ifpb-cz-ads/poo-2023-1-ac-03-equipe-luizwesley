public class BMExercicio03{
    public static void main(String[] args){
        float arroz = 2.95f;
        float feijao = 3.50f;
        System.out.println("O preço do arroz é: " + arroz + " e o preço do feijão é: " + feijao);
        float total = arroz + feijao;
        final float TAXA = 8.25f/100;
        float taxaCalculada = total * TAXA;
        System.out.println("A taxa é: " + taxaCalculada);
        arroz += taxaCalculada;
        feijao += taxaCalculada;
        float novoCusto = arroz + feijao;
        System.out.println("O novo preço do arroz é: " + arroz + " e o novo preço do feijão é: " + feijao);
        boolean muitoCaro = (novoCusto > 10) ? true : false;
        System.out.println(muitoCaro);
        }
}