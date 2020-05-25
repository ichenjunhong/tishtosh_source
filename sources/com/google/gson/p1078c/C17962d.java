package com.google.gson.p1078c;

import java.io.IOException;

/* renamed from: com.google.gson.c.d */
public final class C17962d extends IOException {
    private static final long serialVersionUID = 1;

    public C17962d(String str) {
        super(str);
    }

    public C17962d(Throwable th) {
        initCause(th);
    }

    public C17962d(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
