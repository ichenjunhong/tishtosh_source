package com.facebook;

/* renamed from: com.facebook.j */
public final class C14368j extends C14457k {
    static final long serialVersionUID = 1;

    /* renamed from: a */
    private int f37370a;

    /* renamed from: b */
    private String f37371b;

    public final int getErrorCode() {
        return this.f37370a;
    }

    public final String getFailingUrl() {
        return this.f37371b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: ");
        sb.append("errorCode: ");
        sb.append(getErrorCode());
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        sb.append(getFailingUrl());
        sb.append("}");
        return sb.toString();
    }

    public C14368j(String str, int i, String str2) {
        super(str);
        this.f37370a = i;
        this.f37371b = str2;
    }
}
