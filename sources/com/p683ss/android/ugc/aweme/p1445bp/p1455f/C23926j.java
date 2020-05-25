package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bp.f.j */
public final class C23926j extends C23910a {

    /* renamed from: b */
    public static final C23927a f63589b = new C23927a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.f.j$a */
    public static final class C23927a {
        private C23927a() {
        }

        public /* synthetic */ C23927a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    public final String mo49513e() {
        return "av-shoot-concat";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "shoot-video";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.CACHE;
    }

    /* renamed from: c */
    public final File mo23791c() {
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109492e;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sTmpDir");
        return c.mo49496b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        C23906d dVar = new C23906d(null, C39629l.m88232a().mo58577h().mo49488b().mo49537b(), 1, null);
        C23900a aVar = new C23900a();
        aVar.mo49505a((C23905c) dVar);
        aVar.mo49506a(mo23791c());
        dVar.mo49510a();
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109491d;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sDir");
        File b = c.mo49496b(str);
        if (b.exists() && b.isDirectory()) {
            Set a = C23908c.m58639a();
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
                String name = file2.getName();
                C52711k.m112236a((Object) name, "filesToDelete.name");
                if (!C52830p.m112413c(name, "-concat-v", false, 2, null)) {
                    String name2 = file2.getName();
                    C52711k.m112236a((Object) name2, "filesToDelete.name");
                    if (!C52830p.m112413c(name2, "-concat-a", false, 2, null)) {
                        String name3 = file2.getName();
                        C52711k.m112236a((Object) name3, "filesToDelete.name");
                        if (!C52830p.m112413c(name3, "_synthetise", false, 2, null)) {
                        }
                    }
                }
                Iterator it2 = a.iterator();
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
                    String str2 = (String) next2;
                    String path = file2.getPath();
                    C52711k.m112236a((Object) path, "filesToDelete.path");
                    if (C52830p.m112411b(path, str2, false, 2, null)) {
                        break;
                    }
                    i++;
                }
                if (-1 == i) {
                    file2.delete();
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo49519k() {
        long j;
        long j2 = 0;
        if (!mo23791c().exists()) {
            j = 0;
        } else {
            C23903b bVar = new C23903b(null, C39629l.m88232a().mo58577h().mo49488b().mo49537b(), 1, null);
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) bVar);
            aVar.mo49506a(mo23791c());
            j = bVar.f63571a;
        }
        long j3 = j + 0;
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109491d;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sDir");
        File b = c.mo49496b(str);
        if (b.exists() && b.isDirectory()) {
            Set a = C23908c.m58639a();
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
                String name = file2.getName();
                C52711k.m112236a((Object) name, "undeleted.name");
                if (!C52830p.m112411b(name, "synthetise_", false, 2, null)) {
                    String name2 = file2.getName();
                    C52711k.m112236a((Object) name2, "undeleted.name");
                    if (!C52830p.m112413c(name2, "-concat-v", false, 2, null)) {
                        String name3 = file2.getName();
                        C52711k.m112236a((Object) name3, "undeleted.name");
                        if (!C52830p.m112413c(name3, "-concat-a", false, 2, null)) {
                        }
                    }
                    Iterator it2 = a.iterator();
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
                        String str2 = (String) next2;
                        String path = file2.getPath();
                        C52711k.m112236a((Object) path, "undeleted.path");
                        if (C52830p.m112411b(path, str2, false, 2, null)) {
                            break;
                        }
                        i++;
                    }
                    if (-1 == i) {
                        j2 += file2.length();
                    }
                }
            }
        }
        return j3 + j2;
    }
}
