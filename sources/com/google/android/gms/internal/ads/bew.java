package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class bew extends ayl<Integer, Object> {

    /* renamed from: a */
    public Long f42210a;

    /* renamed from: b */
    public Boolean f42211b;

    /* renamed from: c */
    public Boolean f42212c;

    public bew() {
    }

    public bew(String str) {
        mo29842a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29842a(String str) {
        HashMap b = m34786b(str);
        if (b != null) {
            this.f42210a = (Long) b.get(Integer.valueOf(0));
            this.f42211b = (Boolean) b.get(Integer.valueOf(1));
            this.f42212c = (Boolean) b.get(Integer.valueOf(2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo29841a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f42210a);
        hashMap.put(Integer.valueOf(1), this.f42211b);
        hashMap.put(Integer.valueOf(2), this.f42212c);
        return hashMap;
    }
}
