package com.p683ss.android.ugc.aweme.profile.util;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ac */
public class C40527ac {

    /* renamed from: a */
    private static final boolean f103421a = false;

    /* renamed from: b */
    private static volatile C40527ac f103422b;

    private C40527ac() {
        if (f103422b != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: a */
    public static C40527ac m89932a() {
        if (f103422b == null) {
            synchronized (C40527ac.class) {
                if (f103422b == null) {
                    f103422b = new C40527ac();
                }
            }
        }
        return f103422b;
    }
}
