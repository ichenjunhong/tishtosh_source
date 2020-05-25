package com.p683ss.android.ugc.aweme.p1807im;

import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;

/* renamed from: com.ss.android.ugc.aweme.im.k */
public class C33200k {
    /* renamed from: d */
    public static IIMService m76279d() {
        return m76278a(false, true);
    }

    /* renamed from: a */
    public static IIMService m76277a(boolean z) {
        return m76278a(false, false);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static IIMService m76278a(boolean z, boolean z2) {
        C33211q.m76311a();
        try {
            IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
            if ((provideIMService_Monster instanceof DefaultIMService) && !z2) {
                C33211q.m76312b();
                return null;
            } else if (provideIMService_Monster != null || !z2) {
                C33211q.m76312b();
                return provideIMService_Monster;
            } else {
                DefaultIMService inst = DefaultIMService.inst();
                C33211q.m76312b();
                return inst;
            }
        } catch (Throwable th) {
            C33211q.m76312b();
            throw th;
        }
    }
}
