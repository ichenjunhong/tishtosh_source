package android.support.p030v4.p038f;

import java.io.PrintWriter;

/* renamed from: android.support.v4.f.p */
public final class C0802p {

    /* renamed from: a */
    private static final Object f2728a = new Object();

    /* renamed from: b */
    private static char[] f2729b = new char[24];

    /* renamed from: a */
    private static int m2292a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m2294a(long j, PrintWriter printWriter, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (f2728a) {
            if (f2729b.length < 0) {
                f2729b = new char[0];
            }
            char[] cArr = f2729b;
            int i6 = 1;
            if (j == 0) {
                cArr[0] = '0';
            } else {
                if (j > 0) {
                    c = '+';
                } else {
                    c = '-';
                    j = -j;
                }
                int i7 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                if (floor > 86400) {
                    i2 = floor / 86400;
                    floor -= 86400 * i2;
                } else {
                    i2 = 0;
                }
                if (floor > 3600) {
                    i3 = floor / 3600;
                    floor -= i3 * 3600;
                } else {
                    i3 = 0;
                }
                if (floor > 60) {
                    int i8 = floor / 60;
                    i5 = floor - (i8 * 60);
                    i4 = i8;
                } else {
                    i5 = floor;
                    i4 = 0;
                }
                cArr[0] = c;
                int a = m2293a(cArr, i2, 'd', 1, false, 0);
                if (a != 1) {
                    z = true;
                } else {
                    z = false;
                }
                int a2 = m2293a(cArr, i3, 'h', a, z, 0);
                if (a2 != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int a3 = m2293a(cArr, i4, 'm', a2, z2, 0);
                if (a3 != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int a4 = m2293a(cArr, i7, 'm', m2293a(cArr, i5, 's', a3, z3, 0), true, 0);
                cArr[a4] = 's';
                i6 = 1 + a4;
            }
            printWriter.print(new String(f2729b, 0, i6));
        }
    }

    /* renamed from: a */
    private static int m2293a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
