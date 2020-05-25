package com.google.android.gms.ads.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15807cl;
import com.google.android.gms.internal.ads.C16243so;
import com.google.android.gms.internal.ads.C16442zy;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amk;

/* renamed from: com.google.android.gms.ads.internal.bi */
final class C14975bi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ abc f38668a;

    /* renamed from: b */
    final /* synthetic */ C16442zy f38669b;

    /* renamed from: c */
    final /* synthetic */ C14972bf f38670c;

    /* renamed from: d */
    private final /* synthetic */ C15806ck f38671d;

    C14975bi(C14972bf bfVar, abc abc, C16442zy zyVar, C15806ck ckVar) {
        this.f38670c = bfVar;
        this.f38668a = abc;
        this.f38669b = zyVar;
        this.f38671d = ckVar;
    }

    public final void run() {
        if (this.f38668a.f40130b.f46200r && this.f38670c.f38501e.f38610D != null) {
            String str = null;
            if (this.f38668a.f40130b.f46182a != null) {
                str = Uri.parse(this.f38668a.f40130b.f46182a).buildUpon().query(null).build().toString();
            }
            C15807cl clVar = new C15807cl(this.f38670c, str, this.f38668a.f40130b.f46184b);
            this.f38670c.f38501e.f38618L = 1;
            try {
                this.f38670c.f38499c = false;
                this.f38670c.f38501e.f38610D.mo30910a(clVar);
                return;
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
                this.f38670c.f38499c = true;
            }
        }
        C14987bu buVar = new C14987bu(this.f38670c.f38501e.f38629c, this.f38669b, this.f38668a.f40130b.f46160E);
        try {
            ama a = this.f38670c.mo27600a(this.f38668a, buVar, this.f38669b);
            a.mo29167f(this.f38670c.f38501e.f38637k.f40130b.f46177V);
            a.setOnTouchListener(new C14977bk(this, buVar));
            a.setOnClickListener(new C14978bl(this, buVar));
            this.f38670c.f38501e.f38618L = 0;
            this.f38670c.f38501e.f38634h = C16243so.m38791a(this.f38670c.f38501e.f38629c, this.f38670c, this.f38668a, this.f38670c.f38501e.f38630d, a, this.f38670c.f38659o, this.f38670c, this.f38671d);
        } catch (amk e2) {
            abv.m32793b("Could not obtain webview.", e2);
            acd.f40245a.post(new C14976bj(this));
        }
    }
}
