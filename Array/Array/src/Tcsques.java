import java.util.Scanner;

public class Tcsques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] M = new int[N];

        for(int i = 0; i < N; i++){
            M[i] = sc.nextInt();
        }

        for(int q = 0; q < K; q++){

            int X = sc.nextInt();
            int Y = sc.nextInt();

            // update mark
            M[X-1] = Y;

            int removed = 0;

            for(int i = 1; i < N; i++){
                if(M[i] == M[i-1]){
                    removed++;
                }
            }

            System.out.println(N - removed);
        }
    }
}


