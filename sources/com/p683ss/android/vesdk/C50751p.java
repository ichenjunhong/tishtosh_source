package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.p */
public final class C50751p extends RuntimeException {

    /* renamed from: a */
    private int f127467a;

    /* renamed from: b */
    private String f127468b;

    public final String getMsgDes() {
        return this.f127468b;
    }

    public final int getRetCd() {
        return this.f127467a;
    }

    public C50751p(int i, String str) {
        StringBuilder sb = new StringBuilder("VESDK exception ret: ");
        sb.append(i);
        sb.append("msg: ");
        sb.append(str);
        super(sb.toString());
        this.f127467a = i;
        this.f127468b = str;
    }
}
