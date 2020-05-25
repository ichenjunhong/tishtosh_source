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

/* renamed from: com.ss.android.ugc.aweme.commercialize.s */
public final class C26199s implements C44370d {

    /* renamed from: a */
    private final String f69182a = "StarAtlasPublishServiceExtension";

    /* renamed from: a */
    public final void mo52804a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C52711k.m112240b(photoContext, "photoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
    }

    /* renamed from: a */
    public final void mo52805a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26109ad a = C26109ad.m63392a(baseShortVideoContext);
        C52711k.m112236a((Object) a, "commercePublishModel");
        if (a.f68922d) {
            Map map = linkedHashMap;
            map.put("is_star_atlas", "1");
            if (!TextUtils.isEmpty(a.f68923e)) {
                String str = a.f68923e;
                C52711k.m112236a((Object) str, "commercePublishModel.starAtlasContent");
                map.put("star_atlas_content", str);
            }
        } else {
            linkedHashMap.put("is_star_atlas", "0");
        }
    }
}
