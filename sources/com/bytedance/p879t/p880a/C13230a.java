package com.bytedance.p879t.p880a;

/* renamed from: com.bytedance.t.a.a */
public final class C13230a extends Exception {
    public final String url;

    public C13230a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("fetch failed ");
        sb.append(str);
        super(sb.toString(), th);
        this.url = str;
    }
}
