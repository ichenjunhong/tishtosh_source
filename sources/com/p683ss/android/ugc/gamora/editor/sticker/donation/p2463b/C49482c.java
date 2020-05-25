package com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.b.c */
public final class C49482c extends BaseResponse {
    @C17952c(mo34828a = "cursor")

    /* renamed from: a */
    public final int f124167a;
    @C17952c(mo34828a = "has_more")

    /* renamed from: b */
    public final int f124168b;
    @C17952c(mo34828a = "powered_by")

    /* renamed from: c */
    public final String f124169c;
    @C17952c(mo34828a = "donation_text")

    /* renamed from: d */
    public final C49480a f124170d;
    @C17952c(mo34828a = "organizations")

    /* renamed from: e */
    public final List<C49481b> f124171e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49482c) {
                C49482c cVar = (C49482c) obj;
                if (this.f124167a == cVar.f124167a) {
                    if (!(this.f124168b == cVar.f124168b) || !C52711k.m112239a((Object) this.f124169c, (Object) cVar.f124169c) || !C52711k.m112239a((Object) this.f124170d, (Object) cVar.f124170d) || !C52711k.m112239a((Object) this.f124171e, (Object) cVar.f124171e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f124167a * 31) + this.f124168b) * 31;
        String str = this.f124169c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C49480a aVar = this.f124170d;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<C49481b> list = this.f124171e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationResponse(cursor=");
        sb.append(this.f124167a);
        sb.append(", hasMore=");
        sb.append(this.f124168b);
        sb.append(", poweredBy=");
        sb.append(this.f124169c);
        sb.append(", matchDonationText=");
        sb.append(this.f124170d);
        sb.append(", orgList=");
        sb.append(this.f124171e);
        sb.append(")");
        return sb.toString();
    }
}
