package com.bytedance.ttnet.p883a;

import android.webkit.CookieManager;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9902h;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.C9877b;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.C9878c;
import com.bytedance.frameworks.baselib.network.http.p569b.C9842a;
import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e;
import com.bytedance.frameworks.core.p577a.C9923a.C9924a;
import com.bytedance.retrofit2.SsHttpCall.C12672a;
import com.bytedance.ttnet.C13281b.C13284b;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.encrypt.C13343c.C13344a;
import com.bytedance.ttnet.retrofit.C13357a;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ttnet.a.i */
public class C13280i implements C9877b, C9878c, C9902h, C9924a, C12672a, C13284b, C13344a {

    /* renamed from: p */
    private static volatile C13280i f34644p;

    /* renamed from: a */
    private String f34645a;

    /* renamed from: b */
    private int f34646b;

    /* renamed from: c */
    private int f34647c;

    /* renamed from: d */
    private int f34648d;

    /* renamed from: e */
    private int f34649e;

    /* renamed from: f */
    private int f34650f;

    /* renamed from: g */
    private int f34651g;

    /* renamed from: h */
    private String f34652h;

    /* renamed from: i */
    private String f34653i;

    /* renamed from: j */
    private int f34654j;

    /* renamed from: k */
    private int f34655k;

    /* renamed from: l */
    private String f34656l;

    /* renamed from: m */
    private String f34657m;

    /* renamed from: n */
    private Set<String> f34658n;

    /* renamed from: o */
    private long f34659o;

    private C13280i() {
        mo24890j();
    }

    /* renamed from: c */
    public final boolean mo17861c() {
        if (this.f34646b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo17862d() {
        if (this.f34647c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo17863e() {
        if (this.f34648d > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo23849g() {
        return C13357a.m26931a(this.f34654j);
    }

    /* renamed from: m */
    public final boolean mo24860m() {
        if (this.f34655k > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo17793b() {
        if (!C13258a.f34519n && this.f34649e > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static C13280i m26742i() {
        if (f34644p == null) {
            synchronized (C13280i.class) {
                if (f34644p == null) {
                    f34644p = new C13280i();
                }
            }
        }
        return f34644p;
    }

    /* renamed from: a */
    public final boolean mo17792a() {
        if (C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "chromium_boot_failures", 0) <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo23848f() {
        String str = "";
        String str2 = "";
        List asList = Arrays.asList(this.f34652h.split(","));
        if (asList.size() == 2) {
            str = (String) asList.get(0);
            str2 = (String) asList.get(1);
        }
        return C13357a.m26932a(str, str2);
    }

    /* renamed from: h */
    public final boolean mo24856h() {
        if (C13258a.f34519n) {
            C9865e.m19737a(0);
            return false;
        } else if (C13258a.m26676l()) {
            return false;
        } else {
            if (this.f34650f > 3) {
                C9865e.m19737a(3);
                return false;
            } else if (C13258a.f34520o) {
                C13303d.m26799b();
                return true;
            } else {
                if (this.f34651g <= 0) {
                    C9865e.m19737a(4);
                }
                if (this.f34651g > 0) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: n */
    public final Set<String> mo24861n() {
        if (!mo24860m()) {
            return Collections.emptySet();
        }
        long parseLong = Long.parseLong(this.f34656l);
        if (this.f34659o != 0 && this.f34659o == parseLong && this.f34658n != null) {
            return this.f34658n;
        }
        this.f34659o = parseLong;
        this.f34658n = C13258a.m26673f(this.f34657m);
        return this.f34658n;
    }

    /* renamed from: j */
    public final void mo24890j() {
        this.f34645a = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "share_cookie_host_list", "");
        this.f34646b = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "add_ss_queries_open", 0);
        this.f34647c = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "add_ss_queries_header_open", 0);
        if (this.f34646b > 0 || this.f34647c > 0) {
            SsInterceptor.m26928a(true);
        }
        this.f34648d = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "add_ss_queries_plaintext_open", 1);
        this.f34649e = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "http_dns_enabled", 0);
        this.f34650f = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "chromium_boot_failures", 0);
        this.f34651g = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "chromium_open", 0);
        this.f34652h = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "request_delay_time_range", "");
        this.f34653i = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "request_random_delay_apis", "");
        this.f34654j = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "request_max_delay_time", 600000);
        this.f34655k = C13303d.m26799b().mo24894a(C13303d.m26799b().mo24896a(), "ttnet_token_enabled", 1);
        this.f34656l = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "ttnet_token_config_time", "-1");
        this.f34657m = C13303d.m26799b().mo24899a(C13303d.m26799b().mo24896a(), "ttnet_token_api", "[]");
    }

    /* renamed from: e */
    public final boolean mo23847e(String str) {
        String[] split = this.f34653i.split(",");
        HashSet hashSet = new HashSet();
        for (String add : split) {
            hashSet.add(add);
        }
        return C13357a.m26933a(str, (Set<String>) hashSet);
    }

    /* renamed from: d */
    public final List<String> mo17830d(String str) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f34645a.split(",")) {
            if (!C9431p.m18664a(str2)) {
                arrayList.add(str2);
            }
        }
        String f = C13303d.m26799b().mo24908f();
        if (!C9431p.m18664a(f) && !m26741a(f, arrayList)) {
            arrayList.add(f);
        }
        if (m26741a(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m26741a(String str, List<String> list) {
        if (C9431p.m18664a(str) || C9414h.m18630a(list)) {
            return false;
        }
        for (String endsWith : list) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> mo17829a(CookieManager cookieManager, C9842a aVar, URI uri) {
        String str;
        String[] split;
        if (uri == null || (cookieManager == null && aVar == null)) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f34645a.split(",")) {
            if (!C9431p.m18664a(str2)) {
                arrayList.add(str2);
            }
        }
        if (C9431p.m18664a(str) || !m26741a(str, arrayList)) {
            return null;
        }
        List<String> arrayList2 = new ArrayList<>();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(C13303d.m26799b().mo24908f());
            if (!C9431p.m18664a(cookie)) {
                arrayList2.add(cookie);
            }
        }
        if (C9414h.m18630a(arrayList2) && aVar != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append("://");
                sb.append(C13303d.m26799b().mo24908f());
                Map map = aVar.get(URI.create(sb.toString()), new LinkedHashMap());
                if (map != null && !map.isEmpty()) {
                    arrayList2 = (List) map.get("Cookie");
                }
            } catch (Throwable unused2) {
            }
        }
        return arrayList2;
    }
}
