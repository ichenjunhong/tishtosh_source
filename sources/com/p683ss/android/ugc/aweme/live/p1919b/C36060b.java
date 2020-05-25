package com.p683ss.android.ugc.aweme.live.p1919b;

/* renamed from: com.ss.android.ugc.aweme.live.b.b */
public class C36060b implements C36059a {

    /* renamed from: a */
    private static volatile C36060b f92414a;

    private C36060b() {
    }

    /* renamed from: a */
    public static C36060b m81416a() {
        if (f92414a == null) {
            synchronized (C36060b.class) {
                if (f92414a == null) {
                    f92414a = new C36060b();
                }
            }
        }
        return f92414a;
    }
}
