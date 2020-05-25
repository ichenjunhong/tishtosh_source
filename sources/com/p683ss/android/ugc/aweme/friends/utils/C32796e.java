package com.p683ss.android.ugc.aweme.friends.utils;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.friends.utils.e */
public final class C32796e {
    @C17952c(mo34828a = "interval")

    /* renamed from: a */
    public long f85390a;
    @C17952c(mo34828a = "homepage_hot")

    /* renamed from: b */
    public boolean f85391b;
    @C17952c(mo34828a = "homepage_hot_index")

    /* renamed from: c */
    public int f85392c;
    @C17952c(mo34828a = "me_tab")

    /* renamed from: d */
    public boolean f85393d;
    @C17952c(mo34828a = "inbox_tab")

    /* renamed from: e */
    public boolean f85394e;
    @C17952c(mo34828a = "homepage_follow")

    /* renamed from: f */
    public boolean f85395f;
    @C17952c(mo34828a = "profile_recommend")

    /* renamed from: g */
    public boolean f85396g;
    @C17952c(mo34828a = "freq_limit")

    /* renamed from: h */
    public int f85397h;

    public C32796e() {
        this(0, false, 0, false, false, false, false, 0, NormalGiftView.ALPHA_255, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32796e) {
                C32796e eVar = (C32796e) obj;
                if (this.f85390a == eVar.f85390a) {
                    if (this.f85391b == eVar.f85391b) {
                        if (this.f85392c == eVar.f85392c) {
                            if (this.f85393d == eVar.f85393d) {
                                if (this.f85394e == eVar.f85394e) {
                                    if (this.f85395f == eVar.f85395f) {
                                        if (this.f85396g == eVar.f85396g) {
                                            if (this.f85397h == eVar.f85397h) {
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
        int hashCode = Long.hashCode(this.f85390a) * 31;
        boolean z = this.f85391b;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + Integer.hashCode(this.f85392c)) * 31;
        boolean z2 = this.f85393d;
        if (z2) {
            z2 = true;
        }
        int i = (hashCode2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f85394e;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f85395f;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f85396g;
        if (z5) {
            z5 = true;
        }
        return ((i3 + (z5 ? 1 : 0)) * 31) + Integer.hashCode(this.f85397h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionPopUp(interval=");
        sb.append(this.f85390a);
        sb.append(", homepageHot=");
        sb.append(this.f85391b);
        sb.append(", homepageHotIndex=");
        sb.append(this.f85392c);
        sb.append(", meTab=");
        sb.append(this.f85393d);
        sb.append(", inboxTab=");
        sb.append(this.f85394e);
        sb.append(", homepageFollow=");
        sb.append(this.f85395f);
        sb.append(", profileRecommend=");
        sb.append(this.f85396g);
        sb.append(", freqLimit=");
        sb.append(this.f85397h);
        sb.append(")");
        return sb.toString();
    }

    private C32796e(long j, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        this.f85390a = j;
        this.f85391b = z;
        this.f85392c = i;
        this.f85393d = z2;
        this.f85394e = z3;
        this.f85395f = z4;
        this.f85396g = z5;
        this.f85397h = i2;
    }

    private /* synthetic */ C32796e(long j, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, C52707g gVar) {
        this(86400, false, 5, false, false, false, false, 0);
    }
}
