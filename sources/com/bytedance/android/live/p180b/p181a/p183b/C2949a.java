package com.bytedance.android.live.p180b.p181a.p183b;

import com.bytedance.android.live.p180b.p181a.C2944a;

/* renamed from: com.bytedance.android.live.b.a.b.a */
public class C2949a extends C2944a {

    /* renamed from: a */
    private String f8651a;

    /* renamed from: b */
    private String f8652b;

    /* renamed from: c */
    private String f8653c;

    /* renamed from: d */
    private String f8654d;

    public String getAlert() {
        return this.f8653c;
    }

    public String getErrorMsg() {
        return this.f8651a;
    }

    public String getExtra() {
        return this.f8654d;
    }

    public String getPrompt() {
        return this.f8652b;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ApiServerException, errorMsg = ");
        sb.append(this.f8651a);
        sb.append(" extra = ");
        sb.append(this.f8654d);
        sb.append(" ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C2949a(int i) {
        super(i);
    }

    public C2949a setAlert(String str) {
        this.f8653c = str;
        return this;
    }

    public C2949a setErrorMsg(String str) {
        this.f8651a = str;
        return this;
    }

    public C2949a setExtra(String str) {
        this.f8654d = str;
        return this;
    }

    public C2949a setPrompt(String str) {
        this.f8652b = str;
        return this;
    }
}
