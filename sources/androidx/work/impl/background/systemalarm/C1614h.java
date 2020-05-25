package androidx.work.impl.background.systemalarm;

import com.C2240a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.work.impl.background.systemalarm.h */
final class C1614h {

    /* renamed from: a */
    final ScheduledExecutorService f5682a = ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a()));

    /* renamed from: b */
    final Map<String, C1616b> f5683b = new HashMap();

    /* renamed from: c */
    final Map<String, C1615a> f5684c = new HashMap();

    /* renamed from: d */
    final Object f5685d = new Object();

    /* renamed from: androidx.work.impl.background.systemalarm.h$a */
    interface C1615a {
        /* renamed from: a */
        void mo6011a(String str);
    }

    /* renamed from: androidx.work.impl.background.systemalarm.h$b */
    static class C1616b implements Runnable {

        /* renamed from: a */
        private final C1614h f5686a;

        /* renamed from: b */
        private final String f5687b;

        public final void run() {
            synchronized (this.f5686a.f5685d) {
                if (((C1616b) this.f5686a.f5683b.remove(this.f5687b)) != null) {
                    C1615a aVar = (C1615a) this.f5686a.f5684c.remove(this.f5687b);
                    if (aVar != null) {
                        aVar.mo6011a(this.f5687b);
                    }
                } else {
                    C2240a.m6772a("Timer with %s is already marked as complete.", new Object[]{this.f5687b});
                }
            }
        }

        C1616b(C1614h hVar, String str) {
            this.f5686a = hVar;
            this.f5687b = str;
        }
    }

    C1614h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6019a(String str) {
        synchronized (this.f5685d) {
            if (((C1616b) this.f5683b.remove(str)) != null) {
                C2240a.m6772a("Stopping timer for %s", new Object[]{str});
                this.f5684c.remove(str);
            }
        }
    }
}
