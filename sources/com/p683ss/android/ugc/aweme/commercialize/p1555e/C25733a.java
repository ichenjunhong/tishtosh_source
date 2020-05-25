package com.p683ss.android.ugc.aweme.commercialize.p1555e;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26524k;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e.a */
public final class C25733a implements C27235d {

    /* renamed from: c */
    public static final List<JSONObject> f68052c = new ArrayList();

    /* renamed from: d */
    public static final C25734a f68053d = new C25734a(null);

    /* renamed from: f */
    private static final String f68054f = C25733a.class.getSimpleName();

    /* renamed from: a */
    public boolean f68055a;

    /* renamed from: b */
    public boolean f68056b;

    /* renamed from: e */
    private boolean f68057e = false;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e.a$a */
    public static final class C25734a {
        private C25734a() {
        }

        /* renamed from: a */
        public static List<JSONObject> m62296a() {
            return C25733a.f68052c;
        }

        public /* synthetic */ C25734a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo52922a(String str, int i, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error_code", i);
                jSONObject.put("description", str2);
                m62296a().add(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo52683b(WebView webView, String str) {
        return false;
    }

    public C25733a(boolean z) {
    }

    /* renamed from: a */
    private static boolean m62288a(String str) {
        if (str == null || !str.equals(QuickShopBusiness.f64351b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo49880a(WebView webView, String str) {
        if (!m62288a(str) && !this.f68055a) {
            this.f68055a = true;
            new StringBuilder("load finish: url=").append(str);
            new StringBuilder("load details: ").append(f68052c);
            C26524k.m64166a(str);
        }
    }

    /* renamed from: a */
    public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        int i;
        C25734a aVar = f68053d;
        if (sslError != null) {
            str = sslError.getUrl();
        } else {
            str = null;
        }
        if (sslError != null) {
            i = sslError.getPrimaryError();
        } else {
            i = 0;
        }
        aVar.mo52922a(str, i, "ssl error");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52680a(android.webkit.WebView r3, android.webkit.WebResourceRequest r4, android.webkit.WebResourceError r5) {
        /*
            r2 = this;
            r3 = 0
            if (r4 == 0) goto L_0x000e
            android.net.Uri r0 = r4.getUrl()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()
            goto L_0x000f
        L_0x000e:
            r0 = r3
        L_0x000f:
            boolean r0 = m62288a(r0)
            if (r0 == 0) goto L_0x0016
            return
        L_0x0016:
            r0 = 1
            r2.f68056b = r0
            com.ss.android.ugc.aweme.commercialize.e.a$a r0 = f68053d
            if (r4 == 0) goto L_0x0028
            android.net.Uri r4 = r4.getUrl()
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = r4.toString()
            goto L_0x0029
        L_0x0028:
            r4 = r3
        L_0x0029:
            if (r5 == 0) goto L_0x0030
            int r1 = r5.getErrorCode()
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r5 == 0) goto L_0x003d
            java.lang.CharSequence r5 = r5.getDescription()
            if (r5 == 0) goto L_0x003d
            java.lang.String r3 = r5.toString()
        L_0x003d:
            r0.mo52922a(r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.p1555e.C25733a.mo52680a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52681a(android.webkit.WebView r5, android.webkit.WebResourceRequest r6, android.webkit.WebResourceResponse r7) {
        /*
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L_0x000e
            android.net.Uri r0 = r6.getUrl()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()
            goto L_0x000f
        L_0x000e:
            r0 = r5
        L_0x000f:
            boolean r0 = m62288a(r0)
            if (r0 == 0) goto L_0x0016
            return
        L_0x0016:
            boolean r0 = r4.f68057e
            r1 = 0
            if (r0 == 0) goto L_0x0037
            if (r6 == 0) goto L_0x0031
            android.net.Uri r0 = r6.getUrl()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0031
            java.lang.String r2 = "favicon.ico"
            r3 = 2
            boolean r0 = p2628d.p2650m.C52830p.m112413c(r0, r2, r1, r3, r5)
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0037
            r0 = 1
            r4.f68056b = r0
        L_0x0037:
            com.ss.android.ugc.aweme.commercialize.e.a$a r0 = f68053d
            if (r6 == 0) goto L_0x0046
            android.net.Uri r6 = r6.getUrl()
            if (r6 == 0) goto L_0x0046
            java.lang.String r6 = r6.toString()
            goto L_0x0047
        L_0x0046:
            r6 = r5
        L_0x0047:
            if (r7 == 0) goto L_0x004d
            int r1 = r7.getStatusCode()
        L_0x004d:
            if (r7 == 0) goto L_0x0053
            java.lang.String r5 = r7.getReasonPhrase()
        L_0x0053:
            r0.mo52922a(r6, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.p1555e.C25733a.mo52681a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
    }

    /* renamed from: a */
    public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        if (!m62288a(str)) {
            this.f68055a = false;
            this.f68056b = false;
            f68052c.clear();
        }
    }

    /* renamed from: a */
    public final void mo52678a(WebView webView, int i, String str, String str2) {
        if (!m62288a(str2)) {
            this.f68056b = true;
            f68053d.mo52922a(str2, i, str);
        }
    }
}
