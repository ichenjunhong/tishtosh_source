package com.p683ss.android.ugc.aweme.account.login.sms;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import com.google.android.gms.auth.api.p1032a.C15109a;
import com.google.android.gms.internal.p1041b.C16470h;
import com.google.android.gms.p1033b.C15175c;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.account.util.C22276p;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.e */
public final class C21464e {

    /* renamed from: a */
    static final boolean f58230a = false;

    /* renamed from: b */
    public C0198r<String> f58231b = new C0198r<>();

    /* renamed from: c */
    boolean f58232c;

    /* renamed from: d */
    int f58233d;

    /* renamed from: e */
    private Context f58234e;

    /* renamed from: f */
    private SmsBroadcastReceiver f58235f;

    /* renamed from: g */
    private C15109a f58236g;

    /* renamed from: h */
    private boolean f58237h;

    /* renamed from: d */
    private boolean m54099d() {
        this.f58233d = C22299f.m55186b(this.f58234e);
        this.f58232c = C22276p.m55133a(this.f58234e);
        if (!this.f58232c || this.f58233d != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo45647a() {
        if (!this.f58237h) {
            m54098a(false, "Feature cannot be used", this.f58232c, this.f58233d);
        } else {
            this.f58236g.mo27862a().mo27991a((C15175c<TResult>) new C21465f<TResult>(this));
        }
    }

    /* renamed from: b */
    public final void mo45648b() {
        if (this.f58237h) {
            if (this.f58235f == null) {
                this.f58235f = new SmsBroadcastReceiver(this.f58234e, this.f58231b);
            }
            this.f58235f.mo45635a();
        }
    }

    /* renamed from: c */
    public final void mo45649c() {
        if (m54099d() && this.f58235f != null) {
            this.f58235f.mo45636b();
        }
    }

    public C21464e(Context context) {
        this.f58234e = context;
        this.f58236g = new C16470h(context);
        this.f58237h = m54099d();
    }

    /* renamed from: a */
    static void m54098a(boolean z, String str, boolean z2, int i) {
        C20994a.m53368b(false, str, z2, i);
        C22087a.m54863a(false, str, z2, i);
        C26890h.m65011a("sms_auto_fill", new C20856a().mo44774a("is_successful", 0).mo44776a("error_desc", str).mo44774a("has_sim_card", z2 ? 1 : 0).mo44774a("google_availability", i).f56798a);
    }
}
