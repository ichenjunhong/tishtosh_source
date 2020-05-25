package com.p683ss.android.ugc.rhea.p2499a;

import com.p683ss.android.ugc.rhea.C50164a;
import com.p683ss.android.ugc.rhea.p2503e.C50178a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.rhea.a.b */
public final class C50168b {

    /* renamed from: a */
    private static List<C50172d> f125686a = new ArrayList(500);

    /* renamed from: com.ss.android.ugc.rhea.a.b$a */
    static class C50170a<T extends C50172d> implements Runnable {

        /* renamed from: a */
        private List<C50172d> f125687a;

        public final void run() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.f125687a.size(); i++) {
                sb.append("\n");
                C50172d dVar = (C50172d) this.f125687a.get(i);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dVar.f125698a);
                sb2.append(",");
                sb2.append(dVar.f125699b);
                sb2.append(",");
                sb2.append(dVar.f125702e);
                sb2.append(",");
                sb2.append(dVar.f125700c);
                sb2.append(",");
                sb2.append(dVar.f125701d);
                sb.append(sb2.toString());
            }
            C50178a.f125718c.mo97971a(sb.toString(), C50164a.m108276a());
        }

        private C50170a(List<C50172d> list) {
            this.f125687a = new ArrayList(500);
            this.f125687a.addAll(list);
        }
    }

    /* renamed from: a */
    public static void m108278a() {
        if (f125686a.size() != 0) {
            C50164a.m108277b().execute(new C50170a(f125686a));
            f125686a = new ArrayList(500);
        }
    }
}
