package com.p683ss.android.ugc.aweme.discover.hitrank;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.d */
public final class C28217d implements C28215b {
    /* renamed from: a */
    public final boolean mo56649a(String str) {
        C52711k.m112240b(str, "schema");
        C52711k.m112240b(str, "schema");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence) || !C52830p.m112411b(str, "aweme://search/trending", false, 2, null) || !C52830p.m112456b(charSequence, (CharSequence) "type=4", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo56648a(String str, String str2, String str3) {
        C52711k.m112240b(str, "from");
        C52711k.m112240b(str, "from");
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf billboardFansScheme = inst.getBillboardFansScheme();
        C52711k.m112236a((Object) billboardFansScheme, "SharePrefCache.inst().billboardFansScheme");
        String str4 = (String) billboardFansScheme.mo47782d();
        if (TextUtils.isEmpty(str4)) {
            return "";
        }
        C52711k.m112236a((Object) str4, "schema_fans");
        C37383a a = C37382g.m83707a(str4);
        if (!TextUtils.isEmpty(str2)) {
            String str5 = "star_uid";
            if (str2 == null) {
                C52711k.m112234a();
            }
            a.mo76659a(str5, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            String str6 = "sec_star_uid";
            if (str3 == null) {
                C52711k.m112234a();
            }
            a.mo76659a(str6, str3);
        }
        a.mo76659a("from", str);
        String uri = a.mo76658a().toString();
        C52711k.m112236a((Object) uri, "parseRnSchema.build().toString()");
        return uri;
    }

    /* renamed from: b */
    public final String mo56650b(String str, String str2, String str3) {
        C52711k.m112240b(str, "from");
        C52711k.m112240b(str, "from");
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf billboardStarScheme = inst.getBillboardStarScheme();
        C52711k.m112236a((Object) billboardStarScheme, "SharePrefCache.inst().billboardStarScheme");
        String str4 = (String) billboardStarScheme.mo47782d();
        if (TextUtils.isEmpty(str4)) {
            return "";
        }
        C52711k.m112236a((Object) str4, "billboardStarUrl");
        C37383a a = C37382g.m83707a(str4);
        if (!TextUtils.isEmpty(str2)) {
            String str5 = "star_uid";
            if (str2 == null) {
                C52711k.m112234a();
            }
            a.mo76659a(str5, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            String str6 = "sec_star_uid";
            if (str3 == null) {
                C52711k.m112234a();
            }
            a.mo76659a(str6, str3);
        }
        a.mo76659a("from", str);
        String uri = a.mo76658a().toString();
        C52711k.m112236a((Object) uri, "parseRnSchema.build().toString()");
        return uri;
    }
}
