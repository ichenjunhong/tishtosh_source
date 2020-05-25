package com.bytedance.common.utility.p522b;

import java.util.List;

/* renamed from: com.bytedance.common.utility.b.a */
public final class C9375a {
    /* renamed from: a */
    public static long[] m18556a(List<Long> list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }
}
