package com.bytedance.frameworks.baselib.network.http.cronet.p572a;

import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.p568a.C9836c;
import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.a */
public final class C9872a extends IOException {

    /* renamed from: a */
    private C9831a f26865a;

    /* renamed from: b */
    private String f26866b;

    /* renamed from: c */
    private int f26867c;

    public final C9831a getRequestInfo() {
        return this.f26865a;
    }

    public final int getStatusCode() {
        return this.f26867c;
    }

    public final String getTraceCode() {
        return this.f26866b;
    }

    public final String getRequestLog() {
        return this.f26865a.f26774x;
    }

    public C9872a(Exception exc, C9831a aVar, String str) {
        super(exc.getMessage(), exc.getCause());
        this.f26865a = aVar;
        this.f26866b = str;
        if (exc instanceof C9836c) {
            this.f26867c = ((C9836c) exc).getStatusCode();
        }
    }
}
