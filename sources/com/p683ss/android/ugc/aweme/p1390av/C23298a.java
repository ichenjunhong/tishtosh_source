package com.p683ss.android.ugc.aweme.p1390av;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import com.p683ss.android.ugc.aweme.main.experiment.SecondTabLastStatusExperiment;

/* renamed from: com.ss.android.ugc.aweme.av.a */
public class C23298a {

    /* renamed from: b */
    private static C23298a f62292b;

    /* renamed from: a */
    public boolean f62293a = true;

    /* renamed from: a */
    public static C23298a m57308a() {
        if (f62292b == null) {
            synchronized (C23298a.class) {
                if (f62292b == null) {
                    f62292b = new C23298a();
                }
            }
        }
        return f62292b;
    }

    /* renamed from: b */
    public final boolean mo48343b() {
        int a = C10181b.m20511a().mo18168a(SecondTabLastStatusExperiment.class, true, "second_tab_last_status", 31744, 0);
        if (a == 0) {
            return true;
        }
        if (a == 1) {
            return false;
        }
        C36606dx dxVar = (C36606dx) C23393g.m57474a(C11010c.m22280a(), C36606dx.class);
        if (dxVar != null) {
            return dxVar.mo48517b();
        }
        return false;
    }
}
