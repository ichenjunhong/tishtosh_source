package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.p879t.p881b.C13235c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ce */
public final class C26501ce implements C26424bi {
    /* renamed from: a */
    public final void mo54135a(C13235c cVar) {
        C26471cd.m64008a(cVar);
    }

    /* renamed from: b */
    public final boolean mo54139b(Aweme aweme) {
        return C26471cd.m64023d(aweme);
    }

    /* renamed from: a */
    public final boolean mo54138a(Aweme aweme) {
        return C26471cd.m64022c(aweme);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54140c(com.p683ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64022c(r5)
            if (r0 != 0) goto L_0x000c
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64023d(r5)
            if (r0 == 0) goto L_0x00e0
        L_0x000c:
            r0 = 1
            if (r5 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r5.getAwemeRawAd()
            if (r1 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.commercialize.model.y r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x0049
            boolean r1 = r1.loading
            if (r1 != r0) goto L_0x0049
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r0.mo53590b(r5)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53582a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53593b(r0)
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "error_message"
            java.lang.String r2 = "vast_wrapper_late_response"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53581a(r0)
            r5.mo53597c()
            return
        L_0x0049:
            r1 = 0
            if (r5 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r5.getAwemeRawAd()
            if (r2 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.commercialize.model.y r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x005f
            com.bytedance.t.b.f r2 = r2.vast
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = r2.adTitle
            goto L_0x0060
        L_0x005f:
            r2 = r1
        L_0x0060:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            if (r2 == 0) goto L_0x006e
            int r2 = r2.length()
            if (r2 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r2 = 0
            goto L_0x006f
        L_0x006e:
            r2 = 1
        L_0x006f:
            if (r2 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r0.mo53590b(r5)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53582a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53593b(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = "vast_title_missing"
            d.n r0 = p2628d.C52856t.m112465a(r0, r1)
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112042a(r0)
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53581a(r0)
            r5.mo53597c()
            return
        L_0x0099:
            if (r5 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.feed.model.Video r2 = r5.getVideo()
            if (r2 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
            if (r2 == 0) goto L_0x00ab
            java.util.List r1 = r2.getUrlList()
        L_0x00ab:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x00b7
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r0.mo53590b(r5)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53582a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53593b(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = "vast_mediafile_missing"
            d.n r0 = p2628d.C52856t.m112465a(r0, r1)
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112042a(r0)
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53581a(r0)
            r5.mo53597c()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26501ce.mo54140c(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r5 == null) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54136a(com.p683ss.android.ugc.aweme.feed.model.Aweme r4, com.p683ss.android.ugc.playerkit.p2494c.C50112d r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            if (r5 != 0) goto L_0x0006
            return
        L_0x0006:
            r0 = 3
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r4, r0)
            if (r0 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = r0.mo53590b(r4)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = r4.mo53582a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = r4.mo53593b(r0)
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "error_message"
            java.lang.String r2 = "vast_mediafile_bad_response"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "error_code"
            int r2 = r5.f125526d
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
            java.lang.String r1 = "error_detail"
            java.lang.Object r5 = r5.f125528f
            if (r5 == 0) goto L_0x0041
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x0043
        L_0x0041:
            java.lang.String r5 = ""
        L_0x0043:
            com.ss.android.ugc.aweme.app.f.d r5 = r0.mo47829a(r1, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = r4.mo53581a(r5)
            r4.mo53597c()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26501ce.mo54136a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.playerkit.c.d):void");
    }

    /* renamed from: a */
    public final void mo54137a(Aweme aweme, Executor executor, Runnable runnable, boolean z) {
        C26471cd.m64010a(aweme, executor, null, z);
    }
}
