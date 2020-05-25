package com.facebook;

/* renamed from: com.facebook.l */
public final class C14472l extends C14457k {

    /* renamed from: a */
    private final C14696t f37585a;

    public final C14696t getGraphResponse() {
        return this.f37585a;
    }

    public final String toString() {
        FacebookRequestError facebookRequestError;
        if (this.f37585a != null) {
            facebookRequestError = this.f37585a.f38086d;
        } else {
            facebookRequestError = null;
        }
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.f35200c);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.f35201d);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.f35203f);
            sb.append(", message: ");
            sb.append(facebookRequestError.mo25306a());
            sb.append("}");
        }
        return sb.toString();
    }

    public C14472l(C14696t tVar, String str) {
        super(str);
        this.f37585a = tVar;
    }
}
