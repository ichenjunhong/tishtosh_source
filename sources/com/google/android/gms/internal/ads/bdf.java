package com.google.android.gms.internal.ads;

public abstract class bdf {
    /* renamed from: a */
    public abstract void mo30051a(String str);

    /* renamed from: a */
    public static bdf m35439a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new bda(cls.getSimpleName());
        }
        return new bdc(cls.getSimpleName());
    }
}
