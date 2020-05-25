package com.bytedance.apm.p489l.p490a.p491a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.apm.l.a.a.b */
public final class C9089b extends WeakReference<Object> {

    /* renamed from: a */
    public final String f24835a;

    /* renamed from: b */
    public final String f24836b;

    /* renamed from: a */
    private static <T> T m18012a(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw new NullPointerException(sb.toString());
    }

    public C9089b(Object obj, String str, String str2, ReferenceQueue<Object> referenceQueue) {
        super(m18012a(obj, "referent"), (ReferenceQueue) m18012a(referenceQueue, "referenceQueue"));
        this.f24835a = (String) m18012a(str, "key");
        this.f24836b = (String) m18012a(str2, LeakCanaryFileProvider.f132049i);
    }
}
