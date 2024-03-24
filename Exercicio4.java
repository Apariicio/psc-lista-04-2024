package Lista4;

public class Exercicio4 {
    public static void main(String[] args){
        int paisA = 80000;
        double taxaCrescA = 0.03; //crescimento 3%
        int paisB = 200000;
        double taxaCrescB = 0.015; //crescimento 1,5%
        int anos = 0;

        while (paisA < paisB) {
            paisA += paisA * taxaCrescA;
            paisB += paisB * taxaCrescB;
            anos++;
        }

        System.out.println(anos + " anos sao necessarios para que o pais A iguale ou ultrapasse o pais B.");
    }
    
}
