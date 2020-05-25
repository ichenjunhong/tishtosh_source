package com.p683ss.android.ugc.aweme.utils;

import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.utils.gi */
public final class C47917gi {
    /* renamed from: a */
    public static final <T> boolean m103681a(Collection<? extends T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m103680a(String str) {
        boolean z;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
