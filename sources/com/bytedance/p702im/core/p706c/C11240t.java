package com.bytedance.p702im.core.p706c;

/* renamed from: com.bytedance.im.core.c.t */
public final class C11240t implements Cloneable {

    /* renamed from: a */
    public String f30273a;

    /* renamed from: b */
    public long f30274b;

    /* renamed from: c */
    public long f30275c = Long.MIN_VALUE;

    /* renamed from: d */
    public long f30276d;

    /* renamed from: e */
    public long f30277e = -1;

    /* renamed from: a */
    public final C11240t mo20871a() {
        this.f30277e = -1;
        return this;
    }

    /* renamed from: b */
    public final boolean mo20874b() {
        if (this.f30277e > -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C11240t clone() {
        C11240t tVar = new C11240t();
        tVar.f30273a = this.f30273a;
        tVar.f30274b = this.f30274b;
        tVar.mo20872a(this.f30275c);
        tVar.mo20873b(this.f30276d);
        tVar.mo20876c(this.f30277e);
        return tVar;
    }

    /* renamed from: a */
    public final C11240t mo20872a(long j) {
        if (this.f30275c < j) {
            this.f30275c = j;
        }
        return this;
    }

    /* renamed from: b */
    public final C11240t mo20873b(long j) {
        if (this.f30276d < j) {
            this.f30276d = j;
        }
        return this;
    }

    /* renamed from: c */
    public final C11240t mo20876c(long j) {
        if (this.f30277e < j) {
            this.f30277e = j;
        }
        return this;
    }
}
