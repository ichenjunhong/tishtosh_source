package com.facebook;

/* renamed from: com.facebook.p */
public final class C14561p extends C14457k {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final FacebookRequestError f37833a;

    public final FacebookRequestError getRequestError() {
        return this.f37833a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: ");
        sb.append("httpResponseCode: ");
        sb.append(this.f37833a.f35200c);
        sb.append(", facebookErrorCode: ");
        sb.append(this.f37833a.f35201d);
        sb.append(", facebookErrorType: ");
        sb.append(this.f37833a.f35203f);
        sb.append(", message: ");
        sb.append(this.f37833a.mo25306a());
        sb.append("}");
        return sb.toString();
    }

    public C14561p(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f37833a = facebookRequestError;
    }
}
