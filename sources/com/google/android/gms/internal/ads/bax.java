package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class bax extends AbstractList<String> implements ays, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ays f41737a;

    public bax(ays ays) {
        this.f41737a = ays;
    }

    /* renamed from: e */
    public final ays mo29858e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo29856b(int i) {
        return this.f41737a.mo29856b(i);
    }

    public final int size() {
        return this.f41737a.size();
    }

    /* renamed from: a */
    public final void mo29855a(awo awo) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new bay(this, i);
    }

    public final Iterator<String> iterator() {
        return new baz(this);
    }

    /* renamed from: d */
    public final List<?> mo29857d() {
        return this.f41737a.mo29857d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f41737a.get(i);
    }
}
