package com.p683ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.http.SslError;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26324a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2 */
public final class EasterEggActivityV2 extends AmeSSActivity implements OnClickListener {

    /* renamed from: d */
    public static final C25577a f67684d = new C25577a(null);

    /* renamed from: a */
    public long f67685a;

    /* renamed from: b */
    public boolean f67686b;

    /* renamed from: c */
    public boolean f67687c;

    /* renamed from: e */
    private FrameLayout f67688e;

    /* renamed from: f */
    private CrossPlatformWebView f67689f;

    /* renamed from: g */
    private AnimatedImageView f67690g;

    /* renamed from: h */
    private ImageView f67691h;

    /* renamed from: i */
    private C25930g f67692i;

    /* renamed from: j */
    private C27235d f67693j;

    /* renamed from: k */
    private C26324a f67694k;

    /* renamed from: l */
    private final Runnable f67695l = new C25578b(this);

    /* renamed from: m */
    private final Runnable f67696m = new C25581e(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$a */
    public static final class C25577a {
        private C25577a() {
        }

        public /* synthetic */ C25577a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m62104a(Context context, C25930g gVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(gVar, "pageParams");
            Intent intent = new Intent(context, EasterEggActivityV2.class);
            intent.putExtra("pageParams", gVar);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m62103a(Activity activity, C25930g gVar, int i) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(gVar, "pageParams");
            Intent intent = new Intent(activity, EasterEggActivityV2.class);
            intent.putExtra("pageParams", gVar);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$b */
    static final class C25578b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f67697a;

        C25578b(EasterEggActivityV2 easterEggActivityV2) {
            this.f67697a = easterEggActivityV2;
        }

        public final void run() {
            if (!this.f67697a.isFinishing()) {
                Map c = this.f67697a.mo52674c();
                c.put("disappear_method", "auto_disappear");
                c.put("duration", String.valueOf(System.currentTimeMillis() - this.f67697a.f67685a));
                C26890h.m65011a("egg_ad_disappear", c);
                this.f67697a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$c */
    public static final class C25579c implements C27235d {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f67698a;

        /* renamed from: a */
        public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: a */
        public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        }

        /* renamed from: b */
        public final boolean mo52683b(WebView webView, String str) {
            return false;
        }

        C25579c(EasterEggActivityV2 easterEggActivityV2) {
            this.f67698a = easterEggActivityV2;
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            if (!this.f67698a.f67686b && !this.f67698a.f67687c) {
                this.f67698a.f67686b = true;
                this.f67698a.mo52671a();
            }
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f67698a.mo52673b();
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            this.f67698a.mo52673b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$d */
    public static final class C25580d extends C26324a {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f67699a;

        public final void onFailure(String str, Throwable th) {
            C52711k.m112240b(str, "id");
            C52711k.m112240b(th, "throwable");
            super.onFailure(str, th);
            this.f67699a.mo52673b();
        }

        C25580d(EasterEggActivityV2 easterEggActivityV2, boolean z, RemoteImageView remoteImageView) {
            this.f67699a = easterEggActivityV2;
            super(true, remoteImageView);
        }

        /* renamed from: a */
        public final void onFinalImageSet(String str, C14045f fVar, Animatable animatable) {
            C52711k.m112240b(str, "id");
            super.onFinalImageSet(str, fVar, animatable);
            if (!this.f67699a.f67686b && !this.f67699a.f67687c) {
                this.f67699a.f67686b = true;
                this.f67699a.mo52671a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$e */
    static final class C25581e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f67700a;

        C25581e(EasterEggActivityV2 easterEggActivityV2) {
            this.f67700a = easterEggActivityV2;
        }

        public final void run() {
            if (!this.f67700a.isFinishing() && !this.f67700a.f67686b) {
                this.f67700a.mo52672a("overtime");
                this.f67700a.finish();
            }
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo52673b() {
        mo52672a("load_fail");
        finish();
    }

    public final void finish() {
        setResult(BaseNotice.CHECK_PROFILE);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FrameLayout frameLayout = this.f67688e;
        if (frameLayout == null) {
            C52711k.m112237a("mRootView");
        }
        frameLayout.removeCallbacks(this.f67695l);
        FrameLayout frameLayout2 = this.f67688e;
        if (frameLayout2 == null) {
            C52711k.m112237a("mRootView");
        }
        frameLayout2.removeCallbacks(this.f67696m);
    }

    /* renamed from: a */
    public final void mo52671a() {
        C26890h.m65011a("show_egg_ad", (Map<String, String>) mo52674c());
        FrameLayout frameLayout = this.f67688e;
        if (frameLayout == null) {
            C52711k.m112237a("mRootView");
        }
        frameLayout.postDelayed(this.f67695l, 7000);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
        C26890h.onEvent(MobClick.obtain().setEventName("result_ad").setLabelName("close").setJsonObject(C23088c.m56631a().mo47824a("refer", "egg").mo47825b()));
    }

    /* renamed from: c */
    public final HashMap<String, String> mo52674c() {
        HashMap<String, String> hashMap = new HashMap<>();
        Map map = hashMap;
        String str = "enter_from";
        C25930g gVar = this.f67692i;
        if (gVar == null) {
            C52711k.m112237a("pageParams");
        }
        map.put(str, gVar.getEnterFrom());
        String str2 = "search_keyword";
        C25930g gVar2 = this.f67692i;
        if (gVar2 == null) {
            C52711k.m112237a("pageParams");
        }
        map.put(str2, gVar2.getKeyWords());
        String str3 = "egg_ad_id";
        C25930g gVar3 = this.f67692i;
        if (gVar3 == null) {
            C52711k.m112237a("pageParams");
        }
        map.put(str3, C26512f.m64143c(gVar3.getEasterEggInfo()));
        return hashMap;
    }

    /* renamed from: a */
    private static SingleWebView m62098a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((C27309j) crossPlatformWebView.mo55670a(C27309j.class)).mo55729a();
        C52711k.m112236a((Object) a, "getViewWrap(WebViewWrap::class.java).webView");
        return a;
    }

    /* renamed from: a */
    public final void mo52672a(String str) {
        if (!this.f67687c && !this.f67686b) {
            this.f67687c = true;
            Map c = mo52674c();
            c.put("fail_type", str);
            C26890h.m65011a("show_egg_ad_fail", c);
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ue) {
            Map c = mo52674c();
            c.put("disappear_method", "click_close_button");
            c.put("duration", String.valueOf(System.currentTimeMillis() - this.f67685a));
            C26890h.m65011a("egg_ad_disappear", c);
            finish();
            return;
        }
        C25930g gVar = this.f67692i;
        if (gVar == null) {
            C52711k.m112237a("pageParams");
        }
        C26136q easterEggInfo = gVar.getEasterEggInfo();
        C26540w.m64207a((Context) this, C26512f.m64148g(easterEggInfo), C26512f.m64146e(easterEggInfo), C26512f.m64149h(easterEggInfo));
        Map c2 = mo52674c();
        c2.put("duration", String.valueOf(System.currentTimeMillis() - this.f67685a));
        c2.put("enter_method", "click_carton");
        C26890h.m65011a("click_egg_ad", c2);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0189, code lost:
        if (r0.equals("webp") == false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b3, code lost:
        if (r0 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f3, code lost:
        if (r0.equals("gif") != false) goto L_0x01f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r10)
            r10 = 0
            r9.overridePendingTransition(r10, r10)
            r0 = 2132213884(0x7f17007c, float:2.0071594E38)
            r9.setContentView(r0)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "pageParams"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            if (r0 == 0) goto L_0x028b
            com.ss.android.ugc.aweme.commercialize.g r0 = (com.p683ss.android.ugc.aweme.commercialize.C25930g) r0
            com.ss.android.ugc.aweme.commercialize.model.q r1 = r0.getEasterEggInfo()
            if (r1 == 0) goto L_0x0059
            r9.f67692i = r0
            com.ss.android.ugc.aweme.commercialize.model.q r1 = r0.getEasterEggInfo()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64128a(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "web"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.commercialize.model.q r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64145d(r0)
            java.lang.String r1 = "AdDataUtils.getSearchEas…pageParams.easterEggInfo)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = ""
        L_0x004f:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r3 = "url"
            r1.putExtra(r3, r0)
            goto L_0x005c
        L_0x0059:
            r9.finish()
        L_0x005c:
            r0 = 2132022405(0x7f141485, float:1.9683229E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.root_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.f67688e = r0
            android.widget.FrameLayout r0 = r9.f67688e
            if (r0 != 0) goto L_0x0075
            java.lang.String r1 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0075:
            r1 = r9
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 2132024711(0x7f141d87, float:1.9687906E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r3 = "findViewById(R.id.webview)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r0
            r9.f67689f = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r0 < r3) goto L_0x00ba
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.f67689f
            if (r0 != 0) goto L_0x009a
            java.lang.String r3 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x009a:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = m62098a(r0)
            android.webkit.WebSettings r0 = r0.getSettings()
            java.lang.String r3 = "mWebView.getRawWebView().settings"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r0.setMediaPlaybackRequiresUserGesture(r10)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.f67689f
            if (r0 != 0) goto L_0x00b3
            java.lang.String r3 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00b3:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = m62098a(r0)
            r0.setCanTouch(r10)
        L_0x00ba:
            r0 = 2132019292(0x7f14085c, float:1.9676915E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r3 = "findViewById(R.id.gif_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView) r0
            r9.f67690g = r0
            r0 = 2132018095(0x7f1403af, float:1.9674487E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r3 = "findViewById(R.id.close)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.f67691h = r0
            android.widget.ImageView r0 = r9.f67691h
            if (r0 != 0) goto L_0x00e3
            java.lang.String r3 = "mCloseBtn"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00e3:
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r9.f67691h
            if (r0 != 0) goto L_0x00ef
            java.lang.String r1 = "mCloseBtn"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00ef:
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.utils.C47795d.m103429a(r0)
            com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$c r0 = new com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$c
            r0.<init>(r9)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d) r0
            r9.f67693j = r0
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.f67689f
            if (r0 != 0) goto L_0x0106
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0106:
            com.ss.android.ugc.aweme.crossplatform.view.a r0 = (com.p683ss.android.ugc.aweme.crossplatform.view.C27298a) r0
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r1 = r9.f67693j
            if (r1 != 0) goto L_0x0111
            java.lang.String r3 = "webViewLoadListener"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0111:
            r3 = r9
            android.arch.lifecycle.k r3 = (android.arch.lifecycle.C0184k) r3
            r4 = r9
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r5 = r9.getIntent()
            java.lang.String r6 = "intent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.os.Bundle r5 = r5.getExtras()
            com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper.m63705a(r0, r1, r3, r4, r5)
            com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$d r0 = new com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$d
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r9.f67690g
            if (r1 != 0) goto L_0x0132
            java.lang.String r3 = "mGifView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0132:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r1
            r0.<init>(r9, r2, r1)
            com.ss.android.ugc.aweme.commercialize.utils.a r0 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26324a) r0
            r9.f67694k = r0
            com.ss.android.ugc.aweme.commercialize.g r0 = r9.f67692i
            if (r0 != 0) goto L_0x0144
            java.lang.String r1 = "pageParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0144:
            com.ss.android.ugc.aweme.commercialize.model.q r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64128a(r0)
            com.ss.android.ugc.aweme.commercialize.g r1 = r9.f67692i
            if (r1 != 0) goto L_0x0155
            java.lang.String r3 = "pageParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0155:
            com.ss.android.ugc.aweme.commercialize.model.q r1 = r1.getEasterEggInfo()
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64140b(r1)
            if (r1 != 0) goto L_0x0164
            r9.mo52673b()
            goto L_0x0283
        L_0x0164:
            long r3 = java.lang.System.currentTimeMillis()
            r9.f67685a = r3
            if (r0 != 0) goto L_0x016e
            goto L_0x025e
        L_0x016e:
            int r1 = r0.hashCode()
            r3 = 102340(0x18fc4, float:1.43409E-40)
            if (r1 == r3) goto L_0x01ed
            r3 = 117588(0x1cb54, float:1.64776E-40)
            if (r1 == r3) goto L_0x018c
            r3 = 3645340(0x379f9c, float:5.10821E-39)
            if (r1 == r3) goto L_0x0183
            goto L_0x025e
        L_0x0183:
            java.lang.String r1 = "webp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x025e
            goto L_0x01f5
        L_0x018c:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x025e
            com.ss.android.ugc.aweme.commercialize.g r0 = r9.f67692i
            if (r0 != 0) goto L_0x019d
            java.lang.String r1 = "pageParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x019d:
            com.ss.android.ugc.aweme.commercialize.model.q r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64145d(r0)
            if (r0 == 0) goto L_0x01be
            if (r0 == 0) goto L_0x01b6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = p2628d.p2650m.C52830p.m112447b(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x01c0
            goto L_0x01be
        L_0x01b6:
            d.u r10 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r10.<init>(r0)
            throw r10
        L_0x01be:
            java.lang.String r0 = ""
        L_0x01c0:
            r2 = r0
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01cf
            r9.mo52673b()
            goto L_0x025e
        L_0x01cf:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.f67689f
            if (r0 != 0) goto L_0x01d8
            java.lang.String r1 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01d8:
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r9.f67689f
            if (r1 != 0) goto L_0x01e4
            java.lang.String r0 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x01e4:
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m65745a(r1, r2, r3, r4, r5, r6)
            goto L_0x025e
        L_0x01ed:
            java.lang.String r1 = "gif"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x025e
        L_0x01f5:
            com.ss.android.ugc.aweme.commercialize.g r0 = r9.f67692i
            if (r0 != 0) goto L_0x01fe
            java.lang.String r1 = "pageParams"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01fe:
            com.ss.android.ugc.aweme.commercialize.model.q r0 = r0.getEasterEggInfo()
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64147f(r0)
            if (r1 == 0) goto L_0x020e
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r0.<init>()
            goto L_0x0212
        L_0x020e:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getSourceUrl()
        L_0x0212:
            if (r0 != 0) goto L_0x0216
        L_0x0214:
            r1 = 0
            goto L_0x0233
        L_0x0216:
            java.util.List r1 = r0.getUrlList()
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 == 0) goto L_0x0221
            goto L_0x0214
        L_0x0221:
            java.util.List r1 = r0.getUrlList()
            java.lang.Object r1 = r1.get(r10)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0232
            goto L_0x0214
        L_0x0232:
            r1 = 1
        L_0x0233:
            if (r1 != 0) goto L_0x0239
            r9.mo52673b()
            goto L_0x025e
        L_0x0239:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r9.f67690g
            if (r1 != 0) goto L_0x0242
            java.lang.String r3 = "mGifView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0242:
            r1.setVisibility(r10)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r9.f67690g
            if (r1 != 0) goto L_0x024e
            java.lang.String r3 = "mGifView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x024e:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r1
            com.ss.android.ugc.aweme.commercialize.utils.a r3 = r9.f67694k
            if (r3 != 0) goto L_0x0259
            java.lang.String r4 = "gifViewLoadListener"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0259:
            com.facebook.drawee.c.d r3 = (com.facebook.drawee.p936c.C13791d) r3
            com.p683ss.android.ugc.aweme.commercialize.utils.C26515i.m64156a(r1, r0, r2, r3)
        L_0x025e:
            android.widget.FrameLayout r0 = r9.f67688e
            if (r0 != 0) goto L_0x0267
            java.lang.String r1 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0267:
            java.lang.Runnable r1 = r9.f67696m
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.abtest.SearchEggMaxWaitTimeExperiment> r4 = com.p683ss.android.ugc.aweme.commercialize.abtest.SearchEggMaxWaitTimeExperiment.class
            r5 = 1
            java.lang.String r6 = "search_egg_max_wait_to_show_time"
            r7 = 31744(0x7c00, float:4.4483E-41)
            r8 = 4
            int r3 = r3.mo18168a(r4, r5, r6, r7, r8)
            long r3 = (long) r3
            long r2 = r2.toMillis(r3)
            r0.postDelayed(r1, r2)
        L_0x0283:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        L_0x028b:
            d.u r10 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.EasterEggPageParams"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.EasterEggActivityV2.onCreate(android.os.Bundle):void");
    }
}
