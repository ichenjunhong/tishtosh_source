package com.facebook.imagepipeline.common;

import com.C2240a;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p927k.C13726b;

/* renamed from: com.facebook.imagepipeline.common.d */
public final class C13952d {

    /* renamed from: a */
    public final int f36398a;

    /* renamed from: b */
    public final int f36399b;

    /* renamed from: c */
    public final float f36400c;

    /* renamed from: d */
    public final float f36401d;

    public final int hashCode() {
        return C13726b.m27772a(this.f36398a, this.f36399b);
    }

    public final String toString() {
        return C2240a.m6773a(null, "%dx%d", new Object[]{Integer.valueOf(this.f36398a), Integer.valueOf(this.f36399b)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13952d)) {
            return false;
        }
        C13952d dVar = (C13952d) obj;
        if (this.f36398a == dVar.f36398a && this.f36399b == dVar.f36399b) {
            return true;
        }
        return false;
    }

    public C13952d(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    private C13952d(int i, int i2, float f) {
        this(i, i2, 2048.0f, 0.6666667f);
    }

    private C13952d(int i, int i2, float f, float f2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i2 > 0) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        this.f36398a = i;
        this.f36399b = i2;
        this.f36400c = f;
        this.f36401d = 0.6666667f;
    }
}
