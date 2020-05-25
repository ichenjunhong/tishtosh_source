package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.c */
public class C14072c {

    /* renamed from: a */
    public static final int f36785a;

    /* renamed from: b */
    private static final Class<?> f36786b = C14072c.class;

    /* renamed from: c */
    private static int f36787c = 384;

    /* renamed from: d */
    private static volatile C14070b f36788d;

    /* renamed from: a */
    public static C14070b m28789a() {
        if (f36788d == null) {
            synchronized (C14072c.class) {
                if (f36788d == null) {
                    f36788d = new C14070b(f36787c, f36785a);
                }
            }
        }
        return f36788d;
    }

    static {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        f36785a = i;
    }
}
