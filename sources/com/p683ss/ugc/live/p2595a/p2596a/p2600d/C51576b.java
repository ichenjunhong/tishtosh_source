package com.p683ss.ugc.live.p2595a.p2596a.p2600d;

import com.C2240a;
import com.p683ss.ugc.live.p2595a.p2596a.C51557a;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51569a;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51570b;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51585a;
import java.io.File;

/* renamed from: com.ss.ugc.live.a.a.d.b */
public final class C51576b implements C51557a<String>, C51579d<String> {

    /* renamed from: a */
    private C51579d<String> f128828a;

    /* renamed from: b */
    private C51557a<String> f128829b;

    public C51576b(C51579d dVar) {
        this.f128828a = dVar;
    }

    /* renamed from: a */
    public final void mo13398a(C51568c cVar, C51557a<String> aVar) {
        this.f128829b = aVar;
        this.f128828a.mo13398a(cVar, this);
    }

    /* renamed from: a */
    public final void mo105488a(C51568c cVar, int i) {
        if (this.f128829b != null) {
            this.f128829b.mo105488a(cVar, i);
        }
    }

    /* renamed from: a */
    public final void mo105489a(C51568c cVar, C51569a aVar) {
        if (this.f128829b != null) {
            this.f128829b.mo105489a(cVar, aVar);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo105490a(C51568c cVar, Object obj) {
        String str = (String) obj;
        try {
            File file = new File(str);
            String a = C51585a.m110730a(file);
            if (!cVar.f128820d.equals(a)) {
                mo105489a(cVar, (C51569a) new C51570b(C2240a.m6772a("File %1$s md5 is not equals", new Object[]{str}), cVar, a));
                file.delete();
                return;
            }
            if (this.f128829b != null) {
                this.f128829b.mo105490a(cVar, str);
            }
        } catch (Exception e) {
            mo105489a(cVar, (C51569a) new C51570b(C2240a.m6772a("File %1$s md5 error", new Object[]{str}), e, cVar, ""));
        }
    }
}
