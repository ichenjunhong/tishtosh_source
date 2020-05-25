package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bef.effectsdk.message.MessageCenter;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14987bu;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15927gw;
import com.google.android.gms.internal.ads.C15929gy;
import com.google.android.gms.internal.ads.C16217rp;
import com.google.android.gms.internal.ads.C16223rv;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acm;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amg;
import com.google.android.gms.internal.ads.anj;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.internal.ads.byc;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collections;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
public class C15006c extends C16223rv implements C15026w {

    /* renamed from: e */
    private static final int f38785e = Color.argb(0, 0, 0, 0);

    /* renamed from: a */
    protected final Activity f38786a;

    /* renamed from: b */
    AdOverlayInfoParcel f38787b;

    /* renamed from: c */
    ama f38788c;

    /* renamed from: d */
    int f38789d;

    /* renamed from: f */
    private C15012i f38790f;

    /* renamed from: g */
    private C15018o f38791g;

    /* renamed from: h */
    private boolean f38792h;

    /* renamed from: i */
    private FrameLayout f38793i;

    /* renamed from: j */
    private CustomViewCallback f38794j;

    /* renamed from: k */
    private boolean f38795k;

    /* renamed from: l */
    private boolean f38796l;

    /* renamed from: m */
    private C15011h f38797m;

    /* renamed from: n */
    private boolean f38798n;

    /* renamed from: o */
    private final Object f38799o = new Object();

    /* renamed from: p */
    private Runnable f38800p;

    /* renamed from: q */
    private boolean f38801q;

    /* renamed from: r */
    private boolean f38802r;

    /* renamed from: s */
    private boolean f38803s = false;

    /* renamed from: t */
    private boolean f38804t = false;

    /* renamed from: u */
    private boolean f38805u = true;

    public C15006c(Activity activity) {
        this.f38786a = activity;
    }

    /* renamed from: a */
    public final void mo27671a(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public final void mo27681f() {
    }

    /* renamed from: a */
    public final void mo27669a() {
        this.f38789d = 2;
        this.f38786a.finish();
    }

    /* renamed from: b */
    public final void mo27676b() {
        if (this.f38787b != null && this.f38792h) {
            mo27670a(this.f38787b.f38778j);
        }
        if (this.f38793i != null) {
            this.f38786a.setContentView(this.f38797m);
            this.f38802r = true;
            this.f38793i.removeAllViews();
            this.f38793i = null;
        }
        if (this.f38794j != null) {
            this.f38794j.onCustomViewHidden();
            this.f38794j = null;
        }
        this.f38792h = false;
    }

    /* renamed from: c */
    public final void mo27678c() {
        this.f38789d = 1;
        this.f38786a.finish();
    }

    /* renamed from: d */
    public final void mo27679d() {
        this.f38789d = 0;
    }

    /* renamed from: e */
    public final boolean mo27680e() {
        this.f38789d = 0;
        if (this.f38788c == null) {
            return true;
        }
        boolean E = this.f38788c.mo29141E();
        if (!E) {
            this.f38788c.mo29242a("onbackblocked", Collections.emptyMap());
        }
        return E;
    }

    /* renamed from: a */
    public void mo27672a(Bundle bundle) {
        this.f38786a.requestWindowFeature(1);
        this.f38795k = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f38787b = AdOverlayInfoParcel.m31020a(this.f38786a.getIntent());
            if (this.f38787b != null) {
                if (this.f38787b.f38781m.f46239c > 7500000) {
                    this.f38789d = 3;
                }
                if (this.f38786a.getIntent() != null) {
                    this.f38805u = this.f38786a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f38787b.f38783o != null) {
                    this.f38796l = this.f38787b.f38783o.f38857a;
                } else {
                    this.f38796l = false;
                }
                if (this.f38796l && this.f38787b.f38783o.f38861e != -1) {
                    new C15013j(this).mo28619g();
                }
                if (bundle == null) {
                    if (this.f38787b.f38771c != null && this.f38805u) {
                        this.f38787b.f38771c.mo27591d();
                    }
                    if (!(this.f38787b.f38779k == 1 || this.f38787b.f38770b == null)) {
                        this.f38787b.f38770b.mo27201e();
                    }
                }
                this.f38797m = new C15011h(this.f38786a, this.f38787b.f38782n, this.f38787b.f38781m.f46237a);
                this.f38797m.setId(1000);
                C14963ax.m30832b().mo28688a(this.f38786a);
                switch (this.f38787b.f38779k) {
                    case 1:
                        m31026b(false);
                        return;
                    case 2:
                        this.f38790f = new C15012i(this.f38787b.f38772d);
                        m31026b(false);
                        return;
                    case 3:
                        m31026b(true);
                        return;
                    default:
                        throw new C15010g("Could not determine ad overlay type.");
                }
            } else {
                throw new C15010g("Could not get info for ad overlay.");
            }
        } catch (C15010g e) {
            abv.m32798e(e.getMessage());
            this.f38789d = 3;
            this.f38786a.finish();
        }
    }

