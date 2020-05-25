package android.support.p043v7.p048c.p049a;

import android.support.p043v7.p051e.C1208c.C1212c;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.c.a.a */
public final class C1197a<T> {

    /* renamed from: a */
    public final Executor f3966a;

    /* renamed from: b */
    public final Executor f3967b;

    /* renamed from: c */
    public final C1212c<T> f3968c;

    /* renamed from: android.support.v7.c.a.a$a */
    public static final class C1198a<T> {

        /* renamed from: d */
        private static final Object f3969d = new Object();

        /* renamed from: e */
        private static Executor f3970e = null;

        /* renamed from: a */
        private Executor f3971a;

        /* renamed from: b */
        private Executor f3972b;

        /* renamed from: c */
        private final C1212c<T> f3973c;

        /* renamed from: a */
        public final C1197a<T> mo3920a() {
            if (this.f3972b == null) {
                synchronized (f3969d) {
                    if (f3970e == null) {
                        f3970e = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(2).mo49847a());
                    }
                }
                this.f3972b = f3970e;
            }
            return new C1197a<>(this.f3971a, this.f3972b, this.f3973c);
        }

        public C1198a(C1212c<T> cVar) {
            this.f3973c = cVar;
        }
    }

    C1197a(Executor executor, Executor executor2, C1212c<T> cVar) {
        this.f3966a = executor;
        this.f3967b = executor2;
        this.f3968c = cVar;
    }
}
