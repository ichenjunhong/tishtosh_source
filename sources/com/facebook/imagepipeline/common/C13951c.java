package com.facebook.imagepipeline.common;

/* renamed from: com.facebook.imagepipeline.common.c */
public enum C13951c {
    LOW,
    MEDIUM,
    HIGH;

    public static C13951c getHigherPriority(C13951c cVar, C13951c cVar2) {
        if (cVar == null) {
            return cVar2;
        }
        if (cVar2 != null && cVar.ordinal() <= cVar2.ordinal()) {
            return cVar2;
        }
        return cVar;
    }
}
