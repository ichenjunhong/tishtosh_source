package com.p683ss.android.ugc.aweme.base.api.p1406a;

/* renamed from: com.ss.android.ugc.aweme.base.api.a.a */
public class C23454a extends RuntimeException {

    /* renamed from: a */
    private final int f62520a;

    public int getErrorCode() {
        return this.f62520a;
    }

    public C23454a(int i) {
        StringBuilder sb = new StringBuilder("error_code = ");
        sb.append(i);
        super(sb.toString());
        this.f62520a = i;
    }

    public C23454a(int i, Throwable th) {
        StringBuilder sb = new StringBuilder("error_code = ");
        sb.append(i);
        super(sb.toString(), th);
        this.f62520a = i;
    }
}
