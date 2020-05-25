package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1034a.C15204a;

/* renamed from: com.google.android.gms.internal.measurement.bd */
public final class C16560bd<V> {

    /* renamed from: a */
    public final V f46547a;

    /* renamed from: b */
    private final C15204a<V> f46548b;

    C16560bd(C15204a<V> aVar, V v) {
        C15464q.m32123a(aVar);
        this.f46548b = aVar;
        this.f46547a = v;
    }

    /* renamed from: a */
    static C16560bd<Boolean> m39515a(String str, boolean z, boolean z2) {
        return new C16560bd<>(C15204a.m31450a(str, z2), Boolean.valueOf(z));
    }

    /* renamed from: a */
    static C16560bd<String> m39514a(String str, String str2, String str3) {
        return new C16560bd<>(C15204a.m31449a(str, str3), str2);
    }

    /* renamed from: a */
    static C16560bd<Long> m39513a(String str, long j, long j2) {
        return new C16560bd<>(C15204a.m31448a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* renamed from: a */
    static C16560bd<Integer> m39512a(String str, int i, int i2) {
        return new C16560bd<>(C15204a.m31447a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }
}
