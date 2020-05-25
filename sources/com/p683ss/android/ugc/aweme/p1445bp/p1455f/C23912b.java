package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23901a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import java.io.File;
import java.io.FileFilter;
import java.util.Set;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.f.b */
public final class C23912b extends C23910a {

    /* renamed from: b */
    public static final C23913a f63583b = new C23913a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.f.b$a */
    public static final class C23913a {
        private C23913a() {
        }

        public /* synthetic */ C23913a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bp.f.b$b */
    static final class C23914b implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ Set f63584a;

        C23914b(Set set) {
            this.f63584a = set;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
            if (p2628d.p2650m.C52830p.m112413c(r0, "wav", false, 2, null) != false) goto L_0x004c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean accept(java.io.File r10) {
            /*
                r9 = this;
                boolean r0 = com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23899b.m58625a(r10)
                r1 = 0
                if (r0 == 0) goto L_0x007f
                boolean r0 = r10.exists()
                if (r0 == 0) goto L_0x007f
                java.lang.String r0 = r10.getName()
                boolean r0 = com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23899b.m58625a(r0)
                if (r0 == 0) goto L_0x007f
                java.lang.String r0 = r10.getName()
                java.lang.String r2 = "file.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                java.lang.String r2 = "temp_"
                r3 = 0
                r4 = 2
                boolean r0 = p2628d.p2650m.C52830p.m112411b(r0, r2, r1, r4, r3)
                if (r0 != 0) goto L_0x004c
                java.lang.String r0 = r10.getName()
                java.lang.String r2 = "file.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                java.lang.String r2 = "mp4"
                boolean r0 = p2628d.p2650m.C52830p.m112413c(r0, r2, r1, r4, r3)
                if (r0 != 0) goto L_0x004c
                java.lang.String r0 = r10.getName()
                java.lang.String r2 = "file.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                java.lang.String r2 = "wav"
                boolean r0 = p2628d.p2650m.C52830p.m112413c(r0, r2, r1, r4, r3)
                if (r0 == 0) goto L_0x007f
            L_0x004c:
                java.util.Set r0 = r9.f63584a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                r2 = 0
            L_0x0055:
                boolean r5 = r0.hasNext()
                r6 = -1
                if (r5 == 0) goto L_0x007a
                java.lang.Object r5 = r0.next()
                if (r2 >= 0) goto L_0x0065
                p2628d.p2629a.C52575l.m112100b()
            L_0x0065:
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r7 = r10.getPath()
                java.lang.String r8 = "file.path"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
                boolean r5 = p2628d.p2650m.C52830p.m112411b(r7, r5, r1, r4, r3)
                if (r5 == 0) goto L_0x0077
                goto L_0x007b
            L_0x0077:
                int r2 = r2 + 1
                goto L_0x0055
            L_0x007a:
                r2 = -1
            L_0x007b:
                if (r2 != r6) goto L_0x007f
                r10 = 1
                return r10
            L_0x007f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1445bp.p1455f.C23912b.C23914b.accept(java.io.File):boolean");
        }
    }

    /* renamed from: e */
    public final String mo49513e() {
        return "av-cache";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo49514f() {
        return "cache";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C23882b mo49515g() {
        return C23882b.CACHE;
    }

    /* renamed from: c */
    public final File mo23791c() {
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109503p;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sCacheDir");
        return c.mo49496b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49517i() {
        Set a = C23908c.m58639a();
        C23906d dVar = new C23906d(a, C39629l.m88232a().mo58577h().mo49488b().mo49537b());
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109491d);
        sb.append("ve_frame_cache2/");
        File b = c.mo49496b(sb.toString());
        C23906d dVar2 = new C23906d(null, null, 3, null);
        C23900a aVar = new C23900a();
        aVar.mo49505a((C23905c) dVar2);
        aVar.mo49506a(b);
        dVar2.mo49510a();
        C23936c c2 = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109503p;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sCacheDir");
        File b2 = c2.mo49496b(str);
        C23901a aVar2 = new C23901a(a);
        C23900a aVar3 = new C23900a();
        aVar3.mo49505a((C23905c) aVar2);
        aVar3.mo49506a(b2);
        C23936c c3 = C39629l.m88232a().mo58577h().mo49489c();
        String str2 = C43308eb.f109508u;
        C52711k.m112236a((Object) str2, "ShortVideoConfig2.sNoCopyDraftDir");
        File b3 = c3.mo49496b(str2);
        C23900a aVar4 = new C23900a();
        aVar4.mo49505a((C23905c) dVar);
        aVar4.mo49506a(b3);
        dVar.mo49510a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo49519k() {
        Set a = C23908c.m58639a();
        C23903b bVar = new C23903b(a, C39629l.m88232a().mo58577h().mo49488b().mo49537b());
        bVar.mo49509a();
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109491d);
        sb.append("ve_frame_cache2/");
        File b = C39629l.m88232a().mo58577h().mo49489c().mo49496b(sb.toString());
        if (b.exists()) {
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) bVar);
            aVar.mo49506a(b);
        }
        long a2 = bVar.f63571a + 0 + 0 + m58651a(a);
        bVar.mo49509a();
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109508u;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sNoCopyDraftDir");
        File b2 = c.mo49496b(str);
        if (b2.exists()) {
            C23900a aVar2 = new C23900a();
            aVar2.mo49505a((C23905c) bVar);
            aVar2.mo49506a(b2);
        }
        long j = a2 + bVar.f63571a + 0;
        bVar.mo49509a();
        return j + bVar.f63571a;
    }

    /* renamed from: a */
    private static long m58651a(Set<String> set) {
        C23936c c = C39629l.m88232a().mo58577h().mo49489c();
        String str = C43308eb.f109503p;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sCacheDir");
        File b = c.mo49496b(str);
        long j = 0;
        if (b.exists()) {
            File[] listFiles = b.listFiles(new C23914b(set));
            C52711k.m112236a((Object) listFiles, "cacheDir.listFiles { fil…it) } == -1\n            }");
            for (File length : listFiles) {
                j += length.length();
            }
        }
        return j;
    }
}
