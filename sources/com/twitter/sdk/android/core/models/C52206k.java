package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.k */
public final class C52206k {
    /* renamed from: a */
    public static <T> List<T> m111631a(List<T> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }
}
