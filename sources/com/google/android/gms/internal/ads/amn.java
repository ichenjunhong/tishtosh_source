package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C14956aq;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.ads.internal.overlay.C15006c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C15524o;
import com.google.android.gms.common.util.C15525p;
import com.google.android.gms.p1027a.C14882b;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
final class amn extends WebView implements OnGlobalLayoutListener, DownloadListener, ama {

    /* renamed from: A */
    private boolean f40946A;

    /* renamed from: B */
    private C15837do f40947B;

    /* renamed from: C */
    private C15824db f40948C;

    /* renamed from: D */
    private int f40949D;

    /* renamed from: E */
    private C15804ci f40950E;

    /* renamed from: F */
    private C15804ci f40951F;

    /* renamed from: G */
    private C15804ci f40952G;

    /* renamed from: H */
    private C15805cj f40953H;

    /* renamed from: I */
    private WeakReference<OnClickListener> f40954I;

    /* renamed from: J */
    private C15006c f40955J;

    /* renamed from: K */
    private boolean f40956K;

    /* renamed from: L */
    private aer f40957L;

    /* renamed from: M */
    private int f40958M = -1;

    /* renamed from: N */
    private int f40959N = -1;

    /* renamed from: O */
    private int f40960O = -1;

    /* renamed from: P */
    private int f40961P = -1;

    /* renamed from: Q */
    private Map<String, akt> f40962Q;

    /* renamed from: R */
    private final WindowManager f40963R;

    /* renamed from: S */
    private final byc f40964S;

    /* renamed from: a */
    int f40965a;

    /* renamed from: b */
    private final ano f40966b;

    /* renamed from: c */
    private final beh f40967c;

    /* renamed from: d */
    private final zzbgz f40968d;

    /* renamed from: e */
    private final C14956aq f40969e;

    /* renamed from: f */
    private final C14986bt f40970f;

    /* renamed from: g */
    private final DisplayMetrics f40971g;

    /* renamed from: h */
    private final float f40972h;

    /* renamed from: i */
    private boolean f40973i;

    /* renamed from: j */
    private boolean f40974j;

    /* renamed from: k */
    private amb f40975k;

    /* renamed from: l */
    private C15006c f40976l;

    /* renamed from: m */
    private C14882b f40977m;

    /* renamed from: n */
    private anp f40978n;

    /* renamed from: o */
    private String f40979o;

    /* renamed from: p */
    private boolean f40980p;

    /* renamed from: q */
    private boolean f40981q;

    /* renamed from: r */
    private boolean f40982r;

    /* renamed from: s */
    private boolean f40983s;

    /* renamed from: t */
    private Boolean f40984t;

    /* renamed from: u */
    private int f40985u;

    /* renamed from: v */
    private boolean f40986v = true;

    /* renamed from: w */
    private boolean f40987w;

    /* renamed from: x */
    private String f40988x = "";

    /* renamed from: y */
    private ams f40989y;

    /* renamed from: z */
    private boolean f40990z;

