package com.bytedance.common.utility.p522b;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.bytedance.common.utility.b.c */
public final class C9377c<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 3805937866184666407L;

    /* renamed from: a */
    final int f25606a;

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<K, V> entry) {
        if (size() > this.f25606a) {
            return true;
        }
        return false;
    }

    public C9377c(int i, int i2) {
        this(i, i2, false);
    }

    public C9377c(int i, int i2, boolean z) {
        super(i2, 0.75f, true);
        this.f25606a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
