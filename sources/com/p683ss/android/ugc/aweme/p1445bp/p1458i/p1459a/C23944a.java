package com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1459a;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bp.i.a.a */
public abstract class C23944a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63605a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23944a.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: d */
    public static final C23945a f63606d = new C23945a(null);

    /* renamed from: b */
    public AtomicBoolean f63607b = new AtomicBoolean(false);

    /* renamed from: c */
    public final LinkedHashSet<String> f63608c = new LinkedHashSet<>(8);

    /* renamed from: e */
    private final C52668f f63609e = C52732g.m112306a(Keva.getRepo("av-storage-white-list"));

    /* renamed from: com.ss.android.ugc.aweme.bp.i.a.a$a */
    public static final class C23945a {
        private C23945a() {
        }

        public /* synthetic */ C23945a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    private final Keva m58752b() {
        return (Keva) this.f63609e.getValue();
    }

    /* renamed from: c */
    private final String m58753c() {
        return String.valueOf(getClass().getName().hashCode());
    }

    /* renamed from: a */
    public final void mo49539a() {
        this.f63608c.clear();
        String[] stringArray = m58752b().getStringArray(m58753c(), new String[0]);
        C52711k.m112236a((Object) stringArray, "array");
        for (String add : C52568f.m112082c(stringArray)) {
            this.f63608c.add(add);
        }
    }
}
