package com.p683ss.android.ugc.aweme.share.improve.p2163c;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.a */
public final class C42148a {
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m92509a(android.os.Bundle r7, java.lang.String r8, java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r9, int r10) {
        /*
            java.lang.String r0 = "$this$putAwemeList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r9 = r9.iterator()
            r3 = 0
        L_0x002a:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r9.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            int r5 = r4.getAwemeType()
            r6 = 2
            if (r5 != r6) goto L_0x0059
            if (r4 == 0) goto L_0x0052
            java.util.List r4 = r4.getImageInfos()
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r4.get(r2)
            com.ss.android.ugc.aweme.feed.model.ImageInfo r4 = (com.p683ss.android.ugc.aweme.feed.model.ImageInfo) r4
            if (r4 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getLabelThumb()
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            if (r4 == 0) goto L_0x006e
            r0.add(r4)
            goto L_0x006e
        L_0x0059:
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.getVideo()
            java.lang.String r5 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getCover()
            java.lang.String r5 = "aweme.video.cover"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            r0.add(r4)
        L_0x006e:
            int r3 = r3 + r1
            if (r3 >= r10) goto L_0x0072
            goto L_0x002a
        L_0x0072:
            int r9 = r0.size()
            if (r9 < r10) goto L_0x007f
            java.lang.String r9 = com.alibaba.fastjson.JSON.toJSONString(r0)
            r7.putString(r8, r9)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a.m92509a(android.os.Bundle, java.lang.String, java.util.List, int):void");
    }

    /* renamed from: a */
    public static final boolean m92511a(C42357g gVar, Context context, Aweme aweme, String str) {
        C52711k.m112240b(gVar, "$this$checkAdxStatus");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        if (!C26503d.m64060c(aweme)) {
            return true;
        }
        C26890h.m65011a("dou_promote_layer_show", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).f61491a);
        C10691a.m21542b(context, (int) R.string.dn).mo19066a();
        return false;
    }
}
