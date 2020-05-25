package android.arch.p006a.p007a;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;

/* renamed from: android.arch.a.a.b */
public final class C0043b extends C0044c {

    /* renamed from: a */
    private final Object f109a = new Object();

    /* renamed from: b */
    private ExecutorService f110b = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(2).mo49847a());

    /* renamed from: c */
    private volatile Handler f111c;

    /* renamed from: c */
    public final boolean mo57c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo55a(Runnable runnable) {
        this.f110b.execute(runnable);
    }

    /* renamed from: b */
    public final void mo56b(Runnable runnable) {
        if (this.f111c == null) {
            synchronized (this.f109a) {
                if (this.f111c == null) {
                    this.f111c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f111c.post(runnable);
    }
}
