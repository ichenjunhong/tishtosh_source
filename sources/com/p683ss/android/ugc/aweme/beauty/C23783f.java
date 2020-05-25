package com.p683ss.android.ugc.aweme.beauty;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.beauty.f */
public final class C23783f {

    /* renamed from: a */
    public boolean f63377a;

    /* renamed from: b */
    public int f63378b;

    /* renamed from: c */
    public int f63379c;

    /* renamed from: d */
    public int f63380d;

    /* renamed from: e */
    public int f63381e;

    /* renamed from: f */
    public int f63382f;

    /* renamed from: g */
    public int f63383g;

    /* renamed from: h */
    public int f63384h;

    public C23783f() {
        this(false, 0, 0, 0, 0, 0, 0, 0, NormalGiftView.ALPHA_255, null);
    }

    private C23783f(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f63377a = z;
        this.f63378b = i;
        this.f63379c = i2;
        this.f63380d = i3;
        this.f63381e = i4;
        this.f63382f = i5;
        this.f63383g = i6;
        this.f63384h = i7;
    }

    public /* synthetic */ C23783f(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C52707g gVar) {
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12 = i8;
        int i13 = 0;
        if ((i12 & 1) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        int i14 = 100;
        if ((i12 & 2) != 0) {
            i9 = 100;
        } else {
            i9 = i;
        }
        if ((i12 & 4) != 0) {
            i10 = 100;
        } else {
            i10 = i2;
        }
        if ((i12 & 16) == 0) {
            i14 = i4;
        }
        if ((i12 & 32) != 0) {
            i11 = 0;
        } else {
            i11 = i5;
        }
        if ((i12 & 128) == 0) {
            i13 = i7;
        }
        this(z2, i9, i10, 0, i14, i11, 0, i13);
    }
}
