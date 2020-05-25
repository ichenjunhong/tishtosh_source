package com.p683ss.android.ugc.aweme.language;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.language.p */
public final class C35854p implements Serializable {

    /* renamed from: a */
    private static HashMap<String, String> f92052a;

    /* renamed from: com.ss.android.ugc.aweme.language.p$a */
    enum C35856a {
        INSTANCE;
        

        /* renamed from: b */
        C35854p f92055b;
    }

    private C35854p() {
    }

    public static C35854p get() {
        return C35856a.INSTANCE.f92055b;
    }

    public final String getStoreIdc() {
        String e = C35837h.m80980e();
        if (!TextUtils.isEmpty(e)) {
            return (String) f92052a.get(e);
        }
        return null;
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f92052a = hashMap;
        hashMap.put("AG", "maliva");
        f92052a.put("AI", "maliva");
        f92052a.put("BB", "maliva");
        f92052a.put("BM", "maliva");
        f92052a.put("BS", "maliva");
        f92052a.put("BZ", "maliva");
        f92052a.put("CA", "maliva");
        f92052a.put("CC", "maliva");
        f92052a.put("CR", "maliva");
        f92052a.put("CU", "maliva");
        f92052a.put("GD", "maliva");
        f92052a.put("GT", "maliva");
        f92052a.put("HN", "maliva");
        f92052a.put("HT", "maliva");
        f92052a.put("JM", "maliva");
        f92052a.put("MX", "maliva");
        f92052a.put("NI", "maliva");
        f92052a.put("PA", "maliva");
        f92052a.put("US", "maliva");
        f92052a.put("VE", "maliva");
        f92052a.put("AU", "maliva");
        f92052a.put("CK", "maliva");
        f92052a.put("CX", "maliva");
        f92052a.put("FJ", "maliva");
        f92052a.put("GU", "maliva");
        f92052a.put("NZ", "maliva");
        f92052a.put("PG", "maliva");
        f92052a.put("TO", "maliva");
        f92052a.put("AO", "maliva");
        f92052a.put("BF", "maliva");
        f92052a.put("BI", "maliva");
        f92052a.put("BJ", "maliva");
        f92052a.put("BW", "maliva");
        f92052a.put("CF", "maliva");
        f92052a.put("CG", "maliva");
        f92052a.put("CM", "maliva");
        f92052a.put("CV", "maliva");
        f92052a.put("DZ", "maliva");
        f92052a.put("EG", "maliva");
        f92052a.put("ET", "maliva");
        f92052a.put("GA", "maliva");
        f92052a.put("GH", "maliva");
        f92052a.put("GM", "maliva");
        f92052a.put("GN", "maliva");
        f92052a.put("GQ", "maliva");
        f92052a.put("KE", "maliva");
        f92052a.put("LY", "maliva");
        f92052a.put("MA", "maliva");
        f92052a.put("MG", "maliva");
        f92052a.put("MR", "maliva");
        f92052a.put("MU", "maliva");
        f92052a.put("MW", "maliva");
        f92052a.put("MZ", "maliva");
        f92052a.put("NA", "maliva");
        f92052a.put("NG", "maliva");
        f92052a.put("RW", "maliva");
        f92052a.put("SD", "maliva");
        f92052a.put("SN", "maliva");
        f92052a.put("SO", "maliva");
        f92052a.put("TN", "maliva");
        f92052a.put("TZ", "maliva");
        f92052a.put("UG", "maliva");
        f92052a.put("ZA", "maliva");
        f92052a.put("ZM", "maliva");
        f92052a.put("ZR", "maliva");
        f92052a.put("ZW", "maliva");
        f92052a.put("AQ", "maliva");
        f92052a.put("BV", "maliva");
        f92052a.put("AR", "maliva");
        f92052a.put("AW", "maliva");
        f92052a.put("BO", "maliva");
        f92052a.put("BR", "maliva");
        f92052a.put("CL", "maliva");
        f92052a.put("CO", "maliva");
        f92052a.put("EC", "maliva");
        f92052a.put("GY", "maliva");
        f92052a.put("PE", "maliva");
        f92052a.put("PY", "maliva");
        f92052a.put("UY", "maliva");
        f92052a.put("AD", "maliva");
        f92052a.put("AM", "maliva");
        f92052a.put("AT", "maliva");
        f92052a.put("BA", "maliva");
        f92052a.put("BE", "maliva");
        f92052a.put("BG", "maliva");
        f92052a.put("BY", "maliva");
        f92052a.put("CH", "maliva");
        f92052a.put("CZ", "maliva");
        f92052a.put("DE", "maliva");
        f92052a.put("DK", "maliva");
        f92052a.put("EE", "maliva");
        f92052a.put("ES", "maliva");
        f92052a.put("FI", "maliva");
        f92052a.put("FR", "maliva");
        f92052a.put("GB", "maliva");
        f92052a.put("GR", "maliva");
        f92052a.put("HR", "maliva");
        f92052a.put("HU", "maliva");
        f92052a.put("IE", "maliva");
        f92052a.put("IS", "maliva");
        f92052a.put("IT", "maliva");
        f92052a.put("LT", "maliva");
        f92052a.put("LV", "maliva");
        f92052a.put("MC", "maliva");
        f92052a.put("MD", "maliva");
        f92052a.put("MT", "maliva");
        f92052a.put("NL", "maliva");
        f92052a.put("NO", "maliva");
        f92052a.put("PL", "maliva");
        f92052a.put("PT", "maliva");
        f92052a.put("RO", "maliva");
        f92052a.put("RU", "maliva");
        f92052a.put("SE", "maliva");
        f92052a.put("SK", "maliva");
        f92052a.put("SM", "maliva");
        f92052a.put("UA", "maliva");
        f92052a.put("UK", "maliva");
        f92052a.put("YU", "maliva");
        f92052a.put("AE", "maliva");
        f92052a.put("AF", "maliva");
        f92052a.put("AL", "maliva");
        f92052a.put("AZ", "maliva");
        f92052a.put("BH", "maliva");
        f92052a.put("BN", "maliva");
        f92052a.put("BT", "maliva");
        f92052a.put("KZ", "maliva");
        f92052a.put("CY", "maliva");
        f92052a.put("IL", "maliva");
        f92052a.put("IQ", "maliva");
        f92052a.put("IR", "maliva");
        f92052a.put("JO", "maliva");
        f92052a.put("KP", "maliva");
        f92052a.put("KW", "maliva");
        f92052a.put("LB", "maliva");
        f92052a.put("LU", "maliva");
        f92052a.put("MN", "maliva");
        f92052a.put("MV", "maliva");
        f92052a.put("OM", "maliva");
        f92052a.put("QA", "maliva");
        f92052a.put("SA", "maliva");
        f92052a.put("SG", "maliva");
        f92052a.put("SY", "maliva");
        f92052a.put("TJ", "maliva");
        f92052a.put("TM", "maliva");
        f92052a.put("VA", "maliva");
        f92052a.put("YE", "maliva");
        f92052a.put("CN", "alisg");
        f92052a.put("HK", "alisg");
        f92052a.put("ID", "alisg");
        f92052a.put("IN", "alisg");
        f92052a.put("JP", "alisg");
        f92052a.put("KH", "alisg");
        f92052a.put("KR", "alisg");
        f92052a.put("LA", "alisg");
        f92052a.put("MO", "alisg");
        f92052a.put("MY", "alisg");
        f92052a.put("NP", "alisg");
        f92052a.put("PH", "alisg");
        f92052a.put("PK", "alisg");
        f92052a.put("TH", "alisg");
        f92052a.put("TW", "alisg");
        f92052a.put("VN", "alisg");
        f92052a.put("LK", "alisg");
        f92052a.put("MM", "alisg");
        f92052a.put("BD", "alisg");
    }
}
