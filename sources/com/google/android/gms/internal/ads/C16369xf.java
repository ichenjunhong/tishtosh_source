package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xf */
final class C16369xf implements Callable<C16365xb> {

    /* renamed from: a */
    private final /* synthetic */ Context f45955a;

    /* renamed from: b */
    private final /* synthetic */ C16368xe f45956b;

    C16369xf(C16368xe xeVar, Context context) {
        this.f45956b = xeVar;
        this.f45955a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        C16365xb xbVar;
        C16370xg xgVar = (C16370xg) this.f45956b.f45954a.get(this.f45955a);
        if (xgVar != null) {
            if (!(xgVar.f45957a + ((Long) caf.m37099d().mo30717a(C15740bx.f44303bk)).longValue() < C14963ax.m30837g().mo28523a())) {
                xbVar = new C16366xc(this.f45955a, xgVar.f45958b).mo31464a();
                this.f45956b.f45954a.put(this.f45955a, new C16370xg(this.f45956b, xbVar));
                return xbVar;
            }
        }
        xbVar = new C16366xc(this.f45955a).mo31464a();
        this.f45956b.f45954a.put(this.f45955a, new C16370xg(this.f45956b, xbVar));
        return xbVar;
    }
}
