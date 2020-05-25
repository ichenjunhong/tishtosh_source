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
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C14956aq;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C15006c;
import com.google.android.gms.ads.internal.overlay.C15017n;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C15524o;
import com.google.android.gms.common.util.C15525p;
import com.google.android.gms.p1027a.C14882b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

@C16299uq
final class any extends aod implements OnGlobalLayoutListener, DownloadListener, ama, C16046lg {

    /* renamed from: A */
    private C15804ci f41113A;

    /* renamed from: B */
    private C15805cj f41114B;

    /* renamed from: C */
    private WeakReference<OnClickListener> f41115C;

    /* renamed from: D */
    private C15006c f41116D;

    /* renamed from: E */
    private aer f41117E;

    /* renamed from: F */
    private final AtomicReference<C14882b> f41118F = new AtomicReference<>();

    /* renamed from: G */
    private int f41119G = -1;

    /* renamed from: H */
    private int f41120H = -1;

    /* renamed from: I */
    private int f41121I = -1;

    /* renamed from: J */
    private int f41122J = -1;

    /* renamed from: K */
    private Map<String, akt> f41123K;

    /* renamed from: L */
    private final WindowManager f41124L;

    /* renamed from: a */
    int f41125a;

    /* renamed from: b */
    private final ano f41126b;

    /* renamed from: c */
    private final anq f41127c;

    /* renamed from: d */
    private final beh f41128d;

    /* renamed from: e */
    private final zzbgz f41129e;

    /* renamed from: f */
    private final C14956aq f41130f;

    /* renamed from: g */
    private final C14986bt f41131g;

    /* renamed from: h */
    private final DisplayMetrics f41132h;

    /* renamed from: i */
    private C15006c f41133i;

    /* renamed from: j */
    private anp f41134j;

    /* renamed from: k */
    private String f41135k;

    /* renamed from: l */
    private boolean f41136l;

    /* renamed from: m */
    private boolean f41137m;

    /* renamed from: n */
    private boolean f41138n;

    /* renamed from: o */
    private int f41139o;

    /* renamed from: p */
    private boolean f41140p = true;

    /* renamed from: q */
    private boolean f41141q;

    /* renamed from: r */
    private String f41142r = "";

    /* renamed from: s */
    private ams f41143s;

    /* renamed from: t */
    private boolean f41144t;

    /* renamed from: u */
    private boolean f41145u;

    /* renamed from: v */
    private C15837do f41146v;

    /* renamed from: w */
    private C15824db f41147w;

    /* renamed from: x */
    private int f41148x;

    /* renamed from: y */
    private C15804ci f41149y;

    /* renamed from: z */
    private C15804ci f41150z;

    protected any(ano ano, anq anq, anp anp, String str, boolean z, boolean z2, beh beh, zzbgz zzbgz, C15806ck ckVar, C14956aq aqVar, C14986bt btVar) {
        super(ano, anq);
        this.f41126b = ano;
        this.f41127c = anq;
        this.f41134j = anp;
        this.f41135k = str;
        this.f41137m = z;
        this.f41139o = -1;
        this.f41128d = beh;
        this.f41129e = zzbgz;
        this.f41130f = aqVar;
        this.f41131g = btVar;
        this.f41124L = (WindowManager) getContext().getSystemService("window");
        this.f41132h = acd.m32572a(this.f41124L);
        this.f41117E = new aer(this.f41126b.f41060a, this, this, null);
        C14963ax.m30831a().mo28665a((Context) ano, zzbgz.f46237a, getSettings());
        setDownloadListener(this);
        m33721P();
        if (C15524o.m32295c()) {
            addJavascriptInterface(amv.m33632a(this), "googleAdsJsInterface");
        }
        m33725T();
        this.f41114B = new C15805cj(new C15806ck(true, "make_wv", this.f41135k));
        this.f41114B.f44780b.mo30899a(ckVar);
        this.f41150z = C15799cd.m37135a(this.f41114B.f44780b);
        this.f41114B.mo30896a("native:view_create", this.f41150z);
        this.f41113A = null;
        this.f41149y = null;
        C14963ax.m30832b().mo28695b((Context) ano);
    }

    /* renamed from: D */
    public final void mo29140D() {
    }

    /* renamed from: a */
    public final ahs mo28930a() {
        return null;
    }

    /* renamed from: a */
    public final void mo29386a(String str, String str2) {
        C16047lh.m38005a((C16046lg) this, str, str2);
    }

    /* renamed from: a */
    public final void mo29242a(String str, Map map) {
        C16047lh.m38006a((C16046lg) this, str, map);
    }

