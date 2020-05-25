package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.example.p906a.C13482c;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14987bu;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C15015l;
import com.google.android.gms.ads.internal.overlay.C15017n;
import com.google.android.gms.ads.internal.overlay.C15023t;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.bye.C15742a.C15744b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

@C16299uq
public class amb extends WebViewClient implements anj {

    /* renamed from: i */
    private static final String[] f40887i = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: j */
    private static final String[] f40888j = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private boolean f40889A;

    /* renamed from: B */
    private boolean f40890B;

    /* renamed from: C */
    private int f40891C;

    /* renamed from: D */
    private OnAttachStateChangeListener f40892D;

    /* renamed from: a */
    ama f40893a;

    /* renamed from: b */
    final HashMap<String, List<C15948hq<? super ama>>> f40894b;

    /* renamed from: c */
    final Object f40895c;

    /* renamed from: d */
    anm f40896d;

    /* renamed from: e */
    public boolean f40897e;

    /* renamed from: f */
    public ann f40898f;

    /* renamed from: g */
    protected C16442zy f40899g;

    /* renamed from: h */
    public boolean f40900h;

    /* renamed from: k */
    private final byc f40901k;

    /* renamed from: l */
    private bzl f40902l;

    /* renamed from: m */
    private C15017n f40903m;

    /* renamed from: n */
    private ank f40904n;

    /* renamed from: o */
    private anl f40905o;

    /* renamed from: p */
    private C15927gw f40906p;

    /* renamed from: q */
    private C15929gy f40907q;

    /* renamed from: r */
    private boolean f40908r;

    /* renamed from: s */
    private boolean f40909s;

    /* renamed from: t */
    private OnGlobalLayoutListener f40910t;

    /* renamed from: u */
    private OnScrollChangedListener f40911u;

    /* renamed from: v */
    private boolean f40912v;

    /* renamed from: w */
    private C15023t f40913w;

    /* renamed from: x */
    private final C16216ro f40914x;

    /* renamed from: y */
    private C14987bu f40915y;

    /* renamed from: z */
    private C16205rd f40916z;

    public amb(ama ama, byc byc, boolean z) {
        this(ama, byc, z, new C16216ro(ama, ama.mo29186r(), new C15721bh(ama.getContext())), null);
    }

    private amb(ama ama, byc byc, boolean z, C16216ro roVar, C16205rd rdVar) {
        this.f40894b = new HashMap<>();
        this.f40895c = new Object();
        this.f40897e = false;
        this.f40901k = byc;
        this.f40893a = ama;
        this.f40908r = z;
        this.f40914x = roVar;
        this.f40916z = null;
    }

