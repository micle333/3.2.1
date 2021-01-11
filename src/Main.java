import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int a = sc.nextInt();
        int max = 0;
        double[] b = new double[a];
        double[] f = new double[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextDouble();
        }
        for (int i = 0; i < a; i++) {
            for ( int j = 0; j < a; j++){
                if (b[i] == b[j]){
                    f[i] = f[i] + 1;
                }

            }
        }
        for (int i = 0; i < a - 1 ; i++) {
            if (f[i + 1] > f[i]) {
                max = i;
                }

        }
        if (max == 0){
            System.out.print(((int)b[0]));}
        else{
            System.out.print(((int)b[max + 1]));}
        }
    }
