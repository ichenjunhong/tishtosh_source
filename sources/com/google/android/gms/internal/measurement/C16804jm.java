package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jm */
final class C16804jm implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f47204a;

    /* renamed from: b */
    private boolean f47205b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f47206c;

    /* renamed from: d */
    private final /* synthetic */ C16796je f47207d;

    private C16804jm(C16796je jeVar) {
        this.f47207d = jeVar;
        this.f47204a = -1;
    }

    public final boolean hasNext() {
        if (this.f47204a + 1 < this.f47207d.f47190c.size() || (!this.f47207d.f47191d.isEmpty() && m40604a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f47205b) {
            this.f47205b = false;
            this.f47207d.m40591e();
            if (this.f47204a < this.f47207d.f47190c.size()) {
                C16796je jeVar = this.f47207d;
                int i = this.f47204a;
                this.f47204a = i - 1;
                jeVar.mo32318c(i);
                return;
            }
            m40604a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m40604a() {
        if (this.f47206c == null) {
            this.f47206c = this.f47207d.f47191d.entrySet().iterator();
        }
        return this.f47206c;
    }

    public final /* synthetic */ Object next() {
        this.f47205b = true;
        int i = this.f47204a + 1;
        this.f47204a = i;
        if (i < this.f47207d.f47190c.size()) {
            return (Entry) this.f47207d.f47190c.get(this.f47204a);
        }
        return (Entry) m40604a().next();
    }

    /* synthetic */ C16804jm(C16796je jeVar, C16797jf jfVar) {
        this(jeVar);
    }
}
