package com.p683ss.android.ugc.aweme.base.utils;

import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.base.utils.d */
public final class C23715d {
    /* renamed from: a */
    public static <T> boolean m58202a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m58204b(Collection<T> collection) {
        if (collection == null || collection.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m58203a(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return true;
        }
        return false;
    }
}
