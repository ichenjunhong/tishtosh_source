package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import android.app.Application;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43872b;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43878g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.f.e */
public final class C23919e extends C23910a {

    /* renamed from: b */
    public static final C23920a f63587b = new C23920a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.f.e$a */
    public static final class C23920a {
        private C23920a() {
        }

        public /* synthetic */ C23920a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    public final String mo49513e() {
        return "av-filter";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "filter";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.RESOURCE;
    }

    /* renamed from: c */
    public final File mo23791c() {
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109504q;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sFilterDir");
        return c.mo49496b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo49519k() {
        Set a = C23908c.m58639a();
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
        File a2 = c.mo49494a(filesDir, "filter");
        C23903b bVar = new C23903b(a, null, 2, null);
        if (a2.exists()) {
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) bVar);
            aVar.mo49506a(a2);
        }
        long j = bVar.f63571a + 0;
        C23936c c2 = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109504q;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sFilterDir");
        File b2 = c2.mo49496b(str);
        C23903b bVar2 = new C23903b(a, null, 2, null);
        if (b2.exists()) {
            C23900a aVar2 = new C23900a();
            aVar2.mo49505a((C23905c) bVar2);
            aVar2.mo49506a(b2);
        }
        return j + bVar2.f63571a + 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        boolean z;
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
        File a = c.mo49494a(filesDir, "filter");
        if (a.exists()) {
            C23906d dVar = new C23906d(C23908c.m58639a(), null, 2, null);
            dVar.f63575a = true;
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) dVar);
            aVar.mo49506a(a);
            dVar.mo49510a();
        }
        if (mo23791c().exists()) {
            C23906d dVar2 = new C23906d(C23908c.m58639a(), null, 2, null);
            dVar2.f63575a = true;
            C23900a aVar2 = new C23900a();
            aVar2.mo49505a((C23905c) dVar2);
            aVar2.mo49506a(mo23791c());
            dVar2.mo49510a();
        }
        Iterable c2 = C39629l.m88232a().mo58573d().mo80735c();
        Collection arrayList = new ArrayList();
        for (Object next : c2) {
            C29059c cVar = (C29059c) next;
            boolean z2 = false;
            if (cVar.f76153k >= 0) {
                CharSequence charSequence = cVar.f76142T.f76059Z;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        Iterable<C29059c> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C29059c cVar2 : iterable) {
            cVar2.f76142T.f76059Z = C39629l.m88232a().mo58584o().mo64333c().mo64346b(cVar2.f76153k).f82332i;
            arrayList2.add(Long.valueOf(C39629l.m88232a().mo58573d().mo80730a(cVar2)));
        }
        C43872b a2 = C43878g.m96385a();
        C39618d.f101151O.mo83123g(a2.mo89426b());
        C39618d.f101151O.mo83123g(a2.mo89424a());
        C39629l.m88232a().mo58584o().mo64334d().mo64409a();
        C39629l.m88232a().mo58584o().mo64332b().mo64341b();
        return true;
    }
}
