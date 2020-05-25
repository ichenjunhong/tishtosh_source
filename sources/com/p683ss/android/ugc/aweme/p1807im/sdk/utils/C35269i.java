package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend.C34653c;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.i */
public final class C35269i {

    /* renamed from: a */
    public static final C35269i f90607a = new C35269i();

    private C35269i() {
    }

    /* renamed from: a */
    private static int m79746a(C11180b bVar) {
        int i = 0;
        if (bVar != null) {
            Map ext = bVar.getExt();
            if (ext != null) {
                String str = (String) ext.get("awe:relation_type");
                if (str == null) {
                    return 0;
                }
                i = Integer.parseInt(str);
            }
        }
        return i;
    }

    /* renamed from: a */
    public final String mo73368a(C11180b bVar, boolean z) {
        int a = m79746a(bVar);
        int i = R.string.gst;
        switch (a) {
            case 1:
                if (C34653c.m78626a() == 1) {
                    String string = C11010c.m22280a().getResources().getString(R.string.gss);
                    C52711k.m112236a((Object) string, "AppContextManager.getApp…essage_tag_you_may_know2)");
                    return string;
                }
                if (z) {
                    i = R.string.gsr;
                }
                String string2 = C11010c.m22280a().getResources().getString(i);
                C52711k.m112236a((Object) string2, "AppContextManager.getApp…esources.getString(resId)");
                return string2;
            case 2:
                if (z) {
                    i = R.string.gsr;
                }
                String string3 = C11010c.m22280a().getResources().getString(i);
                C52711k.m112236a((Object) string3, "AppContextManager.getApp…esources.getString(resId)");
                return string3;
            default:
                return "";
        }
    }
}
