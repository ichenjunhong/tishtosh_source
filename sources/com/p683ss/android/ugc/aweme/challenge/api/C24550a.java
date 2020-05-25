package com.p683ss.android.ugc.aweme.challenge.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.a */
public final class C24550a extends BaseResponse {
    @C17952c(mo34828a = "cursor")

    /* renamed from: a */
    public final int f64999a;
    @C17952c(mo34828a = "has_more")

    /* renamed from: b */
    public final boolean f65000b;
    @C17952c(mo34828a = "rid")

    /* renamed from: c */
    public final String f65001c;
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: d */
    public final List<Aweme> f65002d;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: e */
    public final LogPbBean f65003e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24550a) {
                C24550a aVar = (C24550a) obj;
                if (this.f64999a == aVar.f64999a) {
                    if (!(this.f65000b == aVar.f65000b) || !C52711k.m112239a((Object) this.f65001c, (Object) aVar.f65001c) || !C52711k.m112239a((Object) this.f65002d, (Object) aVar.f65002d) || !C52711k.m112239a((Object) this.f65003e, (Object) aVar.f65003e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f64999a * 31;
        boolean z = this.f65000b;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        String str = this.f65001c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<Aweme> list = this.f65002d;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.f65003e;
        if (logPbBean != null) {
            i3 = logPbBean.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiColAwemeListResponse(cursor=");
        sb.append(this.f64999a);
        sb.append(", hasMore=");
        sb.append(this.f65000b);
        sb.append(", rid=");
        sb.append(this.f65001c);
        sb.append(", awemeList=");
        sb.append(this.f65002d);
        sb.append(", logPb=");
        sb.append(this.f65003e);
        sb.append(")");
        return sb.toString();
    }
}
