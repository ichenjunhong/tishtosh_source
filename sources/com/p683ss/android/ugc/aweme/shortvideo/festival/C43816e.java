package com.p683ss.android.ugc.aweme.shortvideo.festival;

import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.e */
public final class C43816e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f110968a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43816e.class), "inFestival", "getInFestival()Z"))};

    /* renamed from: b */
    public final C10912c f110969b;

    /* renamed from: c */
    private final C52668f f110970c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.e$a */
    static final class C43817a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43816e f110971a;

        C43817a(C43816e eVar) {
            this.f110971a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            if (this.f110971a.f110969b == null || !this.f110971a.f110969b.f29303d || C47915gg.m103651b()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C43816e() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public final boolean mo89341a() {
        return ((Boolean) this.f110970c.getValue()).booleanValue();
    }

    private C43816e(C10912c cVar) {
        this.f110969b = cVar;
        this.f110970c = C52732g.m112285a(new C43817a(this));
    }

    public /* synthetic */ C43816e(C10912c cVar, int i, C52707g gVar) {
        this(C31357a.m73104e());
    }
}
