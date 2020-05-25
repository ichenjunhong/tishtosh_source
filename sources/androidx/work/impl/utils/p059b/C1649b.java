package androidx.work.impl.utils.p059b;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.work.impl.utils.b.b */
public final class C1649b implements C1648a {

    /* renamed from: a */
    final Handler f5778a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    volatile Thread f5779b;

    /* renamed from: c */
    private final Executor f5780c = new Executor() {
        public final void execute(Runnable runnable) {
            C1649b.this.f5778a.post(runnable);
        }
    };

    /* renamed from: d */
    private final ThreadFactory f5781d = new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            C1649b.this.f5779b = newThread;
            return newThread;
        }
    };

    /* renamed from: e */
    private final ExecutorService f5782e = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a(this.f5781d).mo49847a());

    /* renamed from: a */
    public final Executor mo6060a() {
        return this.f5780c;
    }

    /* renamed from: b */
    public final Thread mo6062b() {
        return this.f5779b;
    }

    /* renamed from: c */
    public final Executor mo6063c() {
        return this.f5782e;
    }

    /* renamed from: a */
    public final void mo6061a(Runnable runnable) {
        this.f5782e.execute(runnable);
    }
}
