package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ban extends ayl<Integer, Object> {

    /* renamed from: a */
    public String f41724a;

    /* renamed from: b */
    public long f41725b;

    /* renamed from: c */
    public String f41726c;

    /* renamed from: d */
    public String f41727d;

    /* renamed from: e */
    public String f41728e;

    public ban(String str) {
        this();
        mo29842a(str);
    }

    public ban() {
        this.f41724a = "E";
        this.f41725b = -1;
        this.f41726c = "E";
        this.f41727d = "E";
        this.f41728e = "E";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29842a(String str) {
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        HashMap b = m34786b(str);
        if (b != null) {
            if (b.get(Integer.valueOf(0)) == null) {
                str2 = "E";
            } else {
                str2 = (String) b.get(Integer.valueOf(0));
            }
            this.f41724a = str2;
            if (b.get(Integer.valueOf(1)) == null) {
                j = -1;
            } else {
                j = ((Long) b.get(Integer.valueOf(1))).longValue();
            }
            this.f41725b = j;
            if (b.get(Integer.valueOf(2)) == null) {
                str3 = "E";
            } else {
                str3 = (String) b.get(Integer.valueOf(2));
            }
            this.f41726c = str3;
            if (b.get(Integer.valueOf(3)) == null) {
                str4 = "E";
            } else {
                str4 = (String) b.get(Integer.valueOf(3));
            }
            this.f41727d = str4;
            if (b.get(Integer.valueOf(4)) == null) {
                str5 = "E";
            } else {
                str5 = (String) b.get(Integer.valueOf(4));
            }
            this.f41728e = str5;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo29841a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f41724a);
        hashMap.put(Integer.valueOf(4), this.f41728e);
        hashMap.put(Integer.valueOf(3), this.f41727d);
        hashMap.put(Integer.valueOf(2), this.f41726c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f41725b));
        return hashMap;
    }
}
