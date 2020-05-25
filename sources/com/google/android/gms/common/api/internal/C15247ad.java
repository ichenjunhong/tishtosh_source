package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.internal.C15428c.C15431c;
import com.google.android.gms.common.internal.C15452k;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.ad */
final class C15247ad extends C15254ak {

    /* renamed from: a */
    final /* synthetic */ C15244aa f39360a;

    /* renamed from: b */
    private final Map<C15222f, C15246ac> f39361b;

    public C15247ad(C15244aa aaVar, Map<C15222f, C15246ac> map) {
        this.f39360a = aaVar;
        super(aaVar, null);
        this.f39361b = map;
    }

    /* renamed from: a */
    public final void mo28164a() {
        C15452k kVar = new C15452k(this.f39360a.f39344j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C15222f fVar : this.f39361b.keySet()) {
            if (!((C15246ac) this.f39361b.get(fVar)).f39357a) {
                arrayList.add(fVar);
            } else {
                arrayList2.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                i = kVar.mo28444a(this.f39360a.f39343i, (C15222f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList2;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                i = kVar.mo28444a(this.f39360a.f39343i, (C15222f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f39360a.f39335a.mo28186a((C15266aw) new C15248ae(this, this.f39360a, new ConnectionResult(i, null)));
            return;
        }
        if (this.f39360a.f39336b) {
            this.f39360a.f39351q.mo33400t();
        }
        for (C15222f fVar2 : this.f39361b.keySet()) {
            C15431c cVar = (C15431c) this.f39361b.get(fVar2);
            if (kVar.mo28444a(this.f39360a.f39343i, fVar2) != 0) {
                this.f39360a.f39335a.mo28186a((C15266aw) new C15249af(this, this.f39360a, cVar));
            } else {
                fVar2.mo28069a(cVar);
            }
        }
    }
}
