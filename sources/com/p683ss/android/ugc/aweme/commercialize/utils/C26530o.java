package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.o */
public final class C26530o implements C27235d {

    /* renamed from: a */
    public boolean f69862a;

    /* renamed from: b */
    public boolean f69863b;

    /* renamed from: c */
    public boolean f69864c;

    /* renamed from: d */
    public long f69865d;

    /* renamed from: e */
    public C26531a f69866e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.o$a */
    public interface C26531a {
        /* renamed from: a */
        void mo54213a();

        /* renamed from: a */
        void mo54214a(long j);

        /* renamed from: b */
        void mo54215b();

        /* renamed from: c */
        void mo54216c();
    }

    /* renamed from: a */
    public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: a */
    public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    /* renamed from: b */
    public final boolean mo52683b(WebView webView, String str) {
        return false;
    }

    /* renamed from: a */
    private static boolean m64187a(String str) {
        return C52711k.m112239a((Object) str, (Object) QuickShopBusiness.f64351b);
    }

    /* renamed from: a */
    public final void mo54212a(boolean z) {
        this.f69864c = z;
        if (z && !this.f69862a) {
            C26531a aVar = this.f69866e;
            if (aVar != null) {
                aVar.mo54216c();
            }
        }
    }

    /* renamed from: a */
    public final void mo49880a(WebView webView, String str) {
        if (!m64187a(str) && !this.f69862a && !this.f69863b && !this.f69864c) {
            this.f69862a = true;
            C26531a aVar = this.f69866e;
            if (aVar != null) {
                aVar.mo54214a(System.currentTimeMillis() - this.f69865d);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52680a(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceError r3) {
        /*
            r0 = this;
            if (r2 == 0) goto L_0x000d
            android.net.Uri r1 = r2.getUrl()
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = r1.toString()
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r1 = m64187a(r1)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            if (r2 == 0) goto L_0x0029
            boolean r1 = r2.isForMainFrame()
            r2 = 1
            if (r1 != r2) goto L_0x0028
            r0.f69863b = r2
            com.ss.android.ugc.aweme.commercialize.utils.o$a r1 = r0.f69866e
            if (r1 == 0) goto L_0x0028
            r1.mo54215b()
            return
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26530o.mo52680a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    /* renamed from: a */
    public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        if (!m64187a(str)) {
            this.f69862a = false;
            this.f69863b = false;
            mo54212a(false);
            this.f69865d = System.currentTimeMillis();
            C26531a aVar = this.f69866e;
            if (aVar != null) {
                aVar.mo54213a();
            }
        }
    }

    /* renamed from: a */
    public final void mo52678a(WebView webView, int i, String str, String str2) {
        if (!m64187a(str2)) {
            this.f69863b = true;
            C26531a aVar = this.f69866e;
            if (aVar != null) {
                aVar.mo54215b();
            }
        }
    }
}
