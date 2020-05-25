package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import java.io.File;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.bp.f.f */
public final class C23921f extends C23910a {

    /* renamed from: b */
    public static final C23922a f63588b = new C23922a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.f.f$a */
    public static final class C23922a {
        private C23922a() {
        }

        public /* synthetic */ C23922a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    public final String mo49513e() {
        return "av-mvtheme";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "mv-theme";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.RESOURCE;
    }

    /* renamed from: c */
    public final File mo23791c() {
        return C39629l.m88232a().mo58577h().mo49489c().mo49496b(C39630m.m88234a().mo58606d().mo80661a().mo80665b());
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
        C23903b bVar = new C23903b(C23908c.m58639a(), null, 2, null);
        if (mo23791c().exists()) {
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) bVar);
            aVar.mo49506a(mo23791c());
        }
        return bVar.f63571a + 0;
    }
}
