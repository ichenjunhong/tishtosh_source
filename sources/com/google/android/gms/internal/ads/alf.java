package com.google.android.gms.internal.ads;

@C16299uq
public final class alf extends akt {
    public alf(aib aib) {
        super(aib);
    }

    /* renamed from: a */
    public final void mo29088a() {
    }

    /* renamed from: a */
    public final boolean mo29093a(String str) {
        aib aib = (aib) this.f40784c.get();
        if (aib != null) {
            aib.mo28933a(mo29095b(str), (akt) this);
        }
        abv.m32798e("VideoStreamNoopCache is doing nothing.");
        mo29092a(str, mo29095b(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
