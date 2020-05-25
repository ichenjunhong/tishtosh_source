package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public final class C15146a {

    /* renamed from: b */
    private static int f39183b = 31;

    /* renamed from: a */
    public int f39184a = 1;

    /* renamed from: a */
    public final C15146a mo27949a(Object obj) {
        this.f39184a = (f39183b * this.f39184a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C15146a mo27950a(boolean z) {
        this.f39184a = (f39183b * this.f39184a) + (z ? 1 : 0);
        return this;
    }
}
