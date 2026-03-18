public class Loops {
    public static void main(String[] args) {
        // While Loops => Print 1 to N Number
        int N=100;

        int i=1;
        while(i<=N){
            System.out.println(i);
            i++;
        }

        // Do While loops
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=N);

        // for loops

        for (int j2 = 1; j2 <= N; j2++) {
            System.out.println(j2);
        }
    }
}
