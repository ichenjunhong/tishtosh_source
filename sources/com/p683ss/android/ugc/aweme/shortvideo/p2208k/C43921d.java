package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.d */
final /* synthetic */ class C43921d implements Callable {

    /* renamed from: a */
    private final Aweme f111218a;

    C43921d(Aweme aweme) {
        this.f111218a = aweme;
    }

    public final Object call() {
        return AVExternalServiceImpl.getAVServiceImpl_Monster().configService().privacyConfig().checkDuetReactPermission(this.f111218a.getAid(), 1);
    }
}
