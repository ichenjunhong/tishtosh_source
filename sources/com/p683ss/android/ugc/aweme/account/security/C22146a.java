package com.p683ss.android.ugc.aweme.account.security;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.security.a */
public final class C22146a {
    @C17952c(mo34828a = "notice_id_str")

    /* renamed from: a */
    public final String f59710a;
    @C17952c(mo34828a = "notice")

    /* renamed from: b */
    public final String f59711b;
    @C17952c(mo34828a = "highlight")

    /* renamed from: c */
    public final List<C22147b> f59712c;
    @C17952c(mo34828a = "has_notice")

    /* renamed from: d */
    public final boolean f59713d;
    @C17952c(mo34828a = "notice_type")

    /* renamed from: e */
    public final String f59714e;
    @C17952c(mo34828a = "notice_model")

    /* renamed from: f */
    public final String f59715f;
    @C17952c(mo34828a = "scheme")

    /* renamed from: g */
    public final String f59716g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22146a) {
                C22146a aVar = (C22146a) obj;
                if (C52711k.m112239a((Object) this.f59710a, (Object) aVar.f59710a) && C52711k.m112239a((Object) this.f59711b, (Object) aVar.f59711b) && C52711k.m112239a((Object) this.f59712c, (Object) aVar.f59712c)) {
                    if (!(this.f59713d == aVar.f59713d) || !C52711k.m112239a((Object) this.f59714e, (Object) aVar.f59714e) || !C52711k.m112239a((Object) this.f59715f, (Object) aVar.f59715f) || !C52711k.m112239a((Object) this.f59716g, (Object) aVar.f59716g)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f59710a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59711b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C22147b> list = this.f59712c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f59713d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.f59714e;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f59715f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f59716g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsg(noticeId=");
        sb.append(this.f59710a);
        sb.append(", notice=");
        sb.append(this.f59711b);
        sb.append(", highlight=");
        sb.append(this.f59712c);
        sb.append(", hasNotice=");
        sb.append(this.f59713d);
        sb.append(", noticeType=");
        sb.append(this.f59714e);
        sb.append(", noticeModel=");
        sb.append(this.f59715f);
        sb.append(", scheme=");
        sb.append(this.f59716g);
        sb.append(")");
        return sb.toString();
    }
}
