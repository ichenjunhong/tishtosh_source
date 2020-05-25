package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class bfh extends ayl<Integer, Long> {

    /* renamed from: a */
    public Long f42258a;

    /* renamed from: b */
    public Long f42259b;

    /* renamed from: c */
    public Long f42260c;

    /* renamed from: d */
    public Long f42261d;

    public bfh() {
    }

    public bfh(String str) {
        mo29842a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29842a(String str) {
        HashMap b = m34786b(str);
        if (b != null) {
            this.f42258a = (Long) b.get(Integer.valueOf(0));
            this.f42259b = (Long) b.get(Integer.valueOf(1));
            this.f42260c = (Long) b.get(Integer.valueOf(2));
            this.f42261d = (Long) b.get(Integer.valueOf(3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo29841a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f42258a);
        hashMap.put(Integer.valueOf(1), this.f42259b);
        hashMap.put(Integer.valueOf(2), this.f42260c);
        hashMap.put(Integer.valueOf(3), this.f42261d);
        return hashMap;
    }
}
