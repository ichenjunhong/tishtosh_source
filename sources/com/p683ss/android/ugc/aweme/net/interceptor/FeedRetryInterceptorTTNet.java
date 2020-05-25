package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12686c.C12687a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.bytedance.ttnet.p885c.C13302e;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet */
public class FeedRetryInterceptorTTNet implements C12727a {

    /* renamed from: a */
    public static final Pattern f96252a = Pattern.compile(".*/aweme/v\\d/feed.*");

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo77255b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo77255b(aVar);
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
    public final C12799u mo77255b(C12728a aVar) throws Exception {
        String str;
        try {
            return aVar.mo23900a(aVar.mo23899a());
        } catch (Exception e) {
            if (!(e instanceof C23459a)) {
                C12686c a = aVar.mo23899a();
                C13302e eVar = new C13302e();
                C12687a b = a.mo23858b();
                b.f33342j = eVar;
                String str2 = a.f33321b;
                if (!f96252a.matcher(str2).matches()) {
                    throw e;
                } else if (!TextUtils.isEmpty(str2)) {
                    boolean z = true;
                    boolean z2 = !str2.startsWith(WebKitApi.SCHEME_HTTPS);
                    if ((e instanceof SSLException) || (e instanceof GeneralSecurityException)) {
                        z = false;
                    }
                    String a2 = m84378a(C11010c.m22282b().f29547a, str2);
                    String filterUrl = NetworkUtils.filterUrl(a2);
                    String str3 = "retry_reason";
                    if (z2 && z) {
                        str = "both";
                    } else if (!z) {
                        str = "ssl";
                    } else {
                        str = "protocol";
                    }
                    b.mo23861a(m84379a(filterUrl, str3, str));
                    b.mo23861a(m84379a(NetworkUtils.filterUrl(a2), "retry_type", "first_retry"));
                    return aVar.mo23900a(b.mo23864a());
                } else {
                    throw new IllegalArgumentException("url is empty!");
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: a */
    private static String m84378a(String str, String str2) {
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
    private static String m84379a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C18922i iVar = new C18922i(str);
        iVar.mo38778a(str2, str3);
        return iVar.toString();
    }
}
