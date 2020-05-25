package com.p888c.p889a.p890a.p891a.p893b;

import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import java.net.URL;

/* renamed from: com.c.a.a.a.b.k */
public final class C13403k {

    /* renamed from: a */
    public final String f34932a;

    /* renamed from: b */
    public final URL f34933b;

    /* renamed from: c */
    public final String f34934c;

    private C13403k(String str, URL url, String str2) {
        this.f34932a = str;
        this.f34933b = url;
        this.f34934c = str2;
    }

    /* renamed from: a */
    public static C13403k m27010a(String str, URL url, String str2) {
        C13426e.m27072a(str, "VendorKey is null or empty");
        C13426e.m27071a((Object) url, "ResourceURL is null");
        C13426e.m27072a(str2, "VerificationParameters is null or empty");
        return new C13403k(str, url, str2);
    }
}
