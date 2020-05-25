package com.p683ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.l */
public final class C25946l implements C44370d {
    /* renamed from: a */
    public final void mo52804a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        C52711k.m112240b(photoContext, "photoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        Map map = linkedHashMap;
        String str2 = "commerce_ad_link";
        if (C26109ad.m63391a(photoContext).f68919a) {
            str = "1";
        } else {
            str = "0";
        }
        map.put(str2, str);
    }

    /* renamed from: a */
    public final void mo52805a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26109ad a = C26109ad.m63392a(baseShortVideoContext);
        if (a.f68919a) {
            Map map = linkedHashMap;
            map.put("commerce_ad_link", "1");
            if (!TextUtils.isEmpty(a.f68920b)) {
                String str = "commerce_ad_link_tags";
                String str2 = a.f68920b;
                if (str2 == null) {
                    str2 = "";
                }
                map.put(str, str2);
            }
        } else {
            linkedHashMap.put("commerce_ad_link", "0");
        }
    }
}
