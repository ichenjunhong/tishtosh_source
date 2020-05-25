package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.p1452a;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23899b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.e.a.a.b */
public abstract class C23895b {

    /* renamed from: a */
    public C29059c f63565a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo49501a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo49502b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo49503c() {
        return 0;
    }

    /* renamed from: d */
    public final long mo49504d() {
        String a = C23908c.m58638a(this.f63565a);
        boolean z = true;
        C23903b bVar = new C23903b(null, C39629l.m88232a().mo58577h().mo49488b().mo49537b(), 1, null);
        if (a.length() <= 0) {
            z = false;
        }
        if (z) {
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) bVar);
            aVar.mo49507a(a);
        }
        return bVar.f63571a + 0 + mo49501a() + mo49502b() + mo49503c();
    }

    public C23895b(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        this.f63565a = cVar;
    }

    /* renamed from: a */
    protected static long m58613a(String str) {
        if (C23899b.m58625a((Object) str)) {
            return C39629l.m88232a().mo58577h().mo49489c().mo49496b(str).length();
        }
        return 0;
    }
}
