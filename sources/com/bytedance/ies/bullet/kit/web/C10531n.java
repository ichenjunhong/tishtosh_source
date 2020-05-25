package com.bytedance.ies.bullet.kit.web;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.monitor.webview.C8892c;
import com.bytedance.ies.bullet.kit.web.C10479a.C10481b;
import com.bytedance.ies.bullet.kit.web.p649b.C10492a;
import com.bytedance.ies.bullet.kit.web.p649b.C10493b;
import com.bytedance.ies.bullet.kit.web.p649b.C10494c;
import com.bytedance.ies.bullet.kit.web.p649b.C10494c.C10495a;
import com.bytedance.ies.bullet.kit.web.p649b.C10498d;
import com.bytedance.ies.bullet.kit.web.p650c.C10500a;
import com.bytedance.ies.bullet.kit.web.p650c.C10504c;
import com.bytedance.ies.bullet.kit.web.p651d.C10515a;
import com.bytedance.ies.bullet.kit.web.p651d.C10516b;
import com.bytedance.ies.bullet.kit.web.p651d.C10516b.C10518b;
import com.bytedance.ies.bullet.p628b.C10250d;
import com.bytedance.ies.bullet.p628b.p629a.C10238a;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import com.bytedance.ies.bullet.p628b.p631c.C10247a;
import com.bytedance.ies.bullet.p628b.p631c.C10249c;
import com.bytedance.ies.bullet.p628b.p633e.C10277aa;
import com.bytedance.ies.bullet.p628b.p633e.C10286e;
import com.bytedance.ies.bullet.p628b.p633e.C10294m;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10270b;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10272g;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p633e.p635b.C10279a;
import com.bytedance.ies.bullet.p628b.p633e.p635b.C10280b;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p641h.C10345a;
import com.bytedance.ies.bullet.p628b.p641h.C10357d;
import com.bytedance.ies.bullet.p628b.p641h.C10358e;
import com.bytedance.ies.bullet.p628b.p641h.C10359f;
import com.bytedance.ies.bullet.p628b.p641h.C10360g;
import com.bytedance.ies.bullet.p628b.p641h.C10363j;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.C10560a;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10573c;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10584e;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.p675g.p677b.C10807s;
import com.bytedance.ies.p688h.C10979b;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.kit.web.n */
public final class C10531n extends C10573c<SSWebView> implements C10524g {

    /* renamed from: q */
    public static final C10532a f27977q = new C10532a(null);

    /* renamed from: e */
    public C10491b f27978e;

    /* renamed from: f */
    public final List<C10514d> f27979f = new ArrayList();

    /* renamed from: g */
    public final List<C10530m> f27980g = new ArrayList();

    /* renamed from: h */
    public final List<C10523f> f27981h = new ArrayList();

    /* renamed from: i */
    public C10516b f27982i;

    /* renamed from: j */
    public final List<String> f27983j = new ArrayList();

    /* renamed from: k */
    public final List<String> f27984k = new ArrayList();

    /* renamed from: l */
    public final List<String> f27985l = new ArrayList();

    /* renamed from: m */
    public Boolean f27986m;

    /* renamed from: n */
    public String f27987n;

    /* renamed from: o */
    public String f27988o;

    /* renamed from: p */
    public C10494c f27989p;

    /* renamed from: s */
    private WebViewClient f27990s;

    /* renamed from: t */
    private WebChromeClient f27991t;

    /* renamed from: u */
    private Uri f27992u;

    /* renamed from: v */
    private SSWebView f27993v;

    /* renamed from: w */
    private Map<String, String> f27994w;

    /* renamed from: x */
    private final C10533b f27995x = new C10533b(this);

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$a */
    public static final class C10532a {
        private C10532a() {
        }

        public /* synthetic */ C10532a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$b */
    public static final class C10533b extends C10560a {

        /* renamed from: a */
        final /* synthetic */ C10531n f27996a;

        /* renamed from: com.bytedance.ies.bullet.kit.web.n$b$a */
        public static final class C10534a implements C10276j {

            /* renamed from: a */
            public final JSONObject f27997a;

            /* renamed from: b */
            private final String f27998b = "viewDisappeared";

            /* renamed from: a */
            public final String mo18285a() {
                return this.f27998b;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo18286b() {
                return this.f27997a;
            }

            C10534a() {
            }
        }

        /* renamed from: com.bytedance.ies.bullet.kit.web.n$b$b */
        public static final class C10535b implements C10276j {

            /* renamed from: a */
            public final JSONObject f27999a;

            /* renamed from: b */
            private final String f28000b = "viewAppeared";

            /* renamed from: a */
            public final String mo18285a() {
                return this.f28000b;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo18286b() {
                return this.f27999a;
            }

            C10535b() {
            }
        }

        C10533b(C10531n nVar) {
            this.f27996a = nVar;
        }

        /* renamed from: b */
        public final void mo18672b(Activity activity) {
            C52711k.m112240b(activity, "activity");
            this.f27996a.onEvent(new C10534a());
        }

        /* renamed from: a */
        public final void mo18671a(Activity activity) {
            C52711k.m112240b(activity, "activity");
            this.f27996a.onEvent(new C10535b());
            for (C10575d dVar : this.f27996a.mo18754x()) {
                ((SSWebView) dVar.f28092b).resumeTimers();
            }
        }

