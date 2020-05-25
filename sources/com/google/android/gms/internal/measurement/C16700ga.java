package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ga */
final class C16700ga {

    /* renamed from: a */
    public final C16709gj f46950a;

    /* renamed from: b */
    private final byte[] f46951b;

    private C16700ga(int i) {
        this.f46951b = new byte[i];
        byte[] bArr = this.f46951b;
        this.f46950a = new C16710a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final C16691fs mo32036a() {
        if (this.f46950a.mo32128b() == 0) {
            return new C16702gc(this.f46951b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* synthetic */ C16700ga(int i, C16692ft ftVar) {
        this(i);
    }
}
