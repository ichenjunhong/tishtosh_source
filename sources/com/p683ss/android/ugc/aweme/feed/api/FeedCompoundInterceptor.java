package com.p683ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12686c.C12687a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.feed.experiment.C30223c;
import com.p683ss.android.ugc.aweme.feed.model.FeedCompoundConfig;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedCompoundInterceptor */
public class FeedCompoundInterceptor implements C12727a {

    /* renamed from: a */
    private static final String f78677a = UUID.randomUUID().toString();

    /* renamed from: b */
    private static AtomicInteger f78678b = new AtomicInteger(-1);

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return m70738b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = m70738b(aVar);
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
    public static C12799u m70738b(C12728a aVar) throws Exception {
        if (C30223c.m70964e()) {
            return aVar.mo23900a(aVar.mo23899a());
        }
        int i = f78678b.get();
        FeedCompoundConfig f = C30223c.m70965f();
        List<String> list = f.requestDomains;
        C12686c a = aVar.mo23899a();
        C12687a b = a.mo23858b();
        String str = a.f33321b;
        if (TextUtils.equals(C11010c.m22295p(), "local_test") && !str.contains("cmpl_enc")) {
            Activity g = C11016e.m22312g();
            StringBuilder sb = new StringBuilder("Missing Compliance Encrypt param! ");
            sb.append(str);
            Toast makeText = Toast.makeText(g, sb.toString(), 1);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
        }
        if (TextUtils.isEmpty(str)) {
            return aVar.mo23900a(a);
        }
        f78678b.getAndIncrement();
        if (i == -1) {
            b.mo23861a(m70737a(NetworkUtils.filterUrl(str), "rid", f78677a));
            return aVar.mo23900a(b.mo23864a());
        }
        try {
            if (list.size() > i) {
                str = m70736a((String) list.get(i), str);
            }
            if (str.contains(f.path)) {
                str = str.replace(f.path, f.replacePath);
            }
            b.mo23861a(m70737a(NetworkUtils.filterUrl(str), "rid", f78677a));
        } catch (Throwable unused) {
        }
        return aVar.mo23900a(b.mo23864a());
    }

    /* renamed from: a */
    private static String m70736a(String str, String str2) {
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
    private static String m70737a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C18922i iVar = new C18922i(str);
        iVar.mo38778a(str2, str3);
        return iVar.toString();
    }
}
