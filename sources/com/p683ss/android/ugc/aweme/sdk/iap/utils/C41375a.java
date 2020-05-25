package com.p683ss.android.ugc.aweme.sdk.iap.utils;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.a */
public final class C41375a extends Exception {

    /* renamed from: a */
    C41389c f104901a;

    public final C41389c getResult() {
        return this.f104901a;
    }

    public C41375a(C41389c cVar) {
        this(cVar, (Exception) null);
    }

    public C41375a(int i, String str) {
        this(new C41389c(i, str));
    }

    public C41375a(C41389c cVar, Exception exc) {
        super(cVar.f104940b, exc);
        this.f104901a = cVar;
    }

    public C41375a(int i, String str, Exception exc) {
        this(new C41389c(i, str), exc);
    }
}
