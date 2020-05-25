package android.support.p043v7.widget;

import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0785g;
import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0797b;
import android.support.p043v7.widget.RecyclerView.C1327f.C1329b;
import android.support.p043v7.widget.RecyclerView.C1352v;

/* renamed from: android.support.v7.widget.bi */
final class C1464bi {

    /* renamed from: a */
    final C0777a<C1352v, C1465a> f5285a = new C0777a<>();

    /* renamed from: b */
    final C0785g<C1352v> f5286b = new C0785g<>();

    /* renamed from: android.support.v7.widget.bi$a */
    static class C1465a {

        /* renamed from: d */
        static C0796a<C1465a> f5287d = new C0797b(20);

        /* renamed from: a */
        int f5288a;

        /* renamed from: b */
        C1329b f5289b;

        /* renamed from: c */
        C1329b f5290c;

        private C1465a() {
        }

        /* renamed from: a */
        static C1465a m5131a() {
            C1465a aVar = (C1465a) f5287d.acquire();
            if (aVar == null) {
                return new C1465a();
            }
            return aVar;
        }

        /* renamed from: a */
        static void m5132a(C1465a aVar) {
            aVar.f5288a = 0;
            aVar.f5289b = null;
            aVar.f5290c = null;
            f5287d.release(aVar);
        }
    }

    /* renamed from: android.support.v7.widget.bi$b */
    interface C1466b {
        /* renamed from: a */
        void mo4926a(C1352v vVar);

        /* renamed from: a */
        void mo4927a(C1352v vVar, C1329b bVar, C1329b bVar2);

        /* renamed from: b */
        void mo4928b(C1352v vVar, C1329b bVar, C1329b bVar2);

        /* renamed from: c */
        void mo4929c(C1352v vVar, C1329b bVar, C1329b bVar2);
    }

    C1464bi() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5714a() {
        this.f5285a.clear();
        this.f5286b.mo2495c();
    }

    /* renamed from: h */
    public final void mo5727h(C1352v vVar) {
        mo5725f(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1329b mo5719b(C1352v vVar) {
        return m5115a(vVar, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C1329b mo5721c(C1352v vVar) {
        return m5115a(vVar, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1352v mo5713a(long j) {
        return (C1352v) this.f5286b.mo2487a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo5723d(C1352v vVar) {
        C1465a aVar = (C1465a) this.f5285a.get(vVar);
        if (aVar == null || (aVar.f5288a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo5724e(C1352v vVar) {
        C1465a aVar = (C1465a) this.f5285a.get(vVar);
        if (aVar == null) {
            aVar = C1465a.m5131a();
            this.f5285a.put(vVar, aVar);
        }
        aVar.f5288a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo5725f(C1352v vVar) {
        C1465a aVar = (C1465a) this.f5285a.get(vVar);
        if (aVar != null) {
            aVar.f5288a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo5726g(C1352v vVar) {
        int b = this.f5286b.mo2490b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (vVar == this.f5286b.mo2494c(b)) {
                this.f5286b.mo2489a(b);
                break;
            } else {
                b--;
            }
        }
        C1465a aVar = (C1465a) this.f5285a.remove(vVar);
        if (aVar != null) {
            C1465a.m5132a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5717a(C1466b bVar) {
        for (int size = this.f5285a.size() - 1; size >= 0; size--) {
            C1352v vVar = (C1352v) this.f5285a.mo2576b(size);
            C1465a aVar = (C1465a) this.f5285a.mo2581d(size);
            if ((aVar.f5288a & 3) == 3) {
                bVar.mo4926a(vVar);
            } else if ((aVar.f5288a & 1) != 0) {
                if (aVar.f5289b == null) {
                    bVar.mo4926a(vVar);
                } else {
                    bVar.mo4927a(vVar, aVar.f5289b, aVar.f5290c);
                }
            } else if ((aVar.f5288a & 14) == 14) {
                bVar.mo4928b(vVar, aVar.f5289b, aVar.f5290c);
            } else if ((aVar.f5288a & 12) == 12) {
                bVar.mo4929c(vVar, aVar.f5289b, aVar.f5290c);
            } else if ((aVar.f5288a & 4) != 0) {
                bVar.mo4927a(vVar, aVar.f5289b, null);
            } else if ((aVar.f5288a & 8) != 0) {
                bVar.mo4928b(vVar, aVar.f5289b, aVar.f5290c);
            }
            C1465a.m5132a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5718a(C1352v vVar) {
        C1465a aVar = (C1465a) this.f5285a.get(vVar);
        if (aVar == null || (aVar.f5288a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5715a(long j, C1352v vVar) {
        this.f5286b.mo2493b(j, vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5720b(C1352v vVar, C1329b bVar) {
        C1465a aVar = (C1465a) this.f5285a.get(vVar);
        if (aVar == null) {
            aVar = C1465a.m5131a();
            this.f5285a.put(vVar, aVar);
        }
        aVar.f5288a |= 2;
        aVar.f5289b = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5722c(C1352v vVar, C1329b bVar) {
        C1465a aVar = (C1465a) this.f5285a.get(vVar);
        if (aVar == null) {
            aVar = C1465a.m5131a();
            this.f5285a.put(vVar, aVar);
        }
        aVar.f5290c = bVar;
        aVar.f5288a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5716a(C1352v vVar, C1329b bVar) {
        C1465a aVar = (C1465a) this.f5285a.get(vVar);
        if (aVar == null) {
            aVar = C1465a.m5131a();
            this.f5285a.put(vVar, aVar);
        }
        aVar.f5289b = bVar;
        aVar.f5288a |= 4;
    }

    /* renamed from: a */
    private C1329b m5115a(C1352v vVar, int i) {
        C1329b bVar;
        int a = this.f5285a.mo2573a((Object) vVar);
        if (a < 0) {
            return null;
        }
        C1465a aVar = (C1465a) this.f5285a.mo2577c(a);
        if (aVar == null || (aVar.f5288a & i) == 0) {
            return null;
        }
        aVar.f5288a &= i ^ -1;
        if (i == 4) {
            bVar = aVar.f5289b;
        } else if (i == 8) {
            bVar = aVar.f5290c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((aVar.f5288a & 12) == 0) {
            this.f5285a.mo2581d(a);
            C1465a.m5132a(aVar);
        }
        return bVar;
    }
}
