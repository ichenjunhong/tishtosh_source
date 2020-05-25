package com.bytedance.polaris.p821a;

import android.app.Application;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47480c.C47481a;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.PolarisDependImpl.C47474a;

/* renamed from: com.bytedance.polaris.a.j */
final class C12565j {
    /* renamed from: a */
    static Application m25230a() {
        Application b = C12563i.m25219b();
        if (b != null) {
            return b;
        }
        C23131p.m57779a("polaris_activity_crash", C23088c.m56631a().mo47824a("hook", "getApplication").mo47825b());
        return AwemeApplication.m56199a();
    }

    /* renamed from: b */
    static C12557c m25231b() {
        C12557c d = C12563i.m25222d();
        if (d != null) {
            return d;
        }
        C23131p.m57779a("polaris_activity_crash", C23088c.m56631a().mo47824a("hook", "getBusinessDepend").mo47825b());
        return C47474a.m102871a();
    }

    /* renamed from: c */
    static C12561g m25232c() {
        C12561g f = C12563i.m25224f();
        if (f != null) {
            return f;
        }
        C23131p.m57779a("polaris_activity_crash", C23088c.m56631a().mo47824a("hook", "getShareDepend").mo47825b());
        return C47481a.m102878a();
    }

    /* renamed from: d */
    static C12559e m25233d() {
        C12559e h = C12563i.m25226h();
        if (h != null) {
            return h;
        }
        C23131p.m57779a("polaris_activity_crash", C23088c.m56631a().mo47824a("hook", "getFoundationDepend").mo47825b());
        return C47474a.m102871a();
    }
}
