package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.g */
public final class C39123g implements Serializable {
    @C17952c(mo34828a = "poi_id")

    /* renamed from: a */
    private final String f99806a;
    @C17952c(mo34828a = "answer_id")

    /* renamed from: b */
    private final String f99807b;
    @C17952c(mo34828a = "text")

    /* renamed from: c */
    private final String f99808c;
    @C17952c(mo34828a = "create_time")

    /* renamed from: d */
    private final long f99809d;
    @C17952c(mo34828a = "status")

    /* renamed from: e */
    private final int f99810e;
    @C17952c(mo34828a = "user")

    /* renamed from: f */
    private final User f99811f;
    @C17952c(mo34828a = "user_label_text")

    /* renamed from: g */
    private final String f99812g;
    @C17952c(mo34828a = "user_label_type")

    /* renamed from: h */
    private final String f99813h;
    @C17952c(mo34828a = "digg_count")

    /* renamed from: i */
    private final Integer f99814i;
    @C17952c(mo34828a = "is_user_digg")

    /* renamed from: j */
    private final Boolean f99815j;

    public static /* synthetic */ C39123g copy$default(C39123g gVar, String str, String str2, String str3, long j, int i, User user, String str4, String str5, Integer num, Boolean bool, int i2, Object obj) {
        C39123g gVar2 = gVar;
        int i3 = i2;
        return gVar.copy((i3 & 1) != 0 ? gVar2.f99806a : str, (i3 & 2) != 0 ? gVar2.f99807b : str2, (i3 & 4) != 0 ? gVar2.f99808c : str3, (i3 & 8) != 0 ? gVar2.f99809d : j, (i3 & 16) != 0 ? gVar2.f99810e : i, (i3 & 32) != 0 ? gVar2.f99811f : user, (i3 & 64) != 0 ? gVar2.f99812g : str4, (i3 & 128) != 0 ? gVar2.f99813h : str5, (i3 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? gVar2.f99814i : num, (i3 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? gVar2.f99815j : bool);
    }

    public final String component1() {
        return this.f99806a;
    }

    public final Boolean component10() {
        return this.f99815j;
    }

    public final String component2() {
        return this.f99807b;
    }

    public final String component3() {
        return this.f99808c;
    }

    public final long component4() {
        return this.f99809d;
    }

    public final int component5() {
        return this.f99810e;
    }

    public final User component6() {
        return this.f99811f;
    }

    public final String component7() {
        return this.f99812g;
    }

    public final String component8() {
        return this.f99813h;
    }

    public final Integer component9() {
        return this.f99814i;
    }

    public final C39123g copy(String str, String str2, String str3, long j, int i, User user, String str4, String str5, Integer num, Boolean bool) {
        String str6 = str;
        C52711k.m112240b(str, "poiId");
        String str7 = str2;
        C52711k.m112240b(str2, "answerId");
        String str8 = str3;
        C52711k.m112240b(str8, C42311c.f106865i);
        C39123g gVar = new C39123g(str6, str7, str8, j, i, user, str4, str5, num, bool);
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39123g) {
                C39123g gVar = (C39123g) obj;
                if (C52711k.m112239a((Object) this.f99806a, (Object) gVar.f99806a) && C52711k.m112239a((Object) this.f99807b, (Object) gVar.f99807b) && C52711k.m112239a((Object) this.f99808c, (Object) gVar.f99808c)) {
                    if (this.f99809d == gVar.f99809d) {
                        if (!(this.f99810e == gVar.f99810e) || !C52711k.m112239a((Object) this.f99811f, (Object) gVar.f99811f) || !C52711k.m112239a((Object) this.f99812g, (Object) gVar.f99812g) || !C52711k.m112239a((Object) this.f99813h, (Object) gVar.f99813h) || !C52711k.m112239a((Object) this.f99814i, (Object) gVar.f99814i) || !C52711k.m112239a((Object) this.f99815j, (Object) gVar.f99815j)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAnswerId() {
        return this.f99807b;
    }

    public final String getContent() {
        return this.f99808c;
    }

    public final long getCreateTime() {
        return this.f99809d;
    }

    public final Integer getLikeAmounts() {
        return this.f99814i;
    }

    public final String getPoiId() {
        return this.f99806a;
    }

    public final int getStatus() {
        return this.f99810e;
    }

    public final User getUser() {
        return this.f99811f;
    }

    public final String getUserLabelText() {
        return this.f99812g;
    }

    public final String getUserLabelType() {
        return this.f99813h;
    }

    public final int hashCode() {
        String str = this.f99806a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f99807b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f99808c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.f99809d;
        int i2 = (((hashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.f99810e) * 31;
        User user = this.f99811f;
        int hashCode4 = (i2 + (user != null ? user.hashCode() : 0)) * 31;
        String str4 = this.f99812g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f99813h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f99814i;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f99815j;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode7 + i;
    }

    public final Boolean isUserLike() {
        return this.f99815j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiAnswer(poiId=");
        sb.append(this.f99806a);
        sb.append(", answerId=");
        sb.append(this.f99807b);
        sb.append(", content=");
        sb.append(this.f99808c);
        sb.append(", createTime=");
        sb.append(this.f99809d);
        sb.append(", status=");
        sb.append(this.f99810e);
        sb.append(", user=");
        sb.append(this.f99811f);
        sb.append(", userLabelText=");
        sb.append(this.f99812g);
        sb.append(", userLabelType=");
        sb.append(this.f99813h);
        sb.append(", likeAmounts=");
        sb.append(this.f99814i);
        sb.append(", isUserLike=");
        sb.append(this.f99815j);
        sb.append(")");
        return sb.toString();
    }

    public C39123g(String str, String str2, String str3, long j, int i, User user, String str4, String str5, Integer num, Boolean bool) {
        C52711k.m112240b(str, "poiId");
        C52711k.m112240b(str2, "answerId");
        C52711k.m112240b(str3, C42311c.f106865i);
        this.f99806a = str;
        this.f99807b = str2;
        this.f99808c = str3;
        this.f99809d = j;
        this.f99810e = i;
        this.f99811f = user;
        this.f99812g = str4;
        this.f99813h = str5;
        this.f99814i = num;
        this.f99815j = bool;
    }
}
