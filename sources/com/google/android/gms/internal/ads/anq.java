package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14987bu;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C15015l;
import com.google.android.gms.ads.internal.overlay.C15017n;
import com.google.android.gms.ads.internal.overlay.C15023t;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;

@C16299uq
public final class anq extends aob implements anj {

    /* renamed from: A */
    private int f41066A;

    /* renamed from: B */
    private OnAttachStateChangeListener f41067B;

    /* renamed from: a */
    ama f41068a;

    /* renamed from: b */
    final C16050lk<ama> f41069b = new C16050lk<>();

    /* renamed from: c */
    final Object f41070c = new Object();

    /* renamed from: d */
    bzl f41071d;

    /* renamed from: e */
    C15017n f41072e;

    /* renamed from: f */
    ank f41073f;

    /* renamed from: g */
    anl f41074g;

    /* renamed from: h */
    C15927gw f41075h;

    /* renamed from: i */
    C15929gy f41076i;

    /* renamed from: j */
    anm f41077j;

    /* renamed from: k */
    public boolean f41078k = false;

    /* renamed from: l */
    volatile boolean f41079l;

    /* renamed from: m */
    C15023t f41080m;

    /* renamed from: n */
    C16216ro f41081n;

    /* renamed from: o */
    C16205rd f41082o;

    /* renamed from: p */
    public ann f41083p;

    /* renamed from: q */
    C16442zy f41084q;

    /* renamed from: r */
    public boolean f41085r;

    /* renamed from: t */
    private boolean f41086t;

    /* renamed from: u */
    private OnGlobalLayoutListener f41087u;

    /* renamed from: v */
    private OnScrollChangedListener f41088v;

    /* renamed from: w */
    private boolean f41089w;

    /* renamed from: x */
    private C14987bu f41090x;

    /* renamed from: y */
    private boolean f41091y;

    /* renamed from: z */
    private boolean f41092z;

