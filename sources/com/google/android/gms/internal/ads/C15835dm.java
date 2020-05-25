package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.dm */
public final class C15835dm extends C15915gk implements C15844du {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public C15839dq f44871a;

    /* renamed from: b */
    private String f44872b;

    /* renamed from: c */
    private List<C15827de> f44873c;

    /* renamed from: d */
    private List<Object> f44874d;

    /* renamed from: e */
    private boolean f44875e;

    /* renamed from: f */
    private String f44876f;

    /* renamed from: g */
    private C15865eo f44877g;

    /* renamed from: h */
    private String f44878h;

    /* renamed from: i */
    private String f44879i;

    /* renamed from: j */
    private double f44880j;

    /* renamed from: k */
    private String f44881k;

    /* renamed from: l */
    private String f44882l;

    /* renamed from: m */
    private C15819cx f44883m;

    /* renamed from: n */
    private C15583ak f44884n;

    /* renamed from: o */
    private View f44885o;

    /* renamed from: p */
    private C14882b f44886p;

    /* renamed from: q */
    private String f44887q;

    /* renamed from: r */
    private Bundle f44888r;

    /* renamed from: s */
    private final Object f44889s = new Object();

    public C15835dm(String str, List<C15827de> list, String str2, C15865eo eoVar, String str3, String str4, double d, String str5, String str6, C15819cx cxVar, C15583ak akVar, View view, C14882b bVar, String str7, Bundle bundle) {
        this.f44872b = str;
        this.f44873c = list;
        this.f44874d = null;
        this.f44875e = false;
        this.f44876f = str2;
        this.f44877g = eoVar;
        this.f44878h = str3;
        this.f44879i = str4;
        this.f44880j = d;
        this.f44881k = str5;
        this.f44882l = str6;
        this.f44883m = cxVar;
        this.f44884n = akVar;
        this.f44885o = view;
        this.f44886p = bVar;
        this.f44887q = str7;
        this.f44888r = bundle;
    }

    /* renamed from: a */
    public final void mo30984a(C15569ae aeVar) {
    }

    /* renamed from: a */
    public final void mo30985a(C15573ag agVar) {
    }

    /* renamed from: b */
    public final String mo30920b() {
        return "6";
    }

    /* renamed from: c */
    public final String mo30921c() {
        return "";
    }

    /* renamed from: g */
    public final List mo30989g() {
        return null;
    }

    /* renamed from: h */
    public final boolean mo30990h() {
        return false;
    }

    /* renamed from: a */
    public final String mo30982a() {
        return this.f44872b;
    }

    /* renamed from: f */
    public final List mo30938f() {
        return this.f44873c;
    }

    /* renamed from: i */
    public final String mo30991i() {
        return this.f44876f;
    }

    /* renamed from: j */
    public final C15865eo mo30992j() {
        return this.f44877g;
    }

    /* renamed from: k */
    public final String mo30993k() {
        return this.f44878h;
    }

    /* renamed from: l */
    public final String mo30994l() {
        return this.f44879i;
    }

    /* renamed from: m */
    public final double mo30995m() {
        return this.f44880j;
    }

    /* renamed from: n */
    public final String mo30996n() {
        return this.f44881k;
    }

    /* renamed from: o */
    public final String mo30997o() {
        return this.f44882l;
    }

    /* renamed from: p */
    public final C15583ak mo30998p() {
        return this.f44884n;
    }

    /* renamed from: q */
    public final C14882b mo30999q() {
        return C14886d.m30544a(this.f44871a);
    }

    /* renamed from: a */
    public final void mo30919a(C15839dq dqVar) {
        synchronized (this.f44889s) {
            this.f44871a = dqVar;
        }
    }

    /* renamed from: d */
    public final C15819cx mo30922d() {
        return this.f44883m;
    }

    /* renamed from: e */
    public final View mo30923e() {
        return this.f44885o;
    }

    /* renamed from: r */
    public final C14882b mo31000r() {
        return this.f44886p;
    }

    /* renamed from: s */
    public final String mo31001s() {
        return this.f44887q;
    }

    /* renamed from: t */
    public final Bundle mo31002t() {
        return this.f44888r;
    }

    /* renamed from: u */
    public final C15861ek mo31003u() {
        return this.f44883m;
    }

    /* renamed from: v */
    public final void mo31004v() {
        acd.f40245a.post(new C15836dn(this));
    }

    /* renamed from: a */
    public final void mo30983a(Bundle bundle) {
        synchronized (this.f44889s) {
            if (this.f44871a == null) {
                abv.m32794c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44871a.mo31035b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo30987b(Bundle bundle) {
        synchronized (this.f44889s) {
            if (this.f44871a == null) {
                abv.m32794c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f44871a.mo31034a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo30988c(Bundle bundle) {
        synchronized (this.f44889s) {
            if (this.f44871a == null) {
                abv.m32794c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f44871a.mo31037c(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo30986a(C15912gh ghVar) {
        this.f44871a.mo31016a(ghVar);
    }

    /* renamed from: w */
    public final void mo31005w() {
        synchronized (this.f44889s) {
            if (this.f44871a != null) {
                this.f44871a.mo31023f();
            }
        }
    }

    /* renamed from: x */
    public final void mo31006x() {
        synchronized (this.f44889s) {
            if (this.f44871a != null) {
                this.f44871a.mo31024g();
            }
        }
    }

    /* renamed from: y */
    public final void mo31007y() {
        this.f44871a.mo31021d();
    }
}
