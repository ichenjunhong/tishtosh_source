package com.facebook.imagepipeline.common;

import com.C2240a;
import com.facebook.common.p927k.C13726b;

/* renamed from: com.facebook.imagepipeline.common.e */
public final class C13953e {

    /* renamed from: c */
    private static final C13953e f36402c = new C13953e(-1, false);

    /* renamed from: d */
    private static final C13953e f36403d = new C13953e(-2, false);

    /* renamed from: e */
    private static final C13953e f36404e = new C13953e(-1, true);

    /* renamed from: a */
    public final boolean f36405a;

    /* renamed from: b */
    private final int f36406b;

    /* renamed from: a */
    public static C13953e m28428a() {
        return f36402c;
    }

    /* renamed from: b */
    public static C13953e m28429b() {
        return f36403d;
    }

    /* renamed from: c */
    public static C13953e m28430c() {
        return f36404e;
    }

    /* renamed from: d */
    public final boolean mo26125d() {
        if (this.f36406b == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo26126e() {
        if (this.f36406b != -2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo26128f() {
        if (!mo26125d()) {
            return this.f36406b;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public final String toString() {
        return C2240a.m6773a(null, "%d defer:%b", new Object[]{Integer.valueOf(this.f36406b), Boolean.valueOf(this.f36405a)});
    }

    public final int hashCode() {
        int i;
        Integer valueOf = Integer.valueOf(this.f36406b);
        Boolean valueOf2 = Boolean.valueOf(this.f36405a);
        int i2 = 0;
        if (valueOf == null) {
            i = 0;
        } else {
            i = valueOf.hashCode();
        }
        if (valueOf2 != null) {
            i2 = valueOf2.hashCode();
        }
        return C13726b.m27772a(i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13953e)) {
            return false;
        }
        C13953e eVar = (C13953e) obj;
        if (this.f36406b == eVar.f36406b && this.f36405a == eVar.f36405a) {
            return true;
        }
        return false;
    }

    private C13953e(int i, boolean z) {
        this.f36406b = i;
        this.f36405a = z;
    }
}
