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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.z */
public final class C26543z implements C27235d {

    /* renamed from: a */
    public boolean f69885a;

    /* renamed from: b */
    public boolean f69886b;

    /* renamed from: c */
    public boolean f69887c;

    /* renamed from: d */
    public long f69888d;

    /* renamed from: e */
    public C26544a f69889e;

    /* renamed from: f */
    public boolean f69890f = true;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.z$a */
    public interface C26544a {
        /* renamed from: a */
        void mo54226a();

        /* renamed from: b */
        void mo54227b();

        /* renamed from: c */
        void mo54228c();
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
    private static boolean m64275a(String str) {
        return C52711k.m112239a((Object) str, (Object) QuickShopBusiness.f64351b);
    }

    /* renamed from: a */
    public final void mo54225a(boolean z) {
        this.f69887c = z;
        if (z && !this.f69885a && this.f69889e != null) {
            System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo49880a(WebView webView, String str) {
        if (!m64275a(str)) {
            if (this.f69890f) {
                this.f69890f = false;
                if (webView != null) {
                    webView.clearHistory();
                }
            }
            if (!this.f69885a && !this.f69886b && !this.f69887c) {
                this.f69885a = true;
            }
            C26544a aVar = this.f69889e;
            if (aVar != null) {
                aVar.mo54228c();
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
            boolean r1 = m64275a(r1)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            if (r2 == 0) goto L_0x0029
            boolean r1 = r2.isForMainFrame()
            r2 = 1
            if (r1 != r2) goto L_0x0028
            r0.f69886b = r2
            com.ss.android.ugc.aweme.commercialize.utils.z$a r1 = r0.f69889e
            if (r1 == 0) goto L_0x0028
            r1.mo54227b()
            return
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26543z.mo52680a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    /* renamed from: a */
    public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        if (!m64275a(str)) {
            this.f69885a = false;
            this.f69886b = false;
            mo54225a(false);
            this.f69888d = System.currentTimeMillis();
            C26544a aVar = this.f69889e;
            if (aVar != null) {
                aVar.mo54226a();
            }
        }
    }

    /* renamed from: a */
    public final void mo52678a(WebView webView, int i, String str, String str2) {
        if (!m64275a(str2)) {
            this.f69886b = true;
            C26544a aVar = this.f69889e;
            if (aVar != null) {
                aVar.mo54227b();
            }
        }
    }
}
