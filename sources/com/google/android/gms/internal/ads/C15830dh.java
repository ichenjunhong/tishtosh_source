package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.dh */
public final class C15830dh extends C15886fi implements C15844du {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public C15839dq f44846a;

    /* renamed from: b */
    private String f44847b;

    /* renamed from: c */
    private List<C15827de> f44848c;

    /* renamed from: d */
    private String f44849d;

    /* renamed from: e */
    private C15865eo f44850e;

    /* renamed from: f */
    private String f44851f;

    /* renamed from: g */
    private String f44852g;

    /* renamed from: h */
    private C15819cx f44853h;

    /* renamed from: i */
    private Bundle f44854i;

    /* renamed from: j */
    private C15583ak f44855j;

    /* renamed from: k */
    private View f44856k;

    /* renamed from: l */
    private C14882b f44857l;

    /* renamed from: m */
    private String f44858m;

    /* renamed from: n */
    private final Object f44859n = new Object();

    public C15830dh(String str, List<C15827de> list, String str2, C15865eo eoVar, String str3, String str4, C15819cx cxVar, Bundle bundle, C15583ak akVar, View view, C14882b bVar, String str5) {
        this.f44847b = str;
        this.f44848c = list;
        this.f44849d = str2;
        this.f44850e = eoVar;
        this.f44851f = str3;
        this.f44852g = str4;
        this.f44853h = cxVar;
        this.f44854i = bundle;
        this.f44855j = akVar;
        this.f44856k = view;
        this.f44857l = bVar;
        this.f44858m = str5;
    }

    /* renamed from: b */
    public final String mo30920b() {
        return "1";
    }

    /* renamed from: c */
    public final String mo30921c() {
        return "";
    }

    /* renamed from: a */
    public final String mo30953a() {
        return this.f44847b;
    }

    /* renamed from: g */
    public final C14882b mo30957g() {
        return this.f44857l;
    }

    /* renamed from: h */
    public final String mo30958h() {
        return this.f44858m;
    }

    /* renamed from: f */
    public final List mo30938f() {
        return this.f44848c;
    }

    /* renamed from: i */
    public final String mo30959i() {
        return this.f44849d;
    }

    /* renamed from: j */
    public final C15865eo mo30960j() {
        return this.f44850e;
    }

    /* renamed from: k */
    public final String mo30961k() {
        return this.f44851f;
    }

    /* renamed from: l */
    public final String mo30962l() {
        return this.f44852g;
    }

    /* renamed from: m */
    public final C15583ak mo30963m() {
        return this.f44855j;
    }

    /* renamed from: n */
    public final C14882b mo30964n() {
        return C14886d.m30544a(this.f44846a);
    }

    /* renamed from: a */
    public final void mo30919a(C15839dq dqVar) {
        synchronized (this.f44859n) {
            this.f44846a = dqVar;
        }
    }

    /* renamed from: d */
    public final C15819cx mo30922d() {
        return this.f44853h;
    }

    /* renamed from: o */
    public final Bundle mo30965o() {
        return this.f44854i;
    }

    /* renamed from: e */
    public final View mo30923e() {
        return this.f44856k;
    }

    /* renamed from: p */
    public final C15861ek mo30966p() {
        return this.f44853h;
    }

    /* renamed from: q */
    public final void mo30967q() {
        acd.f40245a.post(new C15831di(this));
        this.f44847b = null;
        this.f44848c = null;
        this.f44849d = null;
        this.f44850e = null;
        this.f44851f = null;
        this.f44852g = null;
        this.f44853h = null;
        this.f44854i = null;
        this.f44855j = null;
        this.f44856k = null;
    }

    /* renamed from: a */
    public final void mo30954a(Bundle bundle) {
        synchronized (this.f44859n) {
            if (this.f44846a == null) {
                abv.m32794c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44846a.mo31035b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo30955b(Bundle bundle) {
        synchronized (this.f44859n) {
            if (this.f44846a == null) {
                abv.m32794c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f44846a.mo31034a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo30956c(Bundle bundle) {
        synchronized (this.f44859n) {
            if (this.f44846a == null) {
                abv.m32794c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f44846a.mo31037c(bundle);
            }
        }
    }
}
