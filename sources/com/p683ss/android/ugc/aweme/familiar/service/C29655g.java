package com.p683ss.android.ugc.aweme.familiar.service;

import android.support.p030v4.app.C0654k;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.g */
public final class C29655g implements ISyncDuoshanService {

    /* renamed from: a */
    public static boolean f77511a;

    /* renamed from: b */
    public static final C29655g f77512b = new C29655g();

    /* renamed from: c */
    private static int f77513c = -1;

    /* renamed from: d */
    private final /* synthetic */ ISyncDuoshanService f77514d;

    public final boolean canShowHomePageSyncToDuoshanDialog(int i) {
        return this.f77514d.canShowHomePageSyncToDuoshanDialog(i);
    }

    public final boolean canShowPublishSyncToDuoshanDialog() {
        return this.f77514d.canShowPublishSyncToDuoshanDialog();
    }

    public final void increaseGuideShowCnt() {
        this.f77514d.increaseGuideShowCnt();
    }

    public final boolean isGuideShowCntLimited() {
        return this.f77514d.isGuideShowCntLimited();
    }

    public final boolean isGuideShowTimeLimited() {
        return this.f77514d.isGuideShowTimeLimited();
    }

    public final boolean isUserCloseHomePageGuide() {
        return this.f77514d.isUserCloseHomePageGuide();
    }

    public final void saveGuideShowTime() {
        this.f77514d.saveGuideShowTime();
    }

    public final void setUserCloseHomePageGuide() {
        this.f77514d.setUserCloseHomePageGuide();
    }

    public final void syncToDuoshan(C29654f fVar) {
        C52711k.m112240b(fVar, "listener");
        this.f77514d.syncToDuoshan(fVar);
    }

    public final boolean tryShowHomePageSyncToDuoshanDialog(C0654k kVar, int i) {
        return this.f77514d.tryShowHomePageSyncToDuoshanDialog(kVar, i);
    }

    public final boolean tryShowPublishSyncToDuoshanDialog(C0654k kVar, String str) {
        return this.f77514d.tryShowPublishSyncToDuoshanDialog(kVar, str);
    }

    private C29655g() {
        ISyncDuoshanService a = C29653e.m69699a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…oshanService::class.java)");
        this.f77514d = a;
    }
}
