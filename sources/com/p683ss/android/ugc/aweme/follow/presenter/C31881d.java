package com.p683ss.android.ugc.aweme.follow.presenter;

import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.d */
public final class C31881d {

    /* renamed from: a */
    public final int f83300a;

    /* renamed from: b */
    public final int f83301b;

    /* renamed from: c */
    public final int f83302c;

    /* renamed from: d */
    public final String f83303d;

    /* renamed from: e */
    public final String f83304e;

    /* renamed from: f */
    public final Integer f83305f;

    /* renamed from: g */
    public final String f83306g;

    /* renamed from: h */
    public final String f83307h;

    /* renamed from: i */
    public final String f83308i;

    /* renamed from: j */
    public final int f83309j;

    /* renamed from: k */
    public final List<Long> f83310k;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31881d) {
                C31881d dVar = (C31881d) obj;
                if (this.f83300a == dVar.f83300a) {
                    if (this.f83301b == dVar.f83301b) {
                        if ((this.f83302c == dVar.f83302c) && C52711k.m112239a((Object) this.f83303d, (Object) dVar.f83303d) && C52711k.m112239a((Object) this.f83304e, (Object) dVar.f83304e) && C52711k.m112239a((Object) this.f83305f, (Object) dVar.f83305f) && C52711k.m112239a((Object) this.f83306g, (Object) dVar.f83306g) && C52711k.m112239a((Object) this.f83307h, (Object) dVar.f83307h) && C52711k.m112239a((Object) this.f83308i, (Object) dVar.f83308i)) {
                            if (!(this.f83309j == dVar.f83309j) || !C52711k.m112239a((Object) this.f83310k, (Object) dVar.f83310k)) {
                                return false;
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
        int i = ((((this.f83300a * 31) + this.f83301b) * 31) + this.f83302c) * 31;
        String str = this.f83303d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83304e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f83305f;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f83306g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83307h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f83308i;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f83309j) * 31;
        List<Long> list = this.f83310k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowFeedParam(listQueryType=");
        sb.append(this.f83300a);
        sb.append(", pullType=");
        sb.append(this.f83301b);
        sb.append(", followFeedStyle=");
        sb.append(this.f83302c);
        sb.append(", impressionIds=");
        sb.append(this.f83303d);
        sb.append(", lastFeedsId=");
        sb.append(this.f83304e);
        sb.append(", liveTagShow=");
        sb.append(this.f83305f);
        sb.append(", insertAwemeId=");
        sb.append(this.f83306g);
        sb.append(", pushAids=");
        sb.append(this.f83307h);
        sb.append(", pushParams=");
        sb.append(this.f83308i);
        sb.append(", refreshAfterVcdAuthorize=");
        sb.append(this.f83309j);
        sb.append(", insertRoomIds=");
        sb.append(this.f83310k);
        sb.append(")");
        return sb.toString();
    }

    public C31881d(int i, int i2, int i3, String str, String str2, Integer num, String str3, String str4, String str5, int i4, List<Long> list) {
        C52711k.m112240b(str, "impressionIds");
        this.f83300a = i;
        this.f83301b = i2;
        this.f83302c = i3;
        this.f83303d = str;
        this.f83304e = str2;
        this.f83305f = num;
        this.f83306g = str3;
        this.f83307h = str4;
        this.f83308i = str5;
        this.f83309j = i4;
        this.f83310k = list;
    }
}
