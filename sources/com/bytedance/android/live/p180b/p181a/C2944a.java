package com.bytedance.android.live.p180b.p181a;

/* renamed from: com.bytedance.android.live.b.a.a */
public class C2944a extends Exception {

    /* renamed from: a */
    private final int f8649a;

    public int getErrorCode() {
        return this.f8649a;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ApiException, errorCode = ");
        sb.append(this.f8649a);
        sb.append(" ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C2944a(int i) {
        this.f8649a = i;
    }

    public C2944a(int i, Throwable th) {
        super(th);
        this.f8649a = i;
    }
}