    /* renamed from: a */
    public final void mo29204a(int i, int i2, boolean z) {
        this.f40914x.mo31363a(i, i2);
        if (this.f40916z != null) {
            this.f40916z.mo31353a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo29211a(bzl bzl, C15927gw gwVar, C15017n nVar, C15929gy gyVar, C15023t tVar, boolean z, C15957hz hzVar, C14987bu buVar, C16218rq rqVar, C16442zy zyVar) {
        if (buVar == null) {
            buVar = new C14987bu(this.f40893a.getContext(), zyVar, null);
        }
        this.f40916z = new C16205rd(this.f40893a, rqVar);
        this.f40899g = zyVar;
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44214aA)).booleanValue()) {
            mo29212a("/adMetadata", (C15948hq<? super ama>) new C15926gv<Object>(gwVar));
        }
        mo29212a("/appEvent", (C15948hq<? super ama>) new C15928gx<Object>(gyVar));
        mo29212a("/backButton", C15932ha.f45017j);
        mo29212a("/refresh", C15932ha.f45018k);
        mo29212a("/canOpenURLs", C15932ha.f45008a);
        mo29212a("/canOpenIntents", C15932ha.f45009b);
        mo29212a("/click", C15932ha.f45010c);
        mo29212a("/close", C15932ha.f45011d);
        mo29212a("/customClose", C15932ha.f45012e);
        mo29212a("/instrument", C15932ha.f45021n);
        mo29212a("/delayPageLoaded", C15932ha.f45023p);
        mo29212a("/delayPageClosed", C15932ha.f45024q);
        mo29212a("/getLocationInfo", C15932ha.f45025r);
        mo29212a("/httpTrack", C15932ha.f45013f);
        mo29212a("/log", C15932ha.f45014g);
        mo29212a("/mraid", (C15948hq<? super ama>) new C15961ic<Object>(buVar, this.f40916z, rqVar));
        mo29212a("/mraidLoaded", (C15948hq<? super ama>) this.f40914x);
        mo29212a("/open", (C15948hq<? super ama>) new C15962id<Object>(buVar, this.f40916z));
        mo29212a("/precache", (C15948hq<? super ama>) new alc<Object>());
        mo29212a("/touch", C15932ha.f45016i);
        mo29212a("/video", C15932ha.f45019l);
        mo29212a("/videoMeta", C15932ha.f45020m);
        if (C14963ax.m30849s().mo28557a(this.f40893a.getContext())) {
            mo29212a("/logScionEvent", (C15948hq<? super ama>) new C15960ib<Object>(this.f40893a.getContext()));
        }
        if (hzVar != null) {
            mo29212a("/setInterstitialProperties", (C15948hq<? super ama>) new C15956hy<Object>(hzVar));
        }
        this.f40902l = bzl;
        this.f40903m = nVar;
        this.f40906p = gwVar;
        this.f40907q = gyVar;
        this.f40913w = tVar;
        this.f40915y = buVar;
        this.f40897e = z;
    }

    /* renamed from: a */
    public final C14987bu mo29202a() {
        return this.f40915y;
    }

    /* renamed from: b */
    public final boolean mo29216b() {
        boolean z;
        synchronized (this.f40895c) {
            z = this.f40908r;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo29217c() {
        boolean z;
        synchronized (this.f40895c) {
            z = this.f40909s;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo29218d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f40895c) {
            onGlobalLayoutListener = this.f40910t;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo29219e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f40895c) {
            onScrollChangedListener = this.f40911u;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo29220f() {
        boolean z;
        synchronized (this.f40895c) {
            z = this.f40912v;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0.f40905o == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0.f40905o.mo29361a();
        r0.f40905o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        m33313o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f40889A = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f40895c
            monitor-enter(r1)
            com.google.android.gms.internal.ads.ama r2 = r0.f40893a     // Catch:{ all -> 0x002b }
            boolean r2 = r2.mo29139C()     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.abv.m32494a(r2)     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.ama r2 = r0.f40893a     // Catch:{ all -> 0x002b }
            r2.mo29140D()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r1 = 1
            r0.f40889A = r1
            com.google.android.gms.internal.ads.anl r1 = r0.f40905o
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.anl r1 = r0.f40905o
            r1.mo29361a()
            r1 = 0
            r0.f40905o = r1
        L_0x0027:
            r0.m33313o()
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.amb.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m33308a(View view, C16442zy zyVar, int i) {
        if (zyVar.mo31550b() && i > 0) {
            zyVar.mo31545a(view);
            if (zyVar.mo31550b()) {
                acd.f40245a.postDelayed(new amd(this, view, zyVar, i), 100);
            }
        }
    }

    /* renamed from: n */
    private final void m33312n() {
        if (this.f40892D != null) {
            this.f40893a.getView().removeOnAttachStateChangeListener(this.f40892D);
        }
    }

    /* renamed from: g */
    public final void mo29221g() {
        C16442zy zyVar = this.f40899g;
        if (zyVar != null) {
            WebView webView = this.f40893a.getWebView();
            if (C1056u.m3018B(webView)) {
                m33308a((View) webView, zyVar, 10);
                return;
            }
            m33312n();
            this.f40892D = new ame(this, zyVar);
            this.f40893a.getView().addOnAttachStateChangeListener(this.f40892D);
        }
    }

    /* renamed from: h */
    public final void mo29222h() {
        synchronized (this.f40895c) {
            this.f40912v = true;
        }
        this.f40891C++;
        m33313o();
    }

    /* renamed from: i */
    public final void mo29223i() {
        this.f40891C--;
        m33313o();
    }

    /* renamed from: j */
    public final void mo29224j() {
        this.f40890B = true;
        m33313o();
    }

    /* renamed from: o */
    private final void m33313o() {
        if (this.f40904n != null && ((this.f40889A && this.f40891C <= 0) || this.f40890B)) {
            this.f40904n.mo27693a(!this.f40890B);
            this.f40904n = null;
        }
        this.f40893a.mo29145I();
    }

    /* renamed from: a */
    public final void mo29206a(zzc zzc) {
        C15017n nVar;
        boolean B = this.f40893a.mo29138B();
        bzl bzl = (!B || this.f40893a.mo29195u().mo29366e()) ? this.f40902l : null;
        if (B) {
            nVar = null;
        } else {
            nVar = this.f40903m;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, bzl, nVar, this.f40913w, this.f40893a.mo28944k());
        m33309a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo29213a(boolean z, int i) {
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!this.f40893a.mo29138B() || this.f40893a.mo29195u().mo29366e()) ? this.f40902l : null, this.f40903m, this.f40913w, this.f40893a, z, i, this.f40893a.mo28944k());
        m33309a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo29214a(boolean z, int i, String str) {
        C15017n nVar;
        boolean B = this.f40893a.mo29138B();
        bzl bzl = (!B || this.f40893a.mo29195u().mo29366e()) ? this.f40902l : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new amf(this.f40893a, this.f40903m);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bzl, nVar, this.f40906p, this.f40907q, this.f40913w, this.f40893a, z, i, str, this.f40893a.mo28944k());
        m33309a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo29215a(boolean z, int i, String str, String str2) {
        C15017n nVar;
        boolean B = this.f40893a.mo29138B();
        bzl bzl = (!B || this.f40893a.mo29195u().mo29366e()) ? this.f40902l : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new amf(this.f40893a, this.f40903m);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bzl, nVar, this.f40906p, this.f40907q, this.f40913w, this.f40893a, z, i, str, str2, this.f40893a.mo28944k());
        m33309a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    private final void m33309a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean b = this.f40916z != null ? this.f40916z.mo31357b() : false;
        Context context = this.f40893a.getContext();
        if (!b) {
            z = true;
        }
        C15015l.m31056a(context, adOverlayInfoParcel, z);
        if (this.f40899g != null) {
            String str = adOverlayInfoParcel.f38780l;
            if (str == null && adOverlayInfoParcel.f38769a != null) {
                str = adOverlayInfoParcel.f38769a.f38828a;
            }
            this.f40899g.mo31546a(str);
        }
    }

    /* renamed from: a */
    public final void mo29212a(String str, C15948hq<? super ama> hqVar) {
        synchronized (this.f40895c) {
            List list = (List) this.f40894b.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f40894b.put(str, list);
            }
            list.add(hqVar);
        }
    }

    /* renamed from: k */
    public final void mo29225k() {
        if (this.f40899g != null) {
            this.f40899g.mo31553d();
            this.f40899g = null;
        }
        m33312n();
        synchronized (this.f40895c) {
            this.f40894b.clear();
            this.f40902l = null;
            this.f40903m = null;
            this.f40904n = null;
            this.f40905o = null;
            this.f40906p = null;
            this.f40907q = null;
            this.f40897e = false;
            this.f40908r = false;
            this.f40909s = false;
            this.f40912v = false;
            this.f40913w = null;
            this.f40896d = null;
            if (this.f40916z != null) {
                this.f40916z.mo31354a(true);
                this.f40916z = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo29207a(ank ank) {
        this.f40904n = ank;
    }

    /* renamed from: a */
    public final void mo29208a(anl anl) {
        this.f40905o = anl;
    }

    /* renamed from: a */
    public final void mo29209a(anm anm) {
        this.f40896d = anm;
    }

    /* renamed from: a */
    public final void mo29210a(ann ann) {
        this.f40898f = ann;
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        abv.m32494a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m33307a(parse);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < f40887i.length) {
                str3 = f40887i[i2];
                m33306a(this.f40893a.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m33306a(this.f40893a.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f40888j.length) {
                str = String.valueOf(primaryError);
            } else {
                str = f40888j[primaryError];
            }
            m33306a(this.f40893a.getContext(), "ssl_err", str, sslError.getUrl());
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* renamed from: a */
    private final void m33306a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44305bm)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            String str5 = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString(str5, str4);
                    C14963ax.m30831a().mo28666a(context, this.f40893a.mo28944k().f46237a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString(str5, str4);
            C14963ax.m30831a().mo28666a(context, this.f40893a.mo28944k().f46237a, "gmob-apps", bundle, true);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        abv.m32494a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f40897e && webView == this.f40893a.getWebView()) {
                String scheme = parse.getScheme();
                if (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(scheme) || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(scheme)) {
                    if (this.f40902l != null) {
                        this.f40902l.mo27201e();
                        if (this.f40899g != null) {
                            this.f40899g.mo31546a(str);
                        }
                        this.f40902l = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f40893a.getWebView().willNotDraw()) {
                try {
                    beh z = this.f40893a.mo29200z();
                    if (z != null && z.mo30081a(parse)) {
                        parse = z.mo30078a(parse, this.f40893a.getContext(), this.f40893a.getView(), this.f40893a.mo28938d());
                    }
                } catch (bei unused) {
                    String str3 = "Unable to append parameter to URL: ";
                    String valueOf2 = String.valueOf(str);
                    abv.m32798e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
                if (this.f40915y == null || this.f40915y.mo27622b()) {
                    zzc zzc = new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null);
                    mo29206a(zzc);
                } else {
                    this.f40915y.mo27621a(str);
                }
            } else {
                String str4 = "AdWebView unable to handle URL: ";
                String valueOf3 = String.valueOf(str);
                abv.m32798e(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
            }
        } else {
            m33307a(parse);
        }
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo29201a(str, Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo29201a(String str, Map<String, String> map) {
        try {
            String a = aav.m32439a(str, this.f40893a.getContext(), this.f40900h);
            if (!a.equals(str)) {
                return m33311b(a, map);
            }
            zzwr a2 = zzwr.m39299a(str);
            if (a2 != null) {
                zzwo a3 = C14963ax.m30836f().mo30845a(a2);
                if (a3 != null && a3.mo31638a()) {
                    return new WebResourceResponse("", "", a3.mo31639b());
                }
            }
            if (aew.m32775b()) {
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44294bb)).booleanValue()) {
                    return m33311b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C14963ax.m30834d().mo28588a(e, "AdWebViewClient.interceptRequest");
            return m33314p();
        }
    }

    /* renamed from: p */
    private static WebResourceResponse m33314p() {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44263ax)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: b */
    private final WebResourceResponse m33311b(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C14963ax.m30831a().mo28667a(this.f40893a.getContext(), this.f40893a.mo28944k().f46237a, false, httpURLConnection);
                    aew aew = new aew();
                    aew.mo28767a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    aew.mo28766a(httpURLConnection, responseCode);
                    if (responseCode >= 300 && responseCode < 400) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                abv.m32798e("Protocol is null");
                                return m33314p();
                            } else if (protocol.equals(WebKitApi.SCHEME_HTTP) || protocol.equals(WebKitApi.SCHEME_HTTPS)) {
                                String str2 = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                abv.m32792b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str3 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                abv.m32798e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                                return m33314p();
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        return acd.m32573a(httpURLConnection);
    }

    /* renamed from: l */
    public final C16442zy mo29226l() {
        return this.f40899g;
    }

    /* renamed from: a */
    public final void mo29205a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f40895c) {
            this.f40909s = true;
            this.f40893a.mo29144H();
            this.f40910t = onGlobalLayoutListener;
            this.f40911u = onScrollChangedListener;
        }
    }

    /* renamed from: m */
    public final void mo29227m() {
        synchronized (this.f40895c) {
            this.f40897e = false;
            this.f40908r = true;
            agf.f40430a.execute(new amc(this));
        }
    }

    /* renamed from: a */
    public final void mo29203a(int i, int i2) {
        if (this.f40916z != null) {
            this.f40916z.mo31356b(i, i2);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m33307a(Uri uri) {
        String path = uri.getPath();
        List<C15948hq> list = (List) this.f40894b.get(path);
        if (list != null) {
            Map a = acd.m32578a(uri);
            if (abv.m32791a(2)) {
                String str = "Received GMSG: ";
                String valueOf = String.valueOf(path);
                abv.m32494a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                for (String str2 : a.keySet()) {
                    String str3 = (String) a.get(str2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                    sb.append("  ");
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(str3);
                    abv.m32494a(sb.toString());
                }
            }
            for (C15948hq a2 : list) {
                a2.mo27606a(this.f40893a, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        abv.m32494a(sb2.toString());
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f40901k != null) {
            this.f40901k.mo30861a(C15744b.ANDROID_WEBVIEW_CRASH);
        }
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }
}
