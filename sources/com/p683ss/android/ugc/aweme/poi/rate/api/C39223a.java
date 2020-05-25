package com.p683ss.android.ugc.aweme.poi.rate.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.api.a */
public final class C39223a extends BaseResponse {
    @C17952c(mo34828a = "rate_list")

    /* renamed from: a */
    public List<C39226c> f100154a;
    @C17952c(mo34828a = "avg_rate_score")

    /* renamed from: b */
    public String f100155b;
    @C17952c(mo34828a = "cursor")

    /* renamed from: c */
    public long f100156c;
    @C17952c(mo34828a = "has_more")

    /* renamed from: d */
    public int f100157d;
    @C17952c(mo34828a = "none_aweme_rate_count")

    /* renamed from: e */
    public final int f100158e;
    @C17952c(mo34828a = "item_has_more")

    /* renamed from: f */
    public final int f100159f;

    public C39223a() {
        this(null, null, 0, 0, 0, 0, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39223a) {
                C39223a aVar = (C39223a) obj;
                if (C52711k.m112239a((Object) this.f100154a, (Object) aVar.f100154a) && C52711k.m112239a((Object) this.f100155b, (Object) aVar.f100155b)) {
                    if (this.f100156c == aVar.f100156c) {
                        if (this.f100157d == aVar.f100157d) {
                            if (this.f100158e == aVar.f100158e) {
                                if (this.f100159f == aVar.f100159f) {
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
        List<C39226c> list = this.f100154a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f100155b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        long j = this.f100156c;
        return ((((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f100157d) * 31) + this.f100158e) * 31) + this.f100159f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRateAwemeResponse(poiRateList=");
        sb.append(this.f100154a);
        sb.append(", avgRateScore=");
        sb.append(this.f100155b);
        sb.append(", cursor=");
        sb.append(this.f100156c);
        sb.append(", hasMore=");
        sb.append(this.f100157d);
        sb.append(", noAwemeRateCount=");
        sb.append(this.f100158e);
        sb.append(", itemHasMore=");
        sb.append(this.f100159f);
        sb.append(")");
        return sb.toString();
    }

    private C39223a(List<C39226c> list, String str, long j, int i, int i2, int i3) {
        C52711k.m112240b(list, "poiRateList");
        C52711k.m112240b(str, "avgRateScore");
        this.f100154a = list;
        this.f100155b = str;
        this.f100156c = j;
        this.f100157d = i;
        this.f100158e = i2;
        this.f100159f = i3;
    }

    public /* synthetic */ C39223a(List list, String str, long j, int i, int i2, int i3, int i4, C52707g gVar) {
        int i5;
        int i6;
        if ((i4 & 1) != 0) {
            list = new ArrayList();
        }
        List list2 = list;
        if ((i4 & 2) != 0) {
            str = "0.0";
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            i6 = 1;
        } else {
            i6 = i3;
        }
        this(list2, str2, 0, i5, 0, i6);
    }
}
