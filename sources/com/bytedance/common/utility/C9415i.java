package com.bytedance.common.utility;

/* renamed from: com.bytedance.common.utility.i */
public final class C9415i {

    /* renamed from: a */
    private static int f25656a = 4;

    /* renamed from: b */
    private static C9419b f25657b = C9418a.f25658a;

    /* renamed from: com.bytedance.common.utility.i$a */
    static class C9417a extends C9419b {

        /* renamed from: com.bytedance.common.utility.i$a$a */
        static class C9418a {

            /* renamed from: a */
            public static final C9417a f25658a = new C9417a();
        }

        private C9417a() {
        }
    }

    /* renamed from: com.bytedance.common.utility.i$b */
    public static abstract class C9419b {
    }

    /* renamed from: a */
    public static int m18632a() {
        return f25656a;
    }

    /* renamed from: b */
    public static boolean m18635b() {
        if (f25656a <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m18633a(int i) {
        f25656a = i;
    }

    /* renamed from: a */
    public static void m18634a(Throwable th) {
        if (th != null && m18635b()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }
}
