package com.p683ss.android.ugc.aweme.p1807im.sdk.share;

import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.c */
public final class C35125c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90334a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35125c.class), "tasks", "getTasks()Ljava/util/List;"))};

    /* renamed from: b */
    public static volatile boolean f90335b;

    /* renamed from: c */
    public static final C35125c f90336c = new C35125c();

    /* renamed from: d */
    private static final C52668f f90337d = C52732g.m112285a(C35126a.f90339a);

    /* renamed from: e */
    private static int f90338e = -1;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.c$a */
    static final class C35126a extends C52712l implements C52670a<List<Runnable>> {

        /* renamed from: a */
        public static final C35126a f90339a = new C35126a();

        C35126a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    private C35125c() {
    }

    /* renamed from: b */
    private final List<Runnable> m79358b() {
        return (List) f90337d.getValue();
    }

    /* renamed from: a */
    public static final int m79355a() {
        if (f90338e == -1 || !C35265e.m79727a()) {
            return 0;
        }
        return f90338e;
    }

    /* renamed from: a */
    public static final synchronized void m79356a(Runnable runnable) {
        synchronized (C35125c.class) {
            C52711k.m112240b(runnable, "task");
            if (f90335b && f90338e == -1) {
                if (C35265e.m79727a()) {
                    f90336c.m79358b().add(runnable);
                    return;
                }
            }
            runnable.run();
        }
    }

    /* renamed from: a */
    public static final synchronized void m79357a(boolean z) {
        synchronized (C35125c.class) {
            f90338e = z ? 1 : 0;
            f90335b = false;
            for (Runnable run : f90336c.m79358b()) {
                run.run();
            }
            f90336c.m79358b().clear();
        }
    }
}
