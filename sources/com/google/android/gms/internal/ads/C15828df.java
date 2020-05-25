package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.df */
public final class C15828df extends C15882fe implements C15844du {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public C15839dq f44829a;

    /* renamed from: b */
    private String f44830b;

    /* renamed from: c */
    private List<C15827de> f44831c;

    /* renamed from: d */
    private String f44832d;

    /* renamed from: e */
    private C15865eo f44833e;

    /* renamed from: f */
    private String f44834f;

    /* renamed from: g */
    private double f44835g;

    /* renamed from: h */
    private String f44836h;

    /* renamed from: i */
    private String f44837i;

    /* renamed from: j */
    private C15819cx f44838j;

    /* renamed from: k */
    private Bundle f44839k;

    /* renamed from: l */
    private C15583ak f44840l;

    /* renamed from: m */
    private View f44841m;

    /* renamed from: n */
    private C14882b f44842n;

    /* renamed from: o */
    private String f44843o;

    /* renamed from: p */
    private final Object f44844p = new Object();

    public C15828df(String str, List<C15827de> list, String str2, C15865eo eoVar, String str3, double d, String str4, String str5, C15819cx cxVar, Bundle bundle, C15583ak akVar, View view, C14882b bVar, String str6) {
        this.f44830b = str;
        this.f44831c = list;
        this.f44832d = str2;
        this.f44833e = eoVar;
        this.f44834f = str3;
        this.f44835g = d;
        this.f44836h = str4;
        this.f44837i = str5;
        this.f44838j = cxVar;
        this.f44839k = bundle;
        this.f44840l = akVar;
        this.f44841m = view;
        this.f44842n = bVar;
        this.f44843o = str6;
    }

    /* renamed from: b */
    public final String mo30920b() {
        return "2";
    }

    /* renamed from: c */
    public final String mo30921c() {
        return "";
    }

    /* renamed from: a */
    public final String mo30934a() {
        return this.f44830b;
    }

    /* renamed from: f */
    public final List mo30938f() {
        return this.f44831c;
    }

    /* renamed from: g */
    public final String mo30939g() {
        return this.f44832d;
    }

    /* renamed from: h */
    public final C15865eo mo30940h() {
        return this.f44833e;
    }

    /* renamed from: i */
    public final String mo30941i() {
        return this.f44834f;
    }

    /* renamed from: j */
    public final double mo30942j() {
        return this.f44835g;
    }

    /* renamed from: k */
    public final String mo30943k() {
        return this.f44836h;
    }

    /* renamed from: l */
    public final String mo30944l() {
        return this.f44837i;
    }

    /* renamed from: m */
    public final C15583ak mo30945m() {
        return this.f44840l;
    }

    /* renamed from: n */
    public final C14882b mo30946n() {
        return C14886d.m30544a(this.f44829a);
    }

    /* renamed from: a */
    public final void mo30919a(C15839dq dqVar) {
        synchronized (this.f44844p) {
            this.f44829a = dqVar;
        }
    }

    /* renamed from: d */
    public final C15819cx mo30922d() {
        return this.f44838j;
    }

    /* renamed from: o */
    public final Bundle mo30947o() {
        return this.f44839k;
    }

    /* renamed from: e */
    public final View mo30923e() {
        return this.f44841m;
    }

    /* renamed from: p */
    public final C14882b mo30948p() {
        return this.f44842n;
    }

    /* renamed from: q */
    public final String mo30949q() {
        return this.f44843o;
    }

    /* renamed from: r */
    public final C15861ek mo30950r() {
        return this.f44838j;
    }

    /* renamed from: s */
    public final void mo30951s() {
        acd.f40245a.post(new C15829dg(this));
        this.f44830b = null;
        this.f44831c = null;
        this.f44832d = null;
        this.f44833e = null;
        this.f44834f = null;
        this.f44835g = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        this.f44836h = null;
        this.f44837i = null;
        this.f44838j = null;
        this.f44839k = null;
        this.f44840l = null;
        this.f44841m = null;
    }

    /* renamed from: a */
    public final void mo30935a(Bundle bundle) {
        synchronized (this.f44844p) {
            if (this.f44829a == null) {
                abv.m32794c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44829a.mo31035b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo30936b(Bundle bundle) {
        synchronized (this.f44844p) {
            if (this.f44829a == null) {
                abv.m32794c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f44829a.mo31034a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo30937c(Bundle bundle) {
        synchronized (this.f44844p) {
            if (this.f44829a == null) {
                abv.m32794c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f44829a.mo31037c(bundle);
            }
        }
    }
}
