package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C14963ax;

@C16299uq
public final class abp {

    /* renamed from: a */
    public final Object f40197a;

    /* renamed from: b */
    public int f40198b;

    /* renamed from: c */
    public int f40199c;

    /* renamed from: d */
    public final abq f40200d;

    /* renamed from: e */
    public final String f40201e;

    public abp(String str) {
        this(C14963ax.m30834d().f40165c, str);
    }

    private abp(abq abq, String str) {
        this.f40197a = new Object();
        this.f40200d = abq;
        this.f40201e = str;
    }

    /* renamed from: a */
    public final Bundle mo28607a() {
        Bundle bundle;
        synchronized (this.f40197a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f40198b);
            bundle.putInt("pmnll", this.f40199c);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abp abp = (abp) obj;
        if (this.f40201e != null) {
            return this.f40201e.equals(abp.f40201e);
        }
        return abp.f40201e == null;
    }

    public final int hashCode() {
        if (this.f40201e != null) {
            return this.f40201e.hashCode();
        }
        return 0;
    }
}
