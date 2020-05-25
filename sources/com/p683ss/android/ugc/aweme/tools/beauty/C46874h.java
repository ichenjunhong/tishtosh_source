package com.p683ss.android.ugc.aweme.tools.beauty;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.h */
public final class C46874h {

    /* renamed from: a */
    public static final C46874h f118412a = new C46874h();

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.h$a */
    public static final class C46875a {

        /* renamed from: a */
        public boolean f118413a;

        /* renamed from: b */
        public int f118414b;

        /* renamed from: c */
        public int f118415c;

        /* renamed from: d */
        public int f118416d;

        /* renamed from: e */
        public int f118417e;

        /* renamed from: f */
        public int f118418f;

        /* renamed from: g */
        public int f118419g;

        /* renamed from: h */
        public int f118420h;

        /* renamed from: i */
        public boolean f118421i;

        public C46875a() {
            this(false, 0, 0, 0, 0, 0, 0, 0, false, 511, null);
        }

        private C46875a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
            this.f118413a = z;
            this.f118414b = i;
            this.f118415c = i2;
            this.f118416d = i3;
            this.f118417e = i4;
            this.f118418f = i5;
            this.f118419g = i6;
            this.f118420h = i7;
            this.f118421i = z2;
        }

        public /* synthetic */ C46875a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, int i8, C52707g gVar) {
            boolean z3;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = i8;
            int i14 = 0;
            if ((i13 & 1) != 0) {
                z3 = false;
            } else {
                z3 = z;
            }
            int i15 = 100;
            if ((i13 & 2) != 0) {
                i9 = 100;
            } else {
                i9 = i;
            }
            if ((i13 & 4) != 0) {
                i10 = 100;
            } else {
                i10 = i2;
            }
            if ((i13 & 16) == 0) {
                i15 = i4;
            }
            if ((i13 & 32) != 0) {
                i11 = 0;
            } else {
                i11 = i5;
            }
            if ((i13 & 64) != 0) {
                i12 = 0;
            } else {
                i12 = i6;
            }
            if ((i13 & 128) == 0) {
                i14 = i7;
            }
            this(z3, i9, i10, 0, i15, i11, i12, i14, false);
        }
    }

    private C46874h() {
    }

    /* renamed from: a */
    public static float m101796a(C46875a aVar) {
        C52711k.m112240b(aVar, "data");
        if (!aVar.f118413a) {
            return ((float) (aVar.f118417e * aVar.f118420h)) / 100.0f;
        }
        if (((float) aVar.f118420h) >= ((float) aVar.f118414b) / 2.0f) {
            return (((((float) aVar.f118420h) - (((float) aVar.f118414b) / 2.0f)) * 2.0f) * ((float) aVar.f118417e)) / 100.0f;
        }
        return ((((((float) aVar.f118414b) / 2.0f) - ((float) aVar.f118420h)) * 2.0f) * ((float) aVar.f118418f)) / 100.0f;
    }

    /* renamed from: b */
    public static C46875a m101797b(C46875a aVar) {
        C52711k.m112240b(aVar, "data");
        C46875a aVar2 = new C46875a(false, 0, 0, 0, 0, 0, 0, 0, false, 511, null);
        boolean z = true;
        if (aVar.f118413a) {
            aVar2.f118415c = 50;
            aVar2.f118416d = -50;
            if (aVar.f118419g >= 0) {
                aVar2.f118420h = (int) (((((float) aVar.f118419g) / ((float) aVar.f118417e)) * 50.0f) + 50.0f);
            } else {
                aVar2.f118420h = (int) (50.0f - ((((float) aVar.f118419g) / ((float) aVar.f118418f)) * 50.0f));
            }
            if (aVar2.f118420h != 50) {
                z = false;
            }
            aVar2.f118421i = z;
        } else {
            aVar2.f118415c = 100;
            aVar2.f118416d = 0;
            aVar2.f118420h = (int) ((((float) aVar.f118419g) / ((float) aVar.f118417e)) * 100.0f);
            if (aVar2.f118420h != 0) {
                z = false;
            }
            aVar2.f118421i = z;
        }
        return aVar2;
    }
}
