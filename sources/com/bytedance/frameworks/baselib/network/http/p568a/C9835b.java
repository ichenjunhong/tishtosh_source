package com.bytedance.frameworks.baselib.network.http.p568a;

import java.io.IOException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.b */
public class C9835b extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    public C9835b() {
    }

    public C9835b(String str) {
        super(str);
    }

    public C9835b(Throwable th) {
        initCause(th);
    }

    public C9835b(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
