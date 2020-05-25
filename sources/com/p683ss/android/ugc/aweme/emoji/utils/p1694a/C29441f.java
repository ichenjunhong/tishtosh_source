package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.f */
public final class C29441f implements Cloneable {

    /* renamed from: a */
    public boolean f77085a;

    /* renamed from: b */
    public boolean f77086b;

    /* renamed from: c */
    public boolean f77087c;

    /* renamed from: d */
    boolean f77088d;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", e);
        }
    }

    public final int hashCode() {
        return (((((((this.f77087c ? 1 : 0) * true) + (this.f77088d ? 1 : 0)) * 13) + (this.f77085a ? 1 : 0)) * 7) + (this.f77086b ? 1 : 0)) * 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29441f)) {
            return false;
        }
        C29441f fVar = (C29441f) obj;
        if (fVar.f77087c == this.f77087c && fVar.f77088d == this.f77088d && fVar.f77085a == this.f77085a && fVar.f77086b == this.f77086b) {
            return true;
        }
        return false;
    }
}
