package com.google.p997a.p998a.p1009d.p1011b;

import com.google.p997a.p998a.p1009d.C14769i;
import com.p683ss.android.ugc.aweme.policy.Policy;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.a.a.d.b.c */
public final class C14761c extends C14769i {

    /* renamed from: b */
    private static final String[] f38263b;

    /* renamed from: c */
    private final C14759a f38264c;

    /* renamed from: d */
    private final SSLSocketFactory f38265d;

    /* renamed from: e */
    private final HostnameVerifier f38266e;

    public C14761c() {
        this(null, null, null);
    }

    static {
        String[] strArr = {Policy.ACTION_DELETE, "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        f38263b = strArr;
        Arrays.sort(strArr);
    }

    private C14761c(C14759a aVar, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.f38264c = new C14760b();
        this.f38265d = null;
        this.f38266e = null;
    }
}
