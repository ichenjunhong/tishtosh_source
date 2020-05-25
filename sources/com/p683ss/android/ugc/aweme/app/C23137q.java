package com.p683ss.android.ugc.aweme.app;

import com.p683ss.android.ugc.aweme.C27947k;
import com.p683ss.android.ugc.aweme.antiaddic.C22688a;
import com.p683ss.android.ugc.aweme.main.dialogmanager.C36588a;
import com.p683ss.android.ugc.aweme.splash.C45692e;
import com.p683ss.android.ugc.aweme.utils.permission.PermissionStateReporter;

/* renamed from: com.ss.android.ugc.aweme.app.q */
public class C23137q {

    /* renamed from: b */
    private static C23137q f61567b;

    /* renamed from: a */
    public C27947k f61568a;

    /* renamed from: b */
    public final boolean mo47854b() {
        return this.f61568a.f73368b;
    }

    /* renamed from: c */
    public final boolean mo47855c() {
        return this.f61568a.mo56352a();
    }

    /* renamed from: a */
    public static C23137q m56698a() {
        if (f61567b == null) {
            synchronized (C23137q.class) {
                if (f61567b == null) {
                    f61567b = new C23137q();
                }
            }
        }
        return f61567b;
    }

    private C23137q() {
        AwemeApplication a = AwemeApplication.m56199a();
        if (a != null) {
            this.f61568a = new C27947k(a);
            C22688a.m55899d().mo47075e();
            C22688a.m55899d().mo47071a(PermissionStateReporter.m103713d());
            C22688a.m55899d().mo47071a(C36588a.f93692b);
            this.f61568a.f73370d = C22688a.m55899d();
            this.f61568a.f73371e = C45692e.f115536a;
        }
    }
}
