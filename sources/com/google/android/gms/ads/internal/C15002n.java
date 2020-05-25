package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C15006c;
import com.google.android.gms.ads.internal.overlay.C15015l;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15948hq;
import com.google.android.gms.internal.ads.C15957hz;
import com.google.android.gms.internal.ads.C15966ih;
import com.google.android.gms.internal.ads.C15967ii;
import com.google.android.gms.internal.ads.C16117nx;
import com.google.android.gms.internal.ads.C16118ny;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16360wx;
import com.google.android.gms.internal.ads.C16378xo;
import com.google.android.gms.internal.ads.C16442zy;
import com.google.android.gms.internal.ads.aac;
import com.google.android.gms.internal.ads.aad;
import com.google.android.gms.internal.ads.aal;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acm;
import com.google.android.gms.internal.ads.aef;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amg;
import com.google.android.gms.internal.ads.amk;
import com.google.android.gms.internal.ads.anj;
import com.google.android.gms.internal.ads.anm;
import com.google.android.gms.internal.ads.anp;
import com.google.android.gms.internal.ads.aoo;
import com.google.android.gms.internal.ads.aop;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aoq.C15608a;
import com.google.android.gms.internal.ads.aov;
import com.google.android.gms.internal.ads.aov.C15611b;
import com.google.android.gms.internal.ads.axz;
import com.google.android.gms.internal.ads.bvs;
import com.google.android.gms.internal.ads.bvw;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.n */
public final class C15002n extends C14972bf implements C15957hz, C15967ii {

    /* renamed from: j */
    boolean f38757j;

    /* renamed from: k */
    float f38758k;

    /* renamed from: l */
    boolean f38759l;

    /* renamed from: m */
    private transient boolean f38760m;

    /* renamed from: n */
    private int f38761n = -1;

    /* renamed from: p */
    private aac f38762p;

    /* renamed from: q */
    private String f38763q;

    /* renamed from: r */
    private final String f38764r;

    /* renamed from: s */
    private final C16378xo f38765s;

    /* renamed from: t */
    private final aoo f38766t;

    public C15002n(Context context, zzyz zzyz, String str, C16134on onVar, zzbgz zzbgz, C14986bt btVar) {
        super(context, zzyz, str, onVar, zzbgz, btVar);
        boolean z = zzyz != null && "reward_mb".equals(zzyz.f46338a);
        this.f38764r = z ? "/Rewarded" : "/Interstitial";
        this.f38765s = z ? new C16378xo(this.f38501e, this.f38659o, new C15029p(this), this, this) : null;
        this.f38766t = new aoo(context.getApplicationContext(), C14963ax.m30844n().mo28747a());
    }

    /* renamed from: e */
    private final boolean m31000e(boolean z) {
        return this.f38765s != null && z;
    }

    /* renamed from: a */
    public final boolean mo27478a(zzyv zzyv, C15806ck ckVar) {
        if (this.f38501e.f38636j != null) {
            abv.m32798e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f38762p == null && m30670a(zzyv) && C14963ax.m30849s().mo28557a(this.f38501e.f38629c) && !TextUtils.isEmpty(this.f38501e.f38628b)) {
            this.f38762p = new aac(this.f38501e.f38629c, this.f38501e.f38628b);
        }
        return super.mo27478a(zzyv, ckVar);
    }

