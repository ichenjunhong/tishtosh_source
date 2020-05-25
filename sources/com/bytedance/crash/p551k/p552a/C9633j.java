package com.bytedance.crash.p551k.p552a;

import android.content.Context;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9586c;
import com.bytedance.crash.p555n.C9694f;
import com.bytedance.crash.p555n.C9710q;

/* renamed from: com.bytedance.crash.k.a.j */
final class C9633j extends C9622c {
    /* renamed from: a */
    public final C9584a mo17464a(int i, C9584a aVar) {
        C9584a a = super.mo17464a(i, aVar);
        if (i != 5) {
            switch (i) {
                case 0:
                    a.mo17395a("app_count", (Object) Integer.valueOf(1));
                    a.mo17395a("magic_tag", (Object) "ss_app_log");
                    m19176b(a);
                    C9586c a2 = C9586c.m19047a(this.f26271b);
                    a2.mo17410a(C9616k.m19147a().mo17446a());
                    a.mo17387a(a2);
                    C9710q.m19416a(a, a2, this.f26270a);
                    break;
                case 1:
                    C9586c e = a.mo17406e();
                    e.mo17409a(C9616k.m19151c().mo17507a());
                    e.mo17408a(C9616k.m19147a().mo17451f());
                    break;
                case 2:
                    C9586c.m19049a(a.mo17406e());
                    StringBuilder sb = new StringBuilder("fd:");
                    sb.append(C9694f.m19344b());
                    a.mo17391a(sb.toString(), C9694f.m19342a());
                    C9694f.m19345c();
                    break;
            }
        } else {
            C9586c.m19052b(a.mo17406e());
        }
        return a;
    }

    C9633j(Context context, C9619b bVar, C9624d dVar) {
        super(C9571d.JAVA, context, bVar, dVar);
    }
}
