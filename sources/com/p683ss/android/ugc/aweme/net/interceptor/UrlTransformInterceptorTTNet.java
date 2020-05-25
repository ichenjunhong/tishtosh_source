package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.experiment.DebugReplaceHttpsExperiment;
import com.p683ss.android.ugc.aweme.legoImp.task.C35990q;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import com.p683ss.ttm.player.MediaPlayer;
import java.net.URI;
import java.util.Collections;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet */
public class UrlTransformInterceptorTTNet implements C12727a {
    /* renamed from: a */
    private static boolean m84389a(String str) {
        if ("vas_ad_track".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C12799u m84390b(C12728a aVar) throws Exception {
        C12686c a = aVar.mo23899a();
        String a2 = m84388a(a.f33321b, a.f33330k);
        if (!C35990q.m81167a(a2)) {
            return aVar.mo23900a(a.mo23858b().mo23861a(a2).mo23864a());
        }
        C12688d dVar = new C12688d("", MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, "", Collections.emptyList(), null);
        return C12799u.m25686a((TypedInput) new TypedString(""), dVar);
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m84390b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m84390b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* renamed from: b */
    private static String m84391b(String str, String str2) {
        String str3;
        if (str2 == null || str2.length() <= 0 || str == null || str.length() <= 0) {
            return str2;
        }
        try {
            String host = URI.create(str2).getHost();
            if (host != null) {
                str3 = str2.replace(host, str);
            } else {
                str3 = str2;
            }
            return str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    private static String m84388a(String str, String str2) {
        if (!C10193n.m20607a().mo18204a(DebugReplaceHttpsExperiment.class, "debug_replace_http_to_https", C10181b.m20511a().mo18175c().getDebugReplaceHttpToHttps(), true) || TextUtils.isEmpty(str)) {
            return str;
        }
        if (((Boolean) SharePrefCache.inst().getUseHttps().mo47782d()).booleanValue() && !m84389a(str2)) {
            if (!str.contains("https://") && !str.contains("http://")) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(str);
                str = sb.toString();
            } else if (str.contains("http://")) {
                str = str.replace("http://", "https://");
            }
        }
        C53674a j = C53673t.m114180f(str).mo111624j();
        C53673t b = j.mo111632b();
        if (str.contains("/passport/auth/login/") || str.contains("/passport/auth/login_only/")) {
            if (TextUtils.isEmpty(b.mo111612c("access_token"))) {
                return str;
            }
            String replaceAll = b.mo111612c("access_token").replaceAll(" ", "+");
            C53674a g = b.mo111624j().mo111638g("access_token");
            g.mo111629a("access_token", replaceAll);
            return g.mo111632b().mo111610a().toString();
        } else if (str.contains("/service/settings/v2/")) {
            return m84391b(C11010c.m22282b().f29547a, str);
        } else {
            if (str.contains("/service/settings/v3/")) {
                return m84391b(C11010c.m22282b().f29547a, str);
            }
            if (str.contains("/location/sulite")) {
                str = b.mo111624j().mo111635d(C11010c.m22282b().f29547a).mo111632b().mo111610a().toString();
            }
            if (str.contains("push/get_service_addrs")) {
                str = b.mo111624j().mo111635d(C11010c.m22282b().f29547a).mo111632b().mo111610a().toString();
            }
            return C37787h.m84396a(str, j);
        }
    }
}
