package com.bytedance.apm.net;

/* renamed from: com.bytedance.apm.net.a */
public final class C9146a extends Exception {
    public String message;
    public int statusCode;

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C9146a(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
