package com.p683ss.android.ttve.common;

/* renamed from: com.ss.android.ttve.common.i */
public class C20080i {

    /* renamed from: b */
    private static volatile C20080i f55202b;

    /* renamed from: a */
    public TESpdLogInvoker f55203a = new TESpdLogInvoker();

    /* renamed from: com.ss.android.ttve.common.i$a */
    public enum C20081a {
        LEVEL0,
        LEVEL1,
        LEVEL2,
        LEVEL3
    }

    private C20080i() {
    }

    /* renamed from: a */
    public static C20080i m49592a() {
        if (f55202b == null) {
            synchronized (C20080i.class) {
                if (f55202b == null) {
                    f55202b = new C20080i();
                }
            }
        }
        return f55202b;
    }
}
