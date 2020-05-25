package com.p683ss.android.ugc.rhea.p2499a;

import com.p683ss.android.ugc.rhea.C50164a;
import com.p683ss.android.ugc.rhea.p2503e.C50178a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.rhea.a.a */
public final class C50165a {

    /* renamed from: a */
    public static List<C50171c> f125684a = new ArrayList();

    /* renamed from: com.ss.android.ugc.rhea.a.a$a */
    public static class C50167a<T extends C50171c> implements Runnable {

        /* renamed from: a */
        private List<T> f125685a;

        public final void run() {
            StringBuilder sb = new StringBuilder();
            for (int size = this.f125685a.size() - 1; size >= 0; size--) {
                sb.append("\n");
                C50171c cVar = (C50171c) this.f125685a.get(size);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cVar.f125692d);
                sb2.append(",");
                sb2.append(cVar.f125689a);
                sb2.append(",");
                sb2.append(cVar.f125695g);
                sb2.append(",");
                sb2.append(cVar.f125696h);
                sb2.append(",");
                sb2.append(cVar.f125693e);
                sb2.append(",");
                sb2.append(cVar.f125694f);
                sb.append(sb2.toString());
            }
            C50178a.f125718c.mo97971a(sb.toString(), C50164a.m108276a());
            this.f125685a.clear();
        }

        private C50167a(List<T> list) {
            this.f125685a = new ArrayList();
            this.f125685a.addAll(list);
        }
    }
}
