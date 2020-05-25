package com.bytedance.ies.bullet.kit.web.p651d;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.p688h.C10968a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.kit.web.d.b */
public final class C10516b {

    /* renamed from: c */
    public static final C10517a f27970c = new C10517a(null);

    /* renamed from: d */
    private static final String f27971d = f27971d;

    /* renamed from: a */
    public final C10968a f27972a;

    /* renamed from: b */
    public C10518b f27973b;

    /* renamed from: com.bytedance.ies.bullet.kit.web.d.b$a */
    public static final class C10517a {
        private C10517a() {
        }

        public /* synthetic */ C10517a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.d.b$b */
    public interface C10518b {
        /* renamed from: a */
        WebResourceResponse mo18662a(String str);
    }

    /* renamed from: a */
    public final synchronized WebResourceResponse mo18661a(WebView webView, String str) {
        C52711k.m112240b(str, "url");
        C10518b bVar = this.f27973b;
        if (bVar != null) {
            WebResourceResponse a = bVar.mo18662a(str);
            if (a != null) {
                return a;
            }
        }
        try {
            return this.f27972a.mo19780a(webView, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public C10516b(Context context, String str, String str2, String str3) {
        C52711k.m112240b(str, C42311c.f106863g);
        C52711k.m112240b(str2, "deviceId");
        C52711k.m112240b(str3, "cacheDir");
        C10968a a = C10968a.m22224a(context, str, str2, str3);
        C52711k.m112236a((Object) a, "IESOfflineCache.create(\n…d,\n        cacheDir\n    )");
        this.f27972a = a;
    }
}