    /* renamed from: g */
    public final void mo27682g() {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44323cD)).booleanValue()) {
            if (this.f38788c == null || this.f38788c.mo29139C()) {
                abv.m32798e("The webview does not exist. Ignoring action.");
            } else {
                acm.m32636b(this.f38788c);
            }
        }
    }

    /* renamed from: h */
    public final void mo27683h() {
        if (this.f38787b.f38771c != null) {
            this.f38787b.f38771c.mo27590c();
        }
        m31023a(this.f38786a.getResources().getConfiguration());
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44323cD)).booleanValue()) {
            if (this.f38788c == null || this.f38788c.mo29139C()) {
                abv.m32798e("The webview does not exist. Ignoring action.");
            } else {
                acm.m32636b(this.f38788c);
            }
        }
    }

    /* renamed from: i */
    public final void mo27684i() {
        mo27676b();
        if (this.f38787b.f38771c != null) {
            this.f38787b.f38771c.mo27587b();
        }
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44323cD)).booleanValue() && this.f38788c != null && (!this.f38786a.isFinishing() || this.f38790f == null)) {
            acm.m32635a(this.f38788c);
        }
        m31027r();
    }

    /* renamed from: a */
    public final void mo27674a(C14882b bVar) {
        m31023a((Configuration) C14886d.m30545a(bVar));
    }

    /* renamed from: b */
    public final void mo27677b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f38795k);
    }

    /* renamed from: j */
    public final void mo27685j() {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44323cD)).booleanValue() && this.f38788c != null && (!this.f38786a.isFinishing() || this.f38790f == null)) {
            acm.m32635a(this.f38788c);
        }
        m31027r();
    }

    /* renamed from: k */
    public final void mo27686k() {
        if (this.f38788c != null) {
            this.f38797m.removeView(this.f38788c.getView());
        }
        m31027r();
    }

    /* renamed from: a */
    private final void m31025a(boolean z) {
        int intValue = ((Integer) caf.m37099d().mo30717a(C15740bx.f44325cF)).intValue();
        C15019p pVar = new C15019p();
        pVar.f38823e = 50;
        pVar.f38819a = z ? intValue : 0;
        pVar.f38820b = z ? 0 : intValue;
        pVar.f38821c = 0;
        pVar.f38822d = intValue;
        this.f38791g = new C15018o(this.f38786a, pVar, this);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        mo27675a(z, this.f38787b.f38775g);
        this.f38797m.addView(this.f38791g, layoutParams);
    }

    /* renamed from: l */
    public final void mo27687l() {
        this.f38802r = true;
    }

    /* renamed from: a */
    public final void mo27675a(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44222aI)).booleanValue() && this.f38787b != null && this.f38787b.f38783o != null && this.f38787b.f38783o.f38863g;
        boolean z5 = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44223aJ)).booleanValue() && this.f38787b != null && this.f38787b.f38783o != null && this.f38787b.f38783o.f38864h;
        if (z && z2 && z4 && !z5) {
            new C16217rp(this.f38788c, "useCustomClose").mo31366a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f38791g != null) {
            C15018o oVar = this.f38791g;
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            oVar.mo27701a(z3);
        }
    }

    /* renamed from: m */
    public final void mo27688m() {
        this.f38797m.removeView(this.f38791g);
        m31025a(true);
    }

    /* renamed from: a */
    public final void mo27670a(int i) {
        if (this.f38786a.getApplicationInfo().targetSdkVersion >= ((Integer) caf.m37099d().mo30717a(C15740bx.f44342cW)).intValue()) {
            if (this.f38786a.getApplicationInfo().targetSdkVersion <= ((Integer) caf.m37099d().mo30717a(C15740bx.f44343cX)).intValue()) {
                if (VERSION.SDK_INT >= ((Integer) caf.m37099d().mo30717a(C15740bx.f44344cY)).intValue()) {
                    if (VERSION.SDK_INT <= ((Integer) caf.m37099d().mo30717a(C15740bx.f44345cZ)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.f38786a.setRequestedOrientation(i);
    }

    /* renamed from: a */
    public final void mo27673a(View view, CustomViewCallback customViewCallback) {
        this.f38793i = new FrameLayout(this.f38786a);
        this.f38793i.setBackgroundColor(-16777216);
        this.f38793i.addView(view, -1, -1);
        this.f38786a.setContentView(this.f38793i);
        this.f38802r = true;
        this.f38794j = customViewCallback;
        this.f38792h = true;
    }

    /* renamed from: b */
    private final void m31026b(boolean z) throws C15010g {
        if (!this.f38802r) {
            this.f38786a.requestWindowFeature(1);
        }
        Window window = this.f38786a.getWindow();
        if (window != null) {
            C14987bu buVar = null;
            anj w = this.f38787b.f38772d != null ? this.f38787b.f38772d.mo29197w() : null;
            boolean z2 = false;
            boolean b = w != null ? w.mo29216b() : false;
            this.f38798n = false;
            if (b) {
                if (this.f38787b.f38778j == 6) {
                    if (this.f38786a.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.f38798n = z2;
                } else if (this.f38787b.f38778j == 7) {
                    if (this.f38786a.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    this.f38798n = z2;
                }
            }
            boolean z3 = this.f38798n;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z3);
            abv.m32792b(sb.toString());
            mo27670a(this.f38787b.f38778j);
            window.setFlags(16777216, 16777216);
            abv.m32792b("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f38796l) {
                this.f38797m.setBackgroundColor(-16777216);
            } else {
                this.f38797m.setBackgroundColor(f38785e);
            }
            this.f38786a.setContentView(this.f38797m);
            this.f38802r = true;
            if (z) {
                try {
                    this.f38788c = amg.m33346a(this.f38786a, this.f38787b.f38772d != null ? this.f38787b.f38772d.mo29195u() : null, this.f38787b.f38772d != null ? this.f38787b.f38772d.mo29196v() : null, true, b, null, this.f38787b.f38781m, null, null, this.f38787b.f38772d != null ? this.f38787b.f38772d.mo28939e() : null, byc.m36979a());
                    anj w2 = this.f38788c.mo29197w();
                    C15927gw gwVar = this.f38787b.f38784p;
                    C15929gy gyVar = this.f38787b.f38773e;
                    C15023t tVar = this.f38787b.f38777i;
                    if (this.f38787b.f38772d != null) {
                        buVar = this.f38787b.f38772d.mo29197w().mo29202a();
                    }
                    w2.mo29211a(null, gwVar, null, gyVar, tVar, true, null, buVar, null, null);
                    this.f38788c.mo29197w().mo29207a((ank) new C15007d(this));
                    if (this.f38787b.f38780l != null) {
                        this.f38788c.loadUrl(this.f38787b.f38780l);
                    } else if (this.f38787b.f38776h != null) {
                        this.f38788c.loadDataWithBaseURL(this.f38787b.f38774f, this.f38787b.f38776h, "text/html", "UTF-8", null);
                    } else {
                        throw new C15010g("No URL or HTML to display in ad overlay.");
                    }
                    if (this.f38787b.f38772d != null) {
                        this.f38787b.f38772d.mo29159b(this);
                    }
                } catch (Exception e) {
                    abv.m32793b("Error obtaining webview.", e);
                    throw new C15010g("Could not obtain webview for the overlay.");
                }
            } else {
                this.f38788c = this.f38787b.f38772d;
                this.f38788c.mo29150a((Context) this.f38786a);
            }
            this.f38788c.mo29152a(this);
            if (this.f38787b.f38772d != null) {
                m31024a(this.f38787b.f38772d.mo29137A(), (View) this.f38797m);
            }
            ViewParent parent = this.f38788c.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f38788c.getView());
            }
            if (this.f38796l) {
                this.f38788c.mo29147K();
            }
            this.f38797m.addView(this.f38788c.getView(), -1, -1);
            if (!z && !this.f38798n) {
                m31028s();
            }
            m31025a(b);
            if (this.f38788c.mo29199y()) {
                mo27675a(b, true);
                return;
            }
            return;
        }
        throw new C15010g("Invalid activity, no window available.");
    }

    /* renamed from: r */
    private final void m31027r() {
        if (this.f38786a.isFinishing() && !this.f38803s) {
            this.f38803s = true;
            if (this.f38788c != null) {
                this.f38788c.mo29149a(this.f38789d);
                synchronized (this.f38799o) {
                    if (!this.f38801q && this.f38788c.mo29143G()) {
                        this.f38800p = new C15008e(this);
                        acd.f40245a.postDelayed(this.f38800p, ((Long) caf.m37099d().mo30717a(C15740bx.f44221aH)).longValue());
                        return;
                    }
                }
            }
            mo27689n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo27689n() {
        if (!this.f38804t) {
            this.f38804t = true;
            if (this.f38788c != null) {
                this.f38797m.removeView(this.f38788c.getView());
                if (this.f38790f != null) {
                    this.f38788c.mo29150a(this.f38790f.f38813d);
                    this.f38788c.mo29162b(false);
                    this.f38790f.f38812c.addView(this.f38788c.getView(), this.f38790f.f38810a, this.f38790f.f38811b);
                    this.f38790f = null;
                } else if (this.f38786a.getApplicationContext() != null) {
                    this.f38788c.mo29150a(this.f38786a.getApplicationContext());
                }
                this.f38788c = null;
            }
            if (!(this.f38787b == null || this.f38787b.f38771c == null)) {
                this.f38787b.f38771c.mo27592y_();
            }
            if (!(this.f38787b == null || this.f38787b.f38772d == null)) {
                m31024a(this.f38787b.f38772d.mo29137A(), this.f38787b.f38772d.getView());
            }
        }
    }

    /* renamed from: a */
    private static void m31024a(C14882b bVar, View view) {
        if (bVar != null && view != null) {
            C14963ax.m30845o().mo31371a(bVar, view);
        }
    }

    /* renamed from: o */
    public final void mo27690o() {
        if (this.f38798n) {
            this.f38798n = false;
            m31028s();
        }
    }

    /* renamed from: s */
    private final void m31028s() {
        this.f38788c.mo29184p();
    }

    /* renamed from: p */
    public final void mo27691p() {
        this.f38797m.f38808a = true;
    }

    /* renamed from: q */
    public final void mo27692q() {
        synchronized (this.f38799o) {
            this.f38801q = true;
            if (this.f38800p != null) {
                acd.f40245a.removeCallbacks(this.f38800p);
                acd.f40245a.post(this.f38800p);
            }
        }
    }

    /* renamed from: a */
    private final void m31023a(Configuration configuration) {
        boolean z = true;
        boolean z2 = false;
        boolean z3 = this.f38787b.f38783o != null && this.f38787b.f38783o.f38858b;
        boolean a = C14963ax.m30832b().mo28691a(this.f38786a, configuration);
        if ((this.f38796l && !z3) || a) {
            z = false;
        } else if (VERSION.SDK_INT >= 19 && this.f38787b.f38783o != null && this.f38787b.f38783o.f38862f) {
            z2 = true;
        }
        Window window = this.f38786a.getWindow();
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44224aK)).booleanValue() || VERSION.SDK_INT < 19) {
            if (z) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
                window.clearFlags(2048);
                if (VERSION.SDK_INT >= 19 && z2) {
                    window.getDecorView().setSystemUiVisibility(MessageCenter.MSG_CLINET_TO_SDK_FINISH_GAME);
                    return;
                }
            } else {
                window.addFlags(2048);
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            return;
        }
        View decorView = window.getDecorView();
        int i = UnReadVideoExperiment.BROWSE_RECORD_LIST;
        if (z) {
            i = 5380;
            if (z2) {
                i = 5894;
            }
        }
        decorView.setSystemUiVisibility(i);
    }
}
