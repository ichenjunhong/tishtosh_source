package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.setting.at */
final /* synthetic */ class C41554at implements Runnable {

    /* renamed from: a */
    static final Runnable f105260a = new C41554at();

    private C41554at() {
    }

    public final void run() {
        AVExternalServiceImpl.getAVServiceImpl_Monster().initService().initTask(3, null);
    }
}
