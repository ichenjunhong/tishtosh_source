package com.bytedance.frameworks.baselib.network.http.p568a;

import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a */
public final class C9834a extends IOException {
    public C9834a() {
    }

    public C9834a(String str) {
        super(str);
    }

    public C9834a(Throwable th) {
        initCause(th);
    }

    public C9834a(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
