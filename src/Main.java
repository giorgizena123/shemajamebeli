import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1)
//2) b)
//3) d)
//4) c)
//5) d)
//6) c)
//7) a)
//8) a)
//9) a)
//10) d)
//11) c)
//12) c)
//13) a)
//14) a)
//15) a)


        //16)

        int[] a = {2, 7, 1, 18, 15};
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i]) {
                    int k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }


            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("me-" + index + " magazia " + "fasi " + a[i]);
            index++;
        }
//17)

        for (int i = 0; i < 100; i++) {

            if (i / 5 / 7 == (double) i / 5 / 7) {
                System.out.println("HEYHOW");
                continue;

            }
            if (i / 5 == (double) i / 5) {
                System.out.println("HEY");
                continue;

            }
            if (i / 7 == (double) i / 7) {
                System.out.println("HOW");
                continue;

            }

            System.out.println(i);

        }


//18)
        int q, e;
        q = scanner.nextInt();
        e = scanner.nextInt();

        int z[][] = new int[q][e];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < e; j++) {
                z[i][j] = scanner.nextInt();
            }

        }

        for (int i = 0; i < q; i++) {
            for (int j = 1; j < e; j++) {
                if (z[i][j - 1] > z[i][j]) {
                    int l = z[i][j - 1];
                    z[i][j - 1] = z[i][j];
                    z[i][j] = l;
                }


            }
        }

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < e; j++) {
                System.out.println(i + "," + j + "=" + z[i][j]);

            }
        }


//19)
        int sum = 0;
        int asum = 0;
        int x[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = x.length;
        for (int i = 0; i < n; i++) {
            sum += x[i][i];
            asum += x[i][n - i - 1];
        }

        if (n % 2 == 1) {
            int v = x[n / 2][n / 2];
            sum -= v;
            int diag = sum + asum;
            System.out.println(diag);
        }
    }






            }