    /* renamed from: a */
    public final void mo27455a(abc abc, C15806ck ckVar) {
        if (abc.f40133e != -2) {
            super.mo27455a(abc, ckVar);
            return;
        }
        if (m31000e(abc.f40131c != null)) {
            this.f38765s.mo31470a();
            return;
        }
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44226aM)).booleanValue()) {
            super.mo27455a(abc, ckVar);
            return;
        }
        boolean z = !abc.f40130b.f46189g;
        if (m30670a(abc.f40129a.f46132c) && z) {
            this.f38501e.f38637k = m30999b(abc);
        }
        super.mo27455a(this.f38501e.f38637k, ckVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ama mo27600a(abc abc, C14987bu buVar, C16442zy zyVar) throws amk {
        ama a = amg.m33346a(this.f38501e.f38629c, anp.m33673a(this.f38501e.f38635i), this.f38501e.f38635i.f46338a, false, false, this.f38501e.f38630d, this.f38501e.f38631e, this.f38497a, this, this.f38505i, abc.f40137i);
        a.mo29197w().mo29211a(this, this, null, this, this, true, this, buVar, this, zyVar);
        mo27602a(a);
        a.mo29160b(abc.f40129a.f46151v);
        a.mo29157a("/reward", (C15948hq<? super ama>) new C15966ih<Object>(this));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27527a(zzyv zzyv, abb abb, boolean z) {
        if (this.f38501e.mo27568c() && abb.f40104b != null) {
            acm.m32635a(abb.f40104b);
        }
        return this.f38500d.f38549b;
    }

    /* renamed from: a */
    public final boolean mo27477a(abb abb, abb abb2) {
        if (m31000e(abb2.f40116n)) {
            return true;
        }
        if (!super.mo27477a(abb, abb2)) {
            return false;
        }
        if (!(this.f38501e.mo27568c() || this.f38501e.f38617K == null || abb2.f40113k == null)) {
            this.f38503g.mo30743a(this.f38501e.f38635i, abb2, this.f38501e.f38617K);
        }
        mo27588b(abb2, false);
        return true;
    }

    /* renamed from: d */
    public final void mo27591d() {
        mo27582Z();
        super.mo27591d();
        if (!(this.f38501e.f38636j == null || this.f38501e.f38636j.f40104b == null)) {
            anj w = this.f38501e.f38636j.f40104b.mo29197w();
            if (w != null) {
                w.mo29221g();
            }
        }
        if (!(!C14963ax.m30849s().mo28557a(this.f38501e.f38629c) || this.f38501e.f38636j == null || this.f38501e.f38636j.f40104b == null)) {
            aad s = C14963ax.m30849s();
            Context context = this.f38501e.f38636j.f40104b.getContext();
            String str = this.f38763q;
            if (s.mo28557a(context) && (context instanceof Activity)) {
                if (aad.m32401b(context)) {
                    s.mo28556a("setScreenName", (aau) new aal(context, str));
                } else if (s.mo28558a(context, "com.google.firebase.analytics.FirebaseAnalytics", s.f40050a, false)) {
                    Method f = s.mo28567f(context, "setCurrentScreen");
                    try {
                        Activity activity = (Activity) context;
                        f.invoke(s.f40050a.get(), new Object[]{activity, str, context.getPackageName()});
                    } catch (Exception e) {
                        s.mo28555a(e, "setCurrentScreen", false);
                    }
                }
            }
        }
        if (this.f38762p != null) {
            this.f38762p.mo28550a(true);
        }
        if (this.f38504h != null && this.f38501e.f38636j != null && this.f38501e.f38636j.f40104b != null) {
            this.f38501e.f38636j.f40104b.mo29242a("onSdkImpression", (Map) new HashMap());
        }
    }

    /* renamed from: y_ */
    public final void mo27592y_() {
        super.mo27592y_();
        this.f38503g.mo30740a(this.f38501e.f38636j);
        if (this.f38762p != null) {
            this.f38762p.mo28550a(false);
        }
        this.f38504h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo27496r() {
        mo27660F();
        super.mo27496r();
    }

    /* renamed from: d */
    public final void mo27665d(boolean z) {
        this.f38501e.f38619M = z;
    }

    /* renamed from: a */
    public final void mo27663a(boolean z, float f) {
        this.f38757j = z;
        this.f38758k = f;
    }

    /* renamed from: E */
    public final void mo27508E() {
        int i;
        String str;
        C15464q.m32132b("showInterstitial must be called on the main UI thread.");
        if (m31000e(this.f38501e.f38636j != null && this.f38501e.f38636j.f40116n)) {
            this.f38765s.mo31472a(this.f38759l);
            return;
        }
        if (C14963ax.m30849s().mo28557a(this.f38501e.f38629c)) {
            this.f38763q = C14963ax.m30849s().mo28560c(this.f38501e.f38629c);
            String valueOf = String.valueOf(this.f38763q);
            String valueOf2 = String.valueOf(this.f38764r);
            this.f38763q = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.f38501e.f38636j == null) {
            abv.m32798e("The interstitial has not loaded.");
            return;
        }
        if (!this.f38760m) {
            if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44338cS)).booleanValue()) {
                return;
            }
        }
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44257ar)).booleanValue() || !acd.m32611g(this.f38501e.f38629c)) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44304bl)).booleanValue()) {
                if (this.f38501e.f38629c.getApplicationContext() != null) {
                    str = this.f38501e.f38629c.getApplicationContext().getPackageName();
                } else {
                    str = this.f38501e.f38629c.getPackageName();
                }
                if (!this.f38760m) {
                    abv.m32798e("It is not recommended to show an interstitial before onAdLoaded completes.");
                    Bundle bundle = new Bundle();
                    bundle.putString("appid", str);
                    bundle.putString("action", "show_interstitial_before_load_finish");
                    m30998a(bundle);
                }
                if (!acd.m32610f(this.f38501e.f38629c)) {
                    abv.m32798e("It is not recommended to show an interstitial when app is not in foreground.");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("appid", str);
                    bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                    m30998a(bundle2);
                }
            }
            if (!this.f38501e.mo27569d()) {
                if (this.f38501e.f38636j.f40116n && this.f38501e.f38636j.f40118p != null) {
                    try {
                        this.f38501e.f38636j.f40118p.mo31250a(this.f38759l);
                        this.f38501e.f38636j.f40118p.mo31251b();
                    } catch (RemoteException e) {
                        abv.m32795c("Could not show interstitial.", e);
                        mo27660F();
                    }
                } else if (this.f38501e.f38636j.f40104b == null) {
                    abv.m32798e("The interstitial failed to load.");
                } else if (this.f38501e.f38636j.f40104b.mo29138B()) {
                    abv.m32798e("The interstitial is already showing.");
                } else {
                    this.f38501e.f38636j.f40104b.mo29162b(true);
                    this.f38501e.mo27565a(this.f38501e.f38636j.f40104b.getView());
                    if (this.f38501e.f38636j.f40113k != null) {
                        this.f38503g.mo30742a(this.f38501e.f38635i, this.f38501e.f38636j);
                    }
                    abb abb = this.f38501e.f38636j;
                    if (abb.mo28583a()) {
                        new bvs(this.f38501e.f38629c, abb.f40104b.getView()).mo30776a((bvw) abb.f40104b);
                    } else {
                        abb.f40104b.mo29197w().mo29209a((anm) new C15003o(this, abb));
                    }
                    Bitmap h = this.f38501e.f38619M ? acd.m32612h(this.f38501e.f38629c) : null;
                    aef p = C14963ax.m30846p();
                    if (h == null) {
                        abv.m32792b("Bitmap is null. Skipping putting into the Memory Map.");
                        i = -1;
                    } else {
                        i = p.f40349b.getAndIncrement();
                        p.f40348a.put(Integer.valueOf(i), h);
                    }
                    this.f38761n = i;
                    if (h != null) {
                        new C15030q(this, this.f38761n).mo28619g();
                        return;
                    }
                    zzar zzar = new zzar(this.f38501e.f38619M, acd.m32615m(this.f38501e.f38629c), false, 0.0f, -1, this.f38759l, this.f38501e.f38636j.f40093L, this.f38501e.f38636j.f40096O);
                    int requestedOrientation = this.f38501e.f38636j.f40104b.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.f38501e.f38636j.f40110h;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.f38501e.f38636j.f40104b, requestedOrientation, this.f38501e.f38631e, this.f38501e.f38636j.f40082A, zzar);
                    C15015l.m31056a(this.f38501e.f38629c, adOverlayInfoParcel, true);
                }
            }
        } else {
            abv.m32798e("It is not recommended to show an interstitial when app is not in foreground.");
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44258as)).booleanValue()) {
                aoo aoo = this.f38766t;
                new aop(aoo.f41173a, aoo.f41174b, (aov) ((axz) aov.m33842a().mo29430a(aoo.f41173a.getPackageName()).mo29429a(C15611b.BLOCKED_IMPRESSION).mo29428a(aoq.m33837a().mo29427a(this.f38501e.f38637k.f40130b.f46206x).mo29426a(C15608a.BLOCKED_REASON_BACKGROUND)).mo29832e())).mo29425a();
            }
        }
    }

    /* renamed from: b */
    public final void mo27481b(boolean z) {
        C15464q.m32132b("setImmersiveMode must be called on the main UI thread.");
        this.f38759l = z;
    }

    /* renamed from: a */
    private final void m30998a(Bundle bundle) {
        C14963ax.m30831a().mo28671b(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, "gmob-apps", bundle, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo27499u() {
        ama ama = this.f38501e.f38636j != null ? this.f38501e.f38636j.f40104b : null;
        abc abc = this.f38501e.f38637k;
        if (!(abc == null || abc.f40130b == null || !abc.f40130b.f46172Q || ama == null || !C14963ax.m30845o().mo31372a(this.f38501e.f38629c))) {
            int i = this.f38501e.f38631e.f46238b;
            int i2 = this.f38501e.f38631e.f46239c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i2);
            this.f38504h = C14963ax.m30845o().mo31368a(sb.toString(), ama.getWebView(), "", "javascript", mo27447D());
            if (!(this.f38504h == null || ama.getView() == null)) {
                C14963ax.m30845o().mo31371a(this.f38504h, ama.getView());
                ama.mo29151a(this.f38504h);
                C14963ax.m30845o().mo31370a(this.f38504h);
            }
        }
        super.mo27499u();
        this.f38760m = true;
    }

    /* renamed from: F */
    public final void mo27660F() {
        C14963ax.m30846p().mo28748a(Integer.valueOf(this.f38761n));
        if (this.f38501e.mo27568c()) {
            this.f38501e.mo27564a();
            this.f38501e.f38636j = null;
            this.f38501e.f38619M = false;
            this.f38760m = false;
        }
    }

    /* renamed from: G */
    public final void mo27661G() {
        if (m31000e(this.f38501e.f38636j != null && this.f38501e.f38636j.f40116n)) {
            this.f38765s.mo31473b();
            mo27502x();
            return;
        }
        if (!(this.f38501e.f38636j == null || this.f38501e.f38636j.f40125w == null)) {
            acd.m32584a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, this.f38501e.f38636j.f40125w);
        }
        mo27502x();
    }

    /* renamed from: b */
    public final void mo27664b(zzbaz zzbaz) {
        if (m31000e(this.f38501e.f38636j != null && this.f38501e.f38636j.f40116n)) {
            mo27469a(this.f38765s.mo31469a(zzbaz));
            return;
        }
        if (this.f38501e.f38636j != null) {
            if (this.f38501e.f38636j.f40126x != null) {
                acd.m32584a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, this.f38501e.f38636j.f40126x);
            }
            if (this.f38501e.f38636j.f40124v != null) {
                zzbaz = this.f38501e.f38636j.f40124v;
            }
        }
        mo27469a(zzbaz);
    }

    /* renamed from: H */
    public final void mo27662H() {
        if (m31000e(this.f38501e.f38636j != null && this.f38501e.f38636j.f40116n)) {
            this.f38765s.mo31474c();
        }
        mo27503y();
    }

    /* renamed from: b */
    private static abc m30999b(abc abc) {
        abc abc2 = abc;
        try {
            String jSONObject = C16360wx.m38981a(abc2.f40130b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pubid", abc2.f40129a.f46134e);
            C16117nx nxVar = new C16117nx(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), "", "", null, null, null, null, null, Collections.emptyList(), null, -1);
            zzaxi zzaxi = abc2.f40130b;
            C16118ny nyVar = new C16118ny(Collections.singletonList(nxVar), ((Long) caf.m37099d().mo30717a(C15740bx.f44308bp)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaxi.f46163H, zzaxi.f46164I, "", -1, 0, 1, null, 0, -1, -1, false);
            zzaxi zzaxi2 = new zzaxi(abc2.f40129a, zzaxi.f46182a, zzaxi.f46184b, Collections.emptyList(), Collections.emptyList(), zzaxi.f46188f, true, zzaxi.f46190h, Collections.emptyList(), zzaxi.f46192j, zzaxi.f46193k, zzaxi.f46194l, zzaxi.f46195m, zzaxi.f46196n, zzaxi.f46197o, zzaxi.f46198p, null, zzaxi.f46200r, zzaxi.f46201s, zzaxi.f46202t, zzaxi.f46203u, zzaxi.f46204v, zzaxi.f46206x, zzaxi.f46207y, zzaxi.f46208z, null, Collections.emptyList(), Collections.emptyList(), zzaxi.f46159D, zzaxi.f46160E, zzaxi.f46161F, zzaxi.f46162G, zzaxi.f46163H, zzaxi.f46164I, zzaxi.f46165J, null, zzaxi.f46167L, zzaxi.f46168M, zzaxi.f46169N, zzaxi.f46170O, 0, zzaxi.f46172Q, Collections.emptyList(), zzaxi.f46174S, zzaxi.f46175T, zzaxi.f46176U, zzaxi.f46177V, zzaxi.f46178W);
            abc abc3 = new abc(abc2.f40129a, zzaxi2, nyVar, abc2.f40132d, abc2.f40133e, abc2.f40134f, abc2.f40135g, null, abc2.f40137i, null);
            return abc3;
        } catch (JSONException e) {
            abv.m32793b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return abc2;
        }
    }

    /* renamed from: I */
    public final void mo27623I() {
        C15006c s = this.f38501e.f38636j.f40104b.mo29187s();
        if (s != null) {
            s.mo27669a();
        }
    }
}
