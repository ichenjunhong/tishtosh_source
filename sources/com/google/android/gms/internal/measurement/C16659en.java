package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.en */
public final class C16659en {

    /* renamed from: a */
    public final List<C16658em> f46872a;

    /* renamed from: b */
    public final List<C16658em> f46873b;

    /* renamed from: c */
    public final List<C16658em> f46874c;

    /* renamed from: d */
    public final List<C16658em> f46875d;

    /* renamed from: e */
    public final List<C16658em> f46876e;

    /* renamed from: f */
    public final List<C16658em> f46877f;

    public final String toString() {
        String valueOf = String.valueOf(this.f46872a);
        String valueOf2 = String.valueOf(this.f46873b);
        String valueOf3 = String.valueOf(this.f46874c);
        String valueOf4 = String.valueOf(this.f46875d);
        String valueOf5 = String.valueOf(this.f46876e);
        String valueOf6 = String.valueOf(this.f46877f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 102 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Positive predicates: ");
        sb.append(valueOf);
        sb.append("  Negative predicates: ");
        sb.append(valueOf2);
        sb.append("  Add tags: ");
        sb.append(valueOf3);
        sb.append("  Remove tags: ");
        sb.append(valueOf4);
        sb.append("  Add macros: ");
        sb.append(valueOf5);
        sb.append("  Remove macros: ");
        sb.append(valueOf6);
        return sb.toString();
    }
}
