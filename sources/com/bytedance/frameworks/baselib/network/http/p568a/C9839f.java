package com.bytedance.frameworks.baselib.network.http.p568a;

import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.f */
public final class C9839f extends IOException {
    private static final long serialVersionUID = -5588326043064908201L;

    public C9839f() {
    }

    public C9839f(String str) {
        super(str);
    }

    public C9839f(Throwable th) {
        initCause(th);
    }

    public C9839f(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
