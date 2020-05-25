package com.facebook.fresco.animation.p948b.p950b;

import com.facebook.common.p921e.C13697a;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p948b.C13867b;

/* renamed from: com.facebook.fresco.animation.b.b.d */
public class C13872d implements C13868a {

    /* renamed from: a */
    private static final Class<?> f36188a = C13872d.class;

    /* renamed from: b */
    private final int f36189b;

    public C13872d() {
        this(3);
    }

    public C13872d(int i) {
        this.f36189b = i;
    }

    /* renamed from: a */
    public final void mo23159a(C13869b bVar, C13867b bVar2, C13857a aVar, int i) {
        for (int i2 = 1; i2 <= this.f36189b; i2++) {
            int d = (i + i2) % aVar.mo26005d();
            if (C13697a.m27683a(2)) {
                C13697a.m27674a(f36188a, "Preparing frame %d, last drawn: %d", (Object) Integer.valueOf(d), (Object) Integer.valueOf(i));
            }
            bVar.mo26017a(bVar2, aVar, d);
        }
    }
}
