package com.p683ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.sdk.webview.C19748c;
import com.p683ss.android.sdk.webview.C19749d;
import com.p683ss.android.sdk.webview.C19760h;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.crossplatform.C27124b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27151e;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g.C27178a;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27139e.C27140a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27192b;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27195d;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27196e;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1617d.C27201c;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27234c;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27236e;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView */
public class CrossPlatformWebView extends FrameLayout implements C27298a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71973a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CrossPlatformWebView.class), "timeStatisticsUtils", "getTimeStatisticsUtils()Lcom/ss/android/ugc/aweme/crossplatform/utils/TimeStatisticsUtils;"))};

    /* renamed from: A */
    private final Set<C52671b<Boolean, C52860x>> f71974A;

    /* renamed from: B */
    private HashMap f71975B;

    /* renamed from: b */
    public final Set<C27302d> f71976b;

    /* renamed from: c */
    public int f71977c;

    /* renamed from: d */
    public boolean f71978d;

    /* renamed from: e */
    public C27114h f71979e;

    /* renamed from: f */
    public C22521l f71980f;

    /* renamed from: g */
    public C27182a f71981g;

    /* renamed from: h */
    public String f71982h;

    /* renamed from: i */
    private final C27305g f71983i;

    /* renamed from: j */
    private C41434a f71984j;

    /* renamed from: k */
    private final C27124b f71985k;

    /* renamed from: l */
    private boolean f71986l;

    /* renamed from: m */
    private final C52668f f71987m;

    /* renamed from: n */
    private boolean f71988n;

    /* renamed from: o */
    private final C27303e f71989o;

    /* renamed from: p */
    private final C27309j f71990p;

    /* renamed from: q */
    private C27234c f71991q;

    /* renamed from: r */
    private C27235d f71992r;

    /* renamed from: s */
    private final String f71993s;

    /* renamed from: t */
    private final C19749d f71994t;

    /* renamed from: u */
    private Map<String, String> f71995u;

    /* renamed from: v */
    private C27177g f71996v;

    /* renamed from: w */
    private boolean f71997w;

    /* renamed from: x */
    private Throwable f71998x;

    /* renamed from: y */
    private long f71999y;

    /* renamed from: z */
    private long f72000z;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$a */
    public static final class C27287a implements C19760h<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f72001a;

        public final void release() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo41189a() {
            C27114h hVar = this.f72001a.f71979e;
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

        C27287a(CrossPlatformWebView crossPlatformWebView) {
            this.f72001a = crossPlatformWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$b */
    public static final class C27288b implements C19760h<C22521l> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f72002a;

        public final void release() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo41189a() {
            return this.f72002a.f71980f;
        }

        C27288b(CrossPlatformWebView crossPlatformWebView) {
            this.f72002a = crossPlatformWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$c */
    public static final class C27289c implements C27308i {
        C27289c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$d */
    static final class C27290d implements OnTouchListener {

        /* renamed from: a */
        public static final C27290d f72003a = new C27290d();

        C27290d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C52711k.m112236a((Object) motionEvent, "event");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$e */
    static final class C27291e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f72004a;

        C27291e(CrossPlatformWebView crossPlatformWebView) {
            this.f72004a = crossPlatformWebView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((SingleWebView) this.f72004a.mo55669a((int) R.id.eu)).reload();
            C27182a crossPlatformParams = this.f72004a.getCrossPlatformParams();
            if (crossPlatformParams != null) {
                C27196e eVar = crossPlatformParams.f71721d;
                if (eVar != null && eVar.f71812r) {
                    C27114h hVar = this.f72004a.f71979e;
                    if (hVar != null) {
                        hVar.mo54147c();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$f */
    public static final class C27292f implements C27236e {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f72005a;

        /* renamed from: b */
        private View f72006b;

        /* renamed from: a */
        public final void mo55566a() {
            if (this.f72006b != null) {
                this.f72005a.removeView(this.f72006b);
                this.f72006b = null;
            }
            C27234c iFullScreen = this.f72005a.getIFullScreen();
            if (iFullScreen != null) {
                iFullScreen.mo55417a();
            }
        }

        C27292f(CrossPlatformWebView crossPlatformWebView) {
            this.f72005a = crossPlatformWebView;
        }

        /* renamed from: a */
        public final void mo55567a(View view, CustomViewCallback customViewCallback) {
            boolean z;
            C27234c iFullScreen = this.f72005a.getIFullScreen();
            if (iFullScreen != null) {
                z = iFullScreen.mo55418a(view, customViewCallback);
            } else {
                z = false;
            }
            if (!z) {
                this.f72006b = view;
                View view2 = this.f72006b;
                if (view2 != null) {
                    this.f72005a.addView(view2);
                }
            }
        }

        /* renamed from: a */
        public final void mo55568a(WebView webView, int i) {
            if (!C52711k.m112239a((Object) this.f72005a.f71982h, (Object) QuickShopBusiness.f64351b)) {
                if (i == 100) {
                    LineProgressBarView lineProgressBarView = (LineProgressBarView) this.f72005a.mo55669a((int) R.id.eo4);
                    C52711k.m112236a((Object) lineProgressBarView, "pbv_loading_bar");
                    lineProgressBarView.setVisibility(8);
                    if (this.f72005a.getShouldShowProgressBarBg()) {
                        View a = this.f72005a.mo55669a((int) R.id.dz9);
                        C52711k.m112236a((Object) a, "bg_loading_bar");
                        a.setVisibility(8);
                    }
                } else {
                    LineProgressBarView lineProgressBarView2 = (LineProgressBarView) this.f72005a.mo55669a((int) R.id.eo4);
                    C52711k.m112236a((Object) lineProgressBarView2, "pbv_loading_bar");
                    lineProgressBarView2.setProgress(i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$g */
    public static final class C27293g implements C27303e {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f72007a;

        C27293g(CrossPlatformWebView crossPlatformWebView) {
            this.f72007a = crossPlatformWebView;
        }

        /* renamed from: a */
        public final void mo55728a(C27182a aVar) {
            if (aVar != null) {
                CrossPlatformWebView.m65744a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$h */
    static final class C27294h extends C52712l implements C52670a<C27201c> {

        /* renamed from: a */
        public static final C27294h f72008a = new C27294h();

        C27294h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27201c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$i */
    public static final class C27295i implements C27309j {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f72009a;

        /* renamed from: a */
        public final SingleWebView mo55729a() {
            SingleWebView singleWebView = (SingleWebView) this.f72009a.mo55669a((int) R.id.eu);
            C52711k.m112236a((Object) singleWebView, "this@CrossPlatformWebView.ame_rn_web_container");
            return singleWebView;
        }

        C27295i(CrossPlatformWebView crossPlatformWebView) {
            this.f72009a = crossPlatformWebView;
        }

        /* renamed from: a */
        public final void mo55730a(String str) {
            if (str != null) {
                CrossPlatformWebView.m65745a(this.f72009a, str, false, null, 6, null);
            }
        }
    }

    public CrossPlatformWebView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CrossPlatformWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public static void m65744a(C27182a aVar) {
        C52711k.m112240b(aVar, "crossPlatformParams");
    }

    /* renamed from: a */
    public static void m65746a(String str, boolean z) {
        C52711k.m112240b(str, "url");
    }

    /* renamed from: a */
    public View mo55669a(int i) {
        if (this.f71975B == null) {
            this.f71975B = new HashMap();
        }
        View view = (View) this.f71975B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f71975B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo55673a(C23481a aVar) {
        C52711k.m112240b(aVar, "event");
    }

    public final int getCurrentMode() {
        return this.f71977c;
    }

    public final C27235d getCustomWebViewStatus() {
        return this.f71992r;
    }

    public final boolean getDisplayed() {
        return this.f71986l;
    }

    public final Throwable getError() {
        return this.f71998x;
    }

    public final C27234c getIFullScreen() {
        return this.f71991q;
    }

    public final long getLoadRNViewCompleteTimestamp() {
        return this.f71999y;
    }

    /* access modifiers changed from: protected */
    public final String getLogTag() {
        return this.f71993s;
    }

    /* access modifiers changed from: protected */
    public final C27124b getMDidMountHandler() {
        return this.f71985k;
    }

    public C22521l getMonitorSession() {
        return this.f71980f;
    }

    public final C27305g getRegistry() {
        return this.f71983i;
    }

    public final C41434a getSearchEnterParam() {
        return this.f71984j;
    }

    public final boolean getShouldShowProgressBarBg() {
        return this.f71988n;
    }

    public final C27201c getTimeStatisticsUtils() {
        return (C27201c) this.f71987m.getValue();
    }

    public C27305g getViewStatusRegistry() {
        return this.f71983i;
    }

    /* renamed from: a */
    public final boolean mo55681a() {
        if (this.f71977c == 2 || !((SingleWebView) mo55669a((int) R.id.eu)).canGoBack()) {
            return false;
        }
        ((SingleWebView) mo55669a((int) R.id.eu)).goBack();
        return true;
    }

    /* renamed from: a */
    public final void mo55680a(boolean z) {
        if (z) {
            View a = mo55669a((int) R.id.u9);
            C52711k.m112236a((Object) a, "click_mask");
            a.setVisibility(0);
            ((DmtStatusView) mo55669a((int) R.id.bhy)).mo19212f();
            return;
        }
        View a2 = mo55669a((int) R.id.u9);
        C52711k.m112236a((Object) a2, "click_mask");
        a2.setVisibility(8);
        ((DmtStatusView) mo55669a((int) R.id.bhy)).mo19208c(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55674a(java.lang.Integer r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "errorCode"
            m65748a(r0, r1, r4)
            r4 = r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0018
            java.lang.String r4 = "errorDesc"
            m65748a(r0, r4, r5)
        L_0x0018:
            r4 = r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0041
            android.net.Uri r4 = android.net.Uri.parse(r6)
            java.lang.String r5 = "url"
            m65748a(r0, r5, r6)
            java.lang.String r5 = "host"
            java.lang.String r6 = "url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            java.lang.String r6 = r4.getHost()
            m65748a(r0, r5, r6)
            java.lang.String r5 = "path"
            java.lang.String r4 = r4.getPath()
            m65748a(r0, r5, r4)
        L_0x0041:
            com.ss.android.ugc.aweme.crossplatform.c.a.a r4 = r3.getCrossPlatformParams()
            r5 = 0
            if (r4 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.crossplatform.c.b r4 = r4.f71719b
            if (r4 == 0) goto L_0x0050
            long r1 = r4.f71746a
            goto L_0x0051
        L_0x0050:
            r1 = r5
        L_0x0051:
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0092
            java.lang.String r4 = "creativeId"
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r3.getCrossPlatformParams()
            if (r1 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.crossplatform.c.b r1 = r1.f71719b
            if (r1 == 0) goto L_0x0068
            long r1 = r1.f71746a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            m65748a(r0, r4, r1)
            if (r7 == 0) goto L_0x0085
            long r1 = r3.f72000z
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x008b
            java.lang.String r4 = "duration"
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r1 = r3.f72000z
            long r5 = r5 - r1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            m65748a(r0, r4, r5)
            goto L_0x008b
        L_0x0085:
            java.lang.String r4 = "aweme_ad_landingpage_open_error"
            r5 = 1
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r4, r5, r0)
        L_0x008b:
            java.lang.String r4 = "aweme_ad_landingpage_open_error_rate"
            r5 = r7 ^ 1
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r4, r5, r0)
        L_0x0092:
            com.p683ss.android.sdk.activity.C19725b.m48223a(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo55674a(java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public final void mo55677a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "event");
        SingleWebView singleWebView = (SingleWebView) mo55669a((int) R.id.eu);
        C52711k.m112236a((Object) singleWebView, "ame_rn_web_container");
        if (singleWebView.getVisibility() == 0) {
            ((SingleWebView) mo55669a((int) R.id.eu)).sendEventToWebView(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo55678a(String str, JSONObject jSONObject, String str2) {
        C52711k.m112240b(str, "event");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        CharSequence charSequence = str2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            jSONObject2.put("reactId", str2);
        }
        jSONObject2.put("data", jSONObject);
        mo55677a("notification", jSONObject2);
    }

    /* renamed from: a */
    public void mo55679a(String str, boolean z, boolean z2) {
        C52711k.m112240b(str, "url");
        Uri parse = Uri.parse(str);
        CharSequence queryParameter = parse.getQueryParameter("rn_schema");
        boolean z3 = false;
        if (!(queryParameter == null || queryParameter.length() == 0)) {
            m65746a(str, z);
            return;
        }
        C52711k.m112236a((Object) parse, "uri");
        if (!C52711k.m112239a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTP) && !C52711k.m112239a((Object) parse.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            CharSequence queryParameter2 = parse.getQueryParameter("url");
            if (queryParameter2 == null || queryParameter2.length() == 0) {
                z3 = true;
            }
            if (!z3) {
                str = parse.getQueryParameter("url");
                if (str == null) {
                    C52711k.m112234a();
                }
            }
        }
        m65745a(this, str, z2, null, 4, null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r1.f71789A == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0136, code lost:
        if (r0 != null) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0133  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55676a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r8 = this;
            r0 = 1
            r8.f71977c = r0
            boolean r1 = com.p683ss.android.newmedia.C19547d.m47842a(r9)
            r2 = 0
            if (r1 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r8.getCrossPlatformParams()
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.crossplatform.c.e r1 = r1.f71721d
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.f71791C
            if (r1 != r0) goto L_0x002d
            r1 = 2132021531(0x7f14111b, float:1.9681456E38)
            android.view.View r1 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.feed.widget.LineProgressBarView r1 = (com.p683ss.android.ugc.aweme.feed.widget.LineProgressBarView) r1
            java.lang.String r3 = "pbv_loading_bar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r1.setVisibility(r2)
            r8.mo55686d()
            goto L_0x0047
        L_0x002d:
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r8.getCrossPlatformParams()
            if (r1 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.crossplatform.c.e r1 = r1.f71721d
            if (r1 == 0) goto L_0x003b
            boolean r1 = r1.f71789A
            if (r1 == 0) goto L_0x0047
        L_0x003b:
            r1 = 2132020898(0x7f140ea2, float:1.9680172E38)
            android.view.View r1 = r8.mo55669a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r1
            r1.mo19212f()
        L_0x0047:
            com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r8.getCrossPlatformParams()
            if (r1 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.crossplatform.c.a r1 = r1.f71718a
            if (r1 == 0) goto L_0x0057
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.f71704a = r3
        L_0x0057:
            android.app.Activity r1 = r8.getActivity()
            boolean r1 = r1 instanceof com.bytedance.ies.ugc.p694a.C11016e.C11018b
            if (r1 != 0) goto L_0x0066
            com.ss.android.ugc.aweme.crossplatform.activity.h r1 = r8.f71979e
            if (r1 == 0) goto L_0x0066
            r1.mo54145b()
        L_0x0066:
            r1 = 2132022085(0x7f141345, float:1.968258E38)
            android.view.View r1 = r8.mo55669a(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            java.lang.String r3 = "react_root_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r3 = 8
            r1.setVisibility(r3)
            r1 = 2132017404(0x7f1400fc, float:1.9673085E38)
            android.view.View r3 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r3 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r3
            java.lang.String r4 = "ame_rn_web_container"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r3.setVisibility(r2)
            android.view.View r3 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r3 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r3
            r3.transparentBackground()
            com.ss.android.ugc.aweme.crossplatform.c.a.a r3 = r8.getCrossPlatformParams()
            if (r3 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.crossplatform.c.f r3 = r3.f71722e
            if (r3 == 0) goto L_0x00ae
            boolean r3 = r3.f71822b
            if (r3 != r0) goto L_0x00ae
            android.view.View r3 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r3 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r3
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$d r4 = com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.C27290d.f72003a
            android.view.View$OnTouchListener r4 = (android.view.View.OnTouchListener) r4
            r3.setOnTouchListener(r4)
        L_0x00ae:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r8.f72000z = r3
            java.lang.String r9 = com.p683ss.android.ugc.aweme.crossplatform.p1617d.C27199a.m65620a(r9)
            if (r9 == 0) goto L_0x01b2
            d.f r3 = com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27274e.f71951c
            java.lang.Object r3 = r3.getValue()
            com.ss.android.ugc.aweme.crossplatform.prefetch.e r3 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27274e) r3
            java.lang.String r4 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r4)
            d.f r3 = r3.f71953b
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00d5:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00ef
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r6 = r9
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7 = 2
            boolean r4 = p2628d.p2650m.C52830p.m112456b(r6, r4, r2, r7, r5)
            if (r4 == 0) goto L_0x00d5
            goto L_0x00f0
        L_0x00ef:
            r0 = 0
        L_0x00f0:
            if (r0 == 0) goto L_0x00f4
            r0 = r9
            goto L_0x00f5
        L_0x00f4:
            r0 = r5
        L_0x00f5:
            if (r0 == 0) goto L_0x0138
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Throwable -> 0x0124 }
            if (r0 == 0) goto L_0x011e
            boolean r2 = r0.isHierarchical()     // Catch:{ Throwable -> 0x0124 }
            if (r2 == 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r0 = r5
        L_0x0105:
            if (r0 == 0) goto L_0x011e
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Throwable -> 0x0124 }
            java.lang.String r2 = "prefetch_enabled"
            java.lang.String r3 = "1"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)     // Catch:{ Throwable -> 0x0124 }
            android.net.Uri r0 = r0.build()     // Catch:{ Throwable -> 0x0124 }
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0124 }
            goto L_0x011f
        L_0x011e:
            r0 = r5
        L_0x011f:
            java.lang.Object r0 = p2628d.C52848o.m114620constructorimpl(r0)     // Catch:{ Throwable -> 0x0124 }
            goto L_0x012d
        L_0x0124:
            r0 = move-exception
            java.lang.Object r0 = p2628d.C52851p.m112464a(r0)
            java.lang.Object r0 = p2628d.C52848o.m114620constructorimpl(r0)
        L_0x012d:
            boolean r2 = p2628d.C52848o.m114625isFailureimpl(r0)
            if (r2 == 0) goto L_0x0134
            r0 = r5
        L_0x0134:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0139
        L_0x0138:
            r0 = r9
        L_0x0139:
            if (r0 == 0) goto L_0x01b2
            com.ss.android.ugc.aweme.af.a.l r2 = r8.f71980f
            if (r2 == 0) goto L_0x0150
            boolean r3 = r2.f60539c
            if (r3 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r2 = r5
        L_0x0145:
            if (r2 == 0) goto L_0x0150
            android.view.View r3 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r3 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r3
            r3.setMonitorSession(r2)
        L_0x0150:
            android.view.View r2 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r2 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r2
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.f71995u
            r2.setAdditionalReportParams(r3)
            if (r10 != 0) goto L_0x0167
            android.view.View r10 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r10 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r10
            r10.loadUrl(r0)
            goto L_0x0170
        L_0x0167:
            android.view.View r2 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r2 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r2
            r2.loadUrl(r0, r10)
        L_0x0170:
            android.view.View r10 = r8.mo55669a(r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r10 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r10
            com.bytedance.ies.g.b.r r10 = r10.getJsBridge2()
            if (r10 != 0) goto L_0x017d
            goto L_0x01b2
        L_0x017d:
            if (r9 != 0) goto L_0x0180
            goto L_0x01b2
        L_0x0180:
            boolean r0 = r10.f29033e
            if (r0 != 0) goto L_0x01b2
            boolean r0 = com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27263b.f71932a
            if (r0 == 0) goto L_0x019e
            com.ss.android.ugc.aweme.crossplatform.prefetch.a r0 = com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27258a.f71921a
            com.bytedance.ies.g.c.e r0 = (com.bytedance.ies.p675g.p678c.C10830e) r0
            com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27263b.f71933b = r0
            com.bytedance.ies.p675g.p678c.C10863s.m22025a(r10)     // Catch:{ Exception -> 0x0197 }
            com.bytedance.ies.g.c.s r10 = com.bytedance.ies.p675g.p678c.C10863s.f29164b     // Catch:{ Exception -> 0x0197 }
            r10.mo19637a(r9)     // Catch:{ Exception -> 0x0197 }
            goto L_0x01b2
        L_0x0197:
            r10 = move-exception
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r10)
            goto L_0x01b2
        L_0x019e:
            com.ss.android.ugc.aweme.crossplatform.prefetch.b$f r0 = com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27263b.C27269f.f71940a
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            a.i r0 = p001a.C0013i.m16a(r0)
            com.ss.android.ugc.aweme.crossplatform.prefetch.b$g r1 = new com.ss.android.ugc.aweme.crossplatform.prefetch.b$g
            r1.<init>(r10, r9)
            a.g r1 = (p001a.C0011g) r1
            java.util.concurrent.Executor r10 = p001a.C0013i.f25b
            r0.mo20a(r1, r10)
        L_0x01b2:
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18979e.m46155a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo55676a(java.lang.String, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55675a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "status"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "crossplatform_view"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "platform"
            com.ss.android.ugc.aweme.crossplatform.c.a.a r3 = r5.getCrossPlatformParams()
            r4 = 0
            if (r3 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.crossplatform.c.a r3 = r3.f71718a
            if (r3 == 0) goto L_0x0027
            java.lang.Integer r3 = r3.f71704a
            if (r3 == 0) goto L_0x0027
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r3 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65488a(r3)
            goto L_0x0028
        L_0x0027:
            r3 = r4
        L_0x0028:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "status"
            com.ss.android.ugc.aweme.app.f.d r6 = r1.mo47829a(r2, r6)
            java.lang.String r1 = "module_name"
            com.ss.android.ugc.aweme.crossplatform.c.a.a r2 = r5.getCrossPlatformParams()
            if (r2 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.crossplatform.c.d r2 = r2.f71720c
            if (r2 == 0) goto L_0x0041
            java.lang.String r2 = r2.f71778e
            goto L_0x0042
        L_0x0041:
            r2 = r4
        L_0x0042:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r1, r2)
            java.lang.String r1 = "url"
            java.lang.String r2 = r5.f71982h
            if (r2 == 0) goto L_0x004f
            java.lang.String r4 = r5.f71982h
            goto L_0x005b
        L_0x004f:
            com.ss.android.ugc.aweme.crossplatform.c.a.a r2 = r5.getCrossPlatformParams()
            if (r2 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.crossplatform.c.a r2 = r2.f71718a
            if (r2 == 0) goto L_0x005b
            java.lang.String r4 = r2.f71706c
        L_0x005b:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r1, r4)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo55675a(java.lang.String):void");
    }

    /* renamed from: g */
    public final boolean mo54151g() {
        if (this.f71977c == 2) {
            return true;
        }
        return this.f71978d;
    }

    /* access modifiers changed from: protected */
    public LayoutInflater getLayoutInflater() {
        LayoutInflater from = LayoutInflater.from(getContext());
        C52711k.m112236a((Object) from, "LayoutInflater.from(context)");
        return from;
    }

    public String getReactId() {
        C22521l lVar = this.f71980f;
        if (lVar != null) {
            return lVar.mo46782a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f71983i.f72029a.clear();
    }

    private final View getCurrentContainer() {
        if (this.f71977c != 1) {
            return null;
        }
        return (SingleWebView) mo55669a((int) R.id.eu);
    }

    /* renamed from: b */
    public final boolean mo55683b() {
        if (this.f71977c != 1 || !((SingleWebView) mo55669a((int) R.id.eu)).canGoBack()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo55686d() {
        if (this.f71988n) {
            View a = mo55669a((int) R.id.dz9);
            C52711k.m112236a((Object) a, "bg_loading_bar");
            a.setVisibility(0);
        }
    }

    public C27182a getCrossPlatformParams() {
        if (this.f71979e == null) {
            return this.f71981g;
        }
        C27114h hVar = this.f71979e;
        if (hVar == null) {
            C52711k.m112234a();
        }
        return hVar.getCrossPlatformParams();
    }

    /* renamed from: c */
    public final void mo55684c() {
        ((DmtStatusView) mo55669a((int) R.id.bhy)).mo19208c(false);
        ((DmtStatusView) mo55669a((int) R.id.abc)).mo19204a(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo55669a((int) R.id.abc);
        C52711k.m112236a((Object) dmtStatusView, "error_view");
        dmtStatusView.setVisibility(0);
    }

    /* renamed from: f */
    public final void mo54150f() {
        if (this.f71977c == 2) {
            String str = this.f71982h;
            if (str == null) {
                C27182a aVar = this.f71981g;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                m65744a(aVar);
            }
            if (str == null) {
                C52711k.m112234a();
            }
            m65746a(str, true);
            return;
        }
        ((SingleWebView) mo55669a((int) R.id.eu)).reload();
    }

    public Activity getActivity() {
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C52711k.m112236a((Object) context, "context.baseContext");
        }
        return null;
    }

    public C27177g getCrossPlatformBusiness() {
        if (this.f71979e != null) {
            C27114h hVar = this.f71979e;
            if (hVar == null) {
                C52711k.m112234a();
            }
            C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
            C52711k.m112236a((Object) crossPlatformBusiness, "iCrossPlatformActivityCo…r!!.crossPlatformBusiness");
            return crossPlatformBusiness;
        }
        if (this.f71996v == null) {
            this.f71996v = C27178a.m65596a(this);
        }
        C27177g gVar = this.f71996v;
        if (gVar == null) {
            C52711k.m112234a();
        }
        return gVar;
    }

    public String getCurrentUrl() {
        String str;
        String str2 = this.f71982h;
        if (str2 == null) {
            str2 = "";
        }
        if (C52830p.m112455b((CharSequence) str2, (CharSequence) "wallet/home", false)) {
            return this.f71982h;
        }
        if (this.f71977c == 2) {
            str = this.f71982h;
            if (str == null) {
                C27182a crossPlatformParams = getCrossPlatformParams();
                if (crossPlatformParams != null) {
                    C27195d dVar = crossPlatformParams.f71720c;
                    if (dVar != null) {
                        str = dVar.f71783j;
                    }
                }
                str = null;
            }
            if (str == null) {
                return "";
            }
        } else {
            SingleWebView singleWebView = (SingleWebView) mo55669a((int) R.id.eu);
            C52711k.m112236a((Object) singleWebView, "ame_rn_web_container");
            str = singleWebView.getUrl();
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    /* renamed from: e */
    private final void m65749e() {
        ((DmtStatusView) mo55669a((int) R.id.bhy)).setBuilder(C10719a.m21676a(getContext()));
        C10722c cVar = new C10723a(getContext()).mo19277a((int) R.drawable.dgk).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, new C27291e(this)).f28711a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setStatus(cVar);
        if (C10675b.m21498b(getContext())) {
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            dmtDefaultView.setBackgroundColor(context.getResources().getColor(R.color.aq4));
        } else {
            Context context2 = getContext();
            C52711k.m112236a((Object) context2, "context");
            dmtDefaultView.setBackgroundColor(context2.getResources().getColor(R.color.aq3));
        }
        ((DmtStatusView) mo55669a((int) R.id.abc)).setBuilder(C10719a.m21676a(getContext()).mo19234c((View) dmtDefaultView));
    }

    /* renamed from: b */
    public final void mo55682b(Activity activity) {
        this.f71997w = true;
    }

    public final void setAdditionalReportParams(Map<String, String> map) {
        this.f71995u = map;
    }

    public final void setCurrentMode(int i) {
        this.f71977c = i;
    }

    public final void setCustomWebViewStatus(C27235d dVar) {
        this.f71992r = dVar;
    }

    public final void setDisplayed(boolean z) {
        this.f71986l = z;
    }

    public final void setIFullScreen(C27234c cVar) {
        this.f71991q = cVar;
    }

    public final void setLoadRNViewCompleteTimestamp(long j) {
        this.f71999y = j;
    }

    public final void setSearchEnterParam(C41434a aVar) {
        this.f71984j = aVar;
    }

    public final void setShouldShowProgressBarBg(boolean z) {
        this.f71988n = z;
    }

    public void setFullScreen(C27234c cVar) {
        C52711k.m112240b(cVar, "iFullScreen");
        this.f71991q = cVar;
    }

    /* renamed from: e */
    public void mo55688e(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f71986l = true;
    }

    /* renamed from: f */
    public void mo55689f(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f71986l = false;
    }

    public final void setWebViewTouchListener(OnTouchListener onTouchListener) {
        SingleWebView a = this.f71990p.mo55729a();
        if (a != null) {
            a.setWebviewTouchListener(onTouchListener);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C29906l lVar) {
        C52711k.m112240b(lVar, "broadCastEvent");
        String str = lVar.f78044a;
        JSONObject jSONObject = lVar.f78045b;
        C52711k.m112236a((Object) str, "event");
        mo55677a(str, jSONObject);
    }

    public void setCrossPlatformActivityContainer(C27114h hVar) {
        C52711k.m112240b(hVar, "iCrossPlatformActivityContainer");
        this.f71979e = hVar;
        ((SingleWebView) mo55669a((int) R.id.eu)).setCrossPlatformActivityContainer(hVar);
    }

    public final void setShouldOverrideInterceptor(C52682m<? super WebView, ? super String, Boolean> mVar) {
        C52711k.m112240b(mVar, "interceptor");
        ((SingleWebView) mo55669a((int) R.id.eu)).setShouldOverrideInterceptor(mVar);
    }

    /* renamed from: d */
    public final void mo55687d(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C27140a.m65474a().mo55458b(getCurrentContainer(), this.f71982h, 1);
        mo55677a("viewDisappeared", (JSONObject) null);
        mo55677a("invisible", (JSONObject) null);
        ((SingleWebView) mo55669a((int) R.id.eu)).contextPause();
        mo55675a("onPause");
    }

    /* renamed from: c */
    public final void mo55685c(Activity activity) {
        int i;
        C52711k.m112240b(activity, "activity");
        C27140a.m65474a().mo55457a(getCurrentContainer(), this.f71982h, 1);
        mo55677a("viewAppeared", (JSONObject) null);
        String str = "visible";
        JSONObject jSONObject = new JSONObject();
        String str2 = "code";
        if (this.f71997w) {
            i = 2;
        } else {
            i = 0;
        }
        jSONObject.put(str2, i);
        mo55677a(str, jSONObject);
        this.f71997w = false;
        ((SingleWebView) mo55669a((int) R.id.eu)).contextResume();
        mo55675a("onResume");
    }

    /* renamed from: g */
    public void mo55690g(Activity activity) {
        C27140a.m65474a().mo55458b(getCurrentContainer(), this.f71982h, 2);
        ((SingleWebView) mo55669a((int) R.id.eu)).contextDestroy();
        mo55675a("onDestroy");
        C22521l lVar = this.f71980f;
        if (lVar != null) {
            if (!lVar.f60539c) {
                lVar = null;
            }
            if (lVar != null) {
                C27132a.m65458a().mo55452b(lVar.mo46782a());
            }
        }
        C47718bf.m103291d(this);
        C27124b bVar = this.f71985k;
        CrossPlatformWebView crossPlatformWebView = bVar.f71560b;
        C27302d dVar = bVar;
        C52711k.m112240b(dVar, "listener");
        crossPlatformWebView.f71976b.remove(dVar);
        C47718bf.m103291d(bVar);
    }

    @C53771m
    public final void onEvent(C19748c cVar) {
        boolean z;
        if (cVar != null) {
            CharSequence charSequence = cVar.f54412a;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && C52830p.m112406a(cVar.f54412a, getReactId(), true)) {
                z2 = true;
            }
            if (!z2) {
                cVar = null;
            }
            if (cVar != null) {
                Activity activity = getActivity();
                if (activity != null) {
                    if (!(!activity.isFinishing())) {
                        activity = null;
                    }
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final <T extends C27308i> T mo55670a(Class<T> cls) {
        C52711k.m112240b(cls, "_cls");
        if (C52711k.m112239a((Object) cls, (Object) C27303e.class)) {
            T t = this.f71989o;
            if (t != null) {
                return (C27308i) t;
            }
            throw new C52857u("null cannot be cast to non-null type T");
        } else if (!C52711k.m112239a((Object) cls, (Object) C27309j.class)) {
            return (C27308i) new C27289c();
        } else {
            T t2 = this.f71990p;
            if (t2 != null) {
                return (C27308i) t2;
            }
            throw new C52857u("null cannot be cast to non-null type T");
        }
    }

    /* renamed from: a */
    public final void mo55672a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        mo55675a("onCreate");
    }

    /* renamed from: a */
    private static void m65748a(JSONObject jSONObject, String str, Object obj) {
        if (!C9431p.m18664a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m65747a(String str, boolean z, Map<String, String> map) {
        boolean z2;
        C52711k.m112240b(str, "url");
        this.f71982h = str;
        C27131c a = C27132a.m65458a();
        if (getParent() == null) {
            z2 = false;
        } else {
            z2 = a.mo55451a(str);
        }
        this.f71980f = a.mo55448a(z2);
        C27182a crossPlatformParams = getCrossPlatformParams();
        if (crossPlatformParams != null) {
            C27192b bVar = crossPlatformParams.f71719b;
            if (bVar != null) {
                String str2 = bVar.f71766u;
                if (str2 != null) {
                    C25945k.m62925p().mo53227c(str2);
                }
            }
        }
        if (z) {
            mo55676a(Uri.parse(str).buildUpon().appendQueryParameter("reactId", getReactId()).toString(), map);
        } else {
            mo55676a(str, map);
        }
    }

    public CrossPlatformWebView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f71983i = new C27305g();
        this.f71987m = C52732g.m112285a(C27294h.f72008a);
        this.f71976b = new HashSet();
        this.f71989o = new C27293g(this);
        this.f71990p = new C27295i(this);
        this.f71977c = 1;
        this.f71993s = "RN_VIEW";
        this.f71994t = new C19749d();
        C19749d dVar = this.f71994t;
        dVar.mo41178a(AbsActivityContainer.class, new C27287a(this));
        dVar.mo41178a(C22521l.class, new C27288b(this));
        C27151e.m65508a().mo55463b();
        getLayoutInflater().inflate(R.layout.b87, this, true);
        C47718bf.m103290c(this);
        m65749e();
        ((SingleWebView) mo55669a((int) R.id.eu)).addOnSingleWebViewStatus(new CrossPlatformWebView$initWebView$1(this));
        ((SingleWebView) mo55669a((int) R.id.eu)).addOnWebChromeStatus(new C27292f(this));
        ((LineProgressBarView) mo55669a((int) R.id.eo4)).setColor(getResources().getColor(R.color.b55));
        this.f71985k = new C27124b(this);
        getTimeStatisticsUtils().f71827a = System.currentTimeMillis();
        this.f71999y = -1;
        this.f72000z = -1;
        this.f71974A = new HashSet();
    }

    public /* synthetic */ CrossPlatformWebView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo55671a(int i, int i2, int i3, int i4, int i5) {
        DmtStatusView dmtStatusView = (DmtStatusView) mo55669a((int) R.id.bhy);
        C52711k.m112236a((Object) dmtStatusView, "loading_view");
        LayoutParams layoutParams = dmtStatusView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i2;
            layoutParams2.rightMargin = i4;
            layoutParams2.topMargin = i3;
            layoutParams2.bottomMargin = i5;
            layoutParams2.gravity = i;
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo55669a((int) R.id.bhy);
            C52711k.m112236a((Object) dmtStatusView2, "loading_view");
            dmtStatusView2.setLayoutParams(layoutParams2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public static /* synthetic */ void m65745a(CrossPlatformWebView crossPlatformWebView, String str, boolean z, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        crossPlatformWebView.m65747a(str, z, map);
    }
}
