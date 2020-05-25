package android.support.constraint.p020a.p021a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.h */
public class C0339h extends C0333e {

    /* renamed from: ar */
    protected C0333e[] f1040ar = new C0333e[4];

    /* renamed from: as */
    protected int f1041as;

    /* renamed from: x */
    public final void mo753x() {
        this.f1041as = 0;
    }

    /* renamed from: a */
    public final void mo752a(C0333e eVar) {
        if (this.f1041as + 1 > this.f1040ar.length) {
            this.f1040ar = (C0333e[]) Arrays.copyOf(this.f1040ar, this.f1040ar.length * 2);
        }
        this.f1040ar[this.f1041as] = eVar;
        this.f1041as++;
    }
}
