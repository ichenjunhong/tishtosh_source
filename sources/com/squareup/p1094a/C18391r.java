package com.squareup.p1094a;

/* renamed from: com.squareup.a.r */
public enum C18391r {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: a */
    final int f50788a;

    public static boolean shouldReadFromMemoryCache(int i) {
        if ((i & NO_CACHE.f50788a) == 0) {
            return true;
        }
        return false;
    }

    private C18391r(int i) {
        this.f50788a = i;
    }
}
