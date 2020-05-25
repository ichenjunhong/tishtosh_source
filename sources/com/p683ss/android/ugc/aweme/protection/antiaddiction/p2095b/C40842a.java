package com.p683ss.android.ugc.aweme.protection.antiaddiction.p2095b;

import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.p1353a.C22689a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40839a;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40849c;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40850d;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.b.a */
public final class C40842a extends C40839a {

    /* renamed from: a */
    private C22689a f103994a = new C22689a() {
        /* renamed from: a */
        public final C23051bf<Long> mo47077a() {
            return SharePrefCache.inst().getLastLockedTime();
        }
    };

    /* renamed from: b */
    private C22689a f103995b = new C22689a() {
        /* renamed from: a */
        public final C23051bf<Long> mo47077a() {
            return SharePrefCache.inst().getLastUnlockTime();
        }
    };

    /* renamed from: a */
    private static C23051bf<Long> m90324a() {
        return SharePrefCache.inst().getTodayVideoPlayTime();
    }

    /* renamed from: a */
    public final boolean mo83168a(long j, long j2) {
        if (C23794bh.m58390d().mo47112i() && C23794bh.m58390d().mo47111h()) {
            long d = (long) C40850d.m90340d();
            if (d >= 0 && this.f103995b.mo47079b(System.currentTimeMillis())) {
                if (this.f103994a.mo47079b(System.currentTimeMillis())) {
                    m90324a().mo47776a(Long.valueOf(0));
                    this.f103994a.mo47078a(System.currentTimeMillis());
                }
                long longValue = ((Long) m90324a().mo47782d()).longValue() + d;
                m90324a().mo47776a(Long.valueOf(longValue));
                C40849c.m90331a();
                if (longValue > ((long) (C23794bh.m58390d().mo47108e() * 60 * 1000))) {
                    BusinessComponentServiceUtils.getTimeLockHelperService().mo47090a(null, "");
                }
            }
        }
        return false;
    }
}
