package com.p683ss.android.ugc.aweme.utils.permission;

import com.p683ss.android.ugc.aweme.account.C20854a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.c */
final /* synthetic */ class C47944c implements Callable {

    /* renamed from: a */
    private final PermissionStateReporter f120542a;

    C47944c(PermissionStateReporter permissionStateReporter) {
        this.f120542a = permissionStateReporter;
    }

    public final Object call() {
        this.f120542a.f120533a.report(Integer.valueOf(C47945d.m103731a()), Integer.valueOf(C20854a.m53167g().isUidContactPermisioned() ^ true ? 1 : 0), Integer.valueOf(C47945d.m103733b()));
        return null;
    }
}
