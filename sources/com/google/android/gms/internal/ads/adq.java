package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class adq {

    /* renamed from: a */
    final List<String> f40326a = new ArrayList();

    /* renamed from: b */
    final List<Double> f40327b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f40328c = new ArrayList();

    /* renamed from: a */
    public final adq mo28733a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f40326a.size()) {
            double doubleValue = ((Double) this.f40327b.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f40328c.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f40326a.add(i, str);
        this.f40327b.add(i, Double.valueOf(d));
        this.f40328c.add(i, Double.valueOf(d2));
        return this;
    }
}
