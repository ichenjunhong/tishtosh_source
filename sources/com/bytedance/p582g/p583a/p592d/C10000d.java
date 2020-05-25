package com.bytedance.p582g.p583a.p592d;

/* renamed from: com.bytedance.g.a.d.d */
public final class C10000d extends Exception {
    public String message;
    public int statusCode;

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C10000d(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
