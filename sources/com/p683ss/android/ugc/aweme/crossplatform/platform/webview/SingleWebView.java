package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.app.Activity;
import android.arch.lifecycle.C0183j;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.example.p906a.C13482c;
import com.google.gson.C17971f;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.google.gson.C18091u;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.newmedia.p1195a.C19541d;
import com.p683ss.android.newmedia.p1202ui.webview.C19615a;
import com.p683ss.android.sdk.activity.p1208a.C19723a;
import com.p683ss.android.sdk.webview.C19734a;
import com.p683ss.android.sdk.webview.C19749d;
import com.p683ss.android.sdk.webview.C19750e;
import com.p683ss.android.sdk.webview.C19750e.C19751a;
import com.p683ss.android.sdk.webview.C19750e.C19752b;
import com.p683ss.android.sdk.webview.C19760h;
import com.p683ss.android.sdk.webview.C19766m;
import com.p683ss.android.sdk.webview.p1209a.C19737b;
import com.p683ss.android.sdk.webview.p1210b.C19743d;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26529n;
import com.p683ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27192b;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27256n.C27257a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27299b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28695c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.p1330a.C22477a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.web.C48373l;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48361s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52708h;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;
import p2628d.p2650m.C52815j;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView */
public final class SingleWebView extends TryCatchWebView implements C0183j {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SingleWebView.class), "gson", "getGson()Lcom/google/gson/Gson;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SingleWebView.class), "chromeVersion", "getChromeVersion()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SingleWebView.class), "lastClickDetector", "getLastClickDetector()Landroid/view/GestureDetector;"))};
    private HashMap _$_findViewCache;
    private Map<String, String> additionReportParams;
    private C48373l baseJsMessageHandler;
    private boolean canScrollVertically;
    private final C52668f chromeVersion$delegate;
    private C19749d contextProviderFactory;
    private String curUrl;
    private boolean disableIntercept;
    private C27217c[] disableInterceptRegionList;
    private boolean enableScrollControl;
    private final C52668f gson$delegate;
    public C27114h iCrossPlatformActivityContainer;
    private C19750e iesJsBridge;
    private boolean isVastAd;
    private final C52668f lastClickDetector$delegate;
    public long lastClickTime;
    private C27251l mTTNetInterceptorWrapper;
    private C22521l monitorSession;
    private boolean monitorSessionCreatedBySelf;
    private List<String> pauseList;
    private C27299b scrollListener;
    private SingleWebChromeClient singleWebChromeClient;
    private C27241h singleWebViewClient;
    private Set<String> visitedUrls;
    private OnTouchListener webviewTouchListener;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$a */
    public static final class C27215a implements C19760h<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71854a;

        public final void release() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo41189a() {
            C27114h hVar = this.f71854a.iCrossPlatformActivityContainer;
            if (hVar != null) {
                if (!(hVar instanceof AbsActivityContainer)) {
                    hVar = null;
                }
                if (hVar != null) {
                    if (hVar != null) {
                        return (AbsActivityContainer) hVar;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer");
                }
            }
            return null;
        }

        C27215a(SingleWebView singleWebView) {
            this.f71854a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$b */
    public static final class C27216b implements C19760h<C22521l> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71855a;

        public final void release() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo41189a() {
            return this.f71855a.getMonitorSession();
        }

        C27216b(SingleWebView singleWebView) {
            this.f71855a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$c */
    public static final class C27217c {
        @C17952c(mo34828a = "x")

        /* renamed from: a */
        public final double f71856a;
        @C17952c(mo34828a = "y")

        /* renamed from: b */
        public final double f71857b;
        @C17952c(mo34828a = "width")

        /* renamed from: c */
        public final double f71858c;
        @C17952c(mo34828a = "height")

        /* renamed from: d */
        public final double f71859d;

        public C27217c() {
            this(ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, 15, null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (java.lang.Double.compare(r4.f71859d, r5.f71859d) == 0) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                if (r4 == r5) goto L_0x0033
                boolean r0 = r5 instanceof com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C27217c
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$c r5 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C27217c) r5
                double r0 = r4.f71856a
                double r2 = r5.f71856a
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f71857b
                double r2 = r5.f71857b
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f71858c
                double r2 = r5.f71858c
                int r0 = java.lang.Double.compare(r0, r2)
                if (r0 != 0) goto L_0x0031
                double r0 = r4.f71859d
                double r2 = r5.f71859d
                int r5 = java.lang.Double.compare(r0, r2)
                if (r5 != 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r5 = 0
                return r5
            L_0x0033:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.C27217c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (((((Double.hashCode(this.f71856a) * 31) + Double.hashCode(this.f71857b)) * 31) + Double.hashCode(this.f71858c)) * 31) + Double.hashCode(this.f71859d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisableInterceptRegion(x=");
            sb.append(this.f71856a);
            sb.append(", y=");
            sb.append(this.f71857b);
            sb.append(", width=");
            sb.append(this.f71858c);
            sb.append(", height=");
            sb.append(this.f71859d);
            sb.append(")");
            return sb.toString();
        }

        private C27217c(double d, double d2, double d3, double d4) {
            this.f71856a = d;
            this.f71857b = d2;
            this.f71858c = d3;
            this.f71859d = d4;
        }

        private /* synthetic */ C27217c(double d, double d2, double d3, double d4, int i, C52707g gVar) {
            this(C52708h.m112228a(), C52708h.m112228a(), C52708h.m112229b(), C52708h.m112229b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$d */
    static final class C27218d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71860a;

        C27218d(SingleWebView singleWebView) {
            this.f71860a = singleWebView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C27131c a = C27132a.m65458a();
            WebView webView = this.f71860a;
            C52711k.m112240b(webView, C23060d.f61427a);
            WebSettings settings = webView.getSettings();
            C52711k.m112236a((Object) settings, "webview.settings");
            String userAgentString = settings.getUserAgentString();
            C52820l lVar = a.f71581e;
            C52711k.m112236a((Object) userAgentString, "userAgent");
            boolean z = false;
            String str = null;
            C52815j find$default = C52820l.find$default(lVar, userAgentString, 0, 2, null);
            if (find$default != null) {
                if (find$default.mo110379d().size() >= 2) {
                    z = true;
                }
                if (!z) {
                    find$default = null;
                }
                if (find$default != null) {
                    str = (String) find$default.mo110379d().get(1);
                }
            }
            if (str == null) {
                return "not_found";
            }
            return str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$e */
    static final class C27219e extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C27219e f71861a = new C27219e();

        C27219e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C17971f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$f */
    public static final class C27220f implements C19760h<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71862a;

        public final void release() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo41189a() {
            C27114h hVar = this.f71862a.iCrossPlatformActivityContainer;
            if (hVar != null) {
                if (!(hVar instanceof AbsActivityContainer)) {
                    hVar = null;
                }
                if (hVar != null) {
                    if (hVar != null) {
                        return (AbsActivityContainer) hVar;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer");
                }
            }
            return null;
        }

        C27220f(SingleWebView singleWebView) {
            this.f71862a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$g */
    public static final class C27221g implements C19760h<C22521l> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71863a;

        public final void release() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo41189a() {
            return this.f71863a.getMonitorSession();
        }

        C27221g(SingleWebView singleWebView) {
            this.f71863a = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$h */
    static final class C27222h extends C52712l implements C52682m<String, C19751a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71864a;

        C27222h(SingleWebView singleWebView) {
            this.f71864a = singleWebView;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C19751a aVar = (C19751a) obj2;
            C52711k.m112240b(str, "methodName");
            C52711k.m112240b(aVar, "bridgeAccess");
            this.f71864a.reportOnJsbInvoke(str, aVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$i */
    static final class C27223i extends C52712l implements C52686q<String, C19751a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71865a;

        C27223i(SingleWebView singleWebView) {
            this.f71865a = singleWebView;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C19751a aVar = (C19751a) obj2;
            int intValue = ((Number) obj3).intValue();
            C52711k.m112240b(str, "methodName");
            C52711k.m112240b(aVar, "bridgeAccess");
            this.f71865a.reportOnJsbReject(str, aVar, intValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$j */
    public static final class C27224j implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71866a;

        C27224j(SingleWebView singleWebView) {
            this.f71866a = singleWebView;
        }

        public final void onViewAttachedToWindow(View view) {
            C52711k.m112240b(view, "v");
            C22521l monitorSession = this.f71866a.getMonitorSession();
            if (monitorSession != null) {
                C22524n nVar = (C22524n) monitorSession.mo46870a(C22524n.class);
                if (nVar != null) {
                    nVar.mo46851a(null);
                }
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            C52711k.m112240b(view, "v");
            C22521l monitorSession = this.f71866a.getMonitorSession();
            if (monitorSession != null) {
                C22524n nVar = (C22524n) monitorSession.mo46870a(C22524n.class);
                if (nVar != null) {
                    nVar.mo46862b(null);
                }
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$k */
    static final class C27225k extends C52712l implements C52670a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71867a;

        /* renamed from: b */
        final /* synthetic */ Context f71868b;

        C27225k(SingleWebView singleWebView, Context context) {
            this.f71867a = singleWebView;
            this.f71868b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            GestureDetector gestureDetector = new GestureDetector(this.f71868b, new SimpleOnGestureListener(this) {

                /* renamed from: a */
                final /* synthetic */ C27225k f71869a;

                {
                    this.f71869a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    this.f71869a.f71867a.lastClickTime = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$l */
    static final class C27227l extends C52712l implements C52682m<String, Map<String, String>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71870a;

        /* renamed from: b */
        final /* synthetic */ C52727e f71871b;

        C27227l(SingleWebView singleWebView, C52727e eVar) {
            this.f71870a = singleWebView;
            this.f71871b = eVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            SingleWebView.super.loadUrl((String) obj, (Map) obj2);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$m */
    static final class C27228m extends C52712l implements C52682m<String, Map<String, String>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SingleWebView f71872a;

        /* renamed from: b */
        final /* synthetic */ C52727e f71873b;

        /* renamed from: c */
        final /* synthetic */ Map f71874c;

        C27228m(SingleWebView singleWebView, C52727e eVar, Map map) {
            this.f71872a = singleWebView;
            this.f71873b = eVar;
            this.f71874c = map;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            SingleWebView.super.loadUrl((String) obj, (Map) obj2);
            return C52860x.f131107a;
        }
    }

    public SingleWebView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SingleWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C17971f getGson() {
        return (C17971f) this.gson$delegate.getValue();
    }

    private final GestureDetector getLastClickDetector() {
        return (GestureDetector) this.lastClickDetector$delegate.getValue();
    }

    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Map<String, String> getAdditionReportParams() {
        return this.additionReportParams;
    }

    public final C48373l getBaseJsMessageHandler() {
        return this.baseJsMessageHandler;
    }

    public final boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    public final String getChromeVersion() {
        return (String) this.chromeVersion$delegate.getValue();
    }

    public final boolean getEnableScrollControl() {
        return this.enableScrollControl;
    }

    public final long getLastClickTime() {
        return this.lastClickTime;
    }

    public final C22521l getMonitorSession() {
        return this.monitorSession;
    }

    public final boolean getMonitorSessionCreatedBySelf() {
        return this.monitorSessionCreatedBySelf;
    }

    public final SingleWebChromeClient getSingleWebChromeClient() {
        return this.singleWebChromeClient;
    }

    public final OnTouchListener getWebviewTouchListener() {
        return this.webviewTouchListener;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47718bf.m103290c(this);
    }

    public final void transparentBackground() {
        setBackgroundColor(0);
    }

    public final void contextDestroy() {
        this.baseJsMessageHandler.mo41163f();
        C19541d.m47826a(this);
    }

    public final C10805r getJsBridge2() {
        C19750e eVar = this.iesJsBridge;
        if (eVar != null) {
            return eVar.f54417c;
        }
        return null;
    }

    public final void setLoadNoCache() {
        WebSettings settings = getSettings();
        C52711k.m112236a((Object) settings, "settings");
        settings.setCacheMode(2);
    }

    private final void enableTTWebViewFullProcessLog() {
        C27114h hVar = this.iCrossPlatformActivityContainer;
        if (hVar != null) {
            C27182a crossPlatformParams = hVar.getCrossPlatformParams();
            if (crossPlatformParams != null) {
                C27192b bVar = crossPlatformParams.f71719b;
                if (bVar != null && bVar.f71764s && VERSION.SDK_INT >= 19) {
                    evaluateJavascript("ttwebview:/*enableTTLogEvent*/;", null);
                }
            }
        }
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final void contextPause() {
        onPause();
        C19541d.m47825a(getContext(), this);
        if (getInPauseList() || this.isVastAd) {
            pauseTimers();
        }
    }

    public final boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.lastClickTime < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    private final boolean getInPauseList() {
        boolean z;
        List<String> list = this.pauseList;
        if (list != null) {
            C52785g e = C52786h.m112350e(C52575l.m112148k(list));
            if (e != null) {
                Iterator a = e.mo110157a();
                while (a.hasNext()) {
                    String str = (String) a.next();
                    String url = getUrl();
                    if (url == null || !C52830p.m112411b(url, str, false, 2, null)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this);
        if (this.monitorSessionCreatedBySelf) {
            C22521l lVar = this.monitorSession;
            if (lVar != null) {
                if (!lVar.f60539c) {
                    lVar = null;
                }
                if (lVar != null) {
                    C27132a.m65458a().mo55452b(lVar.mo46782a());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getCacheMode() {
        /*
            r7 = this;
            android.app.Activity r0 = r7.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0012
            android.net.Uri r0 = r0.getData()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = android.net.Uri.decode(r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Throwable -> 0x0029 }
            java.lang.String r3 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Throwable -> 0x0029 }
            java.util.List r2 = r2.getWebviewCacheUrls()     // Catch:{ Throwable -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r2 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x004c
            java.util.Iterator r2 = r2.iterator()
        L_0x0032:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = 0
            r6 = 2
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r4, r3, r5, r6, r1)
            if (r3 == 0) goto L_0x0032
            return r6
        L_0x004c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.getCacheMode():int");
    }

    private final void initConfig() {
        C19615a.m47963a(getContext()).mo40901a(true).mo40902a((WebView) this);
        setFocusableInTouchMode(true);
        setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
        WebSettings settings = getSettings();
        C52711k.m112236a((Object) settings, "settings");
        settings.setCacheMode(getCacheMode());
        C19723a a = C26529n.m64186a();
        if (a != null) {
            setTimeInterval(a.getAutoJumpInterval());
            this.pauseList = a.getPauseList();
        }
    }

    private final boolean isAllowJsbMonitor() {
        try {
            String str = this.curUrl;
            if (str != null) {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    String host = parse.getHost();
                    if (host != null) {
                        C27132a.m65458a();
                        HybridMonitorConfig b = C27131c.m65452b();
                        if (b != null) {
                            if (b.getJsbHostWhitelist().isEmpty()) {
                                return true;
                            }
                            for (String str2 : b.getJsbHostWhitelist()) {
                                CharSequence charSequence = host;
                                C52711k.m112236a((Object) str2, "hostInList");
                                if (C52830p.m112456b(charSequence, (CharSequence) str2, false, 2, (Object) null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void contextResume() {
        C19743d dVar = this.baseJsMessageHandler.f54391r;
        if (!TextUtils.isEmpty(dVar.f54406b)) {
            int i = 1;
            if (!TextUtils.isEmpty(dVar.f54405a) ? !C19737b.m48249a().isPlatformBinded(dVar.f54405a) : !C19737b.m48249a().hasPlatformBinded() && !C19737b.m48249a().isPlatformBinded(C19737b.m48249a().getPlayNameMobile())) {
                i = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                if (dVar.f54407c != null) {
                    dVar.f54407c.mo19455a(dVar.f54406b, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        dVar.f54406b = null;
        dVar.f54405a = null;
        onResume();
        resumeTimers();
    }

    public final void setAdditionReportParams(Map<String, String> map) {
        this.additionReportParams = map;
    }

    public final void setAdditionalReportParams(Map<String, String> map) {
        this.additionReportParams = map;
    }

    public final void setCanScrollVertically(boolean z) {
        this.canScrollVertically = z;
    }

    public final void setEnableScrollControl(boolean z) {
        this.enableScrollControl = z;
    }

    public final void setMonitorSession(C22521l lVar) {
        this.monitorSession = lVar;
    }

    public final void setMonitorSessionCreatedBySelf(boolean z) {
        this.monitorSessionCreatedBySelf = z;
    }

    public final void setSingleWebChromeClient(SingleWebChromeClient singleWebChromeClient2) {
        this.singleWebChromeClient = singleWebChromeClient2;
    }

    public final void setWebScrollListener(C27299b bVar) {
        this.scrollListener = bVar;
    }

    public final void setWebviewTouchListener(OnTouchListener onTouchListener) {
        this.webviewTouchListener = onTouchListener;
    }

    public final void setBaseJsMessageHandler(C48373l lVar) {
        C52711k.m112240b(lVar, "<set-?>");
        this.baseJsMessageHandler = lVar;
    }

    public final void addOnSingleWebViewStatus(C27235d dVar) {
        C52711k.m112240b(dVar, "onSingleWebViewStatus");
        C27241h hVar = this.singleWebViewClient;
        if (hVar != null) {
            hVar.f71887c.add(dVar);
        }
    }

    public final void addOnWebChromeStatus(C27236e eVar) {
        C52711k.m112240b(eVar, "onWebChromeStatus");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f71846f.add(eVar);
        }
    }

    public final void controlGeolocationPermissions(boolean z) {
        this.baseJsMessageHandler.f54390q = Boolean.valueOf(z);
    }

    public final boolean isVisited(String str) {
        C52711k.m112240b(str, "url");
        return this.visitedUrls.contains(str);
    }

    public final void removeOnSingleWebViewStatus(C27235d dVar) {
        C52711k.m112240b(dVar, "onSingleWebViewStatus");
        C27241h hVar = this.singleWebViewClient;
        if (hVar != null) {
            hVar.f71887c.remove(dVar);
        }
    }

    public final void removeOnWebChromeStatus(C27236e eVar) {
        C52711k.m112240b(eVar, "onWebChromeStatus");
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 != null) {
            singleWebChromeClient2.f71846f.remove(eVar);
        }
    }

    public final void setShouldOverrideInterceptor(C52682m<? super WebView, ? super String, Boolean> mVar) {
        C52711k.m112240b(mVar, "interceptor");
        C27241h hVar = this.singleWebViewClient;
        if (hVar != null) {
            hVar.f71888d = mVar;
        }
    }

    public final void visit(String str) {
        C52711k.m112240b(str, "url");
        this.visitedUrls.add(str);
    }

    public final boolean canScrollVertically(int i) {
        if (!this.enableScrollControl) {
            return super.canScrollVertically(i);
        }
        if (!this.canScrollVertically || !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    public final void loadUrl(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (C27256n.m65699a(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            this.mTTNetInterceptorWrapper = new C27251l(sb2.toString());
            C27241h hVar = this.singleWebViewClient;
            if (hVar != null) {
                hVar.f71890f = this.mTTNetInterceptorWrapper;
            }
        }
        C52727e eVar = new C52727e();
        eVar.element = str;
        if (str != null) {
            eVar.element = beforeLoadUrl(str);
        }
        C52687r<? super WebView, ? super String, ? super Map<String, String>, ? super C52682m<? super String, ? super Map<String, String>, C52860x>, C52860x> rVar = C27257a.m65702a().f71920a;
        if (rVar != null) {
            rVar.mo18305a(this, (String) eVar.element, null, new C27227l(this, eVar));
        } else {
            super.loadUrl((String) eVar.element);
        }
    }

    @C53771m
    public final void onJsBroadcast(C29906l lVar) {
        Object obj;
        C52711k.m112240b(lVar, "event");
        C18082l a = new C18087q().mo35029a(lVar.f78045b.toString());
        C52711k.m112236a((Object) a, "JsonParser().parse(event.params.toString())");
        C18085o m = a.mo35009m();
        C18082l b = m.mo35022b("eventName");
        if (b != null) {
            obj = b.mo34905c();
        } else {
            obj = null;
        }
        if (C52711k.m112239a(obj, (Object) C28695c.f75316i)) {
            C18082l b2 = m.mo35022b("data");
            if (b2 != null) {
                try {
                    this.disableInterceptRegionList = (C27217c[]) getGson().mo34881a(b2, C27217c[].class);
                    return;
                } catch (C18091u unused) {
                }
            }
            this.disableInterceptRegionList = null;
        }
    }

    public final void initWeb(Activity activity) {
        C52711k.m112240b(activity, "context");
        C22477a.m55542f();
        this.lastClickTime = 0;
        this.contextProviderFactory = new C19749d();
        this.baseJsMessageHandler = C48361s.m104668a(activity);
        this.iCrossPlatformActivityContainer = null;
        this.singleWebChromeClient = null;
        this.disableInterceptRegionList = null;
        this.pauseList = null;
        this.mTTNetInterceptorWrapper = null;
        this.visitedUrls = new LinkedHashSet();
        C19749d dVar = this.contextProviderFactory;
        dVar.mo41178a(AbsActivityContainer.class, new C27220f(this));
        dVar.mo41178a(C22521l.class, new C27221g(this));
        this.singleWebViewClient = new C27241h();
        setWebViewClient(C13482c.m27232a(this.singleWebViewClient));
        WebView webView = this;
        this.singleWebChromeClient = new SingleWebChromeClient(webView);
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 == null) {
            C52711k.m112234a();
        }
        singleWebChromeClient2.f71844d = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        C19750e a = C19752b.m48266a(webView);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            C52711k.m112234a();
        }
        C19750e a2 = a.mo41180a((WebChromeClient) singleWebChromeClient3);
        C27241h hVar = this.singleWebViewClient;
        if (hVar == null) {
            C52711k.m112234a();
        }
        this.iesJsBridge = a2.mo41181a((WebViewClient) hVar).mo41182a((C19734a) this.baseJsMessageHandler).mo41186a(PoiServiceImpl.createIPoiServicebyMonsterPlugin().useInjectionJsb()).mo41187b(false).mo41183a((C19766m) new C27237f()).mo41184a((C52682m<? super String, ? super C19751a, C52860x>) new C27222h<Object,Object,C52860x>(this), (C52686q<? super String, ? super C19751a, ? super Integer, C52860x>) new C27223i<Object,Object,Object,C52860x>(this));
        this.baseJsMessageHandler.mo41151a(this.iesJsBridge, this.contextProviderFactory);
        C27241h hVar2 = this.singleWebViewClient;
        if (hVar2 == null) {
            C52711k.m112234a();
        }
        hVar2.f28943b = this.iesJsBridge.f54416b;
        initConfig();
        addOnAttachStateChangeListener(new C27224j(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[LOOP:0: B:5:0x0039->B:18:0x0064, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0062 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            int r2 = r17.getActionMasked()
            r3 = 2
            r4 = 1
            if (r2 != 0) goto L_0x006c
            r2 = 0
            r0.disableIntercept = r2
            int[] r5 = new int[r3]
            r0.getLocationInWindow(r5)
            float r6 = r17.getRawX()
            r7 = r5[r2]
            float r7 = (float) r7
            float r6 = r6 - r7
            double r6 = (double) r6
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58244b(r6)
            float r7 = r17.getRawY()
            r5 = r5[r4]
            float r5 = (float) r5
            float r7 = r7 - r5
            double r7 = (double) r7
            int r5 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58244b(r7)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$c[] r7 = r0.disableInterceptRegionList
            if (r7 == 0) goto L_0x0069
            int r8 = r7.length
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x0069
            r10 = r7[r9]
            double r11 = (double) r6
            double r13 = r10.f71856a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x005f
            double r13 = r10.f71856a
            double r2 = r10.f71858c
            double r13 = r13 + r2
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x005f
            double r2 = (double) r5
            double r11 = r10.f71857b
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x005f
            double r11 = r10.f71857b
            double r13 = r10.f71859d
            double r11 = r11 + r13
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x006a
        L_0x0064:
            int r9 = r9 + 1
            r2 = 0
            r3 = 2
            goto L_0x0039
        L_0x0069:
            r2 = 0
        L_0x006a:
            r0.disableIntercept = r2
        L_0x006c:
            boolean r2 = r0.disableIntercept
            if (r2 == 0) goto L_0x0073
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x0073:
            boolean r2 = r0.canTouch
            if (r2 == 0) goto L_0x0088
            android.view.GestureDetector r2 = r16.getLastClickDetector()
            r2.onTouchEvent(r1)
            android.view.View$OnTouchListener r2 = r0.webviewTouchListener
            if (r2 == 0) goto L_0x0088
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            r2.onTouch(r3, r1)
        L_0x0088:
            boolean r2 = r0.enableScrollControl
            if (r2 == 0) goto L_0x00a1
            boolean r2 = r0.canScrollVertically
            if (r2 == 0) goto L_0x0094
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L_0x009c
        L_0x0094:
            int r2 = r17.getAction()
            r3 = 2
            if (r2 != r3) goto L_0x009c
            return r4
        L_0x009c:
            boolean r1 = super.onTouchEvent(r17)
            return r1
        L_0x00a1:
            boolean r1 = super.onTouchEvent(r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String beforeLoadUrl(java.lang.String r11) {
        /*
            r10 = this;
            r10.enableTTWebViewFullProcessLog()
            r10.curUrl = r11
            com.ss.android.ugc.aweme.af.a.l r0 = r10.monitorSession
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.af.a.l r0 = r10.monitorSession
            if (r0 != 0) goto L_0x0012
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0012:
            boolean r0 = r0.f60539c
            if (r0 != 0) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r10.monitorSessionCreatedBySelf = r2
            goto L_0x002a
        L_0x001a:
            com.ss.android.ugc.aweme.crossplatform.b.c r0 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a.m65458a()
            boolean r3 = r0.mo55451a(r11)
            com.ss.android.ugc.aweme.af.a.l r0 = r0.mo55448a(r3)
            r10.monitorSession = r0
            r10.monitorSessionCreatedBySelf = r1
        L_0x002a:
            com.ss.android.ugc.aweme.af.a.l r0 = r10.monitorSession
            if (r0 == 0) goto L_0x0068
            java.lang.Class<com.ss.android.ugc.aweme.af.a.n> r3 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n.class
            com.ss.android.ugc.aweme.af.a.t r0 = r0.mo46870a(r3)
            com.ss.android.ugc.aweme.af.a.n r0 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n) r0
            if (r0 == 0) goto L_0x0068
            com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a.m65458a()
            com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig r3 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.m65452b()
            if (r3 == 0) goto L_0x0068
            java.lang.Boolean r4 = r3.getH5StaticResourceReportEnabled()     // Catch:{ a -> 0x004b }
            java.lang.String r5 = "it.h5StaticResourceReportEnabled"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ a -> 0x004b }
            goto L_0x004f
        L_0x004b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
        L_0x004f:
            boolean r4 = r4.booleanValue()
            r0.mo46860a(r4)
            java.util.List r3 = r3.getH5StaticResourceReportWhiteList()
            if (r3 != 0) goto L_0x0065
            java.util.List r3 = java.util.Collections.emptyList()
            java.lang.String r4 = "emptyList()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
        L_0x0065:
            r0.mo46859a(r3)
        L_0x0068:
            com.ss.android.ugc.aweme.af.a.l r0 = r10.monitorSession
            if (r0 == 0) goto L_0x0115
            boolean r3 = r0.f60539c
            r4 = 0
            if (r3 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r0 = r4
        L_0x0073:
            if (r0 == 0) goto L_0x0115
            com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a.m65458a()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map<java.lang.String, java.lang.String> r5 = r10.additionReportParams
            if (r5 == 0) goto L_0x0086
            r3.putAll(r5)
        L_0x0086:
            com.ss.android.ugc.aweme.crossplatform.activity.h r5 = r10.iCrossPlatformActivityContainer
            if (r5 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.crossplatform.c.a.a r5 = r5.getCrossPlatformParams()
            if (r5 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.crossplatform.c.b r5 = r5.f71719b
            goto L_0x0094
        L_0x0093:
            r5 = r4
        L_0x0094:
            r6 = 0
            if (r5 == 0) goto L_0x009b
            long r8 = r5.f71746a
            goto L_0x009c
        L_0x009b:
            r8 = r6
        L_0x009c:
            if (r5 == 0) goto L_0x00a0
            int r2 = r5.f71768w
        L_0x00a0:
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ac
            if (r2 != r1) goto L_0x00a9
            java.lang.String r1 = "ad_floor_page"
            goto L_0x00ad
        L_0x00a9:
            java.lang.String r1 = "ad"
            goto L_0x00ad
        L_0x00ac:
            r1 = r4
        L_0x00ad:
            if (r1 == 0) goto L_0x00b4
            java.lang.String r2 = "package"
            r3.put(r2, r1)
        L_0x00b4:
            com.ss.android.ugc.aweme.crossplatform.activity.h r1 = r10.iCrossPlatformActivityContainer
            if (r1 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()
            goto L_0x00be
        L_0x00bd:
            r1 = r4
        L_0x00be:
            if (r1 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r1.f71719b
            if (r1 == 0) goto L_0x00c7
            java.lang.String r1 = r1.f71741E
            goto L_0x00c8
        L_0x00c7:
            r1 = r4
        L_0x00c8:
            if (r1 == 0) goto L_0x00cf
            java.lang.String r2 = "enter_from"
            r3.put(r2, r1)
        L_0x00cf:
            com.ss.android.ugc.aweme.crossplatform.activity.h r1 = r10.iCrossPlatformActivityContainer
            if (r1 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()
            goto L_0x00d9
        L_0x00d8:
            r1 = r4
        L_0x00d9:
            if (r1 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r1.f71719b
            if (r1 == 0) goto L_0x00e1
            java.lang.String r4 = r1.f71744H
        L_0x00e1:
            if (r4 == 0) goto L_0x00e8
            java.lang.String r1 = "challenge_id"
            r3.put(r1, r4)
        L_0x00e8:
            java.lang.String r1 = "chrome_version"
            java.lang.String r2 = r10.getChromeVersion()
            r3.put(r1, r2)
            java.lang.String r1 = "webview_type"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.ttwebview.C47367a.m102734a()
            java.lang.String r4 = "TTWebViewTask.getWebviewType()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r3.put(r1, r2)
            android.net.Uri r1 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22491ag.m55586a(r11)
            r2 = r10
            android.view.View r2 = (android.view.View) r2
            r0.mo46871a(r1, r2, r3)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.h r1 = r10.singleWebViewClient
            if (r1 == 0) goto L_0x010f
            r1.f71891g = r0
        L_0x010f:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient r1 = r10.singleWebChromeClient
            if (r1 == 0) goto L_0x0115
            r1.f71847g = r0
        L_0x0115:
            com.ss.android.ugc.aweme.web.l r0 = r10.baseJsMessageHandler
            com.ss.android.ugc.aweme.af.a.l r1 = r10.monitorSession
            r0.mo41201a(r1)
            com.ss.android.ugc.aweme.ad.services.IDouPlusService r0 = com.p683ss.android.ugc.aweme.p1308ad.DouPlusServiceImpl.createIDouPlusServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IDouPlusService r0 = (com.p683ss.android.ugc.aweme.p1308ad.services.IDouPlusService) r0
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = r0.appendDeviceIdForLocalTest(r11)
            if (r0 != 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r11 = r0
        L_0x012c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.beforeLoadUrl(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCrossPlatformActivityContainer(com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L_0x00b8
            r14.iCrossPlatformActivityContainer = r15
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r1 = com.p683ss.android.ugc.aweme.commercialize.C25944j.m62908a()
            java.lang.String r2 = "ILegacyCommercializeService.impl()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.commercialize.utils.bi r1 = r1.getVastUtilsService()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r2 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r2 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r2
            com.ss.android.ugc.aweme.crossplatform.activity.h r3 = r14.iCrossPlatformActivityContainer
            if (r3 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.crossplatform.c.a.a r3 = r3.getCrossPlatformParams()
            if (r3 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.crossplatform.c.b r3 = r3.f71719b
            if (r3 == 0) goto L_0x002d
            long r3 = r3.f71746a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x002e
        L_0x002d:
            r3 = r0
        L_0x002e:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getRawAdAwemeByAdId(r3)
            boolean r1 = r1.mo54138a(r2)
            r14.isVastAd = r1
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient r1 = r14.singleWebChromeClient
            if (r1 == 0) goto L_0x003e
            r1.f71845e = r15
        L_0x003e:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.h r1 = r14.singleWebViewClient
            if (r1 == 0) goto L_0x00b0
            r1.f71892h = r15
            com.ss.android.ugc.aweme.web.q r2 = com.p683ss.android.ugc.aweme.web.C48380q.m104672e()
            if (r2 == 0) goto L_0x0099
            boolean r3 = r2.mo41207a()
            if (r3 == 0) goto L_0x0099
            com.ss.android.sdk.webview.j r3 = r1.mo55634a()
            if (r3 == 0) goto L_0x0059
            r3.mo41196b()
        L_0x0059:
            com.ss.android.ugc.aweme.crossplatform.activity.h r3 = r1.f71892h
            if (r3 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.crossplatform.business.g r3 = r3.getCrossPlatformBusiness()
            if (r3 == 0) goto L_0x0077
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness> r4 = com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r3 = r3.mo55523a(r4)
            com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r3 = (com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness) r3
            if (r3 == 0) goto L_0x0077
            com.ss.android.sdk.webview.j r4 = r1.mo55634a()
            r5 = r2
            com.ss.android.sdk.webview.n r5 = (com.p683ss.android.sdk.webview.C19767n) r5
            r3.mo55477a(r4, r5)
        L_0x0077:
            java.util.List r2 = r2.mo41209c()
            com.ss.android.ugc.aweme.crossplatform.activity.h r3 = r1.f71892h
            if (r3 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.crossplatform.business.g r3 = r3.getCrossPlatformBusiness()
            if (r3 == 0) goto L_0x0092
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness> r4 = com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r3 = r3.mo55523a(r4)
            com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r3 = (com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness) r3
            if (r3 == 0) goto L_0x0092
            r3.mo55479a(r2)
        L_0x0092:
            com.ss.android.sdk.webview.i r3 = r1.f71889e
            if (r3 == 0) goto L_0x0099
            r3.mo41192a(r2)
        L_0x0099:
            com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness r2 = r1.mo55635b()
            if (r2 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.crossplatform.activity.h r1 = r1.f71892h
            if (r1 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()
            if (r1 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r1.f71719b
            goto L_0x00ad
        L_0x00ac:
            r1 = r0
        L_0x00ad:
            r2.mo55497a(r1)
        L_0x00b0:
            com.ss.android.ugc.aweme.web.l r1 = r14.baseJsMessageHandler
            r2 = r15
            com.ss.android.ugc.aweme.web.j r2 = (com.p683ss.android.ugc.aweme.web.C48280j) r2
            r1.mo95778a(r2)
        L_0x00b8:
            if (r15 == 0) goto L_0x015c
            com.ss.android.ugc.aweme.crossplatform.c.a.a r15 = r15.getCrossPlatformParams()
            if (r15 == 0) goto L_0x015c
            com.ss.android.ugc.aweme.crossplatform.c.a r1 = r15.f71718a
            boolean r1 = r1.f71710g
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            r4 = 1
            if (r2 < r3) goto L_0x010a
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r3 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x00fe }
            java.lang.Boolean r2 = r2.getEnableAudioAutoPlay()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r3 = "SettingsReader.get().enableAudioAutoPlay"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x00fe }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00fe }
            if (r2 == 0) goto L_0x00f1
            android.webkit.WebSettings r2 = r14.getSettings()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r3 = "settings"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x00fe }
            r1 = r1 ^ r4
            r2.setMediaPlaybackRequiresUserGesture(r1)     // Catch:{ Exception -> 0x00fe }
            goto L_0x010a
        L_0x00f1:
            android.webkit.WebSettings r1 = r14.getSettings()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r2 = "settings"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x00fe }
            r1.setMediaPlaybackRequiresUserGesture(r4)     // Catch:{ Exception -> 0x00fe }
            goto L_0x010a
        L_0x00fe:
            android.webkit.WebSettings r1 = r14.getSettings()
            java.lang.String r2 = "settings"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setMediaPlaybackRequiresUserGesture(r4)
        L_0x010a:
            com.ss.android.ugc.aweme.web.l r5 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r15.f71719b
            long r6 = r1.f71746a
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r15.f71719b
            java.lang.String r8 = r1.f71747b
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r15.f71719b
            int r9 = r1.f71748c
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r15.f71719b
            java.lang.String r10 = r1.f71754i
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r15.f71719b
            java.lang.String r11 = r1.f71750e
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r15.f71719b
            java.lang.String r12 = r1.f71739C
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r15.f71719b
            java.lang.String r13 = r1.f71740D
            r5.mo41150a(r6, r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.web.l r1 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.c.a r2 = r15.f71718a
            java.lang.String r2 = r2.f71708e
            if (r2 == 0) goto L_0x013e
            java.lang.Long r2 = p2628d.p2650m.C52830p.m112396d(r2)
            if (r2 == 0) goto L_0x013e
            long r2 = r2.longValue()
            goto L_0x0140
        L_0x013e:
            r2 = 0
        L_0x0140:
            r1.f54387n = r2
            com.ss.android.ugc.aweme.web.l r1 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.c.b r2 = r15.f71719b
            java.lang.String r2 = r2.f71752g
            r1.f54385l = r2
            com.ss.android.ugc.aweme.web.l r1 = r14.baseJsMessageHandler
            com.ss.android.ugc.aweme.crossplatform.c.b r2 = r15.f71719b
            java.lang.String r2 = r2.f71751f
            r1.f54386m = r2
            com.ss.android.ugc.aweme.crossplatform.c.a r15 = r15.f71718a
            boolean r15 = r15.f71715l
            if (r15 == 0) goto L_0x015b
            r14.setLayerType(r4, r0)
        L_0x015b:
            return
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.setCrossPlatformActivityContainer(com.ss.android.ugc.aweme.crossplatform.activity.h):void");
    }

    public final void sendEventToWebView(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "event");
        this.baseJsMessageHandler.mo41154a(str, jSONObject);
    }

    public final void reportOnJsbInvoke(String str, C19751a aVar) {
        if (isAllowJsbMonitor()) {
            C22521l lVar = this.monitorSession;
            if (lVar != null) {
                C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
                if (nVar != null) {
                    String str2 = "hybrid_app_monitor_bridge_invoke_event";
                    String str3 = "bridge_invoke";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bridge_name", str);
                    switch (C27240g.f71883a[aVar.ordinal()]) {
                        case 1:
                            jSONObject.put("bridge_access", "public");
                            break;
                        case 2:
                            jSONObject.put("bridge_access", "private");
                            break;
                    }
                    nVar.mo46858a(str2, str3, jSONObject, null, null);
                }
            }
        }
    }

    public final void loadUrl(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (C27256n.m65699a(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            this.mTTNetInterceptorWrapper = new C27251l(sb2.toString());
            C27241h hVar = this.singleWebViewClient;
            if (hVar != null) {
                hVar.f71890f = this.mTTNetInterceptorWrapper;
            }
        }
        C52727e eVar = new C52727e();
        eVar.element = str;
        if (str != null) {
            eVar.element = beforeLoadUrl(str);
        }
        C52687r<? super WebView, ? super String, ? super Map<String, String>, ? super C52682m<? super String, ? super Map<String, String>, C52860x>, C52860x> rVar = C27257a.m65702a().f71920a;
        if (rVar != null) {
            rVar.mo18305a(this, (String) eVar.element, map, new C27228m(this, eVar, map));
        } else {
            super.loadUrl((String) eVar.element, map);
        }
    }

    public final void reportOnJsbReject(String str, C19751a aVar, int i) {
        if (isAllowJsbMonitor()) {
            C22521l lVar = this.monitorSession;
            if (lVar != null) {
                C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
                if (nVar != null) {
                    String str2 = "hybrid_app_monitor_bridge_invoke_event";
                    String str3 = "bridge_reject";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bridge_name", str);
                    switch (C27240g.f71884b[aVar.ordinal()]) {
                        case 1:
                            jSONObject.put("bridge_access", "public");
                            break;
                        case 2:
                            jSONObject.put("bridge_access", "private");
                            break;
                    }
                    jSONObject.put("reason", String.valueOf(i));
                    nVar.mo46858a(str2, str3, jSONObject, null, null);
                }
            }
        }
    }

    public SingleWebView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.contextProviderFactory = new C19749d();
        this.baseJsMessageHandler = C48361s.m104668a(context);
        this.gson$delegate = C52732g.m112285a(C27219e.f71861a);
        this.visitedUrls = new LinkedHashSet();
        this.chromeVersion$delegate = C52732g.m112286a(C52757k.NONE, new C27218d(this));
        this.lastClickDetector$delegate = C52732g.m112285a(new C27225k(this, context));
        C22477a.m55542f();
        C19749d dVar = this.contextProviderFactory;
        dVar.mo41178a(AbsActivityContainer.class, new C27215a(this));
        dVar.mo41178a(C22521l.class, new C27216b(this));
        this.singleWebViewClient = new C27241h();
        setWebViewClient(C13482c.m27232a(this.singleWebViewClient));
        WebView webView = this;
        this.singleWebChromeClient = new SingleWebChromeClient(webView);
        SingleWebChromeClient singleWebChromeClient2 = this.singleWebChromeClient;
        if (singleWebChromeClient2 == null) {
            C52711k.m112234a();
        }
        singleWebChromeClient2.f71844d = this.baseJsMessageHandler;
        setWebChromeClient(this.singleWebChromeClient);
        C19750e a = C19752b.m48266a(webView);
        SingleWebChromeClient singleWebChromeClient3 = this.singleWebChromeClient;
        if (singleWebChromeClient3 == null) {
            C52711k.m112234a();
        }
        C19750e a2 = a.mo41180a((WebChromeClient) singleWebChromeClient3);
        C27241h hVar = this.singleWebViewClient;
        if (hVar == null) {
            C52711k.m112234a();
        }
        this.iesJsBridge = a2.mo41181a((WebViewClient) hVar).mo41182a((C19734a) this.baseJsMessageHandler).mo41186a(PoiServiceImpl.createIPoiServicebyMonsterPlugin().useInjectionJsb()).mo41187b(false).mo41183a((C19766m) new C27237f()).mo41184a((C52682m<? super String, ? super C19751a, C52860x>) new C52682m<String, C19751a, C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ SingleWebView f71851a;

            {
                this.f71851a = r1;
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                C19751a aVar = (C19751a) obj2;
                C52711k.m112240b(str, "methodName");
                C52711k.m112240b(aVar, "bridgeAccess");
                this.f71851a.reportOnJsbInvoke(str, aVar);
                return C52860x.f131107a;
            }
        }, (C52686q<? super String, ? super C19751a, ? super Integer, C52860x>) new C52686q<String, C19751a, Integer, C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ SingleWebView f71852a;

            {
                this.f71852a = r1;
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                C19751a aVar = (C19751a) obj2;
                int intValue = ((Number) obj3).intValue();
                C52711k.m112240b(str, "methodName");
                C52711k.m112240b(aVar, "bridgeAccess");
                this.f71852a.reportOnJsbReject(str, aVar, intValue);
                return C52860x.f131107a;
            }
        });
        this.baseJsMessageHandler.mo41151a(this.iesJsBridge, this.contextProviderFactory);
        C27241h hVar2 = this.singleWebViewClient;
        if (hVar2 == null) {
            C52711k.m112234a();
        }
        hVar2.f28943b = this.iesJsBridge.f54416b;
        initConfig();
        addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ SingleWebView f71853a;

            {
                this.f71853a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                C52711k.m112240b(view, "v");
                C22521l monitorSession = this.f71853a.getMonitorSession();
                if (monitorSession != null) {
                    C22524n nVar = (C22524n) monitorSession.mo46870a(C22524n.class);
                    if (nVar != null) {
                        nVar.mo46851a(null);
                    }
                }
            }

            public final void onViewDetachedFromWindow(View view) {
                C52711k.m112240b(view, "v");
                C22521l monitorSession = this.f71853a.getMonitorSession();
                if (monitorSession != null) {
                    C22524n nVar = (C22524n) monitorSession.mo46870a(C22524n.class);
                    if (nVar != null) {
                        nVar.mo46862b(null);
                    }
                }
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.canScrollVertically = true;
    }

    public static /* synthetic */ void setAdditionalReportParams$default(SingleWebView singleWebView, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        singleWebView.setAdditionalReportParams(map);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C27299b bVar = this.scrollListener;
        if (bVar != null) {
            bVar.mo54645a(i, i2, i3, i4);
        }
    }

    public /* synthetic */ SingleWebView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
