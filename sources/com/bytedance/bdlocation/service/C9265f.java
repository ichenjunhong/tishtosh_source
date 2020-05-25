package com.bytedance.bdlocation.service;

import android.content.Context;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.bdlocation.service.f */
public final class C9265f implements C9254c {

    /* renamed from: d */
    private static volatile boolean f25366d;

    /* renamed from: a */
    Context f25367a;

    /* renamed from: b */
    volatile boolean f25368b;

    /* renamed from: c */
    BDLocationClient f25369c;

    /* renamed from: e */
    private boolean f25370e = true;

    /* renamed from: f */
    private ExecutorService f25371f = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: c */
    public static boolean m18378c() {
        return f25366d;
    }

    /* renamed from: a */
    public final long mo16781a() {
        return BDLocationConfig.getUploadInterval();
    }

    /* renamed from: b */
    public final void mo16782b() {
        this.f25368b = false;
        if (!this.f25370e || BDLocationConfig.isReportAtStart()) {
            this.f25370e = false;
            this.f25371f.submit(new Runnable() {
                public final void run() {
                    C9265f fVar = C9265f.this;
                    if (!fVar.f25368b && BDLocationConfig.isUpload()) {
                        BDLocation bDLocation = null;
                        try {
                            if (Util.needLocate()) {
                                bDLocation = fVar.f25369c.getLocation();
                            }
                            SystemBaseLocationImpl.getAndUploadLocation(bDLocation, fVar.f25367a);
                        } catch (Exception e) {
                            C51151a.m110020b("BDLocation_Upload", (Throwable) e);
                        }
                    }
                }
            });
            return;
        }
        this.f25370e = false;
    }

    /* renamed from: a */
    public static synchronized void m18377a(boolean z) {
        synchronized (C9265f.class) {
            f25366d = true;
        }
    }

    public C9265f(Context context) {
        this.f25367a = context;
        this.f25369c = new BDLocationClient("BDLocation_Upload");
        this.f25369c.setLocationMode(2);
        this.f25369c.setMaxCacheTime(mo16781a());
    }
}
