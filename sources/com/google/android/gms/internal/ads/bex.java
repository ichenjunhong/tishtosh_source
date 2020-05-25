package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class bex extends ayl<Integer, Long> {

    /* renamed from: a */
    public Long f42213a;

    /* renamed from: b */
    public Long f42214b;

    public bex() {
    }

    public bex(String str) {
        mo29842a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29842a(String str) {
        HashMap b = m34786b(str);
        if (b != null) {
            this.f42213a = (Long) b.get(Integer.valueOf(0));
            this.f42214b = (Long) b.get(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo29841a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f42213a);
        hashMap.put(Integer.valueOf(1), this.f42214b);
        return hashMap;
    }
}
