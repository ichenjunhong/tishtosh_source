package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p688h.C10979b;
import com.p683ss.android.newmedia.C19544c;
import com.p683ss.android.sdk.activity.p1208a.C19723a;
import com.p683ss.android.sdk.webview.C19761i;
import com.p683ss.android.sdk.webview.C19761i.C19762a;
import com.p683ss.android.sdk.webview.C19763j;
import com.p683ss.android.sdk.webview.C19764k;
import com.p683ss.android.sdk.webview.GeckoXExperiment;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness.C27167a;
import com.p683ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27256n.C27257a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22491ag;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.C47803da;
import com.p683ss.android.ugc.aweme.web.C48274d;
import com.p683ss.android.ugc.aweme.web.C48276f;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h */
public final class C27241h extends C19764k {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71885a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27241h.class), "intercept", "getIntercept()Lcom/ss/android/sdk/webview/IESUrlIntercept;"))};

    /* renamed from: i */
    public static final C27242a f71886i = new C27242a(null);

    /* renamed from: c */
    public final List<C27235d> f71887c = new ArrayList();

    /* renamed from: d */
    public C52682m<? super WebView, ? super String, Boolean> f71888d;

    /* renamed from: e */
    C19761i f71889e;

    /* renamed from: f */
    public C27251l f71890f;

    /* renamed from: g */
    public C22521l f71891g;

    /* renamed from: h */
    public C27114h f71892h;

    /* renamed from: j */
    private final C27235d f71893j = new C27246e(this);

    /* renamed from: k */
    private final C19544c f71894k = new C19544c();

    /* renamed from: l */
    private final C52668f f71895l = C52732g.m112285a(C27245d.f71898a);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h$a */
    public static final class C27242a {
        private C27242a() {
        }

        public /* synthetic */ C27242a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h$b */
    static final class C27243b implements C10979b {

        /* renamed from: a */
        public static final C27243b f71896a = new C27243b();

        C27243b() {
        }

        /* renamed from: a */
        public final boolean mo18674a(String str) {
            return C10885e.m22080c(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h$c */
    static final class C27244c implements C19762a {

        /* renamed from: a */
        final /* synthetic */ C27241h f71897a;

        C27244c(C27241h hVar) {
            this.f71897a = hVar;
        }

        /* renamed from: a */
        public final WebResourceResponse mo41194a(String str) {
            return this.f71897a.mo55634a().mo41194a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h$d */
    static final class C27245d extends C52712l implements C52670a<C19763j> {

        /* renamed from: a */
        public static final C27245d f71898a = new C27245d();

        C27245d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C19763j.m48282a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.h$e */
    public static final class C27246e implements C27235d {

        /* renamed from: a */
        final /* synthetic */ C27241h f71899a;

        C27246e(C27241h hVar) {
            this.f71899a = hVar;
        }

        /* renamed from: b */
        public final boolean mo52683b(WebView webView, String str) {
            boolean z = false;
            for (C27235d b : this.f71899a.f71887c) {
                if (b.mo52683b(webView, str)) {
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            for (C27235d a : this.f71899a.f71887c) {
                a.mo49880a(webView, str);
            }
        }

        /* renamed from: a */
        public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            for (C27235d a : this.f71899a.f71887c) {
                a.mo52679a(webView, sslErrorHandler, sslError);
            }
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            for (C27235d a : this.f71899a.f71887c) {
                a.mo52680a(webView, webResourceRequest, webResourceError);
            }
        }

        /* renamed from: a */
        public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            for (C27235d a : this.f71899a.f71887c) {
                a.mo52681a(webView, webResourceRequest, webResourceResponse);
            }
        }

        /* renamed from: a */
        public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
            for (C27235d a : this.f71899a.f71887c) {
                a.mo52682a(webView, str, bitmap);
            }
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            for (C27235d a : this.f71899a.f71887c) {
                a.mo52678a(webView, i, str, str2);
            }
        }
    }

    /* renamed from: a */
    public final C19763j mo55634a() {
        return (C19763j) this.f71895l.getValue();
    }

    /* renamed from: d */
    private final QuickShopBusiness m65674d() {
        C27114h hVar = this.f71892h;
        if (hVar != null) {
            C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                return (QuickShopBusiness) crossPlatformBusiness.mo55523a(QuickShopBusiness.class);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final PassBackWebInfoBusiness mo55635b() {
        C27114h hVar = this.f71892h;
        if (hVar != null) {
            C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                return (PassBackWebInfoBusiness) crossPlatformBusiness.mo55523a(PassBackWebInfoBusiness.class);
            }
        }
        return null;
    }

    public C27241h() {
        m65673c();
    }

    /* renamed from: c */
    private final void m65673c() {
        if (C47731bq.m103352f()) {
            C48276f.m104588a();
        } else {
            C48274d.m104575a();
        }
        C48380q e = C48380q.m104672e();
        if (e != null && e.mo41207a()) {
            C19761i a = new C19761i(e.mo41208b()).mo41191a((C10979b) C27243b.f71896a).mo41193a(C48380q.m104673f()).mo41192a(e.mo41209c());
            a.f54441a = new C27244c(this);
            this.f71889e = a;
        }
    }

    /* renamed from: b */
    private final boolean m65672b(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            super.onPageFinished(r5, r6)
            if (r6 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.crossplatform.b.e r0 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27139e.C27140a.m65474a()
            r1 = 2
            r0.mo55457a(r5, r6, r1)
            com.ss.android.ugc.aweme.af.a.l r0 = r4.f71891g
            if (r0 == 0) goto L_0x0022
            java.lang.Class<com.ss.android.ugc.aweme.af.a.n> r1 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n.class
            com.ss.android.ugc.aweme.af.a.t r0 = r0.mo46870a(r1)
            com.ss.android.ugc.aweme.af.a.n r0 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n) r0
            if (r0 == 0) goto L_0x0022
            android.net.Uri r1 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22491ag.m55586a(r6)
            r0.mo46861b(r1)
        L_0x0022:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = r4.f71893j
            r0.mo49880a(r5, r6)
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r4.f71892h
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.crossplatform.business.g r0 = r0.getCrossPlatformBusiness()
            if (r0 == 0) goto L_0x003e
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness> r1 = com.p683ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r0 = r0.mo55523a(r1)
            com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness r0 = (com.p683ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness) r0
            if (r0 == 0) goto L_0x003e
            r0.mo55487b(r6)
        L_0x003e:
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r4.f71892h
            r1 = 0
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.business.g r0 = r0.getCrossPlatformBusiness()
            if (r0 == 0) goto L_0x0052
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness> r2 = com.p683ss.android.ugc.aweme.crossplatform.business.PlayableBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r0 = r0.mo55523a(r2)
            com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness r0 = (com.p683ss.android.ugc.aweme.crossplatform.business.PlayableBusiness) r0
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            if (r0 == 0) goto L_0x005a
            com.bytedance.ies.g.a.a r2 = r4.f28943b
            r0.mo55507a(r5, r6, r2)
        L_0x005a:
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r4.f71892h
            if (r0 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.crossplatform.c.a r0 = r0.f71718a
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = r0.f71716m
        L_0x006a:
            com.ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness r0 = r4.m65674d()
            r2 = 1
            if (r0 == 0) goto L_0x007e
            java.lang.String r3 = "about:blank"
            boolean r6 = android.text.TextUtils.equals(r6, r3)
            if (r6 != 0) goto L_0x007e
            r0.f71671b = r2
            r0.mo55513a(r1)
        L_0x007e:
            com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness r6 = r4.mo55635b()
            if (r6 == 0) goto L_0x00ce
            boolean r0 = r6.mo55502e()
            if (r0 == 0) goto L_0x00cd
            java.util.Map r0 = r6.mo55499b()
            int r0 = r0.size()
            int r1 = r6.f71643b
            if (r0 >= r1) goto L_0x00cd
            if (r5 != 0) goto L_0x0099
            goto L_0x00ce
        L_0x0099:
            java.lang.String r0 = r5.getUrl()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00a9
            boolean r0 = p2628d.p2650m.C52830p.m112402a(r0)
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            if (r2 != 0) goto L_0x00ce
            java.lang.String r0 = "about:blank"
            java.lang.String r1 = r5.getUrl()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00b8
            goto L_0x00ce
        L_0x00b8:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            android.os.Handler r5 = r6.mo55496a()
            com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$e r1 = new com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$e
            r1.<init>(r6, r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2 = 200(0xc8, double:9.9E-322)
            r5.postDelayed(r1, r2)
        L_0x00cd:
            return
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27241h.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!(VERSION.SDK_INT < 21 || webResourceRequest == null || webResourceRequest.getUrl() == null || webResourceRequest.getRequestHeaders() == null)) {
            PassBackWebInfoBusiness b = mo55635b();
            if (b != null) {
                String uri = webResourceRequest.getUrl().toString();
                C52711k.m112236a((Object) uri, "request.url.toString()");
                Map requestHeaders = webResourceRequest.getRequestHeaders();
                C52711k.m112236a((Object) requestHeaders, "request.requestHeaders");
                C52711k.m112240b(uri, "url");
                C52711k.m112240b(requestHeaders, "headers");
                if (b.mo55502e() && b.mo55499b().size() < b.f71643b && !C52830p.m112402a(uri) && !C52711k.m112239a((Object) com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness.f64351b, (Object) uri) && !C52830p.m112413c(uri, ".js", false, 2, null) && !C52830p.m112413c(uri, ".css", false, 2, null)) {
                    String str = (String) requestHeaders.get("Accept");
                    if (str != null && C52830p.m112456b((CharSequence) str, (CharSequence) "html", false, 2, (Object) null)) {
                        Map c = b.mo55500c();
                        String a = C47803da.m103437a(uri);
                        C52711k.m112236a((Object) a, "Md5Utils.hexDigest(url)");
                        c.put(a, requestHeaders);
                    }
                }
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            d.f.a.m<? super android.webkit.WebView, ? super java.lang.String, java.lang.Boolean> r0 = r8.f71888d
            r1 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r8.m65672b(r9, r10)
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            d.f.a.m<? super android.webkit.WebView, ? super java.lang.String, java.lang.Boolean> r0 = r8.f71888d
            if (r0 != 0) goto L_0x001d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x001d:
            java.lang.Object r9 = r0.invoke(r9, r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0028:
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r8.f71892h
            r2 = 0
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.crossplatform.c.b r0 = r0.f71719b
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.f71769x
            if (r0 != r1) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = com.p683ss.android.newmedia.eplatform.C19550a.m47845a(r9, r10, r0)
            java.lang.String r3 = "BlockPolicy.ePlatformFil…terceptEPlatform == true)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0052
            return r1
        L_0x0052:
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r8.f71892h
            r3 = 0
            r4 = 2
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.crossplatform.c.b r0 = r0.f71719b
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.f71742F
            if (r0 != r1) goto L_0x008c
            java.lang.String r0 = ".apk"
            boolean r0 = p2628d.p2650m.C52830p.m112413c(r10, r0, r2, r4, r3)
            if (r0 == 0) goto L_0x008c
            android.content.Context r9 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.setAction(r2)
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r0.setData(r10)
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r10)
            r9.startActivity(r0)
            return r1
        L_0x008c:
            java.lang.String r0 = "__back_url__"
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x00ca
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r1 = p2628d.p2650m.C52830p.m112456b(r1, r5, r2, r4, r3)
            if (r1 == 0) goto L_0x00ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snssdk"
            r1.<init>(r2)
            int r2 = com.bytedance.ies.ugc.p694a.C11010c.m22289j()
            r1.append(r2)
            java.lang.String r2 = "://adx"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = android.net.Uri.encode(r1)
            java.lang.String r1 = "Uri.encode(AbsConstants.…er.getAppId() + \"://adx\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r10
            r3 = r0
            java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r2, r3, r4, r5, r6, r7)
            goto L_0x00cb
        L_0x00ca:
            r0 = r10
        L_0x00cb:
            boolean r0 = r8.m65668a(r9, r0)
            if (r0 != 0) goto L_0x00ea
            com.ss.android.ugc.aweme.crossplatform.b.e r1 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27139e.C27140a.m65474a()
            r2 = 3
            r1.mo55457a(r9, r10, r2)
            com.ss.android.ugc.aweme.af.a.l r9 = r8.f71891g
            if (r9 == 0) goto L_0x00ea
            java.lang.Class<com.ss.android.ugc.aweme.af.a.n> r1 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n.class
            com.ss.android.ugc.aweme.af.a.t r9 = r9.mo46870a(r1)
            com.ss.android.ugc.aweme.af.a.n r9 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n) r9
            if (r9 == 0) goto L_0x00ea
            r9.mo46863b(r10)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27241h.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        boolean b;
        String str2 = str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("use_geckox", C10181b.m20511a().mo18172a(GeckoXExperiment.class, true, "enable_gecko_x", 31744, false));
        C23794bh.m58383I().onUrlEvent(str2);
        C22521l lVar = this.f71891g;
        if (lVar != null) {
            C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
            if (nVar != null) {
                nVar.mo46865c(str2);
            }
        }
        C19761i iVar = this.f71889e;
        if (iVar != null) {
            WebResourceResponse a = iVar.mo41190a(webView, str2);
            if (a != null) {
                C22521l lVar2 = this.f71891g;
                if (lVar2 != null) {
                    C22524n nVar2 = (C22524n) lVar2.mo46870a(C22524n.class);
                    if (nVar2 != null) {
                        nVar2.mo46867d(str2);
                    }
                }
                jSONObject.put("offline_cache", 1);
                C22521l lVar3 = this.f71891g;
                if (lVar3 != null) {
                    C22524n nVar3 = (C22524n) lVar3.mo46870a(C22524n.class);
                    if (nVar3 != null) {
                        nVar3.mo46858a("use_offline_cache", "offline_cache", jSONObject, null, null);
                    }
                }
                return a;
            }
        } else {
            WebView webView2 = webView;
        }
        boolean z = false;
        jSONObject.put("offline_cache", 0);
        C22521l lVar4 = this.f71891g;
        if (lVar4 != null) {
            C22524n nVar4 = (C22524n) lVar4.mo46870a(C22524n.class);
            if (nVar4 != null) {
                nVar4.mo46858a("use_offline_cache", "offline_cache", jSONObject, null, null);
            }
        }
        C27251l lVar5 = this.f71890f;
        if (lVar5 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String sb2 = sb.toString();
            C52711k.m112240b(sb2, "url");
            C27257a.m65702a();
            String str3 = lVar5.f71903a;
            C52711k.m112240b(str3, "ref");
            C52711k.m112240b(sb2, "url");
            CharSequence charSequence = sb2;
            WebResourceResponse webResourceResponse = null;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence charSequence2 = str3;
                if (!TextUtils.isEmpty(charSequence2) && ((C52830p.m112456b(charSequence2, (CharSequence) WebKitApi.SCHEME_HTTPS, false, 2, (Object) null) || C52830p.m112456b(charSequence2, (CharSequence) WebKitApi.SCHEME_HTTP, false, 2, (Object) null)) && ((C52830p.m112456b(charSequence, (CharSequence) WebKitApi.SCHEME_HTTP, false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) WebKitApi.SCHEME_HTTPS, false, 2, (Object) null)) && !C52830p.m112456b(charSequence, (CharSequence) "/v1/list?rdn", false, 2, (Object) null) && !C52830p.m112456b(charSequence, (CharSequence) "google-analytics.com", false, 2, (Object) null) && !C52830p.m112456b(charSequence, (CharSequence) "cdn.polyfill.io", false, 2, (Object) null) && C10181b.m20511a().mo18172a(TTNetInterceptWebviewExperiment.class, true, "is_ttnet_intercept_webview", 31744, false)))) {
                    if (C10181b.m20511a().mo18172a(TTNetInterceptWebviewAllExperiment.class, true, "is_ttnet_intercept_all", 31744, false)) {
                        if (!C52830p.m112456b(charSequence2, (CharSequence) "ttnet_intercept=0", false, 2, (Object) null)) {
                            b = C27256n.m65701c(str3);
                        }
                    } else if (C52830p.m112456b(charSequence2, (CharSequence) "ttnet_intercept=1", false, 2, (Object) null)) {
                        z = true;
                    } else {
                        b = C27256n.m65700b(str3);
                    }
                    z = b;
                }
            }
            if (z) {
                C27249k kVar = new C27249k();
                C52711k.m112240b(str3, "ref");
                C52711k.m112240b(sb2, "url");
                if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(str3)) {
                    webResourceResponse = kVar.mo55640a(C27249k.m65688a(str3, sb2));
                }
            }
            if (webResourceResponse != null) {
                C22521l lVar6 = this.f71891g;
                if (lVar6 != null) {
                    C22524n nVar5 = (C22524n) lVar6.mo46870a(C22524n.class);
                    if (nVar5 != null) {
                        nVar5.mo46868e(str2);
                    }
                }
                return webResourceResponse;
            }
        }
        C22521l lVar7 = this.f71891g;
        if (lVar7 != null) {
            C22524n nVar6 = (C22524n) lVar7.mo46870a(C22524n.class);
            if (nVar6 != null) {
                nVar6.mo46869f(str2);
            }
        }
        C22521l lVar8 = this.f71891g;
        if (lVar8 != null) {
            C22524n nVar7 = (C22524n) lVar8.mo46870a(C22524n.class);
            if (nVar7 != null) {
                nVar7.mo46856a(str2);
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02db, code lost:
        if (r0.getVastUtilsService().mo54139b(r12) != false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0370, code lost:
        if (r2.getVastUtilsService().mo54139b(r12) != false) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03ac, code lost:
        if (r2.getVastUtilsService().mo54139b(r12) != false) goto L_0x03ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0178 A[ADDED_TO_REGION, Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c4 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01dc A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01e1 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e4 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e9 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01ef A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01fb A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02b7 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02df A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x030f A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0325 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03df A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0403 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0457 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0476 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0478 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[SYNTHETIC, Splitter:B:33:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012e A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0133 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0139 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013f A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0141 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0147 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0158 A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015d A[Catch:{ Exception -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0164 A[Catch:{ Exception -> 0x04cf }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m65668a(android.webkit.WebView r21, java.lang.String r22) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            r10 = r22
            java.lang.String r0 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "filterUrl = "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.agilelogger.C18778a.m45848b(r0, r1)
            android.content.Context r0 = r21.getContext()
            java.lang.String r1 = "webView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.newmedia.c r1 = r8.f71894k
            boolean r0 = r1.mo40799a(r0, r10)
            r11 = 1
            if (r0 == 0) goto L_0x002c
            return r11
        L_0x002c:
            boolean r0 = r20.m65672b(r21, r22)
            if (r0 == 0) goto L_0x0033
            return r11
        L_0x0033:
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()
            com.ss.android.ugc.aweme.commercialize.feed.ah r0 = r0.getAdOpenUtilsService()
            android.content.Context r1 = r21.getContext()
            boolean r0 = r0.mo53197b(r1, r10)
            if (r0 == 0) goto L_0x0046
            return r11
        L_0x0046:
            r12 = 0
            if (r10 != 0) goto L_0x004b
        L_0x0049:
            r0 = 0
            goto L_0x00af
        L_0x004b:
            android.net.Uri r0 = android.net.Uri.parse(r22)
            java.lang.String r1 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = r0.getScheme()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "bytedance"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r0.getHost()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "adPageHtmlContent"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness r1 = r20.mo55635b()
            if (r1 == 0) goto L_0x00ae
            boolean r2 = r1.mo55502e()
            if (r2 == 0) goto L_0x00ae
            if (r0 != 0) goto L_0x0083
            goto L_0x00ae
        L_0x0083:
            java.lang.String r2 = "url"
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r3 = "html"
            java.lang.String r0 = r0.getQueryParameter(r3)
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ae
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ae
            if (r2 != 0) goto L_0x00a6
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a6:
            if (r0 != 0) goto L_0x00ab
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ab:
            r1.mo55498a(r2, r0)
        L_0x00ae:
            r0 = 1
        L_0x00af:
            if (r0 == 0) goto L_0x00b2
            return r11
        L_0x00b2:
            android.net.Uri r13 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r0 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r0 = r13.getScheme()     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x00df
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = "Locale.getDefault()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "(this as java.lang.String).toLowerCase(locale)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x04cf }
            r15 = r0
            goto L_0x00e0
        L_0x00d7:
            d.u r0 = new d.u     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ Exception -> 0x04cf }
            throw r0     // Catch:{ Exception -> 0x04cf }
        L_0x00df:
            r15 = 0
        L_0x00e0:
            r0 = r15
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x04cf }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x00ea
            return r12
        L_0x00ea:
            java.lang.String r0 = "about"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r15)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x00f3
            return r12
        L_0x00f3:
            com.ss.android.sdk.activity.a.a r16 = com.p683ss.android.ugc.aweme.commercialize.utils.C26529n.m64186a()     // Catch:{ Exception -> 0x04cf }
            boolean r0 = r9 instanceof com.p683ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView     // Catch:{ Exception -> 0x04cf }
            if (r0 != 0) goto L_0x00fd
            r0 = 0
            goto L_0x00fe
        L_0x00fd:
            r0 = r9
        L_0x00fe:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView r0 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView) r0     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0107
            boolean r0 = r0.hasClickInTimeInterval()     // Catch:{ Exception -> 0x04cf }
            goto L_0x0108
        L_0x0107:
            r0 = 1
        L_0x0108:
            com.ss.android.ugc.aweme.crossplatform.activity.h r1 = r8.f71892h     // Catch:{ Exception -> 0x04cf }
            r2 = 0
            if (r1 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()     // Catch:{ Exception -> 0x04cf }
            if (r1 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r1.f71719b     // Catch:{ Exception -> 0x04cf }
            if (r1 == 0) goto L_0x011b
            long r4 = r1.f71745I     // Catch:{ Exception -> 0x04cf }
            goto L_0x011c
        L_0x011b:
            r4 = r2
        L_0x011c:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0142
            if (r0 != 0) goto L_0x0142
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04cf }
            r2 = 0
            long r0 = r0 - r4
            boolean r2 = r9 instanceof com.p683ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView     // Catch:{ Exception -> 0x04cf }
            if (r2 != 0) goto L_0x012e
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = r9
        L_0x012f:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView r2 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView) r2     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x0139
            int r2 = r2.getTimeInterval()     // Catch:{ Exception -> 0x04cf }
            long r2 = (long) r2     // Catch:{ Exception -> 0x04cf }
            goto L_0x013b
        L_0x0139:
            r2 = 500(0x1f4, double:2.47E-321)
        L_0x013b:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0141
            r0 = 1
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            r7 = r0
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r8.f71892h     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r0.getCrossPlatformParams()     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.crossplatform.c.b r0 = r0.f71719b     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0155
            boolean r0 = r0.f71760o     // Catch:{ Exception -> 0x04cf }
            r6 = r0
            goto L_0x0156
        L_0x0155:
            r6 = 0
        L_0x0156:
            if (r16 == 0) goto L_0x015d
            java.util.List r0 = r16.getClickJumpAllowList()     // Catch:{ Exception -> 0x04cf }
            goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            boolean r0 = com.p683ss.android.newmedia.C19562j.m47866a(r10, r15, r0)     // Catch:{ Exception -> 0x04cf }
            if (r0 != 0) goto L_0x0175
            if (r16 == 0) goto L_0x016b
            java.util.List r0 = r16.getAutoJumpAllowList()     // Catch:{ Exception -> 0x04cf }
            goto L_0x016c
        L_0x016b:
            r0 = 0
        L_0x016c:
            boolean r0 = com.p683ss.android.newmedia.C19562j.m47866a(r10, r15, r0)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r5 = 0
            goto L_0x0176
        L_0x0175:
            r5 = 1
        L_0x0176:
            if (r16 == 0) goto L_0x0184
            if (r6 == 0) goto L_0x0184
            boolean r0 = r16.isJumpControlEnabled()     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0184
            if (r5 != 0) goto L_0x0184
            if (r7 == 0) goto L_0x018c
        L_0x0184:
            if (r16 != 0) goto L_0x018e
            if (r6 == 0) goto L_0x018e
            if (r5 != 0) goto L_0x018e
            if (r7 != 0) goto L_0x018e
        L_0x018c:
            r4 = 1
            goto L_0x018f
        L_0x018e:
            r4 = 0
        L_0x018f:
            java.lang.String r0 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = "【filterUrl】 = "
            r1.<init>(r2)     // Catch:{ Exception -> 0x04cf }
            r1.append(r10)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = " 【forbidJump】= "
            r1.append(r2)     // Catch:{ Exception -> 0x04cf }
            r1.append(r6)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = " 【inWhiteList】= "
            r1.append(r2)     // Catch:{ Exception -> 0x04cf }
            r1.append(r5)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = " 【blockJump】= "
            r1.append(r2)     // Catch:{ Exception -> 0x04cf }
            r1.append(r4)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04cf }
            com.p683ss.android.agilelogger.C18778a.m45848b(r0, r1)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.crossplatform.activity.h r1 = r8.f71892h     // Catch:{ Exception -> 0x04cf }
            if (r1 == 0) goto L_0x01d5
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()     // Catch:{ Exception -> 0x04cf }
            if (r1 == 0) goto L_0x01d5
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r1.f71719b     // Catch:{ Exception -> 0x04cf }
            if (r1 == 0) goto L_0x01d5
            long r1 = r1.f71746a     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x04cf }
            goto L_0x01d6
        L_0x01d5:
            r1 = 0
        L_0x01d6:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.getRawAdAwemeByAdId(r1)     // Catch:{ Exception -> 0x04cf }
            if (r16 == 0) goto L_0x01e1
            boolean r0 = r16.isJumpControlEnabled()     // Catch:{ Exception -> 0x04cf }
            goto L_0x01e2
        L_0x01e1:
            r0 = 1
        L_0x01e2:
            if (r16 == 0) goto L_0x01e9
            boolean r1 = r16.isClickControlEnabled()     // Catch:{ Exception -> 0x04cf }
            goto L_0x01ea
        L_0x01e9:
            r1 = 1
        L_0x01ea:
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x01f8
            int r2 = r2.length()     // Catch:{ Exception -> 0x04cf }
            if (r2 != 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r2 = 0
            goto L_0x01f9
        L_0x01f8:
            r2 = 1
        L_0x01f9:
            if (r2 != 0) goto L_0x02b2
            if (r13 != 0) goto L_0x01ff
            goto L_0x02b2
        L_0x01ff:
            r2 = 41
            if (r7 != 0) goto L_0x027e
            if (r5 == 0) goto L_0x0245
            com.ss.android.ugc.aweme.crossplatform.activity.g r17 = new com.ss.android.ugc.aweme.crossplatform.activity.g     // Catch:{ Exception -> 0x04cf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04cf }
            java.lang.String r14 = "落地页一跳:在白名单中可跳转到第三方app(forbidJump="
            r1.<init>(r14)     // Catch:{ Exception -> 0x04cf }
            r1.append(r6)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r14 = " inWhiteList="
            r1.append(r14)     // Catch:{ Exception -> 0x04cf }
            r1.append(r5)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r14 = " isJumpControlEnabled="
            r1.append(r14)     // Catch:{ Exception -> 0x04cf }
            r1.append(r0)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r0 = " blockJump="
            r1.append(r0)     // Catch:{ Exception -> 0x04cf }
            r1.append(r4)     // Catch:{ Exception -> 0x04cf }
            r1.append(r2)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = r1.toString()     // Catch:{ Exception -> 0x04cf }
            r14 = 0
            r18 = 4
            r19 = 0
            r0 = r17
            r1 = r22
            r12 = r3
            r3 = r14
            r14 = r4
            r4 = r18
            r11 = r5
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x04cf }
            goto L_0x02ae
        L_0x0245:
            r12 = r3
            r14 = r4
            r11 = r5
            com.ss.android.ugc.aweme.crossplatform.activity.g r17 = new com.ss.android.ugc.aweme.crossplatform.activity.g     // Catch:{ Exception -> 0x04cf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = "落地页一跳:不在白名单中无法跳转到第三方app(forbidJump="
            r1.<init>(r3)     // Catch:{ Exception -> 0x04cf }
            r1.append(r6)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = " inWhiteList="
            r1.append(r3)     // Catch:{ Exception -> 0x04cf }
            r1.append(r11)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = " isJumpControlEnabled="
            r1.append(r3)     // Catch:{ Exception -> 0x04cf }
            r1.append(r0)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r0 = " blockJump="
            r1.append(r0)     // Catch:{ Exception -> 0x04cf }
            r1.append(r14)     // Catch:{ Exception -> 0x04cf }
            r1.append(r2)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = r1.toString()     // Catch:{ Exception -> 0x04cf }
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r17
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x04cf }
            goto L_0x02ae
        L_0x027e:
            r12 = r3
            r14 = r4
            r11 = r5
            com.ss.android.ugc.aweme.crossplatform.activity.g r17 = new com.ss.android.ugc.aweme.crossplatform.activity.g     // Catch:{ Exception -> 0x04cf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = "落地页二跳:无白名单限制，安装即可跳第三方app(forbidJump="
            r0.<init>(r3)     // Catch:{ Exception -> 0x04cf }
            r0.append(r6)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = " isClickControlEnabled="
            r0.append(r3)     // Catch:{ Exception -> 0x04cf }
            r0.append(r1)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = " blockJump="
            r0.append(r1)     // Catch:{ Exception -> 0x04cf }
            r0.append(r14)     // Catch:{ Exception -> 0x04cf }
            r0.append(r2)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x04cf }
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r17
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x04cf }
        L_0x02ae:
            com.p683ss.android.ugc.aweme.crossplatform.activity.C27108c.m65415a(r17)     // Catch:{ Exception -> 0x04cf }
            goto L_0x02b5
        L_0x02b2:
            r12 = r3
            r14 = r4
            r11 = r5
        L_0x02b5:
            if (r14 == 0) goto L_0x02dd
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "ILegacyCommercializeService.impl()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.commercialize.utils.bi r0 = r0.getVastUtilsService()     // Catch:{ Exception -> 0x04cf }
            boolean r0 = r0.mo54138a(r12)     // Catch:{ Exception -> 0x04cf }
            if (r0 != 0) goto L_0x02dd
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "ILegacyCommercializeService.impl()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.commercialize.utils.bi r0 = r0.getVastUtilsService()     // Catch:{ Exception -> 0x04cf }
            boolean r0 = r0.mo54139b(r12)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x03f9
        L_0x02dd:
            if (r15 != 0) goto L_0x02e2
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x04cf }
        L_0x02e2:
            android.content.Context r0 = r21.getContext()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "webView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r1)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "schema"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r1)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.ap r1 = com.p683ss.android.ugc.aweme.C23794bh.m58383I()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = "LegacyServiceUtils.getCrossPlatformLegacyService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = r13.getScheme()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = "market"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x0325
            boolean r2 = r1.hasGP(r0)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x031f
            boolean r2 = r1.openGpByMarketUri(r0, r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x0322
            r1.openAppWithLog(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
            goto L_0x0322
        L_0x031f:
            r1.logUninstalledEvent(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
        L_0x0322:
            r0 = 1
            goto L_0x03dd
        L_0x0325:
            boolean r2 = r1.isGpUri(r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x033e
            boolean r2 = r1.hasGP(r0)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x033b
            boolean r2 = r1.openGpByUri(r0, r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x0322
            r1.openAppWithLog(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
            goto L_0x0322
        L_0x033b:
            r0 = 0
            goto L_0x03dd
        L_0x033e:
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r2 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.commercialize.feed.ah r2 = r2.getAdOpenUtilsService()     // Catch:{ Exception -> 0x04cf }
            boolean r2 = r2.mo53194a(r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x0388
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r2 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = "ILegacyCommercializeService.impl()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.commercialize.utils.bi r2 = r2.getVastUtilsService()     // Catch:{ Exception -> 0x04cf }
            boolean r2 = r2.mo54138a(r12)     // Catch:{ Exception -> 0x04cf }
            if (r2 != 0) goto L_0x0372
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r2 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = "ILegacyCommercializeService.impl()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.commercialize.utils.bi r2 = r2.getVastUtilsService()     // Catch:{ Exception -> 0x04cf }
            boolean r2 = r2.mo54139b(r12)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x033b
        L_0x0372:
            boolean r2 = r1.hasAppByHttp(r0, r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x033b
            if (r11 != 0) goto L_0x037e
            r1.logAppNotInWhiteList(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
            goto L_0x033b
        L_0x037e:
            boolean r2 = r1.openAppByHttpUri(r0, r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x0322
            r1.openAppWithLog(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
            goto L_0x0322
        L_0x0388:
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r2 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = "ILegacyCommercializeService.impl()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.commercialize.utils.bi r2 = r2.getVastUtilsService()     // Catch:{ Exception -> 0x04cf }
            boolean r2 = r2.mo54138a(r12)     // Catch:{ Exception -> 0x04cf }
            if (r2 != 0) goto L_0x03ae
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r2 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()     // Catch:{ Exception -> 0x04cf }
            java.lang.String r3 = "ILegacyCommercializeService.impl()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.commercialize.utils.bi r2 = r2.getVastUtilsService()     // Catch:{ Exception -> 0x04cf }
            boolean r2 = r2.mo54139b(r12)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x033b
        L_0x03ae:
            boolean r2 = r1.hasAppWithoutHttp(r0, r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x03c5
            if (r11 != 0) goto L_0x03ba
            r1.logAppNotInWhiteList(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
            goto L_0x033b
        L_0x03ba:
            boolean r2 = r1.openAppWithoutHttpUri(r0, r13)     // Catch:{ Exception -> 0x04cf }
            if (r2 == 0) goto L_0x0322
            r1.openAppWithLog(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
            goto L_0x0322
        L_0x03c5:
            java.lang.String r2 = "sslocal"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r15)     // Catch:{ Exception -> 0x04cf }
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x033b
            java.lang.String r2 = "localsdk"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r15)     // Catch:{ Exception -> 0x04cf }
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x033b
            r1.logUninstalledEvent(r0, r12, r10)     // Catch:{ Exception -> 0x04cf }
            goto L_0x033b
        L_0x03dd:
            if (r0 == 0) goto L_0x03f9
            java.lang.String r0 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = "【filterUrl】 = "
            r1.<init>(r2)     // Catch:{ Exception -> 0x04cf }
            r1.append(r10)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = " 【handleOpenVastApp】= true"
            r1.append(r2)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04cf }
            com.p683ss.android.agilelogger.C18778a.m45848b(r0, r1)     // Catch:{ Exception -> 0x04cf }
            r0 = 1
            return r0
        L_0x03f9:
            java.lang.String r0 = "http"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r15)     // Catch:{ Exception -> 0x04cf }
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x04c4
            java.lang.String r0 = "https"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r15)     // Catch:{ Exception -> 0x04cf }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x04c4
            r0 = r20
            r1 = r12
            r2 = r15
            r3 = r7
            r4 = r22
            r5 = r21
            r11 = r6
            r6 = r16
            r9 = r7
            r7 = r11
            boolean r0 = r0.m65671a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0422
            r0 = 1
            return r0
        L_0x0422:
            r0 = 1
            if (r14 == 0) goto L_0x042a
            r1 = 0
            com.p683ss.android.ugc.aweme.crossplatform.platform.C27202a.m65622a(r10, r9, r1)     // Catch:{ Exception -> 0x04cf }
            return r0
        L_0x042a:
            if (r16 == 0) goto L_0x0435
            boolean r0 = r16.isClickControlEnabled()     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0433
            goto L_0x0435
        L_0x0433:
            r2 = 0
            goto L_0x044c
        L_0x0435:
            if (r9 != 0) goto L_0x0433
            if (r10 != 0) goto L_0x043c
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x04cf }
        L_0x043c:
            java.lang.String r0 = ".apk"
            r1 = 2
            r2 = 0
            r3 = 0
            boolean r0 = p2628d.p2650m.C52830p.m112413c(r10, r0, r2, r1, r3)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x044c
            com.p683ss.android.ugc.aweme.crossplatform.platform.C27202a.m65623b(r10, r9, r2)     // Catch:{ Exception -> 0x04cf }
            r0 = 1
            return r0
        L_0x044c:
            com.p683ss.android.ugc.aweme.crossplatform.platform.C27202a.m65624c(r10, r9, r2)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r0 = "sslocal"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r15)     // Catch:{ Exception -> 0x04cf }
            if (r0 != 0) goto L_0x0462
            java.lang.String r0 = "localsdk"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r15)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0460
            goto L_0x0462
        L_0x0460:
            r7 = r10
            goto L_0x0467
        L_0x0462:
            java.lang.String r0 = com.p683ss.android.newmedia.p1196b.C19543a.m47829a(r22)     // Catch:{ Exception -> 0x04cf }
            r7 = r0
        L_0x0467:
            r0 = r20
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r9
            r5 = r7
            r6 = r21
            boolean r0 = r0.m65669a(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0478
            r0 = 1
            return r0
        L_0x0478:
            android.content.Context r0 = r21.getContext()     // Catch:{ Exception -> 0x04cf }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x04cf }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x04cf }
            boolean r0 = com.p683ss.android.common.util.C18920g.m46049a(r0, r1)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x0493
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63878b()     // Catch:{ Exception -> 0x04cf }
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63875a()     // Catch:{ Exception -> 0x04cf }
        L_0x0493:
            r21.getUrl()     // Catch:{ Exception -> 0x04cf }
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r8.f71892h     // Catch:{ Exception -> 0x04cf }
            r0 = r21
            r1 = r0
            android.view.View r1 = (android.view.View) r1     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = "webView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)     // Catch:{ Exception -> 0x04cf }
            android.content.Context r0 = r21.getContext()     // Catch:{ Exception -> 0x04aa }
            r1 = 0
            com.p683ss.android.newmedia.p1196b.C19543a.m47830a(r0, r7, r1)     // Catch:{ Exception -> 0x04aa }
        L_0x04aa:
            java.lang.String r0 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = "【filterUrl】 = "
            r1.<init>(r2)     // Catch:{ Exception -> 0x04cf }
            r1.append(r10)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r2 = " 【open scheme final】"
            r1.append(r2)     // Catch:{ Exception -> 0x04cf }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04cf }
            com.p683ss.android.agilelogger.C18778a.m45848b(r0, r1)     // Catch:{ Exception -> 0x04cf }
            r0 = 1
            return r0
        L_0x04c4:
            r0 = r9
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r1 = r8.f71893j     // Catch:{ Exception -> 0x04cf }
            boolean r0 = r1.mo52683b(r0, r10)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x04cf
            r0 = 1
            return r0
        L_0x04cf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27241h.m65668a(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C22521l lVar = this.f71891g;
        if (lVar != null) {
            C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
            if (nVar != null) {
                nVar.mo46853a(webResourceRequest, webResourceResponse);
            }
        }
        this.f71893j.mo52681a(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C22521l lVar = this.f71891g;
        if (lVar != null) {
            C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
            if (nVar != null) {
                nVar.mo46850a(sslError);
            }
        }
        this.f71893j.mo52679a(webView, sslErrorHandler, sslError);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str != null) {
            C22521l lVar = this.f71891g;
            if (lVar != null) {
                C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
                if (nVar != null) {
                    nVar.mo46849a(C22491ag.m55586a(str));
                }
            }
        }
        this.f71893j.mo52682a(webView, str, bitmap);
        C27114h hVar = this.f71892h;
        if (hVar != null) {
            C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo55523a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.mo55486a(str);
                }
            }
        }
        PreRenderWebViewBusiness a = C27167a.m65568a((C27149c) this.f71892h);
        if (a != null) {
            C10757a aVar = this.f28943b;
            C52711k.m112236a((Object) aVar, "jsBridge");
            C52711k.m112240b(aVar, "jsBridge");
            a.f71667a = aVar;
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C22521l lVar = this.f71891g;
        if (lVar != null) {
            C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
            if (nVar != null) {
                nVar.mo46852a(webResourceRequest, webResourceError);
            }
        }
        this.f71893j.mo52680a(webView, webResourceRequest, webResourceError);
        C27114h hVar = this.f71892h;
        if (hVar != null) {
            C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo55523a(DouPlusMonitorBusiness.class);
                if (!(douPlusMonitorBusiness == null || !douPlusMonitorBusiness.f71635a || webResourceRequest == null || webResourceError == null || !webResourceRequest.isForMainFrame())) {
                    Uri url = webResourceRequest.getUrl();
                    if (url == null) {
                        douPlusMonitorBusiness.mo55484a(webResourceError.getErrorCode(), null, webView);
                    } else {
                        douPlusMonitorBusiness.mo55484a(webResourceError.getErrorCode(), url.toString(), webView);
                    }
                }
            }
        }
        QuickShopBusiness d = m65674d();
        if (d != null) {
            d.f71670a = true;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (VERSION.SDK_INT < 23) {
            C22521l lVar = this.f71891g;
            if (lVar != null) {
                C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
                if (nVar != null) {
                    nVar.mo46848a(i, str2);
                }
            }
        }
        this.f71893j.mo52678a(webView, i, str, str2);
        C27114h hVar = this.f71892h;
        if (hVar != null) {
            C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo55523a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.mo55484a(i, str2, webView);
                }
            }
        }
        QuickShopBusiness d = m65674d();
        if (d != null) {
            d.f71670a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m65667a(com.p683ss.android.ugc.aweme.feed.model.Aweme r4, android.net.Uri r5, java.lang.String r6, android.webkit.WebView r7) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r3.f71892h
            if (r0 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r3.f71892h
            if (r0 != 0) goto L_0x000b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000b:
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.crossplatform.activity.h r0 = r3.f71892h
            if (r0 != 0) goto L_0x0018
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0018:
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r0.getCrossPlatformParams()
            if (r0 != 0) goto L_0x0021
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0021:
            com.ss.android.ugc.aweme.crossplatform.c.b r0 = r0.f71719b
            com.ss.android.ugc.aweme.crossplatform.activity.h r1 = r3.f71892h
            if (r1 != 0) goto L_0x002a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x002a:
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()
            if (r1 != 0) goto L_0x0033
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0033:
            com.ss.android.ugc.aweme.crossplatform.c.a r1 = r1.f71718a
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x003b
            long r0 = r0.f71746a
        L_0x003b:
            java.lang.String r0 = ""
            if (r4 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r4.getAwemeRawAd()
            if (r1 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r4.getAwemeRawAd()
            if (r1 != 0) goto L_0x004e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004e:
            java.lang.String r2 = "aweme!!.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Long r1 = r1.getGroupId()
            if (r1 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 != 0) goto L_0x0062
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0062:
            java.lang.String r0 = "aweme!!.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            java.lang.Long r4 = r4.getGroupId()
            long r0 = r4.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0073:
            java.lang.String r4 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "【filterUrl】 = "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " 【market】 special handle"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.agilelogger.C18778a.m45848b(r4, r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.j r4 = com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27248j.f71900a
            com.ss.android.ugc.aweme.af.a.l r4 = r3.f71891g
            java.lang.String r1 = "webView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r1)
            java.lang.String r1 = "groupId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            r0.setData(r5)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r5)
            com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27248j.m65687a(r6, r4)
            android.content.Context r4 = r7.getContext()
            r4.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27241h.m65667a(com.ss.android.ugc.aweme.feed.model.Aweme, android.net.Uri, java.lang.String, android.webkit.WebView):void");
    }

    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r2v11, types: [com.ss.android.ugc.aweme.af.a.n] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v4
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.af.a.n, java.lang.String]
      uses: [java.lang.String, ?[OBJECT, ARRAY]]
      mth insns count: 131
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m65669a(com.p683ss.android.ugc.aweme.feed.model.Aweme r22, android.net.Uri r23, java.lang.String r24, boolean r25, java.lang.String r26, android.webkit.WebView r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r27
            r5 = 0
            if (r1 == 0) goto L_0x0162
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0162
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0021
            goto L_0x0162
        L_0x0021:
            java.lang.String r6 = "market"
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r2)
            r7 = 1
            if (r6 == 0) goto L_0x0030
            r6 = r22
            r0.m65667a(r6, r1, r3, r4)
            return r7
        L_0x0030:
            java.lang.String r1 = "intent"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x0161
            if (r25 == 0) goto L_0x0161
            java.lang.String r1 = "commerce_jump"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "【filterUrl】 = "
            r2.<init>(r6)
            r2.append(r3)
            java.lang.String r6 = " 【intent】 special handle"
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.agilelogger.C18778a.m45848b(r1, r2)
            com.ss.android.ugc.aweme.ap r1 = com.p683ss.android.ugc.aweme.C23794bh.m58383I()
            java.lang.String r2 = "LegacyServiceUtils.getCrossPlatformLegacyService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 0
            android.content.Intent r6 = android.content.Intent.parseUri(r3, r7)     // Catch:{ URISyntaxException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r6 = r2
        L_0x0062:
            android.content.Context r8 = r27.getContext()
            android.app.Activity r8 = com.p683ss.android.ugc.aweme.base.utils.C23729p.m58248a(r8)
            if (r8 == 0) goto L_0x0071
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            goto L_0x0072
        L_0x0071:
            r8 = r2
        L_0x0072:
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            if (r8 == 0) goto L_0x00cd
            if (r6 == 0) goto L_0x007d
            android.content.ComponentName r10 = r6.resolveActivity(r8)
            goto L_0x007e
        L_0x007d:
            r10 = r2
        L_0x007e:
            if (r10 == 0) goto L_0x00cd
            r6.addFlags(r9)
            if (r3 == 0) goto L_0x00c5
            com.ss.android.ugc.aweme.crossplatform.b.c r11 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a.m65458a()
            com.ss.android.ugc.aweme.af.a.l r1 = r0.f71891g
            if (r1 == 0) goto L_0x0096
            java.lang.Class<com.ss.android.ugc.aweme.af.a.n> r2 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n.class
            com.ss.android.ugc.aweme.af.a.t r1 = r1.mo46870a(r2)
            r2 = r1
            com.ss.android.ugc.aweme.af.a.n r2 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n) r2
        L_0x0096:
            r12 = r2
            com.ss.android.ugc.aweme.af.a.t r12 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t) r12
            java.lang.String r13 = "webview_safe_log"
            java.lang.String r14 = "filter_scheme"
            com.ss.android.ugc.aweme.af.a.w r1 = new com.ss.android.ugc.aweme.af.a.w
            android.net.Uri r2 = android.net.Uri.parse(r26)
            java.lang.String r3 = "Uri.parse(it)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r17 = "intent_scheme_"
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r1
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            org.json.JSONObject r15 = r1.getFormatData()
            r16 = 0
            r17 = 0
            r18 = 48
            r19 = 0
            com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.m65449a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00c5:
            android.content.Context r1 = r27.getContext()
            r1.startActivity(r6)
            return r7
        L_0x00cd:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "android.intent.action.VIEW"
            r10.<init>(r11)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.j r11 = com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27248j.f71900a
            com.ss.android.ugc.aweme.af.a.l r11 = r0.f71891g
            java.lang.String r12 = "service"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r12)
            java.lang.String r12 = "webView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r12)
            java.lang.String r12 = "marketIntent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r12)
            if (r6 == 0) goto L_0x0123
            android.content.Context r12 = r27.getContext()
            boolean r12 = r1.hasGP(r12)
            if (r12 == 0) goto L_0x0123
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "market://details?id="
            r12.<init>(r13)
            java.lang.String r13 = r6.getPackage()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.net.Uri r12 = android.net.Uri.parse(r12)
            r10.setData(r12)
            if (r8 == 0) goto L_0x0123
            android.content.ComponentName r8 = r10.resolveActivity(r8)
            if (r8 == 0) goto L_0x0123
            r6.addFlags(r9)
            com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27248j.m65687a(r3, r11)
            android.content.Context r3 = r27.getContext()
            r3.startActivity(r10)
            r3 = 1
            goto L_0x0124
        L_0x0123:
            r3 = 0
        L_0x0124:
            if (r3 == 0) goto L_0x0127
            return r7
        L_0x0127:
            if (r6 == 0) goto L_0x0130
            java.lang.String r3 = "browser_fallback_url"
            java.lang.String r3 = r6.getStringExtra(r3)
            goto L_0x0131
        L_0x0130:
            r3 = r2
        L_0x0131:
            if (r3 == 0) goto L_0x013d
            boolean r8 = com.p683ss.android.newmedia.C19547d.m47842a(r3)
            if (r8 == 0) goto L_0x013d
            com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27247i.m65686a(r4, r3)
            return r7
        L_0x013d:
            java.lang.String r3 = "service"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            java.lang.String r3 = "webView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r3)
            android.content.Context r3 = r27.getContext()
            boolean r3 = r1.hasGP(r3)
            if (r3 != 0) goto L_0x0160
            android.content.Context r3 = r27.getContext()
            if (r6 == 0) goto L_0x015b
            java.lang.String r2 = r6.getPackage()
        L_0x015b:
            boolean r1 = r1.openGPWebPage(r3, r2)
            return r1
        L_0x0160:
            return r5
        L_0x0161:
            return r5
        L_0x0162:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27241h.m65669a(com.ss.android.ugc.aweme.feed.model.Aweme, android.net.Uri, java.lang.String, boolean, java.lang.String, android.webkit.WebView):boolean");
    }

    /* renamed from: a */
    private final boolean m65671a(Aweme aweme, String str, boolean z, String str2, WebView webView, C19723a aVar, boolean z2) {
        Intent intent;
        Uri uri;
        String str3 = str2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || !C52711k.m112239a((Object) "intent", (Object) str) || z) {
            return false;
        }
        String str4 = null;
        try {
            intent = Intent.parseUri(str3, 1);
        } catch (URISyntaxException unused) {
            intent = null;
        }
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (m65670a(aweme, uri, z, webView, aVar, z2, false)) {
            return true;
        }
        if (intent != null) {
            str4 = intent.getStringExtra("browser_fallback_url");
        }
        if (!TextUtils.isEmpty(str4)) {
            if (m65670a(aweme, Uri.parse(str4), z, webView, aVar, z2, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m65670a(com.p683ss.android.ugc.aweme.feed.model.Aweme r8, android.net.Uri r9, boolean r10, android.webkit.WebView r11, com.p683ss.android.sdk.activity.p1208a.C19723a r12, boolean r13, boolean r14) {
        /*
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0008
            java.lang.String r1 = r9.toString()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            if (r9 == 0) goto L_0x002e
            java.lang.String r2 = r9.getScheme()
            if (r2 == 0) goto L_0x002e
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "Locale.getDefault()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            goto L_0x002f
        L_0x0026:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r9)
            throw r8
        L_0x002e:
            r2 = r0
        L_0x002f:
            if (r12 == 0) goto L_0x0036
            java.util.List r3 = r12.getClickJumpAllowList()
            goto L_0x0037
        L_0x0036:
            r3 = r0
        L_0x0037:
            boolean r3 = com.p683ss.android.newmedia.C19562j.m47866a(r1, r2, r3)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0050
            if (r12 == 0) goto L_0x0046
            java.util.List r3 = r12.getAutoJumpAllowList()
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            boolean r3 = com.p683ss.android.newmedia.C19562j.m47866a(r1, r2, r3)
            if (r3 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r3 = 0
            goto L_0x0051
        L_0x0050:
            r3 = 1
        L_0x0051:
            if (r12 == 0) goto L_0x005f
            if (r13 == 0) goto L_0x005f
            boolean r6 = r12.isJumpControlEnabled()
            if (r6 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x005f
            if (r10 == 0) goto L_0x0067
        L_0x005f:
            if (r12 != 0) goto L_0x0069
            if (r13 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0069
            if (r10 != 0) goto L_0x0069
        L_0x0067:
            r10 = 1
            goto L_0x006a
        L_0x0069:
            r10 = 0
        L_0x006a:
            if (r10 != 0) goto L_0x00b7
            boolean r10 = com.p683ss.android.newmedia.C19547d.m47842a(r1)
            if (r10 != 0) goto L_0x00b7
            java.lang.String r10 = "market"
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r2)
            if (r10 == 0) goto L_0x007e
            r7.m65667a(r8, r9, r1, r11)
            return r5
        L_0x007e:
            com.ss.android.ugc.aweme.ap r8 = com.p683ss.android.ugc.aweme.C23794bh.m58383I()
            android.content.Context r9 = r11.getContext()
            android.net.Uri r10 = android.net.Uri.parse(r1)
            boolean r8 = r8.hasAppWithoutHttp(r9, r10)
            if (r8 == 0) goto L_0x00b6
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63878b()
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63875a()
            android.content.Context r8 = r11.getContext()     // Catch:{ Exception -> 0x009d }
            com.p683ss.android.newmedia.p1196b.C19543a.m47830a(r8, r1, r0)     // Catch:{ Exception -> 0x009d }
        L_0x009d:
            java.lang.String r8 = "commerce_jump"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "【filterUrl】 = "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r10 = " 【open scheme final】"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.p683ss.android.agilelogger.C18778a.m45848b(r8, r9)
            return r5
        L_0x00b6:
            return r4
        L_0x00b7:
            if (r14 == 0) goto L_0x00c3
            boolean r8 = com.p683ss.android.newmedia.C19547d.m47842a(r1)
            if (r8 == 0) goto L_0x00c3
            com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27247i.m65686a(r11, r1)
            return r5
        L_0x00c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27241h.m65670a(com.ss.android.ugc.aweme.feed.model.Aweme, android.net.Uri, boolean, android.webkit.WebView, com.ss.android.sdk.activity.a.a, boolean, boolean):boolean");
    }
}
