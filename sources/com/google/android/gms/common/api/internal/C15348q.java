package com.google.android.gms.common.api.internal;

import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15228c;
import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.p1033b.C15179g;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C15348q implements C15175c<Map<C15306cf<?>, String>> {

    /* renamed from: a */
    private C15342k f39628a;

    /* renamed from: b */
    private final /* synthetic */ C15322cu f39629b;

    C15348q(C15322cu cuVar, C15342k kVar) {
        this.f39629b = cuVar;
        this.f39628a = kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28294a() {
        this.f39628a.mo27961f();
    }

    /* renamed from: a */
    public final void mo26975a(C15179g<Map<C15306cf<?>, String>> gVar) {
        this.f39629b.f39543g.lock();
        try {
            if (!this.f39629b.f39538b) {
                this.f39628a.mo27961f();
                return;
            }
            if (gVar.mo28000b()) {
                this.f39629b.f39552p = new C0777a(this.f39629b.f39540d.size());
                for (C15321ct ctVar : this.f39629b.f39540d.values()) {
                    this.f39629b.f39552p.put(ctVar.f39286d, ConnectionResult.f39245a);
                }
            } else if (gVar.mo28003e() instanceof C15228c) {
                C15228c cVar = (C15228c) gVar.mo28003e();
                if (this.f39629b.f39549m) {
                    this.f39629b.f39552p = new C0777a(this.f39629b.f39540d.size());
                    for (C15321ct ctVar2 : this.f39629b.f39540d.values()) {
                        C15306cf<O> cfVar = ctVar2.f39286d;
                        ConnectionResult connectionResult = cVar.getConnectionResult(ctVar2);
                        if (this.f39629b.m31795a(ctVar2, connectionResult)) {
                            this.f39629b.f39552p.put(cfVar, new ConnectionResult(16));
                        } else {
                            this.f39629b.f39552p.put(cfVar, connectionResult);
                        }
                    }
                } else {
                    this.f39629b.f39552p = cVar.zaj();
                }
            } else {
                this.f39629b.f39552p = Collections.emptyMap();
            }
            if (this.f39629b.mo28192e()) {
                this.f39629b.f39551o.putAll(this.f39629b.f39552p);
                if (this.f39629b.m31811k() == null) {
                    this.f39629b.m31807i();
                    this.f39629b.m31809j();
                    this.f39629b.f39546j.signalAll();
                }
            }
            this.f39628a.mo27961f();
            this.f39629b.f39543g.unlock();
        } finally {
            this.f39629b.f39543g.unlock();
        }
    }
}
