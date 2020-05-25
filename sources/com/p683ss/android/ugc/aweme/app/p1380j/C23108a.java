package com.p683ss.android.ugc.aweme.app.p1380j;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.app.j.a */
public final class C23108a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f61528a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23108a.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static ArrayList<String> f61529b = new ArrayList<>();

    /* renamed from: c */
    public static final C23108a f61530c = new C23108a();

    /* renamed from: d */
    private static final C52668f f61531d = C52732g.m112285a(C23109a.f61532a);

    /* renamed from: com.ss.android.ugc.aweme.app.j.a$a */
    static final class C23109a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C23109a f61532a = new C23109a();

        C23109a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("LAST_ACTIVITY_TASK_ID_REPO_NAME");
        }
    }

    private C23108a() {
    }

    /* renamed from: a */
    public final Keva mo47848a() {
        return (Keva) f61531d.getValue();
    }
}
