package com.bytedance.lighten.p766a;

/* renamed from: com.bytedance.lighten.a.p */
public enum C12202p {
    LOW,
    MEDIUM,
    HIGH;

    public static C12202p getHigherPriority(C12202p pVar, C12202p pVar2) {
        if (pVar == null) {
            return pVar2;
        }
        if (pVar2 != null && pVar.ordinal() <= pVar2.ordinal()) {
            return pVar2;
        }
        return pVar;
    }
}
