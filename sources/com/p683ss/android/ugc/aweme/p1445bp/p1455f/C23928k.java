package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2638e.C52659i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.f.k */
public final class C23928k extends C23910a {
    /* renamed from: e */
    public final String mo49513e() {
        return "av-publish-concat";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "synthetise-video";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.CACHE;
    }

    /* renamed from: c */
    public final File mo23791c() {
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109498k;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sTmpVideoDir");
        return c.mo49496b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        C43214dh a = C43214dh.m94817a();
        C52711k.m112236a((Object) a, "PublishManager.inst()");
        if (a.mo87858h()) {
            return true;
        }
        Set a2 = C23908c.m58639a();
        C23906d dVar = new C23906d(a2, C39629l.m88232a().mo58577h().mo49488b().mo49537b());
        C23900a aVar = new C23900a();
        aVar.mo49505a((C23905c) dVar);
        aVar.mo49506a(mo23791c());
        dVar.mo49510a();
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109491d;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sDir");
        File b = c.mo49496b(str);
        if (b.exists() && b.isDirectory()) {
            File[] listFiles = b.listFiles();
            C52711k.m112236a((Object) listFiles, "filesRoot.listFiles()");
            Iterable c2 = C52568f.m112082c(listFiles);
            Collection arrayList = new ArrayList();
            Iterator it = c2.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                File file = (File) next;
                if (file.exists() && file.isFile()) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (File file2 : (List) arrayList) {
                if (C52659i.m112206a(file2, "synthetise_") || C52659i.m112208b(file2, "_synthetise")) {
                    Iterator it2 = a2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Object next2 = it2.next();
                        if (i < 0) {
                            C52575l.m112100b();
                        }
                        if (C52659i.m112206a(file2, (String) next2)) {
                            break;
                        }
                        i++;
                    }
                    if (-1 == i) {
                        file2.delete();
                    }
                }
            }
        }
        C23936c c3 = C39629l.m88232a().mo58577h().mo49489c();
        String str2 = C43308eb.f109499l;
        C52711k.m112236a((Object) str2, "ShortVideoConfig2.sParallelUploadDir");
        File b2 = c3.mo49496b(str2);
        C23906d dVar2 = new C23906d(a2, C39629l.m88232a().mo58577h().mo49488b().mo49537b());
        C23900a aVar2 = new C23900a();
        aVar2.mo49505a((C23905c) dVar2);
        aVar2.mo49506a(b2);
        dVar2.mo49510a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo49519k() {
        long j;
        C43214dh a = C43214dh.m94817a();
        C52711k.m112236a((Object) a, "PublishManager.inst()");
        long j2 = 0;
        if (a.mo87858h()) {
            return 0;
        }
        Set a2 = C23908c.m58639a();
        C23903b bVar = new C23903b(a2, C39629l.m88232a().mo58577h().mo49488b().mo49537b());
        C23900a aVar = new C23900a();
        aVar.mo49505a((C23905c) bVar);
        aVar.mo49506a(mo23791c());
        long j3 = bVar.f63571a + 0;
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109491d;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sDir");
        File b = c.mo49496b(str);
        if (!b.exists() || !b.isDirectory()) {
            j = 0;
        } else {
            File[] listFiles = b.listFiles();
            C52711k.m112236a((Object) listFiles, "filesRoot.listFiles()");
            Iterable c2 = C52568f.m112082c(listFiles);
            Collection arrayList = new ArrayList();
            Iterator it = c2.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                File file = (File) next;
                if (file.exists() && file.isFile()) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            j = 0;
            for (File file2 : (List) arrayList) {
                if ((C52659i.m112206a(file2, "synthetise_") && (C52659i.m112208b(file2, "-concat-v") || C52659i.m112208b(file2, "-concat-a"))) || C52659i.m112208b(file2, "_synthetise")) {
                    Iterator it2 = a2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Object next2 = it2.next();
                        if (i < 0) {
                            C52575l.m112100b();
                        }
                        if (C52659i.m112206a(file2, (String) next2)) {
                            break;
                        }
                        i++;
                    }
                    if (-1 == i) {
                        j += file2.length();
                    }
                }
            }
        }
        long j4 = j3 + j;
        C23936c c3 = C39629l.m88232a().mo58577h().mo49489c();
        String str2 = C43308eb.f109499l;
        C52711k.m112236a((Object) str2, "ShortVideoConfig2.sParallelUploadDir");
        File b2 = c3.mo49496b(str2);
        Set b3 = C39629l.m88232a().mo58577h().mo49488b().mo49537b();
        if (b2.exists()) {
            C23903b bVar2 = new C23903b(a2, b3);
            C23900a aVar2 = new C23900a();
            aVar2.mo49505a((C23905c) bVar2);
            aVar2.mo49506a(b2);
            j2 = 0 + bVar2.f63571a;
        }
        return j4 + j2;
    }
}
