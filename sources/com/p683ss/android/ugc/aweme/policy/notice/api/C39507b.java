package com.p683ss.android.ugc.aweme.policy.notice.api;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.b */
public final class C39507b {
    @C17952c(mo34828a = "text")

    /* renamed from: a */
    public final String f101065a;
    @C17952c(mo34828a = "is_bold")

    /* renamed from: b */
    public final boolean f101066b;
    @C17952c(mo34828a = "link_type")

    /* renamed from: c */
    public final String f101067c;
    @C17952c(mo34828a = "link")

    /* renamed from: d */
    public final String f101068d;
    @C17952c(mo34828a = "extra")

    /* renamed from: e */
    public final String f101069e;
    @C17952c(mo34828a = "approve")

    /* renamed from: f */
    public final boolean f101070f;
    @C17952c(mo34828a = "operation")

    /* renamed from: g */
    public final Integer f101071g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39507b) {
                C39507b bVar = (C39507b) obj;
                if (C52711k.m112239a((Object) this.f101065a, (Object) bVar.f101065a)) {
                    if ((this.f101066b == bVar.f101066b) && C52711k.m112239a((Object) this.f101067c, (Object) bVar.f101067c) && C52711k.m112239a((Object) this.f101068d, (Object) bVar.f101068d) && C52711k.m112239a((Object) this.f101069e, (Object) bVar.f101069e)) {
                        if (!(this.f101070f == bVar.f101070f) || !C52711k.m112239a((Object) this.f101071g, (Object) bVar.f101071g)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f101065a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f101066b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f101067c;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101068d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f101069e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z2 = this.f101070f;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        Integer num = this.f101071g;
        if (num != null) {
            i = num.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolicyNoticeAction(text=");
        sb.append(this.f101065a);
        sb.append(", isBold=");
        sb.append(this.f101066b);
        sb.append(", linkType=");
        sb.append(this.f101067c);
        sb.append(", link=");
        sb.append(this.f101068d);
        sb.append(", extra=");
        sb.append(this.f101069e);
        sb.append(", approve=");
        sb.append(this.f101070f);
        sb.append(", operation=");
        sb.append(this.f101071g);
        sb.append(")");
        return sb.toString();
    }
}
