package com.p683ss.android.ugc.aweme.sticker.panel;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.p */
public final class C46255p {

    /* renamed from: a */
    public final int f116700a;

    /* renamed from: b */
    public final int f116701b;

    /* renamed from: c */
    public final C46194l f116702c;

    /* renamed from: d */
    public final int f116703d;

    /* renamed from: e */
    public final int f116704e;

    /* renamed from: f */
    public final int f116705f;

    /* renamed from: g */
    public final boolean f116706g;

    /* renamed from: h */
    public final boolean f116707h;

    /* renamed from: i */
    public final boolean f116708i;

    public C46255p() {
        this(0, 0, null, 0, 0, 0, false, false, false, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46255p) {
                C46255p pVar = (C46255p) obj;
                if (this.f116700a == pVar.f116700a) {
                    if ((this.f116701b == pVar.f116701b) && C52711k.m112239a((Object) this.f116702c, (Object) pVar.f116702c)) {
                        if (this.f116703d == pVar.f116703d) {
                            if (this.f116704e == pVar.f116704e) {
                                if (this.f116705f == pVar.f116705f) {
                                    if (this.f116706g == pVar.f116706g) {
                                        if (this.f116707h == pVar.f116707h) {
                                            if (this.f116708i == pVar.f116708i) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f116700a * 31) + this.f116701b) * 31;
        C46194l lVar = this.f116702c;
        int hashCode = (((((((i + (lVar != null ? lVar.hashCode() : 0)) * 31) + this.f116703d) * 31) + this.f116704e) * 31) + this.f116705f) * 31;
        boolean z = this.f116706g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.f116707h;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f116708i;
        if (z3) {
            z3 = true;
        }
        return i3 + (z3 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerViewConfigure(tabBackgroundDrawableRes=");
        sb.append(this.f116700a);
        sb.append(", panelBackgroundDrawableRes=");
        sb.append(this.f116701b);
        sb.append(", reverseCameraConfigure=");
        sb.append(this.f116702c);
        sb.append(", tagLayoutTopMargin=");
        sb.append(this.f116703d);
        sb.append(", stickerViewHeight=");
        sb.append(this.f116704e);
        sb.append(", favoriteTintColor=");
        sb.append(this.f116705f);
        sb.append(", useNewPanel=");
        sb.append(this.f116706g);
        sb.append(", isSearchEnable=");
        sb.append(this.f116707h);
        sb.append(", isLockStickerEnable=");
        sb.append(this.f116708i);
        sb.append(")");
        return sb.toString();
    }

    private C46255p(int i, int i2, C46194l lVar, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.f116700a = i;
        this.f116701b = i2;
        this.f116702c = lVar;
        this.f116703d = i3;
        this.f116704e = i4;
        this.f116705f = i5;
        this.f116706g = z;
        this.f116707h = z2;
        this.f116708i = z3;
    }

    public /* synthetic */ C46255p(int i, int i2, C46194l lVar, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, int i6, C52707g gVar) {
        int i7;
        int i8;
        C46194l lVar2;
        int i9;
        boolean z4;
        int i10 = i6;
        boolean z5 = false;
        if ((i10 & 1) != 0) {
            i7 = 0;
        } else {
            i7 = i;
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        } else {
            i8 = i2;
        }
        if ((i10 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 32) != 0) {
            i9 = -1;
        } else {
            i9 = i5;
        }
        if ((i10 & 64) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i10 & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 0) {
            z5 = z3;
        }
        this(i7, i8, lVar2, 0, 0, i9, z4, false, z5);
    }
}
