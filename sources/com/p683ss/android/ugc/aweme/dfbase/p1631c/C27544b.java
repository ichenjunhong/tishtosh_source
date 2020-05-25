package com.p683ss.android.ugc.aweme.dfbase.p1631c;

import com.p683ss.android.ugc.aweme.dfbase.p1629a.C27533a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.dfbase.c.b */
public final class C27544b {

    /* renamed from: a */
    public Timer f72429a;

    /* renamed from: b */
    public long f72430b;

    /* renamed from: c */
    public C27545a f72431c;

    /* renamed from: d */
    public long f72432d = -1;

    /* renamed from: com.ss.android.ugc.aweme.dfbase.c.b$a */
    public interface C27545a {
        /* renamed from: c */
        void mo55996c();
    }

    /* renamed from: com.ss.android.ugc.aweme.dfbase.c.b$b */
    public class C27546b extends TimerTask {
        public final void run() {
            if (System.currentTimeMillis() - C27544b.this.f72430b > C27533a.f72382c && C27544b.this.f72431c != null) {
                C27544b.this.f72431c.mo55996c();
            }
        }

        public C27546b() {
        }
    }

    /* renamed from: a */
    public final void mo55994a() {
        this.f72430b = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo55995b() {
        if (this.f72429a != null) {
            this.f72429a.cancel();
            this.f72429a = null;
        }
        this.f72432d = -1;
        this.f72430b = 0;
    }

    public C27544b(C27545a aVar) {
        this.f72431c = aVar;
    }
}
