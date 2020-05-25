package com.toutiao.proxyserver;

import java.io.IOException;

/* renamed from: com.toutiao.proxyserver.x */
public final class C51918x extends IOException {
    public int errorCode;

    public C51918x(String str) {
        super(str);
        this.errorCode = 1;
    }

    public C51918x(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
