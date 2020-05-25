package com.facebook.imagepipeline.memory;

import com.facebook.common.p924h.C13717b;
import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.z */
final class C14100z<V> extends C14075f<V> {

    /* renamed from: f */
    private LinkedList<C13717b<V>> f36826f = new LinkedList<>();

    /* renamed from: b */
    public final V mo26334b() {
        V v;
        C13717b bVar = (C13717b) this.f36791c.poll();
        if (bVar.f35695a == null) {
            v = null;
        } else {
            v = bVar.f35695a.get();
        }
        if (bVar.f35695a != null) {
            bVar.f35695a.clear();
            bVar.f35695a = null;
        }
        if (bVar.f35696b != null) {
            bVar.f35696b.clear();
            bVar.f35696b = null;
        }
        if (bVar.f35697c != null) {
            bVar.f35697c.clear();
            bVar.f35697c = null;
        }
        this.f36826f.add(bVar);
        return v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26333a(V v) {
        C13717b bVar = (C13717b) this.f36826f.poll();
        if (bVar == null) {
            bVar = new C13717b();
        }
        bVar.f35695a = new SoftReference<>(v);
        bVar.f35696b = new SoftReference<>(v);
        bVar.f35697c = new SoftReference<>(v);
        this.f36791c.add(bVar);
    }

    public C14100z(int i, int i2, int i3) {
        super(i, i2, 0, false);
    }
}