    /* renamed from: a */
    public final ahs mo28930a() {
        return null;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    amn(ano ano, anp anp, String str, boolean z, boolean z2, beh beh, zzbgz zzbgz, C15806ck ckVar, C14956aq aqVar, C14986bt btVar, byc byc) {
        super(ano);
        this.f40966b = ano;
        this.f40978n = anp;
        this.f40979o = str;
        this.f40982r = z;
        this.f40985u = -1;
        this.f40967c = beh;
        this.f40968d = zzbgz;
        this.f40969e = aqVar;
        this.f40970f = btVar;
        this.f40963R = (WindowManager) getContext().getSystemService("window");
        this.f40971g = acd.m32572a(this.f40963R);
        this.f40972h = this.f40971g.density;
        this.f40964S = byc;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            abv.m32793b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C14963ax.m30831a().mo28665a((Context) ano, zzbgz.f46237a, settings);
        C14963ax.m30832b().mo28692a(getContext(), settings);
        setDownloadListener(this);
        m33423Q();
        if (C15524o.m32295c()) {
            addJavascriptInterface(amv.m33632a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f40957L = new aer(this.f40966b.f41060a, this, this, null);
        m33428V();
        this.f40953H = new C15805cj(new C15806ck(true, "make_wv", this.f40979o));
        this.f40953H.f44780b.mo30899a(ckVar);
        this.f40951F = C15799cd.m37135a(this.f40953H.f44780b);
        this.f40953H.mo30896a("native:view_create", this.f40951F);
        this.f40952G = null;
        this.f40950E = null;
        C14963ax.m30832b().mo28695b((Context) ano);
        C14963ax.m30834d().mo28593d();
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof amb) {
            this.f40975k = (amb) webViewClient;
        }
    }

    /* renamed from: e */
    public final C14986bt mo28939e() {
        return this.f40970f;
    }

    /* renamed from: M */
    private final boolean m33419M() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f40975k.mo29216b() && !this.f40975k.mo29217c()) {
            return false;
        }
        int b = aes.m32759b(this.f40971g, this.f40971g.widthPixels);
        int b2 = aes.m32759b(this.f40971g, this.f40971g.heightPixels);
        Activity activity = this.f40966b.f41060a;
        if (activity == null || activity.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            int[] a = acd.m32594a(activity);
            int b3 = aes.m32759b(this.f40971g, a[0]);
            i = aes.m32759b(this.f40971g, a[1]);
            i2 = b3;
        }
        if (this.f40959N == b && this.f40958M == b2 && this.f40960O == i2 && this.f40961P == i) {
            return false;
        }
        if (!(this.f40959N == b && this.f40958M == b2)) {
            z = true;
        }
        this.f40959N = b;
        this.f40958M = b2;
        this.f40960O = i2;
        this.f40961P = i;
        new C16217rp(this).mo31365a(b, b2, i2, i, this.f40971g.density, this.f40963R.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final void mo29242a(String str, Map<String, ?> map) {
        try {
            mo29243a(str, C14963ax.m30831a().mo28664a(map));
        } catch (JSONException unused) {
            abv.m32798e("Could not convert parameters to JSON.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo29139C()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            r0 = 0
            com.google.android.gms.internal.ads.afc.m32797d(r2, r0)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r3.onReceiveValue(r0)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.amn.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: c */
    private final synchronized void m33433c(String str) {
        if (!mo29139C()) {
            loadUrl(str);
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo29139C()) {
            try {
                amo.m33507a(this, str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                C14963ax.m30834d().mo28588a(e, "AdWebViewImpl.loadUrl");
                abv.m32795c("Could not call loadUrl. ", e);
            }
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: e */
    private final synchronized void m33434e(String str) {
        try {
            amo.m33507a(this, str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            C14963ax.m30834d().mo28588a(e, "AdWebViewImpl.loadUrlUnsafe");
            abv.m32795c("Could not call loadUrl. ", e);
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo29139C()) {
            super.loadData(str, str2, str3);
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo29139C()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo29158a(String str, String str2, String str3) {
        if (!mo29139C()) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44261av)).booleanValue()) {
                str2 = ane.m33646a(str2, ane.m33645a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        abv.m32798e("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: a */
    private final synchronized void m33432a(String str, ValueCallback<String> valueCallback) {
        if (!mo29139C()) {
            evaluateJavascript(str, null);
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: f */
    private final void m33435f(String str) {
        if (C15524o.m32297e()) {
            if (m33421O() == null) {
                m33420N();
            }
            if (m33421O().booleanValue()) {
                m33432a(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            m33433c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        String str3 = "javascript:";
        String valueOf2 = String.valueOf(str);
        m33433c(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
    }

    /* renamed from: d */
    public final void mo29248d(String str) {
        m33435f(str);
    }

    /* renamed from: N */
    private final synchronized void m33420N() {
        this.f40984t = C14963ax.m30834d().mo28590b();
        if (this.f40984t == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m33431a(Boolean.valueOf(true));
            } catch (IllegalStateException unused) {
                m33431a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    private final void m33431a(Boolean bool) {
        synchronized (this) {
            this.f40984t = bool;
        }
        C14963ax.m30834d().mo28587a(bool);
    }

    /* renamed from: O */
    private final synchronized Boolean m33421O() {
        return this.f40984t;
    }

    /* renamed from: b */
    public final void mo29247b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        m33435f(sb.toString());
    }

    /* renamed from: a */
    public final void mo29243a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        abv.m32792b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        m33435f(sb.toString());
    }

    /* renamed from: o */
    public final void mo29181o() {
        m33422P();
        HashMap hashMap = new HashMap(1);
        hashMap.put(C42311c.f106863g, this.f40968d.f46237a);
        mo29242a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo29149a(int i) {
        if (i == 0) {
            C15799cd.m37136a(this.f40953H.f44780b, this.f40951F, "aebb2");
        }
        m33422P();
        if (this.f40953H.f44780b != null) {
            this.f40953H.f44780b.mo30900a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(C42311c.f106863g, this.f40968d.f46237a);
        mo29242a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: P */
    private final void m33422P() {
        C15799cd.m37136a(this.f40953H.f44780b, this.f40951F, "aeh2");
    }

    /* renamed from: p */
    public final void mo29184p() {
        if (this.f40950E == null) {
            C15799cd.m37136a(this.f40953H.f44780b, this.f40951F, "aes2");
            this.f40950E = C15799cd.m37135a(this.f40953H.f44780b);
            this.f40953H.mo30896a("native:view_show", this.f40950E);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(C42311c.f106863g, this.f40968d.f46237a);
        mo29242a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: q */
    public final void mo29185q() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C14963ax.m30835e().mo28703b()));
        hashMap.put("app_volume", String.valueOf(C14963ax.m30835e().mo28700a()));
        hashMap.put("device_volume", String.valueOf(acy.m32672a(getContext())));
        mo29242a("volume", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo28935a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        mo29242a("onCacheAccessComplete", (Map<String, ?>) hashMap);
    }

    /* renamed from: s */
    public final synchronized C15006c mo29187s() {
        return this.f40976l;
    }

    /* renamed from: A */
    public final synchronized C14882b mo29137A() {
        return this.f40977m;
    }

    /* renamed from: t */
    public final synchronized C15006c mo29194t() {
        return this.f40955J;
    }

    /* renamed from: u */
    public final synchronized anp mo29195u() {
        return this.f40978n;
    }

    /* renamed from: v */
    public final synchronized String mo29196v() {
        return this.f40979o;
    }

    /* renamed from: x */
    public final WebViewClient mo29198x() {
        return this.f40975k;
    }

    /* renamed from: y */
    public final synchronized boolean mo29199y() {
        return this.f40980p;
    }

    /* renamed from: z */
    public final beh mo29200z() {
        return this.f40967c;
    }

    /* renamed from: k */
    public final zzbgz mo28944k() {
        return this.f40968d;
    }

    /* renamed from: B */
    public final synchronized boolean mo29138B() {
        return this.f40982r;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            acd.m32581a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            abv.m32792b(sb.toString());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40975k.mo29217c()) {
            synchronized (this) {
                if (this.f40947B != null) {
                    this.f40947B.mo30980a(motionEvent);
                }
            }
        } else if (this.f40967c != null) {
            this.f40967c.mo30080a(motionEvent);
        }
        if (mo29139C()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() != 8 || ((axisValue <= 0.0f || canScrollVertically(-1)) && ((axisValue >= 0.0f || canScrollVertically(1)) && ((axisValue2 <= 0.0f || canScrollHorizontally(-1)) && (axisValue2 >= 0.0f || canScrollHorizontally(1)))))) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d7 A[SYNTHETIC, Splitter:B:112:0x01d7] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:122:0x01fa=Splitter:B:122:0x01fa, B:64:0x00de=Splitter:B:64:0x00de} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo29139C()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r7.f40982r     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            com.google.android.gms.internal.ads.anp r0 = r7.f40978n     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo29367f()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0021
            goto L_0x01fa
        L_0x0021:
            com.google.android.gms.internal.ads.anp r0 = r7.f40978n     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo29369h()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.anp r0 = r7.f40978n     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo29368g()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15740bx.f44286bT     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.mo30717a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.ams r0 = r7.mo28936b()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo29070g()     // Catch:{ all -> 0x01ff }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            float r1 = (float) r9     // Catch:{ all -> 0x01ff }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01ff }
            float r2 = (float) r8     // Catch:{ all -> 0x01ff }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01ff }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01ff }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01ff }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01ff }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.anp r0 = r7.f40978n     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo29365d()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15740bx.f44289bW     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.mo30717a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.C15524o.m32295c()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.amp r1 = new com.google.android.gms.internal.ads.amp     // Catch:{ all -> 0x01ff }
            r1.<init>(r7)     // Catch:{ all -> 0x01ff }
            r7.mo29157a(r0, r1)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.m33435f(r0)     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r0 = r7.f40971g     // Catch:{ all -> 0x01ff }
            float r0 = r0.density     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r1 = r7.f40965a     // Catch:{ all -> 0x01ff }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            int r9 = r7.f40965a     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.anp r0 = r7.f40978n     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo29366e()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f40971g     // Catch:{ all -> 0x01ff }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r9 = r7.f40971g     // Catch:{ all -> 0x01ff }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0118
            if (r0 != r3) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r8
        L_0x0119:
            if (r2 == r4) goto L_0x011d
            if (r2 != r3) goto L_0x011e
        L_0x011d:
            r5 = r9
        L_0x011e:
            com.google.android.gms.internal.ads.anp r2 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r2 = r2.f41064b     // Catch:{ all -> 0x01ff }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.anp r2 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r2 = r2.f41063a     // Catch:{ all -> 0x01ff }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15740bx.f44336cQ     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bu r6 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x01ff }
            java.lang.Object r4 = r6.mo30717a(r4)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01ff }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r4 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.anp r4 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r4 = r4.f41064b     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r6 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r6 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            com.google.android.gms.internal.ads.anp r0 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r0 = r0.f41063a     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r2 == 0) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r0 = r2
        L_0x0168:
            r2 = 8
            if (r0 == 0) goto L_0x01d7
            com.google.android.gms.internal.ads.anp r0 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r0 = r0.f41064b     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.anp r4 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r4 = r4.f41063a     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01ff }
            float r8 = (float) r8     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40972h     // Catch:{ all -> 0x01ff }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ff }
            r6.<init>(r5)     // Catch:{ all -> 0x01ff }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01ff }
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r4)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            r6.append(r9)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.abv.m32798e(r8)     // Catch:{ all -> 0x01ff }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01c5
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01ff }
        L_0x01c5:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            boolean r8 = r7.f40973i     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01f8
            com.google.android.gms.internal.ads.byc r8 = r7.f40964S     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bye$a$b r9 = com.google.android.gms.internal.ads.bye.C15742a.C15744b.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01ff }
            r8.mo30861a(r9)     // Catch:{ all -> 0x01ff }
            r7.f40973i = r3     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01d7:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01e0
            r7.setVisibility(r1)     // Catch:{ all -> 0x01ff }
        L_0x01e0:
            boolean r8 = r7.f40974j     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01ed
            com.google.android.gms.internal.ads.byc r8 = r7.f40964S     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bye$a$b r9 = com.google.android.gms.internal.ads.bye.C15742a.C15744b.BANNER_SIZE_VALID     // Catch:{ all -> 0x01ff }
            r8.mo30861a(r9)     // Catch:{ all -> 0x01ff }
            r7.f40974j = r3     // Catch:{ all -> 0x01ff }
        L_0x01ed:
            com.google.android.gms.internal.ads.anp r8 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r8 = r8.f41064b     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.anp r9 = r7.f40978n     // Catch:{ all -> 0x01ff }
            int r9 = r9.f41063a     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
        L_0x01f8:
            monitor-exit(r7)
            return
        L_0x01fa:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01ff:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.amn.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean M = m33419M();
        C15006c s = mo29187s();
        if (s != null && M) {
            s.mo27690o();
        }
    }

    /* renamed from: a */
    public final synchronized void mo29152a(C15006c cVar) {
        this.f40976l = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo29151a(C14882b bVar) {
        this.f40977m = bVar;
    }

    /* renamed from: b */
    public final synchronized void mo29159b(C15006c cVar) {
        this.f40955J = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo29153a(anp anp) {
        this.f40978n = anp;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo29162b(boolean z) {
        boolean z2 = z != this.f40982r;
        this.f40982r = z;
        m33423Q();
        if (z2) {
            new C16217rp(this).mo31367b(z ? "expanded" : "default");
        }
    }

    /* renamed from: H */
    public final void mo29144H() {
        this.f40957L.mo28757a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo29139C()) {
            this.f40957L.mo28759c();
        }
        boolean z = this.f40990z;
        if (this.f40975k != null && this.f40975k.mo29217c()) {
            if (!this.f40946A) {
                OnGlobalLayoutListener d = this.f40975k.mo29218d();
                if (d != null) {
                    agu.m32860a((View) this, d);
                }
                OnScrollChangedListener e = this.f40975k.mo29219e();
                if (e != null) {
                    agu.m32861a((View) this, e);
                }
                this.f40946A = true;
            }
            m33419M();
            z = true;
        }
        m33436g(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo29139C()) {
                this.f40957L.mo28760d();
            }
            super.onDetachedFromWindow();
            if (this.f40946A && this.f40975k != null && this.f40975k.mo29217c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f40975k.mo29218d();
                if (d != null) {
                    C14963ax.m30832b().mo28690a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f40975k.mo29219e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f40946A = false;
            }
        }
        m33436g(false);
    }

    /* renamed from: a */
    public final void mo29150a(Context context) {
        this.f40966b.setBaseContext(context);
        this.f40957L.f40370a = this.f40966b.f41060a;
    }

    /* renamed from: c */
    public final synchronized void mo29163c(boolean z) {
        if (this.f40976l != null) {
            this.f40976l.mo27675a(this.f40975k.mo29216b(), z);
        } else {
            this.f40980p = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f40985u;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f40985u = i;
        if (this.f40976l != null) {
            this.f40976l.mo27670a(this.f40985u);
        }
    }

    /* renamed from: d */
    public final Activity mo28938d() {
        return this.f40966b.f41060a;
    }

    /* renamed from: r */
    public final Context mo29186r() {
        return this.f40966b.f41061b;
    }

    /* renamed from: Q */
    private final synchronized void m33423Q() {
        if (!this.f40982r) {
            if (!this.f40978n.mo29366e()) {
                if (VERSION.SDK_INT < 18) {
                    abv.m32792b("Disabling hardware acceleration on an AdView.");
                    m33424R();
                    return;
                }
                abv.m32792b("Enabling hardware acceleration on an AdView.");
                m33425S();
                return;
            }
        }
        abv.m32792b("Enabling hardware acceleration on an overlay.");
        m33425S();
    }

    /* renamed from: R */
    private final synchronized void m33424R() {
        if (!this.f40983s) {
            setLayerType(1, null);
        }
        this.f40983s = true;
    }

    /* renamed from: S */
    private final synchronized void m33425S() {
        if (this.f40983s) {
            setLayerType(0, null);
        }
        this.f40983s = false;
    }

    public final synchronized void destroy() {
        m33428V();
        this.f40957L.mo28758b();
        if (this.f40976l != null) {
            this.f40976l.mo27669a();
            this.f40976l.mo27686k();
            this.f40976l = null;
        }
        this.f40977m = null;
        this.f40975k.mo29225k();
        if (!this.f40981q) {
            aks.m33177a(this);
            m33427U();
            this.f40981q = true;
            abv.m32494a("Initiating WebView self destruct sequence in 3...");
            abv.m32494a("Loading blank page in WebView, 2...");
            m33434e(QuickShopBusiness.f64351b);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f40981q) {
                    this.f40975k.mo29225k();
                    aks.m33177a(this);
                    m33427U();
                    m33426T();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: D */
    public final synchronized void mo29140D() {
        abv.m32494a("Destroying WebView!");
        m33426T();
        acd.f40245a.post(new amr(this));
    }

    /* renamed from: T */
    private final synchronized void m33426T() {
        if (!this.f40956K) {
            this.f40956K = true;
            C14963ax.m30834d().mo28594e();
        }
    }

    /* renamed from: C */
    public final synchronized boolean mo29139C() {
        return this.f40981q;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!mo29139C()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (!(this.f40975k == null || this.f40975k.f40898f == null)) {
                    this.f40975k.f40898f.mo27629a();
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo29145I() {
        if (this.f40952G == null) {
            this.f40952G = C15799cd.m37135a(this.f40953H.f44780b);
            this.f40953H.mo30896a("native:view_load", this.f40952G);
        }
    }

    public final void onPause() {
        if (!mo29139C()) {
            try {
                super.onPause();
            } catch (Exception e) {
                abv.m32793b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo29139C()) {
            try {
                super.onResume();
            } catch (Exception e) {
                abv.m32793b("Could not resume webview.", e);
            }
        }
    }

    /* renamed from: L */
    public final void mo29148L() {
        abv.m32494a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo29167f(boolean z) {
        this.f40975k.f40900h = z;
    }

    public final void stopLoading() {
        if (!mo29139C()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                abv.m32793b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo29164d(boolean z) {
        this.f40986v = z;
    }

    /* renamed from: E */
    public final synchronized boolean mo29141E() {
        return this.f40986v;
    }

    /* renamed from: F */
    public final synchronized boolean mo29142F() {
        return this.f40987w;
    }

    /* renamed from: C_ */
    public final synchronized void mo27548C_() {
        this.f40987w = true;
        if (this.f40969e != null) {
            this.f40969e.mo27548C_();
        }
    }

    /* renamed from: D_ */
    public final synchronized void mo27549D_() {
        this.f40987w = false;
        if (this.f40969e != null) {
            this.f40969e.mo27549D_();
        }
    }

    /* renamed from: U */
    private final synchronized void m33427U() {
        if (this.f40962Q != null) {
            for (akt b : this.f40962Q.values()) {
                b.mo28127b();
            }
        }
        this.f40962Q = null;
    }

    /* renamed from: a */
    public final synchronized void mo28933a(String str, akt akt) {
        if (this.f40962Q == null) {
            this.f40962Q = new HashMap();
        }
        this.f40962Q.put(str, akt);
    }

    /* renamed from: a */
    public final synchronized akt mo28931a(String str) {
        if (this.f40962Q == null) {
            return null;
        }
        return (akt) this.f40962Q.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo29160b(String str) {
        if (str == null) {
            str = "";
        }
        this.f40988x = str;
    }

    /* renamed from: g */
    public final synchronized String mo28941g() {
        return this.f40988x;
    }

    /* renamed from: n */
    public final synchronized void mo28947n() {
        if (this.f40948C != null) {
            this.f40948C.mo30917a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo29154a(C15824db dbVar) {
        this.f40948C = dbVar;
    }

    /* renamed from: c */
    public final C15804ci mo28937c() {
        return this.f40951F;
    }

    /* renamed from: j */
    public final C15805cj mo28943j() {
        return this.f40953H;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f40954I = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f40954I.get();
    }

    /* renamed from: a */
    public final synchronized void mo29155a(C15837do doVar) {
        this.f40947B = doVar;
    }

    /* renamed from: J */
    public final synchronized C15837do mo29146J() {
        return this.f40947B;
    }

    /* renamed from: b */
    public final synchronized ams mo28936b() {
        return this.f40989y;
    }

    /* renamed from: a */
    public final synchronized void mo28932a(ams ams) {
        if (this.f40989y != null) {
            abv.m32794c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f40989y = ams;
        }
    }

    /* renamed from: G */
    public final synchronized boolean mo29143G() {
        return this.f40949D > 0;
    }

    /* renamed from: e */
    public final synchronized void mo29166e(boolean z) {
        this.f40949D += z ? 1 : -1;
        if (this.f40949D <= 0 && this.f40976l != null) {
            this.f40976l.mo27692q();
        }
    }

    /* renamed from: V */
    private final void m33428V() {
        if (this.f40953H != null) {
            C15806ck ckVar = this.f40953H.f44780b;
            if (!(ckVar == null || C14963ax.m30834d().mo28585a() == null)) {
                C14963ax.m30834d().mo28585a().mo30890a(ckVar);
            }
        }
    }

    /* renamed from: K */
    public final void mo29147K() {
        setBackgroundColor(0);
    }

    /* renamed from: a */
    public final void mo28934a(boolean z) {
        this.f40975k.f40897e = z;
    }

    /* renamed from: f */
    public final void mo28940f() {
        C15006c s = mo29187s();
        if (s != null) {
            s.mo27691p();
        }
    }

    /* renamed from: l */
    public final int mo28945l() {
        return getMeasuredHeight();
    }

    /* renamed from: m */
    public final int mo28946m() {
        return getMeasuredWidth();
    }

    /* renamed from: a */
    public final void mo29241a(zzc zzc) {
        this.f40975k.mo29206a(zzc);
    }

    /* renamed from: a */
    public final void mo29244a(boolean z, int i) {
        this.f40975k.mo29213a(z, i);
    }

    /* renamed from: a */
    public final void mo29245a(boolean z, int i, String str) {
        this.f40975k.mo29214a(z, i, str);
    }

    /* renamed from: a */
    public final void mo29246a(boolean z, int i, String str, String str2) {
        this.f40975k.mo29215a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo28549a(bvv bvv) {
        synchronized (this) {
            this.f40990z = bvv.f44078a;
        }
        m33436g(bvv.f44078a);
    }

    /* renamed from: g */
    private final void m33436g(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo29242a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo29157a(String str, C15948hq<? super ama> hqVar) {
        if (this.f40975k != null) {
            this.f40975k.mo29212a(str, hqVar);
        }
    }

    /* renamed from: b */
    public final void mo29161b(String str, C15948hq<? super ama> hqVar) {
        if (this.f40975k != null) {
            amb amb = this.f40975k;
            synchronized (amb.f40895c) {
                List list = (List) amb.f40894b.get(str);
                if (list != null) {
                    list.remove(hqVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo29156a(String str, C15525p<C15948hq<? super ama>> pVar) {
        if (this.f40975k != null) {
            amb amb = this.f40975k;
            synchronized (amb.f40895c) {
                List<C15948hq> list = (List) amb.f40894b.get(str);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (C15948hq hqVar : list) {
                        if (pVar.mo28526a(hqVar)) {
                            arrayList.add(hqVar);
                        }
                    }
                    list.removeAll(arrayList);
                }
            }
        }
    }

    /* renamed from: w */
    public final /* synthetic */ anj mo29197w() {
        return this.f40975k;
    }
}
