package com.p683ss.android.ugc.aweme.qrcode.p2106d;

import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.router.C41312z;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.a */
public final class C41003a {

    /* renamed from: a */
    public static final C41003a f104258a = new C41003a();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.d.a$a */
    public static final class C41004a extends C17956a<Map<String, ? extends Object>> {
        C41004a() {
        }
    }

    private C41003a() {
    }

    /* renamed from: a */
    public static final Map<String, Object> m90629a(String str) {
        C52711k.m112240b(str, "url");
        try {
            return (Map) new C17971f().mo34885a(C41312z.m91072b(str, "meta_params"), new C41004a().f49843c);
        } catch (Exception unused) {
            return null;
        }
    }
}
