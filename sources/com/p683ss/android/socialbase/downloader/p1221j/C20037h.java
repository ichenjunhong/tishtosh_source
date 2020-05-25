package com.p683ss.android.socialbase.downloader.p1221j;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.ss.android.socialbase.downloader.j.h */
public final class C20037h<K, T> extends LinkedHashMap<K, T> {

    /* renamed from: a */
    private int f55021a;

    public C20037h() {
        this(4, 4);
    }

    public final void setMaxSize(int i) {
        this.f55021a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<K, T> entry) {
        if (size() > this.f55021a) {
            return true;
        }
        return false;
    }

    public C20037h(int i, int i2) {
        super(i, 0.75f, true);
        setMaxSize(i2);
    }
}
