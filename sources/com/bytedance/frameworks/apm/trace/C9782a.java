package com.bytedance.frameworks.apm.trace;

import com.bytedance.apm.p476c.C8977a;
import java.util.HashSet;

/* renamed from: com.bytedance.frameworks.apm.trace.a */
public final class C9782a {

    /* renamed from: f */
    private static final C9782a f26623f = new C9782a();

    /* renamed from: a */
    public volatile boolean f26624a;

    /* renamed from: b */
    long[] f26625b = new long[4];

    /* renamed from: c */
    public final HashSet<C8977a> f26626c = new HashSet<>();

    /* renamed from: d */
    volatile long f26627d;

    /* renamed from: e */
    public boolean f26628e;

    /* renamed from: a */
    public static C9782a m19570a() {
        return f26623f;
    }

    /* renamed from: b */
    public final synchronized void mo17624b() {
        if (!this.f26628e) {
            throw new RuntimeException("never init!");
        } else if (!this.f26624a) {
            this.f26624a = true;
        }
    }

    /* renamed from: c */
    public final synchronized void mo17625c() {
        if (!this.f26628e) {
            throw new RuntimeException("MainThreadMonitor is never init!");
        } else if (this.f26624a) {
            this.f26624a = false;
        }
    }
}
