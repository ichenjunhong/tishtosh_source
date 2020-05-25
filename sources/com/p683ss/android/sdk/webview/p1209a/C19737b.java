package com.p683ss.android.sdk.webview.p1209a;

/* renamed from: com.ss.android.sdk.webview.a.b */
public final class C19737b {

    /* renamed from: b */
    private static C19737b f54400b;

    /* renamed from: a */
    private C19736a f54401a;

    /* renamed from: a */
    public static C19736a m48249a() {
        return m48251b().f54401a;
    }

    /* renamed from: b */
    private static C19737b m48251b() {
        if (f54400b != null) {
            return f54400b;
        }
        throw new IllegalStateException("请先调用holdService初始化");
    }

    private C19737b(C19736a aVar) {
        this.f54401a = aVar;
    }

    /* renamed from: a */
    public static synchronized void m48250a(C19736a aVar) {
        synchronized (C19737b.class) {
            if (f54400b == null) {
                f54400b = new C19737b(aVar);
            } else {
                f54400b.f54401a = aVar;
            }
        }
    }
}
