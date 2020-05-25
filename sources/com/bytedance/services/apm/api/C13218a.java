package com.bytedance.services.apm.api;

/* renamed from: com.bytedance.services.apm.api.a */
public final class C13218a {

    /* renamed from: a */
    public static IEnsure f34488a;

    /* renamed from: a */
    public static IEnsure m26604a() {
        return f34488a;
    }

    /* renamed from: a */
    public static void m26605a(String str) {
        if (f34488a != null) {
            f34488a.ensureNotReachHere(str);
        }
    }

    /* renamed from: a */
    public static void m26606a(Throwable th) {
        if (f34488a != null) {
            f34488a.ensureNotReachHere(th);
        }
    }

    /* renamed from: a */
    public static void m26607a(Throwable th, String str) {
        if (f34488a != null) {
            f34488a.ensureNotReachHere(th, str);
        }
    }
}