    /* renamed from: a */
    public final void mo29204a(int i, int i2, boolean z) {
        this.f41081n.mo31363a(i, i2);
        if (this.f41082o != null) {
            this.f41082o.mo31353a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo29373a(String str, C15948hq<? super ama> hqVar) {
        this.f41069b.mo31159a(str, hqVar);
    }

    /* renamed from: a */
    public final void mo29211a(bzl bzl, C15927gw gwVar, C15017n nVar, C15929gy gyVar, C15023t tVar, boolean z, C15957hz hzVar, C14987bu buVar, C16218rq rqVar, C16442zy zyVar) {
        if (buVar == null) {
            buVar = new C14987bu(this.f41068a.getContext(), zyVar, null);
        }
        this.f41082o = new C16205rd(this.f41068a, rqVar);
        this.f41084q = zyVar;
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44214aA)).booleanValue()) {
            mo29373a("/adMetadata", (C15948hq<? super ama>) new C15926gv<Object>(gwVar));
        }
        mo29373a("/appEvent", (C15948hq<? super ama>) new C15928gx<Object>(gyVar));
        mo29373a("/backButton", C15932ha.f45017j);
        mo29373a("/refresh", C15932ha.f45018k);
        mo29373a("/canOpenURLs", C15932ha.f45008a);
        mo29373a("/canOpenIntents", C15932ha.f45009b);
        mo29373a("/click", C15932ha.f45010c);
        mo29373a("/close", C15932ha.f45011d);
        mo29373a("/customClose", C15932ha.f45012e);
        mo29373a("/instrument", C15932ha.f45021n);
        mo29373a("/delayPageLoaded", C15932ha.f45023p);
        mo29373a("/delayPageClosed", C15932ha.f45024q);
        mo29373a("/getLocationInfo", C15932ha.f45025r);
        mo29373a("/httpTrack", C15932ha.f45013f);
        mo29373a("/log", C15932ha.f45014g);
        mo29373a("/mraid", (C15948hq<? super ama>) new C15961ic<Object>(buVar, this.f41082o, rqVar));
        mo29373a("/mraidLoaded", (C15948hq<? super ama>) this.f41081n);
        mo29373a("/open", (C15948hq<? super ama>) new C15962id<Object>(buVar, this.f41082o));
        mo29373a("/precache", (C15948hq<? super ama>) new alc<Object>());
        mo29373a("/touch", C15932ha.f45016i);
        mo29373a("/video", C15932ha.f45019l);
        mo29373a("/videoMeta", C15932ha.f45020m);
        if (C14963ax.m30849s().mo28557a(this.f41068a.getContext())) {
            mo29373a("/logScionEvent", (C15948hq<? super ama>) new C15960ib<Object>(this.f41068a.getContext()));
        }
        if (hzVar != null) {
            mo29373a("/setInterstitialProperties", (C15948hq<? super ama>) new C15956hy<Object>(hzVar));
        }
        this.f41071d = bzl;
        this.f41072e = nVar;
        this.f41075h = gwVar;
        this.f41076i = gyVar;
        this.f41080m = tVar;
        this.f41090x = buVar;
        this.f41078k = z;
    }

    /* renamed from: a */
    public final C14987bu mo29202a() {
        return this.f41090x;
    }

    /* renamed from: b */
    public final boolean mo29216b() {
        return this.f41079l;
    }

    /* renamed from: c */
    public final boolean mo29375c() {
        boolean z;
        synchronized (this.f41070c) {
            z = this.f41086t;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo29377d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f41070c) {
            onGlobalLayoutListener = this.f41087u;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo29379e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f41070c) {
            onScrollChangedListener = this.f41088v;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo29220f() {
        boolean z;
        synchronized (this.f41070c) {
            z = this.f41089w;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo29372a(aoc aoc) {
        this.f41091y = true;
        if (this.f41074g != null) {
            this.f41074g.mo29361a();
            this.f41074g = null;
        }
        m33684n();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m33681a(View view, C16442zy zyVar, int i) {
        if (zyVar.mo31550b() && i > 0) {
            zyVar.mo31545a(view);
            if (zyVar.mo31550b()) {
                acd.f40245a.postDelayed(new ant(this, view, zyVar, i), 100);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo29380k() {
        if (this.f41067B != null) {
            this.f41068a.getView().removeOnAttachStateChangeListener(this.f41067B);
        }
    }

    /* renamed from: g */
    public final void mo29221g() {
        C16442zy zyVar = this.f41084q;
        if (zyVar != null) {
            WebView webView = this.f41068a.getWebView();
            if (C1056u.m3018B(webView)) {
                m33681a((View) webView, zyVar, 10);
                return;
            }
            mo29380k();
            this.f41067B = new anu(this, zyVar);
            this.f41068a.getView().addOnAttachStateChangeListener(this.f41067B);
        }
    }

    /* renamed from: h */
    public final void mo29222h() {
        synchronized (this.f41070c) {
            this.f41089w = true;
        }
        this.f41066A++;
        m33684n();
    }

    /* renamed from: i */
    public final void mo29223i() {
        this.f41066A--;
        m33684n();
    }

    /* renamed from: j */
    public final void mo29224j() {
        this.f41092z = true;
        m33684n();
    }

    /* renamed from: n */
    private final void m33684n() {
        if (this.f41073f != null && ((this.f41091y && this.f41066A <= 0) || this.f41092z)) {
            this.f41073f.mo27693a(!this.f41092z);
            this.f41073f = null;
        }
        this.f41068a.mo29145I();
    }

    /* renamed from: a */
    public final void mo29371a(zzc zzc) {
        C15017n nVar;
        boolean B = this.f41068a.mo29138B();
        bzl bzl = (!B || this.f41068a.mo29195u().mo29366e()) ? this.f41071d : null;
        if (B) {
            nVar = null;
        } else {
            nVar = this.f41072e;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, bzl, nVar, this.f41080m, this.f41068a.mo28944k());
        mo29370a(adOverlayInfoParcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29370a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean b = this.f41082o != null ? this.f41082o.mo31357b() : false;
        Context context = this.f41068a.getContext();
        if (!b) {
            z = true;
        }
        C15015l.m31056a(context, adOverlayInfoParcel, z);
        if (this.f41084q != null) {
            String str = adOverlayInfoParcel.f38780l;
            if (str == null && adOverlayInfoParcel.f38769a != null) {
                str = adOverlayInfoParcel.f38769a.f38828a;
            }
            this.f41084q.mo31546a(str);
        }
    }

    /* renamed from: a */
    public final void mo29207a(ank ank) {
        this.f41073f = ank;
    }

    /* renamed from: a */
    public final void mo29208a(anl anl) {
        this.f41074g = anl;
    }

    /* renamed from: a */
    public final void mo29209a(anm anm) {
        this.f41077j = anm;
    }

    /* renamed from: a */
    public final void mo29210a(ann ann) {
        this.f41083p = ann;
    }

    /* renamed from: b */
    public final void mo29374b(aoc aoc) {
        this.f41069b.mo31160a(aoc.f41156b);
    }

    /* renamed from: c */
    public final boolean mo29376c(aoc aoc) {
        String str = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(aoc.f41155a);
        abv.m32494a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        Uri uri = aoc.f41156b;
        if (this.f41069b.mo31160a(uri)) {
            return true;
        }
        if (this.f41078k) {
            String scheme = uri.getScheme();
            if (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(scheme) || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(scheme)) {
                if (this.f41071d != null) {
                    this.f41071d.mo27201e();
                    if (this.f41084q != null) {
                        this.f41084q.mo31546a(aoc.f41155a);
                    }
                    this.f41071d = null;
                }
                return false;
            }
        }
        if (!this.f41068a.getWebView().willNotDraw()) {
            try {
                beh z = this.f41068a.mo29200z();
                if (z != null && z.mo30081a(uri)) {
                    uri = z.mo30078a(uri, this.f41068a.getContext(), this.f41068a.getView(), this.f41068a.mo28938d());
                }
            } catch (bei unused) {
                String str2 = "Unable to append parameter to URL: ";
                String valueOf2 = String.valueOf(aoc.f41155a);
                abv.m32798e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            }
            if (this.f41090x == null || this.f41090x.mo27622b()) {
                zzc zzc = new zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null);
                mo29371a(zzc);
            } else {
                this.f41090x.mo27621a(aoc.f41155a);
            }
        } else {
            String str3 = "AdWebView unable to handle URL: ";
            String valueOf3 = String.valueOf(aoc.f41155a);
            abv.m32798e(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3));
        }
        return true;
    }

    /* renamed from: d */
    public final WebResourceResponse mo29378d(aoc aoc) {
        WebResourceResponse webResourceResponse;
        String str;
        if (this.f41084q != null) {
            this.f41084q.mo31547a(aoc.f41155a, aoc.f41157c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(aoc.f41155a).getName())) {
            webResourceResponse = null;
        } else {
            mo29227m();
            if (this.f41068a.mo29195u().mo29366e()) {
                str = (String) caf.m37099d().mo30717a(C15740bx.f44197K);
            } else if (this.f41068a.mo29138B()) {
                str = (String) caf.m37099d().mo30717a(C15740bx.f44196J);
            } else {
                str = (String) caf.m37099d().mo30717a(C15740bx.f44195I);
            }
            webResourceResponse = acd.m32596b(this.f41068a.getContext(), this.f41068a.mo28944k().f46237a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!aav.m32439a(aoc.f41155a, this.f41068a.getContext(), this.f41085r).equals(aoc.f41155a)) {
                return m33683e(aoc);
            }
            zzwr a = zzwr.m39299a(aoc.f41155a);
            if (a != null) {
                zzwo a2 = C14963ax.m30836f().mo30845a(a);
                if (a2 != null && a2.mo31638a()) {
                    return new WebResourceResponse("", "", a2.mo31639b());
                }
            }
            if (aew.m32775b()) {
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44294bb)).booleanValue()) {
                    return m33683e(aoc);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C14963ax.m30834d().mo28588a(e, "AdWebViewClient.interceptRequest");
            return m33685o();
        }
    }

    /* renamed from: o */
    private static WebResourceResponse m33685o() {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44263ax)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: e */
    private final WebResourceResponse m33683e(aoc aoc) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(aoc.f41155a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : aoc.f41157c.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C14963ax.m30831a().mo28667a(this.f41068a.getContext(), this.f41068a.mo28944k().f46237a, false, httpURLConnection);
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
                                return m33685o();
                            } else if (protocol.equals(WebKitApi.SCHEME_HTTP) || protocol.equals(WebKitApi.SCHEME_HTTPS)) {
                                String str = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                abv.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str2 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                abv.m32798e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                                return m33685o();
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
        return this.f41084q;
    }

    /* renamed from: a */
    public final void mo29205a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f41070c) {
            this.f41086t = true;
            this.f41068a.mo29144H();
            this.f41087u = onGlobalLayoutListener;
            this.f41088v = onScrollChangedListener;
        }
    }

    /* renamed from: m */
    public final void mo29227m() {
        synchronized (this.f41070c) {
            this.f41078k = false;
            this.f41079l = true;
            agf.f40430a.execute(new ans(this));
        }
    }

    /* renamed from: a */
    public final void mo29203a(int i, int i2) {
        if (this.f41082o != null) {
            this.f41082o.mo31356b(i, i2);
        }
    }
}
