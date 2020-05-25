package com.p683ss.android.ugc.aweme.bullet.module.p1476a;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.p648a.C10485b;
import com.bytedance.ies.bullet.kit.web.p648a.C10487d;
import com.bytedance.ies.bullet.kit.web.p649b.C10493b;
import com.bytedance.ies.bullet.kit.web.p651d.C10515a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.geckoclient.C10885e;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.newmedia.p1202ui.webview.C19615a;
import com.p683ss.android.sdk.webview.C19763j;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24336d;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.web.C48372k;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.a.e */
public final class C24290e extends C10487d {

    /* renamed from: a */
    public final C10326b f64424a;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.e$a */
    public static final class C24291a implements C10515a {

        /* renamed from: a */
        final /* synthetic */ C19767n f64425a;

        /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.e$a$a */
        static final class C24292a extends C52712l implements C52671b<String, Boolean> {

            /* renamed from: a */
            public static final C24292a f64426a = new C24292a();

            C24292a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                String str = (String) obj;
                C52711k.m112240b(str, "it");
                return Boolean.valueOf(C10885e.m22080c(str));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.e$a$b */
        static final class C24293b extends C52712l implements C52671b<String, WebResourceResponse> {

            /* renamed from: a */
            public static final C24293b f64427a = new C24293b();

            C24293b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                String str = (String) obj;
                C52711k.m112240b(str, "it");
                return C19763j.m48282a().mo41194a(str);
            }
        }

        /* renamed from: b */
        public final boolean mo18657b() {
            return C48380q.m104673f();
        }

        /* renamed from: c */
        public final C52671b<String, Boolean> mo18658c() {
            return C24292a.f64426a;
        }

        /* renamed from: d */
        public final C52671b<String, WebResourceResponse> mo18659d() {
            return C24293b.f64427a;
        }

        /* renamed from: a */
        public final String mo18656a() {
            String b = this.f64425a.mo41208b();
            C52711k.m112236a((Object) b, "offlineBundleConfig.offlineRootDir()");
            return b;
        }

        /* renamed from: e */
        public final List<Pattern> mo18660e() {
            List<Pattern> c = this.f64425a.mo41209c();
            C52711k.m112236a((Object) c, "offlineBundleConfig.offlineHostPrefix()");
            return c;
        }

        C24291a(C19767n nVar) {
            this.f64425a = nVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.e$b */
    public static final class C24294b extends C10485b {
        C24294b() {
        }

        /* renamed from: b */
        public final String mo18591b() {
            return "ToutiaoJSBridge";
        }

        /* renamed from: c */
        public final List<String> mo18592c() {
            return C48372k.f121668a;
        }

        /* renamed from: a */
        public final Boolean mo18590a() {
            return Boolean.valueOf(false);
        }

        /* renamed from: d */
        public final List<String> mo18593d() {
            List<String> arrayList = new ArrayList<>();
            arrayList.add("config");
            arrayList.add("appInfo");
            arrayList.add("login");
            arrayList.add("close");
            arrayList.add("gallery");
            arrayList.add("toggleGalleryBars");
            arrayList.add("slideShow");
            arrayList.add("relatedShow");
            arrayList.add("toast");
            arrayList.add("slideDownload");
            arrayList.add("requestChangeOrientation");
            arrayList.add("adInfo");
            C52711k.m112240b(arrayList, "mPublicFunc");
            arrayList.add("sendLog");
            arrayList.add("openSchoolEdit");
            arrayList.add("formDialogClose");
            arrayList.add("openSchoolEdit");
            arrayList.add("orderResult");
            return arrayList;
        }

        /* renamed from: e */
        public final List<String> mo18594e() {
            List<String> arrayList = new ArrayList<>();
            arrayList.add("isAppInstalled");
            arrayList.add("share");
            arrayList.add("open");
            arrayList.add("openThirdApp");
            arrayList.add("copyToClipboard");
            arrayList.add("userInfo");
            arrayList.add("apiParam");
            arrayList.add("openAweme");
            arrayList.add("openSchema");
            arrayList.add("openRecord");
            arrayList.add("publishVideo");
            arrayList.add("openBrowser");
            arrayList.add("bindPhone");
            arrayList.add("fetch");
            arrayList.add("nativeStorage");
            arrayList.add("fetchTaoCommand");
            C52711k.m112240b(arrayList, "mSupportProtectedFunc");
            return arrayList;
        }
    }

    /* renamed from: c */
    public final C10493b mo18601c() {
        return new C24294b();
    }

    /* renamed from: b */
    public final C10515a mo18600b() {
        AwemeAppData a = C19555f.m47851a();
        C52711k.m112236a((Object) a, "BaseAppData.inst()");
        C19767n f = a.mo40808f();
        if (f == null || !f.mo41207a()) {
            return null;
        }
        return new C24291a(f);
    }

    /* renamed from: d */
    private final int m59491d() {
        String str;
        List<String> list;
        Uri uri = (Uri) this.f64424a.mo18401c(Uri.class);
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        String decode = Uri.decode(str);
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            list = b.getWebviewCacheUrls();
        } catch (Throwable unused) {
            list = null;
        }
        if (!(list == null || decode == null)) {
            for (String b2 : list) {
                if (C52830p.m112456b((CharSequence) decode, (CharSequence) b2, false, 2, (Object) null)) {
                    return 2;
                }
            }
        }
        return -1;
    }

    public C24290e(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        this.f64424a = bVar;
    }

    /* renamed from: a */
    public final C10423r mo18356a(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24336d();
    }

    /* renamed from: a */
    public final void mo18599a(WebSettings webSettings, WebView webView) {
        C52711k.m112240b(webSettings, "settings");
        C52711k.m112240b(webView, "webView");
        super.mo18599a(webSettings, webView);
        Context context = (Context) this.f64424a.mo18401c(Context.class);
        if (context != null) {
            C19615a.m47963a(context).mo40901a(true).mo40902a(webView);
        }
        webSettings.setCacheMode(m59491d());
        webView.setFocusableInTouchMode(true);
        webView.setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}
