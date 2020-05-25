package com.p683ss.android.ugc.aweme.bullet;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.bullet.p628b.p641h.C10358e;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.experiment.RnPerfMonitorExperiment;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.c */
public final class C24256c implements C10358e {

    /* renamed from: a */
    public static final C24256c f64379a = new C24256c();

    private C24256c() {
    }

    /* renamed from: a */
    public final List<String> mo18424a() {
        return C27132a.m65458a().mo55449a();
    }

    /* renamed from: b */
    public final String mo18425b() {
        return C27132a.m65458a().f71583g.mo46818e();
    }

    /* renamed from: c */
    public final boolean mo18426c() {
        return C27132a.m65458a().f71583g.mo46816c();
    }

    /* renamed from: d */
    public final List<String> mo18427d() {
        return C27132a.m65458a().f71583g.mo46817d();
    }

    /* renamed from: h */
    public final String mo18431h() {
        return C27132a.m65458a().f71583g.mo46814a();
    }

    /* renamed from: i */
    public final boolean mo18432i() {
        return C27132a.m65458a().f71583g.mo46815b();
    }

    /* renamed from: e */
    public final boolean mo18428e() {
        Boolean bool;
        C27132a.m65458a();
        HybridMonitorConfig b = C27131c.m65452b();
        if (b == null) {
            return false;
        }
        try {
            bool = b.getH5StaticResourceReportEnabled();
            C52711k.m112236a((Object) bool, "it.h5StaticResourceReportEnabled");
        } catch (C10174a unused) {
            bool = Boolean.valueOf(false);
        }
        return bool.booleanValue();
    }

    /* renamed from: f */
    public final List<String> mo18429f() {
        C27132a.m65458a();
        HybridMonitorConfig b = C27131c.m65452b();
        if (b == null) {
            return new ArrayList<>();
        }
        List<String> h5StaticResourceReportWhiteList = b.getH5StaticResourceReportWhiteList();
        if (h5StaticResourceReportWhiteList == null) {
            h5StaticResourceReportWhiteList = new ArrayList<>();
        }
        return h5StaticResourceReportWhiteList;
    }

    /* renamed from: g */
    public final boolean mo18430g() {
        return C10181b.m20511a().mo18172a(RnPerfMonitorExperiment.class, true, "rn_perf_monitor", 31744, false);
    }
}
