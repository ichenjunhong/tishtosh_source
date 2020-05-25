package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.cl */
final /* synthetic */ class C36561cl implements Callable {

    /* renamed from: a */
    private final MainPageFragment f93649a;

    C36561cl(MainPageFragment mainPageFragment) {
        this.f93649a = mainPageFragment;
    }

    public final Object call() {
        ActivityLinkManager.m88491b(this.f93649a.getContext());
        return null;
    }
}
