package com.p683ss.android.ugc.p2425e;

/* renamed from: com.ss.android.ugc.e.a */
public final class C48545a extends Exception {

    /* renamed from: a */
    private int f121988a;

    /* renamed from: b */
    private String f121989b;

    public C48545a() {
    }

    public final int getErrorCode() {
        return this.f121988a;
    }

    public final String getErrorMsg() {
        return this.f121989b;
    }

    public final void setErrorCode(int i) {
        this.f121988a = i;
    }

    public final void setErrorMsg(String str) {
        this.f121989b = str;
    }

    public C48545a(int i, String str) {
        super(str);
        this.f121988a = i;
        this.f121989b = str;
    }
}
