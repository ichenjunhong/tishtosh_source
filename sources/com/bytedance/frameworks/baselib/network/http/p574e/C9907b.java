package com.bytedance.frameworks.baselib.network.http.p574e;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.b */
public final class C9907b extends Exception {
    private static final long serialVersionUID = -1098012010869697449L;

    /* renamed from: a */
    final int f26975a;

    /* renamed from: b */
    final long f26976b;

    public final long getLength() {
        return this.f26976b;
    }

    public final int getMaxSize() {
        return this.f26975a;
    }

    public C9907b(int i, long j) {
        StringBuilder sb = new StringBuilder("Download file too large: ");
        sb.append(i);
        sb.append(" ");
        sb.append(j);
        super(sb.toString());
        this.f26975a = i;
        this.f26976b = j;
    }
}