    /* renamed from: a */
    public final void mo29243a(String str, JSONObject jSONObject) {
        C16047lh.m38008b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo29247b(String str, JSONObject jSONObject) {
        C16047lh.m38007a((C16046lg) this, str, jSONObject);
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: e */
    public final C14986bt mo28939e() {
        return this.f41131g;
    }

    /* renamed from: N */
    private final boolean m33719N() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f41127c.mo29216b() && !this.f41127c.mo29375c()) {
            return false;
        }
        int b = aes.m32759b(this.f41132h, this.f41132h.widthPixels);
        int b2 = aes.m32759b(this.f41132h, this.f41132h.heightPixels);
        Activity activity = this.f41126b.f41060a;
        if (activity == null || activity.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            int[] a = acd.m32594a(activity);
            int b3 = aes.m32759b(this.f41132h, a[0]);
            i = aes.m32759b(this.f41132h, a[1]);
            i2 = b3;
        }
        if (this.f41120H == b && this.f41119G == b2 && this.f41121I == i2 && this.f41122J == i) {
            return false;
        }
        if (!(this.f41120H == b && this.f41119G == b2)) {
            z = true;
        }
        this.f41120H = b;
        this.f41119G = b2;
        this.f41121I = i2;
        this.f41122J = i;
        new C16217rp(this).mo31365a(b, b2, i2, i, this.f41132h.density, this.f41124L.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo29158a(String str, String str2, String str3) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44261av)).booleanValue()) {
            str2 = ane.m33646a(str2, ane.m33645a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    /* renamed from: d */
    public final synchronized void mo29248d(String str) {
        if (!mo29408C()) {
            super.mo29248d(str);
        } else {
            abv.m32798e("The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: o */
    public final void mo29181o() {
        m33720O();
        HashMap hashMap = new HashMap(1);
        hashMap.put(C42311c.f106863g, this.f41129e.f46237a);
        C16047lh.m38006a((C16046lg) this, "onhide", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo29149a(int i) {
        if (i == 0) {
            C15799cd.m37136a(this.f41114B.f44780b, this.f41150z, "aebb2");
        }
        m33720O();
        if (this.f41114B.f44780b != null) {
            this.f41114B.f44780b.mo30900a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(C42311c.f106863g, this.f41129e.f46237a);
        C16047lh.m38006a((C16046lg) this, "onhide", (Map) hashMap);
    }

    /* renamed from: O */
    private final void m33720O() {
        C15799cd.m37136a(this.f41114B.f44780b, this.f41150z, "aeh2");
    }

    /* renamed from: p */
    public final void mo29184p() {
        if (this.f41149y == null) {
            C15799cd.m37136a(this.f41114B.f44780b, this.f41150z, "aes2");
            this.f41149y = C15799cd.m37135a(this.f41114B.f44780b);
            this.f41114B.mo30896a("native:view_show", this.f41149y);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(C42311c.f106863g, this.f41129e.f46237a);
        C16047lh.m38006a((C16046lg) this, "onshow", (Map) hashMap);
    }

    /* renamed from: q */
    public final void mo29185q() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C14963ax.m30835e().mo28703b()));
        hashMap.put("app_volume", String.valueOf(C14963ax.m30835e().mo28700a()));
        hashMap.put("device_volume", String.valueOf(acy.m32672a(getContext())));
        C16047lh.m38006a((C16046lg) this, "volume", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo28935a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        C16047lh.m38006a((C16046lg) this, "onCacheAccessComplete", (Map) hashMap);
    }

    /* renamed from: s */
    public final synchronized C15006c mo29187s() {
        return this.f41133i;
    }

    /* renamed from: A */
    public final C14882b mo29137A() {
        return (C14882b) this.f41118F.get();
    }

    /* renamed from: t */
    public final synchronized C15006c mo29194t() {
        return this.f41116D;
    }

    /* renamed from: u */
    public final synchronized anp mo29195u() {
        return this.f41134j;
    }

    /* renamed from: v */
    public final synchronized String mo29196v() {
        return this.f41135k;
    }

    /* renamed from: x */
    public final WebViewClient mo29198x() {
        return this.f41127c;
    }

    /* renamed from: y */
    public final synchronized boolean mo29199y() {
        return this.f41136l;
    }

    /* renamed from: z */
    public final beh mo29200z() {
        return this.f41128d;
    }

    /* renamed from: k */
    public final zzbgz mo28944k() {
        return this.f41129e;
    }

    /* renamed from: B */
    public final synchronized boolean mo29138B() {
        return this.f41137m;
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
        if (this.f41127c.mo29375c()) {
            synchronized (this) {
                if (this.f41146v != null) {
                    this.f41146v.mo30980a(motionEvent);
                }
            }
        } else if (this.f41128d != null) {
            this.f41128d.mo30080a(motionEvent);
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
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8 A[SYNTHETIC, Splitter:B:109:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00de=Splitter:B:64:0x00de, B:116:0x01ee=Splitter:B:116:0x01ee} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo29408C()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r7.f41137m     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            com.google.android.gms.internal.ads.anp r0 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo29367f()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01ee
        L_0x0021:
            com.google.android.gms.internal.ads.anp r0 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo29369h()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.anp r0 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo29368g()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15740bx.f44286bT     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.mo30717a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.ams r0 = r7.mo28936b()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo29070g()     // Catch:{ all -> 0x01f3 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
            float r1 = (float) r9     // Catch:{ all -> 0x01f3 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r8     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01f3 }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01f3 }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01f3 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.anp r0 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo29365d()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15740bx.f44289bW     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.mo30717a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.C15524o.m32295c()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.anz r1 = new com.google.android.gms.internal.ads.anz     // Catch:{ all -> 0x01f3 }
            r1.<init>(r7)     // Catch:{ all -> 0x01f3 }
            r7.mo29157a(r0, r1)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.mo29248d(r0)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r0 = r7.f41125a     // Catch:{ all -> 0x01f3 }
            r1 = -1
            if (r0 == r1) goto L_0x00d5
            int r9 = r7.f41125a     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r0 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r0 = r0.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.anp r0 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo29366e()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r9 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
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
            com.google.android.gms.internal.ads.anp r2 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f41064b     // Catch:{ all -> 0x01f3 }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.anp r2 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f41063a     // Catch:{ all -> 0x01f3 }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15740bx.f44336cQ     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.bu r6 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r4 = r6.mo30717a(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01f3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.anp r4 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r4 = r4.f41064b     // Catch:{ all -> 0x01f3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.anp r0 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r0 = r0.f41063a     // Catch:{ all -> 0x01f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r5 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r5 = r5.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.anp r2 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f41064b     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r2     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r3 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r3 = r3.density     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.anp r3 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r3 = r3.f41063a     // Catch:{ all -> 0x01f3 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01f3 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f41132h     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r5.<init>(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01f3 }
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r3)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            r5.append(r9)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.abv.m32798e(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01d3
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01f3 }
        L_0x01d3:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01d8:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01e1
            r7.setVisibility(r1)     // Catch:{ all -> 0x01f3 }
        L_0x01e1:
            com.google.android.gms.internal.ads.anp r8 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r8 = r8.f41064b     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.anp r9 = r7.f41134j     // Catch:{ all -> 0x01f3 }
            int r9 = r9.f41063a     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01ee:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01f3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.any.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean N = m33719N();
        C15006c s = mo29187s();
        if (s != null && N) {
            s.mo27690o();
        }
    }

    /* renamed from: a */
    public final synchronized void mo29152a(C15006c cVar) {
        this.f41133i = cVar;
    }

    /* renamed from: a */
    public final void mo29151a(C14882b bVar) {
        this.f41118F.set(bVar);
    }

    /* renamed from: b */
    public final synchronized void mo29159b(C15006c cVar) {
        this.f41116D = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo29153a(anp anp) {
        this.f41134j = anp;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo29162b(boolean z) {
        boolean z2 = z != this.f41137m;
        this.f41137m = z;
        m33721P();
        if (z2) {
            new C16217rp(this).mo31367b(z ? "expanded" : "default");
        }
    }

    /* renamed from: H */
    public final void mo29144H() {
        this.f41117E.mo28757a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo29408C()) {
            this.f41117E.mo28759c();
        }
        boolean z = this.f41144t;
        if (this.f41127c != null && this.f41127c.mo29375c()) {
            if (!this.f41145u) {
                OnGlobalLayoutListener d = this.f41127c.mo29377d();
                if (d != null) {
                    agu.m32860a((View) this, d);
                }
                OnScrollChangedListener e = this.f41127c.mo29379e();
                if (e != null) {
                    agu.m32861a((View) this, e);
                }
                this.f41145u = true;
            }
            m33719N();
            z = true;
        }
        m33726h(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo29408C()) {
                this.f41117E.mo28760d();
            }
            super.onDetachedFromWindow();
            if (this.f41145u && this.f41127c != null && this.f41127c.mo29375c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f41127c.mo29377d();
                if (d != null) {
                    C14963ax.m30832b().mo28690a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f41127c.mo29379e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f41145u = false;
            }
        }
        m33726h(false);
    }

    /* renamed from: a */
    public final void mo29150a(Context context) {
        this.f41126b.setBaseContext(context);
        this.f41117E.f40370a = this.f41126b.f41060a;
    }

    /* renamed from: c */
    public final synchronized void mo29163c(boolean z) {
        if (this.f41133i != null) {
            this.f41133i.mo27675a(this.f41127c.mo29216b(), z);
        } else {
            this.f41136l = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f41139o;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f41139o = i;
        if (this.f41133i != null) {
            this.f41133i.mo27670a(this.f41139o);
        }
    }

    /* renamed from: d */
    public final Activity mo28938d() {
        return this.f41126b.f41060a;
    }

    /* renamed from: r */
    public final Context mo29186r() {
        return this.f41126b.f41061b;
    }

    /* renamed from: P */
    private final synchronized void m33721P() {
        if (!this.f41137m) {
            if (!this.f41134j.mo29366e()) {
                if (VERSION.SDK_INT < 18) {
                    abv.m32792b("Disabling hardware acceleration on an AdView.");
                    m33722Q();
                    return;
                }
                abv.m32792b("Enabling hardware acceleration on an AdView.");
                m33723R();
                return;
            }
        }
        abv.m32792b("Enabling hardware acceleration on an overlay.");
        m33723R();
    }

    /* renamed from: Q */
    private final synchronized void m33722Q() {
        if (!this.f41138n) {
            setLayerType(1, null);
        }
        this.f41138n = true;
    }

    /* renamed from: R */
    private final synchronized void m33723R() {
        if (this.f41138n) {
            setLayerType(0, null);
        }
        this.f41138n = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final synchronized void mo29387g(boolean z) {
        if (!z) {
            try {
                m33725T();
                this.f41117E.mo28758b();
                if (this.f41133i != null) {
                    this.f41133i.mo27669a();
                    this.f41133i.mo27686k();
                    this.f41133i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f41118F.set(null);
        anq anq = this.f41127c;
        if (anq.f41084q != null) {
            anq.f41084q.mo31553d();
            anq.f41084q = null;
        }
        anq.mo29380k();
        anq.f41069b.mo31162d();
        anq.f41069b.f45160b = null;
        synchronized (anq.f41070c) {
            anq.f41071d = null;
            anq.f41072e = null;
            anq.f41073f = null;
            anq.f41074g = null;
            anq.f41075h = null;
            anq.f41076i = null;
            anq.f41080m = null;
            anq.f41077j = null;
            if (anq.f41082o != null) {
                anq.f41082o.mo31354a(true);
                anq.f41082o = null;
            }
        }
        aks.m33177a(this);
        m33724S();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            if (!(this.f41127c == null || this.f41127c.f41083p == null)) {
                this.f41127c.f41083p.mo27629a();
            }
        }
    }

    /* renamed from: I */
    public final void mo29145I() {
        if (this.f41113A == null) {
            this.f41113A = C15799cd.m37135a(this.f41114B.f44780b);
            this.f41114B.mo30896a("native:view_load", this.f41113A);
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            abv.m32793b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            abv.m32793b("Could not resume webview.", e);
        }
    }

    /* renamed from: L */
    public final void mo29148L() {
        abv.m32494a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo29167f(boolean z) {
        this.f41127c.f41085r = z;
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            abv.m32793b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: d */
    public final synchronized void mo29164d(boolean z) {
        this.f41140p = z;
    }

    /* renamed from: E */
    public final synchronized boolean mo29141E() {
        return this.f41140p;
    }

    /* renamed from: F */
    public final synchronized boolean mo29142F() {
        return this.f41141q;
    }

    /* renamed from: C_ */
    public final synchronized void mo27548C_() {
        this.f41141q = true;
        if (this.f41130f != null) {
            this.f41130f.mo27548C_();
        }
    }

    /* renamed from: D_ */
    public final synchronized void mo27549D_() {
        this.f41141q = false;
        if (this.f41130f != null) {
            this.f41130f.mo27549D_();
        }
    }

    /* renamed from: S */
    private final synchronized void m33724S() {
        if (this.f41123K != null) {
            for (akt b : this.f41123K.values()) {
                b.mo28127b();
            }
        }
        this.f41123K = null;
    }

    /* renamed from: a */
    public final synchronized void mo28933a(String str, akt akt) {
        if (this.f41123K == null) {
            this.f41123K = new HashMap();
        }
        this.f41123K.put(str, akt);
    }

    /* renamed from: a */
    public final synchronized akt mo28931a(String str) {
        if (this.f41123K == null) {
            return null;
        }
        return (akt) this.f41123K.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo29160b(String str) {
        if (str == null) {
            str = "";
        }
        this.f41142r = str;
    }

    /* renamed from: g */
    public final synchronized String mo28941g() {
        return this.f41142r;
    }

    /* renamed from: c */
    public final C15804ci mo28937c() {
        return this.f41150z;
    }

    /* renamed from: j */
    public final C15805cj mo28943j() {
        return this.f41114B;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f41115C = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f41115C.get();
    }

    /* renamed from: a */
    public final synchronized void mo29155a(C15837do doVar) {
        this.f41146v = doVar;
    }

    /* renamed from: J */
    public final synchronized C15837do mo29146J() {
        return this.f41146v;
    }

    /* renamed from: n */
    public final synchronized void mo28947n() {
        if (this.f41147w != null) {
            this.f41147w.mo30917a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo29154a(C15824db dbVar) {
        this.f41147w = dbVar;
    }

    /* renamed from: b */
    public final synchronized ams mo28936b() {
        return this.f41143s;
    }

    /* renamed from: a */
    public final synchronized void mo28932a(ams ams) {
        if (this.f41143s != null) {
            abv.m32794c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f41143s = ams;
        }
    }

    /* renamed from: G */
    public final synchronized boolean mo29143G() {
        return this.f41148x > 0;
    }

    /* renamed from: e */
    public final synchronized void mo29166e(boolean z) {
        this.f41148x += z ? 1 : -1;
        if (this.f41148x <= 0 && this.f41133i != null) {
            this.f41133i.mo27692q();
        }
    }

    /* renamed from: T */
    private final void m33725T() {
        if (this.f41114B != null) {
            C15806ck ckVar = this.f41114B.f44780b;
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
        this.f41127c.f41078k = z;
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
        this.f41127c.mo29371a(zzc);
    }

    /* renamed from: a */
    public final void mo29244a(boolean z, int i) {
        anq anq = this.f41127c;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!anq.f41068a.mo29138B() || anq.f41068a.mo29195u().mo29366e()) ? anq.f41071d : null, anq.f41072e, anq.f41080m, anq.f41068a, z, i, anq.f41068a.mo28944k());
        anq.mo29370a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo29245a(boolean z, int i, String str) {
        C15017n nVar;
        anq anq = this.f41127c;
        boolean B = anq.f41068a.mo29138B();
        bzl bzl = (!B || anq.f41068a.mo29195u().mo29366e()) ? anq.f41071d : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new anv(anq.f41068a, anq.f41072e);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bzl, nVar, anq.f41075h, anq.f41076i, anq.f41080m, anq.f41068a, z, i, str, anq.f41068a.mo28944k());
        anq.mo29370a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo29246a(boolean z, int i, String str, String str2) {
        C15017n nVar;
        anq anq = this.f41127c;
        boolean B = anq.f41068a.mo29138B();
        bzl bzl = (!B || anq.f41068a.mo29195u().mo29366e()) ? anq.f41071d : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new anv(anq.f41068a, anq.f41072e);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bzl, nVar, anq.f41075h, anq.f41076i, anq.f41080m, anq.f41068a, z, i, str, str2, anq.f41068a.mo28944k());
        anq.mo29370a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo28549a(bvv bvv) {
        synchronized (this) {
            this.f41144t = bvv.f44078a;
        }
        m33726h(bvv.f44078a);
    }

    /* renamed from: h */
    private final void m33726h(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        C16047lh.m38006a((C16046lg) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo29157a(String str, C15948hq<? super ama> hqVar) {
        if (this.f41127c != null) {
            this.f41127c.mo29373a(str, hqVar);
        }
    }

    /* renamed from: b */
    public final void mo29161b(String str, C15948hq<? super ama> hqVar) {
        if (this.f41127c != null) {
            this.f41127c.f41069b.mo31161b(str, hqVar);
        }
    }

    /* renamed from: a */
    public final void mo29156a(String str, C15525p<C15948hq<? super ama>> pVar) {
        if (this.f41127c != null) {
            this.f41127c.f41069b.mo31158a(str, pVar);
        }
    }

    /* renamed from: w */
    public final /* synthetic */ anj mo29197w() {
        return this.f41127c;
    }
}
