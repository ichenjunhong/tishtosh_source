package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class bam implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f41720a;

    /* renamed from: b */
    private boolean f41721b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f41722c;

    /* renamed from: d */
    private final /* synthetic */ bae f41723d;

    private bam(bae bae) {
        this.f41723d = bae;
        this.f41720a = -1;
    }

    public final boolean hasNext() {
        if (this.f41720a + 1 < this.f41723d.f41706c.size() || (!this.f41723d.f41707d.isEmpty() && m35083a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f41721b) {
            this.f41721b = false;
            this.f41723d.m35070e();
            if (this.f41720a < this.f41723d.f41706c.size()) {
                bae bae = this.f41723d;
                int i = this.f41720a;
                this.f41720a = i - 1;
                bae.mo29917c(i);
                return;
            }
            m35083a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m35083a() {
        if (this.f41722c == null) {
            this.f41722c = this.f41723d.f41707d.entrySet().iterator();
        }
        return this.f41722c;
    }

    public final /* synthetic */ Object next() {
        this.f41721b = true;
        int i = this.f41720a + 1;
        this.f41720a = i;
        if (i < this.f41723d.f41706c.size()) {
            return (Entry) this.f41723d.f41706c.get(this.f41720a);
        }
        return (Entry) m35083a().next();
    }

    /* synthetic */ bam(bae bae, baf baf) {
        this(bae);
    }
}
