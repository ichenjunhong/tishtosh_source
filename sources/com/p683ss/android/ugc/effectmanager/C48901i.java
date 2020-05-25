package com.p683ss.android.ugc.effectmanager;

/* renamed from: com.ss.android.ugc.effectmanager.i */
public enum C48901i {
    ORIGIN(0),
    ZIP(1);
    

    /* renamed from: a */
    private int f123036a;

    public final int getValue() {
        return this.f123036a;
    }

    public static C48901i fromValue(int i) {
        C48901i[] values;
        for (C48901i iVar : values()) {
            if (iVar.f123036a == i) {
                return iVar;
            }
        }
        return ORIGIN;
    }

    private C48901i(int i) {
        this.f123036a = i;
    }
}