        /* renamed from: c */
        public final boolean mo18673c(Activity activity) {
            WebView webView;
            C52711k.m112240b(activity, "activity");
            Iterator it = this.f27996a.mo18754x().iterator();
            while (true) {
                if (!it.hasNext()) {
                    webView = null;
                    break;
                }
                SSWebView sSWebView = (SSWebView) ((C10575d) it.next()).f28092b;
                if (sSWebView.canGoBack()) {
                    webView = sSWebView;
                    break;
                }
            }
            if (webView == null || !webView.canGoBack()) {
                return false;
            }
            webView.goBack();
            return true;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$c */
    static final class C10536c extends C52712l implements C52671b<C10527j, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10531n f28001a;

        /* renamed from: com.bytedance.ies.bullet.kit.web.n$c$a */
        static final class C10537a implements C10979b {

            /* renamed from: a */
            final /* synthetic */ C10515a f28002a;

            C10537a(C10515a aVar) {
                this.f28002a = aVar;
            }

            /* renamed from: a */
            public final boolean mo18674a(String str) {
                C52671b c = this.f28002a.mo18658c();
                C52711k.m112236a((Object) str, "str");
                return ((Boolean) c.invoke(str)).booleanValue();
            }
        }

        /* renamed from: com.bytedance.ies.bullet.kit.web.n$c$b */
        public static final class C10538b implements C10518b {

            /* renamed from: a */
            final /* synthetic */ C10515a f28003a;

            C10538b(C10515a aVar) {
                this.f28003a = aVar;
            }

            /* renamed from: a */
            public final WebResourceResponse mo18662a(String str) {
                C52711k.m112240b(str, "url");
                return (WebResourceResponse) this.f28003a.mo18659d().invoke(str);
            }
        }

        C10536c(C10531n nVar) {
            this.f28001a = nVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C10527j jVar = (C10527j) obj;
            C52711k.m112240b(jVar, "$receiver");
            boolean z = false;
            if (this.f28001a.f27978e == null) {
                this.f28001a.f27978e = jVar.mo18598a();
            } else {
                C10491b a = jVar.mo18598a();
                C10491b bVar = this.f28001a.f27978e;
                if (bVar != null) {
                    C10279a aVar = a;
                    C52711k.m112240b(aVar, "other");
                    for (Entry entry : aVar.mo18323a().entrySet()) {
                        C10280b bVar2 = (C10280b) bVar.mo18323a().get(entry.getKey());
                        if (bVar2 != null) {
                            if (bVar2 == null) {
                                throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.setting.IPropertySetter<kotlin.Any>");
                            } else if (bVar2 != null) {
                                C10280b bVar3 = (C10280b) entry.getValue();
                                if (bVar3 == null) {
                                    continue;
                                } else if (bVar3 == null) {
                                    throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.setting.IPropertySetter<kotlin.Any>");
                                } else if (bVar3 != null) {
                                    bVar2.mo18324a(bVar3, false);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            C10515a b = jVar.mo18600b();
            if (b != null) {
                if (this.f28001a.f27982i == null) {
                    z = true;
                }
                if (!z) {
                    b = null;
                }
                if (b != null) {
                    Application application = (Application) this.f28001a.mo18346d().mo18401c(Application.class);
                    C10238a aVar2 = (C10238a) this.f28001a.mo18346d().mo18401c(C10238a.class);
                    if (!(application == null || aVar2 == null)) {
                        C10531n nVar = this.f28001a;
                        C10516b bVar4 = new C10516b(application, aVar2.f27631b, aVar2.f27630a, b.mo18656a());
                        C10979b aVar3 = new C10537a(b);
                        C52711k.m112240b(aVar3, "offlineSourceCheck");
                        bVar4.f27972a.mo19781a(aVar3);
                        bVar4.f27972a.mo19783a(b.mo18657b());
                        List e = b.mo18660e();
                        C52711k.m112240b(e, "cachePrefix");
                        bVar4.f27972a.mo19782a(e);
                        C10518b bVar5 = new C10538b(b);
                        C52711k.m112240b(bVar5, "interceptor");
                        bVar4.f27973b = bVar5;
                        nVar.f27982i = bVar4;
                    }
                }
            }
            C10493b c = jVar.mo18601c();
            if (c != null) {
                Boolean a2 = c.mo18590a();
                if (a2 != null) {
                    boolean booleanValue = a2.booleanValue();
                    this.f28001a.f27986m = Boolean.valueOf(booleanValue);
                }
                String b2 = c.mo18591b();
                if (b2 != null) {
                    this.f28001a.f27987n = b2;
                }
                List c2 = c.mo18592c();
                if (c2 != null) {
                    this.f28001a.f27985l.addAll(c2);
                }
                List d = c.mo18593d();
                if (d != null) {
                    this.f28001a.f27983j.addAll(d);
                }
                List e2 = c.mo18594e();
                if (e2 != null) {
                    this.f28001a.f27984k.addAll(e2);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$d */
    static final class C10539d extends C52712l implements C52671b<File, C52860x> {

        /* renamed from: a */
        public static final C10539d f28004a = new C10539d();

        C10539d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((File) obj, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$e */
    static final class C10540e extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        public static final C10540e f28005a = new C10540e();

        C10540e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$f */
    static final class C10541f implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ C10531n f28006a;

        C10541f(C10531n nVar) {
            this.f28006a = nVar;
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            C10504c u = this.f28006a.mo18669u();
            if (u != null) {
                String str5 = "hybrid_app_monitor_h5_download";
                C10359f e = u.mo18414e();
                JSONObject jSONObject = new JSONObject();
                if (str != null) {
                    jSONObject.put("download_url", str);
                }
                if (str3 != null) {
                    jSONObject.put("content_disposition", str3);
                }
                if (str4 != null) {
                    jSONObject.put("mime_type", str4);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("content_length", j);
                C10345a.m20912a(u, str5, e, jSONObject, jSONObject2, null, 16, null);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$g */
    static final class C10542g extends C52712l implements C52682m<String, C10268e, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10531n f28007a;

        C10542g(C10531n nVar) {
            this.f28007a = nVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            final C10268e eVar = (C10268e) obj2;
            C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
            C52711k.m112240b(eVar, "iBridge");
            C10494c cVar = this.f28007a.f27989p;
            if (cVar != null) {
                C10762d r1 = new C10762d(this) {

                    /* renamed from: a */
                    final /* synthetic */ C10542g f28008a;

                    {
                        this.f28008a = r1;
                    }

                    public final void call(final C10766h hVar, JSONObject jSONObject) {
                        String str;
                        JSONObject jSONObject2;
                        JSONObject jSONObject3;
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        StringBuilder sb = new StringBuilder("bullet web fuc: ");
                        Boolean bool = null;
                        if (hVar != null) {
                            str = hVar.f28946c;
                        } else {
                            str = null;
                        }
                        sb.append(str);
                        if (hVar != null) {
                            jSONObject2 = hVar.f28947d;
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            jSONObject3 = hVar.f28947d;
                        } else {
                            jSONObject3 = new JSONObject();
                        }
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            String str2 = "type";
                            if (hVar != null) {
                                obj = hVar.f28944a;
                            } else {
                                obj = null;
                            }
                            jSONObject4.put(str2, obj);
                            String str3 = "func";
                            if (hVar != null) {
                                obj2 = hVar.f28946c;
                            } else {
                                obj2 = null;
                            }
                            jSONObject4.put(str3, obj2);
                            String str4 = "callback_id";
                            if (hVar != null) {
                                obj3 = hVar.f28945b;
                            } else {
                                obj3 = null;
                            }
                            jSONObject4.put(str4, obj3);
                            String str5 = C42311c.f106863g;
                            if (hVar != null) {
                                obj4 = Integer.valueOf(hVar.f28948e);
                            } else {
                                obj4 = null;
                            }
                            jSONObject4.put(str5, obj4);
                            String str6 = "needCallback";
                            if (hVar != null) {
                                bool = Boolean.valueOf(hVar.f28951h);
                            }
                            jSONObject4.put(str6, bool);
                            jSONObject3.put("jsMsg", jSONObject4);
                            jSONObject3.put("res", jSONObject);
                        } catch (JSONException unused) {
                        }
                        C10268e eVar = eVar;
                        C52711k.m112236a((Object) jSONObject3, "params");
                        eVar.mo18312a(jSONObject3, new C10270b(this) {

                            /* renamed from: a */
                            final /* synthetic */ C105431 f28010a;

                            /* renamed from: a */
                            public final void mo18315a(JSONObject jSONObject) {
                                C52711k.m112240b(jSONObject, "data");
                                C10494c cVar = this.f28010a.f28008a.f28007a.f27989p;
                                if (cVar != null) {
                                    cVar.mo18626b(hVar.f28945b, jSONObject);
                                }
                            }

                            {
                                this.f28010a = r1;
                            }

                            /* renamed from: a */
                            public final void mo18314a(int i, String str) {
                                C52711k.m112240b(str, "message");
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("code", i);
                                    jSONObject.put("msg", str);
                                    C10494c cVar = this.f28010a.f28008a.f28007a.f27989p;
                                    if (cVar != null) {
                                        cVar.mo18626b(hVar.f28945b, jSONObject);
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                        });
                        hVar.f28951h = eVar.mo18298c();
                    }
                };
                if (cVar.f27892i != null) {
                    C10807s sVar = cVar.f27892i;
                    if (sVar == null) {
                        C52711k.m112234a();
                    }
                    sVar.mo19585a(str, r1);
                } else {
                    C10757a aVar = cVar.f27891h;
                    if (aVar != null) {
                        aVar.mo19450a(str, r1);
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$h */
    public static final class C10545h extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ C10531n f28012a;

        /* renamed from: b */
        final /* synthetic */ WebView f28013b;

        /* renamed from: c */
        final /* synthetic */ C10575d f28014c;

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            for (C10530m a : this.f28012a.f27980g) {
                try {
                    a.mo18609a((C10524g) this.f28012a, renderProcessGoneDetail);
                    return C13482c.m27234a(webView, renderProcessGoneDetail);
                } catch (C10241d unused) {
                }
            }
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            C10529l lVar;
            for (C10530m mVar : this.f28012a.f27980g) {
                try {
                    C10524g gVar = this.f28012a;
                    if (webResourceRequest != null) {
                        lVar = C10479a.m21031a(webResourceRequest);
                    } else {
                        lVar = null;
                    }
                    return mVar.mo18611b(gVar, lVar);
                } catch (C10241d unused) {
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C10529l lVar;
            for (C10530m mVar : this.f28012a.f27980g) {
                try {
                    C10524g gVar = this.f28012a;
                    if (webResourceRequest != null) {
                        lVar = C10479a.m21031a(webResourceRequest);
                    } else {
                        lVar = null;
                    }
                    return mVar.mo18610a(gVar, lVar);
                } catch (C10241d unused) {
                }
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            C10504c u = this.f28012a.mo18669u();
            if (u != null) {
                C10500a h = u.mo18652h();
                if (h != null) {
                    h.mo18642d(str);
                }
            }
            C10494c cVar = this.f28012a.f27989p;
            if (cVar != null) {
                C10757a aVar = cVar.f27891h;
                if (aVar != null) {
                    aVar.mo19461c(str);
                }
            }
            for (C10530m d : this.f28012a.f27980g) {
                try {
                    d.mo18614d(this.f28012a, str);
                } catch (C10241d unused) {
                }
            }
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            for (C10530m b : this.f28012a.f27980g) {
                try {
                    return b.mo18612b((C10524g) this.f28012a, str);
                } catch (C10241d unused) {
                }
            }
            C10494c cVar = this.f28012a.f27989p;
            if (cVar != null) {
                C10757a aVar = cVar.f27891h;
                if (aVar != null) {
                    Boolean valueOf = Boolean.valueOf(aVar.mo19459b(str));
                    if (!valueOf.booleanValue()) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        return valueOf.booleanValue();
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            boolean z;
            Uri uri;
            String str2;
            boolean z2;
            JSONObject jSONObject;
            boolean z3;
            JSONObject jSONObject2;
            C10359f fVar;
            WebView webView2 = webView;
            String str3 = str;
            super.onPageFinished(webView, str);
            if (str3 != null) {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    C10504c u = this.f28012a.mo18669u();
                    if (u != null) {
                        C52711k.m112240b(parse, "uri");
                        if (C52711k.m112239a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C52711k.m112239a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            uri = parse;
                        } else {
                            uri = null;
                        }
                        if (uri != null) {
                            Long l = (Long) u.f27953q.remove(uri);
                            if (l != null) {
                                long longValue = l.longValue();
                                C10500a h = u.mo18652h();
                                if (h != null) {
                                    h.mo18640c(u.mo18415f().f27804b.mo18433b());
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                if (u.f27950n) {
                                    longValue = u.f27951o;
                                }
                                if (u.f27950n) {
                                    u.f27952p = currentTimeMillis;
                                }
                                String str4 = "hybrid_app_monitor_load_url_event";
                                C10359f e = u.mo18414e();
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("trigger", "on_load");
                                String str5 = "is_first_screen";
                                if (u.f27950n) {
                                    str2 = "first_screen";
                                } else {
                                    str2 = "navigation";
                                }
                                jSONObject3.put(str5, str2);
                                JSONObject jSONObject4 = new JSONObject();
                                if (currentTimeMillis <= 0 || longValue <= 0) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    jSONObject = jSONObject4;
                                } else {
                                    jSONObject = null;
                                }
                                if (jSONObject != null) {
                                    jSONObject.put("page_load_interval", currentTimeMillis - longValue);
                                }
                                if (u.f27952p <= 0 || u.f27951o <= 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    jSONObject2 = jSONObject4;
                                } else {
                                    jSONObject2 = null;
                                }
                                if (jSONObject2 != null) {
                                    fVar = e;
                                    jSONObject2.put("first_screen_page_load_interval", u.f27952p - u.f27951o);
                                } else {
                                    fVar = e;
                                }
                                jSONObject4.put("event_ts", currentTimeMillis);
                                C10345a.m20912a(u, str4, fVar, jSONObject3, jSONObject4, null, 16, null);
                                u.f27950n = false;
                            }
                        }
                    }
                    this.f28014c.mo18759b(parse);
                }
            }
            if (webView2 != null) {
                String str6 = this.f28012a.mo18352k_().f27674a;
                C52711k.m112240b(webView2, "webView");
                if (str6 != null) {
                    StringBuilder sb = new StringBuilder("javascript:(function () {    window.reactId = '");
                    sb.append(str6);
                    sb.append("';})();");
                    C10498d.m21109a(webView2, sb.toString());
                }
            }
            for (C10530m a : this.f28012a.f27980g) {
                try {
                    a.mo18607a((C10524g) this.f28012a, str3);
                } catch (C10241d unused) {
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00cb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r14, java.lang.String r15) {
            /*
                r13 = this;
                if (r15 == 0) goto L_0x0020
                com.bytedance.ies.bullet.kit.web.n r0 = r13.f28012a
                com.bytedance.ies.bullet.kit.web.d.b r0 = r0.f27982i
                if (r0 == 0) goto L_0x0020
                android.webkit.WebResourceResponse r0 = r0.mo18661a(r14, r15)
                if (r0 == 0) goto L_0x0020
                com.bytedance.ies.bullet.kit.web.n r14 = r13.f28012a
                com.bytedance.ies.bullet.kit.web.c.c r14 = r14.mo18669u()
                if (r14 == 0) goto L_0x001f
                com.bytedance.ies.bullet.kit.web.c.a r14 = r14.mo18652h()
                if (r14 == 0) goto L_0x001f
                r14.mo18645f(r15)
            L_0x001f:
                return r0
            L_0x0020:
                com.bytedance.ies.bullet.kit.web.n r0 = r13.f28012a
                java.util.List<com.bytedance.ies.bullet.kit.web.m> r0 = r0.f27980g
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x002a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x003f
                java.lang.Object r1 = r0.next()
                com.bytedance.ies.bullet.kit.web.m r1 = (com.bytedance.ies.bullet.kit.web.C10530m) r1
                com.bytedance.ies.bullet.kit.web.n r2 = r13.f28012a     // Catch:{ d -> 0x002a }
                com.bytedance.ies.bullet.kit.web.g r2 = (com.bytedance.ies.bullet.kit.web.C10524g) r2     // Catch:{ d -> 0x002a }
                android.webkit.WebResourceResponse r1 = r1.mo18613c(r2, r15)     // Catch:{ d -> 0x002a }
                return r1
            L_0x003f:
                com.bytedance.ies.bullet.kit.web.n r0 = r13.f28012a
                com.bytedance.ies.bullet.kit.web.c.c r0 = r0.mo18669u()
                if (r0 == 0) goto L_0x0050
                com.bytedance.ies.bullet.kit.web.c.a r0 = r0.mo18652h()
                if (r0 == 0) goto L_0x0050
                r0.mo18644e(r15)
            L_0x0050:
                com.bytedance.ies.bullet.kit.web.n r0 = r13.f28012a
                com.bytedance.ies.bullet.kit.web.c.c r1 = r0.mo18669u()
                if (r1 == 0) goto L_0x0147
                java.lang.String r0 = "should_intercept_request"
                if (r15 == 0) goto L_0x0147
                android.net.Uri r2 = android.net.Uri.parse(r15)
                if (r2 == 0) goto L_0x0147
                boolean r3 = r1.mo18651a(r2, r0)
                r4 = 0
                if (r3 != 0) goto L_0x006a
                goto L_0x006b
            L_0x006a:
                r2 = r4
            L_0x006b:
                if (r2 == 0) goto L_0x0147
                java.lang.String r3 = r2.getScheme()
                if (r3 == 0) goto L_0x0147
                java.util.Locale r5 = java.util.Locale.getDefault()
                java.lang.String r6 = "Locale.getDefault()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                if (r3 == 0) goto L_0x013f
                java.lang.String r5 = r3.toLowerCase(r5)
                java.lang.String r6 = "(this as java.lang.String).toLowerCase(locale)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                java.lang.String r6 = "http"
                boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
                r7 = 0
                r8 = 1
                if (r6 != 0) goto L_0x009c
                java.lang.String r6 = "https"
                boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
                if (r5 == 0) goto L_0x009a
                goto L_0x009c
            L_0x009a:
                r5 = 0
                goto L_0x009d
            L_0x009c:
                r5 = 1
            L_0x009d:
                if (r5 == 0) goto L_0x00a0
                goto L_0x00a1
            L_0x00a0:
                r3 = r4
            L_0x00a1:
                if (r3 == 0) goto L_0x0147
                com.bytedance.ies.bullet.b.h.g r3 = new com.bytedance.ies.bullet.b.h.g
                java.lang.String r5 = "resource"
                r3.<init>(r2, r5)
                com.bytedance.ies.bullet.b.h.e r5 = r1.mo18412c()
                if (r5 == 0) goto L_0x00c1
                com.bytedance.ies.bullet.b.h.e r5 = r1.mo18412c()
                if (r5 != 0) goto L_0x00b9
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00b9:
                boolean r5 = r5.mo18428e()
                if (r5 == 0) goto L_0x00c1
                r5 = 1
                goto L_0x00c2
            L_0x00c1:
                r5 = 0
            L_0x00c2:
                if (r5 == 0) goto L_0x00c6
                r5 = r1
                goto L_0x00c7
            L_0x00c6:
                r5 = r4
            L_0x00c7:
                com.bytedance.ies.bullet.kit.web.c.c r5 = (com.bytedance.ies.bullet.kit.web.p650c.C10504c) r5
                if (r5 == 0) goto L_0x0147
                com.bytedance.ies.bullet.b.h.e r6 = r1.mo18412c()
                if (r6 == 0) goto L_0x00df
                com.bytedance.ies.bullet.b.h.e r6 = r1.mo18412c()
                if (r6 != 0) goto L_0x00da
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00da:
                java.util.List r6 = r6.mo18429f()
                goto L_0x00e6
            L_0x00df:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.List r6 = (java.util.List) r6
            L_0x00e6:
                boolean r9 = r6.isEmpty()
                if (r9 == 0) goto L_0x00ed
                goto L_0x0115
            L_0x00ed:
                java.util.Iterator r6 = r6.iterator()
            L_0x00f1:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x0114
                java.lang.Object r9 = r6.next()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r10 = r2.getHost()
                if (r10 == 0) goto L_0x00f1
                r11 = r10
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r12 = 2
                boolean r9 = p2628d.p2650m.C52830p.m112456b(r11, r9, r7, r12, r4)
                if (r9 == 0) goto L_0x0110
                goto L_0x0111
            L_0x0110:
                r10 = r4
            L_0x0111:
                if (r10 == 0) goto L_0x00f1
                goto L_0x0115
            L_0x0114:
                r8 = 0
            L_0x0115:
                if (r8 == 0) goto L_0x0118
                r4 = r5
            L_0x0118:
                if (r4 == 0) goto L_0x0147
                java.lang.String r2 = "hybrid_app_monitor_resource_load_event"
                com.bytedance.ies.bullet.b.h.j r4 = r1.mo18415f()
                com.bytedance.ies.bullet.b.h.f r4 = (com.bytedance.ies.bullet.p628b.p641h.C10359f) r4
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r6 = "trigger"
                r5.put(r6, r0)
                org.json.JSONObject r0 = r3.mo18402a()
                com.bytedance.ies.bullet.p628b.p629a.C10240c.m20716a(r5, r0)
                r0 = 0
                r6 = 0
                r7 = 24
                r8 = 0
                r3 = r4
                r4 = r5
                r5 = r0
                com.bytedance.ies.bullet.p628b.p641h.C10345a.m20912a(r1, r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0147
            L_0x013f:
                d.u r14 = new d.u
                java.lang.String r15 = "null cannot be cast to non-null type java.lang.String"
                r14.<init>(r15)
                throw r14
            L_0x0147:
                android.webkit.WebResourceResponse r14 = super.shouldInterceptRequest(r14, r15)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.web.C10531n.C10545h.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
        }

        C10545h(C10531n nVar, WebView webView, C10575d dVar) {
            this.f28012a = nVar;
            this.f28013b = webView;
            this.f28014c = dVar;
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            C10504c u = this.f28012a.mo18669u();
            if (u != null) {
                C10500a h = u.mo18652h();
                if (h != null) {
                    h.mo18634a(webResourceRequest, webResourceResponse);
                }
                String str = "hybrid_app_monitor_h5_received_error";
                C10359f e = u.mo18414e();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trigger", "on_received_http_error");
                if (webResourceResponse != null) {
                    jSONObject.put("received_status_code", String.valueOf(webResourceResponse.getStatusCode()));
                }
                if (webResourceRequest != null) {
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        jSONObject.put("failing_url", url.toString());
                    }
                }
                C10345a.m20912a(u, str, e, jSONObject, null, null, 24, null);
            }
            for (C10530m a : this.f28012a.f27980g) {
                try {
                    a.mo18605a((C10524g) this.f28012a, webResourceRequest, webResourceResponse);
                } catch (C10241d unused) {
                }
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            C10504c u = this.f28012a.mo18669u();
            if (u != null) {
                C10500a h = u.mo18652h();
                if (h != null) {
                    h.mo18632a(sslError);
                }
                String str = "hybrid_app_monitor_h5_received_error";
                C10359f e = u.mo18414e();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trigger", "on_received_ssl_error");
                if (sslError != null) {
                    jSONObject.put("received_primary_error", String.valueOf(sslError.getPrimaryError()));
                    jSONObject.put("failing_url", sslError.getUrl());
                }
                C10345a.m20912a(u, str, e, jSONObject, null, null, 24, null);
            }
            for (C10530m a : this.f28012a.f27980g) {
                try {
                    a.mo18604a((C10524g) this.f28012a, sslErrorHandler, sslError);
                } catch (C10241d unused) {
                }
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            String str2 = str;
            super.onPageStarted(webView, str, bitmap);
            if (str2 != null) {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    C10504c u = this.f28012a.mo18669u();
                    if (u != null) {
                        C52711k.m112240b(parse, "uri");
                        boolean z2 = false;
                        if (C52711k.m112239a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C52711k.m112239a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        JSONObject jSONObject = null;
                        if (!z) {
                            parse = null;
                        }
                        if (parse != null) {
                            C10363j f = u.mo18415f();
                            C52711k.m112240b(parse, "value");
                            f.f27805c = parse;
                            f.f27804b = new C10360g(f.f27805c, "page");
                            C10500a h = u.mo18652h();
                            if (h != null) {
                                h.mo18638b(u.mo18415f().f27804b.mo18433b());
                            }
                            C8892c j = u.mo18654j();
                            if (j != null) {
                                j.mo15895a(u.mo18653i());
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            u.f27953q.put(parse, Long.valueOf(currentTimeMillis));
                            if (u.f27950n) {
                                u = null;
                            }
                            C10504c cVar = u;
                            if (cVar != null) {
                                String str3 = "hybrid_app_monitor_load_url_event";
                                C10359f e = cVar.mo18414e();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("trigger", "navigation_start");
                                jSONObject2.put("is_first_screen", "navigation");
                                JSONObject jSONObject3 = new JSONObject();
                                if (cVar.f27952p > 0 && cVar.f27951o > 0) {
                                    z2 = true;
                                }
                                if (z2) {
                                    jSONObject = jSONObject3;
                                }
                                if (jSONObject != null) {
                                    jSONObject.put("first_screen_page_load_interval", cVar.f27952p - cVar.f27951o);
                                }
                                jSONObject3.put("event_ts", currentTimeMillis);
                                C10345a.m20912a(cVar, str3, e, jSONObject2, jSONObject3, null, 16, null);
                            }
                        }
                    }
                }
            }
            for (C10530m a : this.f28012a.f27980g) {
                try {
                    try {
                        a.mo18608a(this.f28012a, str2, bitmap);
                    } catch (C10241d unused) {
                    }
                } catch (C10241d unused2) {
                    Bitmap bitmap2 = bitmap;
                }
            }
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C10529l lVar;
            C10528k kVar;
            int i;
            CharSequence charSequence;
            CharSequence charSequence2;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            C10504c u = this.f28012a.mo18669u();
            if (u != null) {
                C10500a h = u.mo18652h();
                if (h != null) {
                    h.mo18633a(webResourceRequest, webResourceError);
                }
                String str = "hybrid_app_monitor_h5_received_error";
                C10359f e = u.mo18414e();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trigger", "on_received_error");
                if (webResourceError != null) {
                    jSONObject.put("received_error_code", String.valueOf(webResourceError.getErrorCode()));
                    jSONObject.put("received_error_desc", webResourceError.getDescription());
                }
                if (webResourceRequest != null) {
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        jSONObject.put("failing_url", url.toString());
                    }
                }
                C10345a.m20912a(u, str, e, jSONObject, null, null, 24, null);
            }
            String url2 = this.f28013b.getUrl();
            if (url2 != null) {
                C10575d dVar = this.f28014c;
                Uri parse = Uri.parse(url2);
                C52711k.m112236a((Object) parse, "Uri.parse(it)");
                if (webResourceError != null) {
                    i = webResourceError.getErrorCode();
                } else {
                    i = 0;
                }
                if (webResourceError != null) {
                    charSequence = webResourceError.getDescription();
                } else {
                    charSequence = null;
                }
                if (webResourceRequest != null) {
                    Uri url3 = webResourceRequest.getUrl();
                    if (url3 != null) {
                        charSequence2 = url3.toString();
                        dVar.mo18757a(parse, new C10549p(i, charSequence, charSequence2));
                    }
                }
                charSequence2 = null;
                dVar.mo18757a(parse, new C10549p(i, charSequence, charSequence2));
            }
            for (C10530m mVar : this.f28012a.f27980g) {
                try {
                    C10524g gVar = this.f28012a;
                    if (webResourceRequest != null) {
                        lVar = C10479a.m21031a(webResourceRequest);
                    } else {
                        lVar = null;
                    }
                    if (webResourceError != null) {
                        C52711k.m112240b(webResourceError, "$this$transform");
                        kVar = new C10481b(webResourceError);
                    } else {
                        kVar = null;
                    }
                    mVar.mo18606a(gVar, lVar, kVar);
                } catch (C10241d unused) {
                }
            }
        }

        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            for (C10530m a : this.f28012a.f27980g) {
                try {
                    a.mo18603a((C10524g) this.f28012a, httpAuthHandler, str, str2);
                } catch (C10241d unused) {
                }
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (VERSION.SDK_INT < 23) {
                C10504c u = this.f28012a.mo18669u();
                if (u != null) {
                    C10500a h = u.mo18652h();
                    if (h != null) {
                        h.mo18631a(i, str2);
                    }
                    String str3 = "hybrid_app_monitor_h5_received_error";
                    C10359f e = u.mo18414e();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger", "on_received_error");
                    jSONObject.put("received_error_code", String.valueOf(i));
                    if (str2 != null) {
                        jSONObject.put("failing_url", str2);
                    }
                    C10345a.m20912a(u, str3, e, jSONObject, null, null, 24, null);
                }
                String url = this.f28013b.getUrl();
                if (url != null) {
                    C10575d dVar = this.f28014c;
                    Uri parse = Uri.parse(url);
                    C52711k.m112236a((Object) parse, "Uri.parse(it)");
                    dVar.mo18757a(parse, new C10549p(i, str, str2));
                }
                for (C10530m a : this.f28012a.f27980g) {
                    try {
                        a.mo18602a((C10524g) this.f28012a, i, str, str2);
                    } catch (C10241d unused) {
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$i */
    static final class C10546i extends C52712l implements C52682m<String, C10268e, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10531n f28015a;

        C10546i(C10531n nVar) {
            this.f28015a = nVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C10268e eVar = (C10268e) obj2;
            C52711k.m112240b(str, "s");
            C52711k.m112240b(eVar, "iBridge");
            switch (C10548o.f28017a[eVar.mo18297b().ordinal()]) {
                case 1:
                    List<String> list = this.f28015a.f27983j;
                    if (!(!this.f28015a.f27983j.contains(str))) {
                        list = null;
                    }
                    if (list != null) {
                        list.add(str);
                        break;
                    }
                    break;
                case 2:
                    List<String> list2 = this.f28015a.f27984k;
                    if (!(!this.f28015a.f27984k.contains(str))) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        list2.add(str);
                        break;
                    }
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.n$j */
    static final class C10547j extends C52712l implements C52671b<C10525h, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10531n f28016a;

        C10547j(C10531n nVar) {
            this.f28016a = nVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C10525h hVar = (C10525h) obj;
            C52711k.m112240b(hVar, "$receiver");
            C10530m a = hVar.mo18595a();
            if (a != null) {
                this.f28016a.f27980g.add(a);
            }
            C10523f b = hVar.mo18596b();
            if (b != null) {
                this.f28016a.f27981h.add(b);
            }
            C10514d c = hVar.mo18597c();
            if (c != null) {
                this.f28016a.f27979f.add(c);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: z */
    private Map<String, String> m21206z() {
        return this.f27994w;
    }

    /* renamed from: a */
    public final boolean mo18361a(Uri uri, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "reject");
        return true;
    }

    /* renamed from: c */
    public final void mo18366c(List<String> list, C10250d dVar) {
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar, "newRegistryBundle");
    }

    /* renamed from: h */
    public final Uri mo18350h() {
        return this.f27992u;
    }

    /* renamed from: v */
    public final String mo18670v() {
        return "BulletWeb";
    }

    /* renamed from: j */
    public final C10492a mo18664j() {
        return this.f27989p;
    }

    /* renamed from: w */
    private final C10578a m21205w() {
        C10423r f = mo18348f();
        if (f == null) {
            C52711k.m112234a();
        }
        if (f != null) {
            return (C10578a) f;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.params.CommonParamsBundle");
    }

    /* renamed from: m_ */
    public final WebView mo18665m_() {
        WebView webView;
        C10575d a = mo18753a();
        if (a != null) {
            webView = a.f28092b;
        } else {
            webView = null;
        }
        if (!(webView instanceof WebView)) {
            webView = null;
        }
        return webView;
    }

    /* renamed from: u */
    public final C10504c mo18669u() {
        C10345a g = mo18349g();
        if (g == null) {
            return null;
        }
        if (g != null) {
            return (C10504c) g;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.monitor.WebKitMonitorSession");
    }

    /* renamed from: s */
    public final void mo18376s() {
        C10577d y = mo18755y();
        if (y != null) {
            y.mo18715a(this.f27995x);
        }
        C10247a o = mo18372o();
        if (o != null) {
            o.mo18278b(C10249c.m20728a(""), C10539d.f28004a, C10540e.f28005a);
        }
    }

    /* renamed from: r */
    public final void mo18375r() {
        boolean z;
        C10527j jVar = null;
        this.f27978e = null;
        this.f27982i = null;
        this.f27986m = null;
        this.f27987n = null;
        this.f27988o = null;
        this.f27985l.clear();
        this.f27983j.clear();
        this.f27984k.clear();
        C52671b cVar = new C10536c(this);
        for (C10294m mVar : mo18368l()) {
            if (!(mVar instanceof C10527j)) {
                mVar = null;
            }
            C10527j jVar2 = (C10527j) mVar;
            if (jVar2 != null) {
                cVar.invoke(jVar2);
            }
        }
        C10294m l_ = mo18369l_();
        if (l_ instanceof C10527j) {
            jVar = l_;
        }
        C10527j jVar3 = jVar;
        if (jVar3 != null) {
            cVar.invoke(jVar3);
        }
        if (this.f27682c) {
            Context context = (Context) mo18346d().mo18401c(Context.class);
            if (context != null) {
                SSWebView sSWebView = new SSWebView(context, null, 0, 6, null);
                this.f27993v = sSWebView;
                SSWebView sSWebView2 = this.f27993v;
                if (sSWebView2 == null) {
                    C52711k.m112237a("mWebView");
                }
                C10494c a = C10495a.m21106a(sSWebView2);
                Boolean bool = this.f27986m;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                C10494c a2 = a.mo18621a(z);
                String str = this.f27987n;
                if (str == null) {
                    str = "ToutiaoJSBridge";
                }
                C10494c b = a2.mo18624b(str);
                String str2 = this.f27988o;
                if (str2 == null) {
                    str2 = "bytedance";
                }
                C10494c b2 = b.mo18627c(str2).mo18620a(this.f27985l).mo18625b(this.f27983j).mo18628c(this.f27984k).mo18623b();
                mo18346d().mo18400b(C10757a.class, b2.f27891h);
                mo18346d().mo18400b(C10807s.class, b2.f27892i);
                this.f27989p = b2;
            }
        }
    }

    /* renamed from: a */
    public final void mo18663a(Map<String, String> map) {
        this.f27994w = map;
    }

    public final void onEvent(C10276j jVar) {
        C52711k.m112240b(jVar, "event");
        Object b = jVar.mo18286b();
        JSONObject jSONObject = null;
        if (b != null && (b instanceof JSONObject)) {
            jSONObject = (JSONObject) b;
        }
        C10494c cVar = this.f27989p;
        if (cVar != null) {
            cVar.mo18618a(jVar.mo18285a(), jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo18668a(C52671b<? super List<C10575d<SSWebView>>, C52860x> bVar) {
        C52711k.m112240b(bVar, "provider");
        if (((Context) mo18346d().mo18401c(Context.class)) != null) {
            SSWebView sSWebView = this.f27993v;
            if (sSWebView == null) {
                C52711k.m112237a("mWebView");
            }
            bVar.invoke(C52575l.m112092a(new C10575d(sSWebView, null, 2, null)));
        }
    }

    /* renamed from: b */
    public final void mo18364b(Throwable th) {
        super.mo18364b(th);
        C10577d y = mo18755y();
        if (y != null) {
            y.mo18718b(this.f27995x);
        }
        mo18346d().mo18395a(C10757a.class);
        mo18346d().mo18395a(C10807s.class);
        C10494c cVar = this.f27989p;
        if (cVar != null) {
            C10757a aVar = cVar.f27891h;
            if (aVar != null) {
                aVar.mo19452a();
            }
            C10805r rVar = cVar.f27893j;
            if (rVar != null) {
                rVar.mo19580a();
            }
        }
        this.f27989p = null;
    }

    /* renamed from: a */
    public final void mo18359a(Uri uri) {
        Uri uri2;
        C52711k.m112240b(uri, "input");
        if (C52711k.m112239a((Object) (Boolean) m21205w().f28103J.mo18457b(), (Object) Boolean.valueOf(true))) {
            uri2 = uri.buildUpon().appendQueryParameter("container_id", mo18352k_().f27674a).build();
            C52711k.m112236a((Object) uri2, "input.buildUpon().append…, sessionInfo.id).build()");
        } else {
            uri2 = uri;
        }
        for (C10575d dVar : mo18754x()) {
            dVar.mo18756a(uri);
            SSWebView sSWebView = (SSWebView) dVar.f28092b;
            if (m21206z() != null) {
                String valueOf = String.valueOf(uri2);
                Map z = m21206z();
                if (z == null) {
                    C52711k.m112234a();
                }
                sSWebView.loadUrl(valueOf, z);
            } else {
                sSWebView.loadUrl(String.valueOf(uri2));
            }
        }
        this.f27992u = uri2;
    }

    /* renamed from: a */
    public final void mo18666a(C10575d<SSWebView> dVar) {
        C52711k.m112240b(dVar, "viewComponent");
        WebView webView = (SSWebView) dVar.f28092b;
        C10584e eVar = (C10584e) m21205w().f28118w.mo18457b();
        boolean z = false;
        if (eVar != null) {
            webView.setBackgroundColor(eVar.f28126a);
        } else {
            webView.setBackgroundColor(0);
        }
        C10294m l_ = mo18369l_();
        if (!(l_ instanceof C10527j)) {
            l_ = null;
        }
        C10527j jVar = (C10527j) l_;
        if (jVar != null) {
            WebSettings settings = webView.getSettings();
            C52711k.m112236a((Object) settings, "settings");
            jVar.mo18599a(settings, webView);
        }
        for (C10294m mVar : C52575l.m112132c((Iterable) mo18368l())) {
            if (!(mVar instanceof C10527j)) {
                mVar = null;
            }
            C10527j jVar2 = (C10527j) mVar;
            if (jVar2 != null) {
                WebSettings settings2 = webView.getSettings();
                C52711k.m112236a((Object) settings2, "settings");
                jVar2.mo18599a(settings2, webView);
            }
        }
        C10491b bVar = this.f27978e;
        if (bVar != null) {
            C10280b<Boolean> bVar2 = bVar.f27881a;
            if (!bVar2.mo18325a()) {
                bVar2 = null;
            }
            if (bVar2 != null) {
                Boolean bool = (Boolean) bVar2.mo18326b();
                if (bool != null && !bool.booleanValue()) {
                    webView.setLayerType(1, null);
                }
            }
            C10280b<Boolean> bVar3 = bVar.f27882b;
            if (!bVar3.mo18325a()) {
                bVar3 = null;
            }
            if (bVar3 != null) {
                Boolean bool2 = (Boolean) bVar3.mo18326b();
                if (bool2 != null) {
                    webView.setLongClickable(bool2.booleanValue());
                }
            }
        }
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        if (VERSION.SDK_INT >= 17) {
            for (C10514d a : this.f27979f) {
                for (Entry entry : a.mo18655a(this).entrySet()) {
                    webView.addJavascriptInterface(entry.getValue(), (String) entry.getKey());
                }
            }
        }
        this.f27990s = new C10545h(this, webView, dVar);
        webView.setWebViewClient(C13482c.m27232a(this.f27990s));
        this.f27991t = new WebKitContainerApi$setWebChromeClientDelegate$1(this);
        webView.setWebChromeClient(this.f27991t);
        webView.setDownloadListener(new C10541f(this));
        if (this.f27989p == null) {
            C10494c a2 = C10495a.m21106a(webView);
            Boolean bool3 = this.f27986m;
            if (bool3 != null) {
                z = bool3.booleanValue();
            }
            C10494c a3 = a2.mo18621a(z);
            String str = this.f27987n;
            if (str == null) {
                str = "ToutiaoJSBridge";
            }
            C10494c b = a3.mo18624b(str);
            String str2 = this.f27988o;
            if (str2 == null) {
                str2 = "bytedance";
            }
            this.f27989p = b.mo18627c(str2).mo18620a(this.f27985l).mo18625b(this.f27983j).mo18628c(this.f27984k).mo18623b();
        }
        C10494c cVar = this.f27989p;
        if (cVar != null) {
            cVar.f27886c = this.f27991t;
            cVar.f27885b = this.f27990s;
            C10757a aVar = cVar.f27891h;
            if (aVar != null) {
                C10757a b2 = aVar.mo19449a(cVar.f27890g).mo19451a(cVar.f27887d).mo19457b(cVar.f27888e);
                C52711k.m112236a((Object) b2, "iesJsBridge.setBridgeSch…setPublicFunc(publicFunc)");
                b2.mo19460c(cVar.f27889f);
                WebChromeClient webChromeClient = cVar.f27886c;
                if (webChromeClient != null) {
                    aVar.mo19446a(webChromeClient);
                }
                WebViewClient webViewClient = cVar.f27885b;
                if (webViewClient != null) {
                    aVar.mo19447a(webViewClient);
                }
            }
        }
        C10272g n = mo18371n();
        if (n != null) {
            n.mo18300a(new C10542g(this));
        }
    }

    /* renamed from: a */
    public final void mo18667a(C10575d<SSWebView> dVar, Uri uri) {
        C52711k.m112240b(dVar, "viewComponent");
        C52711k.m112240b(uri, "uri");
        mo18362b(uri);
        super.mo18667a(dVar, uri);
    }

    /* renamed from: a */
    public final C10345a mo18358a(Uri uri, Uri uri2) {
        SSWebView sSWebView;
        C52711k.m112240b(uri, "uri");
        C10326b bVar = new C10326b();
        bVar.mo18397a(C10357d.class, mo18373p());
        bVar.mo18397a(C10358e.class, mo18374q());
        bVar.mo18400b(Uri.class, uri2);
        Class<View> cls = View.class;
        C10575d a = mo18753a();
        if (a != null) {
            sSWebView = (SSWebView) a.f28092b;
        } else {
            sSWebView = null;
        }
        bVar.mo18400b(cls, sSWebView);
        String str = (String) m21205w().f28104K.mo18457b();
        if (str == null) {
            str = "";
        }
        String str2 = (String) m21205w().f28105L.mo18457b();
        if (str2 == null) {
            str2 = "";
        }
        return new C10504c(uri, bVar, str, str2);
    }

    /* renamed from: b */
    public final void mo18365b(List<String> list, C10250d dVar) {
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar, "kitPackageRegistryBundle");
        super.mo18365b(list, dVar);
        this.f27980g.clear();
        this.f27981h.clear();
        this.f27979f.clear();
        C52671b jVar = new C10547j(this);
        for (C10286e eVar : mo18370m()) {
            if (!(eVar instanceof C10525h)) {
                eVar = null;
            }
            C10525h hVar = (C10525h) eVar;
            if (hVar != null) {
                jVar.invoke(hVar);
            }
        }
        C10286e k = mo18367k();
        if (!(k instanceof C10525h)) {
            k = null;
        }
        C10525h hVar2 = (C10525h) k;
        if (hVar2 != null) {
            jVar.invoke(hVar2);
        }
        C10272g n = mo18371n();
        if (n != null) {
            n.mo18300a(new C10546i(this));
        }
    }

    /* renamed from: b */
    public final void mo18363b(Uri uri, C52671b<? super Uri, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2) {
        C52711k.m112240b(uri, "input");
        C52711k.m112240b(bVar, "resolve");
        C52711k.m112240b(bVar2, "reject");
        bVar.invoke(uri);
    }

    public C10531n(WebKitApi webKitApi, C10277aa aaVar, List<String> list, C10250d dVar, C10326b bVar) {
        C52711k.m112240b(webKitApi, "kitApi");
        C52711k.m112240b(aaVar, "sessionInfo");
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar, "kitPackageRegistryBundle");
        C52711k.m112240b(bVar, "providerFactory");
        super(webKitApi, aaVar, list, dVar, bVar);
    }
}
