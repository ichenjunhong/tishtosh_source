package com.p683ss.android.ugc.aweme.app;

import com.p683ss.android.ugc.aweme.antiaddic.p1353a.C22689a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.p1411c.C23483b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.app.ah */
public final class C22930ah {

    /* renamed from: a */
    public C22689a f61257a;

    /* renamed from: b */
    public volatile long f61258b;

    /* renamed from: c */
    private C23051bf<Long> f61259c;

    /* renamed from: com.ss.android.ugc.aweme.app.ah$a */
    static class C22932a {

        /* renamed from: a */
        public static C22930ah f61261a = new C22930ah();
    }

    /* renamed from: a */
    public static C22930ah m56380a() {
        return C22932a.f61261a;
    }

    /* renamed from: b */
    public final long mo47705b() {
        return Math.max(0, this.f61258b);
    }

    private C22930ah() {
        this.f61257a = new C22689a(0) {
            /* renamed from: a */
            public final C23051bf<Long> mo47077a() {
                return SharePrefCache.inst().getLastFeedTime();
            }
        };
        this.f61259c = SharePrefCache.inst().getLastFeedCount();
        this.f61258b = ((Long) this.f61259c.mo47782d()).longValue();
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public void mo47704a(long j) {
        this.f61258b = j;
        this.f61259c.mo47776a(Long.valueOf(this.f61258b));
    }

    @C53771m(mo112976b = true)
    public final void onQueryUserFinishedEvent(C23483b bVar) {
        C23324d.m57378a().setFeedCount(0);
        mo47704a(-1);
    }
}
