package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ae */
public final class C45379ae {

    /* renamed from: a */
    public static final C45379ae f114749a = new C45379ae();

    private C45379ae() {
    }

    /* renamed from: a */
    public static String m98929a(int i) {
        switch (i) {
            case 1:
                return "电视剧";
            case 2:
                return "动漫";
            case 3:
                return "电影";
            case 4:
                return "综艺";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String m98928a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            String movieDetail = b.getMovieDetail();
            C52711k.m112236a((Object) movieDetail, "SettingsReader.get().movieDetail");
            return movieDetail;
        } catch (C10174a unused) {
            return "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Ffe_lynx_main_web%2Fmovie_detail%2Findex.html%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_movie_detail%26bundle%3Dindex.js%26module_name%3Dpage_movie_detail%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1%26dynamic%3D1";
        }
    }

    /* renamed from: a */
    public static void m98930a(Context context) {
        if (context != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://medium/moreelements");
            if (context instanceof Activity) {
                buildRoute.withAnimation(R.anim.f2, R.anim.f4);
            }
            buildRoute.open();
        }
    }

    /* renamed from: a */
    public static void m98931a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C41302w.m91042a().mo83861a(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m98934a(com.p683ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r3.getAnchor()
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r1 = r1.getBusinessType()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r1 != 0) goto L_0x0012
            goto L_0x0034
        L_0x0012:
            int r1 = r1.intValue()
            r2 = 11
            if (r1 != r2) goto L_0x0034
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x002a
            java.lang.String r0 = r3.getKeyword()
        L_0x002a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0034
            r3 = 1
            return r3
        L_0x0034:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae.m98934a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static void m98932a(String str, String str2) {
        String str3 = "enter_entertainment_detail";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", str);
        String str4 = "entertainment_id";
        if (str2 == null) {
            str2 = "";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
    }

    /* renamed from: a */
    public static void m98933a(String str, String str2, String str3, String str4) {
        String str5 = "feed_enter";
        C23089d a = C23089d.m56640a();
        String str6 = "enter_from";
        if (str == null) {
            str = "";
        }
        C23089d a2 = a.mo47829a(str6, str);
        String str7 = "entertainment_id";
        if (str2 == null) {
            str2 = "";
        }
        C23089d a3 = a2.mo47829a(str7, str2);
        String str8 = "type";
        if (str3 == null) {
            str3 = "";
        }
        C23089d a4 = a3.mo47829a(str8, str3);
        String str9 = "order";
        if (str4 == null) {
            str4 = "";
        }
        C26890h.m65011a(str5, a4.mo47829a(str9, str4).f61491a);
    }
}
