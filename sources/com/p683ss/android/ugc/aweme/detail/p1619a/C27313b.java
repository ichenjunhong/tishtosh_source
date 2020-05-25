package com.p683ss.android.ugc.aweme.detail.p1619a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.detail.C27365i;
import com.p683ss.android.ugc.aweme.detail.C27383j;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.a.b */
public final class C27313b implements C27365i {

    /* renamed from: a */
    public final ViewGroup f72053a;

    /* renamed from: b */
    public final C27383j f72054b;

    /* renamed from: c */
    public boolean f72055c;

    /* renamed from: d */
    public boolean f72056d;

    /* renamed from: e */
    public final Context f72057e;

    /* renamed from: f */
    public final ViewGroup f72058f;

    /* renamed from: g */
    private boolean f72059g = true;

    /* renamed from: e */
    private boolean m65834e() {
        return this.f72059g;
    }

    /* renamed from: a */
    public final void mo55753a() {
        this.f72054b.mo55760b(C27386b.f72158a);
    }

    /* renamed from: b */
    public final void mo55756b() {
        this.f72054b.mo55759a(C27385a.f72157a);
    }

    /* renamed from: c */
    public final void mo55757c() {
        if (this.f72056d) {
            m65836g();
        } else {
            m65835f();
        }
    }

    /* renamed from: d */
    public final void mo55758d() {
        if (this.f72056d) {
            m65835f();
        } else {
            m65836g();
        }
    }

    /* renamed from: f */
    private void m65835f() {
        if (m65834e() && !this.f72055c) {
            this.f72053a.setVisibility(0);
            this.f72053a.startAnimation(C27312a.m65832a(false, 1, null));
            this.f72055c = true;
            this.f72054b.mo55759a(C27385a.f72157a);
        }
    }

    /* renamed from: g */
    private void m65836g() {
        if (m65834e() && this.f72055c) {
            this.f72054b.mo55760b(C27386b.f72158a);
            this.f72053a.startAnimation(C27312a.m65833b(false, 1, null));
            this.f72053a.setVisibility(8);
            this.f72055c = false;
        }
    }

    /* renamed from: a */
    public final void mo55754a(int i) {
        m65835f();
    }

    /* renamed from: a */
    public final void mo55755a(boolean z) {
        this.f72053a.setVisibility(8);
        this.f72059g = false;
    }

    public C27313b(Context context, ViewGroup viewGroup) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "viewGroup");
        this.f72057e = context;
        this.f72058f = viewGroup;
        View findViewById = this.f72058f.findViewById(R.id.csb);
        C52711k.m112236a((Object) findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        this.f72053a = (ViewGroup) findViewById;
        this.f72054b = new C27314c(this.f72057e, this.f72053a);
        this.f72055c = true;
    }
}
