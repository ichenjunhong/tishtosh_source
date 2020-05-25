package com.p683ss.android.ugc.aweme.notice.api.bean;

import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.h */
public class C38041h {

    /* renamed from: a */
    public int f96815a;

    /* renamed from: b */
    public int f96816b;

    /* renamed from: c */
    public HashMap<Integer, Integer> f96817c;

    public C38041h() {
    }

    public C38041h(int i) {
        this.f96815a = i;
    }

    public C38041h(HashMap<Integer, Integer> hashMap) {
        this.f96817c = hashMap;
    }

    /* renamed from: a */
    public final int mo77565a(int i) {
        try {
            return ((Integer) this.f96817c.get(Integer.valueOf(i))).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final boolean mo77566b(int i) {
        boolean z;
        if (this.f96817c == null || this.f96817c.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if ((!z || !this.f96817c.containsKey(Integer.valueOf(i))) && this.f96815a != i) {
            return false;
        }
        return true;
    }

    public C38041h(int i, int i2) {
        this.f96815a = i;
        this.f96816b = i2;
    }
}
