package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p1039a.C15509c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.bn */
public final class C15285bn {

    /* renamed from: a */
    static final ExecutorService f39448a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C15509c("GAC_Transform"));
        f39448a = threadPoolExecutor;
    }
}
