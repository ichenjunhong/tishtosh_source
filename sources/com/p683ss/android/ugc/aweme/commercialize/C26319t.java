package com.p683ss.android.ugc.aweme.commercialize;

import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.t */
public final class C26319t implements C44370d {

    /* renamed from: a */
    private final String f69459a = "TaskPublishServiceExtension";

    /* renamed from: a */
    public final void mo52804a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C52711k.m112240b(photoContext, "photoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
    }

    /* renamed from: a */
    public final void mo52805a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        boolean z;
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        String str = C26109ad.m63392a(baseShortVideoContext).f68936r;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            linkedHashMap.put("task_id", str);
        }
    }
}
