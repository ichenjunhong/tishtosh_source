package com.p683ss.android.ugc.aweme.app;

import android.app.Application;
import com.p683ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;

/* renamed from: com.ss.android.ugc.aweme.app.t */
final /* synthetic */ class C23181t implements ServiceProvider {

    /* renamed from: a */
    private final Application f61586a;

    C23181t(Application application) {
        this.f61586a = application;
    }

    public final Object get() {
        Application application = this.f61586a;
        IIMService a = C33200k.m76278a(true, false);
        if (a == null) {
            return null;
        }
        C33194e.m76263a(application, a);
        return a;
    }
}
