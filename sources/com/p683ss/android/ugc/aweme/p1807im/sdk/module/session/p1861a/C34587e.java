package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.e */
public abstract class C34587e extends C35456b {

    /* renamed from: c */
    public C34588a f89134c = C34588a.SUCCESS;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.e$a */
    public enum C34588a {
        SENDING,
        FAILED,
        SUCCESS
    }

    public String bm_() {
        return this.f91114e;
    }

    /* renamed from: d */
    public final void mo72643d() {
    }

    /* renamed from: a */
    public static C34588a m78536a(int i) {
        C34588a aVar = C34588a.SUCCESS;
        if (i != 5) {
            switch (i) {
                case 0:
                case 1:
                    return C34588a.SENDING;
                case 2:
                    break;
                case 3:
                    return C34588a.FAILED;
                default:
                    return aVar;
            }
        }
        return C34588a.SUCCESS;
    }
}
