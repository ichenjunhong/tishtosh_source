package com.p683ss.android.monitor.privacy;

import com.p683ss.android.common.applog.AppLog;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.monitor.privacy.c */
final /* synthetic */ class C19527c implements Callable {

    /* renamed from: a */
    static final Callable f53874a = new C19527c();

    private C19527c() {
    }

    public final Object call() {
        return AppLog.getServerDeviceId();
    }
}
