package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.ft */
final class C16692ft extends C16694fv {

    /* renamed from: a */
    private int f46937a;

    /* renamed from: b */
    private final int f46938b = this.f46939c.size();

    /* renamed from: c */
    private final /* synthetic */ C16691fs f46939c;

    C16692ft(C16691fs fsVar) {
        this.f46939c = fsVar;
    }

    public final boolean hasNext() {
        return this.f46937a < this.f46938b;
    }

    /* renamed from: a */
    public final byte mo32027a() {
        int i = this.f46937a;
        if (i < this.f46938b) {
            this.f46937a = i + 1;
            return this.f46939c.mo32014a(i);
        }
        throw new NoSuchElementException();
    }
}
