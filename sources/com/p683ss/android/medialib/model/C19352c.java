package com.p683ss.android.medialib.model;

import java.util.List;

/* renamed from: com.ss.android.medialib.model.c */
public class C19352c {

    /* renamed from: a */
    public long f53500a;

    /* renamed from: b */
    public double f53501b;

    /* renamed from: a */
    public static int m47249a(List<? extends C19352c> list) {
        int i = 0;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        for (C19352c cVar : list) {
            long j = (long) i;
            long j2 = cVar.f53500a;
            double d = cVar.f53501b;
            double d2 = (double) j2;
            Double.isNaN(d2);
            i = (int) (j + ((long) ((d2 * 1.0d) / d)));
        }
        return i;
    }

    public C19352c(long j, double d) {
        this.f53500a = j;
        this.f53501b = d;
    }
}
