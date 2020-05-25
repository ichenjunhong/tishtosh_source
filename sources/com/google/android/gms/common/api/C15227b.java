package com.google.android.gms.common.api;

/* renamed from: com.google.android.gms.common.api.b */
public class C15227b extends Exception {

    /* renamed from: a */
    protected final Status f39281a;

    public C15227b(Status status) {
        int i = status.f39272g;
        String str = status.f39273h != null ? status.f39273h : "";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f39281a = status;
    }

    public int getStatusCode() {
        return this.f39281a.f39272g;
    }

    public String getStatusMessage() {
        return this.f39281a.f39273h;
    }
}
