package com.bytedance.android.live.core.p222a;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.live.core.a.d */
final class C3813d<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private final int f10760a;

    public C3813d(int i) {
        super(i, 0.75f, true);
        this.f10760a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry entry) {
        if (size() > this.f10760a) {
            return true;
        }
        return false;
    }
}
