package com.p683ss.android.ugc.aweme.profile.adapter;

import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.h */
final /* synthetic */ class C39747h implements Callable {

    /* renamed from: a */
    private final C39744e f101477a;

    C39747h(C39744e eVar) {
        this.f101477a = eVar;
    }

    public final Object call() {
        C39744e eVar = this.f101477a;
        return Integer.valueOf(AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().draftList(false).size());
    }
}
