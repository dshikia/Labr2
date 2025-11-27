import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        int o = in.nextInt();
        int n = in.nextInt();
        int l = n+1;
        int[] a = new int[l];
        int s;

        if (o < 0)
            o = Math.abs(o);
        a[0] = o;

        for (int i = 1; i < l; i++) {
            s=0;
            int pr = a[i - 1];
            while (pr > 0) {
                int x = pr % 10;
                s += x;
                pr = pr / 10;

            }
            a[i] = s * 7;
        }
        for (int i = 1; i < l; i++)
            out.print(a[i] + " ");
    }
}


import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n;
        int ind = 0;
        int posn = -10;
        int dlina = 0;
        do {
            n = in.nextInt();
            if (n == 0){

                if (posn != -10){
                    int l = ind - posn - 1;

                    if (l > dlina)
                        dlina = l;
                }

                posn = ind;
            }

            ind++;
        }while (n>=0);

        out.print(dlina);
    }
}






import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        long d =in.nextLong();
        int[] a = new int[n];

        for (int i = 0; i<n; i++)
            a[i] = in.nextInt();

        int k = 0;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                long p = (long)Math.abs(a[i]-a[j]);
                if (p <= d)
                    k++;
            }
        }

        out.print(k);
    }
}


import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) throws IOException {
        long k = 0;
        String s = "";
        for (long ch = 1; ch <= (long)(Math.pow(10,9)); ch++) {
            s = Long.toString(ch);

            boolean flag = false;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '5' && i + 2 < s.length()) {
                    if (s.charAt(i + 2) == '3') {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag==false)
                continue;

            long num = ch;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum % 7 == 0) {
                k++;
            }
        }

        out.println(k);
    }
}
