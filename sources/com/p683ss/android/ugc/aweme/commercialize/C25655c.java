package com.p683ss.android.ugc.aweme.commercialize;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c */
public final class C25655c implements C44370d {
    /* renamed from: a */
    public final void mo52804a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C52711k.m112240b(photoContext, "photoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26109ad a = C26109ad.m63391a(photoContext);
        Map map = linkedHashMap;
        map.put("anchor", C36811b.m82839a(Integer.valueOf(a.f68926h), a.f68925g, a.f68927i, Integer.valueOf(a.f68930l)));
        map.put("anchor_business_type", String.valueOf(a.f68926h));
        String str = "anchor_content";
        String str2 = a.f68927i;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    /* renamed from: a */
    public final void mo52805a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26109ad a = C26109ad.m63392a(baseShortVideoContext);
        if (a.f68926h == C25600a.INDIA_MOVIE.getTYPE()) {
            if (list == null) {
                list = new ArrayList<>();
            }
            int i = a.f68926h;
            String str = a.f68928j;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = "";
            String str4 = "";
            String str5 = a.f68927i;
            if (str5 == null) {
                str5 = "";
            }
            CreateAnchorInfo createAnchorInfo = new CreateAnchorInfo(i, str2, str3, str4, str5);
            list.add(createAnchorInfo);
        } else {
            C52711k.m112240b(baseShortVideoContext, "videoContext");
            C52711k.m112240b(linkedHashMap, "fieldMap");
            C26109ad a2 = C26109ad.m63392a(baseShortVideoContext);
            Map map = linkedHashMap;
            map.put("anchor", C36811b.m82839a(Integer.valueOf(a2.f68926h), a2.f68925g, a2.f68927i, Integer.valueOf(a2.f68930l)));
            map.put("anchor_business_type", String.valueOf(a2.f68926h));
            String str6 = "anchor_content";
            String str7 = a2.f68927i;
            if (str7 == null) {
                str7 = "";
            }
            map.put(str6, str7);
        }
        if (list != null) {
            Map map2 = linkedHashMap;
            String str8 = CreateAnchorInfo.KEY_ANCHORS;
            String b = new C17971f().mo34889b(list);
            C52711k.m112236a((Object) b, "Gson().toJson(it)");
            map2.put(str8, b);
        }
    }
}
