package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.base.ui.i */
public final class C23695i {

    /* renamed from: a */
    public Class<? extends C23689d> f63199a;

    /* renamed from: b */
    public String f63200b;

    /* renamed from: c */
    public Bundle f63201c;

    /* renamed from: d */
    public float f63202d;

    /* renamed from: e */
    public int f63203e;

    public final int hashCode() {
        return (this.f63200b.hashCode() * 31) + this.f63203e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23695i) {
            C23695i iVar = (C23695i) obj;
            if (this.f63200b.equals(iVar.f63200b) && this.f63203e == iVar.f63203e) {
                return true;
            }
        }
        return false;
    }

    public C23695i(Class<? extends C23689d> cls, String str, int i, float f, Bundle bundle) {
        this.f63199a = cls;
        this.f63200b = str;
        this.f63201c = bundle;
        this.f63203e = i;
        this.f63202d = f;
    }
}
