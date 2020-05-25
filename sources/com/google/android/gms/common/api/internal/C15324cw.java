package com.google.android.gms.common.api.internal;

import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15228c;
import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.p1033b.C15179g;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.cw */
final class C15324cw implements C15175c<Map<C15306cf<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C15322cu f39555a;

    private C15324cw(C15322cu cuVar) {
        this.f39555a = cuVar;
    }

    /* renamed from: a */
    public final void mo26975a(C15179g<Map<C15306cf<?>, String>> gVar) {
        this.f39555a.f39543g.lock();
        try {
            if (this.f39555a.f39538b) {
                if (gVar.mo28000b()) {
                    this.f39555a.f39551o = new C0777a(this.f39555a.f39539c.size());
                    for (C15321ct ctVar : this.f39555a.f39539c.values()) {
                        this.f39555a.f39551o.put(ctVar.f39286d, ConnectionResult.f39245a);
                    }
                } else if (gVar.mo28003e() instanceof C15228c) {
                    C15228c cVar = (C15228c) gVar.mo28003e();
                    if (this.f39555a.f39549m) {
                        this.f39555a.f39551o = new C0777a(this.f39555a.f39539c.size());
                        for (C15321ct ctVar2 : this.f39555a.f39539c.values()) {
                            C15306cf<O> cfVar = ctVar2.f39286d;
                            ConnectionResult connectionResult = cVar.getConnectionResult(ctVar2);
                            if (this.f39555a.m31795a(ctVar2, connectionResult)) {
                                this.f39555a.f39551o.put(cfVar, new ConnectionResult(16));
                            } else {
                                this.f39555a.f39551o.put(cfVar, connectionResult);
                            }
                        }
                    } else {
                        this.f39555a.f39551o = cVar.zaj();
                    }
                    this.f39555a.f39554r = this.f39555a.m31811k();
                } else {
                    this.f39555a.f39551o = Collections.emptyMap();
                    this.f39555a.f39554r = new ConnectionResult(8);
                }
                if (this.f39555a.f39552p != null) {
                    this.f39555a.f39551o.putAll(this.f39555a.f39552p);
                    this.f39555a.f39554r = this.f39555a.m31811k();
                }
                if (this.f39555a.f39554r == null) {
                    this.f39555a.m31807i();
                    this.f39555a.m31809j();
                } else {
                    this.f39555a.f39538b = false;
                    this.f39555a.f39537a.mo28170a(this.f39555a.f39554r);
                }
                this.f39555a.f39546j.signalAll();
                this.f39555a.f39543g.unlock();
            }
        } finally {
            this.f39555a.f39543g.unlock();
        }
    }
}
