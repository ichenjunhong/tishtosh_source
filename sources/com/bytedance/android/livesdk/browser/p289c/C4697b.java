package com.bytedance.android.livesdk.browser.p289c;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.C0649f;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.browser.C3806b;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.browser.jsbridge.C4762a;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdkapi.depend.model.live.C8719s;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.b */
public interface C4697b {

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$a */
    public static class C4699a {

        /* renamed from: a */
        public String f12786a;

        /* renamed from: b */
        public String f12787b;

        /* renamed from: c */
        public boolean f12788c;

        /* renamed from: d */
        public boolean f12789d;

        /* renamed from: e */
        public boolean f12790e;

        /* renamed from: f */
        public String f12791f;

        /* renamed from: g */
        public String f12792g;

        /* renamed from: a */
        public final C4699a mo10505a(String str) {
            this.f12787b = str;
            return this;
        }

        /* renamed from: b */
        public final C4699a mo10507b(String str) {
            this.f12791f = str;
            return this;
        }

        /* renamed from: c */
        public final C4699a mo10509c(String str) {
            this.f12792g = str;
            return this;
        }

        private C4699a(String str) {
            this.f12786a = str;
        }

        /* renamed from: a */
        public final C4699a mo10506a(boolean z) {
            this.f12788c = z;
            return this;
        }

        /* renamed from: b */
        public final C4699a mo10508b(boolean z) {
            this.f12789d = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$b */
    public static class C4700b {

        /* renamed from: a */
        public String f12793a;

        /* renamed from: b */
        public int f12794b;

        /* renamed from: c */
        public int f12795c;

        /* renamed from: d */
        public int f12796d;

        /* renamed from: e */
        public int f12797e;

        /* renamed from: f */
        public int f12798f;

        /* renamed from: g */
        public int f12799g;

        /* renamed from: h */
        public int f12800h;

        /* renamed from: i */
        public int f12801i;

        /* renamed from: j */
        public int f12802j;

        /* renamed from: k */
        public int f12803k;

        /* renamed from: l */
        public String f12804l;

        /* renamed from: m */
        public boolean f12805m;

        /* renamed from: n */
        public boolean f12806n;

        /* renamed from: o */
        public boolean f12807o;

        /* renamed from: p */
        public boolean f12808p;

        /* renamed from: q */
        public boolean f12809q;

        /* renamed from: r */
        public C3806b f12810r;

        /* renamed from: s */
        public String f12811s;

        /* renamed from: t */
        public boolean f12812t;

        /* renamed from: a */
        public final C4700b mo10510a(int i) {
            this.f12794b = i;
            return this;
        }

        /* renamed from: b */
        public final C4700b mo10514b(int i) {
            this.f12795c = i;
            return this;
        }

        /* renamed from: c */
        public final C4700b mo10516c(int i) {
            this.f12796d = i;
            return this;
        }

        /* renamed from: d */
        public final C4700b mo10519d(boolean z) {
            this.f12812t = z;
            return this;
        }

        /* renamed from: e */
        public final C4700b mo10520e(int i) {
            this.f12802j = i;
            return this;
        }

        /* renamed from: f */
        public final C4700b mo10521f(int i) {
            this.f12803k = i;
            return this;
        }

        /* renamed from: a */
        public final C4700b mo10512a(String str) {
            this.f12804l = str;
            return this;
        }

        /* renamed from: b */
        public final C4700b mo10515b(boolean z) {
            this.f12807o = z;
            return this;
        }

        /* renamed from: c */
        public final C4700b mo10517c(boolean z) {
            this.f12809q = z;
            return this;
        }

        /* renamed from: d */
        public final C4700b mo10518d(int i) {
            this.f12805m = false;
            this.f12797e = i;
            this.f12798f = 0;
            this.f12799g = 0;
            this.f12800h = 0;
            this.f12801i = 0;
            return this;
        }

        private C4700b(String str) {
            this.f12803k = -1;
            this.f12804l = "";
            this.f12809q = true;
            this.f12811s = "";
            this.f12812t = true;
            this.f12793a = str;
        }

        /* renamed from: a */
        public final C4700b mo10513a(boolean z) {
            this.f12806n = z;
            return this;
        }

        /* renamed from: a */
        public final C4700b mo10511a(int i, int i2, int i3, int i4) {
            this.f12805m = true;
            this.f12798f = i;
            this.f12799g = i2;
            this.f12800h = i3;
            this.f12801i = i4;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$c */
    public interface C4701c {
        /* renamed from: a */
        boolean mo10522a();

        /* renamed from: a */
        boolean mo10523a(WebView webView);

        /* renamed from: b */
        C4703e mo10524b();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$d */
    public interface C4702d {
        /* renamed from: a */
        void mo8983a(WebView webView, String str);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$e */
    public static class C4703e implements C4762a {

        /* renamed from: a */
        public RoundRectWebView f12813a;

        /* renamed from: b */
        public C4696a f12814b;

        /* renamed from: c */
        public WebChromeClient f12815c;

        /* renamed from: d */
        public WebViewClient f12816d;

        /* renamed from: a */
        public final void mo10525a(String str, JSONObject jSONObject) {
            this.f12814b.mo10483a().mo19581a(str, jSONObject);
        }

        public C4703e(RoundRectWebView roundRectWebView, C4696a aVar, WebChromeClient webChromeClient, WebViewClient webViewClient) {
            this.f12813a = roundRectWebView;
            this.f12814b = aVar;
            this.f12815c = webChromeClient;
            this.f12816d = webViewClient;
        }
    }

    /* renamed from: a */
    WebView mo10485a(Context context);

    /* renamed from: a */
    C4104a mo10486a(Context context, String str, String str2);

    /* renamed from: a */
    C4104a mo10487a(C4700b bVar);

    /* renamed from: a */
    C4104a mo10488a(C4700b bVar, C8719s sVar);

    /* renamed from: a */
    C4703e mo10489a(Activity activity, C4702d dVar);

    /* renamed from: a */
    void mo10490a(Context context, C4699a aVar);

    /* renamed from: a */
    void mo10491a(C0649f fVar);

    /* renamed from: a */
    void mo10492a(WebView webView);

    /* renamed from: a */
    void mo10493a(C4701c cVar);

    /* renamed from: a */
    void mo10494a(C4703e eVar);

    /* renamed from: a */
    void mo10495a(C4703e eVar, String str);

    /* renamed from: a */
    void mo10496a(C4703e eVar, String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo10497a(C4762a aVar);

    /* renamed from: a */
    void mo10498a(String str, JSONObject jSONObject);

    /* renamed from: a */
    boolean mo10499a();

    /* renamed from: a */
    boolean mo10500a(WebView webView, String str);

    /* renamed from: b */
    void mo10501b();

    /* renamed from: b */
    void mo10502b(C0649f fVar);

    /* renamed from: b */
    void mo10503b(C4701c cVar);

    /* renamed from: b */
    void mo10504b(C4762a aVar);
}
