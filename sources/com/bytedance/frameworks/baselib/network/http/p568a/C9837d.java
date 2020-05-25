package com.bytedance.frameworks.baselib.network.http.p568a;

import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.d */
public final class C9837d extends IOException {
    private static final long serialVersionUID = -7281385706782665299L;

    public C9837d() {
    }

    public C9837d(String str) {
        super(str);
    }

    public C9837d(Throwable th) {
        initCause(th);
    }

    public C9837d(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
