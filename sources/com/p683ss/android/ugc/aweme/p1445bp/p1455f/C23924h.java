package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.p2425e.C48557d;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.f.h */
public final class C23924h extends C23910a {
    /* renamed from: e */
    public final String mo49513e() {
        return "av-music";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "music-res";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.RESOURCE;
    }

    /* renamed from: c */
    public final File mo23791c() {
        C48557d a = C48557d.m105031a();
        C52711k.m112236a((Object) a, "MusicProviderConfig.getInstance()");
        String b = a.mo96062b();
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        C52711k.m112236a((Object) b, "resDir");
        return c.mo49496b(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        if (!mo23791c().exists()) {
            return true;
        }
        C23906d dVar = new C23906d(C23908c.m58639a(), null, 2, null);
        C23900a aVar = new C23900a();
        aVar.mo49505a((C23905c) dVar);
        aVar.mo49506a(mo23791c());
        dVar.mo49510a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo49519k() {
        C23903b bVar = new C23903b(null, null, 3, null);
        if (mo23791c().exists()) {
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) bVar);
            aVar.mo49506a(mo23791c());
        }
        return bVar.f63571a + 0;
    }
}
