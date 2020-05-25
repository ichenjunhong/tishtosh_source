package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25733a.C25734a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.k */
public final class C26524k {

    /* renamed from: a */
    public static final C26524k f69854a = new C26524k();

    private C26524k() {
    }

    /* renamed from: a */
    public static int m64164a(Aweme aweme) {
        if (!C26512f.m64082y(aweme)) {
            return -1;
        }
        CardStruct s = C26512f.m64076s(aweme);
        C52711k.m112236a((Object) s, "cardInfo");
        return s.getCardType();
    }

    /* renamed from: b */
    public static long m64167b(Aweme aweme) {
        long j = 0;
        if (aweme == null || !aweme.isAd()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            Long creativeId = awemeRawAd.getCreativeId();
            if (creativeId != null) {
                j = creativeId.longValue();
            }
        }
        return j;
    }

    /* renamed from: c */
    public static String m64169c(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        CardStruct s = C26512f.m64076s(aweme);
        if (s != null) {
            return s.getCardUrl();
        }
        return null;
    }

    /* renamed from: a */
    public static final void m64166a(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                List a = C25734a.m62296a();
                if (a.size() > 0) {
                    jSONObject.put("url", str);
                    jSONObject.put("error_details", a);
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() > 0) {
                C23569o.m57776a("aweme_ad_card_load_details", 0, jSONObject);
            }
        }
    }

    /* renamed from: b */
    public static final void m64168b(Aweme aweme, String str) {
        C52711k.m112240b(str, "reason");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m64164a(aweme));
                jSONObject.put("url", m64169c(aweme));
                jSONObject.put("error_msg", str);
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m64167b(aweme));
                }
            } catch (Exception unused) {
            }
            C23569o.m57776a("aweme_ad_card_show_error_rate_v2", 2, jSONObject);
            C23569o.m57776a("aweme_ad_card_show_error", 2, jSONObject);
        }
    }

    /* renamed from: a */
    public static final void m64165a(Aweme aweme, String str) {
        C52711k.m112240b(str, "reason");
        if (aweme != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("card_type", m64164a(aweme));
                jSONObject.put("url", m64169c(aweme));
                jSONObject.put("error_msg", str);
                if (aweme.isAd()) {
                    jSONObject.put("creative_id", m64167b(aweme));
                }
                jSONObject.put("error_details", C25734a.m62296a());
            } catch (Exception unused) {
            }
            C23569o.m57776a("aweme_ad_card_show_error_rate", 1, jSONObject);
            C23569o.m57776a("aweme_ad_card_show_error_rate_v2", 1, jSONObject);
            C23569o.m57776a("aweme_ad_card_show_error", 1, jSONObject);
        }
    }
}
