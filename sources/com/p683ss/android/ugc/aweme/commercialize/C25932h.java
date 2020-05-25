package com.p683ss.android.ugc.aweme.commercialize;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct;
import com.p683ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.h */
public final class C25932h implements C44370d {

    /* renamed from: a */
    public static final C25933a f68483a = new C25933a(null);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.h$a */
    public static final class C25933a {
        private C25933a() {
        }

        public /* synthetic */ C25933a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo52804a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C52711k.m112240b(photoContext, "photoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26109ad a = C26109ad.m63391a(photoContext);
        C52711k.m112236a((Object) a, "commercePublishModel");
        m62891a(a, linkedHashMap);
    }

    /* renamed from: a */
    private static void m62891a(C26109ad adVar, LinkedHashMap<String, String> linkedHashMap) {
        ShopOrderShareStructInfo shopOrderShareStructInfo = adVar.f68924f;
        if (shopOrderShareStructInfo != null) {
            ShopOrderShareStruct shopOrderShareStruct = shopOrderShareStructInfo.getShopOrderShareStruct();
            if (shopOrderShareStruct != null) {
                linkedHashMap.put("anchor", C36811b.m82839a(Integer.valueOf(C25600a.SHOP.getTYPE()), adVar.f68925g, new C17971f().mo34889b(C52550ab.m112042a(C52856t.m112465a("shop_order_share", shopOrderShareStruct))), Integer.valueOf(adVar.f68930l)));
            }
        }
    }

    /* renamed from: a */
    public final void mo52805a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26109ad a = C26109ad.m63392a(baseShortVideoContext);
        C52711k.m112236a((Object) a, "commercePublishModel");
        m62891a(a, linkedHashMap);
    }
}
