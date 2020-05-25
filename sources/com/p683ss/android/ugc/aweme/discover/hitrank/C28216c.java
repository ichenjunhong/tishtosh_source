package com.p683ss.android.ugc.aweme.discover.hitrank;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.c */
public final class C28216c {

    /* renamed from: a */
    public static boolean f74076a;

    /* renamed from: b */
    public static String f74077b = "";

    /* renamed from: c */
    public static final C28216c f74078c = new C28216c();

    /* renamed from: d */
    private static boolean f74079d;

    private C28216c() {
    }

    /* renamed from: a */
    public static void m67126a(BaseShortVideoContext baseShortVideoContext) {
        C52711k.m112240b(baseShortVideoContext, "videoEditModel");
        List<AVTextExtraStruct> list = baseShortVideoContext.structList;
        if (list != null) {
            List arrayList = new ArrayList();
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                C52711k.m112236a((Object) aVTextExtraStruct, "struct");
                if (aVTextExtraStruct.getType() == 1) {
                    String hashTagName = aVTextExtraStruct.getHashTagName();
                    C52711k.m112236a((Object) hashTagName, "struct.hashTagName");
                    arrayList.add(hashTagName);
                }
            }
            if (f74079d && arrayList.size() > 0 && !TextUtils.isEmpty(f74077b)) {
                C28220g.m67132a(f74077b, 9, arrayList);
            }
        }
        f74079d = false;
    }
}
