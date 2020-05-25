package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25906d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26144w;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.profile.util.C40568s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.p */
public final class C26532p implements C40568s {

    /* renamed from: a */
    public static final C26532p f69867a = new C26532p();

    private C26532p() {
    }

    /* renamed from: a */
    public final boolean mo54217a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            C26144w nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig != null && TextUtils.equals(nativeSiteConfig.getRenderType(), "lynx") && !TextUtils.isEmpty(nativeSiteConfig.getLynxScheme())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo54218b(AwemeRawAd awemeRawAd) {
        String str;
        C18085o oVar = new C18085o();
        if (awemeRawAd != null) {
            String str2 = "siteId";
            C25906d preloadData = awemeRawAd.getPreloadData();
            if (preloadData != null) {
                str = preloadData.getSiteId();
            } else {
                str = null;
            }
            oVar.mo35020a(str2, str);
            oVar.mo35019a("adId", (Number) awemeRawAd.getAdId());
            oVar.mo35019a("creativeId", (Number) awemeRawAd.getCreativeId());
            oVar.mo35020a("logExtra", awemeRawAd.getLogExtra());
            oVar.mo35020a("webUrl", awemeRawAd.getWebUrl());
            oVar.mo35020a("pageData", awemeRawAd.getNativeSiteAdInfo());
            oVar.mo35020a("appData", awemeRawAd.getAppData());
        }
        String oVar2 = oVar.toString();
        C52711k.m112236a((Object) oVar2, "dataObj.toString()");
        return oVar2;
    }
}
