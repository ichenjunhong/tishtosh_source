package com.p683ss.android.ugc.vcd;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.vcd.j */
public final class C50511j {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    public final int f126612a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    public final String f126613b;
    @C17952c(mo34828a = "popup_type")

    /* renamed from: c */
    public final int f126614c;
    @C17952c(mo34828a = "popup_layout")

    /* renamed from: d */
    public final int f126615d;
    @C17952c(mo34828a = "account_popup")

    /* renamed from: e */
    public final C50515n f126616e;
    @C17952c(mo34828a = "relation_popup")

    /* renamed from: f */
    public final C50515n f126617f;
    @C17952c(mo34828a = "close_vcd_v1_popup")

    /* renamed from: g */
    public final C50515n f126618g;
    @C17952c(mo34828a = "import_fans_popup")

    /* renamed from: h */
    public final C50515n f126619h;
    @C17952c(mo34828a = "finish_popup")

    /* renamed from: i */
    public final C50515n f126620i;
    @C17952c(mo34828a = "vcd_user_info")

    /* renamed from: j */
    public final C50517o f126621j;
    @C17952c(mo34828a = "app_version")

    /* renamed from: k */
    public final int f126622k;

    public C50511j() {
        this(0, null, 0, 0, null, null, null, null, null, null, 0, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50511j) {
                C50511j jVar = (C50511j) obj;
                if ((this.f126612a == jVar.f126612a) && C52711k.m112239a((Object) this.f126613b, (Object) jVar.f126613b)) {
                    if (this.f126614c == jVar.f126614c) {
                        if ((this.f126615d == jVar.f126615d) && C52711k.m112239a((Object) this.f126616e, (Object) jVar.f126616e) && C52711k.m112239a((Object) this.f126617f, (Object) jVar.f126617f) && C52711k.m112239a((Object) this.f126618g, (Object) jVar.f126618g) && C52711k.m112239a((Object) this.f126619h, (Object) jVar.f126619h) && C52711k.m112239a((Object) this.f126620i, (Object) jVar.f126620i) && C52711k.m112239a((Object) this.f126621j, (Object) jVar.f126621j)) {
                            if (this.f126622k == jVar.f126622k) {
                                return true;
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
        int i = this.f126612a * 31;
        String str = this.f126613b;
        int i2 = 0;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f126614c) * 31) + this.f126615d) * 31;
        C50515n nVar = this.f126616e;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C50515n nVar2 = this.f126617f;
        int hashCode3 = (hashCode2 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        C50515n nVar3 = this.f126618g;
        int hashCode4 = (hashCode3 + (nVar3 != null ? nVar3.hashCode() : 0)) * 31;
        C50515n nVar4 = this.f126619h;
        int hashCode5 = (hashCode4 + (nVar4 != null ? nVar4.hashCode() : 0)) * 31;
        C50515n nVar5 = this.f126620i;
        int hashCode6 = (hashCode5 + (nVar5 != null ? nVar5.hashCode() : 0)) * 31;
        C50517o oVar = this.f126621j;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return ((hashCode6 + i2) * 31) + this.f126622k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VcdGuideResponse(statusCode=");
        sb.append(this.f126612a);
        sb.append(", statusMessage=");
        sb.append(this.f126613b);
        sb.append(", popupType=");
        sb.append(this.f126614c);
        sb.append(", popupLayout=");
        sb.append(this.f126615d);
        sb.append(", accountPopup=");
        sb.append(this.f126616e);
        sb.append(", relationPopup=");
        sb.append(this.f126617f);
        sb.append(", closeVcdV1Popup=");
        sb.append(this.f126618g);
        sb.append(", importFollowersPopup=");
        sb.append(this.f126619h);
        sb.append(", importFollowersFinalPopup=");
        sb.append(this.f126620i);
        sb.append(", vcdUserInfo=");
        sb.append(this.f126621j);
        sb.append(", minSupportedAppVersion=");
        sb.append(this.f126622k);
        sb.append(")");
        return sb.toString();
    }

    private C50511j(int i, String str, int i2, int i3, C50515n nVar, C50515n nVar2, C50515n nVar3, C50515n nVar4, C50515n nVar5, C50517o oVar, int i4) {
        C52711k.m112240b(str, "statusMessage");
        this.f126612a = i;
        this.f126613b = str;
        this.f126614c = i2;
        this.f126615d = i3;
        this.f126616e = nVar;
        this.f126617f = nVar2;
        this.f126618g = nVar3;
        this.f126619h = nVar4;
        this.f126620i = nVar5;
        this.f126621j = oVar;
        this.f126622k = i4;
    }

    private /* synthetic */ C50511j(int i, String str, int i2, int i3, C50515n nVar, C50515n nVar2, C50515n nVar3, C50515n nVar4, C50515n nVar5, C50517o oVar, int i4, int i5, C52707g gVar) {
        this(0, "", 0, 0, null, null, null, null, null, null, 0);
    }
}
