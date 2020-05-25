package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.jx */
public final class C16815jx extends AbstractList<String> implements C16757ht, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16757ht f47220a;

    public C16815jx(C16757ht htVar) {
        this.f47220a = htVar;
    }

    /* renamed from: e */
    public final C16757ht mo32262e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo32260b(int i) {
        return this.f47220a.mo32260b(i);
    }

    public final int size() {
        return this.f47220a.size();
    }

    /* renamed from: a */
    public final void mo32259a(C16691fs fsVar) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C16816jy(this, i);
    }

    public final Iterator<String> iterator() {
        return new C16817jz(this);
    }

    /* renamed from: d */
    public final List<?> mo32261d() {
        return this.f47220a.mo32261d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f47220a.get(i);
    }
}
