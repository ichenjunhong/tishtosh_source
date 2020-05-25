package com.facebook.p982j.p986c;

import com.C2240a;
import com.facebook.p982j.p984b.C14413d;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.j.c.c */
public final class C14439c {
    /* renamed from: a */
    public static boolean m29544a(List<C14413d> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(((C14413d) list.get(i)).f37417a);
            if (hashSet.contains(valueOf)) {
                return false;
            }
            hashSet.add(valueOf);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m29545a(float[][][] fArr, int i) {
        if (i <= 1 && (fArr == null || fArr.length == 0)) {
            return true;
        }
        if (i - 1 != fArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2].length != 2) {
                return false;
            }
            for (float[] length : fArr[i2]) {
                if (length.length != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> T m29543a(T t, boolean z, String str) {
        if (z) {
            return t;
        }
        throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "Illegal argument for %s.", new Object[]{str}));
    }
}
