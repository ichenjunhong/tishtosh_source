package com.squareup.p1094a;

/* renamed from: com.squareup.a.s */
public enum C18392s {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: a */
    final int f50790a;

    public static boolean isOfflineOnly(int i) {
        if ((i & OFFLINE.f50790a) != 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldReadFromDiskCache(int i) {
        if ((i & NO_CACHE.f50790a) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToDiskCache(int i) {
        if ((i & NO_STORE.f50790a) == 0) {
            return true;
        }
        return false;
    }

    private C18392s(int i) {
        this.f50790a = i;
    }
}
