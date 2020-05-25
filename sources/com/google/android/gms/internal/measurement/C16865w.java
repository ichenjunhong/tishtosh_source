package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15464q;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w */
public final class C16865w {

    /* renamed from: a */
    public final long f47352a = 0;

    /* renamed from: b */
    public final String f47353b;

    /* renamed from: c */
    public final String f47354c;

    /* renamed from: d */
    public final boolean f47355d;

    /* renamed from: e */
    public long f47356e;

    /* renamed from: f */
    public final Map<String, String> f47357f;

    public C16865w(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C15464q.m32125a(str);
        C15464q.m32125a(str2);
        this.f47353b = str;
        this.f47354c = str2;
        this.f47355d = z;
        this.f47356e = j2;
        if (map != null) {
            this.f47357f = new HashMap(map);
        } else {
            this.f47357f = Collections.emptyMap();
        }
    }
}
