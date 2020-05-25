package com.p683ss.android.ugc.aweme.favorites.p1701a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.a */
public final class C29658a extends BaseResponse {
    @C17952c(mo34828a = "mix_infos")

    /* renamed from: a */
    public final List<MixStruct> f77527a;
    @C17952c(mo34828a = "cursor")

    /* renamed from: b */
    public final long f77528b;
    @C17952c(mo34828a = "has_more")

    /* renamed from: c */
    public final int f77529c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29658a) {
                C29658a aVar = (C29658a) obj;
                if (C52711k.m112239a((Object) this.f77527a, (Object) aVar.f77527a)) {
                    if (this.f77528b == aVar.f77528b) {
                        if (this.f77529c == aVar.f77529c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<MixStruct> list = this.f77527a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long j = this.f77528b;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f77529c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixListCollectionResponse(mixInfos=");
        sb.append(this.f77527a);
        sb.append(", cursor=");
        sb.append(this.f77528b);
        sb.append(", hasMore=");
        sb.append(this.f77529c);
        sb.append(")");
        return sb.toString();
    }
}
