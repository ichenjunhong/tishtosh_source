package com.bytedance.sdk.account.p868i.p870b;

import com.bytedance.sdk.account.p868i.p869a.C13177b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.account.i.b.a */
public final class C13179a {

    /* renamed from: a */
    public static Map<Class, C13177b> f34406a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T extends C13177b> T m26562a(Class<T> cls) {
        return (C13177b) f34406a.get(cls);
    }
}
