package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@C16299uq
public final class adn {

    /* renamed from: a */
    private final String[] f40316a;

    /* renamed from: b */
    private final double[] f40317b;

    /* renamed from: c */
    private final double[] f40318c;

    /* renamed from: d */
    private final int[] f40319d;

    /* renamed from: e */
    private int f40320e;

    private adn(adq adq) {
        int size = adq.f40328c.size();
        this.f40316a = (String[]) adq.f40326a.toArray(new String[size]);
        this.f40317b = m32699a(adq.f40328c);
        this.f40318c = m32699a(adq.f40327b);
        this.f40319d = new int[size];
        this.f40320e = 0;
    }

    /* renamed from: a */
    private static double[] m32699a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final void mo28729a(double d) {
        this.f40320e++;
        int i = 0;
        while (i < this.f40318c.length) {
            if (this.f40318c[i] <= d && d < this.f40317b[i]) {
                int[] iArr = this.f40319d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f40318c[i]) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final List<adp> mo28728a() {
        ArrayList arrayList = new ArrayList(this.f40316a.length);
        for (int i = 0; i < this.f40316a.length; i++) {
            String str = this.f40316a[i];
            double d = this.f40318c[i];
            double d2 = this.f40317b[i];
            double d3 = (double) this.f40319d[i];
            double d4 = (double) this.f40320e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            adp adp = new adp(str, d, d2, d3 / d4, this.f40319d[i]);
            arrayList.add(adp);
        }
        return arrayList;
    }
}
