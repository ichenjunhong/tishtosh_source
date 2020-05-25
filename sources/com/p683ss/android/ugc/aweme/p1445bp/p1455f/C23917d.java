package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import android.app.Application;
import com.p683ss.android.ugc.aweme.p1445bp.C23872a;
import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43360a;
import java.io.File;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.f.d */
public final class C23917d extends C23910a {

    /* renamed from: b */
    public static final C23918a f63586b = new C23918a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.f.d$a */
    public static final class C23918a {
        private C23918a() {
        }

        public /* synthetic */ C23918a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    public final String mo49513e() {
        return "av-effect";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "effect";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.RESOURCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo49516h() {
        super.mo49516h();
        C23872a.m58584a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo49518j() {
        super.mo49518j();
        C23872a.m58584a(false);
    }

    /* renamed from: c */
    public final File mo23791c() {
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
        return c.mo49494a(filesDir, "effect");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        if (!mo23791c().exists()) {
            return true;
        }
        C23906d dVar = new C23906d(C23908c.m58639a(), null, 2, null);
        dVar.f63575a = true;
        C23900a aVar = new C23900a();
        aVar.mo49505a((C23905c) dVar);
        aVar.mo49506a(mo23791c());
        dVar.mo49510a();
        C43359c a = C43360a.m95089a();
        C43360a.m95091c().f109666a.mo2504a(-1);
        a.f109628a = null;
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
