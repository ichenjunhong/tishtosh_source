package com.p683ss.android.ugc.aweme.utils;

import android.util.Base64;
import com.bytedance.ttnet.p887e.C13328c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.aweme.utils.as */
public final class C47683as {

    /* renamed from: a */
    public static final C47683as f120165a = new C47683as();

    private C47683as() {
    }

    /* renamed from: a */
    public static final String m103196a(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "target");
        C52711k.m112240b(str2, "key");
        C52711k.m112240b(str3, "transformation");
        C52711k.m112240b(str4, "iv");
        byte[] bytes = str.getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = str2.getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes3 = str4.getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes3, "(this as java.lang.String).getBytes(charset)");
        byte[] encode = Base64.encode(C13328c.m26842a(bytes, bytes2, str3, bytes3), 2);
        try {
            C52711k.m112236a((Object) encode, "encryptedBytes");
            return new String(encode, C52808d.f131043a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static final String m103197b(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "target");
        C52711k.m112240b(str2, "key");
        C52711k.m112240b(str3, "transformation");
        C52711k.m112240b(str4, "iv");
        byte[] bytes = str.getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = str2.getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
        byte[] bytes3 = str4.getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes3, "(this as java.lang.String).getBytes(charset)");
        byte[] b = C13328c.m26843b(Base64.decode(bytes, 2), bytes2, str3, bytes3);
        try {
            C52711k.m112236a((Object) b, "decryptedBytes");
            return new String(b, C52808d.f131043a);
        } catch (Exception unused) {
            return "";
        }
    }
}
