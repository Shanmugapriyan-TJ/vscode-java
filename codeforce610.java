import java.io.*;
import java.util.*;

public class codeforce610 {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long[] a = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
                sum += a[i];
            }
            if (canDecreaseInfinitely(a)) {
                sb.append(-1).append('\n');
            } else {
                sb.append(sum).append('\n');
            }
        }
        System.out.print(sb);
    }

    static boolean canDecreaseInfinitely(long[] a) {
        int n = a.length;
        Arrays.sort(a);
        long g = 0;
        for (int i = 1; i < n; i++) {
            g = gcd(g, a[i] - a[0]);
        }
        return g == 1;
    }

    static long gcd(long x, long y) {
        while (y != 0) {
            long tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buf = new byte[1 << 16];
        private int idx = 0, size = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return -1;
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res * sign;
        }

        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return -1;
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res * sign;
        }

        private int read() throws IOException {
            if (idx >= size) {
                size = in.read(buf);
                idx = 0;
                if (size <= 0) return -1;
            }
            return buf[idx++];
        }
    }
}
