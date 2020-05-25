package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo28509a();

    /* renamed from: b */
    public abstract int mo28510b();

    /* renamed from: c */
    public abstract long mo28511c();

    /* renamed from: d */
    public abstract String mo28512d();

    public String toString() {
        long a = mo28509a();
        int b = mo28510b();
        long c = mo28511c();
        String d = mo28512d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53);
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
