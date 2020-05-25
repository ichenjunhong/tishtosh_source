package com.bytedance.ttnet.encrypt;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9903i;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9904j;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ttnet.encrypt.TtTokenConfig.C13340a;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ttnet.encrypt.c */
public class C13343c implements C9903i, C9904j {

    /* renamed from: a */
    private static volatile C13343c f34816a;

    /* renamed from: b */
    private static C13344a f34817b;

    /* renamed from: c */
    private C13340a f34818c = TtTokenConfig.m26876a().mo24938b();

    /* renamed from: com.bytedance.ttnet.encrypt.c$a */
    public interface C13344a {
        /* renamed from: m */
        boolean mo24860m();

        /* renamed from: n */
        Set<String> mo24861n();
    }

    /* renamed from: d */
    public static C13344a m26894d() {
        return f34817b;
    }

    private C13343c() {
        C9894e.m19822a((C9904j) this);
    }

    /* renamed from: c */
    public static C13343c m26893c() {
        if (f34816a == null) {
            synchronized (C13343c.class) {
                if (f34816a == null) {
                    f34816a = new C13343c();
                }
            }
        }
        return f34816a;
    }

    /* renamed from: b */
    public final void mo17836b() {
        TtTokenConfig a = TtTokenConfig.m26876a();
        try {
            if (a.f34799b != null) {
                synchronized (a.f34798a) {
                    a.f34799b.f34811c = "";
                    a.f34799b.f34812d = null;
                    a.f34799b.f34813e = null;
                    a.f34799b.f34810b = 0;
                }
                a.mo24940d();
                a.mo24942f();
                a.mo24941e();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final Map<String, ?> mo17833a() {
        if (f34817b == null || !f34817b.mo24860m()) {
            return Collections.emptyMap();
        }
        return TtTokenConfig.m26876a().mo24939c();
    }

    /* renamed from: a */
    public static void m26892a(C13344a aVar) {
        f34817b = aVar;
    }

    /* renamed from: a */
    public final void mo17789a(Map<String, ?> map) {
        if (map != null) {
            this.f34818c = (C13340a) map.get("session_token");
        }
    }

    /* renamed from: a */
    public final Pair<Boolean, String> mo17831a(String str) {
        if (f34817b == null || !f34817b.mo24860m()) {
            return new Pair<>(Boolean.valueOf(false), str);
        }
        return C13342b.m26887a(this.f34818c, str);
    }

    /* renamed from: b */
    public final Pair<Boolean, byte[]> mo17835b(byte[] bArr) {
        if (f34817b == null || !f34817b.mo24860m()) {
            return new Pair<>(Boolean.valueOf(false), bArr);
        }
        return C13342b.m26891b(this.f34818c, bArr);
    }

    /* renamed from: a */
    public final Pair<Boolean, byte[]> mo17832a(byte[] bArr) {
        if (f34817b == null || !f34817b.mo24860m()) {
            return new Pair<>(Boolean.valueOf(false), bArr);
        }
        return C13342b.m26888a(this.f34818c, bArr);
    }

    /* renamed from: a */
    public final boolean mo17834a(URI uri) {
        boolean z;
        if (uri == null || f34817b == null || !f34817b.mo24860m() || !WebKitApi.SCHEME_HTTP.equals(uri.getScheme())) {
            return false;
        }
        Set n = f34817b.mo24861n();
        if (n == null || n.isEmpty()) {
            return false;
        }
        Iterator it = n.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String str = (String) it.next();
            if (uri.getHost() != null && uri.getHost().contains(str)) {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }
}
