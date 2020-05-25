package com.bytedance.lighten.loader;

import com.facebook.common.p921e.C13697a;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p948b.C13867b;
import com.facebook.fresco.animation.p948b.p950b.C13868a;
import com.facebook.fresco.animation.p948b.p950b.C13869b;
import com.facebook.fresco.animation.p948b.p950b.C13872d;

/* renamed from: com.bytedance.lighten.loader.e */
final class C12225e implements C13868a {

    /* renamed from: a */
    private static final Class<?> f32308a = C13872d.class;

    /* renamed from: b */
    private final int f32309b;

    /* renamed from: c */
    private int[] f32310c;

    /* renamed from: d */
    private C12226f f32311d;

    public C12225e(int[] iArr, C12226f fVar) {
        this(3, iArr, fVar);
    }

    private C12225e(int i, int[] iArr, C12226f fVar) {
        this.f32309b = 3;
        this.f32310c = iArr;
        this.f32311d = fVar;
    }

    /* renamed from: a */
    public final void mo23159a(C13869b bVar, C13867b bVar2, C13857a aVar, int i) {
        for (int i2 = 1; i2 <= this.f32309b; i2++) {
            int i3 = this.f32310c[(this.f32311d.f32313b + i2) % this.f32310c.length];
            if (i3 >= this.f32311d.f32312a.mo26005d()) {
                C13697a.m27694c(f32308a, "Preparing frame %d, last drawn: %d, but preparing frame is out of bounds", Integer.valueOf(i3), Integer.valueOf(i));
                return;
            }
            if (C13697a.m27683a(2)) {
                C13697a.m27674a(f32308a, "Preparing frame %d, last drawn: %d", (Object) Integer.valueOf(i3), (Object) Integer.valueOf(i));
            }
            bVar.mo26017a(bVar2, aVar, i3);
        }
    }
}
