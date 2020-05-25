package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.google.gson.C18086p;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23457c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ap */
public final class C35202ap {
    /* renamed from: a */
    public static RuntimeException m79581a(ExecutionException executionException) throws Exception {
        Throwable cause = executionException.getCause();
        if (cause instanceof C23459a) {
            return (C23459a) cause;
        }
        if (cause instanceof C18086p) {
            return new C23457c(cause);
        }
        throw ((Exception) cause);
    }
}
