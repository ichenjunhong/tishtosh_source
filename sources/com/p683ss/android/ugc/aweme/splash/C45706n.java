package com.p683ss.android.ugc.aweme.splash;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.p1103ad.splash.C18760l;
import com.p683ss.android.p1103ad.splash.C18760l.C18763b;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47485d;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.splash.n */
public final class C45706n {

    /* renamed from: a */
    private static int f115545a = 4;

    /* renamed from: a */
    static boolean m99512a(Context context, C18760l lVar, C45696i iVar) {
        if (lVar == null) {
            return false;
        }
        List<C18763b> list = lVar.f51858j;
        if (C9376b.m18558a((Collection<T>) list)) {
            return false;
        }
        for (C18763b bVar : list) {
            if (bVar != null) {
                String str = bVar.f51871a;
                int i = bVar.f51872b;
                if (!TextUtils.isEmpty(str)) {
                    long j = lVar.f51849a;
                    String str2 = lVar.f51851c;
                    switch (i) {
                        case 1:
                        case 3:
                        case 4:
                            m99513a(context, str, Long.valueOf(j), str2, iVar);
                            return true;
                        case 2:
                            if (!m99514a(context, str, lVar.f51855g, Long.valueOf(j), str2)) {
                                break;
                            } else {
                                return true;
                            }
                        case 5:
                            if (!C36983a.m83185b().mo76294a().openMiniApp(context, str, new C36961a().mo76223c("025002").mo76221a())) {
                                break;
                            } else {
                                return true;
                            }
                        default:
                            if (C19547d.m47842a(str)) {
                                if (!m99514a(context, str, lVar.f51855g, Long.valueOf(j), str2)) {
                                    break;
                                } else {
                                    return true;
                                }
                            } else {
                                m99513a(context, str, Long.valueOf(j), str2, iVar);
                                return true;
                            }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m99513a(Context context, String str, Long l, String str2, C45696i iVar) {
        String str3;
        if (C47485d.m102882a(context, str, "splash")) {
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        if (!C23057c.f61423a.equalsIgnoreCase(scheme) && !C23057c.f61425c.equalsIgnoreCase(scheme)) {
            C26088l.m63272a(context, l.longValue(), str2);
        }
        if (str.contains("__back_url__")) {
            str3 = str.replace("__back_url__", Uri.encode(C25653a.f67876a));
        } else {
            str3 = str;
        }
        C18922i iVar2 = new C18922i(str3);
        if (C23057c.f61426d.mo47788b(str)) {
            iVar2.mo38778a("url", str);
        }
        if (str.startsWith("sslocal://user/profile/")) {
            iVar2.mo38778a("enter_from", "open_screen_ad");
        }
        if (C36949e.m83168d(str)) {
            iVar2.mo38778a("schema_from", "splash");
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "challenge")) {
            iVar2.mo38778a("enter_from", "splash");
        }
        if (TextUtils.equals(host, "stickers")) {
            int lastIndexOf = str.lastIndexOf("/") + 1;
            if (lastIndexOf < str.length()) {
                C26890h.m65011a("enter_prop_detail", C23089d.m56640a().mo47829a("enter_from", "splash_ad").mo47829a("prop_id", str.substring(lastIndexOf)).f61491a);
            }
        }
        iVar.mo92146a(context, iVar2.mo38774a());
        return true;
    }

    /* renamed from: a */
    private static boolean m99514a(Context context, String str, String str2, Long l, String str3) {
        long longValue = l.longValue();
        JSONObject jSONObject = new JSONObject();
        try {
            C26088l.m63268a(context, jSONObject, str3);
        } catch (JSONException unused) {
        }
        C26088l.m63300a(context, "splash_ad", "open_url_h5", jSONObject, String.valueOf(longValue), 0);
        C27170a.m65583a("splash_ad", null);
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        if (TextUtils.isEmpty(str2)) {
            intent.putExtra("title", " ");
        } else {
            intent.putExtra("title", str2);
        }
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("ad_id", l);
        intent.putExtra("bundle_download_app_log_extra", str3);
        intent.putExtra("bundle_webview_background", context.getResources().getColor(R.color.as0));
        intent.putExtra("commerce_enter_from", "splash");
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (!(createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
            String b = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46655b(l);
            if (!TextUtils.isEmpty(b)) {
                intent.putExtra("preload_channel_name", b);
                intent.putExtra("preload_web_status", f115545a);
                intent.putExtra("preload_is_web_url", 1);
            }
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("openSplashScheme: url = ");
            sb.append(str);
            sb.append(" e = ");
            sb.append(e.toString());
            C47625i.m103103a(sb.toString());
            C32458a.m75148a((Throwable) e);
            return false;
        }
    }
}
