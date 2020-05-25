package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class bel extends ayl<Integer, Long> {

    /* renamed from: a */
    public long f42196a;

    /* renamed from: b */
    public long f42197b;

    public bel() {
        this.f42196a = -1;
        this.f42197b = -1;
    }

    public bel(String str) {
        this();
        mo29842a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo29841a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.f42196a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f42197b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29842a(String str) {
        HashMap b = m34786b(str);
        if (b != null) {
            this.f42196a = ((Long) b.get(Integer.valueOf(0))).longValue();
            this.f42197b = ((Long) b.get(Integer.valueOf(1))).longValue();
        }
    }
}
