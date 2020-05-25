package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.af */
final /* synthetic */ class C39957af implements Callable {

    /* renamed from: a */
    private final UserResponse f101858a;

    C39957af(UserResponse userResponse) {
        this.f101858a = userResponse;
    }

    public final Object call() {
        C32458a.m75141a(4, "aweme/v1/user", C47759cc.m103382a().getGson().mo34889b(this.f101858a));
        return null;
    }
}
