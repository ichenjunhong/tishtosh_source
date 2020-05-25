package com.p683ss.android.ugc.aweme.browserecord.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.model.b */
public final class C24043b extends BaseResponse {
    @C17952c(mo34828a = "visitor_list")

    /* renamed from: a */
    public List<C24042a> f63814a;
    @C17952c(mo34828a = "like_list")

    /* renamed from: b */
    public List<C24042a> f63815b;
    @C17952c(mo34828a = "max_cursor")

    /* renamed from: c */
    public long f63816c;
    @C17952c(mo34828a = "min_cursor")

    /* renamed from: d */
    public long f63817d;
    @C17952c(mo34828a = "has_more")

    /* renamed from: e */
    public boolean f63818e;
    @C17952c(mo34828a = "expire_time")

    /* renamed from: f */
    public long f63819f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24043b) {
                C24043b bVar = (C24043b) obj;
                if (C52711k.m112239a((Object) this.f63814a, (Object) bVar.f63814a) && C52711k.m112239a((Object) this.f63815b, (Object) bVar.f63815b)) {
                    if (this.f63816c == bVar.f63816c) {
                        if (this.f63817d == bVar.f63817d) {
                            if (this.f63818e == bVar.f63818e) {
                                if (this.f63819f == bVar.f63819f) {
                                    return true;
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
        List<C24042a> list = this.f63814a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C24042a> list2 = this.f63815b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int hashCode2 = (((((hashCode + i) * 31) + Long.hashCode(this.f63816c)) * 31) + Long.hashCode(this.f63817d)) * 31;
        boolean z = this.f63818e;
        if (z) {
            z = true;
        }
        return ((hashCode2 + (z ? 1 : 0)) * 31) + Long.hashCode(this.f63819f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseListResponse(visitorList=");
        sb.append(this.f63814a);
        sb.append(", listList=");
        sb.append(this.f63815b);
        sb.append(", maxCursor=");
        sb.append(this.f63816c);
        sb.append(", minCursor=");
        sb.append(this.f63817d);
        sb.append(", hasMore=");
        sb.append(this.f63818e);
        sb.append(", expireTime=");
        sb.append(this.f63819f);
        sb.append(")");
        return sb.toString();
    }

    public C24043b(List<C24042a> list, List<C24042a> list2, long j, long j2, boolean z, long j3) {
        this.f63814a = list;
        this.f63815b = list2;
        this.f63816c = j;
        this.f63817d = j2;
        this.f63818e = z;
        this.f63819f = j3;
    }
}
