package com.bytedance.frameworks.baselib.network.http.p568a;

import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.g */
public final class C9840g extends IOException {
    private static final long serialVersionUID = -210264743726619965L;

    public C9840g() {
    }

    public C9840g(String str) {
        super(str);
    }

    public C9840g(Throwable th) {
        initCause(th);
    }

    public C9840g(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
