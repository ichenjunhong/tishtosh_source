package com.p683ss.android.ugc.aweme.p2377ug.poloris;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12650p;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.PolarisDependImpl.C47474a;
import java.net.URLEncoder;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.d */
public final class C47485d {

    /* renamed from: a */
    public static final C47485d f119762a = new C47485d();

    private C47485d() {
    }

    /* renamed from: b */
    private static boolean m102884b(String str) {
        if (C52711k.m112239a((Object) WebKitApi.SCHEME_HTTP, (Object) str) || C52711k.m112239a((Object) WebKitApi.SCHEME_HTTPS, (Object) str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m102883a(String str) {
        PolarisInitTask.ensuareInit();
        if (!PolarisInitTask.isPolarisInit()) {
            return false;
        }
        boolean a = C12563i.m25218a(str);
        if (!a) {
            if (str == null) {
                return false;
            }
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "uri");
            if (TextUtils.equals(parse.getHost(), C23060d.f61427a)) {
                parse = Uri.parse(parse.getQueryParameter("url"));
            }
            C52711k.m112236a((Object) parse, "uri");
            if (parse.getScheme() != null) {
                String scheme = parse.getScheme();
                C52711k.m112236a((Object) scheme, "uri.scheme");
                if (C52830p.m112411b(scheme, WebKitApi.SCHEME_HTTP, false, 2, null) && TextUtils.equals(parse.getQueryParameter("luckycat"), "1")) {
                    a = true;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    private static boolean m102881a(Context context, String str) {
        Intent intent;
        C52711k.m112240b(context, "context");
        if (!PolarisJsbSetting.isOpen() || TextUtils.isEmpty(str) || str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        if (m102884b(parse.getScheme())) {
            StringBuilder sb = new StringBuilder(str);
            sb.append("&url=");
            StringBuilder sb2 = new StringBuilder(str);
            C12650p.m25420a(sb2, true);
            sb2.append("&immersive_mode=1");
            sb2.append("&hide_status_bar=1");
            sb2.append("&should_full_screen=1");
            sb.append(URLEncoder.encode(sb2.toString(), "ISO-8859-1"));
            intent = C27148b.m65481a(context, Uri.parse(sb.toString()));
        } else {
            Intent a = C27148b.m65481a(context, parse);
            C52711k.m112236a((Object) a, "intent");
            StringBuilder sb3 = new StringBuilder(a.getData().toString());
            C12650p.m25420a(sb3, true);
            sb3.append("&immersive_mode=1");
            sb3.append("&hide_status_bar=1");
            sb3.append("&should_full_screen=1");
            intent = a.setData(Uri.parse(sb3.toString()));
        }
        intent.putExtra("full_screen_show_nav_bar", true);
        intent.putExtra("full_screen_nav_bar_top_margin", 0);
        intent.putExtra("hide_more", true);
        intent.putExtra("should_full_screen", true);
        intent.putExtra("hide_nav_bar", false);
        intent.putExtra("immersive_mode", true);
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static final boolean m102882a(Context context, String str, String str2) {
        String str3;
        boolean z;
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(str2, "from");
        boolean a = m102883a(str);
        if (a) {
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "uri");
            if (TextUtils.equals(parse.getHost(), C23060d.f61427a)) {
                str3 = parse.getQueryParameter("url");
            } else {
                str3 = str;
            }
            C47474a.m102871a().mo94753g();
            String str4 = "polaris_activity_crash";
            C23088c a2 = C23088c.m56631a().mo47824a("from", str2);
            String str5 = "businessNull";
            if (C12563i.m25221c() == null) {
                z = true;
            } else {
                z = false;
            }
            C23131p.m57779a(str4, a2.mo47819a(str5, Boolean.valueOf(z)).mo47825b());
            if (m102881a(context, str)) {
                return true;
            }
            C12563i.m25216a(context, str3, false);
        }
        return a;
    }
}
