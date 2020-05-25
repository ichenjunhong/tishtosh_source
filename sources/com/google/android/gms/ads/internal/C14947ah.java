package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15828df;
import com.google.android.gms.internal.ads.C15830dh;
import com.google.android.gms.internal.ads.C15835dm;
import com.google.android.gms.internal.ads.C15843dt;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abv;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.ah */
final class C14947ah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15843dt f38532a;

    /* renamed from: b */
    private final /* synthetic */ int f38533b;

    /* renamed from: c */
    private final /* synthetic */ List f38534c;

    /* renamed from: d */
    private final /* synthetic */ abc f38535d;

    /* renamed from: e */
    private final /* synthetic */ C14943ad f38536e;

    C14947ah(C14943ad adVar, C15843dt dtVar, int i, List list, abc abc) {
        this.f38536e = adVar;
        this.f38532a = dtVar;
        this.f38533b = i;
        this.f38534c = list;
        this.f38535d = abc;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.f38532a instanceof C15830dh) && this.f38536e.f38501e.f38646t != null) {
                C14943ad adVar = this.f38536e;
                if (this.f38533b != this.f38534c.size() - 1) {
                    z = true;
                }
                adVar.f38499c = z;
                C15835dm a = C14943ad.m30743b(this.f38532a);
                this.f38536e.f38501e.f38646t.mo31081a(a);
                this.f38536e.mo27524a(a.mo30999q());
            } else if ((this.f38532a instanceof C15830dh) && this.f38536e.f38501e.f38645s != null) {
                C14943ad adVar2 = this.f38536e;
                if (this.f38533b != this.f38534c.size() - 1) {
                    z = true;
                }
                adVar2.f38499c = z;
                C15830dh dhVar = (C15830dh) this.f38532a;
                this.f38536e.f38501e.f38645s.mo31077a(dhVar);
                this.f38536e.mo27524a(dhVar.mo30964n());
            } else if ((this.f38532a instanceof C15828df) && this.f38536e.f38501e.f38646t != null) {
                C14943ad adVar3 = this.f38536e;
                if (this.f38533b != this.f38534c.size() - 1) {
                    z = true;
                }
                adVar3.f38499c = z;
                C15835dm a2 = C14943ad.m30743b(this.f38532a);
                this.f38536e.f38501e.f38646t.mo31081a(a2);
                this.f38536e.mo27524a(a2.mo30999q());
            } else if (!(this.f38532a instanceof C15828df) || this.f38536e.f38501e.f38644r == null) {
                C14943ad adVar4 = this.f38536e;
                if (this.f38533b != this.f38534c.size() - 1) {
                    z = true;
                }
                adVar4.mo27452a(3, z, this.f38535d.f40137i);
            } else {
                C14943ad adVar5 = this.f38536e;
                if (this.f38533b != this.f38534c.size() - 1) {
                    z = true;
                }
                adVar5.f38499c = z;
                C15828df dfVar = (C15828df) this.f38532a;
                this.f38536e.f38501e.f38644r.mo31075a(dfVar);
                this.f38536e.mo27524a(dfVar.mo30946n());
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
