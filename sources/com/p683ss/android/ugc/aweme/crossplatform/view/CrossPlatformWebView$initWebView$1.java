package com.p683ss.android.ugc.aweme.crossplatform.view;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27196e;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27305g.C27306a;
import com.p683ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$initWebView$1 */
public final class CrossPlatformWebView$initWebView$1 implements C27235d {

    /* renamed from: a */
    final /* synthetic */ CrossPlatformWebView f72010a;

    /* renamed from: b */
    private boolean f72011b;

    /* renamed from: a */
    private final AdWebStatBusiness m65782a() {
        C27114h hVar = this.f72010a.f71979e;
        if (hVar != null) {
            C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                return (AdWebStatBusiness) crossPlatformBusiness.mo55523a(AdWebStatBusiness.class);
            }
        }
        return null;
    }

    CrossPlatformWebView$initWebView$1(CrossPlatformWebView crossPlatformWebView) {
        this.f72010a = crossPlatformWebView;
    }

    /* renamed from: b */
    public final boolean mo52683b(WebView webView, String str) {
        AdWebStatBusiness a = m65782a();
        if (a != null) {
            a.mo55482c(webView, str);
        }
        C27235d customWebViewStatus = this.f72010a.getCustomWebViewStatus();
        if (customWebViewStatus == null || !customWebViewStatus.mo52683b(webView, str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49880a(android.webkit.WebView r7, java.lang.String r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r0.f71979e
            if (r0 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = r0.mo54148d()
            if (r0 == 0) goto L_0x000f
            r0.mo49880a(r7, r8)
        L_0x000f:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = r0.getCustomWebViewStatus()
            if (r0 == 0) goto L_0x001a
            r0.mo49880a(r7, r8)
        L_0x001a:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            r1 = 2132020898(0x7f140ea2, float:1.9680172E38)
            android.view.View r0 = r0.mo55669a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r0
            r1 = 0
            r0.mo19208c(r1)
            boolean r0 = r6.f72011b
            r2 = 1
            if (r0 != 0) goto L_0x004e
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            r3 = 2132018868(0x7f1406b4, float:1.9676055E38)
            android.view.View r0 = r0.mo55669a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r0
            java.lang.String r3 = "error_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r3 = 8
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = ""
            r0.mo55674a(r1, r3, r8, r2)
        L_0x004e:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            r0.f71978d = r2
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            com.ss.android.ugc.aweme.crossplatform.view.g r0 = r0.getRegistry()
            com.ss.android.ugc.aweme.crossplatform.view.g$a r1 = com.p683ss.android.ugc.aweme.crossplatform.view.C27305g.C27306a.LOAD_FINISH
            r0.mo55743a(r1)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r0.f71979e
            if (r0 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.crossplatform.business.g r0 = r0.getCrossPlatformBusiness()
            if (r0 == 0) goto L_0x007c
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness> r1 = com.p683ss.android.ugc.aweme.crossplatform.business.XpathBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r0 = r0.mo55523a(r1)
            com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness r0 = (com.p683ss.android.ugc.aweme.crossplatform.business.XpathBusiness) r0
            if (r0 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r6.f72010a
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()
            r0.xpathDirect(r1, r7)
        L_0x007c:
            com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r0 = r6.m65782a()
            if (r0 == 0) goto L_0x0085
            r0.mo55481b(r7, r8)
        L_0x0085:
            if (r7 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r8 = r6.f72010a
            java.lang.String r8 = r8.getReactId()
            java.lang.String r0 = "webView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            if (r8 == 0) goto L_0x00aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "javascript:(function () {    window.reactId = '"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = "';})();"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.p683ss.android.sdk.webview.C19758f.m48273a(r7, r8)
        L_0x00aa:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r7 = r6.f72010a
            boolean r8 = r6.f72011b
            r8 = r8 ^ r2
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r7.getCrossPlatformParams()
            if (r0 == 0) goto L_0x00bc
            com.ss.android.ugc.aweme.crossplatform.c.f r0 = r0.f71722e
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r0.f71823c
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            if (r0 == 0) goto L_0x00ed
            org.json.JSONObject r0 = new org.json.JSONObject
            com.ss.android.ugc.aweme.crossplatform.c.a.a r7 = r7.getCrossPlatformParams()
            if (r7 != 0) goto L_0x00ca
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ca:
            com.ss.android.ugc.aweme.crossplatform.c.f r7 = r7.f71722e
            java.lang.String r7 = r7.f71823c
            r0.<init>(r7)
            java.lang.String r7 = "status"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ JSONException -> 0x00e8 }
            org.json.JSONObject r7 = r0.put(r7, r8)     // Catch:{ JSONException -> 0x00e8 }
            java.lang.String r8 = "duration"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00e8 }
            long r3 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.f71478c     // Catch:{ JSONException -> 0x00e8 }
            r5 = 0
            long r1 = r1 - r3
            r7.put(r8, r1)     // Catch:{ JSONException -> 0x00e8 }
        L_0x00e8:
            java.lang.String r7 = "request_anchor_detail"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r7, r0)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$initWebView$1.mo49880a(android.webkit.WebView, java.lang.String):void");
    }

    public final void webStatBusinessOnReceivedError(WebView webView, WebResourceRequest webResourceRequest, String str) {
        AdWebStatBusiness a = m65782a();
        if (a != null) {
            a.mo55474a(webView, webResourceRequest, str);
        }
    }

    /* renamed from: a */
    public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C27114h hVar = this.f72010a.f71979e;
        if (hVar != null) {
            C27235d d = hVar.mo54148d();
            if (d != null) {
                d.mo52679a(webView, sslErrorHandler, sslError);
            }
        }
        C27235d customWebViewStatus = this.f72010a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo52679a(webView, sslErrorHandler, sslError);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52680a(android.webkit.WebView r7, android.webkit.WebResourceRequest r8, android.webkit.WebResourceError r9) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r0.f71979e
            if (r0 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = r0.mo54148d()
            if (r0 == 0) goto L_0x000f
            r0.mo52680a(r7, r8, r9)
        L_0x000f:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f72010a
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = r0.getCustomWebViewStatus()
            if (r0 == 0) goto L_0x001a
            r0.mo52680a(r7, r8, r9)
        L_0x001a:
            r0 = 0
            if (r8 == 0) goto L_0x0026
            boolean r1 = r8.isForMainFrame()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0027
        L_0x0026:
            r1 = r0
        L_0x0027:
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)
            r4 = 2
            r5 = 0
            if (r3 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x004b
            android.net.Uri r1 = r8.getUrl()
            if (r1 == 0) goto L_0x004b
            java.lang.String r1 = r1.getPath()
            if (r1 == 0) goto L_0x004b
            java.lang.String r3 = ".apk"
            boolean r1 = p2628d.p2650m.C52830p.m112413c(r1, r3, r5, r4, r0)
            if (r1 != r2) goto L_0x004b
            return
        L_0x004b:
            r6.f72011b = r2
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r6.f72010a
            r1.mo55684c()
            goto L_0x00bc
        L_0x0053:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x00bc
            android.net.Uri r1 = r8.getUrl()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = r1.getPath()
            goto L_0x0069
        L_0x0068:
            r1 = r0
        L_0x0069:
            if (r1 == 0) goto L_0x0086
            android.net.Uri r1 = r8.getUrl()
            java.lang.String r2 = "request.url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.getPath()
            if (r1 != 0) goto L_0x007d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007d:
            java.lang.String r2 = "favicon.ico"
            boolean r1 = p2628d.p2650m.C52830p.m112413c(r1, r2, r5, r4, r0)
            if (r1 == 0) goto L_0x0086
            return
        L_0x0086:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "host"
            android.net.Uri r3 = r8.getUrl()
            java.lang.String r3 = r3.getHost()
            com.p683ss.android.sdk.activity.C19725b.m48222a(r1, r2, r3)
            java.lang.String r2 = "path"
            android.net.Uri r3 = r8.getUrl()
            java.lang.String r3 = r3.getPath()
            com.p683ss.android.sdk.activity.C19725b.m48222a(r1, r2, r3)
            java.lang.String r2 = "statusCode"
            com.p683ss.android.sdk.activity.C19725b.m48222a(r1, r2, r0)
            java.lang.String r2 = "errorCode"
            int r3 = r9.getErrorCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.p683ss.android.sdk.activity.C19725b.m48222a(r1, r2, r3)
            java.lang.String r2 = "aweme_webview_assets_error"
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r2, r5, r1)
        L_0x00bc:
            if (r7 == 0) goto L_0x00c1
            r7.getUrl()
        L_0x00c1:
            if (r9 == 0) goto L_0x00ce
            java.lang.CharSequence r1 = r9.getDescription()
            if (r1 == 0) goto L_0x00ce
            java.lang.String r1 = r1.toString()
            goto L_0x00cf
        L_0x00ce:
            r1 = r0
        L_0x00cf:
            if (r8 == 0) goto L_0x00d6
            android.net.Uri r2 = r8.getUrl()
            goto L_0x00d7
        L_0x00d6:
            r2 = r0
        L_0x00d7:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r6.f72010a
            if (r9 == 0) goto L_0x00e7
            int r9 = r9.getErrorCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
        L_0x00e7:
            r3.mo55674a(r0, r1, r2, r5)
            r6.webStatBusinessOnReceivedError(r7, r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$initWebView$1.mo52680a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52681a(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, android.webkit.WebResourceResponse r6) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r3.f72010a
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r0.f71979e
            if (r0 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = r0.mo54148d()
            if (r0 == 0) goto L_0x000f
            r0.mo52681a(r4, r5, r6)
        L_0x000f:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r3.f72010a
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = r0.getCustomWebViewStatus()
            if (r0 == 0) goto L_0x001a
            r0.mo52681a(r4, r5, r6)
        L_0x001a:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "host"
            android.net.Uri r2 = r5.getUrl()
            java.lang.String r2 = r2.getHost()
            com.p683ss.android.sdk.activity.C19725b.m48222a(r0, r1, r2)
            java.lang.String r1 = "path"
            android.net.Uri r2 = r5.getUrl()
            java.lang.String r2 = r2.getPath()
            com.p683ss.android.sdk.activity.C19725b.m48222a(r0, r1, r2)
            java.lang.String r1 = "statusCode"
            int r2 = r6.getStatusCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.p683ss.android.sdk.activity.C19725b.m48222a(r0, r1, r2)
            java.lang.String r1 = "errorCode"
            r2 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.p683ss.android.sdk.activity.C19725b.m48222a(r0, r1, r2)
            java.lang.String r1 = "aweme_webview_assets_error"
            r2 = 0
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r1, r2, r0)
            com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r0 = r3.m65782a()
            if (r0 == 0) goto L_0x0076
            r1 = 0
            if (r5 == 0) goto L_0x006b
            android.net.Uri r5 = r5.getUrl()
            if (r5 == 0) goto L_0x006b
            java.lang.String r5 = r5.toString()
            goto L_0x006c
        L_0x006b:
            r5 = r1
        L_0x006c:
            if (r6 == 0) goto L_0x0072
            java.lang.String r1 = r6.getReasonPhrase()
        L_0x0072:
            r0.mo55476a(r4, r5, r1)
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$initWebView$1.mo52681a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
    }

    /* renamed from: a */
    public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        C27114h hVar = this.f72010a.f71979e;
        if (hVar != null) {
            C27235d d = hVar.mo54148d();
            if (d != null) {
                d.mo52682a(webView, str, bitmap);
            }
        }
        C27235d customWebViewStatus = this.f72010a.getCustomWebViewStatus();
        if (customWebViewStatus != null) {
            customWebViewStatus.mo52682a(webView, str, bitmap);
        }
        this.f72011b = false;
        this.f72010a.f71978d = false;
        this.f72010a.getRegistry().mo55743a(C27306a.LOAD_START);
        CrossPlatformWebView crossPlatformWebView = this.f72010a;
        C27182a crossPlatformParams = crossPlatformWebView.getCrossPlatformParams();
        if (crossPlatformParams != null) {
            C27196e eVar = crossPlatformParams.f71721d;
            if (eVar != null && eVar.f71791C) {
                LineProgressBarView lineProgressBarView = (LineProgressBarView) crossPlatformWebView.mo55669a((int) R.id.eo4);
                C52711k.m112236a((Object) lineProgressBarView, "pbv_loading_bar");
                lineProgressBarView.setVisibility(0);
                crossPlatformWebView.mo55686d();
            }
        }
        AdWebStatBusiness a = m65782a();
        if (a != null) {
            a.mo55475a(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo52678a(WebView webView, int i, String str, String str2) {
        if (VERSION.SDK_INT < 23) {
            AdWebStatBusiness a = m65782a();
            if (a != null) {
                a.mo55476a(webView, str2, str);
            }
            C27114h hVar = this.f72010a.f71979e;
            if (hVar != null) {
                C27235d d = hVar.mo54148d();
                if (d != null) {
                    d.mo52678a(webView, i, str, str2);
                }
            }
            C27235d customWebViewStatus = this.f72010a.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.mo52678a(webView, i, str, str2);
            }
            this.f72011b = true;
            this.f72010a.mo55684c();
            if (webView != null) {
                webView.getUrl();
            }
            this.f72010a.mo55674a(Integer.valueOf(i), str, str2, false);
        }
    }
}
