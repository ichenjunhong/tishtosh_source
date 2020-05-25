package com.facebook.imagepipeline.p970j;

/* renamed from: com.facebook.imagepipeline.j.g */
public final class C14046g implements C14047h {

    /* renamed from: a */
    public static final C14047h f36711a = m28725a(Integer.MAX_VALUE, true, true);

    /* renamed from: b */
    int f36712b;

    /* renamed from: c */
    boolean f36713c;

    /* renamed from: d */
    boolean f36714d;

    /* renamed from: a */
    public final int mo26274a() {
        return this.f36712b;
    }

    /* renamed from: b */
    public final boolean mo26275b() {
        return this.f36713c;
    }

    /* renamed from: c */
    public final boolean mo26276c() {
        return this.f36714d;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f36712b;
        int i3 = 0;
        if (this.f36713c) {
            i = 4194304;
        } else {
            i = 0;
        }
        int i4 = i2 ^ i;
        if (this.f36714d) {
            i3 = 8388608;
        }
        return i4 ^ i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14046g)) {
            return false;
        }
        C14046g gVar = (C14046g) obj;
        if (this.f36712b == gVar.f36712b && this.f36713c == gVar.f36713c && this.f36714d == gVar.f36714d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C14047h m28725a(int i, boolean z, boolean z2) {
        return new C14046g(i, z, z2);
    }

    private C14046g(int i, boolean z, boolean z2) {
        this.f36712b = i;
        this.f36713c = z;
        this.f36714d = z2;
    }
}
