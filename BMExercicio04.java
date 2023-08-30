public class BMExercicio04{
    public static void main(String[] args){
        long long1 = 100;
        int int1 = 200;
        // int int2 = int1 + long1; Deu erro, 
        // pois não foi possível converter tipo long em tipo int
        int int2 = int1 + (int)long1;
        System.out.println(int2);
    }
}