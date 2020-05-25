package com.p683ss.android.ugc.aweme.poi.rate.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.poi.rate.p2073a.C39217a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.api.c */
public final class C39226c {
    @C17952c(mo34828a = "rate_id_str")

    /* renamed from: a */
    public final String f100164a;
    @C17952c(mo34828a = "rate_score")

    /* renamed from: b */
    public final String f100165b;
    @C17952c(mo34828a = "create_time")

    /* renamed from: c */
    public final long f100166c;
    @C17952c(mo34828a = "user_info")

    /* renamed from: d */
    public final User f100167d;
    @C17952c(mo34828a = "aweme")

    /* renamed from: e */
    public final Aweme f100168e;
    @C17952c(mo34828a = "spu_info")

    /* renamed from: f */
    public final C39217a f100169f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39226c) {
                C39226c cVar = (C39226c) obj;
                if (C52711k.m112239a((Object) this.f100164a, (Object) cVar.f100164a) && C52711k.m112239a((Object) this.f100165b, (Object) cVar.f100165b)) {
                    if (!(this.f100166c == cVar.f100166c) || !C52711k.m112239a((Object) this.f100167d, (Object) cVar.f100167d) || !C52711k.m112239a((Object) this.f100168e, (Object) cVar.f100168e) || !C52711k.m112239a((Object) this.f100169f, (Object) cVar.f100169f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f100164a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100165b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.f100166c;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        User user = this.f100167d;
        int hashCode3 = (i2 + (user != null ? user.hashCode() : 0)) * 31;
        Aweme aweme = this.f100168e;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        C39217a aVar = this.f100169f;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRateStruct(rateId=");
        sb.append(this.f100164a);
        sb.append(", rateScore=");
        sb.append(this.f100165b);
        sb.append(", createTime=");
        sb.append(this.f100166c);
        sb.append(", user=");
        sb.append(this.f100167d);
        sb.append(", aweme=");
        sb.append(this.f100168e);
        sb.append(", spuInfo=");
        sb.append(this.f100169f);
        sb.append(")");
        return sb.toString();
    }
}
