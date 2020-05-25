package com.twitter.sdk.android.core.models;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.m */
public final class C52209m {
    @C17952c(mo34828a = "text", mo34829b = {"full_text"})

    /* renamed from: A */
    public final String f129953A;
    @C17952c(mo34828a = "display_text_range")

    /* renamed from: B */
    public final List<Integer> f129954B;
    @C17952c(mo34828a = "truncated")

    /* renamed from: C */
    public final boolean f129955C;
    @C17952c(mo34828a = "user")

    /* renamed from: D */
    public final C52213q f129956D;
    @C17952c(mo34828a = "withheld_copyright")

    /* renamed from: E */
    public final boolean f129957E;
    @C17952c(mo34828a = "withheld_in_countries")

    /* renamed from: F */
    public final List<String> f129958F;
    @C17952c(mo34828a = "withheld_scope")

    /* renamed from: G */
    public final String f129959G;
    @C17952c(mo34828a = "card")

    /* renamed from: H */
    public final C52197d f129960H;
    @C17952c(mo34828a = "coordinates")

    /* renamed from: a */
    public final C52198e f129961a;
    @C17952c(mo34828a = "created_at")

    /* renamed from: b */
    public final String f129962b;
    @C17952c(mo34828a = "current_user_retweet")

    /* renamed from: c */
    public final Object f129963c;
    @C17952c(mo34828a = "entities")

    /* renamed from: d */
    public final C52211o f129964d;
    @C17952c(mo34828a = "extended_entities")

    /* renamed from: e */
    public final C52211o f129965e;
    @C17952c(mo34828a = "favorite_count")

    /* renamed from: f */
    public final Integer f129966f;
    @C17952c(mo34828a = "favorited")

    /* renamed from: g */
    public final boolean f129967g;
    @C17952c(mo34828a = "filter_level")

    /* renamed from: h */
    public final String f129968h;
    @C17952c(mo34828a = "id")

    /* renamed from: i */
    public final long f129969i;
    @C17952c(mo34828a = "id_str")

    /* renamed from: j */
    public final String f129970j;
    @C17952c(mo34828a = "in_reply_to_screen_name")

    /* renamed from: k */
    public final String f129971k;
    @C17952c(mo34828a = "in_reply_to_status_id")

    /* renamed from: l */
    public final long f129972l;
    @C17952c(mo34828a = "in_reply_to_status_id_str")

    /* renamed from: m */
    public final String f129973m;
    @C17952c(mo34828a = "in_reply_to_user_id")

    /* renamed from: n */
    public final long f129974n;
    @C17952c(mo34828a = "in_reply_to_user_id_str")

    /* renamed from: o */
    public final String f129975o;
    @C17952c(mo34828a = "lang")

    /* renamed from: p */
    public final String f129976p;
    @C17952c(mo34828a = "place")

    /* renamed from: q */
    public final C52207l f129977q;
    @C17952c(mo34828a = "possibly_sensitive")

    /* renamed from: r */
    public final boolean f129978r;
    @C17952c(mo34828a = "scopes")

    /* renamed from: s */
    public final Object f129979s;
    @C17952c(mo34828a = "quoted_status_id")

    /* renamed from: t */
    public final long f129980t;
    @C17952c(mo34828a = "quoted_status_id_str")

    /* renamed from: u */
    public final String f129981u;
    @C17952c(mo34828a = "quoted_status")

    /* renamed from: v */
    public final C52209m f129982v;
    @C17952c(mo34828a = "retweet_count")

    /* renamed from: w */
    public final int f129983w;
    @C17952c(mo34828a = "retweeted")

    /* renamed from: x */
    public final boolean f129984x;
    @C17952c(mo34828a = "retweeted_status")

    /* renamed from: y */
    public final C52209m f129985y;
    @C17952c(mo34828a = "source")

    /* renamed from: z */
    public final String f129986z;

    public final int hashCode() {
        return (int) this.f129969i;
    }

    private C52209m() {
        C52211o oVar = C52211o.f130021a;
        this(null, null, null, oVar, oVar, Integer.valueOf(0), false, null, 0, "0", null, 0, "0", 0, "0", null, null, false, null, 0, "0", null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C52209m)) {
            return false;
        }
        if (this.f129969i == ((C52209m) obj).f129969i) {
            return true;
        }
        return false;
    }

    public C52209m(C52198e eVar, String str, Object obj, C52211o oVar, C52211o oVar2, Integer num, boolean z, String str2, long j, String str3, String str4, long j2, String str5, long j3, String str6, String str7, C52207l lVar, boolean z2, Object obj2, long j4, String str8, C52209m mVar, int i, boolean z3, C52209m mVar2, String str9, String str10, List<Integer> list, boolean z4, C52213q qVar, boolean z5, List<String> list2, String str11, C52197d dVar) {
        C52211o oVar3;
        C52211o oVar4;
        this.f129961a = eVar;
        this.f129962b = str;
        this.f129963c = obj;
        if (oVar == null) {
            oVar3 = C52211o.f130021a;
        } else {
            oVar3 = oVar;
        }
        this.f129964d = oVar3;
        if (oVar2 == null) {
            oVar4 = C52211o.f130021a;
        } else {
            oVar4 = oVar2;
        }
        this.f129965e = oVar4;
        this.f129966f = num;
        this.f129967g = z;
        this.f129968h = str2;
        this.f129969i = j;
        this.f129970j = str3;
        this.f129971k = str4;
        this.f129972l = j2;
        this.f129973m = str5;
        this.f129974n = j3;
        this.f129975o = str6;
        this.f129976p = str7;
        this.f129977q = lVar;
        this.f129978r = z2;
        this.f129979s = obj2;
        this.f129980t = j4;
        this.f129981u = str8;
        this.f129982v = mVar;
        this.f129983w = i;
        this.f129984x = z3;
        this.f129985y = mVar2;
        this.f129986z = str9;
        this.f129953A = str10;
        this.f129954B = C52206k.m111631a(list);
        this.f129955C = z4;
        this.f129956D = qVar;
        this.f129957E = z5;
        this.f129958F = C52206k.m111631a(list2);
        this.f129959G = str11;
        this.f129960H = dVar;
    }
}
