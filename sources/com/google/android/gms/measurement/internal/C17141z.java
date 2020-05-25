package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z */
final class C17141z implements Runnable {

    /* renamed from: a */
    private final C17140y f48468a;

    /* renamed from: b */
    private final int f48469b;

    /* renamed from: c */
    private final Throwable f48470c;

    /* renamed from: d */
    private final byte[] f48471d;

    /* renamed from: e */
    private final String f48472e;

    /* renamed from: f */
    private final Map<String, List<String>> f48473f;

    private C17141z(String str, C17140y yVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C15464q.m32123a(yVar);
        this.f48468a = yVar;
        this.f48469b = i;
        this.f48470c = th;
        this.f48471d = bArr;
        this.f48472e = str;
        this.f48473f = map;
    }

    public final void run() {
        this.f48468a.mo33120a(this.f48472e, this.f48469b, this.f48470c, this.f48471d, this.f48473f);
    }
}
