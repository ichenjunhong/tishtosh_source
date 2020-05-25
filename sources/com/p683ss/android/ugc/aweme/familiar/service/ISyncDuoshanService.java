package com.p683ss.android.ugc.aweme.familiar.service;

import android.support.p030v4.app.C0654k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.ISyncDuoshanService */
public interface ISyncDuoshanService {
    public static final C29648a Companion = C29648a.f77508a;
    public static final int HOME_PAGE_DIALOG_FROM_GUIDE = 1;
    public static final int HOME_PAGE_DIALOG_FROM_USER_CLICK = 0;

    /* renamed from: com.ss.android.ugc.aweme.familiar.service.ISyncDuoshanService$a */
    public static final class C29648a {

        /* renamed from: a */
        static final /* synthetic */ C29648a f77508a = new C29648a();

        private C29648a() {
        }
    }

    boolean canShowHomePageSyncToDuoshanDialog(int i);

    boolean canShowPublishSyncToDuoshanDialog();

    void increaseGuideShowCnt();

    boolean isGuideShowCntLimited();

    boolean isGuideShowTimeLimited();

    boolean isUserCloseHomePageGuide();

    void saveGuideShowTime();

    void setUserCloseHomePageGuide();

    void syncToDuoshan(C29654f fVar);

    boolean tryShowHomePageSyncToDuoshanDialog(C0654k kVar, int i);

    boolean tryShowPublishSyncToDuoshanDialog(C0654k kVar, String str);
}
