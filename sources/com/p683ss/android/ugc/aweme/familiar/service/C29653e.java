package com.p683ss.android.ugc.aweme.familiar.service;

import android.support.p030v4.app.C0654k;
import com.p683ss.android.ugc.C27991b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.e */
public final class C29653e implements ISyncDuoshanService {
    public final boolean canShowHomePageSyncToDuoshanDialog(int i) {
        return false;
    }

    public final boolean canShowPublishSyncToDuoshanDialog() {
        return false;
    }

    public final void increaseGuideShowCnt() {
    }

    public final boolean isGuideShowCntLimited() {
        return true;
    }

    public final boolean isGuideShowTimeLimited() {
        return true;
    }

    public final boolean isUserCloseHomePageGuide() {
        return true;
    }

    public final void saveGuideShowTime() {
    }

    public final void setUserCloseHomePageGuide() {
    }

    public final void syncToDuoshan(C29654f fVar) {
        C52711k.m112240b(fVar, "listener");
    }

    public final boolean tryShowHomePageSyncToDuoshanDialog(C0654k kVar, int i) {
        return false;
    }

    public final boolean tryShowPublishSyncToDuoshanDialog(C0654k kVar, String str) {
        return false;
    }

    /* renamed from: a */
    public static ISyncDuoshanService m69699a() {
        Object a = C27991b.m66756a(ISyncDuoshanService.class);
        if (a != null) {
            return (ISyncDuoshanService) a;
        }
        if (C27991b.f73479aj == null) {
            synchronized (ISyncDuoshanService.class) {
                if (C27991b.f73479aj == null) {
                    C27991b.f73479aj = new C29653e();
                }
            }
        }
        return (C29653e) C27991b.f73479aj;
    }
}
