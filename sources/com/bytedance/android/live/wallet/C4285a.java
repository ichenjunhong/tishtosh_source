package com.bytedance.android.live.wallet;

import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.p262e.C4413f.C4419a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.wallet.a */
public final class C4285a {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, C4286a> f11775a = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.android.live.wallet.a$a */
    public interface C4286a<T> {
        /* renamed from: a */
        T mo10041a();
    }

    static {
        new C4422f();
        f11775a.put(C4303i.class, new C4419a());
    }

    /* renamed from: a */
    public static <T> T m10552a(Class<T> cls) {
        C4286a aVar = (C4286a) f11775a.get(cls);
        if (aVar != null) {
            return aVar.mo10041a();
        }
        return null;
    }
}
