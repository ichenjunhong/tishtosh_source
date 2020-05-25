package com.bytedance.bdlocation.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bdlocation.BaseLocate;
import com.bytedance.bdlocation.ILocate;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.netwok.C9244b;
import com.bytedance.bdlocation.utils.C9270b.C9271a;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.bdlocation.service.d */
public final class C9255d {

    /* renamed from: a */
    final ILocate f25333a;

    /* renamed from: b */
    final ILocate f25334b;

    /* renamed from: c */
    public C9262b f25335c;

    /* renamed from: d */
    final List<C9261a> f25336d = new ArrayList();

    /* renamed from: e */
    public boolean f25337e;

    /* renamed from: f */
    public Handler f25338f;

    /* renamed from: g */
    public C9263e f25339g;

    /* renamed from: com.bytedance.bdlocation.service.d$a */
    class C9261a implements Runnable {

        /* renamed from: a */
        public C9254c f25349a;

        /* renamed from: b */
        long f25350b;

        /* renamed from: c */
        boolean f25351c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo16792a() {
            if (!this.f25351c) {
                this.f25351c = true;
                run();
            }
        }

        public final void run() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long a = this.f25349a.mo16781a();
            if (!C9255d.this.f25337e && elapsedRealtime - this.f25350b >= a) {
                this.f25349a.mo16782b();
            }
            C9255d.this.f25338f.postDelayed(this, a);
            this.f25350b = elapsedRealtime;
        }

        C9261a(C9254c cVar) {
            this.f25349a = cVar;
        }
    }

    /* renamed from: com.bytedance.bdlocation.service.d$b */
    public static class C9262b {

        /* renamed from: a */
        final LocationOption f25353a;

        /* renamed from: b */
        final long f25354b;

        public C9262b(LocationOption locationOption, long j) {
            this.f25353a = locationOption;
            this.f25354b = j;
        }
    }

    /* renamed from: a */
    public final void mo16783a() {
        mo16786a(false);
    }

    /* renamed from: a */
    public final void mo16784a(final LocationOption locationOption) {
        this.f25338f.post(new Runnable() {
            public final void run() {
                LocationOption locationOption;
                int i;
                long j;
                long j2;
                long j3;
                C9255d dVar = C9255d.this;
                LocationOption locationOption2 = locationOption;
                if (BDLocationConfig.isDebug()) {
                    StringBuilder sb = new StringBuilder("LocationScheduler:StartLocation: ");
                    sb.append(locationOption2.toString());
                    C51151a.m110018b("BDLocation", sb.toString());
                }
                if (dVar.f25335c == null) {
                    if (BDLocationConfig.isDebug()) {
                        C51151a.m110018b("BDLocation", "LocationScheduler:StartLocation: state is ready");
                    }
                    dVar.f25335c = new C9262b(locationOption2, System.currentTimeMillis());
                    dVar.f25339g.mo16795a(locationOption2, dVar.f25338f.getLooper());
                    return;
                }
                if (BDLocationConfig.isDebug()) {
                    C51151a.m110018b("BDLocation", "LocationScheduler:StartLocation: state is running");
                }
                LocationOption locationOption3 = dVar.f25335c.f25353a;
                boolean z = false;
                if (locationOption3 == locationOption2 || (locationOption3.getMode() == locationOption2.getMode() && locationOption3.getInterval() == locationOption2.getInterval())) {
                    z = true;
                }
                if (z) {
                    locationOption = null;
                } else {
                    LocationOption locationOption4 = new LocationOption(locationOption3);
                    if (locationOption3.getInterval() > 0) {
                        if (locationOption3.getInterval() <= locationOption2.getInterval()) {
                            j3 = locationOption3.getInterval();
                        } else {
                            j3 = locationOption2.getInterval();
                        }
                        locationOption4.setInterval(j3);
                    } else {
                        locationOption4.setInterval(locationOption2.getInterval());
                    }
                    if (locationOption3.getMode() != locationOption2.getMode()) {
                        i = 2;
                    } else {
                        i = locationOption3.getMode();
                    }
                    locationOption4.setMode(i);
                    if (locationOption3.getMaxCacheTime() < locationOption2.getMaxCacheTime()) {
                        j = locationOption3.getMaxCacheTime();
                    } else {
                        j = locationOption2.getMaxCacheTime();
                    }
                    locationOption4.setMaxCacheTime(j);
                    if (locationOption3.getLocationTimeOutMs() < locationOption2.getLocationTimeOutMs()) {
                        j2 = locationOption3.getLocationTimeOutMs();
                    } else {
                        j2 = locationOption2.getLocationTimeOutMs();
                    }
                    locationOption4.setLocationTimeOutMs(j2);
                    locationOption = locationOption4;
                }
                if (locationOption != null) {
                    dVar.f25335c = new C9262b(locationOption, dVar.f25335c.f25354b);
                    C9263e eVar = dVar.f25339g;
                    if (eVar.f25355a != null) {
                        eVar.f25355a.stopLocation();
                    }
                    dVar.f25339g.mo16795a(locationOption, dVar.f25338f.getLooper());
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo16785a(C9254c cVar) {
        C9261a aVar = new C9261a(cVar);
        this.f25336d.add(aVar);
        aVar.mo16792a();
    }

    /* renamed from: a */
    public final void mo16786a(final boolean z) {
        this.f25338f.post(new Runnable() {
            public final void run() {
                if (BDLocationConfig.isDebug()) {
                    C51151a.m110018b("BDLocation", "StopLocation");
                }
                C9263e eVar = C9255d.this.f25339g;
                boolean z = z;
                if (eVar.f25355a != null) {
                    if (z) {
                        ((BaseLocate) eVar.f25355a).onLocateError(eVar.f25355a.getLocateName(), new BDLocationException("Timeout.", eVar.f25355a.getLocateName(), "3"));
                    }
                    eVar.f25355a.stopLocation();
                }
                C9255d.this.f25335c = null;
            }
        });
    }

    public C9255d(final Context context, ILocate iLocate, ILocate iLocate2, Looper looper) {
        this.f25333a = iLocate;
        this.f25334b = iLocate2;
        this.f25338f = new Handler(looper);
        BDLocationConfig.getAppBackgroundProvider().f25376a = new C9271a() {
            /* renamed from: a */
            public final void mo16789a(final boolean z) {
                C9255d.this.f25338f.post(new Runnable() {
                    public final void run() {
                        if (z) {
                            C9255d dVar = C9255d.this;
                            dVar.f25337e = true;
                            if (!dVar.f25336d.isEmpty()) {
                                for (C9261a aVar : dVar.f25336d) {
                                    C9255d.this.f25338f.removeCallbacks(aVar);
                                    aVar.f25351c = false;
                                }
                            }
                            return;
                        }
                        C9255d dVar2 = C9255d.this;
                        dVar2.f25337e = false;
                        for (C9261a a : dVar2.f25336d) {
                            a.mo16792a();
                        }
                    }
                });
            }
        };
        if (C9912g.m19864a(context)) {
            this.f25338f.postDelayed(new Runnable() {
                public final void run() {
                    if (BDLocationConfig.isUploadMccAndSystemRegionInfo()) {
                        try {
                            C9244b.m18345a(context);
                        } catch (Exception e) {
                            C51151a.m110020b("BDLocation", (Throwable) e);
                        }
                    }
                    if (BDLocationConfig.isUpload() && !C9265f.m18378c()) {
                        C9265f.m18377a(true);
                        C9248a.m18347a().mo16773a((C9254c) new C9265f(context));
                    }
                }
            }, (long) BDLocationConfig.getUploadDelayTime());
        }
    }
}
