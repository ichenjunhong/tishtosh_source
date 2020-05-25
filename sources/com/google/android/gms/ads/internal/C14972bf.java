package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15948hq;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16218rq;
import com.google.android.gms.internal.ads.C16243so;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16442zy;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amg;
import com.google.android.gms.internal.ads.amk;
import com.google.android.gms.internal.ads.anp;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyz;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.bf */
public abstract class C14972bf extends C14967ba implements C14996h, C16218rq {

    /* renamed from: j */
    private boolean f38664j;

    public C14972bf(Context context, zzyz zzyz, String str, C16134on onVar, zzbgz zzbgz, C14986bt btVar) {
        super(context, zzyz, str, onVar, zzbgz, btVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ama mo27600a(abc abc, C14987bu buVar, C16442zy zyVar) throws amk {
        abc abc2 = abc;
        View nextView = this.f38501e.f38632f.getNextView();
        if (nextView instanceof ama) {
            ((ama) nextView).destroy();
        }
        if (nextView != null) {
            this.f38501e.f38632f.removeView(nextView);
        }
        ama a = amg.m33346a(this.f38501e.f38629c, anp.m33673a(this.f38501e.f38635i), this.f38501e.f38635i.f46338a, false, false, this.f38501e.f38630d, this.f38501e.f38631e, this.f38497a, this, this.f38505i, abc2.f40137i);
        if (this.f38501e.f38635i.f46344g == null) {
            mo27453a(a.getView());
        }
        a.mo29197w().mo29211a(this, this, this, this, this, false, null, buVar, this, zyVar);
        mo27602a(a);
        a.mo29160b(abc2.f40129a.f46151v);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27602a(ama ama) {
        ama.mo29157a("/trackActiveViewUnit", (C15948hq<? super ama>) new C14973bg<Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo27499u() {
        super.mo27499u();
        if (this.f38664j) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44284bR)).booleanValue()) {
                mo27604b(this.f38501e.f38636j.f40104b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27604b(ama ama) {
        if (this.f38501e.f38636j != null) {
            this.f38503g.mo30744a(this.f38501e.f38635i, this.f38501e.f38636j, ama.getView(), ama);
            this.f38664j = false;
            return;
        }
        this.f38664j = true;
        abv.m32798e("Request to enable ActiveView before adState is available.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27455a(abc abc, C15806ck ckVar) {
        if (abc.f40133e != -2) {
            acd.f40245a.post(new C14974bh(this, abc));
            return;
        }
        if (abc.f40132d != null) {
            this.f38501e.f38635i = abc.f40132d;
        }
        if (!abc.f40130b.f46189g || abc.f40130b.f46208z) {
            acd.f40245a.post(new C14975bi(this, abc, this.f38505i.f38691c.mo31556a(this.f38501e.f38629c, this.f38501e.f38631e, abc.f40130b), ckVar));
            return;
        }
        this.f38501e.f38618L = 0;
        this.f38501e.f38634h = C16243so.m38791a(this.f38501e.f38629c, this, abc, this.f38501e.f38630d, null, this.f38659o, this, ckVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27477a(abb abb, abb abb2) {
        if (this.f38501e.mo27568c() && this.f38501e.f38632f != null) {
            this.f38501e.f38632f.f38653a.f40271b = abb2.f40082A;
        }
        try {
            if (abb2.f40104b != null && !abb2.f40116n && abb2.f40094M && !abb2.f40103a.f46319c.containsKey("sdk_less_server_data")) {
                try {
                    abb2.f40104b.mo29148L();
                } catch (Throwable unused) {
                    abv.m32494a("Could not render test Ad label.");
                }
            }
        } catch (RuntimeException unused2) {
            abv.m32494a("Could not render test AdLabel.");
        }
        if (!(abb2 == null || abb2.f40104b == null)) {
            abb2.f40104b.mo29167f(abb2.f40097P);
        }
        return super.mo27477a(abb, abb2);
    }

    /* renamed from: a */
    public final void mo27459a(C15813cr crVar) {
        C15464q.m32132b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f38501e.f38610D = crVar;
    }

    /* renamed from: a_ */
    public final void mo27603a_(View view) {
        this.f38501e.f38617K = view;
        abb abb = new abb(this.f38501e.f38637k, null, null, null, null, null, null, null);
        mo27479b(abb);
    }

    /* renamed from: z_ */
    public final void mo27605z_() {
        mo27201e();
    }

    /* renamed from: A_ */
    public final void mo27597A_() {
        mo27582Z();
        mo27489k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final boolean mo27598J() {
        return (this.f38501e.f38637k == null || this.f38501e.f38637k.f40130b == null || !this.f38501e.f38637k.f40130b.f46172Q) ? false : true;
    }

    /* renamed from: a */
    public final void mo27601a(int i, int i2, int i3, int i4) {
        mo27498t();
    }

    /* renamed from: K */
    public final void mo27599K() {
        mo27496r();
    }
}
