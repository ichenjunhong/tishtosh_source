package com.p683ss.android.ugc.aweme.main;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.ef */
final /* synthetic */ class C36638ef implements Callable {

    /* renamed from: a */
    private final TabChangeManager f93756a;

    /* renamed from: b */
    private final Class f93757b;

    /* renamed from: c */
    private final String f93758c;

    /* renamed from: d */
    private final Bundle f93759d;

    C36638ef(TabChangeManager tabChangeManager, Class cls, String str, Bundle bundle) {
        this.f93756a = tabChangeManager;
        this.f93757b = cls;
        this.f93758c = str;
        this.f93759d = bundle;
    }

    public final Object call() {
        return this.f93756a.mo75618b(this.f93757b, this.f93758c, this.f93759d);
    }
}
