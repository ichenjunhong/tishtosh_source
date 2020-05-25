package com.airbnb.lottie;

import android.support.p030v4.p040os.C0968g;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.c */
public final class C2340c {

    /* renamed from: a */
    private static final Set<String> f7291a = new HashSet();

    /* renamed from: b */
    private static boolean f7292b = false;

    /* renamed from: c */
    private static String[] f7293c;

    /* renamed from: d */
    private static long[] f7294d;

    /* renamed from: e */
    private static int f7295e = 0;

    /* renamed from: f */
    private static int f7296f = 0;

    /* renamed from: a */
    public static void m6968a(String str) {
        if (!f7291a.contains(str)) {
            f7291a.add(str);
        }
    }

    /* renamed from: b */
    public static void m6969b(String str) {
        if (f7292b) {
            if (f7295e == 20) {
                f7296f++;
                return;
            }
            f7293c[f7295e] = str;
            f7294d[f7295e] = System.nanoTime();
            C0968g.m2814a(str);
            f7295e++;
        }
    }

    /* renamed from: c */
    public static float m6970c(String str) {
        if (f7296f > 0) {
            f7296f--;
            return 0.0f;
        } else if (!f7292b) {
            return 0.0f;
        } else {
            int i = f7295e - 1;
            f7295e = i;
            if (i == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f7293c[f7295e])) {
                C0968g.m2813a();
                return ((float) (System.nanoTime() - f7294d[f7295e])) / 1000000.0f;
            } else {
                StringBuilder sb = new StringBuilder("Unbalanced trace call ");
                sb.append(str);
                sb.append(". Expected ");
                sb.append(f7293c[f7295e]);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
