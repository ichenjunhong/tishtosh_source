package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.bp.f.i */
public final class C23925i extends C23910a {
    /* renamed from: e */
    public final String mo49513e() {
        return "av-moji";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "person-effect";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.RESOURCE;
    }

    /* renamed from: c */
    public final File mo23791c() {
        return C39629l.m88232a().mo58577h().mo49489c().mo49496b(C45841j.m99668a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        Keva.getRepo("personal_effect").clear();
        C48671i.f122310a.mo96264e(C45841j.m99668a());
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
