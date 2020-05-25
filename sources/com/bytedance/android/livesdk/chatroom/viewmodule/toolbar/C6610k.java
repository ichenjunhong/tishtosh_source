package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.k */
public class C6610k {

    /* renamed from: a */
    private static volatile C6609j f17963a;

    /* renamed from: b */
    private static volatile C6609j f17964b;

    /* renamed from: c */
    private static volatile C6598b f17965c;

    private C6610k() {
    }

    /* renamed from: a */
    public static C6600d m13985a() {
        if (f17963a == null) {
            synchronized (C6610k.class) {
                if (f17963a == null) {
                    f17963a = new C6609j();
                }
            }
        }
        return f17963a;
    }

    /* renamed from: b */
    public static C6600d m13986b() {
        if (f17964b == null) {
            synchronized (C6610k.class) {
                if (f17964b == null) {
                    f17964b = new C6609j();
                }
            }
        }
        return f17964b;
    }

    /* renamed from: c */
    public static C6600d m13987c() {
        if (f17965c == null) {
            synchronized (C6610k.class) {
                if (f17965c == null) {
                    f17965c = new C6598b(m13985a(), m13986b());
                }
            }
        }
        return f17965c;
    }

    /* renamed from: d */
    static synchronized void m13988d() {
        synchronized (C6610k.class) {
            if (f17963a != null) {
                f17963a.mo12684a(true);
            }
            if (f17964b != null) {
                f17964b.mo12684a(true);
            }
            f17963a = new C6609j();
            f17964b = new C6609j();
            f17965c = new C6598b(f17963a, f17964b);
        }
    }

    /* renamed from: e */
    static synchronized void m13989e() {
        synchronized (C6610k.class) {
            if (f17964b != null) {
                f17964b.mo12684a(true);
            }
            if (f17963a != null) {
                f17963a.mo12684a(true);
            }
            f17965c = null;
            f17964b = null;
            f17963a = null;
        }
    }
}
