package com.bytedance.apm.p498p;

import com.bytedance.apm.p485h.C9045g;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.apm.p.e */
public final class C9177e {

    /* renamed from: a */
    public long f25139a;

    /* renamed from: b */
    public long f25140b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, C9045g> f25141c = new ConcurrentHashMap<>(4);

    /* renamed from: d */
    final String f25142d;

    /* renamed from: e */
    final String f25143e;

    public C9177e(String str, String str2) {
        if ("start_trace".equals(str) || "page_load_trace".equals(str)) {
            this.f25142d = str;
            this.f25143e = str2;
            return;
        }
        throw new IllegalStateException("Please add TraceServiceName support on TraceState#reportAsync");
    }
}
